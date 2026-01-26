package cviceni;

public class cviceni7 {
    public static void main(String[] args) {
        String retezec = "western";
        String vysledek = "";
        for (int i = 0; i < retezec.length(); i++){
            char znak = retezec.charAt(i);
            if (i % 2 == 0){
                vysledek += Character.toUpperCase(znak);
            }
            else {
                vysledek += Character.toLowerCase(znak);
            }
        }
        System.out.println(vysledek);
    }
}
