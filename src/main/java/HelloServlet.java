import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutorial.Foo;
import tutorial.HelloService;

public class HelloServlet extends HttpServlet{
	
	public void doGe(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		PrintWriter out = response.getWriter();
		//HelloService helloService = new HelloService();
		Foo foo = new Foo();
		String str=foo.greet();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> "+str+" </h1>");
		out.println("</body>");
		out.println("</html>");	
	}
}