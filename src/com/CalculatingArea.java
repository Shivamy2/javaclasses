package src.com;

import src.com.getter.AreaOfCircle;
import java.util.Scanner;

public class CalculatingArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        AreaOfCircle obj = new AreaOfCircle();
        System.out.println(obj.getRadius());
        System.out.println(obj.setRadius(rad));
    }
}