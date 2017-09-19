/*
 * XML Type:  TestSuite
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestSuiteConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestSuite(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestSuiteConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.TestSuiteConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestSuiteConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNTYPE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "runType");
    private static final javax.xml.namespace.QName TESTCASE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testCase");
    private static final javax.xml.namespace.QName PROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName SETUPSCRIPT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "setupScript");
    private static final javax.xml.namespace.QName TEARDOWNSCRIPT$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tearDownScript");
    private static final javax.xml.namespace.QName REPORTSCRIPT$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportScript");
    private static final javax.xml.namespace.QName REPORTTEMPLATES$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportTemplates");
    private static final javax.xml.namespace.QName REPORTPARAMETERS$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportParameters");
    private static final javax.xml.namespace.QName DISABLED$16 = 
        new javax.xml.namespace.QName("", "disabled");
    private static final javax.xml.namespace.QName ABORTONERROR$18 = 
        new javax.xml.namespace.QName("", "abortOnError");
    private static final javax.xml.namespace.QName FAILONERRORS$20 = 
        new javax.xml.namespace.QName("", "failOnErrors");
    private static final javax.xml.namespace.QName TIMEOUT$22 = 
        new javax.xml.namespace.QName("", "timeout");
    
    
    /**
     * Gets the "runType" element
     */
    public com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum getRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "runType" element
     */
    public com.eviware.soapui.config.TestSuiteRunTypesConfig xgetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteRunTypesConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_element_user(RUNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "runType" element
     */
    public boolean isSetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "runType" element
     */
    public void setRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum runType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNTYPE$0);
            }
            target.setEnumValue(runType);
        }
    }
    
    /**
     * Sets (as xml) the "runType" element
     */
    public void xsetRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig runType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteRunTypesConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_element_user(RUNTYPE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().add_element_user(RUNTYPE$0);
            }
            target.set(runType);
        }
    }
    
    /**
     * Unsets the "runType" element
     */
    public void unsetRunType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNTYPE$0, 0);
        }
    }
    
    /**
     * Gets a List of "testCase" elements
     */
    public java.util.List<com.eviware.soapui.config.TestCaseConfig> getTestCaseList()
    {
        final class TestCaseList extends java.util.AbstractList<com.eviware.soapui.config.TestCaseConfig>
        {
            public com.eviware.soapui.config.TestCaseConfig get(int i)
                { return TestSuiteConfigImpl.this.getTestCaseArray(i); }
            
            public com.eviware.soapui.config.TestCaseConfig set(int i, com.eviware.soapui.config.TestCaseConfig o)
            {
                com.eviware.soapui.config.TestCaseConfig old = TestSuiteConfigImpl.this.getTestCaseArray(i);
                TestSuiteConfigImpl.this.setTestCaseArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestCaseConfig o)
                { TestSuiteConfigImpl.this.insertNewTestCase(i).set(o); }
            
            public com.eviware.soapui.config.TestCaseConfig remove(int i)
            {
                com.eviware.soapui.config.TestCaseConfig old = TestSuiteConfigImpl.this.getTestCaseArray(i);
                TestSuiteConfigImpl.this.removeTestCase(i);
                return old;
            }
            
            public int size()
                { return TestSuiteConfigImpl.this.sizeOfTestCaseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestCaseList();
        }
    }
    
    /**
     * Gets array of all "testCase" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestCaseConfig[] getTestCaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestCaseConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestCaseConfig>();
            get_store().find_all_element_users(TESTCASE$2, targetList);
            com.eviware.soapui.config.TestCaseConfig[] result = new com.eviware.soapui.config.TestCaseConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testCase" element
     */
    public com.eviware.soapui.config.TestCaseConfig getTestCaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().find_element_user(TESTCASE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testCase" element
     */
    public int sizeOfTestCaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTCASE$2);
        }
    }
    
    /**
     * Sets array of all "testCase" element
     */
    public void setTestCaseArray(com.eviware.soapui.config.TestCaseConfig[] testCaseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testCaseArray, TESTCASE$2);
        }
    }
    
    /**
     * Sets ith "testCase" element
     */
    public void setTestCaseArray(int i, com.eviware.soapui.config.TestCaseConfig testCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().find_element_user(TESTCASE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testCase);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testCase" element
     */
    public com.eviware.soapui.config.TestCaseConfig insertNewTestCase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().insert_element_user(TESTCASE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testCase" element
     */
    public com.eviware.soapui.config.TestCaseConfig addNewTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().add_element_user(TESTCASE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "testCase" element
     */
    public void removeTestCase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTCASE$2, i);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
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
            return get_store().count_elements(PROPERTIES$4) != 0;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
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
            get_store().remove_element(PROPERTIES$4, 0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$6, 0);
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
            return get_store().count_elements(SETUPSCRIPT$6) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$6);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$6);
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
            get_store().remove_element(SETUPSCRIPT$6, 0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$8, 0);
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
            return get_store().count_elements(TEARDOWNSCRIPT$8) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$8);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$8);
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
            get_store().remove_element(TEARDOWNSCRIPT$8, 0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$10, 0);
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
            return get_store().count_elements(REPORTSCRIPT$10) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$10);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$10);
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
            get_store().remove_element(REPORTSCRIPT$10, 0);
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
                { return TestSuiteConfigImpl.this.getReportTemplatesArray(i); }
            
            public com.eviware.soapui.config.ReportTemplateConfig set(int i, com.eviware.soapui.config.ReportTemplateConfig o)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestSuiteConfigImpl.this.getReportTemplatesArray(i);
                TestSuiteConfigImpl.this.setReportTemplatesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.ReportTemplateConfig o)
                { TestSuiteConfigImpl.this.insertNewReportTemplates(i).set(o); }
            
            public com.eviware.soapui.config.ReportTemplateConfig remove(int i)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestSuiteConfigImpl.this.getReportTemplatesArray(i);
                TestSuiteConfigImpl.this.removeReportTemplates(i);
                return old;
            }
            
            public int size()
                { return TestSuiteConfigImpl.this.sizeOfReportTemplatesArray(); }
            
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
     * Gets the "reportParameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$14, 0);
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
            return get_store().count_elements(REPORTPARAMETERS$14) != 0;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$14);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$14);
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
            get_store().remove_element(REPORTPARAMETERS$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$16);
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
            return get_store().find_attribute_user(DISABLED$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$16);
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
            get_store().remove_attribute(DISABLED$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$18);
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
            return get_store().find_attribute_user(ABORTONERROR$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABORTONERROR$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABORTONERROR$18);
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
            get_store().remove_attribute(ABORTONERROR$18);
        }
    }
    
    /**
     * Gets the "failOnErrors" attribute
     */
    public boolean getFailOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERRORS$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failOnErrors" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERRORS$20);
            return target;
        }
    }
    
    /**
     * True if has "failOnErrors" attribute
     */
    public boolean isSetFailOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILONERRORS$20) != null;
        }
    }
    
    /**
     * Sets the "failOnErrors" attribute
     */
    public void setFailOnErrors(boolean failOnErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERRORS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILONERRORS$20);
            }
            target.setBooleanValue(failOnErrors);
        }
    }
    
    /**
     * Sets (as xml) the "failOnErrors" attribute
     */
    public void xsetFailOnErrors(org.apache.xmlbeans.XmlBoolean failOnErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERRORS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILONERRORS$20);
            }
            target.set(failOnErrors);
        }
    }
    
    /**
     * Unsets the "failOnErrors" attribute
     */
    public void unsetFailOnErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILONERRORS$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$22);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$22);
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
            return get_store().find_attribute_user(TIMEOUT$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEOUT$22);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(TIMEOUT$22);
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
            get_store().remove_attribute(TIMEOUT$22);
        }
    }
}
