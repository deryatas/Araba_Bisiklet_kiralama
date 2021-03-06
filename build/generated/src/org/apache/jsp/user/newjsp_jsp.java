package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Kontroller.KiralaList;
import Kontroller.Kirala;
import java.util.List;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 List<Kirala> kiraliste = new KiralaList().getirTumKiralaListe();
 request.setAttribute("kiraliste", kiraliste);

      out.write('\r');
      out.write('\n');

 int toplamkira = new  KiralaList().getirTumKira();
 request.setAttribute("toplamkira",toplamkira);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <style>\r\n");
      out.write("            .inner{\r\n");
      out.write("                margin: 15px 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <div  class=\"container-fluid\">\r\n");
      out.write("            <nav class=\"navbar navbar-light\">\r\n");
      out.write("                <a class=\"navbar-brand\">Arac Ekle</a>\r\n");
      out.write("                <form class=\"form-inline\">\r\n");
      out.write("                    <li><a class=\"nav-link text-dark \" href=\"../AdminLogoutServlet\">ÇIKIŞ</a></li>\r\n");
      out.write("                </form>\r\n");
      out.write("</nav>\r\n");
      out.write("        </div>\r\n");
      out.write("      <div  class=\"container-fluid\">\r\n");
      out.write("            <nav class=\"navbar navbar-light\">\r\n");
      out.write("                <a class=\"navbar-brand\">Kayıtlı Araç Listesi</a>               \r\n");
      out.write("</nav>\r\n");
      out.write("        </div>\r\n");
      out.write(" <table class=\"table table-sm table-hover table-bordered table-striped\" style=\"text-align:center\">\r\n");
      out.write("                        <thead class=\"thead-light\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                               \r\n");
      out.write("                                <th>Alış Tarihi</th>\r\n");
      out.write("                                <th>Veriş Tarihi</th>\r\n");
      out.write("                                <th>Ödeme</th>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                         </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kiraliste}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"kiraliste\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"align-middle\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kiraliste.alis_tarihi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                <td class=\"align-middle\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kiraliste.veris_tarihi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                <td class=\"align-middle\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kiraliste.odeme}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                                <td><a href=\"../KiralaDeleteServlet?id=<c:out value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kiraliste.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'/>\">Sil</a></td>\r\n");
      out.write("                               \r\n");
      out.write("                            </tr>\r\n");
      out.write("                      \r\n");
      out.write("                        </c:forEach>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
