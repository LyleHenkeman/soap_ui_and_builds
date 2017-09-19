/*
 * XML Type:  TestCase
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestCaseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestCase(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestCaseConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.TestCaseConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestCaseConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSTEP$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStep");
    private static final javax.xml.namespace.QName LOADTEST$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "loadTest");
    private static final javax.xml.namespace.QName SETUPSCRIPT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "setupScript");
    private static final javax.xml.namespace.QName TEARDOWNSCRIPT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tearDownScript");
    private static final javax.xml.namespace.QName PROPERTIES$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName REQUIREMENTS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "requirements");
    private static final javax.xml.namespace.QName REPORTTEMPLATES$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportTemplates");
    private static final javax.xml.namespace.QName REPORTSCRIPT$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportScript");
    private static final javax.xml.namespace.QName REPORTPARAMETERS$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportParameters");
    private static final javax.xml.namespace.QName SECURITYTEST$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "securityTest");
    private static final javax.xml.namespace.QName BREAKPOINTS$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "breakPoints");
    private static final javax.xml.namespace.QName KEEPSESSION$22 = 
        new javax.xml.namespace.QName("", "keepSession");
    private static final javax.xml.namespace.QName FAILONERROR$24 = 
        new javax.xml.namespace.QName("", "failOnError");
    private static final javax.xml.namespace.QName FAILTESTCASEONERRORS$26 = 
        new javax.xml.namespace.QName("", "failTestCaseOnErrors");
    private static final javax.xml.namespace.QName DISCARDOKRESULTS$28 = 
        new javax.xml.namespace.QName("", "discardOkResults");
    private static final javax.xml.namespace.QName SEARCHPROPERTIES$30 = 
        new javax.xml.namespace.QName("", "searchProperties");
    private static final javax.xml.namespace.QName DISABLED$32 = 
        new javax.xml.namespace.QName("", "disabled");
    private static final javax.xml.namespace.QName TIMEOUT$34 = 
        new javax.xml.namespace.QName("", "timeout");
    private static final javax.xml.namespace.QName MAXRESULTS$36 = 
        new javax.xml.namespace.QName("", "maxResults");
    private static final javax.xml.namespace.QName WSRMENABLED$38 = 
        new javax.xml.namespace.QName("", "wsrmEnabled");
    private static final javax.xml.namespace.QName WSRMVERSION$40 = 
        new javax.xml.namespace.QName("", "wsrmVersion");
    private static final javax.xml.namespace.QName WSRMACKTO$42 = 
        new javax.xml.namespace.QName("", "wsrmAckTo");
    private static final javax.xml.namespace.QName WSRMEXPIRES$44 = 
        new javax.xml.namespace.QName("", "wsrmExpires");
    private static final javax.xml.namespace.QName AMFAUTHORISATION$46 = 
        new javax.xml.namespace.QName("", "amfAuthorisation");
    private static final javax.xml.namespace.QName AMFLOGIN$48 = 
        new javax.xml.namespace.QName("", "amfLogin");
    private static final javax.xml.namespace.QName AMFPASSWORD$50 = 
        new javax.xml.namespace.QName("", "amfPassword");
    private static final javax.xml.namespace.QName AMFENDPOINT$52 = 
        new javax.xml.namespace.QName("", "amfEndpoint");
    
    
    /**
     * Gets a List of "testStep" elements
     */
    public java.util.List<com.eviware.soapui.config.TestStepConfig> getTestStepList()
    {
        final class TestStepList extends java.util.AbstractList<com.eviware.soapui.config.TestStepConfig>
        {
            public com.eviware.soapui.config.TestStepConfig get(int i)
                { return TestCaseConfigImpl.this.getTestStepArray(i); }
            
            public com.eviware.soapui.config.TestStepConfig set(int i, com.eviware.soapui.config.TestStepConfig o)
            {
                com.eviware.soapui.config.TestStepConfig old = TestCaseConfigImpl.this.getTestStepArray(i);
                TestCaseConfigImpl.this.setTestStepArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestStepConfig o)
                { TestCaseConfigImpl.this.insertNewTestStep(i).set(o); }
            
            public com.eviware.soapui.config.TestStepConfig remove(int i)
            {
                com.eviware.soapui.config.TestStepConfig old = TestCaseConfigImpl.this.getTestStepArray(i);
                TestCaseConfigImpl.this.removeTestStep(i);
                return old;
            }
            
            public int size()
                { return TestCaseConfigImpl.this.sizeOfTestStepArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestStepList();
        }
    }
    
    /**
     * Gets array of all "testStep" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestStepConfig[] getTestStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestStepConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestStepConfig>();
            get_store().find_all_element_users(TESTSTEP$0, targetList);
            com.eviware.soapui.config.TestStepConfig[] result = new com.eviware.soapui.config.TestStepConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testStep" element
     */
    public com.eviware.soapui.config.TestStepConfig getTestStepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().find_element_user(TESTSTEP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testStep" element
     */
    public int sizeOfTestStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSTEP$0);
        }
    }
    
    /**
     * Sets array of all "testStep" element
     */
    public void setTestStepArray(com.eviware.soapui.config.TestStepConfig[] testStepArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testStepArray, TESTSTEP$0);
        }
    }
    
    /**
     * Sets ith "testStep" element
     */
    public void setTestStepArray(int i, com.eviware.soapui.config.TestStepConfig testStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().find_element_user(TESTSTEP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testStep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStep" element
     */
    public com.eviware.soapui.config.TestStepConfig insertNewTestStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().insert_element_user(TESTSTEP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStep" element
     */
    public com.eviware.soapui.config.TestStepConfig addNewTestStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().add_element_user(TESTSTEP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "testStep" element
     */
    public void removeTestStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSTEP$0, i);
        }
    }
    
    /**
     * Gets a List of "loadTest" elements
     */
    public java.util.List<com.eviware.soapui.config.LoadTestConfig> getLoadTestList()
    {
        final class LoadTestList extends java.util.AbstractList<com.eviware.soapui.config.LoadTestConfig>
        {
            public com.eviware.soapui.config.LoadTestConfig get(int i)
                { return TestCaseConfigImpl.this.getLoadTestArray(i); }
            
            public com.eviware.soapui.config.LoadTestConfig set(int i, com.eviware.soapui.config.LoadTestConfig o)
            {
                com.eviware.soapui.config.LoadTestConfig old = TestCaseConfigImpl.this.getLoadTestArray(i);
                TestCaseConfigImpl.this.setLoadTestArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.LoadTestConfig o)
                { TestCaseConfigImpl.this.insertNewLoadTest(i).set(o); }
            
            public com.eviware.soapui.config.LoadTestConfig remove(int i)
            {
                com.eviware.soapui.config.LoadTestConfig old = TestCaseConfigImpl.this.getLoadTestArray(i);
                TestCaseConfigImpl.this.removeLoadTest(i);
                return old;
            }
            
            public int size()
                { return TestCaseConfigImpl.this.sizeOfLoadTestArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LoadTestList();
        }
    }
    
    /**
     * Gets array of all "loadTest" elements
     * @deprecated
     */
    public com.eviware.soapui.config.LoadTestConfig[] getLoadTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.LoadTestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.LoadTestConfig>();
            get_store().find_all_element_users(LOADTEST$2, targetList);
            com.eviware.soapui.config.LoadTestConfig[] result = new com.eviware.soapui.config.LoadTestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "loadTest" element
     */
    public com.eviware.soapui.config.LoadTestConfig getLoadTestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestConfig target = null;
            target = (com.eviware.soapui.config.LoadTestConfig)get_store().find_element_user(LOADTEST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "loadTest" element
     */
    public int sizeOfLoadTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOADTEST$2);
        }
    }
    
    /**
     * Sets array of all "loadTest" element
     */
    public void setLoadTestArray(com.eviware.soapui.config.LoadTestConfig[] loadTestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loadTestArray, LOADTEST$2);
        }
    }
    
    /**
     * Sets ith "loadTest" element
     */
    public void setLoadTestArray(int i, com.eviware.soapui.config.LoadTestConfig loadTest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestConfig target = null;
            target = (com.eviware.soapui.config.LoadTestConfig)get_store().find_element_user(LOADTEST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loadTest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "loadTest" element
     */
    public com.eviware.soapui.config.LoadTestConfig insertNewLoadTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestConfig target = null;
            target = (com.eviware.soapui.config.LoadTestConfig)get_store().insert_element_user(LOADTEST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "loadTest" element
     */
    public com.eviware.soapui.config.LoadTestConfig addNewLoadTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestConfig target = null;
            target = (com.eviware.soapui.config.LoadTestConfig)get_store().add_element_user(LOADTEST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "loadTest" element
     */
    public void removeLoadTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOADTEST$2, i);
        }
    }
    
    /**
     * Gets the "setupScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "setupScript" element
     */
    public boolean isSetSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETUPSCRIPT$4) != 0;
        }
    }
    
    /**
     * Sets the "setupScript" element
     */
    public void setSetupScript(com.eviware.soapui.config.ScriptConfig setupScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$4);
            }
            target.set(setupScript);
        }
    }
    
    /**
     * Appends and returns a new empty "setupScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "setupScript" element
     */
    public void unsetSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETUPSCRIPT$4, 0);
        }
    }
    
    /**
     * Gets the "tearDownScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tearDownScript" element
     */
    public boolean isSetTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEARDOWNSCRIPT$6) != 0;
        }
    }
    
    /**
     * Sets the "tearDownScript" element
     */
    public void setTearDownScript(com.eviware.soapui.config.ScriptConfig tearDownScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$6);
            }
            target.set(tearDownScript);
        }
    }
    
    /**
     * Appends and returns a new empty "tearDownScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "tearDownScript" element
     */
    public void unsetTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEARDOWNSCRIPT$6, 0);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$8, 0);
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
            return get_store().count_elements(PROPERTIES$8) != 0;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$8);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$8);
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
            get_store().remove_element(PROPERTIES$8, 0);
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
     * Gets a List of "reportTemplates" elements
     */
    public java.util.List<com.eviware.soapui.config.ReportTemplateConfig> getReportTemplatesList()
    {
        final class ReportTemplatesList extends java.util.AbstractList<com.eviware.soapui.config.ReportTemplateConfig>
        {
            public com.eviware.soapui.config.ReportTemplateConfig get(int i)
                { return TestCaseConfigImpl.this.getReportTemplatesArray(i); }
            
            public com.eviware.soapui.config.ReportTemplateConfig set(int i, com.eviware.soapui.config.ReportTemplateConfig o)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestCaseConfigImpl.this.getReportTemplatesArray(i);
                TestCaseConfigImpl.this.setReportTemplatesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.ReportTemplateConfig o)
                { TestCaseConfigImpl.this.insertNewReportTemplates(i).set(o); }
            
            public com.eviware.soapui.config.ReportTemplateConfig remove(int i)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestCaseConfigImpl.this.getReportTemplatesArray(i);
                TestCaseConfigImpl.this.removeReportTemplates(i);
                return old;
            }
            
            public int size()
                { return TestCaseConfigImpl.this.sizeOfReportTemplatesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReportTemplatesList();
        }
    }
    
    /**
     * Gets array of all "reportTemplates" elements
     * @deprecated
     */
    public com.eviware.soapui.config.ReportTemplateConfig[] getReportTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.ReportTemplateConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.ReportTemplateConfig>();
            get_store().find_all_element_users(REPORTTEMPLATES$12, targetList);
            com.eviware.soapui.config.ReportTemplateConfig[] result = new com.eviware.soapui.config.ReportTemplateConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig getReportTemplatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reportTemplates" element
     */
    public int sizeOfReportTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTTEMPLATES$12);
        }
    }
    
    /**
     * Sets array of all "reportTemplates" element
     */
    public void setReportTemplatesArray(com.eviware.soapui.config.ReportTemplateConfig[] reportTemplatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportTemplatesArray, REPORTTEMPLATES$12);
        }
    }
    
    /**
     * Sets ith "reportTemplates" element
     */
    public void setReportTemplatesArray(int i, com.eviware.soapui.config.ReportTemplateConfig reportTemplates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportTemplates);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig insertNewReportTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().insert_element_user(REPORTTEMPLATES$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig addNewReportTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().add_element_user(REPORTTEMPLATES$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "reportTemplates" element
     */
    public void removeReportTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTTEMPLATES$12, i);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$14, 0);
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
            return get_store().count_elements(REPORTSCRIPT$14) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$14);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$14);
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
            get_store().remove_element(REPORTSCRIPT$14, 0);
        }
    }
    
    /**
     * Gets the "reportParameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportParameters" element
     */
    public boolean isSetReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPARAMETERS$16) != 0;
        }
    }
    
    /**
     * Sets the "reportParameters" element
     */
    public void setReportParameters(com.eviware.soapui.config.PropertiesTypeConfig reportParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$16);
            }
            target.set(reportParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "reportParameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "reportParameters" element
     */
    public void unsetReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPARAMETERS$16, 0);
        }
    }
    
    /**
     * Gets a List of "securityTest" elements
     */
    public java.util.List<com.eviware.soapui.config.SecurityTestConfig> getSecurityTestList()
    {
        final class SecurityTestList extends java.util.AbstractList<com.eviware.soapui.config.SecurityTestConfig>
        {
            public com.eviware.soapui.config.SecurityTestConfig get(int i)
                { return TestCaseConfigImpl.this.getSecurityTestArray(i); }
            
            public com.eviware.soapui.config.SecurityTestConfig set(int i, com.eviware.soapui.config.SecurityTestConfig o)
            {
                com.eviware.soapui.config.SecurityTestConfig old = TestCaseConfigImpl.this.getSecurityTestArray(i);
                TestCaseConfigImpl.this.setSecurityTestArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SecurityTestConfig o)
                { TestCaseConfigImpl.this.insertNewSecurityTest(i).set(o); }
            
            public com.eviware.soapui.config.SecurityTestConfig remove(int i)
            {
                com.eviware.soapui.config.SecurityTestConfig old = TestCaseConfigImpl.this.getSecurityTestArray(i);
                TestCaseConfigImpl.this.removeSecurityTest(i);
                return old;
            }
            
            public int size()
                { return TestCaseConfigImpl.this.sizeOfSecurityTestArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityTestList();
        }
    }
    
    /**
     * Gets array of all "securityTest" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SecurityTestConfig[] getSecurityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SecurityTestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SecurityTestConfig>();
            get_store().find_all_element_users(SECURITYTEST$18, targetList);
            com.eviware.soapui.config.SecurityTestConfig[] result = new com.eviware.soapui.config.SecurityTestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "securityTest" element
     */
    public com.eviware.soapui.config.SecurityTestConfig getSecurityTestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityTestConfig target = null;
            target = (com.eviware.soapui.config.SecurityTestConfig)get_store().find_element_user(SECURITYTEST$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "securityTest" element
     */
    public int sizeOfSecurityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYTEST$18);
        }
    }
    
    /**
     * Sets array of all "securityTest" element
     */
    public void setSecurityTestArray(com.eviware.soapui.config.SecurityTestConfig[] securityTestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityTestArray, SECURITYTEST$18);
        }
    }
    
    /**
     * Sets ith "securityTest" element
     */
    public void setSecurityTestArray(int i, com.eviware.soapui.config.SecurityTestConfig securityTest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityTestConfig target = null;
            target = (com.eviware.soapui.config.SecurityTestConfig)get_store().find_element_user(SECURITYTEST$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityTest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "securityTest" element
     */
    public com.eviware.soapui.config.SecurityTestConfig insertNewSecurityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityTestConfig target = null;
            target = (com.eviware.soapui.config.SecurityTestConfig)get_store().insert_element_user(SECURITYTEST$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "securityTest" element
     */
    public com.eviware.soapui.config.SecurityTestConfig addNewSecurityTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityTestConfig target = null;
            target = (com.eviware.soapui.config.SecurityTestConfig)get_store().add_element_user(SECURITYTEST$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "securityTest" element
     */
    public void removeSecurityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYTEST$18, i);
        }
    }
    
    /**
     * Gets a List of "breakPoints" elements
     */
    public java.util.List<com.eviware.soapui.config.BreakPointConfig> getBreakPointsList()
    {
        final class BreakPointsList extends java.util.AbstractList<com.eviware.soapui.config.BreakPointConfig>
        {
            public com.eviware.soapui.config.BreakPointConfig get(int i)
                { return TestCaseConfigImpl.this.getBreakPointsArray(i); }
            
            public com.eviware.soapui.config.BreakPointConfig set(int i, com.eviware.soapui.config.BreakPointConfig o)
            {
                com.eviware.soapui.config.BreakPointConfig old = TestCaseConfigImpl.this.getBreakPointsArray(i);
                TestCaseConfigImpl.this.setBreakPointsArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.BreakPointConfig o)
                { TestCaseConfigImpl.this.insertNewBreakPoints(i).set(o); }
            
            public com.eviware.soapui.config.BreakPointConfig remove(int i)
            {
                com.eviware.soapui.config.BreakPointConfig old = TestCaseConfigImpl.this.getBreakPointsArray(i);
                TestCaseConfigImpl.this.removeBreakPoints(i);
                return old;
            }
            
            public int size()
                { return TestCaseConfigImpl.this.sizeOfBreakPointsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BreakPointsList();
        }
    }
    
    /**
     * Gets array of all "breakPoints" elements
     * @deprecated
     */
    public com.eviware.soapui.config.BreakPointConfig[] getBreakPointsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.BreakPointConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.BreakPointConfig>();
            get_store().find_all_element_users(BREAKPOINTS$20, targetList);
            com.eviware.soapui.config.BreakPointConfig[] result = new com.eviware.soapui.config.BreakPointConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "breakPoints" element
     */
    public com.eviware.soapui.config.BreakPointConfig getBreakPointsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointConfig target = null;
            target = (com.eviware.soapui.config.BreakPointConfig)get_store().find_element_user(BREAKPOINTS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "breakPoints" element
     */
    public int sizeOfBreakPointsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREAKPOINTS$20);
        }
    }
    
    /**
     * Sets array of all "breakPoints" element
     */
    public void setBreakPointsArray(com.eviware.soapui.config.BreakPointConfig[] breakPointsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(breakPointsArray, BREAKPOINTS$20);
        }
    }
    
    /**
     * Sets ith "breakPoints" element
     */
    public void setBreakPointsArray(int i, com.eviware.soapui.config.BreakPointConfig breakPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointConfig target = null;
            target = (com.eviware.soapui.config.BreakPointConfig)get_store().find_element_user(BREAKPOINTS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(breakPoints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakPoints" element
     */
    public com.eviware.soapui.config.BreakPointConfig insertNewBreakPoints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointConfig target = null;
            target = (com.eviware.soapui.config.BreakPointConfig)get_store().insert_element_user(BREAKPOINTS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "breakPoints" element
     */
    public com.eviware.soapui.config.BreakPointConfig addNewBreakPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointConfig target = null;
            target = (com.eviware.soapui.config.BreakPointConfig)get_store().add_element_user(BREAKPOINTS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "breakPoints" element
     */
    public void removeBreakPoints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREAKPOINTS$20, i);
        }
    }
    
    /**
     * Gets the "keepSession" attribute
     */
    public boolean getKeepSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPSESSION$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "keepSession" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetKeepSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPSESSION$22);
            return target;
        }
    }
    
    /**
     * True if has "keepSession" attribute
     */
    public boolean isSetKeepSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEEPSESSION$22) != null;
        }
    }
    
    /**
     * Sets the "keepSession" attribute
     */
    public void setKeepSession(boolean keepSession)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPSESSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEEPSESSION$22);
            }
            target.setBooleanValue(keepSession);
        }
    }
    
    /**
     * Sets (as xml) the "keepSession" attribute
     */
    public void xsetKeepSession(org.apache.xmlbeans.XmlBoolean keepSession)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPSESSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(KEEPSESSION$22);
            }
            target.set(keepSession);
        }
    }
    
    /**
     * Unsets the "keepSession" attribute
     */
    public void unsetKeepSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEEPSESSION$22);
        }
    }
    
    /**
     * Gets the "failOnError" attribute
     */
    public boolean getFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failOnError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$24);
            return target;
        }
    }
    
    /**
     * True if has "failOnError" attribute
     */
    public boolean isSetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILONERROR$24) != null;
        }
    }
    
    /**
     * Sets the "failOnError" attribute
     */
    public void setFailOnError(boolean failOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILONERROR$24);
            }
            target.setBooleanValue(failOnError);
        }
    }
    
    /**
     * Sets (as xml) the "failOnError" attribute
     */
    public void xsetFailOnError(org.apache.xmlbeans.XmlBoolean failOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILONERROR$24);
            }
            target.set(failOnError);
        }
    }
    
    /**
     * Unsets the "failOnError" attribute
     */
    public void unsetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILONERROR$24);
        }
    }
    
    /**
     * Gets the "failTestCaseOnErrors" attribute
     */
    public boolean getFailTestCaseOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILTESTCASEONERRORS$26);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failTestCaseOnErrors" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailTestCaseOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILTESTCASEONERRORS$26);
            return target;
        }
    }
    
    /**
     * True if has "failTestCaseOnErrors" attribute
     */
    public boolean isSetFailTestCaseOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILTESTCASEONERRORS$26) != null;
        }
    }
    
    /**
     * Sets the "failTestCaseOnErrors" attribute
     */
    public void setFailTestCaseOnErrors(boolean failTestCaseOnErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILTESTCASEONERRORS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILTESTCASEONERRORS$26);
            }
            target.setBooleanValue(failTestCaseOnErrors);
        }
    }
    
    /**
     * Sets (as xml) the "failTestCaseOnErrors" attribute
     */
    public void xsetFailTestCaseOnErrors(org.apache.xmlbeans.XmlBoolean failTestCaseOnErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILTESTCASEONERRORS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILTESTCASEONERRORS$26);
            }
            target.set(failTestCaseOnErrors);
        }
    }
    
    /**
     * Unsets the "failTestCaseOnErrors" attribute
     */
    public void unsetFailTestCaseOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILTESTCASEONERRORS$26);
        }
    }
    
    /**
     * Gets the "discardOkResults" attribute
     */
    public boolean getDiscardOkResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISCARDOKRESULTS$28);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "discardOkResults" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDiscardOkResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISCARDOKRESULTS$28);
            return target;
        }
    }
    
    /**
     * True if has "discardOkResults" attribute
     */
    public boolean isSetDiscardOkResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISCARDOKRESULTS$28) != null;
        }
    }
    
    /**
     * Sets the "discardOkResults" attribute
     */
    public void setDiscardOkResults(boolean discardOkResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISCARDOKRESULTS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISCARDOKRESULTS$28);
            }
            target.setBooleanValue(discardOkResults);
        }
    }
    
    /**
     * Sets (as xml) the "discardOkResults" attribute
     */
    public void xsetDiscardOkResults(org.apache.xmlbeans.XmlBoolean discardOkResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISCARDOKRESULTS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISCARDOKRESULTS$28);
            }
            target.set(discardOkResults);
        }
    }
    
    /**
     * Unsets the "discardOkResults" attribute
     */
    public void unsetDiscardOkResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISCARDOKRESULTS$28);
        }
    }
    
    /**
     * Gets the "searchProperties" attribute
     */
    public boolean getSearchProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEARCHPROPERTIES$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchProperties" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSearchProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SEARCHPROPERTIES$30);
            return target;
        }
    }
    
    /**
     * True if has "searchProperties" attribute
     */
    public boolean isSetSearchProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEARCHPROPERTIES$30) != null;
        }
    }
    
    /**
     * Sets the "searchProperties" attribute
     */
    public void setSearchProperties(boolean searchProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEARCHPROPERTIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEARCHPROPERTIES$30);
            }
            target.setBooleanValue(searchProperties);
        }
    }
    
    /**
     * Sets (as xml) the "searchProperties" attribute
     */
    public void xsetSearchProperties(org.apache.xmlbeans.XmlBoolean searchProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SEARCHPROPERTIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SEARCHPROPERTIES$30);
            }
            target.set(searchProperties);
        }
    }
    
    /**
     * Unsets the "searchProperties" attribute
     */
    public void unsetSearchProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEARCHPROPERTIES$30);
        }
    }
    
    /**
     * Gets the "disabled" attribute
     */
    public boolean getDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$32);
            return target;
        }
    }
    
    /**
     * True if has "disabled" attribute
     */
    public boolean isSetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLED$32) != null;
        }
    }
    
    /**
     * Sets the "disabled" attribute
     */
    public void setDisabled(boolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$32);
            }
            target.setBooleanValue(disabled);
        }
    }
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$32);
            }
            target.set(disabled);
        }
    }
    
    /**
     * Unsets the "disabled" attribute
     */
    public void unsetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLED$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$34);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$34);
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
            return get_store().find_attribute_user(TIMEOUT$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEOUT$34);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(TIMEOUT$34);
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
            get_store().remove_attribute(TIMEOUT$34);
        }
    }
    
    /**
     * Gets the "maxResults" attribute
     */
    public int getMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRESULTS$36);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxResults" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXRESULTS$36);
            return target;
        }
    }
    
    /**
     * True if has "maxResults" attribute
     */
    public boolean isSetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXRESULTS$36) != null;
        }
    }
    
    /**
     * Sets the "maxResults" attribute
     */
    public void setMaxResults(int maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRESULTS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXRESULTS$36);
            }
            target.setIntValue(maxResults);
        }
    }
    
    /**
     * Sets (as xml) the "maxResults" attribute
     */
    public void xsetMaxResults(org.apache.xmlbeans.XmlInt maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXRESULTS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(MAXRESULTS$36);
            }
            target.set(maxResults);
        }
    }
    
    /**
     * Unsets the "maxResults" attribute
     */
    public void unsetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXRESULTS$36);
        }
    }
    
    /**
     * Gets the "wsrmEnabled" attribute
     */
    public boolean getWsrmEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMENABLED$38);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsrmEnabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWsrmEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WSRMENABLED$38);
            return target;
        }
    }
    
    /**
     * True if has "wsrmEnabled" attribute
     */
    public boolean isSetWsrmEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSRMENABLED$38) != null;
        }
    }
    
    /**
     * Sets the "wsrmEnabled" attribute
     */
    public void setWsrmEnabled(boolean wsrmEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMENABLED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSRMENABLED$38);
            }
            target.setBooleanValue(wsrmEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "wsrmEnabled" attribute
     */
    public void xsetWsrmEnabled(org.apache.xmlbeans.XmlBoolean wsrmEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WSRMENABLED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WSRMENABLED$38);
            }
            target.set(wsrmEnabled);
        }
    }
    
    /**
     * Unsets the "wsrmEnabled" attribute
     */
    public void unsetWsrmEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSRMENABLED$38);
        }
    }
    
    /**
     * Gets the "wsrmVersion" attribute
     */
    public com.eviware.soapui.config.WsrmVersionTypeConfig.Enum getWsrmVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMVERSION$40);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WsrmVersionTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsrmVersion" attribute
     */
    public com.eviware.soapui.config.WsrmVersionTypeConfig xgetWsrmVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().find_attribute_user(WSRMVERSION$40);
            return target;
        }
    }
    
    /**
     * True if has "wsrmVersion" attribute
     */
    public boolean isSetWsrmVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSRMVERSION$40) != null;
        }
    }
    
    /**
     * Sets the "wsrmVersion" attribute
     */
    public void setWsrmVersion(com.eviware.soapui.config.WsrmVersionTypeConfig.Enum wsrmVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMVERSION$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSRMVERSION$40);
            }
            target.setEnumValue(wsrmVersion);
        }
    }
    
    /**
     * Sets (as xml) the "wsrmVersion" attribute
     */
    public void xsetWsrmVersion(com.eviware.soapui.config.WsrmVersionTypeConfig wsrmVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().find_attribute_user(WSRMVERSION$40);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().add_attribute_user(WSRMVERSION$40);
            }
            target.set(wsrmVersion);
        }
    }
    
    /**
     * Unsets the "wsrmVersion" attribute
     */
    public void unsetWsrmVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSRMVERSION$40);
        }
    }
    
    /**
     * Gets the "wsrmAckTo" attribute
     */
    public java.lang.String getWsrmAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMACKTO$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsrmAckTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWsrmAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSRMACKTO$42);
            return target;
        }
    }
    
    /**
     * True if has "wsrmAckTo" attribute
     */
    public boolean isSetWsrmAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSRMACKTO$42) != null;
        }
    }
    
    /**
     * Sets the "wsrmAckTo" attribute
     */
    public void setWsrmAckTo(java.lang.String wsrmAckTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMACKTO$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSRMACKTO$42);
            }
            target.setStringValue(wsrmAckTo);
        }
    }
    
    /**
     * Sets (as xml) the "wsrmAckTo" attribute
     */
    public void xsetWsrmAckTo(org.apache.xmlbeans.XmlString wsrmAckTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSRMACKTO$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WSRMACKTO$42);
            }
            target.set(wsrmAckTo);
        }
    }
    
    /**
     * Unsets the "wsrmAckTo" attribute
     */
    public void unsetWsrmAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSRMACKTO$42);
        }
    }
    
    /**
     * Gets the "wsrmExpires" attribute
     */
    public long getWsrmExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMEXPIRES$44);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsrmExpires" attribute
     */
    public org.apache.xmlbeans.XmlLong xgetWsrmExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(WSRMEXPIRES$44);
            return target;
        }
    }
    
    /**
     * True if has "wsrmExpires" attribute
     */
    public boolean isSetWsrmExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSRMEXPIRES$44) != null;
        }
    }
    
    /**
     * Sets the "wsrmExpires" attribute
     */
    public void setWsrmExpires(long wsrmExpires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSRMEXPIRES$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSRMEXPIRES$44);
            }
            target.setLongValue(wsrmExpires);
        }
    }
    
    /**
     * Sets (as xml) the "wsrmExpires" attribute
     */
    public void xsetWsrmExpires(org.apache.xmlbeans.XmlLong wsrmExpires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(WSRMEXPIRES$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(WSRMEXPIRES$44);
            }
            target.set(wsrmExpires);
        }
    }
    
    /**
     * Unsets the "wsrmExpires" attribute
     */
    public void unsetWsrmExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSRMEXPIRES$44);
        }
    }
    
    /**
     * Gets the "amfAuthorisation" attribute
     */
    public boolean getAmfAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFAUTHORISATION$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "amfAuthorisation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAmfAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AMFAUTHORISATION$46);
            return target;
        }
    }
    
    /**
     * True if has "amfAuthorisation" attribute
     */
    public boolean isSetAmfAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMFAUTHORISATION$46) != null;
        }
    }
    
    /**
     * Sets the "amfAuthorisation" attribute
     */
    public void setAmfAuthorisation(boolean amfAuthorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFAUTHORISATION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMFAUTHORISATION$46);
            }
            target.setBooleanValue(amfAuthorisation);
        }
    }
    
    /**
     * Sets (as xml) the "amfAuthorisation" attribute
     */
    public void xsetAmfAuthorisation(org.apache.xmlbeans.XmlBoolean amfAuthorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AMFAUTHORISATION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AMFAUTHORISATION$46);
            }
            target.set(amfAuthorisation);
        }
    }
    
    /**
     * Unsets the "amfAuthorisation" attribute
     */
    public void unsetAmfAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMFAUTHORISATION$46);
        }
    }
    
    /**
     * Gets the "amfLogin" attribute
     */
    public java.lang.String getAmfLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFLOGIN$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "amfLogin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAmfLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFLOGIN$48);
            return target;
        }
    }
    
    /**
     * True if has "amfLogin" attribute
     */
    public boolean isSetAmfLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMFLOGIN$48) != null;
        }
    }
    
    /**
     * Sets the "amfLogin" attribute
     */
    public void setAmfLogin(java.lang.String amfLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFLOGIN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMFLOGIN$48);
            }
            target.setStringValue(amfLogin);
        }
    }
    
    /**
     * Sets (as xml) the "amfLogin" attribute
     */
    public void xsetAmfLogin(org.apache.xmlbeans.XmlString amfLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFLOGIN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AMFLOGIN$48);
            }
            target.set(amfLogin);
        }
    }
    
    /**
     * Unsets the "amfLogin" attribute
     */
    public void unsetAmfLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMFLOGIN$48);
        }
    }
    
    /**
     * Gets the "amfPassword" attribute
     */
    public java.lang.String getAmfPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFPASSWORD$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "amfPassword" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAmfPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFPASSWORD$50);
            return target;
        }
    }
    
    /**
     * True if has "amfPassword" attribute
     */
    public boolean isSetAmfPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMFPASSWORD$50) != null;
        }
    }
    
    /**
     * Sets the "amfPassword" attribute
     */
    public void setAmfPassword(java.lang.String amfPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFPASSWORD$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMFPASSWORD$50);
            }
            target.setStringValue(amfPassword);
        }
    }
    
    /**
     * Sets (as xml) the "amfPassword" attribute
     */
    public void xsetAmfPassword(org.apache.xmlbeans.XmlString amfPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFPASSWORD$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AMFPASSWORD$50);
            }
            target.set(amfPassword);
        }
    }
    
    /**
     * Unsets the "amfPassword" attribute
     */
    public void unsetAmfPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMFPASSWORD$50);
        }
    }
    
    /**
     * Gets the "amfEndpoint" attribute
     */
    public java.lang.String getAmfEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFENDPOINT$52);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "amfEndpoint" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAmfEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFENDPOINT$52);
            return target;
        }
    }
    
    /**
     * True if has "amfEndpoint" attribute
     */
    public boolean isSetAmfEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMFENDPOINT$52) != null;
        }
    }
    
    /**
     * Sets the "amfEndpoint" attribute
     */
    public void setAmfEndpoint(java.lang.String amfEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMFENDPOINT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMFENDPOINT$52);
            }
            target.setStringValue(amfEndpoint);
        }
    }
    
    /**
     * Sets (as xml) the "amfEndpoint" attribute
     */
    public void xsetAmfEndpoint(org.apache.xmlbeans.XmlString amfEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMFENDPOINT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AMFENDPOINT$52);
            }
            target.set(amfEndpoint);
        }
    }
    
    /**
     * Unsets the "amfEndpoint" attribute
     */
    public void unsetAmfEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMFENDPOINT$52);
        }
    }
}
