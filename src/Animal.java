import interfaces.IAnimal;

//implementing class for animals
//contains enough details for all animals except cats - no need to create more subclasses
public class Animal implements IAnimal {
    private String type, name, owner;
    private int age, legs;

    public Animal(String type, String name, String owner, int age, int legs) {
        this.type = type;
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.legs = legs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    //to string method to make printing easier
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }
}

