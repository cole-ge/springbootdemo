package com.gzw.demo.commonUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * 统一返回对象，自定义响应数据结构
 *  200：表示成功
 *  500：表示错误
 *  501：bean验证错误,不管有多少个错误都以map的形式返回
 *  502：拦截器拦截到用户token错误
 *  555：抛出异常信息
 * 时间：2020-05-13
 */
public class GzwJsonResult {
    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    //响应业务状态
    private Integer status;

    //响应消息
    private String msg;

    //响应中的数据
    private Object data;

    public GzwJsonResult(){

    }

    public GzwJsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public GzwJsonResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }


    public Boolean isOK() {
        return this.status == 200;
    }

    public static GzwJsonResult build(Integer status, String msg, Object data) {
        return new GzwJsonResult(status, msg, data);
    }

    public static GzwJsonResult ok(Object data) {
        return new GzwJsonResult(data);
    }

    public static GzwJsonResult ok() {
        return new GzwJsonResult(null);
    }

    public static GzwJsonResult errorMsg(String msg) {
        return new GzwJsonResult(500, msg, null);
    }

    public static GzwJsonResult errorMap(Object data) {
        return new GzwJsonResult(501, "error", data);
    }

    public static GzwJsonResult errorTokenMsg(String msg) {
        return new GzwJsonResult(502, msg, null);
    }

    public static GzwJsonResult errorException(String msg) {
        return new GzwJsonResult(555, msg, null);
    }

    /**
     *
     * @Description: 将json结果集转化为LeeJSONResult对象
     * 				需要转换的对象是一个类
     * @param jsonData
     * @param clazz
     * @return
     *
     * @author leechenxiang
     * @date 2016年4月22日 下午8:34:58
     */
    public static GzwJsonResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, GzwJsonResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @Description: 没有object对象的转化
     * @param json
     * @return
     *
     * @author leechenxiang
     * @date 2016年4月22日 下午8:35:21
     */
    public static GzwJsonResult format(String json) {
        try {
            return MAPPER.readValue(json, GzwJsonResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @Description: Object是集合转化
     * 				需要转换的对象是一个list
     * @param jsonData
     * @param clazz
     * @return
     *
     * @author leechenxiang
     * @date 2016年4月22日 下午8:35:31
     */
    public static GzwJsonResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GzwJsonResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
