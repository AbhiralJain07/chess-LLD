package pieces;

import enums.Color;
import enums.PieceType;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public boolean canMove(
            int sx,
            int sy,
            int dx,
            int dy
    ) {

        int x = Math.abs(dx - sx);
        int y = Math.abs(dy - sy);

        return (x == 2 && y == 1)
                || (x == 1 && y == 2);
    }
}