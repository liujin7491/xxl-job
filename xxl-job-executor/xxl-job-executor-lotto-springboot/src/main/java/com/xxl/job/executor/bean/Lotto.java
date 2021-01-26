package com.xxl.job.executor.bean;

import java.io.Serializable;

public class Lotto implements Serializable {
    private long id;
    private int lottery_id;
    private String issue_code;
    private String win_code;
    private String win_code_2;
    private int status;
    private String official_open_time;
    private String belong_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLottery_id() {
        return lottery_id;
    }

    public void setLottery_id(int lottery_id) {
        this.lottery_id = lottery_id;
    }

    public String getIssue_code() {
        return issue_code;
    }

    public void setIssue_code(String issue_code) {
        this.issue_code = issue_code;
    }

    public String getWin_code() {
        return win_code;
    }

    public void setWin_code(String win_code) {
        this.win_code = win_code;
    }

    public String getWin_code_2() {
        return win_code_2;
    }

    public void setWin_code_2(String win_code_2) {
        this.win_code_2 = win_code_2;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOfficial_open_time() {
        return official_open_time;
    }

    public void setOfficial_open_time(String official_open_time) {
        this.official_open_time = official_open_time;
    }

    public String getBelong_date() {
        return belong_date;
    }

    public void setBelong_date(String belong_date) {
        this.belong_date = belong_date;
    }
}