package codeForces;

import java.util.Scanner;

public class CommonArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        int counter=1;
        while (test-->0){
            int number=scanner.nextInt();
            int x1=scanner.nextInt();
            int y1=scanner.nextInt();
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            int maxX1=x1, maxY1=y1, minX2=x2, minY2=y2;
            for (int i=1; i<number; i++)
            {
                int x=scanner.nextInt();
                int y=scanner.nextInt();
                int x3=scanner.nextInt();
                int y3=scanner.nextInt();
                maxX1=Math.max(maxX1,x);
                maxY1=Math.max(maxY1,y);
                minX2=Math.min(minX2,x3);
                minY2=Math.min(minY2,y3);
            }
            if (minX2>maxX1 && minY2>maxY1)
            {
                System.out.println("Case #"+counter+": "+ (minX2-maxX1)* (minY2-maxY1));
            }else
            {
                System.out.println("Case #"+counter+": "+0);
            }
            counter++;
        }
    }

}
