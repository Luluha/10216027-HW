
public class GFunction extends AbstractDrawFunction{
	@Override
	//Construct f's data type
	double f(double x) {
		//Return value Math.log(x)/Math.log(10) + x * x
		return Math.log(x)/Math.log(10) + x * x;
	}
}
