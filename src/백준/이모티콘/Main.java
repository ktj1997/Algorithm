package 백준.이모티콘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int S;
    public static int MAX = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = Integer.parseInt(br.readLine());

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<Emoticon> queue = new LinkedList<>();
        boolean[][] visit = new boolean[MAX][MAX];

        queue.add(new Emoticon(1, 0, 0));
        visit[1][0] = true;

        int nowScreen = 0, nowBoard = 0, nowTurn = 0;

        Emoticon now;

        while (!queue.isEmpty()) {
            now = queue.poll();

            nowScreen = now.screen;
            nowBoard = now.board;
            nowTurn = now.turn;

            if (nowScreen == S)
                break;

            /**
             * 연산 1
             */
            queue.add(new Emoticon(nowScreen, nowScreen, nowTurn + 1));

            /**
             * 연산 2
             */
            if (nowScreen + nowBoard <= MAX && !visit[nowScreen + nowBoard][nowBoard]) {
                visit[nowScreen + nowBoard][nowBoard] = true;
                queue.add(new Emoticon(nowScreen + nowBoard, nowBoard, nowTurn + 1));
            }

            if (nowScreen - 1 >= 2 && !visit[nowScreen - 1][nowBoard]) {
                visit[nowScreen - 1][nowBoard] = true;
                queue.add(new Emoticon(nowScreen - 1, nowBoard, nowTurn + 1));
            }

        }
        return nowTurn;
    }
}

class Emoticon {
    int screen;
    int board;
    int turn;

    public Emoticon(int screen, int board, int turn) {
        this.screen = screen;
        this.board = board;
        this.turn = turn;
    }
}
