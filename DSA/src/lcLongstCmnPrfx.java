
public class lcLongstCmnPrfx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strary = {"reflower","flow","flight"};
		System.out.println(longestCommonPrefix(strary));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        int aryPointer,
        aryPivot = 0;
        
        String fprfx ="";
        
        if(strs.length==1)
            return strs[0];
                
        while(aryPivot<strs.length-1)
        {
        	
        	aryPointer=aryPivot+1;
        	char[] chary = strs[aryPivot].toCharArray();
            while(aryPointer<strs.length)
            {
            	var prfx ="";
            	int strPointer = 0;
                while(strPointer<strs[aryPivot].length() &&
                     strPointer<strs[aryPointer].length())
                {
                    if(strs[aryPivot].charAt(strPointer)==strs[aryPointer].charAt(strPointer))
                        prfx=prfx+strs[aryPivot].charAt(strPointer);
                    else
                        break;
                    strPointer++;
                }
                aryPointer++;
                if(fprfx.length()<prfx.length())
                {
                    fprfx=prfx;
                }
                else if(fprfx.startsWith(prfx))
                {
                    fprfx=prfx;
                }
            }
            
            
            
            aryPivot++;
        }
        if(fprfx =="")
            return "";
        else
            return fprfx;
    }
	

}
