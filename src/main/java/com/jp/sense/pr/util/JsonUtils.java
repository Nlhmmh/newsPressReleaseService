package com.jp.sense.pr.util;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * JSON ツールクラス
 *	@author Li
　*/
public class JsonUtils {
	
	private static Logger logger = LoggerFactory.getLogger(JsonUtils.class);
	
	private static ObjectMapper mapper = new ObjectMapper();
	private static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
	static {
		mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		mapper.setDateFormat(new SimpleDateFormat(STANDARD_FORMAT));
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }
	
	/**
	 * Object >> JSON
     * @param Object
     * @return Json
     */
    public static <T> String obj2String(T obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
        	logger.warn("Parse Object to String error : {}", e.getCause()+e.getMessage());
            return null;
        }
    }
    /**
	 * JSON >> Object
     * @param JSON
     * @return Object
     */
    @SuppressWarnings("unchecked")
	public static <T> T string2Obj(String str, Class<T> clazz){
        if(StringUtils.isEmpty(str) || clazz == null){
            return null;
        }
        try {
            return clazz.equals(String.class) ? (T) str : mapper.readValue(str, clazz);
        } catch (Exception e) {
        	logger.warn("Parse String to Object error : {}", e.getMessage());
            return null;
        }
    }
    
    /**
	 * JSON >> Object			(json, new TypeReference<List<User>>(){})
     * @param JSON
     * @return Object
     */
    @SuppressWarnings("unchecked")
	public static <T> T string2Obj(String str, TypeReference<T> typeReference) {
        if (StringUtils.isEmpty(str) || typeReference == null) {
            return null;
        }
        try {
            return (T) (typeReference.getType().equals(String.class) ? str : mapper.readValue(str, typeReference));
        } catch (IOException e) {
        	logger.warn("Parse String to Object error", e);
            return null;
        }
    }
    
    /**
	 * JSON >> Object			(json, list.class, user.class)
     * @param JSON
     * @return Object
     */
    public static <T> T string2Obj(String str, Class<?> collectionClazz, Class<?>... elementClazzes) {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClazz, elementClazzes);
        try {
            return mapper.readValue(str, javaType);
        } catch (IOException e) {
        	logger.warn("Parse String to Object error : {}" + e.getMessage());
            return null;
        }
    }
    
}
