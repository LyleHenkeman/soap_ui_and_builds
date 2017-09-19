/*
 * An XML document type.
 * Localname: option
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.OptionDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02;


/**
 * A document containing one option(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public interface OptionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("optionda61doctype");
    
    /**
     * Gets the "option" element
     */
    net.java.dev.wadl.x2009.x02.OptionDocument.Option getOption();
    
    /**
     * Sets the "option" element
     */
    void setOption(net.java.dev.wadl.x2009.x02.OptionDocument.Option option);
    
    /**
     * Appends and returns a new empty "option" element
     */
    net.java.dev.wadl.x2009.x02.OptionDocument.Option addNewOption();
    
    /**
     * An XML option(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public interface Option extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Option.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("option3432elemtype");
        
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
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.java.dev.wadl.x2009.x02.OptionDocument.Option newInstance() {
              return (net.java.dev.wadl.x2009.x02.OptionDocument.Option) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.java.dev.wadl.x2009.x02.OptionDocument.Option newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.java.dev.wadl.x2009.x02.OptionDocument.Option) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.java.dev.wadl.x2009.x02.OptionDocument newInstance() {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.java.dev.wadl.x2009.x02.OptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.java.dev.wadl.x2009.x02.OptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
