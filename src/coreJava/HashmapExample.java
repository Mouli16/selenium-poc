package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		
     HashMap<Integer,String> hm = new HashMap<Integer,String>();
     hm.put(0,"cat");
     hm.put(1,"dog");
     hm.put(2,"mouse");
     System.out.println(hm.get(2));
     System.out.println(hm.remove(0));
     
        Set s= hm.entrySet();
         Iterator it=   s.iterator();
         //hashtable- pass table set collections
         while(it.hasNext())
         {
        	 Map.Entry mp = (Map.Entry)it.next();
        	 System.out.println(mp.getKey());
        	 System.out.println(mp.getValue());
         }
	}//difference between hashmap and hashtable
	//Hashmap is non synchronized and not thread safe; Hashtable is synchronized and thread safe
	//  Allows one null key and any no of null values ; does not allow null key or null values
	// object values are iterated using Iterator; Uses enumerator to iterate
	

}
