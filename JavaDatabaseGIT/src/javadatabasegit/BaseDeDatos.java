package javadatabasegit;

import java.util.ArrayList;

public class BaseDeDatos {

    private ArrayList<Dato> list;

    public BaseDeDatos() {
        this.list = new ArrayList<Dato>();
    }

    public boolean agregar(Dato d) {
        return this.list.add(d);
    }

    public boolean eliminar(Dato d) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(d.getId())) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Dato> listar() {
        return this.list;
    }

    public boolean modificar(Dato d) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(d.getId())) {
                list.get(i).setData(d.getData());
                return true;
            }
        }
        return false;
    }
}
