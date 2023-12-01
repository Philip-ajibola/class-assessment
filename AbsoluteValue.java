import java.util.Scanner;

public class AbsoluteValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
 
	System.out.print("Enter a Number ");
	int number = input.nextInt();

if(number<0){
	int absoluteValue = -1*number;

		System.out.printf("the absolute value of %d is %d",number,absoluteValue);

}
else if(number>0){
	int absoluteValue = number;

		System.out.printf("the absolute value of %d is %d",number,absoluteValue);

}


if(number==0){
	int absoluteValue =number;

		System.out.printf("the absolute value of %d is %d",number,absoluteValue);

}



	}





}