package tictactoe;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int cunterX = 0;
    static int cunterO = 0;
    static int n = 3;
    static String[][] ticta = new String[n][n];
    static int cordinates1 = 0;

    static int errors(String number) {
        try  {
            cordinates1 = parseInt(number);

        }catch(NumberFormatException e) {
            return 0;
        }
        return cordinates1;
    }

    static void matrix (String cell ,int row  ,int column ){

        System.out.println("---------");
        if (cell.equals( " ")) {
            for ( row = 0; row < n; row++) {
                for (column = 0; column < ticta[row].length; column++) {
                    ticta[row][column] = cell;
                }
            }
        } else {
            ticta[row][column] = cell;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("| ");
            for (int j = 0; j < ticta[i].length; j++) {
                System.out.print(ticta[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    public static boolean win() {
        int p = 0;
        int cX = 0;
        int cO = 0;
        String cha = "X";
        boolean win = false;
        boolean possi = false;
        boolean possix = false;
        boolean possio = false;

            //FOR ROW
            for (int i = 0; i < n; i++) {
                cunterO = 0;
                cunterX = 0;
                for (int j = 0; j < n; j++) {
                    if (ticta[i][j].equals("X")) {
                        cunterX++;
                    } else if (ticta[i][j].equals("O")) {
                        cunterO++;
                    } else if (ticta[i][j].equals(" ")) {
                        p++;
                    }
                    if (cunterX == 3) {
                        win = true;
                        System.out.println("X wins");
                    } else if (cunterO == 3) {
                        win = true;
                        System.out.println("O wins");
                    }
                }
            }
            cunterO = 0;
            cunterX = 0;
            int cunteX = 0;
            int cunteO = 0;
            int cX1 = 0;
            int cO1 = 0;
            // for clumn
            for (int i = 0; i < n; i++) {
                if (cunterO == 3 || cunterX == 3) {
                    cunterO = 0;
                    cunterX = 0;
                }
                for (int j = 0; j < ticta[i].length; j++) {
                    if (ticta[j][i].equals("X")) {
                        cunterX++;
                    } else if (ticta[j][i].equals("O")) {
                        cunterO++;
                    } else if (ticta[j][i].equals(" ")) {
                        p++;
                    }
                }
            }

            cunteO = 0;
            cunteX = 0;
            cunterO = 0;
            cunterX = 0;
            // for clumn
            for (int i = 0; i < n; i++) {
                cunteO = 0;
                cunteX = 0;

                for (int j = 0; j < ticta[i].length; j++) {
                    if (ticta[j][i].equals("X")) {
                        cunteX++;
                    } else if (ticta[j][i].equals("O")) {
                        cunteO++;
                    } else if (ticta[j][i].equals(" ")) {
                        p++;
                    }
                }
                if (cunteX == 3) {
                    win = true;
                    System.out.println("X wins");
                    break;
                } else if (cunteO == 3) {
                    win = true;
                    System.out.println("O wins");
                    break;
                }
            }

            cunterO = 0;
            cunterX = 0;
            for (int i = 0; i < n; i++) {

                if (ticta[i][i].equals("X")) {
                    cunterX++;
                } else if (ticta[i][i].equals("O")) {
                    cunterO++;
                } else if (ticta[i][i].equals(" ")) {
                    p++;
                }
            }
            if (cunterX == 3) {
                win = true;
                System.out.println("X wins");
            } else if (cunterO == 3) {
                win = true;
                System.out.println("O wins");

            } else {
                cunterO = 0;
                cunterX = 0;
                for (int i = 0; i < n; i++) {

                    if (ticta[i][n - 1 - i].equals("X")) {
                        cunterX++;
                    } else if (ticta[i][n - 1 - i].equals("O")) {
                        cunterO++;
                    } else if (ticta[i][n - 1 - i].equals(" ")) {
                        p++;
                    }
                    if (cunterX == 3) {
                        win = true;
                        System.out.println("X wins");

                    } else if (cunterO == 3) {
                        win = true;
                        System.out.println("O wins");

                    }
                }
            }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (ticta[i][j].equals("X")) {
                    cX++;
                } else if (ticta[i][j].equals("O")) {
                    cO++;
                } else if (ticta[i][j].equals("_")) {
                    p++;
                }
            }
        }
        if (cX >= 3 && cO >= 3 && p == 0) {
            win = true;
            System.out.println("Draw");
        }
        //System.out.println(win);
        return win;
    }

    int row;
    int column ;
    public int[] rowColunm(){

        System.out.print("Enter the coordinates: ");
        column = errors(sc.next());
        row = errors(sc.next());
        while (column == 0 && row == 0) {
            System.out.println("You should enter numbers! ");
            System.out.print("Enter the coordinates: ");

            column = errors(sc.next());
            row = errors(sc.next());
        }

        while (column > 3 || row > 3) {

            System.out.println("Coordinates should be from 1 to 3!");
            System.out.print("Enter the coordinates: ");

            column = errors(sc.next());
            row = errors(sc.next());
        }

        int[] cell = new int[2];
        cell[1] = row;
        cell[0] = column;
        return cell;
    }

    public static void main(String[] args) {
        int p = 0;
        int newi;
        int newj;
        int cX = 0;
        int cO = 0;
        String cha = "X";
        boolean win = false;
        boolean possi = false;
        boolean possix = false;
        boolean possio = false;
        Main m = new Main();


        matrix(" ", 0, 0);


        m.rowColunm();
        //System.out.println(m.row + "1 " + m.column);
        newi = abs(m.row - 3);
        newj = abs(m.column - 1);
       // System.out.println(newi + " " + newj);
        outer:
        //Objects.equals(ticta[newi][newj], " ")
        while (Objects.equals(ticta[newi][newj], " ") || !win()) {

            if (cha == "X") {
                matrix("X", newi, newj);
                //System.out.println(newi + " " + newj);
                //System.out.println(m.row + " 2 " + m.column);
                cunterX++;
                cha = "O";

            } else {
                matrix("O", newi, newj);
                //System.out.println(newi + " " + newj);
                //System.out.println(m.row + "3 " + m.column);
                cunterO++;
                cha = "X";
            }
            if (win()) {

                break outer;
            } else {
                m.rowColunm();
                newi = abs(m.row - 3);
                newj = abs(m.column - 1);
            }

             while (!Objects.equals(ticta[newi][newj], " ")) {

                System.out.println("This cell is occupied! Choose another one!");
                 m.rowColunm();
                 newi = abs(m.row - 3);
                 newj = abs(m.column - 1);
            }
        }
    }
}


