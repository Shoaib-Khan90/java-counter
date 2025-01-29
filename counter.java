package shabby;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner currency=new Scanner(System.in);
		
		System.out.println("1:yen to rupees:");
		
		System.out.print("2:rupees to dollar:");
		
		System.out.print("3:dollar to rupees:");
		
		System.out.print("4: rupees to yen:");
		
		System.out.print("5: rupees to riyal:");
		
		System.out.print("6: rupees to paisa:");
		
		int n=currency.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("enter the amount in yen '¥' :");
			
			double a = currency.nextDouble();
			
			System.out.println("amount in yen"+(a*280)+ "¥");
			
			break;
			
		case 2:
			System.out.println("enter the amount in rupees '₳':");
			
			double b=currency.nextDouble();
			
			System.out.println("amount in rupees"+(b/280)+"₳");
			
			break;
			
		case 3:
			
		System.out.println("enter the amount in dollar is '$':");
		
		double c=currency.nextDouble();
		
		System.out.println("amount in dollar"+(c*280)+'$' );
		
		break;
		
		case 4:
			System.out.println("enter the amount in rupees to yen:");
			
			double d=currency.nextDouble();
			
			System.out.println("amount in rupees"+(d/280));
			
			break;
			
		case 5:
			System.out.println("amount in riyal is '﷼'");
			
			double e=currency.nextDouble();
			
			System.out.println("amount in riyal"+(e*280) + '﷼');
			
			break;
			
		case 6:
			System.out.println("amount in pasia and '₽'");
			
			double f=currency.nextDouble();
			
			System.out.println("amount in paisa " + (f/280) + '₽');
			
			break;
		}
	}

}
