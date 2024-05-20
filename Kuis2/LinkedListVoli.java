package Kuis2;

public class LinkedListVoli {
    TeamVoli head;

    void addTeam(String nama) {
        TeamVoli tv = new TeamVoli(nama);
        if (head == null) {
            head = tv;
        } else {
            TeamVoli current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = tv;
        }
    }

    TeamVoli findTeam(String nama) {
        TeamVoli current = head;
        while (current != null) {
            if (current.nama != null && current.nama.equalsIgnoreCase(nama)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void updateMatchResult(TeamVoli team, int setsWon, int setsLost) {
        team.setsWon += setsWon;
        team.setsLost += setsLost;

        if (setsWon == 3 && setsLost == 0) {
            team.point += 3;
            team.win++;
            team.win3_0++;
        } else if (setsWon == 3 && setsLost == 1) {
            team.point += 3;
            team.win++;
            team.win3_1++;
        } else if (setsWon == 3 && setsLost == 2) {
            team.point += 2;
            team.win++;
            team.win3_2++;
        } else if (setsWon == 2 && setsLost == 3) {
            team.point += 1;
            team.lose++;
            team.lose2_3++;
        } else if (setsWon == 1 && setsLost == 3) {
            team.lose++;
            team.lose1_3++;
        } else if (setsWon == 0 && setsLost == 3) {
            team.lose++;
            team.lose0_3++;
        }
    }

    void updateMatch(String team1, int sets1, String team2, int sets2) {
        TeamVoli tv1 = findTeam(team1);
        TeamVoli tv2 = findTeam(team2);
    
        if (tv1 != null && tv2 != null) {
            tv1.match++;
            tv2.match++;
            updateMatchResult(tv1, sets1, sets2);
            updateMatchResult(tv2, sets2, sets1);
        }
    }

    int setDiff(TeamVoli team) {
        return team.setsWon - team.setsLost;
    }

    void swapTeams(TeamVoli t1, TeamVoli t2) {
        String tempName = t1.nama;
        int tempPoints = t1.point;
        int tempSetsWon = t1.setsWon;
        int tempSetsLost = t1.setsLost;
        int tempWin = t1.win;
        int tempLose = t1.lose;
        int tempMatch = t1.match;
        int tempWin3_0 = t1.win3_0;
        int tempWin3_1 = t1.win3_1;
        int tempWin3_2 = t1.win3_2;
        int tempLose0_3 = t1.lose0_3;
        int tempLose1_3 = t1.lose1_3;
        int tempLose2_3 = t1.lose2_3;

        t1.nama = t2.nama;
        t1.point = t2.point;
        t1.setsWon = t2.setsWon;
        t1.setsLost = t2.setsLost;
        t1.win = t2.win;
        t1.lose = t2.lose;
        t1.match = t2.match;
        t1.win3_0 = t2.win3_0;
        t1.win3_1 = t2.win3_1;
        t1.win3_2 = t2.win3_2;
        t1.lose0_3 = t2.lose0_3;
        t1.lose1_3 = t2.lose1_3;
        t1.lose2_3 = t2.lose2_3;

        t2.nama = tempName;
        t2.point = tempPoints;
        t2.setsWon = tempSetsWon;
        t2.setsLost = tempSetsLost;
        t2.win = tempWin;
        t2.lose = tempLose;
        t2.match = tempMatch;
        t2.win3_0 = tempWin3_0;
        t2.win3_1 = tempWin3_1;
        t2.win3_2 = tempWin3_2;
        t2.lose0_3 = tempLose0_3;
        t2.lose1_3 = tempLose1_3;
        t2.lose2_3 = tempLose2_3;
    }

    void sortTeams() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            TeamVoli current = head;
            while (current.next != null) {
                if (current.point < current.next.point ||
                    (current.point == current.next.point && setDiff(current) < setDiff(current.next))) {
                    swapTeams(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    void printStandings() {
        System.out.println("=============================================================================================================");
        System.out.println("\t\t\t\t\t\t\tLIGAPRO VOLI PUTRA 2023");

        System.out.printf("%-4s%-30s%-9s%-7s%-7s%-16s%-11s%-6s%-6s%-6s%-6s%-6s%-6s\n",
                "Pos", "Team", "Points", "Win", "Lose", "TotalMatches", "TotalSets", "3-0", "3-1", "3-2", "0-3", "1-3", "2-3");
        int position = 1;
        TeamVoli current = head;
        while (current != null) {
            int totalSets = current.setsWon + current.setsLost;
            System.out.printf("%-5d%-30s%-9d%-7d%-7d%-16d%-11d%-6d%-6d%-6d%-6d%-6d%-6d\n",
                    position, current.nama, current.point, current.win, current.lose, current.match,
                    totalSets, current.win3_0, current.win3_1, current.win3_2, current.lose0_3, current.lose1_3, current.lose2_3);
            current = current.next;
            position++;
        }
        System.out.println("=============================================================================================================");
    }
}


