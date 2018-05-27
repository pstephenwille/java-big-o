package main.java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push("(");
        stack.push(")");
        stack.pop();
        stack.pop();
        String res = stack.size()>0?"True":"false";

        System.out.println((char)27 + "[30;43m"+ stack.empty() +(char)27+"[0m");

        /*
         * Regex - group replace */
        String line = "Goodbye bye bye world world world";
        String regex = "\\b(\\w+)(\\W\\1\\b+)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(line);
        while (m.find()) {
//            System.out.println((char)27 + "[30;43m"+ m.group(0) +","+ m.group(1) +(char)27+"[0m");
        }

        /*
         * loop 2 */
//        String loop2 = loop2(0, 2, 10);
//        System.out.println((char) 27 + "[30;43m" + loop2 + (char) 27 + "[0m");

        /*
         * linkedlist: detect cycle */
//        int isCycle = hasCycle(Node);

        /*
         * anagrams */
//       int nonMatchedChars = checkForAnnagram("woot", "woot");
//       System.out.println((char)27 + "[30;43m"+ nonMatchedChars +(char)27+"[0m");



        /*
         * ransom note
         * test word matches*/
        String[] magazineWords = new String[1];
        magazineWords[0] = "woot";
        String[] ransomWords = new String[1];
        ransomWords[0] = "woot";
//        boolean r1 = ransomNote(magazineWords, ransomWords);
//        System.out.println((char) 27 + "[30;43m" + r1 + (char) 27 + "[0m");

//        Test4 test4 = new Test4();


        /*
         * balanced braces */
//        BalancedBraces balancedBraces = new BalancedBraces();
//        String braces = "{{}()[()]}";
//        System.out.println((char)27 + "[30;43m"+ balancedBraces.isBalanced(braces) +(char)27+"[0m");


        /*
         * rotate left */
//        LeftRotation leftRotation = new LeftRotation();
//        int[] result = leftRotation.rotateLeft(5, 4);

//        System.out.println(
//            (char) 27 + "[30;43m" + Arrays.toString(result).replace(",", "").replace("[", "").replace("]", "")
//            + (char) 27 + "[0m");

//        int[] haystack = Stream.iterate(0, (n) -> n + 1).limit(100L).mapToInt((n) -> n).toArray();
//        System.out.println("\u001b[30;43m" + MergeSort.mergeSort(haystack).length + '\u001b' + "[0m");

//        int match = BinarySearch.INSTANCE.findIndex(haystack, 87);
//        System.out.println((char) 27 + "[30;43m" + "binary sarch: " + haystack[match] + (char) 27 + "[0m");

        MyStack<Number> numberStack = new MyStack<>();
        Iterable<Number> integers = Arrays.asList(5.0, 6.0, 9.0);
//        numberStack.pushAll(integers);

//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        double d = sc.nextDouble();
//        String s = sc.nextLine();
//        int padd = String.valueOf(s).length();

        /*
         * left/right padding strings */
//        int x = 1;
//        if (one == 0) {
//        String paddedX = String.format("%03d", x);
//        String trailingX = String.format("%-10s", x);
//        }
//        System.out.println((char) 27 + "[30;43m" + paddedX + (char) 27 + "[0m");
//        System.out.println((char) 27 + "[30;43m" + trailingX + (char) 27 + "[0m");


        /*
         * loops 2*/


        /*
         * java dates */
        // 08 05 2015

        Calendar cal = Calendar.getInstance();
        Date date = new Date(2015, 8, 5);
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String myDay = new SimpleDateFormat("EEEE").format(date);
//        System.out.println((char)27 + "[30;43m"+ myDay +(char)27+"[0m");

        String myDay2 = LocalDate.of(
            2015,
            8,
            5
        ).getDayOfWeek().toString();
//        System.out.println((char) 27 + "[30;43m" + myDay2 + (char) 27 + "[0m");

        /* day of week */
//        System.out.println((char) 27 + "[30;43m" + getDay("2015", "8", "5") + (char) 27 + "[0m");

//        getValueType();


        /*
         * iterator */
        Iterator it = Arrays.asList("a", "b", "###", "c", "d").iterator();
        List<String> myList = new ArrayList<>();
        boolean ok = false;
        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof String) {
                if (ok) {
                    myList.add((String) elem);
                }
            }
            if (elem.toString().matches("###")) {
                ok = true;
            }
        }

//        System.out.println((char) 27 + "[30;43m" + myList + (char) 27 + "[0m");


        /*
         * array loop */
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
//            if (a == 4) { System.out.println((char) 27 + "[30;43m" + "yes" + (char) 27 + "[0m"); }
        }



        /*
         * odd num int[] */
        List<Integer> oddNumbs = new ArrayList<>();
        int[] allOddNumbs = new int[1];

        for (int i = 2; i <= 5; i++) {
            if (i % 2 != 0) {
                oddNumbs.add(i);
            }
        }

        int[] allNums = oddNumbs.stream().mapToInt(i -> i).toArray();
//        System.out.println((char) 27 + "[30;43m" + allNums[0] + (char) 27 + "[0m");

        int a = 5;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (a == 5) {
                    break;
                }
//                System.out.println((char) 27 + "[30;43m" + i * j + (char) 27 + "[0m");
            }
        }

//        String s1 = "woot";
//        String s2 = "xxx";
//        System.out.println((char)27 + "[30;43m"+ s1.concat(s2.toUpperCase()) +(char)27+"[0m");

//        int c = -1;
//        try {
//            c = 4 / 0;
//            System.out.println((char) 27 + "[30;43m" + c + (char) 27 + "[0m");
//
//        } catch (Exception e) {
//            System.out.println((char)27 + "[30;43m"+ e +(char)27+"[0m");
//        }finally {
//            System.out.println((char)27 + "[30;43m"+ "finally" +(char)27+"[0m");
//        }



        /*
         * get Day word */
//    static String getDay(String day, String month, String year) {
//        return LocalDate.of(
//            Integer.parseInt(year),
//            Integer.parseInt(month),
//            Integer.parseInt(day)
//        ).getDayOfWeek().toString();
//    }


        /*
         * get int values */
//    static String getValueType() {
//        int i = Integer.MAX_VALUE;
//        System.out.println((char) 27 + "[30;43m" + Byte.MAX_VALUE + ", " + Byte.MIN_VALUE + (char) 27 + "[0m");
//        return null;
//    }

        List<Integer> myints = Arrays.asList(1, 44, 3);
        Collections.sort(myints);
        int[] ugh = myints.stream().mapToInt(i -> i).toArray();
//        System.out.println((char) 27 + "[30;43m" + ugh[1] + (char) 27 + "[0m");

//
//    List<Integer> allNumbs = new ArrayList<>();
//
//    for(int i = 0; i<a.length; i++){
//        allNumbs.add(a[i]);
//    }
//
//    for(int j=0; j<b.length; j++){
//        allNumbs.add(b[j]);
//    }
//
//    Collections.sort(allNumbs);
//
//    b = allNumbs.stream().mapToInt(i->i).toArray();

        int[] aa = new int[3];
        aa[0] = 1;
        int[] bb = new int[5];
        bb[0] = 4;
        int[] cc = Arrays.copyOf(aa, aa.length + bb.length);
//        System.out.println((char) 27 + "[30;43m" + cc[1] + (char) 27 + "[0m");

    }

    //    @SafeVarargs
    static <T> void printm(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }

//        System.out.println((char) 27 + "[30;43m" + result + (char) 27 + "[0m");
    }

    /*
     * ransomwords 3/3 */
    static boolean ransomNote(String[] s1, String[] s2) {
        HashMap<String, Integer> magazineFrequency = getStringFrequency(s1);
        HashMap<String, Integer> ransomFrequency = getStringFrequency(s2);

        return hasEnoughStrings(magazineFrequency, ransomFrequency);
    }

    /*
     * ransomwords 1/3 */
    static HashMap<String, Integer> getStringFrequency(String[] text) {
        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String word : text) {
            if (!frequencies.containsKey(word)) {
                frequencies.put(word, 0);
            }
            frequencies.put(word, frequencies.get(word) + 1);
        }
        return frequencies;
    }

    /*
     * ransomwords 2/3 */
    static boolean hasEnoughStrings(HashMap<String, Integer> magazineFreq, HashMap<String, Integer> note) {
        for (Map.Entry<String, Integer> entry : note.entrySet()) {
            String word = entry.getKey();

            if (!magazineFreq.containsKey(word) || magazineFreq.get(word) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    static String ransomNote2(String[] magazineWords, String[] ransom) {
        Hashtable<String, Integer> magazine = new Hashtable<>();

        for (String s : magazineWords) {
            if (magazine.containsKey(s)) {
                magazine.put(s, magazine.get(s) + 1);
            } else {
                magazine.put(s, 1);
            }
        }

        for (String s : ransom) {
            if (!magazine.containsKey(s)) {
                return "No";
            }

            int counter = magazine.get(s) - 1;

            if (counter == 0) {
                magazine.remove(s);
            } else {
                magazine.put(s, counter);
            }
        }

        return "Yes";
    }

    static int checkForAnnagram(String s1, String s2) {
        int[] letterCount = new int[26];
        int result = 0;

        for (char c : s1.toCharArray()) {
            letterCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            letterCount[c - 'a']--;
        }

        for (int i : letterCount) {
            result += Math.abs(i);
        }

        return result;
    }

    static boolean hasCycle(Node head) {
        if (head == null) { return false; }

        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) { return false; }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    /*
     * loop 2 (a + 2^i * b) */
    static String loop2(int a, int b, int n) {
        int sum = a;
        String out = "";
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sum += Math.pow(2.0, j) * b;
            out = sb.append(Integer.toString(sum)).append(" ").toString();
        }

        return out;
    }

    public static int lonelyInteger(int[] a) {
        int value = 0;

        for (int i : a) {
            value ^= i;
        }
        return value;
    }

    public static int fibonacci(int n) {
        int[] fib = new int[2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; ++i) {
            fib[i % 2] = fib[0] + fib[1];
        }
        return fib[n % 2];
    }

    /*
     * linkedlist has been visited */
    static class Node {

        int data;
        Node next;
    }

//    static public final class Test4 {
//
//        private boolean flag = true;
//
//
//        public Test4() {
//            (new Inner()).test();
//        }
//
//        public void sample() {
//            System.out.println((char) 27 + "[30;43m" + "sample" + (char) 27 + "[0m");
//        }
//
//        class Inner {
//
//            void test() {
//                if (Test4.this.flag) {
//                    sample();
//                }
//            }
//        }
//
//
//    }




    /*
     * balanced braces */
    // {}[]()
    // {[}]}
}
