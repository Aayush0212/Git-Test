import java.util.*;
class Programe1{
	public static void main(String[] args) {
		{
			int counter;	
			Scanner scan = new Scanner(System.in);
		    int elements[]=new int[5];
		    System.out.println("Enter 5 elements in the array");
		    for (counter=0;counter<5;counter++)
		    {
			    elements[counter]=scan.nextInt();
		    
		    }
			
			if(elements[counter]>99){
				System.out.println("Enter a two digit number");
				break;
			}
			else
				System.out.println("The element are "+ elements[counter]);


	
		}
	}
}