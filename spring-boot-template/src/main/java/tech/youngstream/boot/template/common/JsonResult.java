package tech.youngstream.boot.template.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Json请求结果
 * @param <T>
 */
@Data
@AllArgsConstructor
public class JsonResult<T> {

    private long code;

    private String msg;

    private T data;

    public JsonResult() {
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<T>(0,"success", data);
    }

    public static <T> JsonResult<T> fail(long code, String msg) {
        return new JsonResult<T>(code, msg, null);
    }

    public static <T> JsonResult<T> fail(long code, String msg, T data) {
        return new JsonResult<T>(code, msg, data);
    }

}
