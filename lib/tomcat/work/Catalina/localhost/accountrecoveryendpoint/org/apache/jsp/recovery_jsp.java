/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2023-01-09 11:42:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApiException;
import org.wso2.carbon.identity.mgt.endpoint.util.client.api.UsernameRecoveryApi;
import org.wso2.carbon.identity.mgt.endpoint.util.client.api.PasswordRecoveryApiV1;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.Claim;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.UserClaim;
import org.wso2.carbon.identity.recovery.util.Utils;
import org.wso2.carbon.identity.recovery.IdentityRecoveryConstants;
import org.wso2.carbon.user.core.util.UserCoreUtil;
import org.wso2.carbon.utils.multitenancy.MultitenantUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.Property;
import java.net.URLEncoder;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.passwordrecovery.v1.*;
import org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;

public final class recovery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/tenant-resolve.jsp", Long.valueOf(1660133174000L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1660133174000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.passwordrecovery.v1");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.Claim");
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApiException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants");
    _jspx_imports_classes.add("org.apache.commons.collections.map.HashedMap");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.api.PasswordRecoveryApiV1");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("org.wso2.carbon.identity.base.IdentityRuntimeException");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("org.wso2.carbon.utils.multitenancy.MultitenantUtils");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.Property");
    _jspx_imports_classes.add("org.wso2.carbon.identity.recovery.util.Utils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.recovery.IdentityRecoveryConstants");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.api.UsernameRecoveryApi");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.UserClaim");
    _jspx_imports_classes.add("org.wso2.carbon.user.core.util.UserCoreUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityTenantUtil");
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
      response.setContentType("text/html;charset=UTF-8");
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

    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";
    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(),
            new EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String tenantDomain;
    if (IdentityTenantUtil.isTenantQualifiedUrlsEnabled()) {
        tenantDomain = IdentityTenantUtil.getTenantDomainFromContext();
    } else {
        tenantDomain = request.getParameter("tenantDomain");
        String tenantDomainInURL = request.getParameter("t");

        if (StringUtils.isBlank(tenantDomain)) {
            tenantDomain = request.getParameter(IdentityManagementEndpointConstants.TENANT_DOMAIN);
        }

        if (!StringUtils.isBlank(tenantDomainInURL)) {
            tenantDomain = tenantDomainInURL;
        }
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    boolean isPasswordRecoveryEmailConfirmation =
            Boolean.parseBoolean(request.getParameter("isPasswordRecoveryEmailConfirmation"));
    boolean isUsernameRecovery = Boolean.parseBoolean(request.getParameter("isUsernameRecovery"));
    boolean isPasswordRecoveryWithClaimsNotify =
            Boolean.parseBoolean(request.getParameter("isPasswordRecoveryWithClaimsNotify"));

    // Common parameters for password recovery with email and self registration with email
    String username = request.getParameter("username");
    String sessionDataKey = request.getParameter("sessionDataKey");
    String confirmationKey = request.getParameter("confirmationKey");
    String callback = request.getParameter("callback");
    String userTenant = request.getParameter("t");

    if (StringUtils.isBlank(callback)) {
        callback = IdentityManagementEndpointUtil.getUserPortalUrl(
                application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL), tenantDomain);
    }

    if (StringUtils.isNotBlank(userTenant)) {
        username = MultitenantUtils.getTenantAwareUsername(username);
        username = UserCoreUtil.addTenantDomainToEntry(username, userTenant);
    }

    // Password recovery parameters
    String recoveryOption = request.getParameter("recoveryOption");

    try {
        if (StringUtils.isNotBlank(callback) && !Utils.validateCallbackURL(callback, tenantDomain,
            IdentityRecoveryConstants.ConnectorConfig.RECOVERY_CALLBACK_REGEX)) {
            request.setAttribute("error", true);
            request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                "Callback.url.format.invalid"));
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
    } catch (IdentityRuntimeException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", e.getMessage());
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    if (isUsernameRecovery) {
        // Username Recovery Scenario
        if (StringUtils.isBlank(tenantDomain)) {
            tenantDomain = IdentityManagementEndpointConstants.SUPER_TENANT;
        }
       
        List<Claim> claims;
        UsernameRecoveryApi usernameRecoveryApi = new UsernameRecoveryApi();
        try {
            claims = usernameRecoveryApi.getClaimsForUsernameRecovery(tenantDomain, true);
        } catch (ApiException e) {
            IdentityManagementEndpointUtil.addErrorInformation(request, e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        List<UserClaim> claimDTOList = new ArrayList<UserClaim>();

        for (Claim claimDTO : claims) {
            if (StringUtils.isNotBlank(request.getParameter(claimDTO.getUri()))) {
                UserClaim userClaim = new UserClaim();
                userClaim.setUri(claimDTO.getUri());
                userClaim.setValue(request.getParameter(claimDTO.getUri()).trim());
                claimDTOList.add(userClaim);
            }
        }

        try {
            Map<String, String> requestHeaders = new HashedMap();
            if (request.getParameter("g-recaptcha-response") != null) {
                requestHeaders.put("g-recaptcha-response", request.getParameter("g-recaptcha-response"));
            }
    
            usernameRecoveryApi.recoverUsernamePost(claimDTOList, tenantDomain, null, requestHeaders);
            request.setAttribute("callback", callback);
            request.setAttribute("tenantDomain", tenantDomain);
            request.getRequestDispatcher("username-recovery-complete.jsp").forward(request, response);
        } catch (ApiException e) {
            if (e.getCode() == 204) {
                request.setAttribute("error", true);
                request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                        "No.valid.user.found"));
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }

            IdentityManagementEndpointUtil.addErrorInformation(request, e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

    } else if (isPasswordRecoveryWithClaimsNotify) {
        // Let user recover password by email or security questions.
        String recoveryCode = request.getParameter("recoveryCode");
        String notificationChannel = "";

        PasswordRecoveryApiV1 passwordRecoveryApiV1 = new PasswordRecoveryApiV1();
        if (recoveryOption.equals("SECURITY_QUESTIONS")) {
            username = IdentityManagementEndpointUtil.getFullQualifiedUsername(username, tenantDomain, null);
            request.setAttribute("callback", callback);
            request.setAttribute("sessionDataKey", sessionDataKey);
            request.setAttribute("username", username);
            session.setAttribute("username", username);
            IdentityManagementEndpointUtil.addReCaptchaHeaders(request, passwordRecoveryApiV1.
                    getApiClient().getResponseHeaders());
            request.getRequestDispatcher("challenge-question-request.jsp?username=" + username).forward(request,
                    response);
            return;
        } else {
            List<Property> properties = new ArrayList<>();
            Property callbackProperty = new Property();
            callbackProperty.setKey("callback");
            callbackProperty.setValue(URLEncoder.encode(callback, "UTF-8"));
            properties.add(callbackProperty);

            Property sessionDataKeyProperty = new Property();
            sessionDataKeyProperty.setKey("sessionDataKey");
            sessionDataKeyProperty.setValue(sessionDataKey);
            properties.add(sessionDataKeyProperty);

            RecoveryRequest recoveryRequest = new RecoveryRequest();
            recoveryRequest.setProperties(properties);
            recoveryRequest.setChannelId(recoveryOption);
            recoveryRequest.setRecoveryCode(recoveryCode);
            try {
                Map<String, String> requestHeaders = new HashedMap();
                RecoveryResponse recoveryResponse = passwordRecoveryApiV1.recoverPassword(recoveryRequest,
                        tenantDomain, requestHeaders);
                notificationChannel = recoveryResponse.getNotificationChannel();
                request.setAttribute("callback", callback);
                if (notificationChannel.equals("EMAIL")) {
                    request.getRequestDispatcher("password-recovery-with-claims-notify.jsp").forward(request,
                            response);
                    return;
                } else {
                    request.setAttribute("error", true);
                    request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                            "Unknown.password.recovery.option"));
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }
            catch (ApiException e) {
                IdentityManagementEndpointUtil.addErrorInformation(request, e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }
        }
    } else {
        request.setAttribute("sessionDataKey", sessionDataKey);
        
        if (isPasswordRecoveryEmailConfirmation) {
            session.setAttribute("username", username);
            session.setAttribute("confirmationKey", confirmationKey);
            request.setAttribute("callback", callback);
            request.getRequestDispatcher("password-reset.jsp").forward(request, response);
        } else {
            request.setAttribute("username", username);
            session.setAttribute("username", username);

            if (IdentityManagementEndpointConstants.PasswordRecoveryOptions.EMAIL.equals(recoveryOption)) {
                request.setAttribute("callback", callback);
                request.getRequestDispatcher("password-recovery-notify.jsp").forward(request, response);
            } else if (IdentityManagementEndpointConstants.PasswordRecoveryOptions.SECURITY_QUESTIONS
                    .equals(recoveryOption)) {
                request.setAttribute("callback", callback);
                request.getRequestDispatcher("challenge-question-request.jsp?username=" + username).forward(request,
                        response);
            } else {
                request.setAttribute("error", true);
                request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                        "Unknown.password.recovery.option"));
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
