package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LocalDaoImpl implements LocalDao {
    private static final String FILE_NAME = "locals.txt";
    private List<Local> locals;

    public LocalDaoImpl() {
        locals = readFromFile();
    }

    @Override
    public void add(Local local) {
        locals.add(local);
        saveToFile();
    }

    @Override
    public Local get(int id) {
        for (Local local : locals) {
            if (local.getId() == id) {
                return local;
            }
        }
        return null;
    }

    @Override
    public List<Local> getAll() {
        return locals;
    }

    @Override
    public void update(Local local) {
        for (int i = 0; i < locals.size(); i++) {
            if (locals.get(i).getId() == local.getId()) {
                locals.set(i, local);
                saveToFile();
                return;
            }
        }
    }

    @Override
    public void delete(Local local) {
        locals.remove(local);
        saveToFile();
    }

    private List<Local> readFromFile() {
        List<Local> locals = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            locals = (List<Local>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return locals;
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(locals);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
