package ejercicio2;
import java.util.List;

public interface LocalDao {
    void add(Local local);
    Local get(int id);
    List<Local> getAll();
    void update(Local local);
    void delete(Local local);
}
