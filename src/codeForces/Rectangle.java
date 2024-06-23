package codeForces;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        int n=scanner.nextInt();
        while (n-->0)
        {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            isOk(x, y,x1,y1,x2,y2,x3,y3,x4,y4);
        }
    }

    private static void isOk(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int scopeMinX=Math.min(x1,Math.min(x2,Math.min(x3,x4)));
        int scopeMinY=Math.min(y1,Math.min(y2,Math.min(y3,y4)));
        int scopeMaxX=Math.max(x1,Math.max(x2,Math.max(x3,x4)));
        int scopeMaxY=Math.max(y1,Math.max(y2,Math.max(y3,y4)));
        if(x>=scopeMinX&&x<=scopeMaxX&&y>=scopeMinY&&y<=scopeMaxY)
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }
}
