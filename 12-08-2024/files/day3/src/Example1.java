import java.io.*;
import java.util.Scanner;

public class Example1 {

    static void example1(){
//        File f = new File("abc.txt");
//        try{
//            PrintWriter pw = new PrintWriter(f);
//            pw.write("Hello DB, today is 12-08");
//            pw.close();
//        }catch (IOException e){
//            System.err.println(e);
//        }
//
//        try{
//            Scanner s = new Scanner(f);
//            s.
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("abc.txt");

            for (int i = 1; i <= 50; i++) {
                out.write(i);
            }
            out.close();
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileInputStream in = null;
        try {
            in = new FileInputStream("abc.txt");
            int x;
            while ((x = in.read()) != -1) {
                System.out.print(x + " ");
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void example2(){
        MySerializableObject m = new MySerializableObject();
        m.setEmail("test@test.com");
        m.setPassword("test1234");
        ObjectOutputStream os = null;
        try{
            os = new ObjectOutputStream(new FileOutputStream("myObj.bin"));
            os.writeObject(m);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("myObj.bin"));
            m = (MySerializableObject) is.readObject();
            System.out.println(m.getEmail() + " " + m.getPassword());
        }catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
