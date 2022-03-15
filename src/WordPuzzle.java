public class WordPuzzle {
    int time;
    boolean hard;
    int words;

    public WordPuzzle(int time, boolean hard, int words)
    {
        time = this.time;
        hard = this.hard;
        words = this.words;
    }

    public void guess()
    {
        System.out.println("Your guess has been entered");
    }
}
