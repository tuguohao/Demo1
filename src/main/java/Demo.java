import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rs = s.nextInt();
        Random random = new Random();
        int ra = random.nextInt(50)+1;
        System.out.println(ra);
        if(rs >= ra){
            System.out.println("哦豁");
        }else {
            System.out.println("哟西");
        }
    }
}
