package lr3.controllers;

import lr3.models.human.Sex;
import lr3.models.human.Student;

public class StudentCreator {
    public Student student;

    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        this.student = new Student(firstName, lastName, patronymic, sex);
    }
}
