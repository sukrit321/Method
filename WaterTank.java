import java.util.Scanner;

public class WaterTank {

    public static int fill(int tank, int amount, int sum){
        if(sum > tank){
            System.out.println("Cannot fill the tank");
            return -1;
        }
        else {
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int tank = x*y*z;
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int amount = sc.nextInt();
            sum+=amount;
            int re = fill(tank, amount, sum);
            if(re == -1){
                sum-=amount;
            }
            System.out.println(re);
        }
    }
}
