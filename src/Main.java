import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //declare arraylist because you can't sort an immutable list
        var animalsList = new ArrayList<>(List.of(
                AnimalFactory.CreateAnimal("cat", "Joe", "Steven", 5),
                AnimalFactory.CreateAnimal("bird", "Luke", "Alan", 2),
                AnimalFactory.CreateAnimal("dog", "Jim", "Sarah", 1),
                AnimalFactory.CreateAnimal("snake", "Katie", "Lewis", 8),
                AnimalFactory.CreateAnimal("cat", "Poe", "Steven", 3),
                AnimalFactory.CreateAnimal("dog", "Bonnie", "Lewis", 6)
        ));

        //to string helps out when printing
        System.out.println("Unordered list:");
        animalsList.forEach(x -> System.out.println(x));

        //use comparator to sort by getOwner - owner name
        System.out.println("\nSort by owner name:");
        animalsList.sort(Comparator.comparing(Animal::getOwner));
        animalsList.forEach(x -> System.out.println(x));

        //filter out only birds - use .equals to compare strings
        System.out.println("\nOnly birds:");
        animalsList.stream().filter(x -> x.getType().equals("bird")).forEach(x -> System.out.println(x));

        //filter for age older than 5
        System.out.println("\nOnly 5+ years:");
        animalsList.stream().filter(x -> x.getAge() > 5).forEach(x -> System.out.println(x));
    }
}