package org.example.bean;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


/*
Annotation Config DI
1.Field injection
2.Constructor injection
3.setter injection
 */
@Component
@RequiredArgsConstructor
public class Student {
    private final Address address;

    private String name = "Mg Mg";


    public void printInfo() {
        System.out.println(
                String.format("%s lives in %s.",
                        name,address.getCity())
        );
    }
}
