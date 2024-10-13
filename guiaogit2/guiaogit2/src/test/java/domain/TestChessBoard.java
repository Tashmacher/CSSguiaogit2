package domain;

import org.junit.Before;
import org.junit.Test;

public class TestChessBoard {
    private ChessBoard board;

    @Before
    public void setUp() {
        board = new ChessBoard();
    }

    @Test
    public void testSet() {
        ChessPiece piece = new ChessPiece(ChessPieceKind.PAWN, color.WHITE);
        try {
            board.set(0, 0, piece);
        } catch (IllegalMoveException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void testGet() {
        ChessPiece piece = new ChessPiece(ChessPieceKind.PAWN, color.WHITE);
        try {
            board.set(0, 0, piece);
        } catch (IllegalMoveException e) {
            e.printStackTrace();
        }
        ChessPiece piece2 = board.get(0, 0);
        System.out.println(piece2);
    }

    @Test
    public void testRemove() {
        ChessPiece piece = new ChessPiece(ChessPieceKind.PAWN, color.WHITE);
        try {
            board.set(0, 0, piece);
        } catch (IllegalMoveException e) {
            e.printStackTrace();
        }
        board.remove(0, 0);
        ChessPiece piece2 = board.get(0, 0);
        System.out.println(piece2);
    }


}
