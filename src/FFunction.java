
public class FFunction extends AbstractDrawFunction{
	@Override
	//Construct f's data type
	double f(double x) { 
		//Return value 5 * Math.cos(x)+ Math.sin(x)
		return 5 * Math.cos(x)+ Math.sin(x);
	}
}
