package deqo_ljac;

import junit.framework.TestCase;

public class SimpleStackTest extends TestCase {
    App test = new App();
    Item testpu = new Item();
    public void testIsEmpty() throws Exception {
    test.isEmpty();
    }

    public void testGetSize() throws Exception {
       test.getSize();
    }

    public void testPush() throws Exception {
        test.push(testpu);
    }

    public void testPeek() throws Exception {
        test.peek();
    }

    public void testPop() throws Exception {
        test.pop();
    }
}