package Collectiontests;

import java.util.ArrayList;

import java.util.Iterator;

public class AddAllArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		list.add(10);
		list.add(11);
		list.add(12);
		ArrayList list1=new ArrayList();
		list1.add(15);
		list.addAll(list1);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
