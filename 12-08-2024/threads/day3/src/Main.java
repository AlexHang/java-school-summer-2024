public class Main {

    public static void ex1(){
        Thread[] employees = new Thread[30];
        for (int i = 0; i < 30; i++) {
            Employee employee = new Employee(i);
            employees[i] = new Thread(employee);
            employees[i].start();
            try {
                employees[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        Main.ex1();
    }
}