
public class lc2sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nu = {1,9,23,2,5,4,6,60};
		int tar = 9;
		int[] ar = twoSum(nu, tar);
		for(int i:ar)
			System.out.println(i);
		
	}

	public static int[] twoSum(int[] nums, int target) {
        //take 2 pointer one right and one left 
        //if index val is less than target fill the pointer
        //if both pointer have value sum up to check if match
        //repeat
        /*int lp=0;
        int rp=nums.length-1;
        int firstVal =0, secVal=0;
        //System.out.println(lp+" "+rp);
        //System.out.println(nums[lp]);
        //System.out.println(nums[rp]);
        if(rp<=1 && nums[rp]==target)
        {   
            int[] pos = {lp,rp};
            return pos;
        }
        
        while(lp!=rp)
        {
            if(nums[lp]<=target)
            {
                firstVal = nums[lp];
            }else
                lp++;
            
            if(nums[rp]<=target)
            {
                secVal = nums[rp];
            }else
                rp--; 
            if (firstVal+secVal==target)
            {
                int[] pos = {lp,rp};
                return pos;
            }
        }
        
        if(lp==rp && nums[lp]==target)
        {
            int[] pos = {lp,rp};
            return pos;
        }
        */
        int pivot = 0;
                
        while(pivot!=nums.length)
        {
        	int itr = 1;
        	while(itr!=nums.length)
        	{
        		if (pivot==itr && nums[itr]==target)
        		{
        			int[] pos = {pivot,itr};
                    return pos;
        		}
        		if(nums[pivot]+nums[itr]==target)
        		{
        			int[] pos = {pivot,itr};
                    return pos;
        		}
        		itr++;
        	}
        	pivot++;
        }
        
        return null;
    }
}
