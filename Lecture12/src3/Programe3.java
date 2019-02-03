import java.util.*;
class Programe3
{
	public static void main(String[] args)
	{
		Student s1 = new Student (101,"vr3f",32);
		Student s2 = new Student (102,"rf3r",31);
		Student s3 = new Student (103,"rv3",30);
		ArrayList <Student> al = new ArrayList <Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
