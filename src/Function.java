import java.util.*;

public class Function{
	public static void main(String[] args){
		//Main method
		Scanner input = new Scanner(System.in);
		//Let one can enter x 
		double x = input.nextDouble();
		AFunction A = new AFunction();
		BFunction B = new BFunction();
		CFunction C = new CFunction();
		DFuction D = new DFuction();
		EFunction E = new EFunction();
		FFunction F = new FFunction();
		GFunction G = new GFunction();
		//Print the result
		System.out.println("When x =" + x + "the result is"+ A.f(x));
		System.out.println("When x =" + x + "the result is"+ B.f(x));
		System.out.println("When x =" + x + "the result is"+ C.f(x));
		System.out.println("When x =" + x + "the result is"+ D.f(x));
		System.out.println("When x =" + x + "the result is"+ E.f(x));
		System.out.println("When x =" + x + "the result is"+ F.f(x));
		System.out.println("When x =" + x + "the result is"+ G.f(x));
	}
}
