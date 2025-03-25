public class Person {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String gender;
    
    // Default constructor
    public Person() {
        // Initialize with default values
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unspecified";
    }
    
    // Parameterized constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter and Setter for 'gender'
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    
    // Method to provide a greeting
    public String greet() {
        return "Hello, my name is " + name + "!";
    }
}
