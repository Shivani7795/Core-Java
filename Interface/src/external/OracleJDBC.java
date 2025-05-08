package external;

import internal.JDBC;

public class OracleJDBC implements JDBC {
    public void save() {
        System.out.println("Oracle JDBC Connection");
    }
}
