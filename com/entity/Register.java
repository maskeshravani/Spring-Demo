package com.entity;

public class Register {

    private int id;
    private String name;
    private String add;
    private String email;
    private String pass;
    private long mobNo;
    private long adharNo; 

    private Login log;

    public Register() {
    	
    }

    public Register(int id, String name, String add, String email, String pass, long mobNo, long adharNo, Login log) {
        super();
        this.id = id;
        this.name = name;
        this.add = add;
        this.email = email;
        this.pass = pass;
        this.mobNo = mobNo;
        this.adharNo = adharNo;
        this.log = log;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo =adharNo;
    }

    public Login getLog() {
        return log;
    }

    public void setLog(Login log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Register [id=" + id + ", name=" + name + ", add=" + add + ", email=" + email + ", pass=" + pass
                + ", mobNo=" + mobNo + ", adharNo=" + adharNo + ", log=" + log + "]";
    }
}
