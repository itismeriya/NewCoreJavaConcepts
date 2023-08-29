package basicprograms;
abstract class Vaccine {
    abstract void boosterDose();
     void firtsDose(String nationality, int age) {
        if (nationality == "Indian" && age >= 18) {
            System.out.println("First dose is completed ,Please pay 250Rs");
        } else {
            System.out.println("You are not eligiable");
        }
    }

     void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted == true) {
            System.out.println("Second dose is completed");
        } else {
            System.out.println("You cannot take the second dose without completing the first dose.");
        }
    }

   
}

class VaccinationSuccessful extends Vaccine {
    void boosterDose() {
        System.out.println("Booster dose administered.");
    }
}

public class VaccinationLab {
    public static void main(String[] args) {
        Vaccine person = new VaccinationSuccessful();
        person.firtsDose("Indian", 20);
        person.secondDose(true);
        person.boosterDose();

    }

}
