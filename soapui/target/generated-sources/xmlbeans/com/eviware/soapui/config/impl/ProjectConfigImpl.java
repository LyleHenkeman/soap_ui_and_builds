/*
 * XML Type:  Project
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ProjectConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Project(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ProjectConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.ProjectConfig
{
    private static final long serialVersionUID = 1L;
    
    public ProjectConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interface");
    private static final javax.xml.namespace.QName TESTSUITE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testSuite");
    private static final javax.xml.namespace.QName MOCKSERVICE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mockService");
    private static final javax.xml.namespace.QName RESTMOCKSERVICE$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "restMockService");
    private static final javax.xml.namespace.QName ENDPOINTSTRATEGY$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpointStrategy");
    private static final javax.xml.namespace.QName REQUIREMENTS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "requirements");
    private static final javax.xml.namespace.QName PROPERTIES$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName AFTERLOADSCRIPT$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "afterLoadScript");
    private static final javax.xml.namespace.QName BEFORESAVESCRIPT$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "beforeSaveScript");
    private static final javax.xml.namespace.QName ENCRYPTEDCONTENT$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "encryptedContent");
    private static final javax.xml.namespace.QName ENCRYPTEDCONTENTALGORITHM$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "encryptedContentAlgorithm");
    private static final javax.xml.namespace.QName WSSCONTAINER$22 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "wssContainer");
    private static final javax.xml.namespace.QName DATABASECONNECTIONCONTAINER$24 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "databaseConnectionContainer");
    private static final javax.xml.namespace.QName OAUTH2PROFILECONTAINER$26 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "oAuth2ProfileContainer");
    private static final javax.xml.namespace.QName OAUTH1PROFILECONTAINER$28 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "oAuth1ProfileContainer");
    private static final javax.xml.namespace.QName REPORTING$30 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reporting");
    private static final javax.xml.namespace.QName REPORTSCRIPT$32 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportScript");
    private static final javax.xml.namespace.QName BEFORERUNSCRIPT$34 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "beforeRunScript");
    private static final javax.xml.namespace.QName AFTERRUNSCRIPT$36 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "afterRunScript");
    private static final javax.xml.namespace.QName EVENTHANDLERS$38 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "eventHandlers");
    private static final javax.xml.namespace.QName SENSITIVEINFORMATION$40 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sensitiveInformation");
    private static final javax.xml.namespace.QName ENVIRONMENT$42 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "environment");
    private static final javax.xml.namespace.QName SOAPUIVERSION$44 = 
        new javax.xml.namespace.QName("", "soapui-version");
    private static final javax.xml.namespace.QName RESOURCEROOT$46 = 
        new javax.xml.namespace.QName("", "resourceRoot");
    private static final javax.xml.namespace.QName DEFAULTSCRIPTLANGUAGE$48 = 
        new javax.xml.namespace.QName("", "defaultScriptLanguage");
    private static final javax.xml.namespace.QName ABORTONERROR$50 = 
        new javax.xml.namespace.QName("", "abortOnError");
    private static final javax.xml.namespace.QName TIMEOUT$52 = 
        new javax.xml.namespace.QName("", "timeout");
    private static final javax.xml.namespace.QName RUNTYPE$54 = 
        new javax.xml.namespace.QName("", "runType");
    private static final javax.xml.namespace.QName SCRIPTLIBRARY$56 = 
        new javax.xml.namespace.QName("", "scriptLibrary");
    private static final javax.xml.namespace.QName ACTIVEENVIRONMENT$58 = 
        new javax.xml.namespace.QName("", "activeEnvironment");
    
    
    /**
     * Gets a List of "interface" elements
     */
    public java.util.List<com.eviware.soapui.config.InterfaceConfig> getInterfaceList()
    {
        final class InterfaceList extends java.util.AbstractList<com.eviware.soapui.config.InterfaceConfig>
        {
            public com.eviware.soapui.config.InterfaceConfig get(int i)
                { return ProjectConfigImpl.this.getInterfaceArray(i); }
            
            public com.eviware.soapui.config.InterfaceConfig set(int i, com.eviware.soapui.config.InterfaceConfig o)
            {
                com.eviware.soapui.config.InterfaceConfig old = ProjectConfigImpl.this.getInterfaceArray(i);
                ProjectConfigImpl.this.setInterfaceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.InterfaceConfig o)
                { ProjectConfigImpl.this.insertNewInterface(i).set(o); }
            
            public com.eviware.soapui.config.InterfaceConfig remove(int i)
            {
                com.eviware.soapui.config.InterfaceConfig old = ProjectConfigImpl.this.getInterfaceArray(i);
                ProjectConfigImpl.this.removeInterface(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfInterfaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InterfaceList();
        }
    }
    
    /**
     * Gets array of all "interface" elements
     * @deprecated
     */
    public com.eviware.soapui.config.InterfaceConfig[] getInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.InterfaceConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.InterfaceConfig>();
            get_store().find_all_element_users(INTERFACE$0, targetList);
            com.eviware.soapui.config.InterfaceConfig[] result = new com.eviware.soapui.config.InterfaceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interface" element
     */
    public com.eviware.soapui.config.InterfaceConfig getInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.InterfaceConfig target = null;
            target = (com.eviware.soapui.config.InterfaceConfig)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interface" element
     */
    public int sizeOfInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACE$0);
        }
    }
    
    /**
     * Sets array of all "interface" element
     */
    public void setInterfaceArray(com.eviware.soapui.config.InterfaceConfig[] xinterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xinterfaceArray, INTERFACE$0);
        }
    }
    
    /**
     * Sets ith "interface" element
     */
    public void setInterfaceArray(int i, com.eviware.soapui.config.InterfaceConfig xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.InterfaceConfig target = null;
            target = (com.eviware.soapui.config.InterfaceConfig)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    public com.eviware.soapui.config.InterfaceConfig insertNewInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.InterfaceConfig target = null;
            target = (com.eviware.soapui.config.InterfaceConfig)get_store().insert_element_user(INTERFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    public com.eviware.soapui.config.InterfaceConfig addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.InterfaceConfig target = null;
            target = (com.eviware.soapui.config.InterfaceConfig)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "interface" element
     */
    public void removeInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACE$0, i);
        }
    }
    
    /**
     * Gets a List of "testSuite" elements
     */
    public java.util.List<com.eviware.soapui.config.TestSuiteConfig> getTestSuiteList()
    {
        final class TestSuiteList extends java.util.AbstractList<com.eviware.soapui.config.TestSuiteConfig>
        {
            public com.eviware.soapui.config.TestSuiteConfig get(int i)
                { return ProjectConfigImpl.this.getTestSuiteArray(i); }
            
            public com.eviware.soapui.config.TestSuiteConfig set(int i, com.eviware.soapui.config.TestSuiteConfig o)
            {
                com.eviware.soapui.config.TestSuiteConfig old = ProjectConfigImpl.this.getTestSuiteArray(i);
                ProjectConfigImpl.this.setTestSuiteArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestSuiteConfig o)
                { ProjectConfigImpl.this.insertNewTestSuite(i).set(o); }
            
            public com.eviware.soapui.config.TestSuiteConfig remove(int i)
            {
                com.eviware.soapui.config.TestSuiteConfig old = ProjectConfigImpl.this.getTestSuiteArray(i);
                ProjectConfigImpl.this.removeTestSuite(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfTestSuiteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestSuiteList();
        }
    }
    
    /**
     * Gets array of all "testSuite" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestSuiteConfig[] getTestSuiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestSuiteConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestSuiteConfig>();
            get_store().find_all_element_users(TESTSUITE$2, targetList);
            com.eviware.soapui.config.TestSuiteConfig[] result = new com.eviware.soapui.config.TestSuiteConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testSuite" element
     */
    public com.eviware.soapui.config.TestSuiteConfig getTestSuiteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().find_element_user(TESTSUITE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testSuite" element
     */
    public int sizeOfTestSuiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSUITE$2);
        }
    }
    
    /**
     * Sets array of all "testSuite" element
     */
    public void setTestSuiteArray(com.eviware.soapui.config.TestSuiteConfig[] testSuiteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testSuiteArray, TESTSUITE$2);
        }
    }
    
    /**
     * Sets ith "testSuite" element
     */
    public void setTestSuiteArray(int i, com.eviware.soapui.config.TestSuiteConfig testSuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().find_element_user(TESTSUITE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testSuite);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testSuite" element
     */
    public com.eviware.soapui.config.TestSuiteConfig insertNewTestSuite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().insert_element_user(TESTSUITE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testSuite" element
     */
    public com.eviware.soapui.config.TestSuiteConfig addNewTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().add_element_user(TESTSUITE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "testSuite" element
     */
    public void removeTestSuite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSUITE$2, i);
        }
    }
    
    /**
     * Gets a List of "mockService" elements
     */
    public java.util.List<com.eviware.soapui.config.MockServiceConfig> getMockServiceList()
    {
        final class MockServiceList extends java.util.AbstractList<com.eviware.soapui.config.MockServiceConfig>
        {
            public com.eviware.soapui.config.MockServiceConfig get(int i)
                { return ProjectConfigImpl.this.getMockServiceArray(i); }
            
            public com.eviware.soapui.config.MockServiceConfig set(int i, com.eviware.soapui.config.MockServiceConfig o)
            {
                com.eviware.soapui.config.MockServiceConfig old = ProjectConfigImpl.this.getMockServiceArray(i);
                ProjectConfigImpl.this.setMockServiceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MockServiceConfig o)
                { ProjectConfigImpl.this.insertNewMockService(i).set(o); }
            
            public com.eviware.soapui.config.MockServiceConfig remove(int i)
            {
                com.eviware.soapui.config.MockServiceConfig old = ProjectConfigImpl.this.getMockServiceArray(i);
                ProjectConfigImpl.this.removeMockService(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfMockServiceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MockServiceList();
        }
    }
    
    /**
     * Gets array of all "mockService" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MockServiceConfig[] getMockServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MockServiceConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MockServiceConfig>();
            get_store().find_all_element_users(MOCKSERVICE$4, targetList);
            com.eviware.soapui.config.MockServiceConfig[] result = new com.eviware.soapui.config.MockServiceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mockService" element
     */
    public com.eviware.soapui.config.MockServiceConfig getMockServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().find_element_user(MOCKSERVICE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mockService" element
     */
    public int sizeOfMockServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOCKSERVICE$4);
        }
    }
    
    /**
     * Sets array of all "mockService" element
     */
    public void setMockServiceArray(com.eviware.soapui.config.MockServiceConfig[] mockServiceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mockServiceArray, MOCKSERVICE$4);
        }
    }
    
    /**
     * Sets ith "mockService" element
     */
    public void setMockServiceArray(int i, com.eviware.soapui.config.MockServiceConfig mockService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().find_element_user(MOCKSERVICE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mockService);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mockService" element
     */
    public com.eviware.soapui.config.MockServiceConfig insertNewMockService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().insert_element_user(MOCKSERVICE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mockService" element
     */
    public com.eviware.soapui.config.MockServiceConfig addNewMockService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().add_element_user(MOCKSERVICE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "mockService" element
     */
    public void removeMockService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOCKSERVICE$4, i);
        }
    }
    
    /**
     * Gets a List of "restMockService" elements
     */
    public java.util.List<com.eviware.soapui.config.RESTMockServiceConfig> getRestMockServiceList()
    {
        final class RestMockServiceList extends java.util.AbstractList<com.eviware.soapui.config.RESTMockServiceConfig>
        {
            public com.eviware.soapui.config.RESTMockServiceConfig get(int i)
                { return ProjectConfigImpl.this.getRestMockServiceArray(i); }
            
            public com.eviware.soapui.config.RESTMockServiceConfig set(int i, com.eviware.soapui.config.RESTMockServiceConfig o)
            {
                com.eviware.soapui.config.RESTMockServiceConfig old = ProjectConfigImpl.this.getRestMockServiceArray(i);
                ProjectConfigImpl.this.setRestMockServiceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RESTMockServiceConfig o)
                { ProjectConfigImpl.this.insertNewRestMockService(i).set(o); }
            
            public com.eviware.soapui.config.RESTMockServiceConfig remove(int i)
            {
                com.eviware.soapui.config.RESTMockServiceConfig old = ProjectConfigImpl.this.getRestMockServiceArray(i);
                ProjectConfigImpl.this.removeRestMockService(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfRestMockServiceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RestMockServiceList();
        }
    }
    
    /**
     * Gets array of all "restMockService" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RESTMockServiceConfig[] getRestMockServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RESTMockServiceConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RESTMockServiceConfig>();
            get_store().find_all_element_users(RESTMOCKSERVICE$6, targetList);
            com.eviware.soapui.config.RESTMockServiceConfig[] result = new com.eviware.soapui.config.RESTMockServiceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "restMockService" element
     */
    public com.eviware.soapui.config.RESTMockServiceConfig getRestMockServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockServiceConfig target = null;
            target = (com.eviware.soapui.config.RESTMockServiceConfig)get_store().find_element_user(RESTMOCKSERVICE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "restMockService" element
     */
    public int sizeOfRestMockServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTMOCKSERVICE$6);
        }
    }
    
    /**
     * Sets array of all "restMockService" element
     */
    public void setRestMockServiceArray(com.eviware.soapui.config.RESTMockServiceConfig[] restMockServiceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restMockServiceArray, RESTMOCKSERVICE$6);
        }
    }
    
    /**
     * Sets ith "restMockService" element
     */
    public void setRestMockServiceArray(int i, com.eviware.soapui.config.RESTMockServiceConfig restMockService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockServiceConfig target = null;
            target = (com.eviware.soapui.config.RESTMockServiceConfig)get_store().find_element_user(RESTMOCKSERVICE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(restMockService);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restMockService" element
     */
    public com.eviware.soapui.config.RESTMockServiceConfig insertNewRestMockService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockServiceConfig target = null;
            target = (com.eviware.soapui.config.RESTMockServiceConfig)get_store().insert_element_user(RESTMOCKSERVICE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restMockService" element
     */
    public com.eviware.soapui.config.RESTMockServiceConfig addNewRestMockService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockServiceConfig target = null;
            target = (com.eviware.soapui.config.RESTMockServiceConfig)get_store().add_element_user(RESTMOCKSERVICE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "restMockService" element
     */
    public void removeRestMockService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTMOCKSERVICE$6, i);
        }
    }
    
    /**
     * Gets the "endpointStrategy" element
     */
    public com.eviware.soapui.config.EndpointStrategyConfig getEndpointStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointStrategyConfig target = null;
            target = (com.eviware.soapui.config.EndpointStrategyConfig)get_store().find_element_user(ENDPOINTSTRATEGY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endpointStrategy" element
     */
    public boolean isSetEndpointStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINTSTRATEGY$8) != 0;
        }
    }
    
    /**
     * Sets the "endpointStrategy" element
     */
    public void setEndpointStrategy(com.eviware.soapui.config.EndpointStrategyConfig endpointStrategy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointStrategyConfig target = null;
            target = (com.eviware.soapui.config.EndpointStrategyConfig)get_store().find_element_user(ENDPOINTSTRATEGY$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.EndpointStrategyConfig)get_store().add_element_user(ENDPOINTSTRATEGY$8);
            }
            target.set(endpointStrategy);
        }
    }
    
    /**
     * Appends and returns a new empty "endpointStrategy" element
     */
    public com.eviware.soapui.config.EndpointStrategyConfig addNewEndpointStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointStrategyConfig target = null;
            target = (com.eviware.soapui.config.EndpointStrategyConfig)get_store().add_element_user(ENDPOINTSTRATEGY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "endpointStrategy" element
     */
    public void unsetEndpointStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINTSTRATEGY$8, 0);
        }
    }
    
    /**
     * Gets the "requirements" element
     */
    public com.eviware.soapui.config.RequirementsTypeConfig getRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementsTypeConfig target = null;
            target = (com.eviware.soapui.config.RequirementsTypeConfig)get_store().find_element_user(REQUIREMENTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requirements" element
     */
    public boolean isSetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREMENTS$10) != 0;
        }
    }
    
    /**
     * Sets the "requirements" element
     */
    public void setRequirements(com.eviware.soapui.config.RequirementsTypeConfig requirements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementsTypeConfig target = null;
            target = (com.eviware.soapui.config.RequirementsTypeConfig)get_store().find_element_user(REQUIREMENTS$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RequirementsTypeConfig)get_store().add_element_user(REQUIREMENTS$10);
            }
            target.set(requirements);
        }
    }
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    public com.eviware.soapui.config.RequirementsTypeConfig addNewRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementsTypeConfig target = null;
            target = (com.eviware.soapui.config.RequirementsTypeConfig)get_store().add_element_user(REQUIREMENTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "requirements" element
     */
    public void unsetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREMENTS$10, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$12) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$12, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$12);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$12, 0);
        }
    }
    
    /**
     * Gets the "afterLoadScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getAfterLoadScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERLOADSCRIPT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "afterLoadScript" element
     */
    public boolean isSetAfterLoadScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFTERLOADSCRIPT$14) != 0;
        }
    }
    
    /**
     * Sets the "afterLoadScript" element
     */
    public void setAfterLoadScript(com.eviware.soapui.config.ScriptConfig afterLoadScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERLOADSCRIPT$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERLOADSCRIPT$14);
            }
            target.set(afterLoadScript);
        }
    }
    
    /**
     * Appends and returns a new empty "afterLoadScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewAfterLoadScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERLOADSCRIPT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "afterLoadScript" element
     */
    public void unsetAfterLoadScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFTERLOADSCRIPT$14, 0);
        }
    }
    
    /**
     * Gets the "beforeSaveScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getBeforeSaveScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(BEFORESAVESCRIPT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "beforeSaveScript" element
     */
    public boolean isSetBeforeSaveScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEFORESAVESCRIPT$16) != 0;
        }
    }
    
    /**
     * Sets the "beforeSaveScript" element
     */
    public void setBeforeSaveScript(com.eviware.soapui.config.ScriptConfig beforeSaveScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(BEFORESAVESCRIPT$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(BEFORESAVESCRIPT$16);
            }
            target.set(beforeSaveScript);
        }
    }
    
    /**
     * Appends and returns a new empty "beforeSaveScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewBeforeSaveScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(BEFORESAVESCRIPT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "beforeSaveScript" element
     */
    public void unsetBeforeSaveScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEFORESAVESCRIPT$16, 0);
        }
    }
    
    /**
     * Gets the "encryptedContent" element
     */
    public byte[] getEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedContent" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ENCRYPTEDCONTENT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "encryptedContent" element
     */
    public boolean isSetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDCONTENT$18) != 0;
        }
    }
    
    /**
     * Sets the "encryptedContent" element
     */
    public void setEncryptedContent(byte[] encryptedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTEDCONTENT$18);
            }
            target.setByteArrayValue(encryptedContent);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedContent" element
     */
    public void xsetEncryptedContent(org.apache.xmlbeans.XmlBase64Binary encryptedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ENCRYPTEDCONTENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(ENCRYPTEDCONTENT$18);
            }
            target.set(encryptedContent);
        }
    }
    
    /**
     * Unsets the "encryptedContent" element
     */
    public void unsetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDCONTENT$18, 0);
        }
    }
    
    /**
     * Gets the "encryptedContentAlgorithm" element
     */
    public java.lang.String getEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedContentAlgorithm" element
     */
    public org.apache.xmlbeans.XmlString xgetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "encryptedContentAlgorithm" element
     */
    public boolean isSetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDCONTENTALGORITHM$20) != 0;
        }
    }
    
    /**
     * Sets the "encryptedContentAlgorithm" element
     */
    public void setEncryptedContentAlgorithm(java.lang.String encryptedContentAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTEDCONTENTALGORITHM$20);
            }
            target.setStringValue(encryptedContentAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedContentAlgorithm" element
     */
    public void xsetEncryptedContentAlgorithm(org.apache.xmlbeans.XmlString encryptedContentAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENCRYPTEDCONTENTALGORITHM$20);
            }
            target.set(encryptedContentAlgorithm);
        }
    }
    
    /**
     * Unsets the "encryptedContentAlgorithm" element
     */
    public void unsetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDCONTENTALGORITHM$20, 0);
        }
    }
    
    /**
     * Gets the "wssContainer" element
     */
    public com.eviware.soapui.config.WssContainerConfig getWssContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WssContainerConfig target = null;
            target = (com.eviware.soapui.config.WssContainerConfig)get_store().find_element_user(WSSCONTAINER$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wssContainer" element
     */
    public boolean isSetWssContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSSCONTAINER$22) != 0;
        }
    }
    
    /**
     * Sets the "wssContainer" element
     */
    public void setWssContainer(com.eviware.soapui.config.WssContainerConfig wssContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WssContainerConfig target = null;
            target = (com.eviware.soapui.config.WssContainerConfig)get_store().find_element_user(WSSCONTAINER$22, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WssContainerConfig)get_store().add_element_user(WSSCONTAINER$22);
            }
            target.set(wssContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "wssContainer" element
     */
    public com.eviware.soapui.config.WssContainerConfig addNewWssContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WssContainerConfig target = null;
            target = (com.eviware.soapui.config.WssContainerConfig)get_store().add_element_user(WSSCONTAINER$22);
            return target;
        }
    }
    
    /**
     * Unsets the "wssContainer" element
     */
    public void unsetWssContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSSCONTAINER$22, 0);
        }
    }
    
    /**
     * Gets the "databaseConnectionContainer" element
     */
    public com.eviware.soapui.config.DatabaseConnectionContainerConfig getDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().find_element_user(DATABASECONNECTIONCONTAINER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "databaseConnectionContainer" element
     */
    public boolean isSetDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABASECONNECTIONCONTAINER$24) != 0;
        }
    }
    
    /**
     * Sets the "databaseConnectionContainer" element
     */
    public void setDatabaseConnectionContainer(com.eviware.soapui.config.DatabaseConnectionContainerConfig databaseConnectionContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().find_element_user(DATABASECONNECTIONCONTAINER$24, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().add_element_user(DATABASECONNECTIONCONTAINER$24);
            }
            target.set(databaseConnectionContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "databaseConnectionContainer" element
     */
    public com.eviware.soapui.config.DatabaseConnectionContainerConfig addNewDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().add_element_user(DATABASECONNECTIONCONTAINER$24);
            return target;
        }
    }
    
    /**
     * Unsets the "databaseConnectionContainer" element
     */
    public void unsetDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABASECONNECTIONCONTAINER$24, 0);
        }
    }
    
    /**
     * Gets the "oAuth2ProfileContainer" element
     */
    public com.eviware.soapui.config.OAuth2ProfileContainerConfig getOAuth2ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileContainerConfig)get_store().find_element_user(OAUTH2PROFILECONTAINER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oAuth2ProfileContainer" element
     */
    public boolean isSetOAuth2ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OAUTH2PROFILECONTAINER$26) != 0;
        }
    }
    
    /**
     * Sets the "oAuth2ProfileContainer" element
     */
    public void setOAuth2ProfileContainer(com.eviware.soapui.config.OAuth2ProfileContainerConfig oAuth2ProfileContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileContainerConfig)get_store().find_element_user(OAUTH2PROFILECONTAINER$26, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OAuth2ProfileContainerConfig)get_store().add_element_user(OAUTH2PROFILECONTAINER$26);
            }
            target.set(oAuth2ProfileContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "oAuth2ProfileContainer" element
     */
    public com.eviware.soapui.config.OAuth2ProfileContainerConfig addNewOAuth2ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileContainerConfig)get_store().add_element_user(OAUTH2PROFILECONTAINER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "oAuth2ProfileContainer" element
     */
    public void unsetOAuth2ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OAUTH2PROFILECONTAINER$26, 0);
        }
    }
    
    /**
     * Gets the "oAuth1ProfileContainer" element
     */
    public com.eviware.soapui.config.OAuth1ProfileContainerConfig getOAuth1ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileContainerConfig)get_store().find_element_user(OAUTH1PROFILECONTAINER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oAuth1ProfileContainer" element
     */
    public boolean isSetOAuth1ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OAUTH1PROFILECONTAINER$28) != 0;
        }
    }
    
    /**
     * Sets the "oAuth1ProfileContainer" element
     */
    public void setOAuth1ProfileContainer(com.eviware.soapui.config.OAuth1ProfileContainerConfig oAuth1ProfileContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileContainerConfig)get_store().find_element_user(OAUTH1PROFILECONTAINER$28, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OAuth1ProfileContainerConfig)get_store().add_element_user(OAUTH1PROFILECONTAINER$28);
            }
            target.set(oAuth1ProfileContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "oAuth1ProfileContainer" element
     */
    public com.eviware.soapui.config.OAuth1ProfileContainerConfig addNewOAuth1ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileContainerConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileContainerConfig)get_store().add_element_user(OAUTH1PROFILECONTAINER$28);
            return target;
        }
    }
    
    /**
     * Unsets the "oAuth1ProfileContainer" element
     */
    public void unsetOAuth1ProfileContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OAUTH1PROFILECONTAINER$28, 0);
        }
    }
    
    /**
     * Gets the "reporting" element
     */
    public com.eviware.soapui.config.ReportingTypeConfig getReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportingTypeConfig target = null;
            target = (com.eviware.soapui.config.ReportingTypeConfig)get_store().find_element_user(REPORTING$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reporting" element
     */
    public boolean isSetReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTING$30) != 0;
        }
    }
    
    /**
     * Sets the "reporting" element
     */
    public void setReporting(com.eviware.soapui.config.ReportingTypeConfig reporting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportingTypeConfig target = null;
            target = (com.eviware.soapui.config.ReportingTypeConfig)get_store().find_element_user(REPORTING$30, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ReportingTypeConfig)get_store().add_element_user(REPORTING$30);
            }
            target.set(reporting);
        }
    }
    
    /**
     * Appends and returns a new empty "reporting" element
     */
    public com.eviware.soapui.config.ReportingTypeConfig addNewReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportingTypeConfig target = null;
            target = (com.eviware.soapui.config.ReportingTypeConfig)get_store().add_element_user(REPORTING$30);
            return target;
        }
    }
    
    /**
     * Unsets the "reporting" element
     */
    public void unsetReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTING$30, 0);
        }
    }
    
    /**
     * Gets the "reportScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportScript" element
     */
    public boolean isSetReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSCRIPT$32) != 0;
        }
    }
    
    /**
     * Sets the "reportScript" element
     */
    public void setReportScript(com.eviware.soapui.config.ScriptConfig reportScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$32, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$32);
            }
            target.set(reportScript);
        }
    }
    
    /**
     * Appends and returns a new empty "reportScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$32);
            return target;
        }
    }
    
    /**
     * Unsets the "reportScript" element
     */
    public void unsetReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSCRIPT$32, 0);
        }
    }
    
    /**
     * Gets the "beforeRunScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(BEFORERUNSCRIPT$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "beforeRunScript" element
     */
    public boolean isSetBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEFORERUNSCRIPT$34) != 0;
        }
    }
    
    /**
     * Sets the "beforeRunScript" element
     */
    public void setBeforeRunScript(com.eviware.soapui.config.ScriptConfig beforeRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(BEFORERUNSCRIPT$34, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(BEFORERUNSCRIPT$34);
            }
            target.set(beforeRunScript);
        }
    }
    
    /**
     * Appends and returns a new empty "beforeRunScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(BEFORERUNSCRIPT$34);
            return target;
        }
    }
    
    /**
     * Unsets the "beforeRunScript" element
     */
    public void unsetBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEFORERUNSCRIPT$34, 0);
        }
    }
    
    /**
     * Gets the "afterRunScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERRUNSCRIPT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "afterRunScript" element
     */
    public boolean isSetAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFTERRUNSCRIPT$36) != 0;
        }
    }
    
    /**
     * Sets the "afterRunScript" element
     */
    public void setAfterRunScript(com.eviware.soapui.config.ScriptConfig afterRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERRUNSCRIPT$36, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERRUNSCRIPT$36);
            }
            target.set(afterRunScript);
        }
    }
    
    /**
     * Appends and returns a new empty "afterRunScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERRUNSCRIPT$36);
            return target;
        }
    }
    
    /**
     * Unsets the "afterRunScript" element
     */
    public void unsetAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFTERRUNSCRIPT$36, 0);
        }
    }
    
    /**
     * Gets a List of "eventHandlers" elements
     */
    public java.util.List<com.eviware.soapui.config.EventHandlerTypeConfig> getEventHandlersList()
    {
        final class EventHandlersList extends java.util.AbstractList<com.eviware.soapui.config.EventHandlerTypeConfig>
        {
            public com.eviware.soapui.config.EventHandlerTypeConfig get(int i)
                { return ProjectConfigImpl.this.getEventHandlersArray(i); }
            
            public com.eviware.soapui.config.EventHandlerTypeConfig set(int i, com.eviware.soapui.config.EventHandlerTypeConfig o)
            {
                com.eviware.soapui.config.EventHandlerTypeConfig old = ProjectConfigImpl.this.getEventHandlersArray(i);
                ProjectConfigImpl.this.setEventHandlersArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.EventHandlerTypeConfig o)
                { ProjectConfigImpl.this.insertNewEventHandlers(i).set(o); }
            
            public com.eviware.soapui.config.EventHandlerTypeConfig remove(int i)
            {
                com.eviware.soapui.config.EventHandlerTypeConfig old = ProjectConfigImpl.this.getEventHandlersArray(i);
                ProjectConfigImpl.this.removeEventHandlers(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfEventHandlersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EventHandlersList();
        }
    }
    
    /**
     * Gets array of all "eventHandlers" elements
     * @deprecated
     */
    public com.eviware.soapui.config.EventHandlerTypeConfig[] getEventHandlersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.EventHandlerTypeConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.EventHandlerTypeConfig>();
            get_store().find_all_element_users(EVENTHANDLERS$38, targetList);
            com.eviware.soapui.config.EventHandlerTypeConfig[] result = new com.eviware.soapui.config.EventHandlerTypeConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eventHandlers" element
     */
    public com.eviware.soapui.config.EventHandlerTypeConfig getEventHandlersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EventHandlerTypeConfig target = null;
            target = (com.eviware.soapui.config.EventHandlerTypeConfig)get_store().find_element_user(EVENTHANDLERS$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eventHandlers" element
     */
    public int sizeOfEventHandlersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTHANDLERS$38);
        }
    }
    
    /**
     * Sets array of all "eventHandlers" element
     */
    public void setEventHandlersArray(com.eviware.soapui.config.EventHandlerTypeConfig[] eventHandlersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventHandlersArray, EVENTHANDLERS$38);
        }
    }
    
    /**
     * Sets ith "eventHandlers" element
     */
    public void setEventHandlersArray(int i, com.eviware.soapui.config.EventHandlerTypeConfig eventHandlers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EventHandlerTypeConfig target = null;
            target = (com.eviware.soapui.config.EventHandlerTypeConfig)get_store().find_element_user(EVENTHANDLERS$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventHandlers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventHandlers" element
     */
    public com.eviware.soapui.config.EventHandlerTypeConfig insertNewEventHandlers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EventHandlerTypeConfig target = null;
            target = (com.eviware.soapui.config.EventHandlerTypeConfig)get_store().insert_element_user(EVENTHANDLERS$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventHandlers" element
     */
    public com.eviware.soapui.config.EventHandlerTypeConfig addNewEventHandlers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EventHandlerTypeConfig target = null;
            target = (com.eviware.soapui.config.EventHandlerTypeConfig)get_store().add_element_user(EVENTHANDLERS$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventHandlers" element
     */
    public void removeEventHandlers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTHANDLERS$38, i);
        }
    }
    
    /**
     * Gets the "sensitiveInformation" element
     */
    public com.eviware.soapui.config.SensitiveInformationConfig getSensitiveInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SensitiveInformationConfig target = null;
            target = (com.eviware.soapui.config.SensitiveInformationConfig)get_store().find_element_user(SENSITIVEINFORMATION$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sensitiveInformation" element
     */
    public boolean isSetSensitiveInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENSITIVEINFORMATION$40) != 0;
        }
    }
    
    /**
     * Sets the "sensitiveInformation" element
     */
    public void setSensitiveInformation(com.eviware.soapui.config.SensitiveInformationConfig sensitiveInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SensitiveInformationConfig target = null;
            target = (com.eviware.soapui.config.SensitiveInformationConfig)get_store().find_element_user(SENSITIVEINFORMATION$40, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SensitiveInformationConfig)get_store().add_element_user(SENSITIVEINFORMATION$40);
            }
            target.set(sensitiveInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "sensitiveInformation" element
     */
    public com.eviware.soapui.config.SensitiveInformationConfig addNewSensitiveInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SensitiveInformationConfig target = null;
            target = (com.eviware.soapui.config.SensitiveInformationConfig)get_store().add_element_user(SENSITIVEINFORMATION$40);
            return target;
        }
    }
    
    /**
     * Unsets the "sensitiveInformation" element
     */
    public void unsetSensitiveInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENSITIVEINFORMATION$40, 0);
        }
    }
    
    /**
     * Gets a List of "environment" elements
     */
    public java.util.List<com.eviware.soapui.config.EnvironmentConfig> getEnvironmentList()
    {
        final class EnvironmentList extends java.util.AbstractList<com.eviware.soapui.config.EnvironmentConfig>
        {
            public com.eviware.soapui.config.EnvironmentConfig get(int i)
                { return ProjectConfigImpl.this.getEnvironmentArray(i); }
            
            public com.eviware.soapui.config.EnvironmentConfig set(int i, com.eviware.soapui.config.EnvironmentConfig o)
            {
                com.eviware.soapui.config.EnvironmentConfig old = ProjectConfigImpl.this.getEnvironmentArray(i);
                ProjectConfigImpl.this.setEnvironmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.EnvironmentConfig o)
                { ProjectConfigImpl.this.insertNewEnvironment(i).set(o); }
            
            public com.eviware.soapui.config.EnvironmentConfig remove(int i)
            {
                com.eviware.soapui.config.EnvironmentConfig old = ProjectConfigImpl.this.getEnvironmentArray(i);
                ProjectConfigImpl.this.removeEnvironment(i);
                return old;
            }
            
            public int size()
                { return ProjectConfigImpl.this.sizeOfEnvironmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnvironmentList();
        }
    }
    
    /**
     * Gets array of all "environment" elements
     * @deprecated
     */
    public com.eviware.soapui.config.EnvironmentConfig[] getEnvironmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.EnvironmentConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.EnvironmentConfig>();
            get_store().find_all_element_users(ENVIRONMENT$42, targetList);
            com.eviware.soapui.config.EnvironmentConfig[] result = new com.eviware.soapui.config.EnvironmentConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "environment" element
     */
    public com.eviware.soapui.config.EnvironmentConfig getEnvironmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentConfig)get_store().find_element_user(ENVIRONMENT$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "environment" element
     */
    public int sizeOfEnvironmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVIRONMENT$42);
        }
    }
    
    /**
     * Sets array of all "environment" element
     */
    public void setEnvironmentArray(com.eviware.soapui.config.EnvironmentConfig[] environmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(environmentArray, ENVIRONMENT$42);
        }
    }
    
    /**
     * Sets ith "environment" element
     */
    public void setEnvironmentArray(int i, com.eviware.soapui.config.EnvironmentConfig environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentConfig)get_store().find_element_user(ENVIRONMENT$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(environment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "environment" element
     */
    public com.eviware.soapui.config.EnvironmentConfig insertNewEnvironment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentConfig)get_store().insert_element_user(ENVIRONMENT$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "environment" element
     */
    public com.eviware.soapui.config.EnvironmentConfig addNewEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentConfig)get_store().add_element_user(ENVIRONMENT$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "environment" element
     */
    public void removeEnvironment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVIRONMENT$42, i);
        }
    }
    
    /**
     * Gets the "soapui-version" attribute
     */
    public java.lang.String getSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPUIVERSION$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapui-version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPUIVERSION$44);
            return target;
        }
    }
    
    /**
     * True if has "soapui-version" attribute
     */
    public boolean isSetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPUIVERSION$44) != null;
        }
    }
    
    /**
     * Sets the "soapui-version" attribute
     */
    public void setSoapuiVersion(java.lang.String soapuiVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPUIVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPUIVERSION$44);
            }
            target.setStringValue(soapuiVersion);
        }
    }
    
    /**
     * Sets (as xml) the "soapui-version" attribute
     */
    public void xsetSoapuiVersion(org.apache.xmlbeans.XmlString soapuiVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPUIVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOAPUIVERSION$44);
            }
            target.set(soapuiVersion);
        }
    }
    
    /**
     * Unsets the "soapui-version" attribute
     */
    public void unsetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPUIVERSION$44);
        }
    }
    
    /**
     * Gets the "resourceRoot" attribute
     */
    public java.lang.String getResourceRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEROOT$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceRoot" attribute
     */
    public org.apache.xmlbeans.XmlString xgetResourceRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEROOT$46);
            return target;
        }
    }
    
    /**
     * True if has "resourceRoot" attribute
     */
    public boolean isSetResourceRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESOURCEROOT$46) != null;
        }
    }
    
    /**
     * Sets the "resourceRoot" attribute
     */
    public void setResourceRoot(java.lang.String resourceRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEROOT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCEROOT$46);
            }
            target.setStringValue(resourceRoot);
        }
    }
    
    /**
     * Sets (as xml) the "resourceRoot" attribute
     */
    public void xsetResourceRoot(org.apache.xmlbeans.XmlString resourceRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEROOT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCEROOT$46);
            }
            target.set(resourceRoot);
        }
    }
    
    /**
     * Unsets the "resourceRoot" attribute
     */
    public void unsetResourceRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESOURCEROOT$46);
        }
    }
    
    /**
     * Gets the "defaultScriptLanguage" attribute
     */
    public java.lang.String getDefaultScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultScriptLanguage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefaultScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            return target;
        }
    }
    
    /**
     * True if has "defaultScriptLanguage" attribute
     */
    public boolean isSetDefaultScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTSCRIPTLANGUAGE$48) != null;
        }
    }
    
    /**
     * Sets the "defaultScriptLanguage" attribute
     */
    public void setDefaultScriptLanguage(java.lang.String defaultScriptLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            }
            target.setStringValue(defaultScriptLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "defaultScriptLanguage" attribute
     */
    public void xsetDefaultScriptLanguage(org.apache.xmlbeans.XmlString defaultScriptLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSCRIPTLANGUAGE$48);
            }
            target.set(defaultScriptLanguage);
        }
    }
    
    /**
     * Unsets the "defaultScriptLanguage" attribute
     */
    public void unsetDefaultScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTSCRIPTLANGUAGE$48);
        }
    }
    
    /**
     * Gets the "abortOnError" attribute
     */
    public boolean getAbortOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$50);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "abortOnError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbortOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$50);
            return target;
        }
    }
    
    /**
     * True if has "abortOnError" attribute
     */
    public boolean isSetAbortOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABORTONERROR$50) != null;
        }
    }
    
    /**
     * Sets the "abortOnError" attribute
     */
    public void setAbortOnError(boolean abortOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABORTONERROR$50);
            }
            target.setBooleanValue(abortOnError);
        }
    }
    
    /**
     * Sets (as xml) the "abortOnError" attribute
     */
    public void xsetAbortOnError(org.apache.xmlbeans.XmlBoolean abortOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABORTONERROR$50);
            }
            target.set(abortOnError);
        }
    }
    
    /**
     * Unsets the "abortOnError" attribute
     */
    public void unsetAbortOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABORTONERROR$50);
        }
    }
    
    /**
     * Gets the "timeout" attribute
     */
    public long getTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$52);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeout" attribute
     */
    public org.apache.xmlbeans.XmlLong xgetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$52);
            return target;
        }
    }
    
    /**
     * True if has "timeout" attribute
     */
    public boolean isSetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEOUT$52) != null;
        }
    }
    
    /**
     * Sets the "timeout" attribute
     */
    public void setTimeout(long timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEOUT$52);
            }
            target.setLongValue(timeout);
        }
    }
    
    /**
     * Sets (as xml) the "timeout" attribute
     */
    public void xsetTimeout(org.apache.xmlbeans.XmlLong timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(TIMEOUT$52);
            }
            target.set(timeout);
        }
    }
    
    /**
     * Unsets the "timeout" attribute
     */
    public void unsetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEOUT$52);
        }
    }
    
    /**
     * Gets the "runType" attribute
     */
    public com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum getRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNTYPE$54);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "runType" attribute
     */
    public com.eviware.soapui.config.TestSuiteRunTypesConfig xgetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteRunTypesConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_attribute_user(RUNTYPE$54);
            return target;
        }
    }
    
    /**
     * True if has "runType" attribute
     */
    public boolean isSetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RUNTYPE$54) != null;
        }
    }
    
    /**
     * Sets the "runType" attribute
     */
    public void setRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum runType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNTYPE$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNTYPE$54);
            }
            target.setEnumValue(runType);
        }
    }
    
    /**
     * Sets (as xml) the "runType" attribute
     */
    public void xsetRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig runType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteRunTypesConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_attribute_user(RUNTYPE$54);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().add_attribute_user(RUNTYPE$54);
            }
            target.set(runType);
        }
    }
    
    /**
     * Unsets the "runType" attribute
     */
    public void unsetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RUNTYPE$54);
        }
    }
    
    /**
     * Gets the "scriptLibrary" attribute
     */
    public java.lang.String getScriptLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTLIBRARY$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scriptLibrary" attribute
     */
    public org.apache.xmlbeans.XmlString xgetScriptLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTLIBRARY$56);
            return target;
        }
    }
    
    /**
     * True if has "scriptLibrary" attribute
     */
    public boolean isSetScriptLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCRIPTLIBRARY$56) != null;
        }
    }
    
    /**
     * Sets the "scriptLibrary" attribute
     */
    public void setScriptLibrary(java.lang.String scriptLibrary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTLIBRARY$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCRIPTLIBRARY$56);
            }
            target.setStringValue(scriptLibrary);
        }
    }
    
    /**
     * Sets (as xml) the "scriptLibrary" attribute
     */
    public void xsetScriptLibrary(org.apache.xmlbeans.XmlString scriptLibrary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTLIBRARY$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCRIPTLIBRARY$56);
            }
            target.set(scriptLibrary);
        }
    }
    
    /**
     * Unsets the "scriptLibrary" attribute
     */
    public void unsetScriptLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCRIPTLIBRARY$56);
        }
    }
    
    /**
     * Gets the "activeEnvironment" attribute
     */
    public java.lang.String getActiveEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEENVIRONMENT$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeEnvironment" attribute
     */
    public org.apache.xmlbeans.XmlString xgetActiveEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIVEENVIRONMENT$58);
            return target;
        }
    }
    
    /**
     * True if has "activeEnvironment" attribute
     */
    public boolean isSetActiveEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVEENVIRONMENT$58) != null;
        }
    }
    
    /**
     * Sets the "activeEnvironment" attribute
     */
    public void setActiveEnvironment(java.lang.String activeEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEENVIRONMENT$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVEENVIRONMENT$58);
            }
            target.setStringValue(activeEnvironment);
        }
    }
    
    /**
     * Sets (as xml) the "activeEnvironment" attribute
     */
    public void xsetActiveEnvironment(org.apache.xmlbeans.XmlString activeEnvironment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIVEENVIRONMENT$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTIVEENVIRONMENT$58);
            }
            target.set(activeEnvironment);
        }
    }
    
    /**
     * Unsets the "activeEnvironment" attribute
     */
    public void unsetActiveEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVEENVIRONMENT$58);
        }
    }
}
