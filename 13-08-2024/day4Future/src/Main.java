import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Start");
//        CompletableFuture<String> myCOmpletableFuture = CompletableFuture.supplyAsync( () -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//                return "DB";
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        String result = myCOmpletableFuture.get(); // 30 s
//        result = result + " 2024"; // 15 s
//        String result3 = result.toLowerCase(Locale.ROOT); // 10 s
//
//        String finalResult = myCOmpletableFuture
//                .thenApply(str -> { return str + "2024";})
//                .thenApply(s -> { return s.toLowerCase()}).get();
//
//
//        System.out.println(result3);
//        System.out.println("Finish");
//
//
//        String[] myArr = new String[10];
        int[] numbers = {2, -1, 5, -4, 3};
        int[] positiveNumbers = Arrays.stream(numbers)
                .filter(n -> n > 0)
                .map(n -> n*2)
                .distinct()
                .toArray();

        CompletableFuture<String> x;


        MyGenericClass<String, Arrays>
    }
}

