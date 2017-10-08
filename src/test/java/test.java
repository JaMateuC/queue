import org.junit.Before;
import org.junit.Test;

public class test {

    private static Queueimpl cua;

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
        cua.push(3);
        int num = cua.size();

        System.out.println(num);
        Object num2 = cua.pop();
        num = cua.size();

        System.out.println(num);
    }

    @Test
    public  void testSize(){
        cua.push(3);

        int num = cua.size();

        System.out.println(num);
    }

}
