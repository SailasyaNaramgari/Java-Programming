public class TypeConversions {
    public static void main(String args[]){
        byte b = 127;
        System.out.println(b);

        // byte by = 257; --> shows error( possible lossy conversion from int to byte)
        //System.out.println(by);

        int a = b; // byte can be assigned t0 int
        System.out.println(a);

        int m = 12;
        // byte k = a; --> show error --> no int to byte possible
        // so we can do casting
        byte k = (byte) m;
        System.out.println(k);

        int w = 257; //out of range
        byte s = (byte) w; //so it performs modulo i.e 257%256
        System.out.println(s);

        float f = 4.2f;
        //int g = f;
        //casting
        int g = (int) f;
        System.out.println(g);

        //Type promotions
        byte t = 10;
        byte p = 30;
        //10*30 = 300; it exceeds ; so it is promoted to int. we store in int
        int result = t*p;
        System.out.println(result);
    }
}
