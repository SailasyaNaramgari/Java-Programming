class As{
    public int add(int n1,int n2){
        return n1+n2;
    }

}

class Bs extends As{
    public int add(int n1, int n2){
        return n1+n2+1; // it overrides above add method
    }

}

public class MethodOverriding {
    public static void main(String a[]) {
        Bs obj = new Bs();
        int r1 = obj.add(2,2);
        System.out.println(r1);

        //Bs obj1 = new Bs();
        //obj1.add(); same as above due to inheritance
    }
}

//method overriding - one method overrides otherr