package lr4.controllers;

import lr4.models.human.Sex;
import lr4.models.human.Student;

public class StudentCreator {
    public Student student;

    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        this.student = new Student(firstName, lastName, patronymic, sex);
    }
}
