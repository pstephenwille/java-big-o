package main.java;

public enum BinarySearch {
    INSTANCE;

    private BinarySearch() {
    }

    public final int findIndex(int[] haystack, int needle) {
        int start = 0;
        int stop = haystack.length;
        int middle;

        for(middle = start + stop >> 1;//divide by 2
            start < stop && haystack[middle] != needle;
            middle = start + stop >> 1)
        {
            stop = needle < haystack[middle] ? middle - 1 : stop;
            start = needle > haystack[middle] ? middle + 1 : start;
        }

        return haystack[middle] == needle ? middle : -1;
    }
}
