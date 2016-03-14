package tutorial;

import static org.mockito.Mockito.mock;

import org.junit.BeforeClass;
import org.junit.Test;


public class HelloServiceTest {
	private static HelloService helloService;


	@BeforeClass
	public static void setUp(){
		BookDAL mockedBookDAL = mock(BookDAL.class);
		when(helloService.returnStr()).thenReturn("hello world pgm!");

	}

	@Test
	public void testGetAllBooks() throws Exception {

	}

}