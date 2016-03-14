package tutorial;

 

import static com.javacodegeeks.mockito.Foo.*;
import static org.mockito.Mockito.*;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
public class MockitoHelloWorldExample {
    @Test
    public void fooGreets() {
        Foo foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(foo.greet(), HELLO_WORLD);
    }
}
