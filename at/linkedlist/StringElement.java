// Hier wird die Schablone definiert.

package at.linkedlist;

public class StringElement {

    // Instanzvariablen
    private StringElement next;
    private String value;

    // Konstruktor
    public StringElement(String firstValue) {
        setValue(firstValue);
        next = null;   // nach Erstellen eines Objekts mal einen initialen Wert zuweisen
    }

    // getter and setter
    public StringElement getNext() {
        return next;
    }

    public void setNext(StringElement next1) {
        this.next = next1;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value1) {
        this.value = value1;
    }


    @Override
    public String toString() {
        return value;
    }
}

