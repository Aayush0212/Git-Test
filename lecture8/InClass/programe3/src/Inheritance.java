public class inheritance{
public static void main(String [] args){
  Shape s = new Shape();

  Shape c = new Circle();
  
  System.out.println("s instance of Shape: " + (s instanceof Shape));								
                                //true
  System.out.println("c instance of Shape: " + (c instanceof Shape));
								// true
  System.out.println("s instance of Circle: " + (s instanceof Circle));
								//false
  System.out.println("c instance of Circle: " + (c instanceof Circle));
								//true
}
}

