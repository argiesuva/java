class pracfor {
	public static void main(String args[])
	{
		for (int i=5 ; i<=8 ; i++) {
			System.out.println(i);
		}
		
		int [] hai = new int[10];
		hai[0] = 0;
		hai[1] = 10;
		hai[2] = 100;
		System.out.println(hai[0]+","+hai[1]+","+hai[2]);
		
		for (int i=0 ; i<=9 ; i++) {
			hai[i] = i*2;
		}
		for (int i=0 ; i<=9 ; i++) {
			System.out.println(hai[i]);
		}
	}
}

