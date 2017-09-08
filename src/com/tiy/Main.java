package com.tiy;
import com.github.javafaker.Faker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;




public class Main {

    public static void main(String[] args) {
        // write your code here
        Faker faker = new Faker();
        HashMap<Teacher, HashSet<Student>> teacherClass = new HashMap<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();


        for (int i = 0; i < 15; i++) {

            String firstFake = faker.name().firstName();
            String lastFake = faker.name().lastName();

            Student student = new Student();

            student.setFirstName(firstFake);
            student.setLastName(lastFake);

            student.setId(i);
            student.setGrade(1);
            studentList.add(student);

        }

        for (int i = 0; i < 3; i++) {

            String firstFake = faker.name().firstName();
            String lastFake = faker.name().lastName();

            Teacher teacher = new Teacher();
            teacherList.add(teacher);

            teacher.setFirstName(firstFake);
            teacher.setLastName(lastFake);

            teacher.setId(i);
            teacher.setGrade(1);
            teacherList.add(teacher);

        }
        HashMap<Teacher, HashSet<Student>> teacherClasses = new HashMap<>();

        for (int teacherIndex = 0; teacherIndex < teacherList.size(); teacherIndex++) {
            Teacher teacher = teacherList.get(teacherIndex);
            Integer studentMultiplyer = teacherIndex + 1;
            HashSet<Student> classes = new HashSet<>();

            for (int studentIndex = (studentList.size()/teacherList.size()) * teacherIndex; studentIndex < 5 * studentMultiplyer; studentIndex++) {
                classes.add(studentList.get(studentIndex));
            }
            teacherClasses.put(teacher, classes);
        }

    }
}