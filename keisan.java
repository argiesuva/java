class keisan {
	public static void main(String args[])
	{
    	// “ü—ÍF‚Q‚Â‚Ì”’l‚ğ“ü—Í
    	int in0 = new java.util.Scanner(System.in).nextInt();
    	int in1 = new java.util.Scanner(System.in).nextInt();
    	System.out.println(in0+","+in1);
    	
    	// ˆ—F‘«‚µZ
    	int add = in0+in1;
    	// ˆ—Fˆø‚«Z
    	int sub = in0-in1;
    	// ˆ—FŠ|‚¯Z
    	int a = in0*in1;
    	// ˆ—FŠ„‚èZ
    	int b = in0/in1;
    	// ˆ—F—]‚è
    	int c = in0%in1;
    	
    	// ŒvZŒ‹‰Ê‚ğo—Í
    	System.out.println("‘«‚µZF"+add);
    	System.out.println("ˆø‚«ZF"+sub);
    	System.out.println("Š|‚¯ZF"+a);
    	System.out.println("Š„‚èZ:"+b);
    	System.out.println("—]‚è:"+c);
	}
}

