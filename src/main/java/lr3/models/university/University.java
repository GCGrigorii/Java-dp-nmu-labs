package lr3.models.university;

import lr3.models.common.Organization;
import lr3.models.faculty.Faculty;

public class University extends Organization < Faculty > {

    public University(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "University { " +
            "head = " + head +
            ", university_name = '" + name + '\'' +
            ", structure = " + structure +
            " }";
    }
}