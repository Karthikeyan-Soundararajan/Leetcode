package Aug_2023.aug30;

public class NonDecreasingArray {

    public long minimumReplacement(int[] nums) {
        var minReplacements = 0;
        var preValue = nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i] > preValue){
                if(nums[i]%preValue == 0) {
                    minReplacements += (nums[i] / preValue)-1;
                }else{
                   minReplacements += (nums[i] / preValue);
                   preValue = calculateCurrentValue(preValue,preValue + nums[i]%preValue);
                }
            }else {
                preValue = nums[i];
            }
        }
        return minReplacements;
    }

    private int calculateCurrentValue(int preValue, int i) {
        var temp = 0;
        for (int j = preValue; j > 0; j--) {
            var reminder  = i - j;
            if(reminder>=j){
                temp = j;
                break;
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        System.out.println(nonDecreasingArray.minimumReplacement(new int[]{295,112,121,234,335,256,303,328,242,260,346,22,277,179,223}));
        System.out.println("************************************************");
        System.out.println(nonDecreasingArray.minimumReplacementWithSoultion(new int[]{295,112,121,234,335,256,303,328,242,260,346,22,277,179,223}));
//        System.out.println(nonDecreasingArray.minimumReplacement(new int[]{7,6,15,6,11,14,10}));
    }
    private long minimumReplacementWithSoultion(int[] nums) {
        long answer = 0;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            }
            long numElements = (long)(nums[i] + nums[i + 1] - 1) / (long)nums[i + 1];
            answer += numElements - 1;
            nums[i] = nums[i] / (int)numElements;
            System.out.println(answer+" "+nums[i]);
        }
        return answer;
    }
}
