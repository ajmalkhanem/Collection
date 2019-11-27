package HashsetExamples;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0,num;
		String symbol;
		Set sc=new TreeSet(new Symbol());
		NewCard [] c=new NewCard[40];
		while(sc.size()<n)
		{
			symbol=s.next();
			num=s.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			sc.add(c[count]);
			count++;
		}
		System.out.println(n+"Sysmbols gathered in "+count+"cards.");
		Iterator<NewCard> itr=sc.iterator();
		while(itr.hasNext())
		{
			NewCard e=(NewCard)itr.next();
			System.out.println(e.getSymbol()+" "+e.getNum());
			
		}
		
	}

}
class NewCard
{
	String Symbol;
	int num;
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
class Symbol implements Comparator<NewCard>
{
	public int compare(NewCard c1,NewCard c2)
	{
		return c1.getSymbol().compareTo(c2.getSymbol());
	}
	
}
