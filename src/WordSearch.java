public class WordSearch extends WordPuzzle {
    int totalLetters;
    boolean isRectangle;

    public WordSearch (int time, boolean hard, int wordNum, int letters, boolean rec)
    {
        super(time, hard, wordNum);
        totalLetters = letters;
        isRectangle = rec;
    }

    public void shapePuzzle()
    {
        System.out.println("Puzzle set to shape.");
    }

    public int getTotLetters()
    {
        return totalLetters;
    }

    public boolean getRecFormat()
    {
        return isRectangle;
    }

}
