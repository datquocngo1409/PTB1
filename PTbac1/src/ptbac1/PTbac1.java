package ptbac1;

import java.util.Scanner;

public class PTbac1 {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");     
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();
        if(a==0){
            if(b==0) System.out.println("The solution is all x!");
            else System.out.println("No solution!");
        }
        else{
            System.out.println("The solution is: "+(-b/a));
        }
    }
    
}
