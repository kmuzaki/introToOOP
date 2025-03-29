public class Person {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String gender;
    private String hobby;
    private String favFood;
    
    // Default constructor
    public Person() {
        // Initialize with default values
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unspecified";
        this.hobby = "Unspecified";
        this.favFood = "Don't know";
    }
    
    // Parameterized constructor
    public Person(String name, int age, String gender, String hobby, String favFood) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.favFood = favFood;
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

    // Getter and Setter for 'hobby'
    public String getHobby() {
        return hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // Getter and Setter for 'favFood'
    public String getFavFood() {
        return favFood;
    }
    
    public void setFavFood(String favFood) {
        this.favFood = favFood;
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
