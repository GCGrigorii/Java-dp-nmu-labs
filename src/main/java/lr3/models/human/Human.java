package lr3.models.human;

public class Human {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human { " +
            "first_name = '" + firstName + '\'' +
            ", last_name = '" + lastName + '\'' +
            ", patronymic = '" + patronymic + '\'' +
            ", sex = " + sex +
            " }";
    }
}