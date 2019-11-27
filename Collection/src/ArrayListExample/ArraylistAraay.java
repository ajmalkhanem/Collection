package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		
		Employee [] emp=new Employee[n]; //array
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			String name=s.next();
			System.out.println("Age");
			int age=s.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			list.add(emp[i]);
				
		}
		
		Iterator<Employee> itr=list.iterator(); // create iterator for list type employee
		while(itr.hasNext()) 
		{
			Employee e=itr.next(); //employee class
			System.out.println(e.getAge()+" "+e.getName());
			
		}
	}

}
class Employee
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
