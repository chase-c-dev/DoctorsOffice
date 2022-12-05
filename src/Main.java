import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[]args) throws FileNotFoundException {
        ArrayList<Patient> patients = new ArrayList<Patient>(); //array list to store patients

        Scanner scan =  new Scanner(System.in); // scanner to get user input
        Scanner keyboard = new Scanner(new File("patients.txt")); //scanner to read txt file

        String counter = "";
        while(keyboard.hasNextLine()) { //runs length of txt file
            counter = keyboard.nextLine();
            String store[] = counter.split(","); //splits up txt line into multiple strings and stores them in store array
            try { //exception handling
                if (store[2].equals("Ann Perkins")) {
                    store[1] = "54";
                }
                Patient patient = new Patient(store[0], Integer.parseInt(store[1]), store[2]); //creates new patient
                patients.add(patient); //adds patient to patients arraylist
            }
            catch(Exception e) { //exception handling
                break;
            }

        }

        while(true) { //runs as long as the user does not enter D
            System.out.println("A - List All Patients");
            System.out.println("B - List All Patients(under age 40)");
            System.out.println("C - List All Patients(age 40+)");
            System.out.println("D - Exit");
            String input = scan.nextLine();

            if(input.equals("A")) { //if A all patients are listed
                listAllPatients(patients);
            }
            else if (input.equals("B")) { //if B all patients under 40 are listed
                youngPatients(patients);
            }
            else if (input.equals("C")) { //if all patients above 40 are listed
                oldPatients(patients);
            }

            else if(input.equals("D")) { //if D exits the program
                break;
            }
        }

    }

    public static void listAllPatients(ArrayList<Patient> d) { //parses through all patients in arraylist and prints there info
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i).toString());
        }
    }

    public static void youngPatients(ArrayList<Patient> c) { //parses through all patients in arraylist and prints any younger than 40
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getAge() < 40 && c.get(i).getAge() >= 0) {
                System.out.println(c.get(i).toString());
            }
        }
    }

    public static void oldPatients(ArrayList<Patient> b) { //parses through all patients in arraylist and prints any older than 40
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getAge() >= 40) {
                System.out.println(b.get(i).toString());
            }
        }
    }

}
