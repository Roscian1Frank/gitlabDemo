import backEnd.BE;
import frontEnd.FE;
import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

    @Test
    public void checkFrontend(){
        FE.printFE();
        Assert.assertEquals(FE.name,"Front end");
    }

    @Test
    public void checkBackend(){
        BE.printBE();
        Assert.assertEquals(BE.name, "Backend");
    }

}
