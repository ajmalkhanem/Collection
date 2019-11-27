package MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapexmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		Map<Integer,Employee1> map=new HashMap<Integer,Employee1>();
		Employee1[] emp=new Employee1[n];
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee1();
			System.out.println("Enter the name");
			emp[i].setName(s.next());
			System.out.println("Enter the reg num");
			emp[i].setName(s.next());
			System.out.println("Enter the phone number");
			emp[i].setPhn(s.next());
			System.out.println("Enter the colege name");
			emp[i].setClg(s.next());
			System.out.println("Enter the Address");
			emp[i].setAddress(s.next());
			System.out.println("Enter the mark");
			emp[i].setMark(s.nextInt());
			System.out.println("Enter the year");
			emp[i].setYear(s.nextInt());
			map.put(i, emp[i]);
		}
	}

}
class Employee1
{
	String name,clg,address,phn;
	int regid,mark,year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
