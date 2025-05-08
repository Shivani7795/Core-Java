package external;

import internal.JDBC;

public class MysqlJDBC implements JDBC {
    public void save() {
        System.out.println("Mysql JDBC Connection");
    }
}
