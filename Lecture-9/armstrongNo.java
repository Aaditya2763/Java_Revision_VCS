
public class armstrongNo{

	public static void main(String[] args) {
	
		
      armstrongNo(10,1000);

	}
	
	public static void armstrongNo(int low,int high){
	
	 for(int i=low ; i<=high ;i++){
		 if(isArmstrong(i)){
			System.out.println(i);
		 }
	 }
	 }
	 
	 public static int totalDigit(int num){
		 int count=0;
		 while(num!=0){
			 count++;
			 num=num/10; //It gives quotient in java 
			 
			 //% opertor gives remainder in java
		 }
		 return count;
	
	}
	 
	 public static boolean isArmstrong(int num){
		 int sum=0;
		 int power=totalDigit(num);
		 int in=num;//because in while condition num ==0;ans the value of sum is always >0;;
		 
		 while(num!=0){
			 int rem=num%10;
			 sum=sum+(int)Math.pow(rem,power);
					 num=num/10;
					 
		 }
		 if(sum==in){
			 return true; 
		 }
		 else{
			 return false;
		 }
	 }

}
