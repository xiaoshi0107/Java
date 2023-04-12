public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world!");
    }
}

class IfTest {
    public static void main (String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is not 3");
        }
        System.out.println("This runs no matter what");
    }
}

class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}

class DogTestDrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title =  "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}