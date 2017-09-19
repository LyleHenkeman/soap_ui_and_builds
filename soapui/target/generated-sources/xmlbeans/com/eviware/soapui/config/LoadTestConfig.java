/*
 * XML Type:  LoadTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.LoadTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML LoadTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface LoadTestConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadTestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("loadtest5cf8type");
    
    /**
     * Gets the "threadCount" element
     */
    int getThreadCount();
    
    /**
     * Gets (as xml) the "threadCount" element
     */
    org.apache.xmlbeans.XmlInt xgetThreadCount();
    
    /**
     * Sets the "threadCount" element
     */
    void setThreadCount(int threadCount);
    
    /**
     * Sets (as xml) the "threadCount" element
     */
    void xsetThreadCount(org.apache.xmlbeans.XmlInt threadCount);
    
    /**
     * Gets the "startDelay" element
     */
    int getStartDelay();
    
    /**
     * Gets (as xml) the "startDelay" element
     */
    org.apache.xmlbeans.XmlInt xgetStartDelay();
    
    /**
     * Sets the "startDelay" element
     */
    void setStartDelay(int startDelay);
    
    /**
     * Sets (as xml) the "startDelay" element
     */
    void xsetStartDelay(org.apache.xmlbeans.XmlInt startDelay);
    
    /**
     * Gets the "sampleInterval" element
     */
    int getSampleInterval();
    
    /**
     * Gets (as xml) the "sampleInterval" element
     */
    org.apache.xmlbeans.XmlInt xgetSampleInterval();
    
    /**
     * Sets the "sampleInterval" element
     */
    void setSampleInterval(int sampleInterval);
    
    /**
     * Sets (as xml) the "sampleInterval" element
     */
    void xsetSampleInterval(org.apache.xmlbeans.XmlInt sampleInterval);
    
    /**
     * Gets the "calculateTPSOnTimePassed" element
     */
    boolean getCalculateTPSOnTimePassed();
    
    /**
     * Gets (as xml) the "calculateTPSOnTimePassed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCalculateTPSOnTimePassed();
    
    /**
     * Sets the "calculateTPSOnTimePassed" element
     */
    void setCalculateTPSOnTimePassed(boolean calculateTPSOnTimePassed);
    
    /**
     * Sets (as xml) the "calculateTPSOnTimePassed" element
     */
    void xsetCalculateTPSOnTimePassed(org.apache.xmlbeans.XmlBoolean calculateTPSOnTimePassed);
    
    /**
     * Gets the "resetStatisticsOnThreadCountChange" element
     */
    boolean getResetStatisticsOnThreadCountChange();
    
    /**
     * Gets (as xml) the "resetStatisticsOnThreadCountChange" element
     */
    org.apache.xmlbeans.XmlBoolean xgetResetStatisticsOnThreadCountChange();
    
    /**
     * Sets the "resetStatisticsOnThreadCountChange" element
     */
    void setResetStatisticsOnThreadCountChange(boolean resetStatisticsOnThreadCountChange);
    
    /**
     * Sets (as xml) the "resetStatisticsOnThreadCountChange" element
     */
    void xsetResetStatisticsOnThreadCountChange(org.apache.xmlbeans.XmlBoolean resetStatisticsOnThreadCountChange);
    
    /**
     * Gets the "historyLimit" element
     */
    long getHistoryLimit();
    
    /**
     * Gets (as xml) the "historyLimit" element
     */
    org.apache.xmlbeans.XmlLong xgetHistoryLimit();
    
    /**
     * True if has "historyLimit" element
     */
    boolean isSetHistoryLimit();
    
    /**
     * Sets the "historyLimit" element
     */
    void setHistoryLimit(long historyLimit);
    
    /**
     * Sets (as xml) the "historyLimit" element
     */
    void xsetHistoryLimit(org.apache.xmlbeans.XmlLong historyLimit);
    
    /**
     * Unsets the "historyLimit" element
     */
    void unsetHistoryLimit();
    
    /**
     * Gets the "testLimit" element
     */
    long getTestLimit();
    
    /**
     * Gets (as xml) the "testLimit" element
     */
    org.apache.xmlbeans.XmlLong xgetTestLimit();
    
    /**
     * Sets the "testLimit" element
     */
    void setTestLimit(long testLimit);
    
    /**
     * Sets (as xml) the "testLimit" element
     */
    void xsetTestLimit(org.apache.xmlbeans.XmlLong testLimit);
    
    /**
     * Gets the "limitType" element
     */
    com.eviware.soapui.config.LoadTestLimitTypesConfig.Enum getLimitType();
    
    /**
     * Gets (as xml) the "limitType" element
     */
    com.eviware.soapui.config.LoadTestLimitTypesConfig xgetLimitType();
    
    /**
     * Sets the "limitType" element
     */
    void setLimitType(com.eviware.soapui.config.LoadTestLimitTypesConfig.Enum limitType);
    
    /**
     * Sets (as xml) the "limitType" element
     */
    void xsetLimitType(com.eviware.soapui.config.LoadTestLimitTypesConfig limitType);
    
    /**
     * Gets the "loadStrategy" element
     */
    com.eviware.soapui.config.LoadStrategyConfig getLoadStrategy();
    
    /**
     * Sets the "loadStrategy" element
     */
    void setLoadStrategy(com.eviware.soapui.config.LoadStrategyConfig loadStrategy);
    
    /**
     * Appends and returns a new empty "loadStrategy" element
     */
    com.eviware.soapui.config.LoadStrategyConfig addNewLoadStrategy();
    
    /**
     * Gets a List of "assertion" elements
     */
    java.util.List<com.eviware.soapui.config.LoadTestAssertionConfig> getAssertionList();
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    com.eviware.soapui.config.LoadTestAssertionConfig[] getAssertionArray();
    
    /**
     * Gets ith "assertion" element
     */
    com.eviware.soapui.config.LoadTestAssertionConfig getAssertionArray(int i);
    
    /**
     * Returns number of "assertion" element
     */
    int sizeOfAssertionArray();
    
    /**
     * Sets array of all "assertion" element
     */
    void setAssertionArray(com.eviware.soapui.config.LoadTestAssertionConfig[] assertionArray);
    
    /**
     * Sets ith "assertion" element
     */
    void setAssertionArray(int i, com.eviware.soapui.config.LoadTestAssertionConfig assertion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    com.eviware.soapui.config.LoadTestAssertionConfig insertNewAssertion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    com.eviware.soapui.config.LoadTestAssertionConfig addNewAssertion();
    
    /**
     * Removes the ith "assertion" element
     */
    void removeAssertion(int i);
    
    /**
     * Gets the "maxAssertionErrors" element
     */
    long getMaxAssertionErrors();
    
    /**
     * Gets (as xml) the "maxAssertionErrors" element
     */
    org.apache.xmlbeans.XmlLong xgetMaxAssertionErrors();
    
    /**
     * True if has "maxAssertionErrors" element
     */
    boolean isSetMaxAssertionErrors();
    
    /**
     * Sets the "maxAssertionErrors" element
     */
    void setMaxAssertionErrors(long maxAssertionErrors);
    
    /**
     * Sets (as xml) the "maxAssertionErrors" element
     */
    void xsetMaxAssertionErrors(org.apache.xmlbeans.XmlLong maxAssertionErrors);
    
    /**
     * Unsets the "maxAssertionErrors" element
     */
    void unsetMaxAssertionErrors();
    
    /**
     * Gets the "statisticsLogFolder" element
     */
    java.lang.String getStatisticsLogFolder();
    
    /**
     * Gets (as xml) the "statisticsLogFolder" element
     */
    org.apache.xmlbeans.XmlString xgetStatisticsLogFolder();
    
    /**
     * Sets the "statisticsLogFolder" element
     */
    void setStatisticsLogFolder(java.lang.String statisticsLogFolder);
    
    /**
     * Sets (as xml) the "statisticsLogFolder" element
     */
    void xsetStatisticsLogFolder(org.apache.xmlbeans.XmlString statisticsLogFolder);
    
    /**
     * Gets the "statisticsLogInterval" element
     */
    int getStatisticsLogInterval();
    
    /**
     * Gets (as xml) the "statisticsLogInterval" element
     */
    org.apache.xmlbeans.XmlInt xgetStatisticsLogInterval();
    
    /**
     * Sets the "statisticsLogInterval" element
     */
    void setStatisticsLogInterval(int statisticsLogInterval);
    
    /**
     * Sets (as xml) the "statisticsLogInterval" element
     */
    void xsetStatisticsLogInterval(org.apache.xmlbeans.XmlInt statisticsLogInterval);
    
    /**
     * Gets the "logStatisticsOnThreadChange" element
     */
    boolean getLogStatisticsOnThreadChange();
    
    /**
     * Gets (as xml) the "logStatisticsOnThreadChange" element
     */
    org.apache.xmlbeans.XmlBoolean xgetLogStatisticsOnThreadChange();
    
    /**
     * Sets the "logStatisticsOnThreadChange" element
     */
    void setLogStatisticsOnThreadChange(boolean logStatisticsOnThreadChange);
    
    /**
     * Sets (as xml) the "logStatisticsOnThreadChange" element
     */
    void xsetLogStatisticsOnThreadChange(org.apache.xmlbeans.XmlBoolean logStatisticsOnThreadChange);
    
    /**
     * Gets the "cancelOnReachedLimit" element
     */
    boolean getCancelOnReachedLimit();
    
    /**
     * Gets (as xml) the "cancelOnReachedLimit" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCancelOnReachedLimit();
    
    /**
     * Sets the "cancelOnReachedLimit" element
     */
    void setCancelOnReachedLimit(boolean cancelOnReachedLimit);
    
    /**
     * Sets (as xml) the "cancelOnReachedLimit" element
     */
    void xsetCancelOnReachedLimit(org.apache.xmlbeans.XmlBoolean cancelOnReachedLimit);
    
    /**
     * Gets the "cancelExcessiveThreads" element
     */
    boolean getCancelExcessiveThreads();
    
    /**
     * Gets (as xml) the "cancelExcessiveThreads" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCancelExcessiveThreads();
    
    /**
     * Sets the "cancelExcessiveThreads" element
     */
    void setCancelExcessiveThreads(boolean cancelExcessiveThreads);
    
    /**
     * Sets (as xml) the "cancelExcessiveThreads" element
     */
    void xsetCancelExcessiveThreads(org.apache.xmlbeans.XmlBoolean cancelExcessiveThreads);
    
    /**
     * Gets the "strategyInterval" element
     */
    int getStrategyInterval();
    
    /**
     * Gets (as xml) the "strategyInterval" element
     */
    org.apache.xmlbeans.XmlInt xgetStrategyInterval();
    
    /**
     * Sets the "strategyInterval" element
     */
    void setStrategyInterval(int strategyInterval);
    
    /**
     * Sets (as xml) the "strategyInterval" element
     */
    void xsetStrategyInterval(org.apache.xmlbeans.XmlInt strategyInterval);
    
    /**
     * Gets the "setupScript" element
     */
    com.eviware.soapui.config.ScriptConfig getSetupScript();
    
    /**
     * True if has "setupScript" element
     */
    boolean isSetSetupScript();
    
    /**
     * Sets the "setupScript" element
     */
    void setSetupScript(com.eviware.soapui.config.ScriptConfig setupScript);
    
    /**
     * Appends and returns a new empty "setupScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewSetupScript();
    
    /**
     * Unsets the "setupScript" element
     */
    void unsetSetupScript();
    
    /**
     * Gets the "tearDownScript" element
     */
    com.eviware.soapui.config.ScriptConfig getTearDownScript();
    
    /**
     * True if has "tearDownScript" element
     */
    boolean isSetTearDownScript();
    
    /**
     * Sets the "tearDownScript" element
     */
    void setTearDownScript(com.eviware.soapui.config.ScriptConfig tearDownScript);
    
    /**
     * Appends and returns a new empty "tearDownScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewTearDownScript();
    
    /**
     * Unsets the "tearDownScript" element
     */
    void unsetTearDownScript();
    
    /**
     * Gets the "updateStatisticsPerTestStep" element
     */
    boolean getUpdateStatisticsPerTestStep();
    
    /**
     * Gets (as xml) the "updateStatisticsPerTestStep" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUpdateStatisticsPerTestStep();
    
    /**
     * Sets the "updateStatisticsPerTestStep" element
     */
    void setUpdateStatisticsPerTestStep(boolean updateStatisticsPerTestStep);
    
    /**
     * Sets (as xml) the "updateStatisticsPerTestStep" element
     */
    void xsetUpdateStatisticsPerTestStep(org.apache.xmlbeans.XmlBoolean updateStatisticsPerTestStep);
    
    /**
     * Gets the "reportScript" element
     */
    com.eviware.soapui.config.ScriptConfig getReportScript();
    
    /**
     * True if has "reportScript" element
     */
    boolean isSetReportScript();
    
    /**
     * Sets the "reportScript" element
     */
    void setReportScript(com.eviware.soapui.config.ScriptConfig reportScript);
    
    /**
     * Appends and returns a new empty "reportScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewReportScript();
    
    /**
     * Unsets the "reportScript" element
     */
    void unsetReportScript();
    
    /**
     * Gets the "reportParameters" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getReportParameters();
    
    /**
     * True if has "reportParameters" element
     */
    boolean isSetReportParameters();
    
    /**
     * Sets the "reportParameters" element
     */
    void setReportParameters(com.eviware.soapui.config.PropertiesTypeConfig reportParameters);
    
    /**
     * Appends and returns a new empty "reportParameters" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewReportParameters();
    
    /**
     * Unsets the "reportParameters" element
     */
    void unsetReportParameters();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.LoadTestConfig newInstance() {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.LoadTestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.LoadTestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.LoadTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.LoadTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.LoadTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
