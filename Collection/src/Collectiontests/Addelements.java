package Collectiontests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Addelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the size");
		int n=s.nextInt();
		
		ArrayList list=new ArrayList(); // create array list
		
		for(int i=0;i<n;i++) //read names up to limit
		{
			System.out.println("Name");
			String name=s.next();
			list.add(name); // add values to the list

	}
		Iterator itr=list.iterator(); // craete iterator for printing
		while(itr.hasNext())  
		{
			System.out.println(itr.next());
		}
		

}
}
