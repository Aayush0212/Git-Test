import java.util.*;
public class HeartRatesTest
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values for 2 persons: FirstName,LastName,DoB(dd/mm/yyyy)");
		HeartRates k[] = new HeartRates[2];
		for(int i=0;i<2;i++)
		{
			String fName=scan.nextLine();
			String lName=scan.nextLine();
			int days=scan.nextInt();
			int month=scan.nextInt();
			int year=scan.nextInt();			
			k[i] = new HeartRates(fName,lName,days,month,year);
			scan.nextLine();
			
		}
		System.out.println("\t\tFirstName\t\tLastName\t\tDoB\t\tMaximumHeartRate\t\tTargetHeartRate(Min)\t\tTargetHeartRate(Max)");
		
		System.out.print("Person-1:\t\t");
		
		double ageInYears=k[0].calcAgeInYears();
		
		double maxHR = k[0].maxHeartRate();
		
		double targetHRMin=k[0].targetMaxHeartRate();
		
		double targetHRMax=k[0].targetMinHeartRate();
		
		System.out.println(k[0].firstName+"\t\t"+k[0].lastName+"\t\t"+k[0].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);
		
		System.out.print("Person-2:\t\t");
		
		ageInYears=k[1].calcAgeInYears();
		
		maxHR = k[1].maxHeartRate();
		
		targetHRMin=k[1].targetMaxHeartRate();
		
		targetHRMax=k[1].targetMinHeartRate();
		
		System.out.println(k[1].firstName+"\t\t"+k[1].lastName+"\t\t"+k[1].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);
	
	}
}