import java.util.Scanner;
public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Battleship!");
        System.out.println();
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
        boolean bool = false;
        int p1ship1R, p1ship1C, p1ship2R, p1ship2C, p1ship3R, p1ship3C, p1ship4R, p1ship4C, p1ship5R, p1ship5C;
        int p2ship1R, p2ship1C, p2ship2R, p2ship2C, p2ship3R, p2ship3C, p2ship4R, p2ship4C, p2ship5R, p2ship5C;
        // int p1shootR, p1shootC, p2shootR, p2shootC;
        char[][] player1Array = new char[5][5];
        char[][] player2Array = new char[5][5];
        char[][] player1History = new char[5][5];
        char[][] player2History = new char[5][5];
        do {
            bool = false;
            System.out.println("Enter ship 1 location:");
            p1ship1R = input.nextInt();
            p1ship1C = input.nextInt();
            bool = coordinatesValidCheck(p1ship1R, p1ship1C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 2 location:");
            p1ship2R = input.nextInt();
            p1ship2C = input.nextInt();
            bool = coordinatesValidCheck(p1ship2R, p1ship2C, bool);
            bool = ship2EqualsOthersCheck(p1ship1R, p1ship1C, p1ship2R, p1ship2C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 3 location:");
            p1ship3R = input.nextInt();
            p1ship3C = input.nextInt();
            bool = coordinatesValidCheck(p1ship3R, p1ship3C, bool);
            bool = ship3EqualsOthersCheck(p1ship1R, p1ship1C, p1ship2R, p1ship2C, p1ship3R, p1ship3C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 4 location:");
            p1ship4R = input.nextInt();
            p1ship4C = input.nextInt();
            bool = coordinatesValidCheck(p1ship4R, p1ship4C, bool);
            if (((p1ship1R == p1ship4R) && (p1ship1C == p1ship4C))
                    || ((p1ship2R == p1ship4R) && (p1ship2C == p1ship4C))
                    || ((p1ship3R == p1ship4R) && (p1ship3C == p1ship4C))) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                bool = true;
            }
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 5 location:");
            p1ship5R = input.nextInt();
            p1ship5C = input.nextInt();
            bool = coordinatesValidCheck(p1ship5R, p1ship5C, bool);
            if (((p1ship1R == p1ship5R) && (p1ship1C == p1ship5C))
                    || ((p1ship2R == p1ship5R) && (p1ship2C == p1ship5C))
                    || ((p1ship3R == p1ship5R) && (p1ship3C == p1ship5C))
                    || ((p1ship4R == p1ship5R) && (p1ship4C == p1ship5C))) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                bool = true;
            }
        } while (bool);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                player1Array[i][j] = '-';
                player1History[i][j] = '-';
            }
        }
        player1Array[p1ship1R][p1ship1C] = '@';
        player1Array[p1ship2R][p1ship2C] = '@';
        player1Array[p1ship3R][p1ship3C] = '@';
        player1Array[p1ship4R][p1ship4C] = '@';
        player1Array[p1ship5R][p1ship5C] = '@';
        printBattleShip(player1Array);
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");       //Player 2 ships
        do {
            bool = false;
            System.out.println("Enter ship 1 location:");
            p2ship1R = input.nextInt();
            p2ship1C = input.nextInt();
            bool = coordinatesValidCheck(p2ship1R, p2ship1C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 2 location:");
            p2ship2R = input.nextInt();
            p2ship2C = input.nextInt();
            bool = coordinatesValidCheck(p2ship2R, p2ship2C, bool);
            bool = ship2EqualsOthersCheck(p2ship1R, p2ship1C, p2ship2R, p2ship2C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 3 location:");
            p2ship3R = input.nextInt();
            p2ship3C = input.nextInt();
            bool = coordinatesValidCheck(p2ship3R, p2ship3C, bool);
            bool = ship3EqualsOthersCheck(p2ship1R, p2ship1C, p2ship2R, p2ship2C, p2ship3R, p2ship3C, bool);
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 4 location:");
            p2ship4R = input.nextInt();
            p2ship4C = input.nextInt();
            bool = coordinatesValidCheck(p2ship4R, p2ship4C, bool);
            if (((p2ship1R == p2ship4R) && (p2ship1C == p2ship4C))
                    || ((p2ship2R == p2ship4R) && (p2ship2C == p2ship4C))
                    || ((p2ship3R == p2ship4R) && (p2ship3C == p2ship4C))) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                bool = true;
            }
        } while (bool);
        do {
            bool = false;
            System.out.println("Enter ship 5 location:");
            p2ship5R = input.nextInt();
            p2ship5C = input.nextInt();
            bool = coordinatesValidCheck(p2ship5R, p2ship5C, bool);
            if (((p2ship1R == p2ship5R) && (p2ship1C == p2ship5C))
                    || ((p2ship2R == p2ship5R) && (p2ship2C == p2ship5C))
                    || ((p2ship3R == p2ship5R) && (p2ship3C == p2ship5C))
                    || ((p2ship4R == p2ship5R) && (p2ship4C == p2ship5C))) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                bool = true;
            }
        } while (bool);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                player2Array[i][j] = '-';
                player2History[i][j] = '-';
            }
        }
        player2Array[p2ship1R][p2ship1C] = '@';
        player2Array[p2ship2R][p2ship2C] = '@';
        player2Array[p2ship3R][p2ship3C] = '@';
        player2Array[p2ship4R][p2ship4C] = '@';
        player2Array[p2ship5R][p2ship5C] = '@';
        printBattleShip(player2Array);
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        mainAlgorithm(input, bool, player1Array, player2Array, player1History, player2History);
    }

    public static void mainAlgorithm(Scanner input, boolean bool, char[][] player1Array,
                                     char[][] player2Array, char[][] player1History, char[][] player2History) {
        int playerCounter = 0;
        int p1DestroyedShips = 0;
        int p2DestroyedShips = 0;
        int p1shootR;
        int p1shootC;
        int p2shootR;
        int p2shootC;
        do {
            if (playerCounter % 2 == 0) {               //player1
                do {
                    bool = false;
                    System.out.println("Player 1, enter hit row/column:");
                    p1shootR = input.nextInt();
                    p1shootC = input.nextInt();
                    if (!(p1shootR >= 0 && p1shootR <= 4) || !(p1shootC >= 0 && p1shootC <= 4)) {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        bool = true;
                        continue;
                    }
                    if (player2History[p1shootR][p1shootC] == 'X' || player2History[p1shootR][p1shootC] == 'O') {
                        System.out.println("You already fired on this spot. Choose different coordinates.");
                        bool = true;
                        continue;
                    }
                    if (player2Array[p1shootR][p1shootC] == '-') {
                        System.out.println("PLAYER 1 MISSED!");
                        player2Array[p1shootR][p1shootC] = 'O';
                        player2History[p1shootR][p1shootC] = 'O';
                        printBattleShip(player2History);
                        playerCounter++;
                        break;
                    }
                    if (player2Array[p1shootR][p1shootC] == '@') {
                        System.out.println("PLAYER 1 HIT PLAYER 2’s SHIP!");
                        player2Array[p1shootR][p1shootC] = 'X';
                        player2History[p1shootR][p1shootC] = 'X';
                        printBattleShip(player2History);
                        p2DestroyedShips++;
                        playerCounter++;
                        break;
                    }
                } while (bool);
            }
            System.out.println();
            if (p2DestroyedShips == 5) {
                System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
                System.out.println();
                System.out.println("Final boards:");
                System.out.println();
                printBattleShip(player1Array);
                System.out.println();
                printBattleShip(player2Array);
                break;
            }
            if (!(playerCounter % 2 == 0)) {
                do {
                    bool = false;
                    System.out.println("Player 2, enter hit row/column:");
                    p2shootR = input.nextInt();
                    p2shootC = input.nextInt();
                    if (!(p2shootR >= 0 && p2shootR <= 4) || !(p2shootC >= 0 && p2shootC <= 4)) {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        bool = true;
                        continue;
                    }
                    if (player1History[p2shootR][p2shootC] == 'X' || player1History[p2shootR][p2shootC] == 'O') {
                        System.out.println("You already fired on this spot. Choose different coordinates.");
                        bool = true;
                        continue;
                    }
                    if (player1Array[p2shootR][p2shootC] == '-') {
                        System.out.println("PLAYER 2 MISSED!");
                        player1Array[p2shootR][p2shootC] = 'O';
                        player1History[p2shootR][p2shootC] = 'O';
                        printBattleShip(player1History);
                        playerCounter++;
                        break;
                    }
                    if (player1Array[p2shootR][p2shootC] == '@') {
                        System.out.println("PLAYER 2 HIT PLAYER 1’s SHIP!");
                        player1Array[p2shootR][p2shootC] = 'X';
                        player1History[p2shootR][p2shootC] = 'X';
                        printBattleShip(player1History);
                        p1DestroyedShips++;
                        playerCounter++;
                        break;
                    }
                } while (bool);
            }
            System.out.println();
            if (p1DestroyedShips == 5) {
                System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
                System.out.println();
                System.out.println("Final boards:");
                System.out.println();
                printBattleShip(player1Array);
                System.out.println();
                printBattleShip(player2Array);
                break;
            }
        } while (true);
    }

    private static boolean coordinatesValidCheck(int row, int column, boolean bool) {
        if (!(row >= 0 && row <= 4) || !(column >= 0 && column <= 4)) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
            bool = true;
        }
        return bool;
    }

    private static boolean ship2EqualsOthersCheck(int ship1Row, int ship1Column,
                                                  int ship2Row, int ship2Column, boolean bool) {
        if ((ship1Row == ship2Row) && (ship1Column == ship2Column)) {                //ship1 == ship2
            System.out.println("You already have a ship there. Choose different coordinates.");
            bool = true;
        }
        return bool;
    }

    private static boolean ship3EqualsOthersCheck(int ship1Row, int ship1Column, int ship2Row,
                                                  int ship2Column, int ship3Row, int ship3Column, boolean bool) {
        if (((ship1Row == ship3Row) && (ship1Column == ship3Column))
                || ((ship2Row == ship3Row) && (ship2Column == ship3Column))) {
            System.out.println("You already have a ship there. Choose different coordinates.");
            bool = true;
        }
        return bool;
    }

    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }
}
