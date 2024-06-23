import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);


        for(int i =0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        System.out.println("-----------------");

        //enhanced for loop
        for(int n:nums){
            System.out.println(n);
        }

        System.out.println("-----------------");


//        Consumer<Integer> con = new Consumer<Integer>() {
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };

        //Consumer<Integer> con = n -> System.out.println(n);


        nums.forEach(n -> System.out.println(n));

        //nums.forEach(n -> System.out.println(n))

    }
}