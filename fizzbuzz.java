import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        
        IntStream.range(1, 101)
                .mapToObj(x -> { 
                    boolean divBy3 = x % 3 == 0;
                    boolean divBy5 = x % 5 == 0;
                    
                    if (divBy3 && divBy5) 
                        return "FizzBuzz"; 
                    else if (divBy3) 
                        return "Fizz"; 
                    else if (divBy5) 
                        return "Buzz"; 
                    return x;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);;
    }
}