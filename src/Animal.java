public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private int weight;

    public Animal(String n, int a, boolean v, int w)
    {
        name = n;
        age = a;
        vaccinated = v;
        weight = w;
    }

    public void adopt()
    {
        System.out.println("Thank you! I have been adopted!");
    }

    public void feed()
    {
        System.out.println("I have been fed!");
    }

    public void cleaned()
    {
        System.out.println("I have been cleaned.");
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getVaccinated()
    {
        return vaccinated;
    }

    public int getWeight()
    {
        return weight;
    }
}
