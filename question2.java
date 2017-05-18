class question2
{
	public static void main(String [] args)
	{
		int input = 15;
		
		int test = runTest(input);
		
		System.out.println(test);
		
	}
	
	public static int runTest(int input)
	{
		int [] allNumbers = new int [input];
		int count = 0;
		
		for(int i = 0 ; i < allNumbers.length ; i++)
		{
			allNumbers[i] = i+1;
		}
		
		for(int i = 0; i < allNumbers.length ; i++)
		{
			if(allNumbers[i] % 3 == 0 || allNumbers[i] % 5 == 0)
			{
				count++;
			}
			if(allNumbers[i] % 3 == 0 && allNumbers[i] % 5 == 0)
			{
				count--;
			}
		}
		return input-count;
	}
}