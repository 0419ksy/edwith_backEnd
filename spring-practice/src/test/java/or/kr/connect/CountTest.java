package or.kr.connect;

import org.junit.Before;
import org.junit.Test;

public class CountTest {

    private int count = 0;
    @Before
    public void setUp() {
        System.out.print(count++);
    }

    @Test
    public void testPlus() {
        System.out.print(count++);
    }

    @Test
    public void increase (){
        System.out.print(count++);
    }

}
