/*
 * An XML document type.
 * Localname: PolicyAttachment
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy;


/**
 * A document containing one PolicyAttachment(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public interface PolicyAttachmentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolicyAttachmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("policyattachmentd2ebdoctype");
    
    /**
     * Gets the "PolicyAttachment" element
     */
    org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment getPolicyAttachment();
    
    /**
     * Sets the "PolicyAttachment" element
     */
    void setPolicyAttachment(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment policyAttachment);
    
    /**
     * Appends and returns a new empty "PolicyAttachment" element
     */
    org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment addNewPolicyAttachment();
    
    /**
     * An XML PolicyAttachment(@http://schemas.xmlsoap.org/ws/2004/09/policy).
     *
     * This is a complex type.
     */
    public interface PolicyAttachment extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolicyAttachment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("policyattachment6b9celemtype");
        
        /**
         * Gets the "AppliesTo" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo getAppliesTo();
        
        /**
         * Sets the "AppliesTo" element
         */
        void setAppliesTo(org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo appliesTo);
        
        /**
         * Appends and returns a new empty "AppliesTo" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo addNewAppliesTo();
        
        /**
         * Gets a List of "Policy" elements
         */
        java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy> getPolicyList();
        
        /**
         * Gets array of all "Policy" elements
         * @deprecated
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[] getPolicyArray();
        
        /**
         * Gets ith "Policy" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy getPolicyArray(int i);
        
        /**
         * Returns number of "Policy" element
         */
        int sizeOfPolicyArray();
        
        /**
         * Sets array of all "Policy" element
         */
        void setPolicyArray(org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[] policyArray);
        
        /**
         * Sets ith "Policy" element
         */
        void setPolicyArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy policy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Policy" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy insertNewPolicy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Policy" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.Policy addNewPolicy();
        
        /**
         * Removes the ith "Policy" element
         */
        void removePolicy(int i);
        
        /**
         * Gets a List of "PolicyReference" elements
         */
        java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference> getPolicyReferenceList();
        
        /**
         * Gets array of all "PolicyReference" elements
         * @deprecated
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[] getPolicyReferenceArray();
        
        /**
         * Gets ith "PolicyReference" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference getPolicyReferenceArray(int i);
        
        /**
         * Returns number of "PolicyReference" element
         */
        int sizeOfPolicyReferenceArray();
        
        /**
         * Sets array of all "PolicyReference" element
         */
        void setPolicyReferenceArray(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[] policyReferenceArray);
        
        /**
         * Sets ith "PolicyReference" element
         */
        void setPolicyReferenceArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference policyReference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PolicyReference" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference insertNewPolicyReference(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PolicyReference" element
         */
        org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference addNewPolicyReference();
        
        /**
         * Removes the ith "PolicyReference" element
         */
        void removePolicyReference(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment newInstance() {
              return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument newInstance() {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
