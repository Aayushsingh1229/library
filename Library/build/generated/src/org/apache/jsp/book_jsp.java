package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Book;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>Library - Books</title></head>\n");
      out.write("<body>\n");
      out.write("    <h2>Book List</h2>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Book ID</th>\n");
      out.write("            <th>Book Name</th>\n");
      out.write("            <th>Author Name</th>\n");
      out.write("            <th>Category</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            List<Book> bookList = (List<Book>) request.getAttribute("bookList");
            for (Book book : bookList) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( book.getBookId() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( book.getBookName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( book.getAuthorName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( book.getCategory() );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"BookServlet?action=edit&id=");
      out.print( book.getBookId() );
      out.write("\">Edit</a>\n");
      out.write("                <a href=\"BookServlet?action=delete&id=");
      out.print( book.getBookId() );
      out.write("\">Delete</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <a href=\"add-book.jsp\">Add New Book</a>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
