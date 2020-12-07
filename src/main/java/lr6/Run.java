package lr6;

import java.sql.SQLException;

public class Run {
    public static void main(String[] args) throws SQLException {
        ResourceManagement resourceManagement = new StudentManagement();
        try {
            resourceManagement.insert("Linus", "Benedict", "Torvalds", "1969-12-28");
            resourceManagement.insert("Dennis", "MacAlistair", "Ritchie", "1941-09-09");
            resourceManagement.insert("Kenneth", "Lane", "Thompson", "1943-02-04");
            resourceManagement.searchByBirthday("1941-09-09");
        } finally {
            resourceManagement.getConn().close();
        }
    }
}
