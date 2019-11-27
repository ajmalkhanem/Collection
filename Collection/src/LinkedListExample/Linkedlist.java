package LinkedListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			String name=s.next();
			System.out.println("Age");
			int age=s.nextInt();
			System.out.println("id");
			int id=s.nextInt();
			System.out.println("pin");
			int pin=s.nextInt();
			System.out.println("salary");
			int sala=s.nextInt();
			list.add(name);
			list.add(age);
			list.add(id);
			list.add(pin);
			list.add(sala);
			
			
		}
		
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) // hasnext che
		{
			System.out.println(itr.next());
		}

	}

}
