
public class Examples {
	
	
	public void calculateExample1()
	{
		boolean x[] = {true, true, false, false};
		boolean y[] = {true, false, true, false};
		boolean z[] = {true, false, true, false};
		
		boolean opRes1[] = new boolean[4];
		boolean opRes2[] = new boolean[4];
		
		System.out.println("�����ֲ� 1");
		for(int i = 0; i < 4; i++)
		{
			System.out.println( "x:" + x[i] + " " +"y:" + y[i] + " " + "z:" + z[i]);
			
			
			if(x[i] || y[i] || z[i] == true)
			{
				opRes1[i] = true;
			}
			else
				opRes1[i] = false;
			System.out.println("�������� 1 ��� ���� �������������: " + opRes1[i]  + System.lineSeparator());

			
		}
		String endResult = "";
		
		System.out.println("�����ֲ� 2");
		for(int i = 0; i < 4; i++)
		{
			System.out.println( "x:" + !x[i] + " " +"y:" + !y[i] + " " + "z:" + !z[i]);
			
			
			if(!x[i] || !y[i] || !z[i] == true)
			{
				opRes2[i] = true;
			}
			else
				opRes2[i] = false;
			System.out.println("�������� 2 ��� ���� �������������: " + opRes1[i]);
			
			
			
			
			for(int j = 0; j < 4; j++)
			{
				if(opRes1[j] == true && opRes2[j] == false)
				{
					endResult = "ʳ������ ��������� ��� ���� �������������: �������" + System.lineSeparator();
					
				}
				else 
				{
					endResult = "ʳ������ ��������� ��� ���� �������������: ������" + System.lineSeparator();
					
				}
				
			}
			System.out.println(endResult);
		} 	
	}
	
	
			public void calculateExample2()
			{
				  
			}
}
