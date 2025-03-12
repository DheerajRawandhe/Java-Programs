public class person{
    // Attributes
    private String name;
    private int age;

    // Constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Displaying information of the persons
        System.out.println("Information of Person 1:");
        person1.displayInfo();

        System.out.println("\nInformation of Person 2:");
        person2.displayInfo();
    }
}