package cviceni;

public class cviceni1 {
    public static void main(String[] args) {
        String [] jmena = {"Matěj","Tomáš","Pavel","Honza","Zdeněk"};
        String uzivJmeno = "Honza";
        boolean nalezeno = false;

        for (String pole : jmena){
            if (pole.equals(uzivJmeno)){
                nalezeno = true;
            }
        }
        if (nalezeno){
            System.out.println("nachazi se");
        }
        else {
            System.out.println("nenachazi se");
        }
    }
}