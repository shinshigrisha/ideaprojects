
public class Main {
    public static void main(String[] args) {
            Employee dmitriy = new Employee("Дмитрий Алексеев",6567);
            dmitriy.printinfo();

            Employee dasha = new Employee("Даша Иванова", "dasha@mail.ru");
            dasha.printinfo();

            Employee grisha = new Employee("Григорий Сенин", "gri@gmail.com", 4775);
            grisha.printinfo();
        }
}