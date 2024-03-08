package projects;

import java.util.Scanner;

public class StudentGrade {
	
	public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
	System.out.println("Enter the total subject:");
	int n=input.nextInt();
	int arr[]=new int[n];
	int sum=0;
	System.out.println("Enter the "+n+" subject marks out of 100");
	for(int i=0;i<n;i++) {
		arr[i]=input.nextInt();
		sum=sum+arr[i];
	}
	float avg=sum/n;
	System.out.println("Total Marks :"+sum);
	System.out.println("Average :"+avg);
	if(avg>=90) {
		System.out.println("Grade : O");
	}
	else if(avg>=80){
		System.out.println("Grade : A");
	}
	else if(avg>=70){
		System.out.println("Grade : B");
	}
	else if(avg>=60){
		System.out.println("Grade : C");
	}
	else if(avg>=50){
		System.out.println("Grade : D");
	}
	else {
	System.out.println("Grade : E");
	}
}

	}


}
