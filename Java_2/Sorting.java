import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(9);
        nums.add(7);
        System.out.println(nums);

        //we can use Collections class
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("-------------------");


        //sorting according to the last digit
        //comparator - interface where we can specify our own logic for sorting
        Comparator<Integer> com = new Comparator<>(){
            public int compare(Integer i , Integer j){
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };


        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(22);
        nums1.add(31);
        nums1.add(94);
        nums1.add(75);

        Collections.sort(nums1,com);

        System.out.println(nums1);


        System.out.println("---------------");


        Comparator<String> c = new Comparator<>(){
            public int compare(String i , String j){
                if (i.length() > j.length())
                    return 1;
                else
                    return -1;
            }
        };


        List<String> s = new ArrayList<>();
        s.add("lasya");
        s.add("sai");
        s.add("Naramgari");

        Collections.sort(s,c);

        System.out.println(s);

    }
}
