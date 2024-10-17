package com.ft.SerializationVsDeSerialization;

import java.io.*;

public class StudentDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Serialization - Converting Object to bytes -> Writing Object to file
        StudentDetails studentDetails = new StudentDetails(46, "Siva");
        FileOutputStream fileOutputStream = new FileOutputStream("simpleDemo.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentDetails);
        objectOutputStream.flush();
        objectOutputStream.close();

        // DeSerialization - Converting Bytes to Object -> Writing File to Object
        FileInputStream fileInputStream = new FileInputStream("simpleDemo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        StudentDetails studentData = (StudentDetails) objectInputStream.readObject();
        System.out.println(studentData.id);
        System.out.println(studentData.name);
    }
}
