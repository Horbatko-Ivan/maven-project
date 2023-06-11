package org.goit;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        String name = "Ivan";
        String lastName = "Horbatko";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
