package com.company;

public class ObjectenStudent {
    private String name;
    private int StudNummer;
    private int age;


    public ObjectenStudent(String name, int age, int StudNummer){
        this.name = name;
        this.age = age;
        this.StudNummer = StudNummer;
    }

    public ObjectenStudent(int StudNummer){
        this.StudNummer = StudNummer;
    }

    public void info (){
        if (name == null){
            System.out.println("Student heeft geen naam of leeftijd");
            System.out.println("Studentnummer:" +getstud());
        }
        else{
            System.out.println("Name: " +getname());
            System.out.println("Studentnumber:" + getstud());
            System.out.println("Age " +getage());
            System.out.println("\n");
        }

    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

    public int getstud(){
        return StudNummer;
    }

    public void setstud(int StudNummer){
        this.StudNummer = StudNummer;
    }
}
