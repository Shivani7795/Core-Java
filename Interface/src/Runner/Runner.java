package Runner;

import external.IplApp;
import external.MysqlJDBC;
import internal.JDBC;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new MysqlJDBC();

        IplApp iplApp = new IplApp(jdbc);
        iplApp.saveTeamInfo();
    }
}
