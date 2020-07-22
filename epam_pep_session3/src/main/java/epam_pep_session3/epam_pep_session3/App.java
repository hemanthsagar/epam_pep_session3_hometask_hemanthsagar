package epam_pep_session3.epam_pep_session3;

import java.util.Scanner;
public class App 
{
	public static void main( String[] args )
    {
		Scanner sc=new Scanner(System.in);
    	int ch=0;
        System.out.println("Choose any one option \n 1.addition \n2.subtraction \n3.multiplication \n4.division\n");
        ch=sc.nextInt();
        if(ch<1 || ch>4)
        {
        	System.out.println("Invalid option");
        	return;
        }
        System.out.println("ente 2 integer values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Operations obj=new Operations();
        System.out.println("answere is ");
        if(ch==1)
        	obj.add(a, b);
        else if(ch==2)
        	obj.subtract(a, b);
        else if(ch==3)
        	obj.multiply(a, b);
        else
        	obj.divide(a, b);
        
        System.out.println("\n\n***end of project***");
    }
}
