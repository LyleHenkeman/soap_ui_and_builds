/*
 * An XML document type.
 * Localname: resource
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ResourceDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one resource(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface ResourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("resource7828doctype");
    
    /**
     * Gets the "resource" element
     */
    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource getResource();
    
    /**
     * Sets the "resource" element
     */
    void setResource(net.java.dev.wadl.x2009.x02.ResourceDocument.Resource resource);
    
    /**
     * Appends and returns a new empty "resource" element
     */
    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource addNewResource();
    
    /**
     * An XML resource(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Resource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("resource55d2elemtype");
        
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
         * Gets a List of "param" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.ParamDocument.Param> getParamList();
        
        /**
         * Gets array of all "param" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.ParamDocument.Param[] getParamArray();
        
        /**
         * Gets ith "param" element
         */
        net.java.dev.wadl.x2009.x02.ParamDocument.Param getParamArray(int i);
        
        /**
         * Returns number of "param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "param" element
         */
        void setParamArray(net.java.dev.wadl.x2009.x02.ParamDocument.Param[] paramArray);
        
        /**
         * Sets ith "param" element
         */
        void setParamArray(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        net.java.dev.wadl.x2009.x02.ParamDocument.Param insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        net.java.dev.wadl.x2009.x02.ParamDocument.Param addNewParam();
        
        /**
         * Removes the ith "param" element
         */
        void removeParam(int i);
        
        /**
         * Gets a List of "method" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.MethodDocument.Method> getMethodList();
        
        /**
         * Gets array of all "method" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.MethodDocument.Method[] getMethodArray();
        
        /**
         * Gets ith "method" element
         */
        net.java.dev.wadl.x2009.x02.MethodDocument.Method getMethodArray(int i);
        
        /**
         * Returns number of "method" element
         */
        int sizeOfMethodArray();
        
        /**
         * Sets array of all "method" element
         */
        void setMethodArray(net.java.dev.wadl.x2009.x02.MethodDocument.Method[] methodArray);
        
        /**
         * Sets ith "method" element
         */
        void setMethodArray(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method method);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "method" element
         */
        net.java.dev.wadl.x2009.x02.MethodDocument.Method insertNewMethod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "method" element
         */
        net.java.dev.wadl.x2009.x02.MethodDocument.Method addNewMethod();
        
        /**
         * Removes the ith "method" element
         */
        void removeMethod(int i);
        
        /**
         * Gets a List of "resource" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource> getResourceList();
        
        /**
         * Gets array of all "resource" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[] getResourceArray();
        
        /**
         * Gets ith "resource" element
         */
        net.java.dev.wadl.x2009.x02.ResourceDocument.Resource getResourceArray(int i);
        
        /**
         * Returns number of "resource" element
         */
        int sizeOfResourceArray();
        
        /**
         * Sets array of all "resource" element
         */
        void setResourceArray(net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[] resourceArray);
        
        /**
         * Sets ith "resource" element
         */
        void setResourceArray(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource resource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource" element
         */
        net.java.dev.wadl.x2009.x02.ResourceDocument.Resource insertNewResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource" element
         */
        net.java.dev.wadl.x2009.x02.ResourceDocument.Resource addNewResource();
        
        /**
         * Removes the ith "resource" element
         */
        void removeResource(int i);
        
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
        java.util.List getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        net.java.dev.wadl.x2009.x02.ResourceTypeList xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.util.List type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(net.java.dev.wadl.x2009.x02.ResourceTypeList type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "queryType" attribute
         */
        java.lang.String getQueryType();
        
        /**
         * Gets (as xml) the "queryType" attribute
         */
        org.apache.xmlbeans.XmlString xgetQueryType();
        
        /**
         * True if has "queryType" attribute
         */
        boolean isSetQueryType();
        
        /**
         * Sets the "queryType" attribute
         */
        void setQueryType(java.lang.String queryType);
        
        /**
         * Sets (as xml) the "queryType" attribute
         */
        void xsetQueryType(org.apache.xmlbeans.XmlString queryType);
        
        /**
         * Unsets the "queryType" attribute
         */
        void unsetQueryType();
        
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
            public static net.java.dev.wadl.x2009.x02.ResourceDocument.Resource newInstance() {
              return (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.ResourceDocument.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.ResourceDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
