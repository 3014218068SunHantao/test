package test;
public class hello {
	public String triangle(int a, int b,int c){
		if(a==b&&b==c)
			return "equilateral triangel!";
		else if((a==b&&c<a+b)||(b==c&&a<b+c)||(a==c&&b<a+c))
			return "isosceles triangel!";
		else if(c<a+b&&a<b+c&&b<a+c&&c>trueminus(a,b)&&a>trueminus(b,c)&&b>trueminus(a,c))
			return "scalene triangel!";
		else
			return "illegal triangel!";
	}
	public int trueminus(int x,int y)
	{
		if(x>y)
			return x-y;
		else
			return y-x;
	}
}
