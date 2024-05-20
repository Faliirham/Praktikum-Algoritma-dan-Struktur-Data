package Kuis2;

public class TeamVoli {
    String nama;
    int point;
    int setsWon;
    int setsLost;
    int win;
    int lose;
    int match;
    int win3_0;
    int win3_1;
    int win3_2;
    int lose0_3;
    int lose1_3;
    int lose2_3;
    TeamVoli next;

    public TeamVoli(String nama) {
        this.nama = nama;
        this.point = 0;
        this.setsWon = 0;
        this.setsLost = 0;
        this.win = 0;
        this.lose = 0;
        this.match = 0;
        this.win3_0 = 0;
        this.win3_1 = 0;
        this.win3_2 = 0;
        this.lose0_3 = 0;
        this.lose1_3 = 0;
        this.lose = 0;
    }
}