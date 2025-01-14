import java.util.Scanner;

public class CovidScreening {

    public static void screenCovid(boolean ins, int severity, int age, int vaccines){
        if(ins){
            System.out.println("RT-PCR recommended");
        }
        if(severity == 3 || age > 70){
            System.out.println("Hospital admission");
        }
        else {
            System.out.println("Home isolation");
        }
        if(vaccines < 2){
            System.out.println("Favipiravia included");
        }
        else if(severity >= 2){
            System.out.println("Favipiravia included");
        }
        else {
            System.out.println("Standard medicine package");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insurance = sc.nextInt();
        int severity = sc.nextInt();
        int age = sc.nextInt();
        int vaccines = sc.nextInt();
        boolean ins = true;
        if(insurance == 1){
            ins = true;
        }
        else {
            ins = false;
        }
        screenCovid(ins, severity, age, vaccines);
    }
}
