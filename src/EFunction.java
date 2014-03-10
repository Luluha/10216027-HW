
public class EFunction extends AbstractDrawFunction{
	@Override
	//Construct f's data type
	double f(double x) {
		//Return value Math.cos(x)+5 * Math.sin(x)
		return Math.cos(x)+5 * Math.sin(x);
	}
}
