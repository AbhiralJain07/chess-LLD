import pieces.Piece;

public class Move {

    private int startX;
    private int startY;

    private int endX;
    private int endY;

    private Piece movedPiece;

    public Move(
            int startX,
            int startY,
            int endX,
            int endY,
            Piece movedPiece
    ) {

        this.startX = startX;
        this.startY = startY;

        this.endX = endX;
        this.endY = endY;

        this.movedPiece = movedPiece;
    }
}