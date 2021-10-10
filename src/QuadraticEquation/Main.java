package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a :");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b : ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào c :");
        double c = sc.nextDouble();
        QuadraticEquation qe1 = new QuadraticEquation(a,b,c);
        if (qe1.getDiscriminant()>0){
            System.out.println("The equation has two roots " + qe1.getRoot1() + " and " + qe1.getRoot2());
        }else if (qe1.getDiscriminant() == 0){
            System.out.println("The equation has one roots " + qe1.getRoot1());
        }else {
            System.out.println("The equation has no roots ");
        }
    }
}
