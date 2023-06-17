package com.jz.pojo;

public class workers {
    private String workersId;//员工id
    private String workersName;//员工账号
    private String workersSal;//员工工资
    private String workersTelephone;//员工电话
    private String workersN;//员工账号
    private String workersPassword;//员工账号
    private String typ;

    public String getWorkersId() {
        return workersId;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setWorkersId(String workersId) {
        this.workersId = workersId;
    }

    public String getWorkersName() {
        return workersName;
    }

    public void setWorkersName(String workersName) {
        this.workersName = workersName;
    }

    public String getWorkersSal() {
        return workersSal;
    }

    public void setWorkersSal(String workersSal) {
        this.workersSal = workersSal;
    }

    public String getWorkersTelephone() {
        return workersTelephone;
    }

    public void setWorkersTelephone(String workersTelephone) {
        this.workersTelephone = workersTelephone;
    }

    public String getWorkersN() {
        return workersN;
    }

    public void setWorkersN(String workersN) {
        this.workersN = workersN;
    }

    public String getWorkersPassword() {
        return workersPassword;
    }

    public void setWorkersPassword(String workersPassword) {
        this.workersPassword = workersPassword;
    }

    public workers(String workersId, String workersName, String workersSal, String workersTelephone, String workersN, String workersPassword,String typ) {
        this.workersId = workersId;
        this.workersName = workersName;
        this.workersSal = workersSal;
        this.workersTelephone = workersTelephone;
        this.workersN = workersN;
        this.workersPassword = workersPassword;
        this.typ=typ;
    }

    public workers() {
    }
}
