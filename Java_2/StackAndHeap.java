class Calci{
    int num = 22; //instance variable - part of heap

    public int add(int n1, int n2){
        System.out.println(num);

        System.out.println("------------");
        int r = n1+n2; //n1,n2 are local variable - stack
        return r;
    }
}

public class StackAndHeap {

    public static void main(String args[]){
        int data = 10;
        Calci obj = new Calci();
        Calci obj1 = new Calci();
        int res = obj.add(14,15);
        System.out.println(res);

        System.out.println("------------");

        obj.num = 8;//impact only one object - obj

        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}

//check word doc