package repository;

public class DatabaseConnectionManager {
    private String managerName;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();


    private static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public String getConnectionObject(){
        return "";
    }

    private void connectToDatabase(){
        System.out.println("Connecting to database employee");
    }
}
