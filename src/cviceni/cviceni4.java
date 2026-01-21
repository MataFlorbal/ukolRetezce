package cviceni;

public class cviceni4 {
    public static void main(String[] args) {
        String text = "pizza";
        boolean zdvojenaPismena = false;
        for (int i = 0; i < text.length() - 1; i++){
            if (text.charAt(i) == text.charAt(i + 1)){
                zdvojenaPismena = true;
            }
        }
        if (zdvojenaPismena){
            System.out.println("jsou zdvojena");
        }
        else {
            System.out.println("nejsou zdvojena");
        }
    }
}
