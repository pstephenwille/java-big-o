package main.java;

public class LeftRotation {

    public int[] rotateLeft(int length, int left) {
        int[] allNumbs = new int[length];
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            allNumbs[i] = i+1;
        }

        for (int l = 0; l < length; l++) {
            result[(l + (length - left)) % length] = allNumbs[l];
        }

        return result;
    }
}
