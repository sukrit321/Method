import java.util.Scanner;

public class AgeReport {

    public static int  reportAge(int[] arr_age, int[] arr_id, int y1, int y2, int n){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr_age[i] >= y1 && arr_age[i] <= y2){
                cnt++;
                System.out.println(arr_id[i]);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_id = new int[n];
        int[] arr_age = new int[n];
        for(int i = 0; i < n; i++){
            arr_id[i] = sc.nextInt();
            arr_age[i] = sc.nextInt();
        }
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int re = reportAge(arr_age, arr_id, y1, y2, n);
        System.out.println("There are " + re + " persons in age range of " + y1 + " to " + y2);
    }
}
