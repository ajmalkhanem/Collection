package Collectiontests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sample {

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
		System.out.println(list.get(3));// get value
		
		list.remove(3);// remove value
		
		ArrayList list1=(ArrayList) list.clone(); // clone method is used to create a copy
		System.out.println(list1.get(2));
		String n1=s.next();
		
		list.set(0,n1); // used to replace
		
		//list.clear(); // clear the array
		
		list.removeAll(list); // remove all elemnts
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) // hasnext che
		{
			System.out.println(itr.next());
		}

	}

}
