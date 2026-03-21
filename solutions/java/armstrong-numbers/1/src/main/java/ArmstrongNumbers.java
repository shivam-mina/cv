import java.util.List;
import java.util.ArrayList;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int input) {
        Integer x=input;
        List<Integer> arr=new ArrayList<>();
        while(x%10!=0) // fails for numbers like 100 , 105
        {
            arr.add(x%10);
            System.out.println(x%10);
            x=x/10;
        }
        int size=arr.size();
        int sum=0;

        for(Integer a : arr){
            sum+=Math.pow(a,size);
        }

        return sum==input;

    }

}
