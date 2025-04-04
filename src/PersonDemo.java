public class PersonDemo {
    public static void main(String[] args) {
        // Create a person using the default constructor
        Person person1 = new Person();
        // Update attributes using setter methods
        person1.setName("Alice");
        person1.setAge(10);
        person1.setGender("Female");
        person1.setHobby("Drawing");
        person1.setFavFood("Omelette");
        
        // Create a person using the parameterized constructor
        Person person2 = new Person("Bob", 19, "Male", "Gaming", "Rendang");
        
        // Display information for person1
        System.out.println("Person 1 Information:");
        person1.displayInfo();
        System.out.println(person1.greetAge());
        System.out.println("My favourite food is " + person1.getFavFood() + ".");
        System.out.println();
        
        // Display information for person2
        System.out.println("Person 2 Information:");
        person2.displayInfo();
        System.out.println(person2.greetAge());
        System.out.println("My favourite food is " + person2.getFavFood() + ". Mmmm tasty.");
    }
}