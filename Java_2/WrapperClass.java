//wrapper class - every primitive type , we have a class which extends object class

public class WrapperClass {
    public static void main(String a[]) {
        int num = 2; //primitive var
        //Integer num1 = new Integer(22);//depricated //reference var
        //autoboxing - taking a primitive value and storing it in wrapper object
        Integer num1 = num;
        System.out.println(num1);

        System.out.println("---------------");

        //autounboxing - object type to primitive type
        int num2 = num1.intValue();
        System.out.println(num2);

        //can use char, double etc also
        System.out.println("---------------");

        String str = "2";
        int num3 = Integer.parseInt(str); //converts string to int
        System.out.println(str);
    }
}
