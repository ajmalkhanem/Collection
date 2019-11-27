package Collectiontests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			String name=s.next();
			System.out.println("Age");
			int age=s.nextInt();
			list.add(name);
			list.add(age);
			
			
		}
		Iterator itr=list.iterator(); // craete iterator for printing
		while(itr.hasNext())  
		{
			System.out.println(itr.next());
		}
		list.remove(2);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())  
		{
			System.out.println(itr1.next());
		}
	}

}
