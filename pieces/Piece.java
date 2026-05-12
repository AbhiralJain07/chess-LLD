package pieces;

import enums.*;

public abstract class Piece {
    
    protected Color color;
    protected PieceType type;

    public Piece (Color color , PieceType type){
        this.color = color;
        this.type = type;
    }

    public Color getColor(){
        return color;
    }

    public PieceType getType(){
        return type;
    }

    public abstract boolean canMove(
        int sx,
        int sy,
        int dx,
        int dy
    );

}
