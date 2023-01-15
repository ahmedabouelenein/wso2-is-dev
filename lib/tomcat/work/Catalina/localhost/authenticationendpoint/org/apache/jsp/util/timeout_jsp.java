/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2023-01-15 08:59:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClientException;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClient;
import static org.apache.commons.lang.StringUtils.isNotEmpty;
import static org.wso2.carbon.identity.core.util.IdentityTenantUtil.*;
import static org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil.*;
import static org.apache.commons.lang.StringUtils.isNotBlank;

public final class timeout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    /**
     * Parses the given attribute to a number. If the value is empty or
     * null, then it will fallback to the default value.
     *
     * @param attribute {@link Object} request attribute.
     * @param defaultValue default value.
     * @return parsed value or default value.
     */
    private int parseRequestAttributeToANumber(Object attribute, int defaultValue) {
        try {
            if (isNotBlank(attribute.toString())) {
                return Integer.parseInt(attribute.toString());
            }
        } catch (NumberFormatException | NullPointerException e) {
            // Ignore the error.
        }
        return defaultValue;
    }


    /**
     * Parses the given attribute to a String.
     *
     * @param attribute {@link Object} request attribute
     * @param defaultValue {@link String} default value substitution for attribute
     * @return parsed value or default value.
     */
    private String parseRequestAttributeToAString(Object attribute, String defaultValue) {
        try {
            return attribute.toString();
        } catch (NumberFormatException | NullPointerException e) {
            return defaultValue;
        }
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("static org.wso2.carbon.identity.core.util.IdentityTenantUtil");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("static org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClient");
    _jspx_imports_classes.add("static org.apache.commons.lang.StringUtils.isNotEmpty");
    _jspx_imports_classes.add("static org.apache.commons.lang.StringUtils.isNotBlank");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClientException");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "countdown.jsp", out, false);
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String description = "You have been idle in this page for too long. For security reasons," +
        "you need to start over or you will be redirected to the sign-in page";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "modal.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("This sign-in instance is about to timeout!", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("description", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(description), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action_button_text", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Start over", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("cancel_button_text", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dismiss", request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');


    /**
     * These variables are the ones that passed on this timeout.jsp component via
     * request attributes. If the values are not present then default values are initialized.
     *
     * Pages that includes this directive will have a default timeout value of
     * 10 minutes and the timer will notify the user when there's 1 minute left. To change
     * this behaviour you can specify the {@code totalTimeoutMinutes} and {@code notifyOnMinute}
     * before including this file. For example:-
     *
     *  &lt;%
     *      request.setAttribute("totalTimeoutMinutes", 2);
     *      request.setAttribute("notifyOnMinute", 1);
     *      request.setAttribute("pageName", "login");
     *  %&gt;
     *  &lt;%@ include file="utility/timeout.jsp" %&gt;
     *
     * Why "this" as a default value for {@code pageName} ?
     * It's serves a default value for the description in the modal. Check the method
     * {@code modal.changeDescriptionAsHTML} in script.
     */
    int totalTimeoutMinutes = parseRequestAttributeToANumber(request.getAttribute("totalTimeoutMinutes"), 35);
    int notifyOnMinute = parseRequestAttributeToANumber(request.getAttribute("notifyOnMinute"), 2);
    String pageName = parseRequestAttributeToAString(request.getAttribute("pageName"), "this");

    /*
     * Once re-initialized via context URL it will contain the login URL back to the service provider
     * to start over. If the access url is not configured for a particular application we will try to
     * send the user to root /. We have to do this until we mandate the `accessUrl` for apps.
     */
    String appAccessUrlEncoded = "";

    try {

        String _serviceProvider = request.getParameter("sp");
        String _userTenantDomain = request.getParameter("t");
        String _tenantDomain = getTenantDomainFromContext();
        ApplicationDataRetrievalClient _client = new ApplicationDataRetrievalClient();
        String _accessUrl = _client.getApplicationAccessURL(_tenantDomain, _serviceProvider);

        String url = replaceUserTenantHintPlaceholder(_accessUrl, _userTenantDomain);
        if (isNotEmpty(url)) {
            appAccessUrlEncoded = encodeURL(url);
        }

    } catch (ApplicationDataRetrievalClientException e) {
        // Ignored and fallback to login page url.
    }


      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * This the props object that holds dynamic server side variables.\n");
      out.write("     * This will allow the script functions to access the variable\n");
      out.write("     * simply via a object.\n");
      out.write("     */\n");
      out.write("    const PROPS = {\n");
      out.write("        totalTimeoutMinutes: ");
      out.print( totalTimeoutMinutes );
      out.write(",\n");
      out.write("        notifyOnMinute: ");
      out.print( notifyOnMinute );
      out.write(",\n");
      out.write("        appAccessUrlEncoded: \"");
      out.print( appAccessUrlEncoded );
      out.write("\",\n");
      out.write("        pageName: \"");
      out.print( pageName );
      out.write("\",\n");
      out.write("        showModal: ");
      out.print( isNotEmpty(appAccessUrlEncoded) );
      out.write("\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    if(PROPS.showModal) {\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("            const SPACE_CHAR = \" \";\n");
      out.write("            const timeout = Countdown.minutes(PROPS.totalTimeoutMinutes);\n");
      out.write("            const countdown = new Countdown(timeout, onDone, onTick);\n");
      out.write("\n");
      out.write("            const modal = new ModalRef(function (/*Modal onAction*/) {\n");
      out.write("                // Once the modal action button clicked, the user will be redirected\n");
      out.write("                // to the specified URL immediately. If the url is not available then\n");
      out.write("                // it will not redirect or do anything.\n");
      out.write("                if (PROPS.appAccessUrlEncoded) {\n");
      out.write("                    window.location = PROPS.appAccessUrlEncoded;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * This function will be called everytime when time ticks.\n");
      out.write("             *\n");
      out.write("             * @param time {{total: number, hours: number, seconds: number, minutes: number, days: number}}\n");
      out.write("             */\n");
      out.write("            function onTick(time) {\n");
      out.write("                if (time.total < Countdown.minutes(PROPS.notifyOnMinute)) {\n");
      out.write("                    modal.changeDescriptionAsHTML(\n");
      out.write("                    \"You have been idle in\" + SPACE_CHAR + PROPS.pageName + SPACE_CHAR +\n");
      out.write("                    \"page for too long. For security reasons, you need to start over or you will be redirected \" +\n");
      out.write("                    \"to the sign-in page\"  + SPACE_CHAR + \"<b>\" + Countdown.timeToReadable(time) + \"</b>.\"\n");
      out.write("                    );\n");
      out.write("                }\n");
      out.write("                if (time.total === Countdown.minutes(PROPS.notifyOnMinute)) {\n");
      out.write("                    modal.show();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * Once the timer is finished, this method will be\n");
      out.write("             * invoked to execute the target action.\n");
      out.write("             */\n");
      out.write("            function onDone() {\n");
      out.write("                // Once the countdown is over, the user will be redirected\n");
      out.write("                // to the access URL immediately.\n");
      out.write("                window.location = PROPS.appAccessUrlEncoded;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            countdown.start();\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
