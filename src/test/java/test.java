import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.apache.log4j.Logger;

public class test {

    private static Queueimpl cua;
    final static Logger logger = Logger.getLogger(test.class);

    @Before
    public void initQueueimpl(){
        cua = new Queueimpl(10);
    }

    @Test
    public void testPush(){
        cua.push(3);
    }

    @Test
    public  void testPop(){
        //cua.push(3);
        //int num = cua.size();

        try{
            Object num2 = cua.pop();
            int num3 = cua.size();
            assertEquals(0,num3);
        }catch(ArrayIndexOutOfBoundsException ex){
            logger.error("No hay nada en la cola");
        }


        //assertEquals(1,num);

    }

}
