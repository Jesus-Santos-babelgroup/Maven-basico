package org.jesus;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonSyntaxException {
        Persona person = new Persona("Jesús", 23);
        Gson gson = new Gson();
        String personDTO = gson.toJson(person);
        Persona p = jsonToPerson(personDTO);
        System.out.println(p);
    }

    private static Persona jsonToPerson(String receivedJson) throws JsonSyntaxException {
        Gson gson = new Gson();
        return gson.fromJson(receivedJson, Persona.class);
    }
}