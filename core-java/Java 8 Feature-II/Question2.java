/*
    Create and access default and static method of an interface.
 */

interface ConnectionToDB {
    default boolean connectToDB(Integer statusCode) {
        return statusCode==200;
    }

    static int addUtility(Integer a, Integer b) {
        return a + b;
    }
}
class ConnectionToMySQL implements ConnectionToDB {
    @Override
    public boolean connectToDB(Integer statusCode) {
        if(statusCode==200) {
            System.out.println("Connected to MySQL db");
            return true;
        } else {
            System.out.println("Unexpected error");
            return false;
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        // We have two approach to access default methods - creating class and implementing the class, using anonymous classes
        ConnectionToDB obj = new ConnectionToMySQL();
        System.out.println(obj.connectToDB(400));

        ConnectionToDB obj1 = new ConnectionToDB() {
            @Override
            public boolean connectToDB(Integer statusCode) {
                boolean currStatusCode = ConnectionToDB.super.connectToDB(statusCode);
                if(currStatusCode) {
                    System.out.println("Connected to MySQL db");
                    return true;
                } else {
                    System.out.println("Unexpected error");
                    return false;
                }
            }
        };
        obj1.connectToDB(201);

        // Part - 2 static methods
        System.out.println(ConnectionToDB.addUtility(3, 7));
    }
}
