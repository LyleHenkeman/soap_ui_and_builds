/*
 * An XML document type.
 * Localname: testCaseRunLog
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestCaseRunLogDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * A document containing one testCaseRunLog(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public interface TestCaseRunLogDocumentConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestCaseRunLogDocumentConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testcaserunlog5c85doctype");
    
    /**
     * Gets the "testCaseRunLog" element
     */
    com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog getTestCaseRunLog();
    
    /**
     * Sets the "testCaseRunLog" element
     */
    void setTestCaseRunLog(com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog testCaseRunLog);
    
    /**
     * Appends and returns a new empty "testCaseRunLog" element
     */
    com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog addNewTestCaseRunLog();
    
    /**
     * An XML testCaseRunLog(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public interface TestCaseRunLog extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestCaseRunLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testcaserunlog2d9celemtype");
        
        /**
         * Gets a List of "testCaseRunLogTestStep" elements
         */
        java.util.List<com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep> getTestCaseRunLogTestStepList();
        
        /**
         * Gets array of all "testCaseRunLogTestStep" elements
         * @deprecated
         */
        com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[] getTestCaseRunLogTestStepArray();
        
        /**
         * Gets ith "testCaseRunLogTestStep" element
         */
        com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep getTestCaseRunLogTestStepArray(int i);
        
        /**
         * Returns number of "testCaseRunLogTestStep" element
         */
        int sizeOfTestCaseRunLogTestStepArray();
        
        /**
         * Sets array of all "testCaseRunLogTestStep" element
         */
        void setTestCaseRunLogTestStepArray(com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[] testCaseRunLogTestStepArray);
        
        /**
         * Sets ith "testCaseRunLogTestStep" element
         */
        void setTestCaseRunLogTestStepArray(int i, com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep testCaseRunLogTestStep);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testCaseRunLogTestStep" element
         */
        com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep insertNewTestCaseRunLogTestStep(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testCaseRunLogTestStep" element
         */
        com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep addNewTestCaseRunLogTestStep();
        
        /**
         * Removes the ith "testCaseRunLogTestStep" element
         */
        void removeTestCaseRunLogTestStep(int i);
        
        /**
         * Gets the "testCase" attribute
         */
        java.lang.String getTestCase();
        
        /**
         * Gets (as xml) the "testCase" attribute
         */
        org.apache.xmlbeans.XmlString xgetTestCase();
        
        /**
         * True if has "testCase" attribute
         */
        boolean isSetTestCase();
        
        /**
         * Sets the "testCase" attribute
         */
        void setTestCase(java.lang.String testCase);
        
        /**
         * Sets (as xml) the "testCase" attribute
         */
        void xsetTestCase(org.apache.xmlbeans.XmlString testCase);
        
        /**
         * Unsets the "testCase" attribute
         */
        void unsetTestCase();
        
        /**
         * Gets the "timeTaken" attribute
         */
        java.lang.String getTimeTaken();
        
        /**
         * Gets (as xml) the "timeTaken" attribute
         */
        org.apache.xmlbeans.XmlString xgetTimeTaken();
        
        /**
         * True if has "timeTaken" attribute
         */
        boolean isSetTimeTaken();
        
        /**
         * Sets the "timeTaken" attribute
         */
        void setTimeTaken(java.lang.String timeTaken);
        
        /**
         * Sets (as xml) the "timeTaken" attribute
         */
        void xsetTimeTaken(org.apache.xmlbeans.XmlString timeTaken);
        
        /**
         * Unsets the "timeTaken" attribute
         */
        void unsetTimeTaken();
        
        /**
         * Gets the "status" attribute
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "status" attribute
         */
        org.apache.xmlbeans.XmlString xgetStatus();
        
        /**
         * True if has "status" attribute
         */
        boolean isSetStatus();
        
        /**
         * Sets the "status" attribute
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "status" attribute
         */
        void xsetStatus(org.apache.xmlbeans.XmlString status);
        
        /**
         * Unsets the "status" attribute
         */
        void unsetStatus();
        
        /**
         * Gets the "timeStamp" attribute
         */
        java.lang.String getTimeStamp();
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        org.apache.xmlbeans.XmlString xgetTimeStamp();
        
        /**
         * True if has "timeStamp" attribute
         */
        boolean isSetTimeStamp();
        
        /**
         * Sets the "timeStamp" attribute
         */
        void setTimeStamp(java.lang.String timeStamp);
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        void xsetTimeStamp(org.apache.xmlbeans.XmlString timeStamp);
        
        /**
         * Unsets the "timeStamp" attribute
         */
        void unsetTimeStamp();
        
        /**
         * An XML testCaseRunLogTestStep(@http://eviware.com/soapui/config).
         *
         * This is a complex type.
         */
        public interface TestCaseRunLogTestStep extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestCaseRunLogTestStep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testcaserunlogteststep2907elemtype");
            
            /**
             * Gets a List of "message" elements
             */
            java.util.List<java.lang.String> getMessageList();
            
            /**
             * Gets array of all "message" elements
             * @deprecated
             */
            java.lang.String[] getMessageArray();
            
            /**
             * Gets ith "message" element
             */
            java.lang.String getMessageArray(int i);
            
            /**
             * Gets (as xml) a List of "message" elements
             */
            java.util.List<org.apache.xmlbeans.XmlString> xgetMessageList();
            
            /**
             * Gets (as xml) array of all "message" elements
             * @deprecated
             */
            org.apache.xmlbeans.XmlString[] xgetMessageArray();
            
            /**
             * Gets (as xml) ith "message" element
             */
            org.apache.xmlbeans.XmlString xgetMessageArray(int i);
            
            /**
             * Returns number of "message" element
             */
            int sizeOfMessageArray();
            
            /**
             * Sets array of all "message" element
             */
            void setMessageArray(java.lang.String[] messageArray);
            
            /**
             * Sets ith "message" element
             */
            void setMessageArray(int i, java.lang.String message);
            
            /**
             * Sets (as xml) array of all "message" element
             */
            void xsetMessageArray(org.apache.xmlbeans.XmlString[] messageArray);
            
            /**
             * Sets (as xml) ith "message" element
             */
            void xsetMessageArray(int i, org.apache.xmlbeans.XmlString message);
            
            /**
             * Inserts the value as the ith "message" element
             */
            void insertMessage(int i, java.lang.String message);
            
            /**
             * Appends the value as the last "message" element
             */
            void addMessage(java.lang.String message);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "message" element
             */
            org.apache.xmlbeans.XmlString insertNewMessage(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "message" element
             */
            org.apache.xmlbeans.XmlString addNewMessage();
            
            /**
             * Removes the ith "message" element
             */
            void removeMessage(int i);
            
            /**
             * Gets the "errorMessage" element
             */
            java.lang.String getErrorMessage();
            
            /**
             * Gets (as xml) the "errorMessage" element
             */
            org.apache.xmlbeans.XmlString xgetErrorMessage();
            
            /**
             * Sets the "errorMessage" element
             */
            void setErrorMessage(java.lang.String errorMessage);
            
            /**
             * Sets (as xml) the "errorMessage" element
             */
            void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage);
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
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
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Unsets the "name" attribute
             */
            void unsetName();
            
            /**
             * Gets the "timeTaken" attribute
             */
            java.lang.String getTimeTaken();
            
            /**
             * Gets (as xml) the "timeTaken" attribute
             */
            org.apache.xmlbeans.XmlString xgetTimeTaken();
            
            /**
             * True if has "timeTaken" attribute
             */
            boolean isSetTimeTaken();
            
            /**
             * Sets the "timeTaken" attribute
             */
            void setTimeTaken(java.lang.String timeTaken);
            
            /**
             * Sets (as xml) the "timeTaken" attribute
             */
            void xsetTimeTaken(org.apache.xmlbeans.XmlString timeTaken);
            
            /**
             * Unsets the "timeTaken" attribute
             */
            void unsetTimeTaken();
            
            /**
             * Gets the "status" attribute
             */
            java.lang.String getStatus();
            
            /**
             * Gets (as xml) the "status" attribute
             */
            org.apache.xmlbeans.XmlString xgetStatus();
            
            /**
             * True if has "status" attribute
             */
            boolean isSetStatus();
            
            /**
             * Sets the "status" attribute
             */
            void setStatus(java.lang.String status);
            
            /**
             * Sets (as xml) the "status" attribute
             */
            void xsetStatus(org.apache.xmlbeans.XmlString status);
            
            /**
             * Unsets the "status" attribute
             */
            void unsetStatus();
            
            /**
             * Gets the "timestamp" attribute
             */
            java.lang.String getTimestamp();
            
            /**
             * Gets (as xml) the "timestamp" attribute
             */
            org.apache.xmlbeans.XmlString xgetTimestamp();
            
            /**
             * True if has "timestamp" attribute
             */
            boolean isSetTimestamp();
            
            /**
             * Sets the "timestamp" attribute
             */
            void setTimestamp(java.lang.String timestamp);
            
            /**
             * Sets (as xml) the "timestamp" attribute
             */
            void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp);
            
            /**
             * Unsets the "timestamp" attribute
             */
            void unsetTimestamp();
            
            /**
             * Gets the "httpStatus" attribute
             */
            java.lang.String getHttpStatus();
            
            /**
             * Gets (as xml) the "httpStatus" attribute
             */
            org.apache.xmlbeans.XmlString xgetHttpStatus();
            
            /**
             * True if has "httpStatus" attribute
             */
            boolean isSetHttpStatus();
            
            /**
             * Sets the "httpStatus" attribute
             */
            void setHttpStatus(java.lang.String httpStatus);
            
            /**
             * Sets (as xml) the "httpStatus" attribute
             */
            void xsetHttpStatus(org.apache.xmlbeans.XmlString httpStatus);
            
            /**
             * Unsets the "httpStatus" attribute
             */
            void unsetHttpStatus();
            
            /**
             * Gets the "contentLength" attribute
             */
            java.lang.String getContentLength();
            
            /**
             * Gets (as xml) the "contentLength" attribute
             */
            org.apache.xmlbeans.XmlString xgetContentLength();
            
            /**
             * True if has "contentLength" attribute
             */
            boolean isSetContentLength();
            
            /**
             * Sets the "contentLength" attribute
             */
            void setContentLength(java.lang.String contentLength);
            
            /**
             * Sets (as xml) the "contentLength" attribute
             */
            void xsetContentLength(org.apache.xmlbeans.XmlString contentLength);
            
            /**
             * Unsets the "contentLength" attribute
             */
            void unsetContentLength();
            
            /**
             * Gets the "dnsTime" attribute
             */
            java.lang.String getDnsTime();
            
            /**
             * Gets (as xml) the "dnsTime" attribute
             */
            org.apache.xmlbeans.XmlString xgetDnsTime();
            
            /**
             * True if has "dnsTime" attribute
             */
            boolean isSetDnsTime();
            
            /**
             * Sets the "dnsTime" attribute
             */
            void setDnsTime(java.lang.String dnsTime);
            
            /**
             * Sets (as xml) the "dnsTime" attribute
             */
            void xsetDnsTime(org.apache.xmlbeans.XmlString dnsTime);
            
            /**
             * Unsets the "dnsTime" attribute
             */
            void unsetDnsTime();
            
            /**
             * Gets the "connectTime" attribute
             */
            java.lang.String getConnectTime();
            
            /**
             * Gets (as xml) the "connectTime" attribute
             */
            org.apache.xmlbeans.XmlString xgetConnectTime();
            
            /**
             * True if has "connectTime" attribute
             */
            boolean isSetConnectTime();
            
            /**
             * Sets the "connectTime" attribute
             */
            void setConnectTime(java.lang.String connectTime);
            
            /**
             * Sets (as xml) the "connectTime" attribute
             */
            void xsetConnectTime(org.apache.xmlbeans.XmlString connectTime);
            
            /**
             * Unsets the "connectTime" attribute
             */
            void unsetConnectTime();
            
            /**
             * Gets the "timeToFirstByte" attribute
             */
            java.lang.String getTimeToFirstByte();
            
            /**
             * Gets (as xml) the "timeToFirstByte" attribute
             */
            org.apache.xmlbeans.XmlString xgetTimeToFirstByte();
            
            /**
             * True if has "timeToFirstByte" attribute
             */
            boolean isSetTimeToFirstByte();
            
            /**
             * Sets the "timeToFirstByte" attribute
             */
            void setTimeToFirstByte(java.lang.String timeToFirstByte);
            
            /**
             * Sets (as xml) the "timeToFirstByte" attribute
             */
            void xsetTimeToFirstByte(org.apache.xmlbeans.XmlString timeToFirstByte);
            
            /**
             * Unsets the "timeToFirstByte" attribute
             */
            void unsetTimeToFirstByte();
            
            /**
             * Gets the "readTime" attribute
             */
            java.lang.String getReadTime();
            
            /**
             * Gets (as xml) the "readTime" attribute
             */
            org.apache.xmlbeans.XmlString xgetReadTime();
            
            /**
             * True if has "readTime" attribute
             */
            boolean isSetReadTime();
            
            /**
             * Sets the "readTime" attribute
             */
            void setReadTime(java.lang.String readTime);
            
            /**
             * Sets (as xml) the "readTime" attribute
             */
            void xsetReadTime(org.apache.xmlbeans.XmlString readTime);
            
            /**
             * Unsets the "readTime" attribute
             */
            void unsetReadTime();
            
            /**
             * Gets the "totalTime" attribute
             */
            java.lang.String getTotalTime();
            
            /**
             * Gets (as xml) the "totalTime" attribute
             */
            org.apache.xmlbeans.XmlString xgetTotalTime();
            
            /**
             * True if has "totalTime" attribute
             */
            boolean isSetTotalTime();
            
            /**
             * Sets the "totalTime" attribute
             */
            void setTotalTime(java.lang.String totalTime);
            
            /**
             * Sets (as xml) the "totalTime" attribute
             */
            void xsetTotalTime(org.apache.xmlbeans.XmlString totalTime);
            
            /**
             * Unsets the "totalTime" attribute
             */
            void unsetTotalTime();
            
            /**
             * Gets the "endpoint" attribute
             */
            java.lang.String getEndpoint();
            
            /**
             * Gets (as xml) the "endpoint" attribute
             */
            org.apache.xmlbeans.XmlString xgetEndpoint();
            
            /**
             * True if has "endpoint" attribute
             */
            boolean isSetEndpoint();
            
            /**
             * Sets the "endpoint" attribute
             */
            void setEndpoint(java.lang.String endpoint);
            
            /**
             * Sets (as xml) the "endpoint" attribute
             */
            void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint);
            
            /**
             * Unsets the "endpoint" attribute
             */
            void unsetEndpoint();
            
            /**
             * Gets the "httpMethod" attribute
             */
            java.lang.String getHttpMethod();
            
            /**
             * Gets (as xml) the "httpMethod" attribute
             */
            org.apache.xmlbeans.XmlString xgetHttpMethod();
            
            /**
             * True if has "httpMethod" attribute
             */
            boolean isSetHttpMethod();
            
            /**
             * Sets the "httpMethod" attribute
             */
            void setHttpMethod(java.lang.String httpMethod);
            
            /**
             * Sets (as xml) the "httpMethod" attribute
             */
            void xsetHttpMethod(org.apache.xmlbeans.XmlString httpMethod);
            
            /**
             * Unsets the "httpMethod" attribute
             */
            void unsetHttpMethod();
            
            /**
             * Gets the "ipAddress" attribute
             */
            java.lang.String getIpAddress();
            
            /**
             * Gets (as xml) the "ipAddress" attribute
             */
            org.apache.xmlbeans.XmlString xgetIpAddress();
            
            /**
             * True if has "ipAddress" attribute
             */
            boolean isSetIpAddress();
            
            /**
             * Sets the "ipAddress" attribute
             */
            void setIpAddress(java.lang.String ipAddress);
            
            /**
             * Sets (as xml) the "ipAddress" attribute
             */
            void xsetIpAddress(org.apache.xmlbeans.XmlString ipAddress);
            
            /**
             * Unsets the "ipAddress" attribute
             */
            void unsetIpAddress();
            
            /**
             * Gets the "port" attribute
             */
            int getPort();
            
            /**
             * Gets (as xml) the "port" attribute
             */
            org.apache.xmlbeans.XmlInt xgetPort();
            
            /**
             * True if has "port" attribute
             */
            boolean isSetPort();
            
            /**
             * Sets the "port" attribute
             */
            void setPort(int port);
            
            /**
             * Sets (as xml) the "port" attribute
             */
            void xsetPort(org.apache.xmlbeans.XmlInt port);
            
            /**
             * Unsets the "port" attribute
             */
            void unsetPort();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep newInstance() {
                  return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog newInstance() {
              return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig newInstance() {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestCaseRunLogDocumentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestCaseRunLogDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
