class Computer{
    public void playMusic(){ //nothing in return.use void
        System.out.println("music is playing");
    }

    public String getMePen(int cost){
        if(cost>=10) {
            return "pen";
        }
        else{
            return "nothing";
        }
    }
}

public class Method {
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
    }
}
