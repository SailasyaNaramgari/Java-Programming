
public class String_Buffer {
    public static void main(String a[] ){
        StringBuffer sb = new StringBuffer("lasya");
        System.out.println(sb.capacity()); //initially 16
        //21 - store name and 16 spaces extra to reduce relocation
        System.out.println(sb.length());

        sb.append(" Naramgari");
        System.out.println(sb);

        sb.insert(5,"sai ");
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        // add extra spaces
        sb.setLength(30);
        System.out.println(sb);

        String str = sb.toString(); //converts to string
        System.out.println(sb);

        //String buffer is thread safe and string builder is not, remaining are same
    }
}
