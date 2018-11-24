package bean;

import java.io.Serializable;

public class NFResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;
    private String message;
    private String code;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
