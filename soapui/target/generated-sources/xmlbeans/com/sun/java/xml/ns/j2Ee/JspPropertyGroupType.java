/*
 * XML Type:  jsp-property-groupType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JspPropertyGroupType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML jsp-property-groupType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface JspPropertyGroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JspPropertyGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("jsppropertygrouptype9be0type");
    
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
     * Gets a List of "url-pattern" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.UrlPatternType> getUrlPatternList();
    
    /**
     * Gets array of all "url-pattern" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.UrlPatternType[] getUrlPatternArray();
    
    /**
     * Gets ith "url-pattern" element
     */
    com.sun.java.xml.ns.j2Ee.UrlPatternType getUrlPatternArray(int i);
    
    /**
     * Returns number of "url-pattern" element
     */
    int sizeOfUrlPatternArray();
    
    /**
     * Sets array of all "url-pattern" element
     */
    void setUrlPatternArray(com.sun.java.xml.ns.j2Ee.UrlPatternType[] urlPatternArray);
    
    /**
     * Sets ith "url-pattern" element
     */
    void setUrlPatternArray(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType urlPattern);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "url-pattern" element
     */
    com.sun.java.xml.ns.j2Ee.UrlPatternType insertNewUrlPattern(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "url-pattern" element
     */
    com.sun.java.xml.ns.j2Ee.UrlPatternType addNewUrlPattern();
    
    /**
     * Removes the ith "url-pattern" element
     */
    void removeUrlPattern(int i);
    
    /**
     * Gets the "el-ignored" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType getElIgnored();
    
    /**
     * True if has "el-ignored" element
     */
    boolean isSetElIgnored();
    
    /**
     * Sets the "el-ignored" element
     */
    void setElIgnored(com.sun.java.xml.ns.j2Ee.TrueFalseType elIgnored);
    
    /**
     * Appends and returns a new empty "el-ignored" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType addNewElIgnored();
    
    /**
     * Unsets the "el-ignored" element
     */
    void unsetElIgnored();
    
    /**
     * Gets the "page-encoding" element
     */
    com.sun.java.xml.ns.j2Ee.String getPageEncoding();
    
    /**
     * True if has "page-encoding" element
     */
    boolean isSetPageEncoding();
    
    /**
     * Sets the "page-encoding" element
     */
    void setPageEncoding(com.sun.java.xml.ns.j2Ee.String pageEncoding);
    
    /**
     * Appends and returns a new empty "page-encoding" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewPageEncoding();
    
    /**
     * Unsets the "page-encoding" element
     */
    void unsetPageEncoding();
    
    /**
     * Gets the "scripting-invalid" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType getScriptingInvalid();
    
    /**
     * True if has "scripting-invalid" element
     */
    boolean isSetScriptingInvalid();
    
    /**
     * Sets the "scripting-invalid" element
     */
    void setScriptingInvalid(com.sun.java.xml.ns.j2Ee.TrueFalseType scriptingInvalid);
    
    /**
     * Appends and returns a new empty "scripting-invalid" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType addNewScriptingInvalid();
    
    /**
     * Unsets the "scripting-invalid" element
     */
    void unsetScriptingInvalid();
    
    /**
     * Gets the "is-xml" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType getIsXml();
    
    /**
     * True if has "is-xml" element
     */
    boolean isSetIsXml();
    
    /**
     * Sets the "is-xml" element
     */
    void setIsXml(com.sun.java.xml.ns.j2Ee.TrueFalseType isXml);
    
    /**
     * Appends and returns a new empty "is-xml" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType addNewIsXml();
    
    /**
     * Unsets the "is-xml" element
     */
    void unsetIsXml();
    
    /**
     * Gets a List of "include-prelude" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PathType> getIncludePreludeList();
    
    /**
     * Gets array of all "include-prelude" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PathType[] getIncludePreludeArray();
    
    /**
     * Gets ith "include-prelude" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getIncludePreludeArray(int i);
    
    /**
     * Returns number of "include-prelude" element
     */
    int sizeOfIncludePreludeArray();
    
    /**
     * Sets array of all "include-prelude" element
     */
    void setIncludePreludeArray(com.sun.java.xml.ns.j2Ee.PathType[] includePreludeArray);
    
    /**
     * Sets ith "include-prelude" element
     */
    void setIncludePreludeArray(int i, com.sun.java.xml.ns.j2Ee.PathType includePrelude);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include-prelude" element
     */
    com.sun.java.xml.ns.j2Ee.PathType insertNewIncludePrelude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include-prelude" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewIncludePrelude();
    
    /**
     * Removes the ith "include-prelude" element
     */
    void removeIncludePrelude(int i);
    
    /**
     * Gets a List of "include-coda" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PathType> getIncludeCodaList();
    
    /**
     * Gets array of all "include-coda" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PathType[] getIncludeCodaArray();
    
    /**
     * Gets ith "include-coda" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getIncludeCodaArray(int i);
    
    /**
     * Returns number of "include-coda" element
     */
    int sizeOfIncludeCodaArray();
    
    /**
     * Sets array of all "include-coda" element
     */
    void setIncludeCodaArray(com.sun.java.xml.ns.j2Ee.PathType[] includeCodaArray);
    
    /**
     * Sets ith "include-coda" element
     */
    void setIncludeCodaArray(int i, com.sun.java.xml.ns.j2Ee.PathType includeCoda);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include-coda" element
     */
    com.sun.java.xml.ns.j2Ee.PathType insertNewIncludeCoda(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include-coda" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewIncludeCoda();
    
    /**
     * Removes the ith "include-coda" element
     */
    void removeIncludeCoda(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JspPropertyGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JspPropertyGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
