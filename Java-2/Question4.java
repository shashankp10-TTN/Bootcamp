/*
    Write a program to show application of Factory Design Pattern.
 */
interface ToTheNew {
    void employee();
}
class JavaDeveloper implements ToTheNew {
    @Override
    public void employee() {
        System.out.println("I work as Java developer in TTN");
    }
}

class JavascriptDeveloper implements ToTheNew {
    @Override
    public void employee() {
        System.out.println("I work as Javascript developer in TTN");
    }
}
class PythonDeveloper implements ToTheNew {
    @Override
    public void employee() {
        System.out.println("I work as Python developer in TTN");
    }
}
public class Question4 {
    public static void main(String[] args) {
        ToTheNew javaDeveloper = new JavaDeveloper();
        javaDeveloper.employee();

        ToTheNew javascriptDeveloper = new JavascriptDeveloper();
        javascriptDeveloper.employee();
    }

}
