
public class Calculator {
	
	public double addition(double a , double b ) 
	{
		double result = a +b;
		return result;
	}
	
	public double subtraction(double a , double b ) 
	{
		double result = a -b;
		return result;
	}
	
	public double multiplication(double a , double b ) 
	{
		double result = a * b;
		return result;
	}
	public double division(double a , double b ) 
	{
		if(b==0) 
		return 0;
		else
		{
		double result = a / b;
		return result;
		}
		
	}
	
}
