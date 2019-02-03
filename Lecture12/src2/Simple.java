import java.util.*;
class Simple{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");

		ArrayList <String>a12 =new ArrayList<String>();
		a12.add("Ravi");
		a12.add("hanumat");
		al.removeAll(a12);
		System.out.println("iterating the elements after removing the elements of a12...");
		Iterator itr=al.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
}