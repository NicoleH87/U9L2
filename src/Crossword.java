public class Crossword extends WordPuzzle {
    int numAcross;
    int numDown;

    public Crossword(int time, boolean hard, int num, int across, int down)
    {
        super(time, hard, num);
        numAcross = across;
        numDown = down;
    }

    public void giveClue()
    {
        System.out.println("A missing word is shown.");
    }

    public int getNumAcross()
    {
        return numAcross;
    }

    public int getNumDown()
    {
        return numDown;
    }
}
