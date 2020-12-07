package lr3.view;

import lr3.models.human.Sex;
import lr3.models.university.University;

class ConsoleView implements Console {

    @Override
    public void createTypicalUniversity() {
        UniversityBuilder universityBuilder = new UniversityBuilder();

        universityBuilder
            .createUniversity("NTU")
            .setUniversityHead("Linus", "Benedict", "Torvalds", Sex.MALE)
            .createFaculty("System analysis and management")
            .setFacultyHead("Dennis", "MacAlistair", "Ritchie", Sex.MALE)
            .createDepartment("System analysis and management")
            .setDepartmentHead("Kenneth", "Lane", "Thompson", Sex.MALE)
            .createGroup("124-18sk-1")
            .setGroupHead("Bjarne", "Stroustrup", "Stroustrupovich", Sex.MALE)
            .createStudent("Auff", "Auffovich", "Auffov", Sex.MALE)
            .createStudent("Jekos", "Jekosovich", "Jekson", Sex.MALE)
            .createStudent("Nastyxa", "Naste4ka", "Anastasia", Sex.FEMALE);

        showUniversity(universityBuilder.compose());
    }

    @Override
    public void showUniversity(University university) {
        System.out.println(university);
    }
}