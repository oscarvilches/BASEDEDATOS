package javadatabasegit;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Object obj = new Object();
        Dato d = new Dato("001", obj);
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(d);

        boolean expected = true;
        boolean actual = instance.modificar(d);
        Assert.assertEquals(expected, actual);
    }
}
