import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Alexander Butenko
 * Class with Main method.
 * Get User commands to make changes in NoteBook
 * */

public class App {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook ();
        notePadRun (noteBook);
    }

    /**
     * @author Alexander Butenko
     * Method to call add / edit / remove / watch all entries (notes) in notebook
     * Also terminates program if it can't detect correct action with Notebook
     * 1. add / 2. remove / 3. edit / 4. read all notes
     * */

    private static void notePadRun(NoteBook noteBook) {
        int command;

        while (noteBook.isRunning ()) {
            command = getCommand ();

            if (command == 1) {
                System.out.println ("Enter new note: ");
                noteBook.addNote (noteBook.getNote ());
            } else if (command == 2) {
                System.out.println ("Enter a note to remove from the Notebook: ");
                noteBook.removeNote (noteBook.getNote ());
            } else if (command == 3) {
                System.out.println ("Enter a note for edit: ");
                Note oldNote = noteBook.getNote ();
                System.out.println ("Enter new text for \"" + oldNote.note +"\"");
                Note changedNote = noteBook.getNote ();
                noteBook.editNote (oldNote, changedNote);
            } else if (command == 4) {
                noteBook.readAllNotes ();
            } else {
                System.out.println ("See you!");
                noteBook.setRunning (false);
            }
        }
    }

    /**
     * @author Alexander Butenko
     * Method to get User action with Notebook
     * @return index of command or "0" if can't parse Integer.
     * */

    private static int getCommand() {
        int command;
        String comm = null;

        System.out.println ();
        System.out.println ("Enter command:");
        System.out.println ("\"1\": to add new note");
        System.out.println ("\"2\": to remove note");
        System.out.println ("\"3\": to edit note");
        System.out.println ("\"4\": to read all notes");
        System.out.println ("Type any other symbol to exit program");

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        try {
            comm = reader.readLine ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        
        try {
            command = Integer.parseInt (comm);
        } catch (Exception e) {
            command = 0;
        }

        return command;
    }
}