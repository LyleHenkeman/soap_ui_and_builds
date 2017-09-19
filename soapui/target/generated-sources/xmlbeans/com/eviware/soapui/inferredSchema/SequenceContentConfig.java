/*
 * XML Type:  SequenceContent
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SequenceContentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema;


/**
 * An XML SequenceContent(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public interface SequenceContentConfig extends com.eviware.soapui.inferredSchema.ContentConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SequenceContentConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("sequencecontent22d5type");
    
    /**
     * Gets the "completed" element
     */
    boolean getCompleted();
    
    /**
     * Gets (as xml) the "completed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCompleted();
    
    /**
     * Sets the "completed" element
     */
    void setCompleted(boolean completed);
    
    /**
     * Sets (as xml) the "completed" element
     */
    void xsetCompleted(org.apache.xmlbeans.XmlBoolean completed);
    
    /**
     * Gets a List of "particle" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getParticleList();
    
    /**
     * Gets array of all "particle" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.ParticleConfig[] getParticleArray();
    
    /**
     * Gets ith "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig getParticleArray(int i);
    
    /**
     * Returns number of "particle" element
     */
    int sizeOfParticleArray();
    
    /**
     * Sets array of all "particle" element
     */
    void setParticleArray(com.eviware.soapui.inferredSchema.ParticleConfig[] particleArray);
    
    /**
     * Sets ith "particle" element
     */
    void setParticleArray(int i, com.eviware.soapui.inferredSchema.ParticleConfig particle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig insertNewParticle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig addNewParticle();
    
    /**
     * Removes the ith "particle" element
     */
    void removeParticle(int i);
    
    /**
     * Gets a List of "comesBefore" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore> getComesBeforeList();
    
    /**
     * Gets array of all "comesBefore" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[] getComesBeforeArray();
    
    /**
     * Gets ith "comesBefore" element
     */
    com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore getComesBeforeArray(int i);
    
    /**
     * Returns number of "comesBefore" element
     */
    int sizeOfComesBeforeArray();
    
    /**
     * Sets array of all "comesBefore" element
     */
    void setComesBeforeArray(com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[] comesBeforeArray);
    
    /**
     * Sets ith "comesBefore" element
     */
    void setComesBeforeArray(int i, com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore comesBefore);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comesBefore" element
     */
    com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore insertNewComesBefore(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comesBefore" element
     */
    com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore addNewComesBefore();
    
    /**
     * Removes the ith "comesBefore" element
     */
    void removeComesBefore(int i);
    
    /**
     * An XML comesBefore(@http://www.eviware.com/soapui/InferredSchema).
     *
     * This is a complex type.
     */
    public interface ComesBefore extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComesBefore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("comesbefore1cdbelemtype");
        
        /**
         * Gets a List of "other" elements
         */
        java.util.List<javax.xml.namespace.QName> getOtherList();
        
        /**
         * Gets array of all "other" elements
         * @deprecated
         */
        javax.xml.namespace.QName[] getOtherArray();
        
        /**
         * Gets ith "other" element
         */
        javax.xml.namespace.QName getOtherArray(int i);
        
        /**
         * Gets (as xml) a List of "other" elements
         */
        java.util.List<org.apache.xmlbeans.XmlQName> xgetOtherList();
        
        /**
         * Gets (as xml) array of all "other" elements
         * @deprecated
         */
        org.apache.xmlbeans.XmlQName[] xgetOtherArray();
        
        /**
         * Gets (as xml) ith "other" element
         */
        org.apache.xmlbeans.XmlQName xgetOtherArray(int i);
        
        /**
         * Returns number of "other" element
         */
        int sizeOfOtherArray();
        
        /**
         * Sets array of all "other" element
         */
        void setOtherArray(javax.xml.namespace.QName[] otherArray);
        
        /**
         * Sets ith "other" element
         */
        void setOtherArray(int i, javax.xml.namespace.QName other);
        
        /**
         * Sets (as xml) array of all "other" element
         */
        void xsetOtherArray(org.apache.xmlbeans.XmlQName[] otherArray);
        
        /**
         * Sets (as xml) ith "other" element
         */
        void xsetOtherArray(int i, org.apache.xmlbeans.XmlQName other);
        
        /**
         * Inserts the value as the ith "other" element
         */
        void insertOther(int i, javax.xml.namespace.QName other);
        
        /**
         * Appends the value as the last "other" element
         */
        void addOther(javax.xml.namespace.QName other);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "other" element
         */
        org.apache.xmlbeans.XmlQName insertNewOther(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "other" element
         */
        org.apache.xmlbeans.XmlQName addNewOther();
        
        /**
         * Removes the ith "other" element
         */
        void removeOther(int i);
        
        /**
         * Gets the "qname" attribute
         */
        javax.xml.namespace.QName getQname();
        
        /**
         * Gets (as xml) the "qname" attribute
         */
        org.apache.xmlbeans.XmlQName xgetQname();
        
        /**
         * True if has "qname" attribute
         */
        boolean isSetQname();
        
        /**
         * Sets the "qname" attribute
         */
        void setQname(javax.xml.namespace.QName qname);
        
        /**
         * Sets (as xml) the "qname" attribute
         */
        void xsetQname(org.apache.xmlbeans.XmlQName qname);
        
        /**
         * Unsets the "qname" attribute
         */
        void unsetQname();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore newInstance() {
              return (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig newInstance() {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.SequenceContentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.SequenceContentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
