interface MyMath									// ﹚竡MyMathざ 
{
    default int addEven(int... nums) {				// ﹚竡defaultよ猭
        return add(true, nums);						// 案计猭笲衡
    }
    default int addOdd(int... nums) {				// ﹚竡defaultよ猭
        return add(false, nums);					// 计猭笲衡
    }
    private int add(boolean flag, int... nums) {	// ﹚竡privateよ猭
		int sumodd, sumeven;						// ﹚竡计羆㎝案计羆
		sumodd = sumeven = 0;						// 程て羆					
        for ( int num:nums ) {						// 筂菌皚
			if ((num % 2) == 1 )					// true玥琌计
				sumodd += num;						// 计羆
			else
				sumeven += num;						// 案计羆
		}
		if (flag) 									// 狦true
			return sumeven;							// 肚案计羆			
		else
			return sumodd;							// 肚计羆
    }
}
public class ch17_8 implements MyMath {
    public static void main(String[] args) {
        MyMath obj = new ch17_8();         
        int evenSum = obj.addEven(1,2,3,4,5,6,7,8,9,10);	// 磅︽羆案计
        System.out.println(evenSum);         
        int oddSum = obj.addOdd(1,2,3,4,5,6,7,8,9,10);		// 磅︽羆计
        System.out.println(oddSum);
    }
}



