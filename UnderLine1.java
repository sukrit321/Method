import java.util.Scanner;

public class UnderLine1 {

    public static void printUn(){
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
            printUn();

        }

    }
}
