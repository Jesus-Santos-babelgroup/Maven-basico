package org.jesus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Persona person = new Persona("Jesús", 23);
        String personDTO = "persona: {name: Jesús, age: 23}";
        Persona p = jsonToPerson(personDTO);
        System.out.println(p);
    }

    private static Persona jsonToPerson(String receivedJson) {
        return receivedJson.fromJson();
    }
}