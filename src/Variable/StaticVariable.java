package Variable;
//class Database {
//    // Static variables
//    static String dbUrl;
//    static String username;
//    static String password;
//    static boolean isConnected;
//
//    // Static block - class load huda automatically run huncha
//    static {
//        System.out.println(" Static Block Running...");
//        dbUrl = "jdbc:mysql://localhost:3306/mydb";
//        username = "admin";
//        password = "admin123";
//        isConnected = false;
//        System.out.println(" Database Configuration Loaded!");

//    }
class Database{
    static String  dburl;
    static  String Username;
    static String  password;
    static boolean isConnected;
    static {
        System.out.println("Static block running now ");
        dburl = "jdbc:mysql://localhost:336/mydb";
        Username ="admin";
        password = "root";
        isConnected = false;
        System.out.println("database configuration Loaded");
    }

    // Static method
    static void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println(" Connected to Database!");
            System.out.println("URL: " + dburl);
            System.out.println("Username: " + Username);
        } else {
            System.out.println(" Already Connected!");
        }
    }

    static void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println(" Disconnected from Database!");
        } else {
            System.out.println("Already Disconnected!");
        }
    }

    static void showStatus() {
        System.out.println(" Connection Status: " + (isConnected ? "Connected" : "Disconnected"));
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        // Static block automatically run bhayo

        Database.showStatus();
        Database.connect();
        Database.showStatus();
        Database.disconnect();
        Database.showStatus();
    }
}