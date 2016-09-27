package org.apache.jsp.WEB_002dINF.jsp.batch;

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
      response.setContentType("text/html;charset=utf-8");
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
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(basePath);
      out.write("resource/bootstrap-3.3.5-dist/favicon.ico\">\r\n");
      out.write("<title>批处理列表</title>\r\n");
      out.write("\r\n");
      out.write("<!-- 1. 加载Bootstrap层叠样式表 -->\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resource/bootstrap-3.3.5-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resource/bootstrap-tabler/dist/bootstrap-table.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("resource/bootstrap-tabler/dist/bootstrap-editable.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 2 jQuery库，同时加载该库必须在加载bootstrap.min.js之前 -->\r\n");
      out.write("<!-- <script src=\"http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script> -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resource/bootstrap-3.3.5-dist/jquery/jquery.js\"></script>\r\n");
      out.write("<!-- 3 Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resource/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resource/bootstrap-tabler/dist/bootstrap-table.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resource/bootstrap-table-examples/assets/bootstrap-table/dist/extensions/export/bootstrap-table-export.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("resource/bootstrap-tabler/dist/locale/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var selections = [];\r\n");
      out.write("\r\n");
      out.write("function getIdSelections() {\r\n");
      out.write("\tvar $table = $('#table');\r\n");
      out.write("    return $.map($table.bootstrapTable('getSelections'), function (row) {\r\n");
      out.write("        return row.LOWEST_PRICE;\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function operateFormatter(value, row, index) {\r\n");
      out.write("    return [\r\n");
      out.write("        '<a class=\"like\" href=\"javascript:void(0)\" title=\"Like\">',\r\n");
      out.write("        '<i class=\"glyphicon glyphicon-heart\"></i>',\r\n");
      out.write("        '</a>  ',\r\n");
      out.write("        '<a class=\"remove\" href=\"javascript:void(0)\" title=\"Remove\">',\r\n");
      out.write("        '<i class=\"glyphicon glyphicon-remove\"></i>',\r\n");
      out.write("        '</a>'\r\n");
      out.write("    ].join('');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalTextFormatter(data) {\r\n");
      out.write("    return 'Total';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalNameFormatter(data) {\r\n");
      out.write("    return data.length;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalPriceFormatter(data) {\r\n");
      out.write("    var total = 0;\r\n");
      out.write("    $.each(data, function (i, row) {\r\n");
      out.write("        total += +(row.price.substring(1));\r\n");
      out.write("    });\r\n");
      out.write("    return '$' + total;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function detailFormatter(index, row) {\r\n");
      out.write("    var html = [];\r\n");
      out.write("    $.each(row, function (key, value) {\r\n");
      out.write("        html.push('<p><b>' + key + ':</b> ' + value + '</p>');\r\n");
      out.write("    });\r\n");
      out.write("    return html.join('');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function responseHandler(res) {\r\n");
      out.write("    $.each(res.rows, function (i, row) {\r\n");
      out.write("        row.state = $.inArray(row.id, selections) !== -1;\r\n");
      out.write("    });\r\n");
      out.write("    return res;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getHeight() {\r\n");
      out.write("    //return $(window).height() - $('h1').outerHeight(true);\r\n");
      out.write("\treturn $(window).height();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar $table = $('#table'),\r\n");
      out.write("\t\t$remove = $('#remove');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$remove.click(function(){\r\n");
      out.write("\t\t\talert(\"123\");\r\n");
      out.write("\t\t\tvar rows = [];\r\n");
      out.write("\t\t\trows = $table.bootstrapTable('getSelections');\r\n");
      out.write("\t\t\tif(rows!=null && rows.length == 1){\r\n");
      out.write("\t\t\t\t$.post(\"");
      out.print(basePath);
      out.write("product/adminProductAction_testCloudLoanProduct\",\r\n");
      out.write("\t\t\t\t\t\t{lowestPrice : rows[0].LOWEST_PRICE},\r\n");
      out.write("\t\t\t\t\t\tfunction(result) {\r\n");
      out.write("\t\t\t\t\t\t\talert(result);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"请选择一条产品测试\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#table').bootstrapTable({\r\n");
      out.write("\t\t\tlocale:\"zh-US\" ,\r\n");
      out.write("\t\t\theight: getHeight(),\r\n");
      out.write("\t\t    url: '");
      out.print(basePath);
      out.write("batch/list',\r\n");
      out.write("\t\t\t\t\t\t\tsearch : true,\r\n");
      out.write("\t\t\t\t\t\t\tshowExport : true,\r\n");
      out.write("\t\t\t\t\t\t\tshowToggle : true,\r\n");
      out.write("\t\t\t\t\t\t\tshowRefresh : true,\r\n");
      out.write("\t\t\t\t\t\t\tshowColumns : true,\r\n");
      out.write("\t\t\t\t\t\t\ttoolbar : '#toolbar',\r\n");
      out.write("\t\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\t\tpageList : '[10, 25, 50, 100, ALL]',\r\n");
      out.write("\t\t\t\t\t\t\tshowFooter : false,\r\n");
      out.write("\t\t\t\t\t\t\tshowPaginationSwitch : true,\r\n");
      out.write("\t\t\t\t\t\t\tidField : 'id',\r\n");
      out.write("\t\t\t\t\t\t\tdetailView : true,\r\n");
      out.write("\t\t\t\t\t\t\tdetailFormatter : 'detailFormatter',\r\n");
      out.write("\t\t\t\t\t\t\tsidePagination : 'server',\r\n");
      out.write("\t\t\t\t\t\t\tresponseHandler : 'responseHandler',\r\n");
      out.write("\t\t\t\t\t\t\tcolumns : [\r\n");
      out.write("\t\t\t\t\t\t           [\r\n");
      out.write("\t\t\t\t                    {\r\n");
      out.write("\t\t\t\t                        field: 'state',\r\n");
      out.write("\t\t\t\t                        checkbox: true,\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle'\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '工作编号',\r\n");
      out.write("\t\t\t\t                        field: 'jobId',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '工作名称',\r\n");
      out.write("\t\t\t\t                        field: 'jobName',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '工作方法',\r\n");
      out.write("\t\t\t\t                        field: 'proName',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '操作标志',\r\n");
      out.write("\t\t\t\t                        field: 'manualFlag',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '创建时间',\r\n");
      out.write("\t\t\t\t                        field: 'createDate',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '创建者',\r\n");
      out.write("\t\t\t\t                        field: 'createUser',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '输入时间',\r\n");
      out.write("\t\t\t\t                        field: 'inputDate',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '柜员编号',\r\n");
      out.write("\t\t\t\t                        field: 'tellerId',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: true,\r\n");
      out.write("\t\t\t\t                        visible:true\r\n");
      out.write("\t\t\t\t                    }, {\r\n");
      out.write("\t\t\t\t                        title: '操作',\r\n");
      out.write("\t\t\t\t                        field: 'action',\r\n");
      out.write("\t\t\t\t                        rowspan: 1,\r\n");
      out.write("\t\t\t\t                        align: 'center',\r\n");
      out.write("\t\t\t\t                        valign: 'middle',\r\n");
      out.write("\t\t\t\t                        sortable: false,\r\n");
      out.write("\t\t\t\t                        visible:true,\r\n");
      out.write("\t\t\t\t                        formatter:actionFormatter,\r\n");
      out.write("\t\t\t\t                        events:actionEvents\r\n");
      out.write("\t\t\t\t                    }\r\n");
      out.write("\t\t\t\t                ]\r\n");
      out.write("\t\t\t\t\t\t\t]\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction actionFormatter(value, row, index) {\r\n");
      out.write("        return [\r\n");
      out.write("            '<a class=\"like\" href=\"javascript:void(0)\" title=\"Like\">',\r\n");
      out.write("            '<i class=\"glyphicon glyphicon-plus\"></i>',\r\n");
      out.write("            '</a>',\r\n");
      out.write("            '<a class=\"edit ml10\" href=\"javascript:void(0)\" title=\"Edit\">',\r\n");
      out.write("            '<i class=\"glyphicon glyphicon-edit\"></i>',\r\n");
      out.write("            '</a>',\r\n");
      out.write("            '<a class=\"remove ml10\" href=\"javascript:void(0)\" title=\"Remove\">',\r\n");
      out.write("            '<i class=\"glyphicon glyphicon-remove\"></i>',\r\n");
      out.write("            '</a>'\r\n");
      out.write("        ].join('');\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\twindow.actionEvents = {\r\n");
      out.write("    \t    'click .like': function (e, value, row, index) {\r\n");
      out.write("    \t    \taddProductInfo();\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    'click .edit': function (e, value, row, index) {\r\n");
      out.write("    \t    \tvar url = \"${pageContext.request.contextPath}/sys/productAction_showProduct.do?productId=\"+row.product_id+\"&operateType=02\";\r\n");
      out.write("\t\t\t\tforward(url);\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    'click .remove': function (e, value, row, index) {\r\n");
      out.write("    \t    \tvar $table = $('#exampleTableEvents');\r\n");
      out.write("    \t    \tvar selections = [];\r\n");
      out.write("    \t    \tselections[0] = row.product_id;\r\n");
      out.write("    \t    \t$table.bootstrapTable('remove', {\r\n");
      out.write("                    field: 'product_id',\r\n");
      out.write("                    values: selections\r\n");
      out.write("                });\r\n");
      out.write("    \t    }\r\n");
      out.write("    \t};\r\n");
      out.write("\t\r\n");
      out.write("\twindow.operateEvents = {\r\n");
      out.write("\t\t'click .like' : function(e, value, row, index) {\r\n");
      out.write("\t\t\talert('You click like action, row: ' + JSON.stringify(row));\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'click .remove' : function(e, value, row, index) {\r\n");
      out.write("\t\t\t$table = $(\"#table\");\r\n");
      out.write("\t\t\t$table.bootstrapTable('remove', {\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\tvalues : [ row.id ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div id=\"toolbar\">\r\n");
      out.write("\t\t\t<button id=\"remove\" class=\"btn btn-success\" >\r\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-flag\"></i> 测试ODM\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table id=\"table\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
