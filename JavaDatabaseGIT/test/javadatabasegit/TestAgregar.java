package javadatabasegit;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Object obj = new Object();
        Dato d = new Dato("001", obj);
        BaseDeDatos instance = new BaseDeDatos();

        boolean expected = true;
        boolean actual = instance.agregar(d);
        Assert.assertEquals(expected, actual);
    }
}
