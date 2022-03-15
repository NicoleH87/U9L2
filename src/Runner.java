public class Runner {
    public static void main(String[] args) {
        Animal petAnimal = new Animal ("Posh", 1, false, 12);
        petAnimal.adopt();
        petAnimal.feed();
        petAnimal.cleaned();
        System.out.println("My name is " + petAnimal.getName());
        System.out.println("Age: " + petAnimal.getAge());
        System.out.println("Vaccination Status: " + petAnimal.getVaccinated());
        System.out.println("Weight: " + petAnimal.getWeight());

        System.out.println("");
        Dog petDog = new Dog ("Dots", 2, true, 15, false, false);
        petDog.walk();
        petDog.chewToy();
        System.out.println("Dog is walked: " + petDog.hasBeenWalked());
        System.out.println("New Chew Toy: " + petDog.hasNewChewToy());
        //Animal object
        petDog.adopt();
        petDog.feed();
        petDog.cleaned();
        System.out.println("My name is " + petDog.getName());
        System.out.println("Age: " + petDog.getAge());
        System.out.println("Vaccination Status: " + petDog.getVaccinated());
        System.out.println("Weight: " + petDog.getWeight());

        System.out.println("");
        Cat petCat = new Cat ("Oomf", 1, false, 8, false, false);
        petCat.play();
        petCat.nap();
        System.out.println("Cat has played: " + petCat.getHasPlayedWith());
        System.out.println("Cat nap: " + petCat.getHasNapped());
        //Animal object
        petCat.adopt();
        petCat.feed();
        petCat.cleaned();
        System.out.println("My name is " + petCat.getName());
        System.out.println("Age: " + petCat.getAge());
        System.out.println("Vaccination Status: " + petCat.getVaccinated());
        System.out.println("Weight: " + petCat.getWeight());
    }
}
