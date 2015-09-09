
public class MakLibrary {

	static boolean IsIthBitSet (int N, int i)
	{
		int temp =N & (1 << i);
	    if( temp!=0 )
	        return true;
	    else
	        return false;
	}
	public static int NextPowerOf2(int num)
	{
		num= num|num>>1;
		num= num|num>>2;
		num= num|num>>4;
		num= num|num>>8;
		num= num|num>>16;
		
		
		return num+1;
		
	}
	public static int PrevPowerOf2(int num)
	{
		num= num|num>>1;
		num= num|num>>2;
		num= num|num>>4;
		num= num|num>>8;
		num= num|num>>16;
		
		
		return (num+1)>>1;
		
	}
	
	
	public static int NoOfSetBits(int num)
	{
		int count=0;
		while(num!=0)
		{
			if((num & 1) !=0)
			{
				count++;
			}
			num=num>>1;
		}
		return count;
	}
	public static boolean IsMultipleOf3(int num)
	{
		int odd_count=0;
		int even_count=0;
		if(num<0) num=-1*num;
		if(num==0) return true;
		if(num==1 || num==2) return false; 
		while(num!=0)
		{
			if((num&1)!=0)
			{
				odd_count++;
			}
			num= num>>1;
			if((num&1)!=0)
			{
				even_count++;
			}
			num= num>>1;
		}
		if(MakLibrary.IsMultipleOf3(odd_count-even_count)) return true;
		else return false;
	}
	static boolean IsPowerOfTwo(int num)
	{
		return (num!=0 && (num & (num - 1))==0);	
	}
	
	static void PrintAllSubsets(int set[])
	{
		int total_subsets=(int)Math.pow(2, set.length);
		
		for(int i=0;i<total_subsets;i++)
		{
			for(int j=0;j<set.length;j++)
			{
				if(((i>>j)&1 )!=0)
				{
					System.out.print(set[j]+", ");
				}
			}
			System.out.println();
		}
	}

	static int OnesInBinaryRep(int num)
	{
		int count_of_ones=0;
		while(num!=0)
		{
			num=(num)&(num-1);
			count_of_ones++;
		}
		return count_of_ones;
	}
	
	
	  
}
