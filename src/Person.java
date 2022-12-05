public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { //constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { //getter for name
        return name;
    }

    public void setName(String name) { //setter for name
        this.name = name;
    }

    public int getAge() { //getter for age
        return age;
    }

    public void setAge(int age) { //setter for age
        this.age = age;
    }
}
