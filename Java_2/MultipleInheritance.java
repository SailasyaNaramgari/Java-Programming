class A{

}

class B extends A{

}

class C extends B{

}

public class MultipleInheritance {
    public static void main(String a[]) {

        //multilevel inheritance
        CalcSci obj = new CalcSci();
        int r1 = obj.add(3, 4);
        int r2 = obj.sub(5, 4);
        int r3 = obj.mul(12, 4);
        int r4 = obj.div(55, 5);
        double r5 = obj.power(4,2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
