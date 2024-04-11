package kadai;

public class Counter {

    private int wins;
    private int loses;
    private int draws;

    public Counter() {
        this.wins = 0;
        this.loses = 0;
        this.draws = 0;
    }

    // Getter methods

    public int getWins() {
        return this.wins;
    }

    public int getLoses() {
        return this.loses;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setCount(String result) {
        if (result.equals("win")) this.wins = this.wins + 1;
        else if (result.equals("lose")) this.loses++;
        else this.draws++;
    }

}
