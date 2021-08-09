package com.Engineer;

public class GradStudent extends Student{
   private String supName, regNo;

    public GradStudent(String name, String gender, int age, String supName) {
        super(name, gender, age);
        this.supName = supName;
    }// we are not supposed to pass regNo to the constructor. Thus we pass through the setter

    public String getRegNo() {
        return regNo;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}

