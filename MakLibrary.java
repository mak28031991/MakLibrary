
public class MakLibrary {

	static boolean IsIthBitSet (int N, int i)
	{
		int temp =N & (1 << i);
	    if( temp!=0 )
	        return true;
	    else
	        return false;
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
	static long LargestPowerOfTwo(long N)
	{
	    //changing all left side bits to 1.
	    N = N| (N>>1);
	    N = N| (N>>2);
	    N = N| (N>>4);
	    N = N| (N>>8);

	//as now the number is 2 * x-1, where x is required answer, so adding 1 and dividing it by 2.
	 
	            return (N+1)>>1;

	}

	static int count_of_ones=0;
	static int OnesInBinaryRep(int num)
	{
		while(num!=0)
		{
			num=(num)&(num-1);
			count_of_ones++;
		}
		return count_of_ones;
	}
	  
}
