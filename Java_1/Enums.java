//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable
// must be equal to one of the values that have been predefined for it.
enum Status{
    Running, Failed, Pending, Success;  //prebuilt

}

public class Enums {
    public static void main(String a[]){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); // here for running ..ordinal is 0
        //it starts with 0 like indexes

        Status[] ss = Status.values(); //values contain all status which are in an array
        System.out.println(ss[2]);

        System.out.println("----");

        for(Status s1 : ss){
            System.out.println(s1 +" : "+s1.ordinal());
        }
    }
}
