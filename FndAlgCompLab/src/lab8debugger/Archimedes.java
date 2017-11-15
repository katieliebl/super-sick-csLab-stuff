package lab8debugger;

public class Archimedes
{
	private static double d;
	private static double estimate;
	
	public static double approximatePi(int numSides) {
		d = 2 * Math.PI / numSides / 2;  // 2*Math.PI is 360 degrees.
		estimate = numSides * Math.sin(d);
		return estimate;
	}

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
			System.out.println(i + "   " + approximatePi(i));
		}
		
	}
}