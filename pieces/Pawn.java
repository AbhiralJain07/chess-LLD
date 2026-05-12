package pieces;

import enums.*;

public class Pawn extends Piece {
    
    public Pawn(Color color){
        super(color, PieceType.PAWN);
    }

    @Override
    public boolean canMove(
        int sx,
        int sy,
        int dx,
        int dy
    ){
         if(color == Color.WHITE) {
            return dx == sx - 1 && dy == sy;
        }

        return dx == sx + 1 && dy == sy;
    }

}
