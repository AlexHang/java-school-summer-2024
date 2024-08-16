public class GenericsDemo {
    public static void main(String[] args) {
        Integer[] myIntegerList = { 1, 2, 3, 4, 5 };
        String[] myStringList = { "Hello", "World" };
        GenericsDemo.<Integer>print(myIntegerList);
        GenericsDemo.<String>print(myStringList);
    }
    public static<T> void print(T[] myList) {
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }
}