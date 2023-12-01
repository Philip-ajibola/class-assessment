import java.util.Scanner;

public class ItemPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter The Item You want To Purchase \n");
		String item = input.next();

	System.out.print("Enter The Price Of  Item You want To Purchase \n");
		double amount = input.nextDouble();
	if(amount<0){
		System.out.print("Please Enter A Valid Price  \n");
		 amount = input.nextDouble();
	}

        double discount = 10/100.0;
       double price  = (1-discount)*amount;

 System.out.printf("=========================\nItem: %s\nPrice: #%.2f\nDiscount: 10%s\nGrand Total: %.2f\n",item,amount,"%",price);

System.out.print("=========================");





	}







}