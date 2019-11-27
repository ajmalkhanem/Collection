package HashsetExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CaseBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int op;
		HashSet sc=new HashSet();
		
		
		do
		{
			System.out.println("1.Booking\n2.Check Status\n3.Exit");
			System.out.println("Enter your choice");
			op=s.nextInt();
			if(op==1)
			{
			
				
				System.out.println("Welcome");
				System.out.println("Enter number of customers");
				int n=s.nextInt();
				Detailsset[] c = new Detailsset[n];
				
				for(int i=0;i<n;i++)
				{
					
					c[i]=new Detailsset();
					System.out.println("please choose the service required");
					System.out.println("AC/non-AC(AC/nAC)");
				    c[i].setAc(s.next());
				    
				    System.out.println("Double /single");
				    c[i].setCot(s.next());
				    System.out.println("wifi/not");
				    c[i].setWifi(s.next());
				    System.out.println("laundry /not(La/no)");
				    c[i].setLa(s.next());
				    System.out.println("Cable /not");
				    c[i].setCable(s.next());
				    c[i].setId(i);
				    sc.add(c[i]);
				}
				    Iterator<Detailsset> itr3=sc.iterator();
				    int i=0;
					while(itr3.hasNext())
					{
						Detailsset e=(Detailsset)itr3.next();
						int total,b=0,c1,d,e1,f,ii=1;
						if(e.getAc().contentEquals("AC")==true)
						{
							b=1500;
						}
						else
						{
							b=700;
						}
						if (e.getCot().contentEquals("single")==true)
						{
							c1=50;
						}
						else
						{
							c1=100;
						}
						if(e.getCable().equals("cable")==true)
						{
							d=50;
						}
						else
			     		{
							d=0;
						}
						if(e.getWifi().equals("wifi")==true)
						{
							e1=150;
						}
						else
						{
							e1=0;
						}
						if(e.getLa().equals("La")==true)
						{
							f=300;
						}
						else
						{
							f=0;
						}
						total=b+c1+d+e1+f;
						System.out.println("the total charge is Rs."+total);
						
						System.out.println("AC"+" "+e.getAc()+"\n"+"Room type"+" "+e.getCot()+"\n"+"Wifi connection"+" "+e.getWifi()+"\n"+"cable connection"+" "+e.getCable()+"\n"+"Laundry"+" "+e.getLa()+"\n"+" Room Number"+e.getId()+" ");
						i++;
						//System.out.println(c[i]);
						
					}
					
				
			}
			else if(op==2)
			{
					
			
				System.out.println("enter room number");
				int rom=s.nextInt();
				Iterator<Detailsset> itr4=sc.iterator();
			    int i=0;
				while(itr4.hasNext())
				{
					Detailsset ee=(Detailsset)itr4.next();
					int fgd=ee.getId();
				if (rom<=fgd ){
					System.out.println("room not available");
					break;
				}
				else
				{
					System.out.println("room  available");
					break;
				}
			}
				}
			else if(op==3)
			{
				System.exit(0);
			}
			
			
		}while(op==1 || op== 2 || op==3);
			
	

}}
class Detailsset
{
	String ac;
	String cot;
	String cable;
	String wifi;
	String la;
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLa() {
		return la;
	}
	public void setLa(String la) {
		this.la = la;
	}

}
