package Javaprogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.sun.tools.javac.util.Assert;

public class ArrayListnStreams
{
    //@Test
	public void regular ()
	
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Parijat");
		name.add("Priyam");
		name.add("Poppy");
		name.add("Mouli");
		int count =0;
		for(int i=0; i<name.size(); i++)
		{
			String actual= name.get(i);
			if(actual.startsWith("P"))
				count++;
		}
		System.out.println(count);
		
	}
	
	//@Test
	public void streamFilter()
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Parijat");
		name.add("Priyam");
		name.add("Poppy");
		name.add("Mouli");
		
		//there is no life of intermediate op if there is no terminal op
		//terminal operation will execute  only if intermediate operation(filter) returns true
		//we can create stream
		//how to use filter in stream API
		
		Long c= name.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
	long d=	Stream.of("Parijat","Priyam","Poppy","Mouli").filter(s->
	{
		s.startsWith("P");
	    return true;
	}).count();
	System.out.println(d);
	
	//print all the names of ArrayList
	name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	}
	
 //@Test
 
 public void streamMap()
  {
	 ArrayList<String> names= new ArrayList<String>();
	 names.add("tom");
	 names.add("tim");
	 names.add("tum");
	 //print names which have last letter y to upper case
	 Stream.of("parijat","priyam","poppy","mouli").filter(s->s.endsWith("y")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	 
	 //print names with first letter P and to uppercase and sorted
	 List<String> names1 = Arrays.asList("parijat","priyam","poppy","mouli");
	 
	 names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	 Stream<String> newStream= Stream.concat(names.stream(),names1.stream());
//	 newStream.sorted().forEach(s->System.out.println(s));
	boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("mouli"));
	System.out.println(flag);
	Assert.assertTrue(flag);
 }
 
 @Test
 public void streamCollect()
 {
	/**List<String> ls= Stream.of("parijat","priyam","poppy","mouli").filter(s->s.endsWith("y")).map(s->s.toUpperCase()).
	 collect(Collectors.toList());
	System.out.println(ls.get(0)); **/
	
	//sorting numbers
	List<Integer> num= Arrays.asList(3,4,6,3,9,1,0,9,5,8);
	
	//print unique number from this array
	//sort the array
	num.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> li = num.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("3rd index: "+li.get(2));
 }
}


