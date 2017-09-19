/*
 * An XML document type.
 * Localname: method
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.MethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one method(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface MethodDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MethodDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("method4f75doctype");
    
    /**
     * Gets the "method" element
     */
    net.java.dev.wadl.x2009.x02.MethodDocument.Method getMethod();
    
    /**
     * Sets the "method" element
     */
    void setMethod(net.java.dev.wadl.x2009.x02.MethodDocument.Method method);
    
    /**
     * Appends and returns a new empty "method" element
     */
    net.java.dev.wadl.x2009.x02.MethodDocument.Method addNewMethod();
    
    /**
     * An XML method(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Method extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Method.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("methodaab2elemtype");
        
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
         * Gets the "request" element
         */
        net.java.dev.wadl.x2009.x02.RequestDocument.Request getRequest();
        
        /**
         * True if has "request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "request" element
         */
        void setRequest(net.java.dev.wadl.x2009.x02.RequestDocument.Request request);
        
        /**
         * Appends and returns a new empty "request" element
         */
        net.java.dev.wadl.x2009.x02.RequestDocument.Request addNewRequest();
        
        /**
         * Unsets the "request" element
         */
        void unsetRequest();
        
        /**
         * Gets a List of "response" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.ResponseDocument.Response> getResponseList();
        
        /**
         * Gets array of all "response" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.ResponseDocument.Response[] getResponseArray();
        
        /**
         * Gets ith "response" element
         */
        net.java.dev.wadl.x2009.x02.ResponseDocument.Response getResponseArray(int i);
        
        /**
         * Returns number of "response" element
         */
        int sizeOfResponseArray();
        
        /**
         * Sets array of all "response" element
         */
        void setResponseArray(net.java.dev.wadl.x2009.x02.ResponseDocument.Response[] responseArray);
        
        /**
         * Sets ith "response" element
         */
        void setResponseArray(int i, net.java.dev.wadl.x2009.x02.ResponseDocument.Response response);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "response" element
         */
        net.java.dev.wadl.x2009.x02.ResponseDocument.Response insertNewResponse(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "response" element
         */
        net.java.dev.wadl.x2009.x02.ResponseDocument.Response addNewResponse();
        
        /**
         * Removes the ith "response" element
         */
        void removeResponse(int i);
        
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
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        net.java.dev.wadl.x2009.x02.Method xgetName();
        
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
        void xsetName(net.java.dev.wadl.x2009.x02.Method name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.java.dev.wadl.x2009.x02.MethodDocument.Method newInstance() {
              return (net.java.dev.wadl.x2009.x02.MethodDocument.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.MethodDocument.Method newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.MethodDocument.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.MethodDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.MethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.MethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
