/*
 * XML Type:  web-appType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebAppType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML web-appType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface WebAppType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebAppType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("webapptype1809type");
    
    /**
     * Gets a List of "description" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList();
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets a List of "display-name" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> getDisplayNameList();
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType[] getDisplayNameArray();
    
    /**
     * Gets ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayNameArray(int i);
    
    /**
     * Returns number of "display-name" element
     */
    int sizeOfDisplayNameArray();
    
    /**
     * Sets array of all "display-name" element
     */
    void setDisplayNameArray(com.sun.java.xml.ns.j2Ee.DisplayNameType[] displayNameArray);
    
    /**
     * Sets ith "display-name" element
     */
    void setDisplayNameArray(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType displayName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType insertNewDisplayName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName();
    
    /**
     * Removes the ith "display-name" element
     */
    void removeDisplayName(int i);
    
    /**
     * Gets a List of "icon" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.IconType> getIconList();
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.IconType[] getIconArray();
    
    /**
     * Gets ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType getIconArray(int i);
    
    /**
     * Returns number of "icon" element
     */
    int sizeOfIconArray();
    
    /**
     * Sets array of all "icon" element
     */
    void setIconArray(com.sun.java.xml.ns.j2Ee.IconType[] iconArray);
    
    /**
     * Sets ith "icon" element
     */
    void setIconArray(int i, com.sun.java.xml.ns.j2Ee.IconType icon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType insertNewIcon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType addNewIcon();
    
    /**
     * Removes the ith "icon" element
     */
    void removeIcon(int i);
    
    /**
     * Gets a List of "distributable" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EmptyType> getDistributableList();
    
    /**
     * Gets array of all "distributable" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EmptyType[] getDistributableArray();
    
    /**
     * Gets ith "distributable" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType getDistributableArray(int i);
    
    /**
     * Returns number of "distributable" element
     */
    int sizeOfDistributableArray();
    
    /**
     * Sets array of all "distributable" element
     */
    void setDistributableArray(com.sun.java.xml.ns.j2Ee.EmptyType[] distributableArray);
    
    /**
     * Sets ith "distributable" element
     */
    void setDistributableArray(int i, com.sun.java.xml.ns.j2Ee.EmptyType distributable);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributable" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType insertNewDistributable(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributable" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType addNewDistributable();
    
    /**
     * Removes the ith "distributable" element
     */
    void removeDistributable(int i);
    
    /**
     * Gets a List of "context-param" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> getContextParamList();
    
    /**
     * Gets array of all "context-param" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType[] getContextParamArray();
    
    /**
     * Gets ith "context-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType getContextParamArray(int i);
    
    /**
     * Returns number of "context-param" element
     */
    int sizeOfContextParamArray();
    
    /**
     * Sets array of all "context-param" element
     */
    void setContextParamArray(com.sun.java.xml.ns.j2Ee.ParamValueType[] contextParamArray);
    
    /**
     * Sets ith "context-param" element
     */
    void setContextParamArray(int i, com.sun.java.xml.ns.j2Ee.ParamValueType contextParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "context-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType insertNewContextParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "context-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType addNewContextParam();
    
    /**
     * Removes the ith "context-param" element
     */
    void removeContextParam(int i);
    
    /**
     * Gets a List of "filter" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.FilterType> getFilterList();
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.FilterType[] getFilterArray();
    
    /**
     * Gets ith "filter" element
     */
    com.sun.java.xml.ns.j2Ee.FilterType getFilterArray(int i);
    
    /**
     * Returns number of "filter" element
     */
    int sizeOfFilterArray();
    
    /**
     * Sets array of all "filter" element
     */
    void setFilterArray(com.sun.java.xml.ns.j2Ee.FilterType[] filterArray);
    
    /**
     * Sets ith "filter" element
     */
    void setFilterArray(int i, com.sun.java.xml.ns.j2Ee.FilterType filter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    com.sun.java.xml.ns.j2Ee.FilterType insertNewFilter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    com.sun.java.xml.ns.j2Ee.FilterType addNewFilter();
    
    /**
     * Removes the ith "filter" element
     */
    void removeFilter(int i);
    
    /**
     * Gets a List of "filter-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.FilterMappingType> getFilterMappingList();
    
    /**
     * Gets array of all "filter-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.FilterMappingType[] getFilterMappingArray();
    
    /**
     * Gets ith "filter-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.FilterMappingType getFilterMappingArray(int i);
    
    /**
     * Returns number of "filter-mapping" element
     */
    int sizeOfFilterMappingArray();
    
    /**
     * Sets array of all "filter-mapping" element
     */
    void setFilterMappingArray(com.sun.java.xml.ns.j2Ee.FilterMappingType[] filterMappingArray);
    
    /**
     * Sets ith "filter-mapping" element
     */
    void setFilterMappingArray(int i, com.sun.java.xml.ns.j2Ee.FilterMappingType filterMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.FilterMappingType insertNewFilterMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.FilterMappingType addNewFilterMapping();
    
    /**
     * Removes the ith "filter-mapping" element
     */
    void removeFilterMapping(int i);
    
    /**
     * Gets a List of "listener" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ListenerType> getListenerList();
    
    /**
     * Gets array of all "listener" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ListenerType[] getListenerArray();
    
    /**
     * Gets ith "listener" element
     */
    com.sun.java.xml.ns.j2Ee.ListenerType getListenerArray(int i);
    
    /**
     * Returns number of "listener" element
     */
    int sizeOfListenerArray();
    
    /**
     * Sets array of all "listener" element
     */
    void setListenerArray(com.sun.java.xml.ns.j2Ee.ListenerType[] listenerArray);
    
    /**
     * Sets ith "listener" element
     */
    void setListenerArray(int i, com.sun.java.xml.ns.j2Ee.ListenerType listener);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listener" element
     */
    com.sun.java.xml.ns.j2Ee.ListenerType insertNewListener(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listener" element
     */
    com.sun.java.xml.ns.j2Ee.ListenerType addNewListener();
    
    /**
     * Removes the ith "listener" element
     */
    void removeListener(int i);
    
    /**
     * Gets a List of "servlet" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServletType> getServletList();
    
    /**
     * Gets array of all "servlet" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServletType[] getServletArray();
    
    /**
     * Gets ith "servlet" element
     */
    com.sun.java.xml.ns.j2Ee.ServletType getServletArray(int i);
    
    /**
     * Returns number of "servlet" element
     */
    int sizeOfServletArray();
    
    /**
     * Sets array of all "servlet" element
     */
    void setServletArray(com.sun.java.xml.ns.j2Ee.ServletType[] servletArray);
    
    /**
     * Sets ith "servlet" element
     */
    void setServletArray(int i, com.sun.java.xml.ns.j2Ee.ServletType servlet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet" element
     */
    com.sun.java.xml.ns.j2Ee.ServletType insertNewServlet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet" element
     */
    com.sun.java.xml.ns.j2Ee.ServletType addNewServlet();
    
    /**
     * Removes the ith "servlet" element
     */
    void removeServlet(int i);
    
    /**
     * Gets a List of "servlet-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServletMappingType> getServletMappingList();
    
    /**
     * Gets array of all "servlet-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServletMappingType[] getServletMappingArray();
    
    /**
     * Gets ith "servlet-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServletMappingType getServletMappingArray(int i);
    
    /**
     * Returns number of "servlet-mapping" element
     */
    int sizeOfServletMappingArray();
    
    /**
     * Sets array of all "servlet-mapping" element
     */
    void setServletMappingArray(com.sun.java.xml.ns.j2Ee.ServletMappingType[] servletMappingArray);
    
    /**
     * Sets ith "servlet-mapping" element
     */
    void setServletMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServletMappingType servletMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServletMappingType insertNewServletMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServletMappingType addNewServletMapping();
    
    /**
     * Removes the ith "servlet-mapping" element
     */
    void removeServletMapping(int i);
    
    /**
     * Gets a List of "session-config" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SessionConfigType> getSessionConfigList();
    
    /**
     * Gets array of all "session-config" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SessionConfigType[] getSessionConfigArray();
    
    /**
     * Gets ith "session-config" element
     */
    com.sun.java.xml.ns.j2Ee.SessionConfigType getSessionConfigArray(int i);
    
    /**
     * Returns number of "session-config" element
     */
    int sizeOfSessionConfigArray();
    
    /**
     * Sets array of all "session-config" element
     */
    void setSessionConfigArray(com.sun.java.xml.ns.j2Ee.SessionConfigType[] sessionConfigArray);
    
    /**
     * Sets ith "session-config" element
     */
    void setSessionConfigArray(int i, com.sun.java.xml.ns.j2Ee.SessionConfigType sessionConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "session-config" element
     */
    com.sun.java.xml.ns.j2Ee.SessionConfigType insertNewSessionConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "session-config" element
     */
    com.sun.java.xml.ns.j2Ee.SessionConfigType addNewSessionConfig();
    
    /**
     * Removes the ith "session-config" element
     */
    void removeSessionConfig(int i);
    
    /**
     * Gets a List of "mime-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MimeMappingType> getMimeMappingList();
    
    /**
     * Gets array of all "mime-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MimeMappingType[] getMimeMappingArray();
    
    /**
     * Gets ith "mime-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MimeMappingType getMimeMappingArray(int i);
    
    /**
     * Returns number of "mime-mapping" element
     */
    int sizeOfMimeMappingArray();
    
    /**
     * Sets array of all "mime-mapping" element
     */
    void setMimeMappingArray(com.sun.java.xml.ns.j2Ee.MimeMappingType[] mimeMappingArray);
    
    /**
     * Sets ith "mime-mapping" element
     */
    void setMimeMappingArray(int i, com.sun.java.xml.ns.j2Ee.MimeMappingType mimeMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mime-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MimeMappingType insertNewMimeMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mime-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MimeMappingType addNewMimeMapping();
    
    /**
     * Removes the ith "mime-mapping" element
     */
    void removeMimeMapping(int i);
    
    /**
     * Gets a List of "welcome-file-list" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.WelcomeFileListType> getWelcomeFileListList();
    
    /**
     * Gets array of all "welcome-file-list" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.WelcomeFileListType[] getWelcomeFileListArray();
    
    /**
     * Gets ith "welcome-file-list" element
     */
    com.sun.java.xml.ns.j2Ee.WelcomeFileListType getWelcomeFileListArray(int i);
    
    /**
     * Returns number of "welcome-file-list" element
     */
    int sizeOfWelcomeFileListArray();
    
    /**
     * Sets array of all "welcome-file-list" element
     */
    void setWelcomeFileListArray(com.sun.java.xml.ns.j2Ee.WelcomeFileListType[] welcomeFileListArray);
    
    /**
     * Sets ith "welcome-file-list" element
     */
    void setWelcomeFileListArray(int i, com.sun.java.xml.ns.j2Ee.WelcomeFileListType welcomeFileList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "welcome-file-list" element
     */
    com.sun.java.xml.ns.j2Ee.WelcomeFileListType insertNewWelcomeFileList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "welcome-file-list" element
     */
    com.sun.java.xml.ns.j2Ee.WelcomeFileListType addNewWelcomeFileList();
    
    /**
     * Removes the ith "welcome-file-list" element
     */
    void removeWelcomeFileList(int i);
    
    /**
     * Gets a List of "error-page" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ErrorPageType> getErrorPageList();
    
    /**
     * Gets array of all "error-page" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ErrorPageType[] getErrorPageArray();
    
    /**
     * Gets ith "error-page" element
     */
    com.sun.java.xml.ns.j2Ee.ErrorPageType getErrorPageArray(int i);
    
    /**
     * Returns number of "error-page" element
     */
    int sizeOfErrorPageArray();
    
    /**
     * Sets array of all "error-page" element
     */
    void setErrorPageArray(com.sun.java.xml.ns.j2Ee.ErrorPageType[] errorPageArray);
    
    /**
     * Sets ith "error-page" element
     */
    void setErrorPageArray(int i, com.sun.java.xml.ns.j2Ee.ErrorPageType errorPage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error-page" element
     */
    com.sun.java.xml.ns.j2Ee.ErrorPageType insertNewErrorPage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error-page" element
     */
    com.sun.java.xml.ns.j2Ee.ErrorPageType addNewErrorPage();
    
    /**
     * Removes the ith "error-page" element
     */
    void removeErrorPage(int i);
    
    /**
     * Gets a List of "jsp-config" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.JspConfigType> getJspConfigList();
    
    /**
     * Gets array of all "jsp-config" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.JspConfigType[] getJspConfigArray();
    
    /**
     * Gets ith "jsp-config" element
     */
    com.sun.java.xml.ns.j2Ee.JspConfigType getJspConfigArray(int i);
    
    /**
     * Returns number of "jsp-config" element
     */
    int sizeOfJspConfigArray();
    
    /**
     * Sets array of all "jsp-config" element
     */
    void setJspConfigArray(com.sun.java.xml.ns.j2Ee.JspConfigType[] jspConfigArray);
    
    /**
     * Sets ith "jsp-config" element
     */
    void setJspConfigArray(int i, com.sun.java.xml.ns.j2Ee.JspConfigType jspConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jsp-config" element
     */
    com.sun.java.xml.ns.j2Ee.JspConfigType insertNewJspConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jsp-config" element
     */
    com.sun.java.xml.ns.j2Ee.JspConfigType addNewJspConfig();
    
    /**
     * Removes the ith "jsp-config" element
     */
    void removeJspConfig(int i);
    
    /**
     * Gets a List of "security-constraint" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SecurityConstraintType> getSecurityConstraintList();
    
    /**
     * Gets array of all "security-constraint" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SecurityConstraintType[] getSecurityConstraintArray();
    
    /**
     * Gets ith "security-constraint" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityConstraintType getSecurityConstraintArray(int i);
    
    /**
     * Returns number of "security-constraint" element
     */
    int sizeOfSecurityConstraintArray();
    
    /**
     * Sets array of all "security-constraint" element
     */
    void setSecurityConstraintArray(com.sun.java.xml.ns.j2Ee.SecurityConstraintType[] securityConstraintArray);
    
    /**
     * Sets ith "security-constraint" element
     */
    void setSecurityConstraintArray(int i, com.sun.java.xml.ns.j2Ee.SecurityConstraintType securityConstraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-constraint" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityConstraintType insertNewSecurityConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-constraint" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityConstraintType addNewSecurityConstraint();
    
    /**
     * Removes the ith "security-constraint" element
     */
    void removeSecurityConstraint(int i);
    
    /**
     * Gets a List of "login-config" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.LoginConfigType> getLoginConfigList();
    
    /**
     * Gets array of all "login-config" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.LoginConfigType[] getLoginConfigArray();
    
    /**
     * Gets ith "login-config" element
     */
    com.sun.java.xml.ns.j2Ee.LoginConfigType getLoginConfigArray(int i);
    
    /**
     * Returns number of "login-config" element
     */
    int sizeOfLoginConfigArray();
    
    /**
     * Sets array of all "login-config" element
     */
    void setLoginConfigArray(com.sun.java.xml.ns.j2Ee.LoginConfigType[] loginConfigArray);
    
    /**
     * Sets ith "login-config" element
     */
    void setLoginConfigArray(int i, com.sun.java.xml.ns.j2Ee.LoginConfigType loginConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-config" element
     */
    com.sun.java.xml.ns.j2Ee.LoginConfigType insertNewLoginConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-config" element
     */
    com.sun.java.xml.ns.j2Ee.LoginConfigType addNewLoginConfig();
    
    /**
     * Removes the ith "login-config" element
     */
    void removeLoginConfig(int i);
    
    /**
     * Gets a List of "security-role" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleType> getSecurityRoleList();
    
    /**
     * Gets array of all "security-role" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType[] getSecurityRoleArray();
    
    /**
     * Gets ith "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType getSecurityRoleArray(int i);
    
    /**
     * Returns number of "security-role" element
     */
    int sizeOfSecurityRoleArray();
    
    /**
     * Sets array of all "security-role" element
     */
    void setSecurityRoleArray(com.sun.java.xml.ns.j2Ee.SecurityRoleType[] securityRoleArray);
    
    /**
     * Sets ith "security-role" element
     */
    void setSecurityRoleArray(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType securityRole);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType insertNewSecurityRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType addNewSecurityRole();
    
    /**
     * Removes the ith "security-role" element
     */
    void removeSecurityRole(int i);
    
    /**
     * Gets a List of "env-entry" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EnvEntryType> getEnvEntryList();
    
    /**
     * Gets array of all "env-entry" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType[] getEnvEntryArray();
    
    /**
     * Gets ith "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType getEnvEntryArray(int i);
    
    /**
     * Returns number of "env-entry" element
     */
    int sizeOfEnvEntryArray();
    
    /**
     * Sets array of all "env-entry" element
     */
    void setEnvEntryArray(com.sun.java.xml.ns.j2Ee.EnvEntryType[] envEntryArray);
    
    /**
     * Sets ith "env-entry" element
     */
    void setEnvEntryArray(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType envEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType insertNewEnvEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType addNewEnvEntry();
    
    /**
     * Removes the ith "env-entry" element
     */
    void removeEnvEntry(int i);
    
    /**
     * Gets a List of "ejb-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EjbRefType> getEjbRefList();
    
    /**
     * Gets array of all "ejb-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType[] getEjbRefArray();
    
    /**
     * Gets ith "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType getEjbRefArray(int i);
    
    /**
     * Returns number of "ejb-ref" element
     */
    int sizeOfEjbRefArray();
    
    /**
     * Sets array of all "ejb-ref" element
     */
    void setEjbRefArray(com.sun.java.xml.ns.j2Ee.EjbRefType[] ejbRefArray);
    
    /**
     * Sets ith "ejb-ref" element
     */
    void setEjbRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbRefType ejbRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType insertNewEjbRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType addNewEjbRef();
    
    /**
     * Removes the ith "ejb-ref" element
     */
    void removeEjbRef(int i);
    
    /**
     * Gets a List of "ejb-local-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EjbLocalRefType> getEjbLocalRefList();
    
    /**
     * Gets array of all "ejb-local-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] getEjbLocalRefArray();
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType getEjbLocalRefArray(int i);
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    int sizeOfEjbLocalRefArray();
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    void setEjbLocalRefArray(com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] ejbLocalRefArray);
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    void setEjbLocalRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType ejbLocalRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType insertNewEjbLocalRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType addNewEjbLocalRef();
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    void removeEjbLocalRef(int i);
    
    /**
     * Gets a List of "service-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefType> getServiceRefList();
    
    /**
     * Gets array of all "service-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType[] getServiceRefArray();
    
    /**
     * Gets ith "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType getServiceRefArray(int i);
    
    /**
     * Returns number of "service-ref" element
     */
    int sizeOfServiceRefArray();
    
    /**
     * Sets array of all "service-ref" element
     */
    void setServiceRefArray(com.sun.java.xml.ns.j2Ee.ServiceRefType[] serviceRefArray);
    
    /**
     * Sets ith "service-ref" element
     */
    void setServiceRefArray(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType serviceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType insertNewServiceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType addNewServiceRef();
    
    /**
     * Removes the ith "service-ref" element
     */
    void removeServiceRef(int i);
    
    /**
     * Gets a List of "resource-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ResourceRefType> getResourceRefList();
    
    /**
     * Gets array of all "resource-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType[] getResourceRefArray();
    
    /**
     * Gets ith "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType getResourceRefArray(int i);
    
    /**
     * Returns number of "resource-ref" element
     */
    int sizeOfResourceRefArray();
    
    /**
     * Sets array of all "resource-ref" element
     */
    void setResourceRefArray(com.sun.java.xml.ns.j2Ee.ResourceRefType[] resourceRefArray);
    
    /**
     * Sets ith "resource-ref" element
     */
    void setResourceRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType resourceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType insertNewResourceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType addNewResourceRef();
    
    /**
     * Removes the ith "resource-ref" element
     */
    void removeResourceRef(int i);
    
    /**
     * Gets a List of "resource-env-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType> getResourceEnvRefList();
    
    /**
     * Gets array of all "resource-env-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] getResourceEnvRefArray();
    
    /**
     * Gets ith "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType getResourceEnvRefArray(int i);
    
    /**
     * Returns number of "resource-env-ref" element
     */
    int sizeOfResourceEnvRefArray();
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    void setResourceEnvRefArray(com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] resourceEnvRefArray);
    
    /**
     * Sets ith "resource-env-ref" element
     */
    void setResourceEnvRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType resourceEnvRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType insertNewResourceEnvRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType addNewResourceEnvRef();
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    void removeResourceEnvRef(int i);
    
    /**
     * Gets a List of "message-destination-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType> getMessageDestinationRefList();
    
    /**
     * Gets array of all "message-destination-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] getMessageDestinationRefArray();
    
    /**
     * Gets ith "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType getMessageDestinationRefArray(int i);
    
    /**
     * Returns number of "message-destination-ref" element
     */
    int sizeOfMessageDestinationRefArray();
    
    /**
     * Sets array of all "message-destination-ref" element
     */
    void setMessageDestinationRefArray(com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] messageDestinationRefArray);
    
    /**
     * Sets ith "message-destination-ref" element
     */
    void setMessageDestinationRefArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType messageDestinationRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType insertNewMessageDestinationRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType addNewMessageDestinationRef();
    
    /**
     * Removes the ith "message-destination-ref" element
     */
    void removeMessageDestinationRef(int i);
    
    /**
     * Gets a List of "message-destination" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationType> getMessageDestinationList();
    
    /**
     * Gets array of all "message-destination" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType[] getMessageDestinationArray();
    
    /**
     * Gets ith "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType getMessageDestinationArray(int i);
    
    /**
     * Returns number of "message-destination" element
     */
    int sizeOfMessageDestinationArray();
    
    /**
     * Sets array of all "message-destination" element
     */
    void setMessageDestinationArray(com.sun.java.xml.ns.j2Ee.MessageDestinationType[] messageDestinationArray);
    
    /**
     * Sets ith "message-destination" element
     */
    void setMessageDestinationArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType messageDestination);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType insertNewMessageDestination(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType addNewMessageDestination();
    
    /**
     * Removes the ith "message-destination" element
     */
    void removeMessageDestination(int i);
    
    /**
     * Gets a List of "locale-encoding-mapping-list" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType> getLocaleEncodingMappingListList();
    
    /**
     * Gets array of all "locale-encoding-mapping-list" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[] getLocaleEncodingMappingListArray();
    
    /**
     * Gets ith "locale-encoding-mapping-list" element
     */
    com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType getLocaleEncodingMappingListArray(int i);
    
    /**
     * Returns number of "locale-encoding-mapping-list" element
     */
    int sizeOfLocaleEncodingMappingListArray();
    
    /**
     * Sets array of all "locale-encoding-mapping-list" element
     */
    void setLocaleEncodingMappingListArray(com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[] localeEncodingMappingListArray);
    
    /**
     * Sets ith "locale-encoding-mapping-list" element
     */
    void setLocaleEncodingMappingListArray(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType localeEncodingMappingList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale-encoding-mapping-list" element
     */
    com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType insertNewLocaleEncodingMappingList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale-encoding-mapping-list" element
     */
    com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType addNewLocaleEncodingMappingList();
    
    /**
     * Removes the ith "locale-encoding-mapping-list" element
     */
    void removeLocaleEncodingMappingList(int i);
    
    /**
     * Gets the "version" attribute
     */
    com.sun.java.xml.ns.j2Ee.WebAppVersionType.Enum getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    com.sun.java.xml.ns.j2Ee.WebAppVersionType xgetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(com.sun.java.xml.ns.j2Ee.WebAppVersionType.Enum version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(com.sun.java.xml.ns.j2Ee.WebAppVersionType version);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.j2Ee.WebAppType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WebAppType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WebAppType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
