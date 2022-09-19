package java_training;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<=100; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of even nos from 1 to 100 is " +sum);

    }

}
