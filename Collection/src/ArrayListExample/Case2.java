package ArrayListExample;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int op = 0;
		ArrayList list = new ArrayList();
		do {
			System.out.println(
					"1.Display installed applictions\n2.Install an application\n3.Uninstall an application\n4.Quit");
			op = s.nextInt();

			if (op == 1) {
				if (list.isEmpty()) {
					System.out.println("Not install any apps");
				} else {
					Iterator itr = list.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
			} else if (op == 2) {
				System.out.println("Enter the app name");
				String ap = s.next();
				if (list.contains(ap)) {
					System.out.println("App already installed");
				} else {
					list.add(ap);
				}
			} else if (op == 3) {
				System.out.println("List of Apps :");
				Iterator itr = list.iterator();
				int ind = 0;
				while (itr.hasNext()) {

					System.out.println(itr.next() + " " + ind);
					ind++;

				}

				// delete a particular employee details

				System.out.println("Do you want to delete any apps");
				String st1 = s.next();
				String y1 = st1.toLowerCase();
				if (y1.contentEquals("yes")) {
					System.out.println("Enter the app id");
					int eid = s.nextInt();
					list.remove(eid);
					// Iterator itr2 = list.iterator();
					System.out.println("App uninstalled");

				}

			} else if (op == 4) {
				System.exit(0);
			}

			else {
				System.out.println("invalid option");
			}
		} while (op == 1 || op == 2 || op == 3);

	}
}
