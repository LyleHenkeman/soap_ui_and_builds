/*
 * An XML document type.
 * Localname: Addressing
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.AddressingDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata;


/**
 * A document containing one Addressing(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public interface AddressingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("addressing22c3doctype");
    
    /**
     * Gets the "Addressing" element
     */
    org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing getAddressing();
    
    /**
     * Sets the "Addressing" element
     */
    void setAddressing(org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addressing);
    
    /**
     * Appends and returns a new empty "Addressing" element
     */
    org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addNewAddressing();
    
    /**
     * An XML Addressing(@http://www.w3.org/2007/05/addressing/metadata).
     *
     * This is a complex type.
     */
    public interface Addressing extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Addressing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("addressingb259elemtype");
        
        /**
         * Gets the "Policy" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy getPolicy();
        
        /**
         * Sets the "Policy" element
         */
        void setPolicy(org.xmlsoap.schemas.ws.x2004.x09.policy.Policy policy);
        
        /**
         * Appends and returns a new empty "Policy" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy addNewPolicy();
        
        /**
         * Gets the "Optional" attribute
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType.Enum getOptional();
        
        /**
         * Gets (as xml) the "Optional" attribute
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType xgetOptional();
        
        /**
         * True if has "Optional" attribute
         */
        boolean isSetOptional();
        
        /**
         * Sets the "Optional" attribute
         */
        void setOptional(org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType.Enum optional);
        
        /**
         * Sets (as xml) the "Optional" attribute
         */
        void xsetOptional(org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType optional);
        
        /**
         * Unsets the "Optional" attribute
         */
        void unsetOptional();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing newInstance() {
              return (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument newInstance() {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2007.x05.addressing.metadata.AddressingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2007.x05.addressing.metadata.AddressingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
