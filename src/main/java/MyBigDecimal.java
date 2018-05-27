package main.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MyBigDecimal {

    String[] arrA = {
        "-100",
        "50",
        "0",
        "56.6",
        "90",
        "0.12",
        ".12",
        "02.34",
        "000.000"};

    List<String> listA = Arrays.asList(
        "-100",
        "50",
        "0",
        "56.6",
        "90",
        "0.12",
        ".12",
        "02.34",
        "000.000");

    MyBigDecimal() {

//      List<String> sortedDs =  list.stream().sorted(new Comparator<String>() {
//            @Override public int compare(String o1, String o2) {
//                BigDecimal d1 = new BigDecimal(o1);
//                BigDecimal d2 = new BigDecimal(o2);
//                return d2.compareTo(d1);
//            }
//        }).collect(Collectors.toList());

        Arrays.sort(arrA, 0, arrA.length, (o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1)));
        System.out.println((char) 27 + "[30;43m" + Arrays.toString(arrA) + (char) 27 + "[0m");
    }


    public static void main(String[] args) {
        new MyBigDecimal();
    }
}
