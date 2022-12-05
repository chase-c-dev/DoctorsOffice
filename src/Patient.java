public class Patient extends Person {

    private String doctor;


    public Patient(String name, int age, String doctor) { //constructor
        super(name, age);
        this.doctor = doctor;
    }

    public String toString() { //toString to get name, age and doctor
        return "Patient Name: " + getName() + " Patient Age: " + getAge() + " Doctor: " + doctor;
    }
}
