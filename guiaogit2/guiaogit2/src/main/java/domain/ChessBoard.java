package domain;

public class ChessBoard {

    private ChessPiece[][] board;
    
    public ChessBoard() {
        this.board = new ChessPiece[8][8];
    }

    public void set(int i, int j, ChessPiece piece) throws IllegalMoveException {
        if (board[i][j] != null) {
            throw new IllegalMoveException("Posição ocupada.");
        }

        board[i][j] = piece;
    }

    public ChessPiece get(int i, int j) {
        if(board[i][j] == null) {
            return null;
        }
        return board[i][j];
    }

    public void remove(int i, int j) {
        if(board[i][j] == null) {
            return;
        }
        board[i][j] = null;
    }


}
