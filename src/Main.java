
public class Main {

	public static void main(String[] args) {
		// && (AND) requires both expressions to be true
		boolean a = (5 > 2) && (6 / 3 == 3); //true && false -> false
		
		// || (OR) requires that only one of the expressions is true
		boolean b = !true || !false ; //false || true -> true
		
		boolean c = (7 < 2) || (1 + 2 != 3); //false || false -> false
		
		int x = 2;
		boolean d = (x > 0 && x < 10) && (x != 5); //true for x= 1-9 excluding 5
		
		
		//e and f are equivalent boolean expressions
		boolean e = !(x > 2 || x <= 0);
		//if we distribute the ! (NOT), we get:
		boolean f = (x <= 2 && x > 0);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
	

		
		
		



	}

}
