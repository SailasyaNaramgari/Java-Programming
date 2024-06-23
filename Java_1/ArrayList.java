import java.util.Collection;
import java.util.List;

public class ArrayList {
    public static void main(String[] args){

        //As we are using integer ,we mention it in the angular brackets
        //Collection<Integer> nums = new java.util.ArrayList<Integer>(); //as collection is an interface, we use few inbuilt classes in it
        //mentioning the data type also helps you in removing bugs
        // if we mention integer , we get compile time error , not runtime error

        //if we want to do more like indexing we use list instead of collection
        List<Integer> nums = new java.util.ArrayList<Integer>();
        nums.add(6); //6 is an object..by deault
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(8); //list supports duplicates

        System.out.println(nums); // prints in an array
        System.out.println(nums.get(2));//indexing
        System.out.println(nums.indexOf(5));// get index value

        System.out.println("-------------");

        //no indexing for collection api
        for (int n:nums){
            System.out.println(n);
        }
    }
}
