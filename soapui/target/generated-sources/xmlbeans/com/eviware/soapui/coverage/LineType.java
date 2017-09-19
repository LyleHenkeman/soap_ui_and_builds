/*
 * XML Type:  LineType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.LineType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage;


/**
 * An XML LineType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public interface LineType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LineType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("linetype0fa8type");
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Gets a List of "segment" elements
     */
    java.util.List<com.eviware.soapui.coverage.SegmentType> getSegmentList();
    
    /**
     * Gets array of all "segment" elements
     * @deprecated
     */
    com.eviware.soapui.coverage.SegmentType[] getSegmentArray();
    
    /**
     * Gets ith "segment" element
     */
    com.eviware.soapui.coverage.SegmentType getSegmentArray(int i);
    
    /**
     * Returns number of "segment" element
     */
    int sizeOfSegmentArray();
    
    /**
     * Sets array of all "segment" element
     */
    void setSegmentArray(com.eviware.soapui.coverage.SegmentType[] segmentArray);
    
    /**
     * Sets ith "segment" element
     */
    void setSegmentArray(int i, com.eviware.soapui.coverage.SegmentType segment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "segment" element
     */
    com.eviware.soapui.coverage.SegmentType insertNewSegment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "segment" element
     */
    com.eviware.soapui.coverage.SegmentType addNewSegment();
    
    /**
     * Removes the ith "segment" element
     */
    void removeSegment(int i);
    
    /**
     * Gets the "coverage" attribute
     */
    java.lang.String getCoverage();
    
    /**
     * Gets (as xml) the "coverage" attribute
     */
    org.apache.xmlbeans.XmlString xgetCoverage();
    
    /**
     * True if has "coverage" attribute
     */
    boolean isSetCoverage();
    
    /**
     * Sets the "coverage" attribute
     */
    void setCoverage(java.lang.String coverage);
    
    /**
     * Sets (as xml) the "coverage" attribute
     */
    void xsetCoverage(org.apache.xmlbeans.XmlString coverage);
    
    /**
     * Unsets the "coverage" attribute
     */
    void unsetCoverage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.coverage.LineType newInstance() {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.coverage.LineType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.coverage.LineType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.coverage.LineType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.coverage.LineType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.coverage.LineType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.coverage.LineType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.LineType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.LineType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.LineType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
