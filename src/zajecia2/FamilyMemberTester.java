package zajecia2;

public class FamilyMemberTester {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Karol";
        dad.age = 34;
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname); //ten zapis jest preferowany bo klasa ma zmienna statyczna
//        System.out.println("Nazwisko rodu to: " + dad.surname);

        FamilyMember mother = new FamilyMember();
        mother.name = "Dorota";
        mother.age = 30;
    }
}
