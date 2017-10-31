package lab5palindromes;

public class LargestNum {
	
	PalindromeChecker p = new PalindromeChecker();
	public String theBiggestPal = "";
	
	
	//I didn't use recursion because I didn't really want to or see how it could've been more efficient
	//than an iterative solution. 
	public String largest() {
		
		//I only went from 9000 to 10000 because I assumed the products were within that range and I wanted
		//to make it more efficient since this is such a specific situation.
		for(int i = 9000; i<10000; i++) {
			for(int j = 9000; j<10000; j++) {
				String uh = intToString(i*j);
				if(p.isAPalindrome(uh)) {
					theBiggestPal = uh;
				}
			}
		}
		return theBiggestPal;
	}
	
	public String intToString(int x) {
		int a, b, c, d;
		a = x/1000;
		b = (x-(a*1000))/100;
		c = ((x-(a*1000))-(b*100))/10;
		d = ((x-(a*1000))-(b*100)-(c*10));
		
		return a + "" + b + c + d;
	}

}
