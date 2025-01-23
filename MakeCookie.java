import java.util.Scanner;

public class MakeCookie {

    public static void calCookieBags(int flour, int butter){
        if(flour < 0 || flour > 100000 ||  butter < 0 || butter > 100000){
            if((flour < 0 || flour > 100000) && (butter < 0 || butter > 100000)){
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: Invalid");
            }
            else if (flour < 0 || flour > 100000) {
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: " + butter);
            }
            else {
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: " + flour);
                System.out.println("Butter left: Invalid");
            }
        }
        else {
            if(flour / 6 < butter / 3){
                int cookie = flour / 6;
                int flourleft = flour - (cookie * 6);
                int butterleft = butter - (cookie * 3);
                System.out.println("Cookie bags: " + cookie);
                System.out.println("Flour left: " + flourleft);
                System.out.println("Butter left: " + butterleft);
            }
            else {
                int cookie = butter / 3;
                int flourleft = flour - (cookie * 6);
                int butterleft = butter - (cookie * 3);
                System.out.println("Cookie bags: " + cookie);
                System.out.println("Flour left: " + flourleft);
                System.out.println("Butter left: " + butterleft);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flour = sc.nextInt();
        int butter = sc.nextInt();
        calCookieBags(flour, butter);
    }
}