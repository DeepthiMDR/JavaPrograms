class ArmstrongNumbers {

	int countDigits(int number)
	{
		int count=0;
		while(number>0){
			count++;
			number/=10;
		}
		return count;
	}

	boolean isArmstrongNumber(int numberToCheck) {
		int tempNum=numberToCheck;
		int noOfDigits=countDigits(tempNum);
		int sum=0;
		while(tempNum>0)
		{
			int lastDigit=tempNum%10;
			sum+=Math.pow(lastDigit,noOfDigits);
			tempNum/=10;
		}
		if(sum==numberToCheck)
			return true;
		return false;
	}

}
