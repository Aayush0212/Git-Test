import java.util.*;

class StudentDriver{

	 public static void main(String[] args) {
	 

	 	
		Scanner in = new Scanner(System.in);
    System.out.println("Enter the details of student");
    System.out.println("First Name : ");
    String firstName = in.nextLine();
            
    System.out.println("Last Name :");
    String lastName = in.nextLine();

    System.out.println("eMail :");
    String eMail = in.nextLine();

    System.out.println("contactNo : :");
    String contactNo = in.nextLine();

    System.out.println("enter the no. of skills");
    int a =in.nextInt();
    String skills[] = new String[a];
    in.nextLine();
    for(int i=0;i<a;i++)
      {   
       	 skills[i] = in.nextLine();

        } 

System.out.println("Adress line1 :");
                     String line1 = in.nextLine();

                     
System.out.println("Adress line2 :");
                       String line2 = in.nextLine();


System.out.println("Adress city :");
                          String city = in.nextLine();


System.out.println("Adress state :");
                             String state = in.nextLine();

System.out.println("pinCode : ");
                              int pinCode = in.nextInt();

   Adress addr = new Adress(line1,line2,city,state,pinCode);




System.out.println("Enter the no. of Qualifications");
int b = in.nextInt();
Qualification qual[] = new Qualification[b];
for(int i =0 ; i<b;i++)
{
System.out.println("Qualification - Qualification name :");
                        in.nextLine();
                    String qualName = in.nextLine();
                

                    System.out.println("Qualification - university :");
                    String university = in.nextLine();

                    System.out.println("Qualification - institute :");
                    String institute = in.nextLine();

                    System.out.println("Qualification - cgpa :");
                    float cgpa = in.nextFloat();
                    qual[i] = new Qualification(qualName,university,institute,cgpa);
                }


System.out.println("enter the no. of projects");
int c = in.nextInt();
Project project[] = new Project[c]; 
for (int i =0 ;i<c  ;i++ ) {
	


                    System.out.println("Project - Name : ");
                        in.nextLine();
                    String name = in.nextLine();
                    


                    System.out.println("Project - startDate : ");
                    String startDate = in.nextLine();

                    System.out.println("Project - endDate : ");
                    String endDate = in.nextLine();

                    System.out.println("Project - role : ");
                    String role  = in.nextLine();

                    System.out.println("how many resposibilities you want to enter");
                    int n = in.nextInt();
                    
                  String  responsibilities[] = new String[n];
                    for(int j=0;j<n;j++)
                    {in.nextLine();
                    responsibilities[j] = in.nextLine();
                    }
                   project[i] = new Project( name , startDate , endDate ,  role, responsibilities);

               }


       Student s2 = new Student( firstName,  lastName, qual,addr,project,eMail, contactNo,skills);


s2.DisplayStudent();



	}
}