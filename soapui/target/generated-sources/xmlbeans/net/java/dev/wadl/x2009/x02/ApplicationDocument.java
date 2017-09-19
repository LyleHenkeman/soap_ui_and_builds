/*
 * An XML document type.
 * Localname: application
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one application(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface ApplicationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplicationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("applicationca78doctype");
    
    /**
     * Gets the "application" element
     */
    net.java.dev.wadl.x2009.x02.ApplicationDocument.Application getApplication();
    
    /**
     * Sets the "application" element
     */
    void setApplication(net.java.dev.wadl.x2009.x02.ApplicationDocument.Application application);
    
    /**
     * Appends and returns a new empty "application" element
     */
    net.java.dev.wadl.x2009.x02.ApplicationDocument.Application addNewApplication();
    
    /**
     * An XML application(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Application extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Application.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("applicationdd3celemtype");
        
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
         * Gets the "grammars" element
         */
        net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars getGrammars();
        
        /**
         * True if has "grammars" element
         */
        boolean isSetGrammars();
        
        /**
         * Sets the "grammars" element
         */
        void setGrammars(net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars grammars);
        
        /**
         * Appends and returns a new empty "grammars" element
         */
        net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars addNewGrammars();
        
        /**
         * Unsets the "grammars" element
         */
        void unsetGrammars();
        
        /**
         * Gets a List of "resources" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources> getResourcesList();
        
        /**
         * Gets array of all "resources" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[] getResourcesArray();
        
        /**
         * Gets ith "resources" element
         */
        net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources getResourcesArray(int i);
        
        /**
         * Returns number of "resources" element
         */
        int sizeOfResourcesArray();
        
        /**
         * Sets array of all "resources" element
         */
        void setResourcesArray(net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[] resourcesArray);
        
        /**
         * Sets ith "resources" element
         */
        void setResourcesArray(int i, net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources resources);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resources" element
         */
        net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources insertNewResources(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resources" element
         */
        net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources addNewResources();
        
        /**
         * Removes the ith "resources" element
         */
        void removeResources(int i);
        
        /**
         * Gets a List of "resource_type" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType> getResourceTypeList();
        
        /**
         * Gets array of all "resource_type" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[] getResourceTypeArray();
        
        /**
         * Gets ith "resource_type" element
         */
        net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType getResourceTypeArray(int i);
        
        /**
         * Returns number of "resource_type" element
         */
        int sizeOfResourceTypeArray();
        
        /**
         * Sets array of all "resource_type" element
         */
        void setResourceTypeArray(net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[] resourceTypeArray);
        
        /**
         * Sets ith "resource_type" element
         */
        void setResourceTypeArray(int i, net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType resourceType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource_type" element
         */
        net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType insertNewResourceType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource_type" element
         */
        net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType addNewResourceType();
        
        /**
         * Removes the ith "resource_type" element
         */
        void removeResourceType(int i);
        
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
         * Gets a List of "representation" elements
         */
        java.util.List<net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation> getRepresentationList();
        
        /**
         * Gets array of all "representation" elements
         * @deprecated
         */
        net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[] getRepresentationArray();
        
        /**
         * Gets ith "representation" element
         */
        net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation getRepresentationArray(int i);
        
        /**
         * Returns number of "representation" element
         */
        int sizeOfRepresentationArray();
        
        /**
         * Sets array of all "representation" element
         */
        void setRepresentationArray(net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[] representationArray);
        
        /**
         * Sets ith "representation" element
         */
        void setRepresentationArray(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation representation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "representation" element
         */
        net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation insertNewRepresentation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "representation" element
         */
        net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation addNewRepresentation();
        
        /**
         * Removes the ith "representation" element
         */
        void removeRepresentation(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.java.dev.wadl.x2009.x02.ApplicationDocument.Application newInstance() {
              return (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.ApplicationDocument.Application newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.ApplicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.ApplicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
