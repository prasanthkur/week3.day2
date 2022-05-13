package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		 //Declare An array 
		Integer arr1[]={3,2,11,4,6,7};
		Integer arr2[]={1,2,8,4,9,7};
		
		//convert array to list
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
		
		// do  loop iterator for both list
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
					
		if(list1.get(i)==list2.get(j))
		{
			//printing Matching value from list1
			System.out.println(list1.get(i));
		}
		
		}
  
		
     
	}}

}
