package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        ArrayList<Double> store=new ArrayList<>();
        for (int i=0;i<size;i++)
        {
            store.add(scanner.nextDouble());
        }
        doAverage(store);
    }

    private static void doAverage(ArrayList<Double> store) {
        double sum=0.0;
        for (double v : store) {
            sum += v;
        }
        double answer=sum / store.size();
        System.out.printf("%.6f",answer);
    }

}
