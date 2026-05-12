package pieces;

import enums.Color;
import enums.PieceType;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public boolean canMove(
            int sx,
            int sy,
            int dx,
            int dy
    ) {

        return Math.abs(dx - sx)
                == Math.abs(dy - sy);
    }
}