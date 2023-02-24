import java.util.concurrent.ThreadLocalRandom;

//cats require no of lives so they need a subclass
public class Cat extends Animal {
    int noOfLives;

    //less constructor parameters because all cats are type cat and have 4 legs
    public Cat(String name, String owner, int age) {
        super("cat", name, owner, age, 4);
        //randomly generated number of lives
        noOfLives = ThreadLocalRandom.current().nextInt(1, 10);
    }

    //to string method to include no of lives
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + this.getType() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", owner='" + this.getOwner() + '\'' +
                ", age=" + this.getAge() +
                ", legs=" + this.getLegs() +
                ", no of lives=" + noOfLives +
                '}';
    }
}
