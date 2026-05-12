package pieces;

import enums.Color;
import enums.PieceType;

public class King extends Piece {

    public King(Color color) {
        super(color, PieceType.KING);
    }

    @Override
    public boolean canMove(
            int sx,
            int sy,
            int dx,
            int dy
    ) {

        return Math.abs(dx - sx) <= 1
                && Math.abs(dy - sy) <= 1;
    }
}