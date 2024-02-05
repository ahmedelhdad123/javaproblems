import java.util.Scanner;

public class CircleTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int r= scanner.nextInt();
        int n= scanner.nextInt();
        while (n--> 0)
        {
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            circle(x,y,r,x2,y2);
        }
        

    }

    private static void circle(int x, int y, int r, int x2, int y2) {
        int dx=x2-x;
        int dy=y2-y;
        double d= Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        if(d<=r){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }


}
