// Hier wird alles ausgeführt.

package at.linkedlist;

import at.linkedlist.StringElement;

import java.util.Iterator;

public class LinkedList {
    private StringElement head; // head of list

    // Konstruktor erstellen mit Code --> generate --> Constructor
    public LinkedList(StringElement head) {

        this.head = head;
    }

    /**
     * Inserts a node at a given position
     *
     * @param index (starts with 0)
     */

    // Zwischen 2 Nodes einfügen, nicht suchen und ersetzen!
    public void add(int index, String val) {
        StringElement current = head;
        int currentIndex = 0;
        while (current.getNext() != null && currentIndex < (index - 1)) {  //zählt bis zum index durch und fügt dann VOR dem index ein mit (-1)
            current = current.getNext();
            currentIndex++;
        }
        // ROT
        StringElement elementToAdd = new StringElement(val); // neuer Wert eingefügt

        // BLAU
        elementToAdd.setNext(current.getNext());  // current.getnext ist der Wert, der vorher war

        // GRÜN
        current.setNext(elementToAdd);


    }


    /**
     * Inserts a node at the end of the list
     *
     * @param val
     */

    public void append(String val) {
        // Was ist das letzte Element in der Liste? Wenn Liste aus ist, dann next = null!
        StringElement nextElement = head;
        while (nextElement.getNext() != null) {
            nextElement = nextElement.getNext();
        }
        // Wenn nicht null, dann aus der Schleife heraus und in next speichern.
        StringElement toAppend = new StringElement(val);   // neue Variable anlegen, wo der letzte Wert hin soll
        nextElement.setNext(toAppend);                              // speichern des Wertes.
    }

    public void printAll() {

        // Startpunkt
        // aktuellen value ausgeben
        // aktuellen current auf den nächsten Knoten zeigen
        // check, ob nicht null. ansonsten Ende der Liste

        StringElement current = head;
        do {
            System.out.println(current.getValue());
            current = current.getNext();
        } while (current != null);  // gibt mir Daten aus, bis next nicht NULL ist
    }


    /**
     * Removes all nodes from the list with given String val
     *
     * @param val
     * @return Returns true (at least one node deleted) or false (no node deleted).
     */

    public boolean remove(String val) {
        StringElement current = head;
        StringElement beforeCurrent = null;  // Node #1, wichtig für neue Verbindung nach remove
        boolean found = false;
        do {     // do, weil ich von oben bis unten durchlaufen will
            if (val.equals(current.getValue())) {  // match found: Ist der Value von der Methode, der gleiche Value ist wie current.

                // add new link
                if (beforeCurrent == null) {  //wenn es ein Match gibt und null, dann wissen wir, dass es sich um den Head handelt. --> haben wir ja auf null gesetzt
                    //head
                    this.head = current.getNext();  // der aktuelle head bekommt bei match einen neuen index, den vor der Entfernng
                } else {
                    // any other node than head
                    beforeCurrent.setNext(current.getNext());
                }

                found = true;
            } else {   // no match found
                beforeCurrent = current;
            }
            current = current.getNext();
        }
        while (current != null);    // do while, weil der Head auch betroffen ist. != null damit alles erwischt wird.
        return found;
    }


    /**
     * Removes a node at position index from the list
     *
     * @param index
     * @return Returns true (at least one node deleted) or false (no node deleted).
     */

    // VERSUCH KARIN
    //::::::::::::::::::::::::
    public boolean remove(int index) {
        StringElement current = head;
        StringElement foundCurrent = null;  // Node #1, wichtig für neue Verbindung nach remove
        boolean found = false;
        do {     // do, weil ich von oben bis unten durchlaufen will
            if (foundCurrent.equals(current.getNext())) {  // match found: Ist der Value von der Methode, der gleiche Value ist wie current.

                // add new link
                if (foundCurrent == null) {  //wenn es ein Match gibt und null, dann wissen wir, dass es sich um den Head handelt. --> haben wir ja auf null gesetzt
                    //head
                    this.head = current.getNext();  // der aktuelle head bekommt bei match einen neuen index, den vor der Entfernng
                } else {
                    // any other node than head
                    foundCurrent.setNext(current.getNext());
                }

                found = true;
            } else {   // no match found
                foundCurrent = current;
            }
            current = current.getNext();
        }
        while (current != null);    // do while, weil der Head auch betroffen ist. != null damit alles erwischt wird.
        return found;
    }


    /**
     * Removes a node at position index from the list
     *
     * @return The size of the list
     */

    public int size() {
        // Lösungsweg: durchzählen bis null. "null" ist noch ein Knoten.
        // do while: Da fußgesteuert und wir haben schon im Head einen Wert.

        StringElement current = head;
        int size = 0;
        do {
            size++;
            current = current.getNext();
        } while (current != null);  // Schleife läuft, solange "unnull"
        return size;
    }

    /**
     * Returns the String at position index
     *
     * @param index
     * @return The String or null if out of bounds
     */

    public String get(int index) {
        // While-Schleife ausreichend, ist Kopfgesteuert
        if (index >= size()) {      // Was tun, wenn der Index zu groß ist: letzen Wert, also null, ausgeben.
            return null;
        }
        StringElement current = head;
        int currentIndex = 0;
        while (currentIndex < index) {  // bis 1 davor, dann +1 als Ergebnis
            currentIndex++;             // Solange durchzählen, bis Index erreicht, dann Wert ausgeben.
            current = current.getNext();
        }
        return current.getValue();
    }


    /**
     * Returns the first occurence of val in the list
     * Wenn ich z.B. nach "head node" suche, dann soll der Index 0 zurückgegeben werden.
     *
     * @param val
     * @return The index or -1 if string cannot be found
     */

    // VERSUCH KARIN
    //::::::::::::::::::::::::
    public String iterator(String iter) {
        StringElement current = head;
        String currentString = " ";
        while (iter.equals(currentString)) {
            if (iter == currentString) {
                return currentString;
            }
        }

        return currentString;
    }
}




