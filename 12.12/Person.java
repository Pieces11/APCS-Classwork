/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SusieHello;

/**
 *
 * @author Susie this is the person class for my Hello World program
 */
public class Person {

    private String language;
    private double GPA;
    private int age;

    public Person(String language) {
        this.language = language;
        this.age = 0;
    }

    public void grade(double much) {
        this.GPA += much;
    }

    public void grow(int howmuch) {
        this.age += howmuch;
    }

    /*
    public void setlanguage(String x){
        this.language=x;
    }
    public String getLanguage(){
        return this.language;
    }*/
    public String sayHello() {
        if (this.age < 3) {
            return "bababa";
        }
        if (this.age > 80) {
            return "mmm...";
        } else if (this.language.equals("English")) {
            return "Hello,I am " + age + " years old";
        } else if (this.language.equals("French")) {
            return "Bonjour,I am " + age + " years old";
        } else if (this.language.equals("German")) {
            return "Hallo";
        } else if (this.language.equals("Spanish")) {
            return "Hola";
        } else {
            return "Ni Hao";
        }

    }

    public String evaluate() {
        if (this.GPA > 3) {
            return "You have passed.";
        } else {
            return "You have failed.";
        }
    }

}
