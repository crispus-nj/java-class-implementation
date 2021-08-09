package com.Engineer;

public class Main {

    public static void main(String[] args) {
	GradStudent gradStudent = new GradStudent("Finidi george ", "Male ", 26, "Dr mwabu");
        gradStudent.setRegNo("Sct121-0709/2020");
        gradStudent.setSupName("Dr mwabu");
        System.out.println("Name : " +gradStudent.getName()+ "\n"+
                "Gender: " + gradStudent.getGender() + "\n" +
                "AGe: " + gradStudent.getAge() + "\n" +
                "Registration No: " + gradStudent.getRegNo() + "\n"+
                "Supervisor: " + gradStudent.getSupName()
        );
    }
}
