public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean newChewToy;

    public Dog(String name, int age, boolean vaccinated, int weight, boolean walked, boolean chew)
    {
        super(name, age, vaccinated, weight);
        hasBeenWalked = walked;
        newChewToy = chew;
    }

    public void walk()
    {
        System.out.println("Time to go on a walk!");
        hasBeenWalked = true;
    }

    public void chewToy()
    {
        System.out.println("Here is a new chew toy.");
        newChewToy = true;
    }

    public boolean hasBeenWalked()
    {
        return hasBeenWalked;
    }

    public boolean hasNewChewToy()
    {
        return newChewToy;
    }
}
