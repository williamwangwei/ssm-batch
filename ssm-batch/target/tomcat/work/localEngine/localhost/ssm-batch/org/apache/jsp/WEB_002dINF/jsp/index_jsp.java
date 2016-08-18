package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/docs/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<title>信贷业务系统</title>\r\n");
      out.write("\r\n");
      out.write("<!-- 1. 加载Bootstrap层叠样式表 -->\r\n");
      out.write("<link href=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- 2 jQuery库，同时加载该库必须在加载bootstrap.min.js之前 -->\r\n");
      out.write("<!-- <script src=\"http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script> -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/jquery/jquery.js\"></script>\r\n");
      out.write("<!-- 3 Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/docs/examples/carousel/carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Just to make our placeholder images work. Don't actually copy the next line! -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/docs/assets/js/vendor/holder.min.js\"></script>\r\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/docs/assets/js/ie10-viewport-bug-workaround.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("resource/bootstrap-3.3.5-dist/docs/assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/* 进入前端系统 */\r\n");
      out.write("\tfunction project1(){\r\n");
      out.write("\t\twindow.location.href=\"socket/index\";\r\n");
      out.write("\t}\r\n");
      out.write("\t/* 进入前端系统 */\r\n");
      out.write("\tfunction enter1(){\r\n");
      out.write("\t\twindow.location.href=\"xd/jxnx/index.html\";\r\n");
      out.write("\t}\r\n");
      out.write("\t/* 进入批处理系统 */\r\n");
      out.write("\tfunction enter2(){\r\n");
      out.write("\t\twindow.location.href=\"xd/jy/index.html\";\r\n");
      out.write("\t}\r\n");
      out.write("\t/* 进入交易系统 */\r\n");
      out.write("\tfunction enter3(){\r\n");
      out.write("\t\twindow.location.href=\"xd/nightbach/index.html\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar-wrapper\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-static-top\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("              </button>\r\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">工作学习</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("              <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">首页</a></li>\r\n");
      out.write("                <li><a href=\"#about\">关于</a></li>\r\n");
      out.write("                <li><a href=\"#contact\">合作</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">项目 <span class=\"caret\"></span></a>\r\n");
      out.write("                  <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"javascript:void(0);\" onclick=\"project1()\">第一个项目</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                    <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                    <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("                    <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                    <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Carousel\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("      <!-- Indicators -->\r\n");
      out.write("      <ol class=\"carousel-indicators\">\r\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"\"></li>\r\n");
      out.write("        <li class=\"\" data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("        <li class=\"active\" data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("      </ol>\r\n");
      out.write("      <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <img class=\"first-slide\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"First slide\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>信贷业务前端系统</h1>\r\n");
      out.write("              <p>Note: If you're viewing this page via a <code>file://</code> URL, the \"next\" and \"previous\" Glyphicon buttons on the left and right might not load/display properly due to web browser security rules.</p>\r\n");
      out.write("              <p><a class=\"btn btn-lg btn-primary\" href=\"javascript:void(0);\" onclick=\"enter1()\" role=\"button\">进入</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <img class=\"second-slide\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"Second slide\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>信贷业务批处理</h1>\r\n");
      out.write("              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("              <p><a class=\"btn btn-lg btn-primary\" href=\"javascript:void(0);\" onclick=\"enter2()\" role=\"button\">进入</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item active\">\r\n");
      out.write("          <img class=\"third-slide\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"Third slide\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>信贷业务交易</h1>\r\n");
      out.write("              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("              <p><a class=\"btn btn-lg btn-primary\" href=\"javascript:void(0);\" onclick=\"enter3()\" role=\"button\">进入</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Next</span>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div><!-- /.carousel -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Marketing messaging and featurettes\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Wrap the rest of the page in another container to center all the content. -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container marketing\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Three columns of text below the carousel -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img class=\"img-circle\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"Generic placeholder image\" height=\"140\" width=\"140\">\r\n");
      out.write("          <h2>前端业务系统</h2>\r\n");
      out.write("          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"javascript:void(0);\" onclick=\"enter1()\" role=\"button\">进入</a></p>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img class=\"img-circle\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"Generic placeholder image\" height=\"140\" width=\"140\">\r\n");
      out.write("          <h2>日终批处理</h2>\r\n");
      out.write("          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"javascript:void(0);\" onclick=\"enter2()\" role=\"button\">进入</a></p>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("          <img class=\"img-circle\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" alt=\"Generic placeholder image\" height=\"140\" width=\"140\">\r\n");
      out.write("          <h2>日间交易</h2>\r\n");
      out.write("          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\r\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"javascript:void(0);\" onclick=\"enter3()\" role=\"button\">进入</a></p>\r\n");
      out.write("        </div><!-- /.col-lg-4 -->\r\n");
      out.write("      </div><!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- START THE FEATURETTES -->\r\n");
      out.write("\r\n");
      out.write("      <hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row featurette\">\r\n");
      out.write("        <div class=\"col-md-7\">\r\n");
      out.write("          <h2 class=\"featurette-heading\">First featurette heading. <span class=\"text-muted\">It'll blow your mind.</span></h2>\r\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-5\">\r\n");
      out.write("          <img class=\"featurette-image img-responsive center-block\" data-src=\"holder.js/500x500/auto\" alt=\"Generic placeholder image\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row featurette\">\r\n");
      out.write("        <div class=\"col-md-7 col-md-push-5\">\r\n");
      out.write("          <h2 class=\"featurette-heading\">Oh yeah, it's that good. <span class=\"text-muted\">See for yourself.</span></h2>\r\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-5 col-md-pull-7\">\r\n");
      out.write("          <img class=\"featurette-image img-responsive center-block\" data-src=\"holder.js/500x500/auto\" alt=\"Generic placeholder image\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row featurette\">\r\n");
      out.write("        <div class=\"col-md-7\">\r\n");
      out.write("          <h2 class=\"featurette-heading\">And lastly, this one. <span class=\"text-muted\">Checkmate.</span></h2>\r\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-5\">\r\n");
      out.write("          <img class=\"featurette-image img-responsive center-block\" data-src=\"holder.js/500x500/auto\" alt=\"Generic placeholder image\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <hr class=\"featurette-divider\">\r\n");
      out.write("\r\n");
      out.write("      <!-- /END THE FEATURETTES -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- FOOTER -->\r\n");
      out.write("      <footer>\r\n");
      out.write("        <p class=\"pull-right\"><a href=\"#\">Back to top</a></p>\r\n");
      out.write("        <p>© 2014 Company, Inc. · <a href=\"#\">Privacy</a> · <a href=\"#\">Terms</a></p>\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("    </div><!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
