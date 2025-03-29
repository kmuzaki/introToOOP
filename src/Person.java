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

    // Method to provide greeting based on age
    public String greetAge() {
        if (age < 7) {
            return "Hewwwo. My name is " + name + ". I am " + age + " years old.";
        } else if (age < 13) {
            return "Hi there. My name is " + name + ". And I'm currently an elementary school student. Nice to meet you!";
        } else if (age < 16) {
            return "Good day. I am " + name + ". And I'm currently studying in Junior High. Pleased to meet you!";
        } else if (age < 19) {
            return "What's up? I am " + name + ". And I'm studying in this High School. Pleased to meet you, buddy!";
        } else {
            return "Why hello there! My name is " + name + "and I'm now studying at College. It's pretty hectic, but I got this. Nice to meet you, by the way!";
        }
    }
}
