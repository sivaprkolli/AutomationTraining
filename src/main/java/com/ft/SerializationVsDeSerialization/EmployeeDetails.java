package com.ft.SerializationVsDeSerialization;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {

    private String userName;
    private int empId;
    private String email;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
