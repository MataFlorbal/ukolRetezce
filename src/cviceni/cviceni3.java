package cviceni;

public class cviceni3 {
    public static void main(String[] args) {
        String [] ovoce = {"marakuja","banan","jablko","pomeranc","kiwi"};
        for (int i = 0; i < ovoce.length; i++){
            if (i == 0 || i == ovoce.length - 1){
                System.out.println(ovoce[i].toUpperCase());
            }
            else {
                System.out.println(ovoce[i]);
            }
        }
    }
}
