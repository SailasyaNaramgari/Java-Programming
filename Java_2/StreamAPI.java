import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        Stream<Integer> s = nums.stream();

        //...once we use the stream we cannot reuse it
//        s.forEach(n-> System.out.println(n));
        //s.forEach(n-> System.out.println(n));  //..it will give runtime error as we already used once above

        //.. filter
        Stream<Integer> s1 =s.filter(n->n%2==0); //.. we create new stream as we already used one
//        s1.forEach(n-> System.out.println(n));

        Stream<Integer> s2 =s1.map(n->n*2);
        //s2.forEach(n-> System.out.println(n));

        int res = s2.reduce(0,(c,e)->c+e);
        System.out.println(res);

        System.out.println("-----------");

        int res1 = nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(res1);




//        nums.forEach(n-> System.out.println(n));

        System.out.println("-----------");

        int sum =0;
        for(int n:nums){
            if(n%2==0){
                n = n*2;
                sum = sum+n;
            }
        }
        System.out.println(sum);

    }
}

// uncomment lines without .. to check output