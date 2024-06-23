import java.util.*;

public class SetInJav {
    public static void main(String[] args){

        Set<Integer> nums = new HashSet<Integer>();//instead of set , we can use collection too
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        // nums.add(8); //not prints duplicates
        //set will not give sorted values
        //sset doesnot support index value

        for (int n:nums){
            System.out.println(n);
        }

        System.out.println("----------------------------");

        Set<Integer> nums1 = new TreeSet<Integer>();//gives sorted values
        nums1.add(62);
        nums1.add(54);
        nums1.add(82);
        nums1.add(21);

        for (int n:nums1){
            System.out.println(n);
        }

        System.out.println("----------------------------");


        Iterator<Integer> values = nums1.iterator();

        while(values.hasNext())
            System.out.println(values.next());

    }
}
