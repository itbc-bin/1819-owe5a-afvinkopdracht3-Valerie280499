package com.company;

public class Student {
    public static void main(String[] args) {
        ObjectenStudent stud1 = new ObjectenStudent("Janne", 20, 7468282);
        ObjectenStudent stud2 = new ObjectenStudent("Bram", 23, 2928347);
        ObjectenStudent stud3 = new ObjectenStudent("Rick", 18, 2938473);
        ObjectenStudent stud4 = new ObjectenStudent("Valerie", 19, 2837482);
        ObjectenStudent stud5 = new ObjectenStudent(293874832);

        stud1.info();
        stud2.info();
        stud3.info();
        stud4.info();
        stud5.info();

    }


}
