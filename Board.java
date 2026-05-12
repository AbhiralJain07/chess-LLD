import enums.Color;
import pieces.*;

public class Board {

    private Cell[][] board;

    public Board() {

        board = new Cell[8][8];

        initializeBoard();
    }

    private void initializeBoard() {

        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                board[i][j] = new Cell(i, j);
            }
        }

        // Pawns
        for(int i=0;i<8;i++) {

            board[1][i]
                    .setPiece(new Pawn(Color.BLACK));

            board[6][i]
                    .setPiece(new Pawn(Color.WHITE));
        }

        // Rooks
        board[0][0]
                .setPiece(new Rook(Color.BLACK));

        board[0][7]
                .setPiece(new Rook(Color.BLACK));

        board[7][0]
                .setPiece(new Rook(Color.WHITE));

        board[7][7]
                .setPiece(new Rook(Color.WHITE));
    }

    public Cell[][] getBoard() {
        return board;
    }
}