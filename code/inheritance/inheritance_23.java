// 23. Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.


abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    void play() {
        System.out.println("Playing the Glockenspiel with soft, melodic tones.");
    }

    void tune() {
        System.out.println("Tuning the Glockenspiel bars to perfect pitch.");
    }
}

class Violin extends Instrument {
    void play() {
        System.out.println("Playing the Violin with smooth bow movements.");
    }

    void tune() {
        System.out.println("Tuning the Violin strings to the correct frequency.");
    }
}

class Main {
    public static void main(String[] args) {
        Glockenspiel g = new Glockenspiel();
        Violin v = new Violin();

        System.out.println("----- Glockenspiel -----");
        g.tune();
        g.play();

        System.out.println("\n----- Violin -----");
        v.tune();
        v.play();
    }
}


/*
 Output:
 ----- Glockenspiel -----
 Tuning the Glockenspiel bars to perfect pitch.
 Playing the Glockenspiel with soft, melodic tones.

 ----- Violin -----
 Tuning the Violin strings to the correct frequency.
 Playing the Violin with smooth bow movements.
 */