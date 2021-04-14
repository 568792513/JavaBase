package draft;

public class YangHuiTriangle {
    public static void main(String[] args) {

        int[][] yht = new int[37][37];
        int row = 0;

        for (int i = 0; i < 37; i++) {

            for (int j = 0; j < row+1; j++) {

                yht[i][0] = 1;
                if (row >= 1) {
                    yht[i][row] = 1;
                }
                if (row >= 2 && j >=1) {
                    yht[i][j] = yht[i-1][j-1] + yht[i-1][j];
                }
            }
            row ++;
        }

        for (int i = 0; i < 37; i++) {
            for (int j = 0; j < 37; j++) {
                System.out.print(yht[i][j] + " ");
            }
            System.out.println();
        }

    }
}

