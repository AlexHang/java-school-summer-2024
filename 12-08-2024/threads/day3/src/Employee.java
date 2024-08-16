public class Employee implements Runnable{
    private int no;

    public Employee(int no){
        this.no = no;
    }
    @Override
    public void run() {
        System.out.println("Employee " + this.no + " arrived at work!");
    }
}
