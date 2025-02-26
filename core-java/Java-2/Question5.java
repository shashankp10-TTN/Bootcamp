
class Singleton {
    private static Singleton sqlInstance;
    private Singleton(){
        System.out.println("SQL is connected!!");
    }

    public static Singleton getInstance() {
        if(sqlInstance==null) {
            sqlInstance = new Singleton();
        }
        return sqlInstance;
    }
    public void dummyMethod(){
        System.out.println("Dummy method called using singleton instance!!");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.dummyMethod();

    }
}
