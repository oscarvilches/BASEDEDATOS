package javadatabasegit;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Object obj = new Object();
        Dato d = new Dato("001", obj);
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(d);

        boolean expected = true;
        boolean actual = instance.eliminar(d);
        Assert.assertEquals(expected, actual);
    }
}
