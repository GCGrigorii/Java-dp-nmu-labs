package lr6;

import java.sql.Connection;

public interface ResourceManagement {
    void insert(String name, String surname, String patronymic, String birthday);
    void searchByBirthday(String birthday);
    Connection getConn();
}
