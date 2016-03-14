package tutorial;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class sample {
	public String HELLO_WORLD = "Hello World";

	@Test
	public void fooGreets() {
		Foo foo = mock(Foo.class);
		when(foo.greet()).thenReturn(HELLO_WORLD);
		System.out.println("Foo greets: " + foo.greet());
		assertEquals(foo.greet(), HELLO_WORLD);
	}
}