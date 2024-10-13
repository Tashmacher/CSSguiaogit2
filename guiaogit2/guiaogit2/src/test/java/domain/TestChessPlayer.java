package domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestChessPlayer {

    @Test
    public void testGetName() {
        ChessPlayer p1 = new ChessPlayer("Manuel", "manuel@gmail.com");
        assertEquals("Manuel", p1.getName());
    }
}