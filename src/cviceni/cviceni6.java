package cviceni;

public class cviceni6 {
    public static void main(String[] args) {
        String cislo = "952";
        for (int i = cislo.length() - 1; i >= 0; i--){
            System.out.print(cislo.charAt(i));
        }
        System.out.println();
    }
}