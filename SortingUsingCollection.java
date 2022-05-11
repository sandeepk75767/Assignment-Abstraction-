package classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingUsingCollection {

	public static void main(String[] args) {
	
		List listValues = new ArrayList();
		
		System.out.println(listValues.size());
		
		listValues.add("HCL");
		listValues.add("Wipro");
		listValues.add("Aspire Systems");
		listValues.add("CTS");
		
		//length of the array
		System.out.println(listValues.size());
		
		for(int i=0; i<listValues.size();i++)
		{
			System.out.println(listValues.get(i));
		}
		//sort the array
		Collections.sort(listValues);
		
		System.out.println(listValues.size());
		for (int i=0; i<listValues.size();i++)
		{
			System.out.println(listValues.get(i));
			
		}
		
		//reverse order
		System.out.println(listValues.size());
		for (int i=listValues.size()-1; i>=0;i--)
		{
			System.out.println(listValues.get(i));
			
		}
	}

	}


