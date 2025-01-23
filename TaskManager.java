import java.util.Scanner;

public class TaskManager {

    public static void reportLoad(int cpuAll, int ramAll, int cpuUsed, int ramUsed){
        int cpuus = (cpuUsed * 100) / cpuAll;
        int ramus = (ramUsed * 100) / ramAll;
        System.out.println("CPU: " + cpuUsed +"/"+cpuAll + " (" + cpuus +"%)");
        System.out.println("RAM: " + ramUsed +"/"+ramAll + " (" + ramus + "%)");
        if(cpuus >= 80){
            System.out.println("Limited CPU power");
        }
        if(ramus >= 80){
            System.out.println("Limited RAM availability");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cpuAll = sc.nextInt();
        int ramAll = sc.nextInt();
        int cpuUsed = sc.nextInt();
        int ramUsed = sc.nextInt();
        reportLoad(cpuAll, ramAll, cpuUsed, ramUsed);
    }
}
