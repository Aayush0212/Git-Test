import java.util.*;
class Programe1{
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Amit");
		al.add("vijay");
		al.add("kumar");
		al.add(1,"Sachin");
		System.out.println("elements at second position"+al.get(2));

		ListIterator<String>itr=al.listIterator();
		System.out.println("Traversing elements in forward directions");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}