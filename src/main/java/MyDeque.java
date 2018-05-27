package main.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class MyDeque {
/*
* 100 45
1091273 1136162 2824530 2734729 2323177 3137151 8629406 6883839 7885320 2044883 4341515 586875
*/


    public static void main(String[] args) {
        int[] nums = {1,1,2, 5, 5, 7, 2, 6};
//        int[] nums = {1091273, 1136162, 2824530, 2734729, 2323177, 3137151, 8629406, 6883839, 7885320, 2044883,
//                      4341515,
//                      586875, 8264254, 1665363, 1341588, 7133211, 4279436, 6467828, 3039965, 4913413, 8109197,
//                      7446288,
//                      933620, 1805313, 1714701, 7657821, 5377047, 4016784, 4026002, 4249989, 4906039, 5186008,
//                      8422951,
//                      4582608, 955808, 5694815, 3404880, 4015801, 5742285, 7341183, 2820457, 9011890, 7683817,
//                      7844258,
//                      9748563, 3093105, 3562574, 3749679, 5188118, 2141802, 769140, 5228806, 17974, 2784429, 1876068,
//                      8789679, 8975251, 3177120, 5085263, 2229733, 9294901, 8985096, 9255638, 1159554, 670064,
//                      2954968,
//                      2965436,
//                      9230520, 3698479, 8245908, 9366888, 3320158, 7199936, 3420401, 2136981, 261436, 9298127,
//                      2590299,
//                      4415993, 4359652, 853882, 9373379, 915520, 7476938, 3048377, 6706061, 8771123, 1377384, 1210133,
//                      4440721, 7401339, 3051752, 6750680, 528148, 2284879, 9291371, 9455156, 5318000, 5120825,
//                      584357};
        int n = nums.length;
        int m = 3;
        int max = Integer.MIN_VALUE;

//        TreeSet map = new TreeSet();
//        String res = "";
//        int size = 0;
//        for (int i = 0; i < (n-m+1); i++) {
//            for(int j = i; j<(m+i); j++) {
//                map.add(nums[j]);
//            }
//            size = map.size();
//            if (size > max) {
//                max = size;
//            }
//            map = new TreeSet();
//        }
//        System.out.println((char)27 + "[30;43m"+ max +(char)27+"[0m");
//    }

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > max) {
                    max = set.size();
                }
                int first = deque.remove();
                boolean isUnique = !deque.contains(first);
                if (isUnique) {
                    /* reduce set size */
                    set.remove(first);
                }
            }
        }

        System.out.println((char)27 + "[30;43m"+ max +(char)27+"[0m");


    }
}
