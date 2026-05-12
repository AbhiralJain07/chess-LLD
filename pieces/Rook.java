package pieces;

import enums.Color;
import enums.PieceType;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, PieceType.ROOK);
    }

    @Override
    public boolean canMove(
            int sx,
            int sy,
            int dx,
            int dy
    ) {

        return sx == dx || sy == dy;
    }
}