package total;

public class typecasting {

	public static void main(String[] args) {
byte i = 127;
int m = i; // Widening casting is automatically done 
double d = i;
float f = (float) 11.4;
int k = (int) f; // Narrowing casting is done by manual 
char c = (char) f; // float in to char 
System.out.println("byte : "+i);
System.out.println("byte to int : "+m);// after Widening casting byte is converted in to int 
System.out.println("byte to double : "+d); // byte to double 
System.out.println("float : "+f);
System.out.println("float to int : "+k);// after Narrowing casting float is converted in to int 
System.out.println( +c); // float  to char
	}

}
