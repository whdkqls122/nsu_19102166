package challenge_05;

public class Programming09 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java MineSweeper m n p");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        char[][] mines = generateMines(m, n, p);
        char[][] board = generateBoard(mines);

        printBoard(mines);
        System.out.println();
        printBoard(board);
    }

    public static char[][] generateMines(int m, int n, double p) {
        char[][] mines = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mines[i][j] = (Math.random() < p) ? '*' : '-';
            }
        }
        return mines;
    }
    
    public static char[][] generateBoard(char[][] mines) {
        int m = mines.length;
        int n = mines[0].length;
        char[][] board = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j] == '*') {
                    board[i][j] = '*';
                } else {
                    int count = countNeighborMines(mines, i, j);
                    board[i][j] = (char) (count + '0');
                }
            }
        }
        return board;
    }

    public static int countNeighborMines(char[][] mines, int x, int y) {
        int count = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < mines.length && ny >= 0 && ny < mines[0].length && mines[nx][ny] == '*') {
                count++;
            }
        }
        return count;
    }

    
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}