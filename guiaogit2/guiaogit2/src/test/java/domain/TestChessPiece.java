package domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestChessPiece {

    @Test
    public void testGetKind() {
        ChessPiece p1 = new ChessPiece(ChessPieceKind.BISHOP, color.BLACK);
        assertEquals(ChessPieceKind.BISHOP, p1.getKind());
    }

    @Test
    public void testGetColor() {
        ChessPiece p1 = new ChessPiece(ChessPieceKind.BISHOP, color.BLACK);
        assertEquals(color.BLACK, p1.getColor());
    }


}
