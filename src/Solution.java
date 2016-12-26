/**
 * Created by wangmian on 16/12/21.
 */
import java.util.Arrays;
public class Solution {
    public static int[] twoSum(int[] nums,int target){
        int[] number = nums.clone();
        int size = number.length;
        Arrays.sort(number);
        int[] answers = new int[2] ;
        for(int i = 0; i < size;i++)
        {
            if(Arrays.binarySearch(number,target - number[i]) > 0)
            {
                int index1 = 0,index2 = 0,j,count = 0;
                for(j = 0;j <size ;j++)
                {
                    if(nums[j] == number[i] || nums[j] == target - number[i])
                    {
                        count++;
                        if(count == 2)
                        {
                            index2 = j;
                            answers[0] = index1<index2?index1:index2;
                            answers[1] = index1>index2?index1:index2;
                        }
                        else
                        {
                            index1 = j;
                        }
                    }
                }

            }

        }
        return answers;
    }
    public static void main(String[] args)
    {
        int[] test = {2,7,11,15};
        int[] result = {0,0};
        result = twoSum(test,26);
        System.out.println(result[0]+","+result[1]);
    }
}
