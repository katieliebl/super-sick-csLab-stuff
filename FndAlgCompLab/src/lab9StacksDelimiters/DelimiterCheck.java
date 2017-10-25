package lab9StacksDelimiters;

//import java.io.*;

public class DelimiterCheck {
	
	StackX x = new StackX(100);
	
	public boolean check(String i) throws DelimiterException{
		if((readChars(i))&&(x.isEmpty())) {
			return true;
		}
		return false;
	}
	
	public boolean readChars(String i) throws DelimiterException{
		char k;
		boolean vestigialtHING = false;
		try {
			for(int j = 0; j<i.length()-1; j++) {
				k = i.charAt(j);
				if((k=='(')||(k=='{')||(k=='[')) {
					x.push(k);
				}
				else if((k==')')||(k=='}')||(k==']')) {
					if(x.isEmpty()) {
						throw new DelimiterException("Missing left delimiter error");
					}
					else if(k==x.pop()) {
						vestigialtHING = true;
					}
					else {
						vestigialtHING = false;
						throw new DelimiterException("Mismatched delimiters exception");
					}
				}
			}
		}
		catch(DelimiterException d) {
			System.out.println(d);
			return false;
		}
		return vestigialtHING;
	}

}
