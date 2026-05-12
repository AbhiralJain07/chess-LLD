package pieces;

import enums.Color;
import enums.PieceType;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, PieceType.QUEEN);
    }

    @Override
    public boolean canMove(
            int sx,
            int sy,
            int dx,
            int dy
    ) {

        return sx == dx
                || sy == dy
                || Math.abs(dx - sx)
                == Math.abs(dy - sy);
    }
}