"use strict";(self.webpackChunk_wso2is_console=self.webpackChunk_wso2is_console||[]).push([[9989],{49989:function(e,t,n){n.r(t);var r=n(96462),o=n(68905),l=n(64805),a=n(83913),i=n(5554),c=n(62363);function s(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=null==e?null:"undefined"!==typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null==n)return;var r,o,l=[],a=!0,i=!1;try{for(n=n.call(e);!(a=(r=n.next()).done)&&(l.push(r.value),!t||l.length!==t);a=!0);}catch(e){i=!0,o=e}finally{try{a||null==n.return||n.return()}finally{if(i)throw o}}return l}(e,t)||function(e,t){if(!e)return;if("string"===typeof e)return u(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);"Object"===n&&e.constructor&&(n=e.constructor.name);if("Map"===n||"Set"===n)return Array.from(e);if("Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n))return u(e,t)}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function u(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,r=new Array(t);n<t;n++)r[n]=e[n];return r}var d=function(e){var t,n=e["data-testid"],u=(0,l.$G)().t,d=(0,a.v9)((function(e){return e.config})),p=s((0,o.useState)(void 0),2),g=p[0],m=p[1];return(0,o.useEffect)((function(){void 0===g&&m(c.identityProviderConfig.useNewConnectionsView)}),[c.identityProviderConfig]),o.createElement("div",{"data-testid":n},o.createElement(r.Message,{type:"info",header:u("console:develop.features.authenticationProvider.templates.google.wizardHelp.preRequisites.heading"),content:o.createElement(o.Fragment,null,o.createElement("p",null,o.createElement(l.cC,{i18nKey:"console:develop.features.authenticationProvider.templates.google.wizardHelp.preRequisites.getCredentials"},"Before you begin, create an ",o.createElement("strong",null,"OAuth credential")," on the ",o.createElement("a",{href:"https://console.developers.google.com",target:"_blank",rel:"noopener noreferrer"}," Google developer console"),", and obtain a ",o.createElement("strong",null,"Client ID & secret"),".")),o.createElement("p",null,o.createElement(l.cC,{i18nKey:"console:develop.features.authenticationProvider.templates.google.wizardHelp.preRequisites.configureRedirectURL"},"Use the following URL as the ",o.createElement("strong",null,"Authorized Redirect URI"),"."),o.createElement(r.CopyInputField,{className:"copy-input-dark spaced",value:(null===d||void 0===d||null===(t=d.deployment)||void 0===t?void 0:t.customServerHost)+"/commonauth"}),o.createElement("a",{href:"https://support.google.com/googleapi/answer/6158849",target:"_blank",rel:"noopener noreferrer"},u("console:develop.features.authenticationProvider.templates.google.wizardHelp.preRequisites.configureOAuthApps"))))}),o.createElement(r.Heading,{as:"h5"},u("console:develop.features.authenticationProvider.templates.google.wizardHelp.name.heading")),o.createElement("p",null,u(g?"console:develop.features.authenticationProvider.templates.google.wizardHelp.name.connectionDescription":"console:develop.features.authenticationProvider.templates.google.wizardHelp.name.idpDescription")),o.createElement(i.Z,null),o.createElement(r.Heading,{as:"h5"},u("console:develop.features.authenticationProvider.templates.google.wizardHelp.clientId.heading")),o.createElement("p",null,o.createElement(l.cC,{i18nKey:"console:develop.features.authenticationProvider.templates.google.wizardHelp.clientId.description"},"Provide the ",o.createElement(r.Code,null,"Client ID")," obtained from Google.")),o.createElement(i.Z,null),o.createElement(r.Heading,{as:"h5"},u("console:develop.features.authenticationProvider.templates.google.wizardHelp.clientSecret.heading")),o.createElement("p",null,o.createElement(l.cC,{i18nKey:"console:develop.features.authenticationProvider.templates.google.wizardHelp.clientSecret.description"},"Provide the ",o.createElement(r.Code,null,"Client Secret")," obtained from Google.")))};d.defaultProps={"data-testid":"google-idp-create-wizard-help"},t.default=d}}]);