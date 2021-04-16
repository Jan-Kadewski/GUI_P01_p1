public class Person {
    String imie;
    String nazwisko;
    boolean isAllowedToOpenAndPutOrTakeIntoSpace;
    // PIERWSZA OSOBA, KTÓRA ROZPOCZYNA NAJEM JEST ODPOWIEDZIALNA ZA OPŁATY
    public Person(String imie,String nazwisko, boolean isAllowedToOpenAndPutOrTakeIntoSpace){
        this.imie =imie;
        this.nazwisko = nazwisko;
        this.isAllowedToOpenAndPutOrTakeIntoSpace = isAllowedToOpenAndPutOrTakeIntoSpace;
    }
}
