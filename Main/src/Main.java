import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점의 총 개수 : ");
        int total = scan.nextInt();
        int circle  = 0;
        int r = 3;
        double x;
        double y;

        for (int i = 0; i < total ; i++) {
            x = Math.random()*(r*2)-r;
            y = Math.random()*(r*2)-r;
            if(Math.sqrt(x*x+y*y)<=r){
                circle++;
            }
        }

        double pi= 4 * ((float)circle / total);
        System.out.println(pi);
    }
}