package org.example;

import org.example.beans.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
@PropertySource("classpath:garage.properties")
public class GarageApp {

    @Autowired
    private Garage garage;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GarageApp.class);
        GarageApp app = context.getBean(GarageApp.class);
        app.printGarage();
        app.printProperties();
        context.close();
    }

    private void printGarage() {
        System.out.println(garage);
    }

    private void printProperties() {
        System.out.println("Mechanic Name: " + env.getProperty("mechanic.name"));
        System.out.println("Tool Name: " + env.getProperty("tool.name"));
    }
}