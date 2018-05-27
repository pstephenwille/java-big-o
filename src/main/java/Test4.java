package main.java;

public final class Test4 {

    class Inner {

        void test() {
            if (Test4.this.flag) {
                sample();
            }
        }
    }


    private boolean flag = true;

    public void sample() {
        System.out.println((char) 27 + "[30;43m" + "sample" + (char) 27 + "[0m");
    }

    public Test4() {
        (new Inner()).test();
    }

    public static void main(String args[]) {
        new Test4();
    }

}
