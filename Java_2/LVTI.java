
//class var{}  var cannot be used as class name
class lasya{
}

public class LVTI {
    //var num = 22; var is not alowed here so it shows error
    public static void main(String[] args) {

        //LVTI – Local Variable Type Inference

        var a = 9; //convert data type on the behind the scenes
        int b = 8;

        //var c; variable without initializer shows error
        int d;

        String var = "lasya"; //var can be used as variable name

        int nums[] = new int[10];

        var nums1 = new int[10]; //can be used for arrays and we should not put square brackets left side

        var obj = new lasya();
    }

}
