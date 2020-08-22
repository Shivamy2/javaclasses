package src.com.getter;

public class PlayingCardfetch {
    // instance variables
    private int rank;
    private String suit;

    //no-parameter constructor
    public PlayingCardfetch() {
        rank = 0;
        suit = null;
    }

    // parameterised constructor
    public PlayingCardfetch(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
}