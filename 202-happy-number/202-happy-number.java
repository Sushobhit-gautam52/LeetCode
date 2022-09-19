class Solution {
	public boolean isHappy(int n) {
	   if (n<7 && n>1)  return false;
		int sum = 0;
		
		if (n == 1) 
            return true;           
		while (n > 0) {
			int digit = n % 10;              
			sum = sum + (digit * digit);    
			n = n / 10;                     
		}
		
		return isHappy(sum);    
	}

}