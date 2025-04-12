package src.main.java.com.lld.TicTacToe.Model;

public class PlayingPiece {
    PieceType pieceType;

    PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }
}