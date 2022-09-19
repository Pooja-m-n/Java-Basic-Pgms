package java_training;
import java.util.Scanner;

public class Average {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int [] arr = new int[5];
        int sum=0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int j=arr.length-1;
        while(j>-1){
            sum = sum+arr[j];
            j--;
        }
        int avg = sum/5;
        System.out.println("Average of 5 nos is "+avg);
        
    }

}
