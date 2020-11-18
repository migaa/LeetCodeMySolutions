public class App {
    public static void main(String[] args) throws Exception {
        int[] nums={12,12};
        int target = 24;
        TwoSum twoSum = new TwoSum();
        int[] retNum = twoSum.twoSum(nums,target);
        
        System.out.println("Hello, World! "+retNum[0]);
        
    }

    
}
