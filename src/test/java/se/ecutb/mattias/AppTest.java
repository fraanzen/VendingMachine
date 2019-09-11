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
    public void test_add_money(){
        VendingMachine vendingMachine = new ImplementVM();

        vendingMachine.addCurrency(100);
        vendingMachine.addCurrency(1);

        Assert.assertEquals(101, vendingMachine.getBalance());

    }

    @Test
    public void test_add_wrong_money(){
        VendingMachine vendingMachine = new ImplementVM();

        vendingMachine.addCurrency(1);
        vendingMachine.addCurrency(3);
        vendingMachine.addCurrency(20);

        Assert.assertEquals(21, vendingMachine.getBalance());

    }
}