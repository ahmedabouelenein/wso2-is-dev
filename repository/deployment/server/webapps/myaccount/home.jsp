<!--
* Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
-->

<%@ page import="static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL" %>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX"%>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME"%>

<jsp:scriptlet>
    session.setAttribute("authCode",request.getParameter("code"));
    session.setAttribute("sessionState", request.getParameter("session_state"));
    if(request.getParameter("state") != null) {session.setAttribute("state", request.getParameter("state"));}
</jsp:scriptlet>

<!DOCTYPE html>
<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <meta name="referrer" content="no-referrer" />

        <link href="/myaccount/libs/themes/default/theme.2857d6ef.min.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" href="/myaccount/libs/themes/default/assets/images/branding/favicon.ico" />

        <script>
            var contextPathGlobal = "/myaccount";
            var serverOriginGlobal = "<%=getServerURL("", true, true)%>";
            var superTenantGlobal = "<%=SUPER_TENANT_DOMAIN_NAME%>";
            var tenantPrefixGlobal = "<%=TENANT_AWARE_URL_PREFIX%>";
        </script>
    <script defer src="/myaccount/static/js/single.300a5c55.js?5d04fe2009f833127a42"></script><script defer src="/myaccount/static/js/26.623f08d6.js?5d04fe2009f833127a42"></script><script defer src="/myaccount/static/js/209.d1e8a07e.js?5d04fe2009f833127a42"></script><script defer src="/myaccount/static/js/init.e1209e7c.js?5d04fe2009f833127a42"></script><script defer src="/myaccount/static/js/492.00d2e735.js?5d04fe2009f833127a42"></script><script defer src="/myaccount/static/js/main.89ff77e1.js?5d04fe2009f833127a42"></script></head>
    <body>
        <noscript>
            You need to enable JavaScript to run this app.
        </noscript>
        <div id="root"></div>
    </body>
</html>
