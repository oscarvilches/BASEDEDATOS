package javadatabasegit;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    @Test
    public void testListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();

        ArrayList<Dato> expected = new ArrayList<>();
        ArrayList<Dato> actual = instance.listar();
        Assert.assertEquals(expected, actual);
    }
}
