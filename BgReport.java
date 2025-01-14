import java.util.Scanner;

public class BgReport {

    public static void reportBg(String name, int biryear, int stayear){
        System.out.println("Name: " + name);
        if(biryear >= 1900 && biryear <= 2022){
            System.out.println("Birth year: " + biryear);
        }
        else {
            System.out.println("Birth year: INVALID");
        }
        if (stayear - biryear >= 18) {
            System.out.println("Start year: " + stayear);
        }
        else {
            System.out.println("Birth year: INVALID");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int biryear = sc.nextInt();
        int stayear = sc.nextInt();
        reportBg(name, biryear, stayear);
        
    }
}
