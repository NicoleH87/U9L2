public class WordPuzzle {
    int time;
    boolean hard;
    int wordNum;

    public WordPuzzle(int time, boolean hard, int words)
    {
        time = this.time;
        hard = this.hard;
        wordNum = words;
    }

    public void guess()
    {
        System.out.println("You have made a guess.");
    }

    public int getTime()
    {
        return time;
    }

    public boolean getHardness()
    {
        return hard;
    }

    public int getWordNum()
    {
        return wordNum;
    }
}
