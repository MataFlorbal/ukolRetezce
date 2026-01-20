package cviceni;

public class cviceni2 {
    public static void main(String[] args) {
        String text = "kaktus";
        String vysledek = "";

        if (text.equals(text.toLowerCase())){
            vysledek = text.toUpperCase();
            System.out.println(vysledek);
        }
        else {
            System.out.println(text);
        }
    }
}