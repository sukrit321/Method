import java.util.Scanner;

public class CookiePlan {

    public static int planCookie(int[] flours, int[] butters, int n){
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int flo = flours[i] / 6;
            int but = butters[i] / 3;
            if(flo < but){
                max = flo;
            }
            else {
                max = but;
            }
            if(max < 10){
                sum++;
                System.out.println(i + 1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flours = new int[n];
        int[] butters = new int[n];
        for(int i = 0; i < n; i++){
            flours[i] = sc.nextInt();
            butters[i] = sc.nextInt();
        }
        int day = planCookie(flours, butters,n);
        System.out.println("There are " + day + " days that ingredients are insufficient");
    }
}
