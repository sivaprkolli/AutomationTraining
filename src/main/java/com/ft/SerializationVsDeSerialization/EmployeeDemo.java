package com.ft.SerializationVsDeSerialization;

import java.io.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeDemo employeeDemo = new EmployeeDemo();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setUserName("siva9kolli");
        employeeDetails.setEmpId(100);
        employeeDetails.setEmail("siva@yopmail.com");

        File file = new File("empDemo.ser");

        serializable(employeeDetails, file); // Serialization
        EmployeeDetails employeeDetails1 = deSerialization(file); //DeSerialization

        System.out.println(employeeDetails1.getUserName());
        System.out.println(employeeDetails1.getEmpId());
        System.out.println(employeeDetails1.getEmail());
    }

    public static void serializable(EmployeeDetails employeeDetails, File filePath) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeDetails);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EmployeeDetails deSerialization(File filePath) {
        EmployeeDetails employeeDetails = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employeeDetails = (EmployeeDetails) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
        return employeeDetails;
    }
}
