// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WordThis {
    public static void main(String[] args) {
        Person person = new Person("Juan");
    }

}


class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Printing the operator this inside the person class" + this); //This points to an object type person in this moment

        Print print = new Print();
        print.print(this); //This contains a reference to person object
    }
}

class Print{
    public void print(Person p){
        System.out.println("Printing person argument: " + p ); //Object person value
        System.out.println("Printing actual object (this) " + this); //This points to an object type print
    }
}