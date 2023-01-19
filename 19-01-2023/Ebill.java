class Ebill
{
	public static void main(String[] args)
	{
		int U = 196;
		int Units=U;
		int bill;

		if(U<=100)
		{
			bill=(U*10);
		}
		else if(U>100 && U<=200)
		{
			U=(U-100);	
			bill=((100*10)+(U*15));	
		}
		else if(U>200 && U<=300)
		{
			U=(U-200);	
			bill=((100*10)+(100*15)+(U*20));	
		}
		else
		{
			U=(U-300);	
			bill=((100*10)+(100*15)+(100*20)+(U*25));
		}
		System.out.println("Your Total Bill for "+Units+" Units is "+ bill + "Thank You");
	}
}