package domain;

public class ChessPiece {

    private ChessPieceKind kind;
    private color color;

    public ChessPiece(ChessPieceKind kind, color color) {
        this.kind = kind;
        this.color = color;
    }

    public ChessPieceKind getKind() {
        return kind;
    }

    public color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color + " " + kind;
    }

}
