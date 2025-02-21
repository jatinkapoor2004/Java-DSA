package Arrays;

import java.util.*;

public class leetcode_1679_max_number_of_k_sum_pairs {

    public static void main(String[] args) {
        int a[] = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        System.out.println(Arrays.toString(a));
        System.out.println(maxOperations(a, 2));
    }
    public static int maxOperations(int[] a, int k) {
    int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    // Populate the HashMap with frequencies
    for (int i = 0; i < a.length; i++) {
        hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
    }
    
    // Iterate through the array to find pairs
    for (int i = 0; i < a.length; i++) {
        int num1 = a[i];
        int target = k - num1;
        
        // Check if the pair can be formed
        if (hm.containsKey(num1) && hm.containsKey(target)) {
            if ((num1 != target && hm.get(num1) > 0 && hm.get(target) > 0) ||
                (num1 == target && hm.get(num1) > 1)) {
                count++;
                hm.put(num1, hm.get(num1) - 1);
                hm.put(target, hm.get(target) - 1);

                // Remove the elements from the map if their count becomes zero
                 if (hm.get(num1) != null && hm.get(num1) == 0) {
                    hm.remove(num1);
                }
                if (hm.get(target) != null && hm.get(target) == 0) {
                    hm.remove(target);
                }
            }
        }
    }
    return count;
}

//    public static int maxOperations(int[] a, int k) {
//        int count = 0;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if (hm.containsKey(a[i])) {
//                int val = hm.get(a[i]);
//                val++;
//                hm.put(a[i], val);
//            } else {
//                hm.put(a[i], 1);
//            }
//        }
//        //System.out.println(hm);
//        for (int i = 0; i < a.length; i++) 
//        {
//            int num1 = a[i];
//            int target = k - num1;
//            //System.out.println("num is " + num1 + " ans target is " + (k - num1));
//            
//            if (hm.containsKey(num1) && hm.containsKey(target)) 
//            {
//                if ((num1 != target && hm.get(num1) > 0 && hm.get(target) > 0) ||
//                (num1 == target && hm.get(num1) > 1)) {
//                count++;
//                hm.put(num1, hm.get(num1) - 1);
//                hm.put(target, hm.get(target) - 1);
//
//                if (hm.get(num1) == 0) 
//                {
//                    hm.remove(num1);
//                }
//                if (hm.get(target) == 0) 
//                {
//                    hm.remove(target);
//                }
//            }
//                
//            }
//        }
//        return count;
//    }
}
