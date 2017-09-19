/*
 * An XML document type.
 * Localname: representation
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.RepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one representation(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface RepresentationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepresentationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("representation1e09doctype");
    
    /**
     * Gets the "representation" element
     */
    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation getRepresentation();
    
    /**
     * Sets the "representation" element
     */
    void setRepresentation(net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation representation);
    
    /**
     * Appends and returns a new empty "representation" element
     */
    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation addNewRepresentation();
    
    /**
     * An XML representation(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Representation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Representation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("representation0932elemtype");
        
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
         * Gets the "element" attribute
         */
        javax.xml.namespace.QName getElement();
        
        /**
         * Gets (as xml) the "element" attribute
         */
        org.apache.xmlbeans.XmlQName xgetElement();
        
        /**
         * True if has "element" attribute
         */
        boolean isSetElement();
        
        /**
         * Sets the "element" attribute
         */
        void setElement(javax.xml.namespace.QName element);
        
        /**
         * Sets (as xml) the "element" attribute
         */
        void xsetElement(org.apache.xmlbeans.XmlQName element);
        
        /**
         * Unsets the "element" attribute
         */
        void unsetElement();
        
        /**
         * Gets the "mediaType" attribute
         */
        java.lang.String getMediaType();
        
        /**
         * Gets (as xml) the "mediaType" attribute
         */
        org.apache.xmlbeans.XmlString xgetMediaType();
        
        /**
         * True if has "mediaType" attribute
         */
        boolean isSetMediaType();
        
        /**
         * Sets the "mediaType" attribute
         */
        void setMediaType(java.lang.String mediaType);
        
        /**
         * Sets (as xml) the "mediaType" attribute
         */
        void xsetMediaType(org.apache.xmlbeans.XmlString mediaType);
        
        /**
         * Unsets the "mediaType" attribute
         */
        void unsetMediaType();
        
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
         * Gets the "profile" attribute
         */
        java.util.List getProfile();
        
        /**
         * Gets (as xml) the "profile" attribute
         */
        net.java.dev.wadl.x2009.x02.UriList xgetProfile();
        
        /**
         * True if has "profile" attribute
         */
        boolean isSetProfile();
        
        /**
         * Sets the "profile" attribute
         */
        void setProfile(java.util.List profile);
        
        /**
         * Sets (as xml) the "profile" attribute
         */
        void xsetProfile(net.java.dev.wadl.x2009.x02.UriList profile);
        
        /**
         * Unsets the "profile" attribute
         */
        void unsetProfile();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation newInstance() {
              return (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.RepresentationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.RepresentationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
