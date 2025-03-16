class Animal {
    private String name;
    private String color;
    private String type;
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return "Animal{Name='" + name + "', Color='" + color + "', Type='" + type + "'}";
    }
}
public class AnimalMainQ6 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", "Brown", "Pet");
        Animal animal2 = new Animal("Tiger", "Orange", "Wild");
        Animal animal3 = new Animal("Parrot", "Green", "Pet");

        System.out.println(animal1 + " - HashCode: " + animal1.hashCode());
        System.out.println(animal2 + " - HashCode: " + animal2.hashCode());
        System.out.println(animal3 + " - HashCode: " + animal3.hashCode());
    }

}
