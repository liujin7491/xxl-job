package com.xxl.job.executor.bean;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
    private String code;
    private String msg;
    private int total;
    private List<Lotto> rows;
    private long timestamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Lotto> getRows() {
        return rows;
    }

    public void setRows(List<Lotto> rows) {
        this.rows = rows;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
