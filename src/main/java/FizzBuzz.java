import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int mask = 0x000f;
        int value = 0x2222;
        System.out.println(value & mask);
    }


    public static void fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(Integer i = 0; i < n; i++){
            if(n > 0 && n < getPowResult()){
                if(isMultipleOf3(i) && isMultipleOf5(i)){
                    list.add("FizzBuzz");
                }else if(isMultipleOf3(i)){
                    list.add("Fizz");
                }else if(isMultipleOf5(i)){
                    list.add("Buzz");
                }else if(!isMultipleOf5(i) || isMultipleOf3(i));
                list.add(i.toString());
            }
        }
        list.forEach(System.out::println);
    }

    public static int getPowResult(){
        return (int)(2*(Math.pow(10, 5)));
    }

    public static boolean isMultipleOf3(int n){
        return ((n)%3 == 0);
    }

    public static boolean isMultipleOf5(int n){
        return ((n)%5 == 0);
    }
}
