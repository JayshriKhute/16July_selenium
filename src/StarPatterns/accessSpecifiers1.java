package StarPatterns;

 class accessSpecifiers1 extends abcd
{
	private int a=12;
	accessSpecifiers1()
	{
		super();
	}
	accessSpecifiers1(String s1)
	{
		this();
		System.out.println("I am a base class constructor.");
		System.out.println("Hello "+s1);
	}
  
    public static void main(String args[])
    {
    	accessSpecifiers1 s1=new accessSpecifiers1("Jayshree");
    	System.out.println(s1.y);
    	System.out.println(s1.z);
    	System.out.println(s1.w);
    	int nadd=s1.add(10,15);
    	System.out.println(nadd);
    	System.out.println(s1.add(34.54f, 56.87f));

    }
}
