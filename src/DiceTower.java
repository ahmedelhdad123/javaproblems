import java.util.Scanner;

public class DiceTower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfDice=scanner.nextInt();
        int top=scanner.nextInt();
        boolean check=false;
        while (numberOfDice-->0)
        {
            int oneSide=scanner.nextInt();
            int towSide=scanner.nextInt();
            if (oneSide==top||oneSide==7-top||towSide==top||towSide==7-top)
            {
                check=true;
            }
        }
        String result= check==true ? "NO" : "YES" ;
        System.out.println(result);
    }
}
