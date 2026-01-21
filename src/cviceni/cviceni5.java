package cviceni;

public class cviceni5 {
    public static void main(String[] args) {
        String rodneCislo = "120808/3100";
        boolean jeLomitko = false;
        if (rodneCislo.indexOf("/") == 6){
            jeLomitko = true;
        }
        else {
            jeLomitko = false;
        }
        if (jeLomitko){
            System.out.println("je lomeno");
        }
        else {
            System.out.println("neni lomeno");
        }
    }
}
