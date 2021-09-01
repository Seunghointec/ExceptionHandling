package be.intecbrussel.ExceptionDemo;

public class CursistApp {

    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        try {
            ed.luc();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
