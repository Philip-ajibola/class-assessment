import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 

	System.out.print("Enter A number From 1-10 ");
		int number = input.nextInt();
		int count = 1;
if(number>1 && number<10){
	while(count<=12){
			int product = number*count;
		System.out.printf("%d x %d = %d \n",number,count,product);
		
		count++;	
	}


} else{
 	
	System.out.print("You No dey Read Instruction !! Enter Number From 1 - 10 ");
	}






	}





}