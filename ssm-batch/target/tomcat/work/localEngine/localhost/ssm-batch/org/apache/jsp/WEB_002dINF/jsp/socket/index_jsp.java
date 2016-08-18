package org.apache.jsp.WEB_002dINF.jsp.socket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Socket-首页</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("resource/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("resource/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("resource/easyui/demo.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/resource/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("resource/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("resource/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<div data-options=\"region:'north',border:false\"\r\n");
      out.write("\t\tstyle=\"height: 60px; background: #B3DFDA; padding: 10px\">Socket\r\n");
      out.write("\t\t连接</div>\r\n");
      out.write("\t<div data-options=\"region:'west',split:true,title:'West'\"\r\n");
      out.write("\t\tstyle=\"width: 150px; padding: 10px;\">west content</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tdata-options=\"region:'east',split:true,collapsed:true,title:'East'\"\r\n");
      out.write("\t\tstyle=\"width: 100px; padding: 10px;\">east region</div>\r\n");
      out.write("\t<div data-options=\"region:'south',border:false\"\r\n");
      out.write("\t\tstyle=\"height: 50px; background: #A9FACD; padding: 10px;\">south\r\n");
      out.write("\t\tregion</div>\r\n");
      out.write("\t<div data-options=\"region:'center',title:'Center'\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"easyui-panel\" title=\"New Topic\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t<div style=\"padding: 10px 60px 20px 60px\">\r\n");
      out.write("\t\t\t\t<form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<table cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>IP Address:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"address\" data-options=\"required:true\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>PORT:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"easyui-textbox\" type=\"text\" name=\"port\" data-options=\"required:true\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"easyui-textbox\" type=\"text\" name=\"number\" data-options=\"required:true\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Message:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-textbox\" name=\"sendmsg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"multiline:true\" style=\"height: 60px\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div style=\"text-align: center; padding: 5px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\">发送</a> \r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\">取消</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
