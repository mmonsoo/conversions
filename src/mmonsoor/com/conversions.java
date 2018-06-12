package mmonsoor.com;

public class conversions {
	
	public static void main(String[] args) {
		byte b1=10,b2=20;
		short p=200;
		int n=500;
		long q=100;
		float x=2.5f;
		double y=5.25;
		
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le byte ",b1+b2));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le short ",p+b1));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le short ",b1*b2));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le long ",q+p*(b1+b2)));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le float ",x+q*n));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le float ",b1*q/x));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le float ",b1*q*2./x));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le ",b1*q*2.f/x));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le ",2000000000*q));
		System.out.println(String.format("Le Résultat de b1+b2 est %s et et le type du résultat est le ",2000000000*p));
		
		
				
		
	}

}
