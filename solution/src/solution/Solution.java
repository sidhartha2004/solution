package solution;

//========== User's Code Starts Here ==========

class Solution {
  public String toHex(int num) {
      
      int rem;  
   String hex="";   
   char hexchars[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};  
  while(num>0)  
   {  
     rem=num%16;   
     hex=hexchars[rem]+hex;   
     num=num/16;  
   }  
  return hex;  
      
  }
}