public class AnimalFactory {

    public static Animal CreateAnimal(String type, String name, String owner, int age)
    {
        //switch statement because it improves readability and is easy to extend
        //in this scenario could've mapped type to enum and used for no of legs - but not extensible
        //use lower case types to make comparing later easier
        switch(type.toLowerCase()){
            case "cat":
                return new Cat(name, owner, age);
            case "dog":
                return new Animal("dog", name, owner, age, 4);
            case "bird":
                return new Animal("bird", name, owner, age, 2);
            case "snake":
                return new Animal("snake", name, owner, age, 0);
            default:
                return null;
        }
    }
}
