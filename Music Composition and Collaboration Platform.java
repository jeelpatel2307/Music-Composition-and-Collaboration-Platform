import java.util.ArrayList;
import java.util.List;

// Define a class for representing a musical composition
class Composition {
    private String title;
    private String composer;
    private List<String> notes;

    public Composition(String title, String composer) {
        this.title = title;
        this.composer = composer;
        this.notes = new ArrayList<>();
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public void printComposition() {
        System.out.println("Title: " + title);
        System.out.println("Composer: " + composer);
        System.out.println("Notes:");
        for (String note : notes) {
            System.out.println(note);
        }
    }
}

// Define a class for managing compositions and collaboration
class CompositionManager {
    private List<Composition> compositions;

    public CompositionManager() {
        this.compositions = new ArrayList<>();
    }

    public void addComposition(Composition composition) {
        compositions.add(composition);
    }

    public void printAllCompositions() {
        for (Composition composition : compositions) {
            composition.printComposition();
            System.out.println();
        }
    }
}

public class MusicCompositionPlatform {
    public static void main(String[] args) {
        // Create compositions
        Composition composition1 = new Composition("Symphony No. 5", "Ludwig van Beethoven");
        composition1.addNote("Allegro con brio");
        composition1.addNote("Andante con moto");
        composition1.addNote("Scherzo: Allegro");
        composition1.addNote("Allegro");

        Composition composition2 = new Composition("Moonlight Sonata", "Ludwig van Beethoven");
        composition2.addNote("Adagio sostenuto");
        composition2.addNote("Allegretto");
        composition2.addNote("Presto agitato");

        // Create a composition manager and add compositions
        CompositionManager manager = new CompositionManager();
        manager.addComposition(composition1);
        manager.addComposition(composition2);

        // Print all compositions
        manager.printAllCompositions();
    }
}
