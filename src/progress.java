import java.util.Timer;
import java.util.UUID;

public class progress {
    String name;
    UUID id;
    /**
    * Creates a progress
    * @param name of the progress
    */
    public progress(String name) {
        this.name = name;
        id = UUID.randomUUID();
    }
}
