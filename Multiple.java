package java_training;

import java.util.*;

public class Multiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        if (x % 3 == 0 && x % 6 == 0) {
            System.out.println("The number "+x+" is a multiple of both 3 and 6");
        }
        else{
            System.out.println("The number "+x+" is not a multiple of both 3 and 6");
        }

    }
}
