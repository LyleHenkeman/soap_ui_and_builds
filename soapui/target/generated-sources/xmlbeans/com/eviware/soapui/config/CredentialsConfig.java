/*
 * XML Type:  Credentials
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CredentialsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Credentials(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface CredentialsConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CredentialsConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("credentials7686type");
    
    /**
     * Gets the "username" element
     */
    java.lang.String getUsername();
    
    /**
     * Gets (as xml) the "username" element
     */
    org.apache.xmlbeans.XmlString xgetUsername();
    
    /**
     * True if has "username" element
     */
    boolean isSetUsername();
    
    /**
     * Sets the "username" element
     */
    void setUsername(java.lang.String username);
    
    /**
     * Sets (as xml) the "username" element
     */
    void xsetUsername(org.apache.xmlbeans.XmlString username);
    
    /**
     * Unsets the "username" element
     */
    void unsetUsername();
    
    /**
     * Gets the "password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * True if has "password" element
     */
    boolean isSetPassword();
    
    /**
     * Sets the "password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Unsets the "password" element
     */
    void unsetPassword();
    
    /**
     * Gets the "domain" element
     */
    java.lang.String getDomain();
    
    /**
     * Gets (as xml) the "domain" element
     */
    org.apache.xmlbeans.XmlString xgetDomain();
    
    /**
     * True if has "domain" element
     */
    boolean isSetDomain();
    
    /**
     * Sets the "domain" element
     */
    void setDomain(java.lang.String domain);
    
    /**
     * Sets (as xml) the "domain" element
     */
    void xsetDomain(org.apache.xmlbeans.XmlString domain);
    
    /**
     * Unsets the "domain" element
     */
    void unsetDomain();
    
    /**
     * Gets the "selectedAuthProfile" element
     */
    java.lang.String getSelectedAuthProfile();
    
    /**
     * Gets (as xml) the "selectedAuthProfile" element
     */
    org.apache.xmlbeans.XmlString xgetSelectedAuthProfile();
    
    /**
     * True if has "selectedAuthProfile" element
     */
    boolean isSetSelectedAuthProfile();
    
    /**
     * Sets the "selectedAuthProfile" element
     */
    void setSelectedAuthProfile(java.lang.String selectedAuthProfile);
    
    /**
     * Sets (as xml) the "selectedAuthProfile" element
     */
    void xsetSelectedAuthProfile(org.apache.xmlbeans.XmlString selectedAuthProfile);
    
    /**
     * Unsets the "selectedAuthProfile" element
     */
    void unsetSelectedAuthProfile();
    
    /**
     * Gets a List of "addedBasicAuthenticationTypes" elements
     */
    java.util.List<java.lang.String> getAddedBasicAuthenticationTypesList();
    
    /**
     * Gets array of all "addedBasicAuthenticationTypes" elements
     * @deprecated
     */
    java.lang.String[] getAddedBasicAuthenticationTypesArray();
    
    /**
     * Gets ith "addedBasicAuthenticationTypes" element
     */
    java.lang.String getAddedBasicAuthenticationTypesArray(int i);
    
    /**
     * Gets (as xml) a List of "addedBasicAuthenticationTypes" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetAddedBasicAuthenticationTypesList();
    
    /**
     * Gets (as xml) array of all "addedBasicAuthenticationTypes" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetAddedBasicAuthenticationTypesArray();
    
    /**
     * Gets (as xml) ith "addedBasicAuthenticationTypes" element
     */
    org.apache.xmlbeans.XmlString xgetAddedBasicAuthenticationTypesArray(int i);
    
    /**
     * Returns number of "addedBasicAuthenticationTypes" element
     */
    int sizeOfAddedBasicAuthenticationTypesArray();
    
    /**
     * Sets array of all "addedBasicAuthenticationTypes" element
     */
    void setAddedBasicAuthenticationTypesArray(java.lang.String[] addedBasicAuthenticationTypesArray);
    
    /**
     * Sets ith "addedBasicAuthenticationTypes" element
     */
    void setAddedBasicAuthenticationTypesArray(int i, java.lang.String addedBasicAuthenticationTypes);
    
    /**
     * Sets (as xml) array of all "addedBasicAuthenticationTypes" element
     */
    void xsetAddedBasicAuthenticationTypesArray(org.apache.xmlbeans.XmlString[] addedBasicAuthenticationTypesArray);
    
    /**
     * Sets (as xml) ith "addedBasicAuthenticationTypes" element
     */
    void xsetAddedBasicAuthenticationTypesArray(int i, org.apache.xmlbeans.XmlString addedBasicAuthenticationTypes);
    
    /**
     * Inserts the value as the ith "addedBasicAuthenticationTypes" element
     */
    void insertAddedBasicAuthenticationTypes(int i, java.lang.String addedBasicAuthenticationTypes);
    
    /**
     * Appends the value as the last "addedBasicAuthenticationTypes" element
     */
    void addAddedBasicAuthenticationTypes(java.lang.String addedBasicAuthenticationTypes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addedBasicAuthenticationTypes" element
     */
    org.apache.xmlbeans.XmlString insertNewAddedBasicAuthenticationTypes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addedBasicAuthenticationTypes" element
     */
    org.apache.xmlbeans.XmlString addNewAddedBasicAuthenticationTypes();
    
    /**
     * Removes the ith "addedBasicAuthenticationTypes" element
     */
    void removeAddedBasicAuthenticationTypes(int i);
    
    /**
     * Gets the "preemptive" element
     */
    boolean getPreemptive();
    
    /**
     * Gets (as xml) the "preemptive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPreemptive();
    
    /**
     * True if has "preemptive" element
     */
    boolean isSetPreemptive();
    
    /**
     * Sets the "preemptive" element
     */
    void setPreemptive(boolean preemptive);
    
    /**
     * Sets (as xml) the "preemptive" element
     */
    void xsetPreemptive(org.apache.xmlbeans.XmlBoolean preemptive);
    
    /**
     * Unsets the "preemptive" element
     */
    void unsetPreemptive();
    
    /**
     * Gets the "authType" element
     */
    com.eviware.soapui.config.CredentialsConfig.AuthType.Enum getAuthType();
    
    /**
     * Gets (as xml) the "authType" element
     */
    com.eviware.soapui.config.CredentialsConfig.AuthType xgetAuthType();
    
    /**
     * Sets the "authType" element
     */
    void setAuthType(com.eviware.soapui.config.CredentialsConfig.AuthType.Enum authType);
    
    /**
     * Sets (as xml) the "authType" element
     */
    void xsetAuthType(com.eviware.soapui.config.CredentialsConfig.AuthType authType);
    
    /**
     * An XML authType(@http://eviware.com/soapui/config).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.CredentialsConfig$AuthType.
     */
    public interface AuthType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("authtype0128elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum GLOBAL_HTTP_SETTINGS = Enum.forString("Global HTTP Settings");
        static final Enum PREEMPTIVE = Enum.forString("Preemptive");
        static final Enum NTLM = Enum.forString("NTLM");
        static final Enum SPNEGO_KERBEROS = Enum.forString("SPNEGO/Kerberos");
        static final Enum O_AUTH_2_0 = Enum.forString("OAuth 2.0");
        static final Enum O_AUTH_1_0 = Enum.forString("OAuth 1.0");
        static final Enum NO_AUTHORIZATION = Enum.forString("No Authorization");
        
        static final int INT_GLOBAL_HTTP_SETTINGS = Enum.INT_GLOBAL_HTTP_SETTINGS;
        static final int INT_PREEMPTIVE = Enum.INT_PREEMPTIVE;
        static final int INT_NTLM = Enum.INT_NTLM;
        static final int INT_SPNEGO_KERBEROS = Enum.INT_SPNEGO_KERBEROS;
        static final int INT_O_AUTH_2_0 = Enum.INT_O_AUTH_2_0;
        static final int INT_O_AUTH_1_0 = Enum.INT_O_AUTH_1_0;
        static final int INT_NO_AUTHORIZATION = Enum.INT_NO_AUTHORIZATION;
        
        /**
         * Enumeration value class for com.eviware.soapui.config.CredentialsConfig$AuthType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_GLOBAL_HTTP_SETTINGS
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_GLOBAL_HTTP_SETTINGS = 1;
            static final int INT_PREEMPTIVE = 2;
            static final int INT_NTLM = 3;
            static final int INT_SPNEGO_KERBEROS = 4;
            static final int INT_O_AUTH_2_0 = 5;
            static final int INT_O_AUTH_1_0 = 6;
            static final int INT_NO_AUTHORIZATION = 7;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Global HTTP Settings", INT_GLOBAL_HTTP_SETTINGS),
                    new Enum("Preemptive", INT_PREEMPTIVE),
                    new Enum("NTLM", INT_NTLM),
                    new Enum("SPNEGO/Kerberos", INT_SPNEGO_KERBEROS),
                    new Enum("OAuth 2.0", INT_O_AUTH_2_0),
                    new Enum("OAuth 1.0", INT_O_AUTH_1_0),
                    new Enum("No Authorization", INT_NO_AUTHORIZATION),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.CredentialsConfig.AuthType newValue(java.lang.Object obj) {
              return (com.eviware.soapui.config.CredentialsConfig.AuthType) type.newValue( obj ); }
            
            public static com.eviware.soapui.config.CredentialsConfig.AuthType newInstance() {
              return (com.eviware.soapui.config.CredentialsConfig.AuthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.CredentialsConfig.AuthType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.CredentialsConfig.AuthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.CredentialsConfig newInstance() {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.CredentialsConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.CredentialsConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.CredentialsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.CredentialsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.CredentialsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
