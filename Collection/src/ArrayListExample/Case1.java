package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList list = new ArrayList();

		Details[] emp = new Details[n]; // array
		
		for (int i = 0; i < n; i++) {
			System.out.println("Name");
			String name = s.next();
			System.out.println("Address");
			String address1 = s.next();
			System.out.println("Contact Number");
			String contact = s.next();
			System.out.println("Email");
			String em = s.next();

			System.out.println("Proof type");
			String typ = s.next();
			System.out.println("proof id");
			String iid = s.next();

			emp[i] = new Details();

			System.out.println("Do you want to update email ?");
			String st = s.next();
			String y = st.toLowerCase();
			if (y.contentEquals("yes"))

			{
				System.out.println("Enter new email");
				String uemail = s.next();
				emp[i].setName(name);
				emp[i].setAddress(address1);
				emp[i].setNumber(contact);
				emp[i].setEmail(uemail);
				emp[i].setType(typ);
				emp[i].setId(iid);
				list.add(emp[i]);

			} else {
				emp[i].setName(name);
				emp[i].setAddress(address1);
				emp[i].setNumber(contact);
				emp[i].setEmail(em);
				emp[i].setType(typ);
				emp[i].setId(iid);
				list.add(emp[i]);
			}

		}

		Iterator<Details> itr = list.iterator(); // create iterator for list type employee
		int j = 1;

		while (itr.hasNext()) {
			Details e = itr.next(); // employee class
			System.out.println("Details of employe :" + j);
			System.out.println("Name :" + e.getName() + "\n" + "Address :" + e.getAddress() + "\n" + "Number :"
					+ e.getNumber() + "\n" + "Email :" + e.getEmail() + "\n" + "Proof Type :" + e.getType() + "\n"
					+ "Proof ID :" + e.getId());
			j++;

		}

		// listing all employee with index

		System.out.println("List of employee :");
		Iterator<Details> itr1 = list.iterator();
		int ind = 0;
		while (itr1.hasNext()) {
			Details e = itr1.next();
			System.out.println("Name :" + e.getName() + " " + "index :" + ind);
			ind++;

		}

		// delete a particular employee details

		System.out.println("Do you want to delete any employe details");
		String st1 = s.next();
		String y1 = st1.toLowerCase();
		if (y1.contentEquals("yes")) {
			System.out.println("Enter the employe id");
			int eid = s.nextInt();
			list.remove(emp[eid]);
			Iterator<Details> itr2 = list.iterator();
			while (itr2.hasNext()) {
				Details e = itr2.next();
				System.out.println("Details of employe :");
				System.out.println("Name :" + e.getName() + "\n" + "Address :" + e.getAddress() + "\n" + "Number :"
						+ e.getNumber() + "\n" + "Email :" + e.getEmail() + "\n" + "Proof Type :" + e.getType() + "\n"
						+ "Proof ID :" + e.getId());

			}
		}

	}

}

class Details {
	String name, address, number, email, type, id, uemail;

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
