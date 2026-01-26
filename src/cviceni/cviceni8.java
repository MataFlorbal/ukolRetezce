package cviceni;

public class cviceni8 {
    public static void main(String[] args) {
        String jmeno = "hOracIO BohAtÝ";
        String[] casti = jmeno.split(" ");
        String krestniJmeno = casti[0];
        String prijmeni = casti[1];
        String krestniJmenoPismena = krestniJmeno.substring(0,1).toUpperCase() + krestniJmeno.substring(1).toLowerCase();
        String prijmeniPismena = prijmeni.toUpperCase();
        System.out.println(krestniJmenoPismena + " " + prijmeniPismena);
    }
}
