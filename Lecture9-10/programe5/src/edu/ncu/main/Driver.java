package edu.ncu.processor;
import edu.ncu.exception.*;
import edu.ncu.processor.*;
public class Driver{
	public static void main(String[] args) {
		A a= new C();
		try{
			a.f();

		}catch(LevelThreeException e3){
			System.out.print("Caught e3");
		}catch(LevelTwoException e2){
			System.out.print("Caught e2");
		}catch(LevelOneException e1){
			System.out.print("Caught e1");
		}
	}
}
	
	