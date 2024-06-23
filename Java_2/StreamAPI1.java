import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //..BTS of map reduce filter

        //..filter
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==0;
//            }
//        };

        Predicate<Integer> p = n -> n%2==0;


        //..map

//        Function<Integer,Integer> f = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };

        Function<Integer,Integer> f = n->n*2;

        int res1 = nums.stream().filter(p).map(f).reduce(0,(c,e)->c+e);
        System.out.println(res1);


        System.out.println("----");
        Stream<Integer> sortedValues = nums.stream().filter(p).sorted();
        sortedValues.forEach(n-> System.out.println(n));




    }
}
