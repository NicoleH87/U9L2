public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean hasNapped;

    public Cat(String name, int age, boolean vaccinated, int weight, boolean played, boolean nap)
    {
        super(name, age, vaccinated, weight);
        hasPlayedWith = played;
        hasNapped = nap;
    }

    public void play() {
        System.out.println("Let's play with the cats!");
        hasPlayedWith = true;
    }

    public void nap() {
        System.out.println("It's time to take a nap.");
        hasNapped = true;
    }

    public boolean getHasPlayedWith()
    {
        return hasPlayedWith;
    }

    public boolean getHasNapped()
    {
        return hasNapped;
    }
}
