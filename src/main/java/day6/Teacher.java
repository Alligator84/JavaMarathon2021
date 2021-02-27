package day6;

import java.util.Random;

public class Teacher {
    public String name;
    public  String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rnd = new Random();
        int grade = rnd.nextInt(3) + 2;
        String strGrade = "";

        switch (grade) {
            case 2:
                strGrade = "неудовлетворительно";
                break;
            case 3:
                strGrade = "удовлетворительно";
                break;
            case 4:
                strGrade = "хорошо";
                break;
            case 5:
                strGrade = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.name + " по предмету " + this.subject + " на оценку " + strGrade + ".");
    }
}
