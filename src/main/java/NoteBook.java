import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Butenko
 * class to store Notes in Array
 * @see Note
 * Methods to read / edit / delete / add note to Array
 * */

public class NoteBook {

    /**
     * Array to store notes
     */
    private static List<Note> notes = new ArrayList<> ();

    /**
     * Program runs while isRunning is true
     */
    private boolean isRunning = true;


    /**
     * Method to print all Notes in Notebook.
     */
    public void readAllNotes() {
        System.out.println ("===");
        for (Note s : notes) {
            System.out.println (s.note);
        }
        System.out.println ("===");
        System.out.println ();
    }

    /**
     * Method to add Note to Array.
     * @param note to add to Notebook
     */
    public void addNote (Note note) {
        notes.add (note);
        System.out.println ("\""+ note.note + "\" was successfully added to the Notebook");
    }

    /**
     * Method to remove Note from Array if Array contains such Note
     * @param note to remove from Array.
     */
    public void removeNote (Note note) {
        try {
            int index = notes.indexOf (note);
            notes.remove (index);
            System.out.println ("Note \""+ note.note + "\" was successfully removed.");
        } catch (Exception ex) {
            System.out.println ("There is no such note in the Notebook!");
            System.out.println ();
        }
    }

    /**
     * Method to edit Note in Notebook.
     * @param oldNote Note to change
     * @param editedNote Note after editing if Array contains oldNote.
     */
    public void editNote (Note oldNote, Note editedNote) {
        try {
            int index = notes.indexOf (oldNote);
            notes.set (index, editedNote);
            System.out.println ("Note \"" + oldNote.note + "\" was successfully changed to \"" + editedNote.note + "\"");
        } catch (Exception ex) {
            System.out.println ("There is no such note in the Notebook! (\"" + oldNote.note + "\")");
        }
    }

    /**
     * Method to get Note from User for further actions.
     * @return Note with User's text.
     */
    public Note getNote() {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String str = null;
        try {
            str = reader.readLine ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return new Note (str);
    }

    /**
     * Setter for isRunning
     * @param running
     */
    public void setRunning(boolean running) {
        isRunning = running;
    }

    /**
     * Getter for isRunning
     */
    public boolean isRunning() {
        return isRunning;
    }
}