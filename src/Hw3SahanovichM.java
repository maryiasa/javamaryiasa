class Hw3SahanovichM {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5; //2, 5, 7
        int[] nums2 = {1,2,3,1}; //{1,2,3,4}
        System.out.println(searchInsert(nums, target));
        System.out.println(searchDuplicates(nums2));
    }
    public static int searchInsert(int[] nums, int target) {
        int output = 0;
        for(int i = 0, j = nums.length - 1; i < j; i++, j--){
            if(nums[i] == target){
                output = i;
                break;
            } else if (nums[j] == target) {
                output = j;
                break;
            }
            if(nums[i] < target & target < nums[i+1]){
                output = i+1;
                break;
            } else if (nums[j-1] < target & target < nums[j]) {
                output = j-1;
                break;
            } else if (nums[j] < target) {
                output = j+1;
                break;
            }
        }
        return output;
    }
    public static boolean searchDuplicates(int[] nums2) {
        boolean output = false;
        for(int i = 0; i < nums2.length - 1; i++){
            for(int j = i+1; j < nums2.length; j++){
                if(nums2[i] == nums2[j]){
                    output = true;
                    break;
                }
            }
        }
        return output;
    }
}