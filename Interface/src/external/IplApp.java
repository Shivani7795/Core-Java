package external;

import internal.JDBC;

public class IplApp {
    private JDBC jdbc;
    public IplApp(JDBC jdbc) {
        this.jdbc = jdbc;
    }

        public void saveTeamInfo () {
                if(jdbc != null){
                    this.jdbc.save();
                }
                else{
                    System.out.println("null");
        }
    }
}


