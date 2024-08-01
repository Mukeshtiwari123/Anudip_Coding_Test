package Ichart_Codes;

//1.Write a Java program that takes an array of numbers as input from the user, filters out the even numbers, 
//displays them, and calculates their sum. The user should be able to input random numbers.
import java.util.Scanner;
public class Demo_1 {

	public static void main(String []args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int Len=Integer.parseInt(sc.nextLine());
		int [] arr=new int[Len];
		System.out.println("Enter The Array Element: ");
		for(int i=0;i<Len;i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<Len;i++) {
			System.out.println("Array Elements" + "["+i+"]: "+arr[i]+"\n");	
		}
		System.out.println("Even Number of entered Array Element is: ");
		for(int i=0;i<Len;i++) {
			if((arr[i]%2)==0) {
				System.out.println(arr[i]+"\n");
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum is:"+sum);
		sc.close();
	}
}
