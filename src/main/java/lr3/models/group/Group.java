package lr3.models.group;

import lr3.models.common.Organization;
import lr3.models.human.Student;

public class Group extends Organization<Student> {
    public Group(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Group { " +
                "head = " + head +
                ", group_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
