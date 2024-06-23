class Calc{
    public int add(int n1, int n2, int n3){ // method add
        return n1+n2+n3;
    }

    public int add(int n1, int n2){ // method add
        return n1+n2;
    }

    public double add(double n1, int n2){ // method add
        return n1+n2;
    }

    //same number of parameters with diff types..or diff number of parameters with same method name- method overloading

}

public class MethodOverloading {
    public static void main(String args[]){

        Calc obj = new Calc(); // create the obj
        int r = obj.add(1,2,3);
        System.out.println(r);

    }
}
