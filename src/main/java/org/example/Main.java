package org.example;

import org.example.bean.Address;
import org.example.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("MG MG");
//        Address address = new Address();
//        address.setCity("Dream Land");
//        student.setAddress(address);

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.printInfo();
        ((AnnotationConfigApplicationContext)context).close();
    }
}