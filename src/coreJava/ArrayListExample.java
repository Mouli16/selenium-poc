package coreJava;

import java.util.ArrayList;

public class ArrayListExample {
//ArrayList, linkedList and vector implements List interface
	//Array have fixed size whereas arrayList can grow dynamically
	//Can access and insert any values in any index 
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Mouli");
		a.add("Parijat");
		System.out.println(a);
		a.add(1, "weds");  //adding element to arraylist
		System.out.println(a);
		a.add("Parijat"); //accepts duplicate values
		System.out.println(a); 
		System.out.println(a.contains("Parijat"));
		System.out.println(a.indexOf("Mouli"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		String b =a.get(2);
		
		boolean c= a.contains("Java");
		System.out.println(b+ " " + c ); 
		a.remove(0);          //removing element from list
		a.remove("weds");
		System.out.println(a); 
		

	}

}
