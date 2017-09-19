/*
 * An XML document type.
 * Localname: param
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one param(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface ParamDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParamDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("paramc19bdoctype");
    
    /**
     * Gets the "param" element
     */
    net.java.dev.wadl.x2009.x02.ParamDocument.Param getParam();
    
    /**
     * Sets the "param" element
     */
    void setParam(net.java.dev.wadl.x2009.x02.ParamDocument.Param param);
    
    /**
     * Appends and returns a new empty "param" element
     */
    net.java.dev.wadl.x2009.x02.ParamDocument.Param addNewParam();
    
    /**
     * An XML param(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Param extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Param.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("param7ec2elemtype");
        
        /**
         * Gets a List of "doc" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList();
        
        /**
         * Gets array of all "doc" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.DocDocument.Doc[] getDocArray();
        
        /**
         * Gets ith "doc" element
         */
        net.java.dev.wadl.x2009.x02.DocDocument.Doc getDocArray(int i);
        
        /**
         * Returns number of "doc" element
         */
        int sizeOfDocArray();
        
        /**
         * Sets array of all "doc" element
         */
        void setDocArray(net.java.dev.wadl.x2009.x02.DocDocument.Doc[] docArray);
        
        /**
         * Sets ith "doc" element
         */
        void setDocArray(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc doc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "doc" element
         */
        net.java.dev.wadl.x2009.x02.DocDocument.Doc insertNewDoc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "doc" element
         */
        net.java.dev.wadl.x2009.x02.DocDocument.Doc addNewDoc();
        
        /**
         * Removes the ith "doc" element
         */
        void removeDoc(int i);
        
        /**
         * Gets a List of "option" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.OptionDocument.Option> getOptionList();
        
        /**
         * Gets array of all "option" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.OptionDocument.Option[] getOptionArray();
        
        /**
         * Gets ith "option" element
         */
        net.java.dev.wadl.x2009.x02.OptionDocument.Option getOptionArray(int i);
        
        /**
         * Returns number of "option" element
         */
        int sizeOfOptionArray();
        
        /**
         * Sets array of all "option" element
         */
        void setOptionArray(net.java.dev.wadl.x2009.x02.OptionDocument.Option[] optionArray);
        
        /**
         * Sets ith "option" element
         */
        void setOptionArray(int i, net.java.dev.wadl.x2009.x02.OptionDocument.Option option);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "option" element
         */
        net.java.dev.wadl.x2009.x02.OptionDocument.Option insertNewOption(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "option" element
         */
        net.java.dev.wadl.x2009.x02.OptionDocument.Option addNewOption();
        
        /**
         * Removes the ith "option" element
         */
        void removeOption(int i);
        
        /**
         * Gets the "link" element
         */
        net.java.dev.wadl.x2009.x02.LinkDocument.Link getLink();
        
        /**
         * True if has "link" element
         */
        boolean isSetLink();
        
        /**
         * Sets the "link" element
         */
        void setLink(net.java.dev.wadl.x2009.x02.LinkDocument.Link link);
        
        /**
         * Appends and returns a new empty "link" element
         */
        net.java.dev.wadl.x2009.x02.LinkDocument.Link addNewLink();
        
        /**
         * Unsets the "link" element
         */
        void unsetLink();
        
        /**
         * Gets the "href" attribute
         */
        java.lang.String getHref();
        
        /**
         * Gets (as xml) the "href" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetHref();
        
        /**
         * True if has "href" attribute
         */
        boolean isSetHref();
        
        /**
         * Sets the "href" attribute
         */
        void setHref(java.lang.String href);
        
        /**
         * Sets (as xml) the "href" attribute
         */
        void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
        
        /**
         * Unsets the "href" attribute
         */
        void unsetHref();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlNMTOKEN name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "style" attribute
         */
        net.java.dev.wadl.x2009.x02.ParamStyle.Enum getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        net.java.dev.wadl.x2009.x02.ParamStyle xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(net.java.dev.wadl.x2009.x02.ParamStyle.Enum style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(net.java.dev.wadl.x2009.x02.ParamStyle style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
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
         * Gets the "type" attribute
         */
        javax.xml.namespace.QName getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlQName xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(javax.xml.namespace.QName type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlQName type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "default" attribute
         */
        java.lang.String getDefault();
        
        /**
         * Gets (as xml) the "default" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefault();
        
        /**
         * True if has "default" attribute
         */
        boolean isSetDefault();
        
        /**
         * Sets the "default" attribute
         */
        void setDefault(java.lang.String xdefault);
        
        /**
         * Sets (as xml) the "default" attribute
         */
        void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
        
        /**
         * Unsets the "default" attribute
         */
        void unsetDefault();
        
        /**
         * Gets the "required" attribute
         */
        boolean getRequired();
        
        /**
         * Gets (as xml) the "required" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetRequired();
        
        /**
         * True if has "required" attribute
         */
        boolean isSetRequired();
        
        /**
         * Sets the "required" attribute
         */
        void setRequired(boolean required);
        
        /**
         * Sets (as xml) the "required" attribute
         */
        void xsetRequired(org.apache.xmlbeans.XmlBoolean required);
        
        /**
         * Unsets the "required" attribute
         */
        void unsetRequired();
        
        /**
         * Gets the "repeating" attribute
         */
        boolean getRepeating();
        
        /**
         * Gets (as xml) the "repeating" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetRepeating();
        
        /**
         * True if has "repeating" attribute
         */
        boolean isSetRepeating();
        
        /**
         * Sets the "repeating" attribute
         */
        void setRepeating(boolean repeating);
        
        /**
         * Sets (as xml) the "repeating" attribute
         */
        void xsetRepeating(org.apache.xmlbeans.XmlBoolean repeating);
        
        /**
         * Unsets the "repeating" attribute
         */
        void unsetRepeating();
        
        /**
         * Gets the "fixed" attribute
         */
        java.lang.String getFixed();
        
        /**
         * Gets (as xml) the "fixed" attribute
         */
        org.apache.xmlbeans.XmlString xgetFixed();
        
        /**
         * True if has "fixed" attribute
         */
        boolean isSetFixed();
        
        /**
         * Sets the "fixed" attribute
         */
        void setFixed(java.lang.String fixed);
        
        /**
         * Sets (as xml) the "fixed" attribute
         */
        void xsetFixed(org.apache.xmlbeans.XmlString fixed);
        
        /**
         * Unsets the "fixed" attribute
         */
        void unsetFixed();
        
        /**
         * Gets the "path" attribute
         */
        java.lang.String getPath();
        
        /**
         * Gets (as xml) the "path" attribute
         */
        org.apache.xmlbeans.XmlString xgetPath();
        
        /**
         * True if has "path" attribute
         */
        boolean isSetPath();
        
        /**
         * Sets the "path" attribute
         */
        void setPath(java.lang.String path);
        
        /**
         * Sets (as xml) the "path" attribute
         */
        void xsetPath(org.apache.xmlbeans.XmlString path);
        
        /**
         * Unsets the "path" attribute
         */
        void unsetPath();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.java.dev.wadl.x2009.x02.ParamDocument.Param newInstance() {
              return (net.java.dev.wadl.x2009.x02.ParamDocument.Param) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.ParamDocument.Param newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.ParamDocument.Param) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.ParamDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ParamDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ParamDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
