//class K{
//    public void show(){
//        try {
//            Class.forName("Calcic");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Not able to finnd class "+e);
//        }
//    }
//
//}


class K{
    public void show() throws ClassNotFoundException{

            Class.forName("Calcic");
    }

}


public class DuckingException_throws {

    static{
        System.out.println("Class loaded");
    }

//    public static void main(String a[]) throws ClassNotFoundException{ - better not to do this , as we can't ask
//    main(jvm) to habdle this

        public static void main(String a[]) {


//        try {
//            Class.forName("Calcic");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Not able to finnd class "+e);
//        }
//
//        K obj = new K();
//        obj.show();

            K obj = new K();
            try {
                obj.show();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
}
