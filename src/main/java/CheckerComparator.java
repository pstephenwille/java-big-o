package main.java;

import java.util.Comparator;

public class CheckerComparator implements Comparator<CheckerPlayer> {

    @Override
    public int compare(CheckerPlayer o1, CheckerPlayer o2) {
        if (o1.score == o2.score) {
            int name = o1.name.compareTo(o2.name);
            if (name == 0) {
                return name;
            } else if (name > 0) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return o2.score - o1.score;
        }
    }
}


/*
*         CheckerPlayer p3 = new CheckerPlayer("amy", 100);
        CheckerPlayer p2 = new CheckerPlayer("david", 100);
        CheckerPlayer p4 = new CheckerPlayer("heraldo", 50);
        CheckerPlayer p1 = new CheckerPlayer("aakansah", 75);
        CheckerPlayer p5 = new CheckerPlayer("aleksa", 150);

        CheckerPlayer[] players = new CheckerPlayer[5];
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
        players[4] = p5;

        CheckerComparator checkerComparator = new CheckerComparator();

        Arrays.sort(players, checkerComparator);

        for (CheckerPlayer p : players) {
            System.out.println((char)27 + "[30;43m"+ p.name +(char)27+"[0m");
        }


*/
