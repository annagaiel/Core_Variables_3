package three;

public class Example {

	int x; int y;
	String name;
	 
	/***
	 * Select one correct answer:
	 * a. The program does not compile because x, y and name are not initialized.
	 * b. The program throws a runtime exception as x, y, and name are used before initialization.
	 * c. The program prints pnt is 0 0.
	 * d. The program prints pnt is null 0 0.
	 * e. The program prints pnt is NULL false false
	 * 
	 * Answer: 
	 *  d. When Example class is created, it has the properties of x, y, and name.
	 *     The int variable x and y values is set to 0 by default.
	 *     The String name value is set to null by default.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Example pnt = new Example();
		System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	}
}