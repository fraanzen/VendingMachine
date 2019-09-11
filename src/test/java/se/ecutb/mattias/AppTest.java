package se.ecutb.mattias;

import static org.junit.Assert.assertTrue;

import com.sun.istack.internal.Pool;
import org.junit.Assert;
import org.junit.Test;
import se.ecutb.mattias.model.ImplementVM;
import se.ecutb.mattias.model.VendingMachine;


public class AppTest 
{
    @Test
    public void shouldprintaddedint() {
        VendingMachine hej = new ImplementVM();
        int actual = hej.addCurrency(50);
        actual = actual+hej.addCurrency(50);
        Assert.assertEquals(100, actual);
    }
}
