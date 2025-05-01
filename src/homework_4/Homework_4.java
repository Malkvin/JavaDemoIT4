package homework_4;
//Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
//по очереди вводят координаты клетки в которую хотят сделать ход. После
// каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//Игра продолжается до победы одного из игроков или ничьи.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework_4 {
    private static final char EMPTY_CELL = ' '; // пустая клетка
    private static final char PLAYER_X = 'X'; //символ для первого игрока
    private static final char PLAYER_O = 'O'; //символ для первого игрока
    private final char[][] board; //массив для хранения состояния игрового поля
    private boolean isXTurn; //указатель очередности хода
    private final boolean gameOver; //флаг окончания игры

    public Homework_4() {
        this.board = new char[3][3];
        resetBoard();
        this.isXTurn = true;
        this.gameOver = false;
    }

    public static void main(String[] args) {
        Homework_4 game = new Homework_4();
        game.startGame();
    }

    public void startGame() {       //метод запускающий игру
        Scanner scanner = new Scanner(System.in);
        printInstructions();
        while (!gameOver) {
            printBoard();
            int row = -1;
            int col = -1;
            try {
                System.out.print("\nВведите координаты ячейки через пробел (например, 1 1): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                scanner.nextLine(); // Очистка буфера continue;
            }
            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Координаты должны быть в пределах от 1 до 3. Попробуйте снова.");
                continue;
            }
            if (board[row][col] != EMPTY_CELL) {
                System.out.println("Эта ячейка уже занята. Выберите другую.");
                continue;
            }
            makeMove(row, col);
            if (checkWin()) {
                printBoard();
                System.out.println(isXTurn ? "Победил игрок X!" : "Победил игрок O!");
                break;
            }
            if (isDraw()) {
                printBoard();
                System.out.println("Ничья!");
                break;
            }
            isXTurn = !isXTurn;
        }
        scanner.close();
    }

    private void printInstructions() { //правила игры
        System.out.println("Добро пожаловать в игру Крестики-Нолики!");
        System.out.println("Игроки поочередно делают ходы, вводя координаты ячейки.");
        System.out.println("Первый игрок играет за 'X', второй за 'O'.");
        System.out.println("Начнем игру!\n");
    }

    private void printBoard() {  //текущее состояние игрового поля в консоли
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private void resetBoard() { //сбрасывает игровое поле, заполняя его пустыми клетками
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    private void makeMove(int row, int col) { //делает ход, устанавливая символ текущего игрока в указанную клетку
        board[row][col] = isXTurn ? PLAYER_X : PLAYER_O;
    }

    private boolean checkWin() { //проверяет, выиграл ли кто-то из игроков
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {  //проверяют наличие трёх одинаковых символов
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != EMPTY_CELL && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() { //проверяют наличие трёх одинаковых символов
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != EMPTY_CELL && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() { //проверяют наличие трёх одинаковых символов
        return board[1][1] != EMPTY_CELL && ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0]));
    }

    private boolean isDraw() { //проверяет, заполнено ли всё поле без победителя
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }
}
