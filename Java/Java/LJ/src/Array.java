//数组合并
public class Array {
    public static void main(String[] args) {

        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};


        int[] a = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            a[i] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {
            a[a1.length+i] = a2[i];
        }

        //打印
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "👉");
        }

        System.out.println();
        /////////////////////////////////////
        System.out.println();

        int[] nums1 = new int[5];
        int[] nums2 = {4,5,6,7,8};

        nums1[0]=1;
        int[] nums = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++){
            if(nums1[i]!=0){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j]==0){
                        nums[j] = nums1[i];
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < nums2.length; i++){
            if(nums2[i]!=0){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j]==0){
                        nums[j] = nums2[i];
                        break;
                    }
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"1️⃣");
        }

    }
}
