public class Employee {
    private String name;
    private String email = "не задан";
    private int number;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public Employee(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }
    public void printinfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + ((number > 0) ? number : "Не задан"));
    }
}

