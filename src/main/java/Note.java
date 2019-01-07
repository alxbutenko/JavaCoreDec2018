import java.util.Objects;

/**
 * @author Alexander Butenko
 * Class Note to create and compare Notes
 */

public class Note {
    String note;

    public Note(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Note note1 = (Note) o;
        return Objects.equals (note, note1.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash (note);
    }
}
