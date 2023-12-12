
public class Main {
    public static void main(String[] args) {
        var president = President.getThePresident();
        System.out.println(president.hashCode());
        var anotherPresident = President.getThePresident();
        System.out.println(anotherPresident.hashCode());
    }
}