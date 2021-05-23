package coreJava;

import java.util.HashSet;
import java.util.Iterator;

//hashSet, TreeSet, LinkedHashset implements Set interface
//does not accept duplicate values
//No guarantee that elements will be stored in sequential order... random order



public class HashSetExample 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Monica");
		hs.add("Chandler");
		hs.add("Phoebe");
		hs.add("Chandler");
		hs.add("Rachel");
		hs.add("Joey");
		hs.add("Ross");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("Phoebe");
		System.out.println("after removing" + hs);
		
	Iterator<String> i=	hs.iterator();
	System.out.println("List of friends: ");
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

	}

}
