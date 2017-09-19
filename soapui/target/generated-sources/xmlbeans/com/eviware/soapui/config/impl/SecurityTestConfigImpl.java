/*
 * XML Type:  SecurityTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SecurityTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SecurityTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SecurityTestConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.SecurityTestConfig
{
    private static final long serialVersionUID = 1L;
    
    public SecurityTestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETUPSCRIPT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "setupScript");
    private static final javax.xml.namespace.QName TEARDOWNSCRIPT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tearDownScript");
    private static final javax.xml.namespace.QName TESTSTEPSECURITYTEST$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStepSecurityTest");
    private static final javax.xml.namespace.QName PROPERTIES$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName REPORTSCRIPT$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportScript");
    private static final javax.xml.namespace.QName REPORTPARAMETERS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportParameters");
    private static final javax.xml.namespace.QName FAILONERROR$12 = 
        new javax.xml.namespace.QName("", "failOnError");
    private static final javax.xml.namespace.QName FAILSECURITYTESTONCHECKERRORS$14 = 
        new javax.xml.namespace.QName("", "failSecurityTestOnCheckErrors");
    private static final javax.xml.namespace.QName FAILSECURITYTESTONSCANERRORS$16 = 
        new javax.xml.namespace.QName("", "failSecurityTestOnScanErrors");
    private static final javax.xml.namespace.QName SKIPDATASOURCELOOPS$18 = 
        new javax.xml.namespace.QName("", "skipDataSourceLoops");
    
    
    /**
     * Gets the "setupScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$0, 0);
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
            return get_store().count_elements(SETUPSCRIPT$0) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$0);
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
            get_store().remove_element(SETUPSCRIPT$0, 0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$2, 0);
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
            return get_store().count_elements(TEARDOWNSCRIPT$2) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$2);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$2);
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
            get_store().remove_element(TEARDOWNSCRIPT$2, 0);
        }
    }
    
    /**
     * Gets a List of "testStepSecurityTest" elements
     */
    public java.util.List<com.eviware.soapui.config.TestStepSecurityTestConfig> getTestStepSecurityTestList()
    {
        final class TestStepSecurityTestList extends java.util.AbstractList<com.eviware.soapui.config.TestStepSecurityTestConfig>
        {
            public com.eviware.soapui.config.TestStepSecurityTestConfig get(int i)
                { return SecurityTestConfigImpl.this.getTestStepSecurityTestArray(i); }
            
            public com.eviware.soapui.config.TestStepSecurityTestConfig set(int i, com.eviware.soapui.config.TestStepSecurityTestConfig o)
            {
                com.eviware.soapui.config.TestStepSecurityTestConfig old = SecurityTestConfigImpl.this.getTestStepSecurityTestArray(i);
                SecurityTestConfigImpl.this.setTestStepSecurityTestArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestStepSecurityTestConfig o)
                { SecurityTestConfigImpl.this.insertNewTestStepSecurityTest(i).set(o); }
            
            public com.eviware.soapui.config.TestStepSecurityTestConfig remove(int i)
            {
                com.eviware.soapui.config.TestStepSecurityTestConfig old = SecurityTestConfigImpl.this.getTestStepSecurityTestArray(i);
                SecurityTestConfigImpl.this.removeTestStepSecurityTest(i);
                return old;
            }
            
            public int size()
                { return SecurityTestConfigImpl.this.sizeOfTestStepSecurityTestArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestStepSecurityTestList();
        }
    }
    
    /**
     * Gets array of all "testStepSecurityTest" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestStepSecurityTestConfig[] getTestStepSecurityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestStepSecurityTestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestStepSecurityTestConfig>();
            get_store().find_all_element_users(TESTSTEPSECURITYTEST$4, targetList);
            com.eviware.soapui.config.TestStepSecurityTestConfig[] result = new com.eviware.soapui.config.TestStepSecurityTestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testStepSecurityTest" element
     */
    public com.eviware.soapui.config.TestStepSecurityTestConfig getTestStepSecurityTestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepSecurityTestConfig target = null;
            target = (com.eviware.soapui.config.TestStepSecurityTestConfig)get_store().find_element_user(TESTSTEPSECURITYTEST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testStepSecurityTest" element
     */
    public int sizeOfTestStepSecurityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSTEPSECURITYTEST$4);
        }
    }
    
    /**
     * Sets array of all "testStepSecurityTest" element
     */
    public void setTestStepSecurityTestArray(com.eviware.soapui.config.TestStepSecurityTestConfig[] testStepSecurityTestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testStepSecurityTestArray, TESTSTEPSECURITYTEST$4);
        }
    }
    
    /**
     * Sets ith "testStepSecurityTest" element
     */
    public void setTestStepSecurityTestArray(int i, com.eviware.soapui.config.TestStepSecurityTestConfig testStepSecurityTest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepSecurityTestConfig target = null;
            target = (com.eviware.soapui.config.TestStepSecurityTestConfig)get_store().find_element_user(TESTSTEPSECURITYTEST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testStepSecurityTest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityTest" element
     */
    public com.eviware.soapui.config.TestStepSecurityTestConfig insertNewTestStepSecurityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepSecurityTestConfig target = null;
            target = (com.eviware.soapui.config.TestStepSecurityTestConfig)get_store().insert_element_user(TESTSTEPSECURITYTEST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityTest" element
     */
    public com.eviware.soapui.config.TestStepSecurityTestConfig addNewTestStepSecurityTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepSecurityTestConfig target = null;
            target = (com.eviware.soapui.config.TestStepSecurityTestConfig)get_store().add_element_user(TESTSTEPSECURITYTEST$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "testStepSecurityTest" element
     */
    public void removeTestStepSecurityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSTEPSECURITYTEST$4, i);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$6, 0);
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
            return get_store().count_elements(PROPERTIES$6) != 0;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$6);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$6);
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
            get_store().remove_element(PROPERTIES$6, 0);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$8, 0);
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
            return get_store().count_elements(REPORTSCRIPT$8) != 0;
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$8);
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
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$8);
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
            get_store().remove_element(REPORTSCRIPT$8, 0);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$10, 0);
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
            return get_store().count_elements(REPORTPARAMETERS$10) != 0;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$10);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$10);
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
            get_store().remove_element(REPORTPARAMETERS$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$12);
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
            return get_store().find_attribute_user(FAILONERROR$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILONERROR$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILONERROR$12);
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
            get_store().remove_attribute(FAILONERROR$12);
        }
    }
    
    /**
     * Gets the "failSecurityTestOnCheckErrors" attribute
     */
    public boolean getFailSecurityTestOnCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failSecurityTestOnCheckErrors" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailSecurityTestOnCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            return target;
        }
    }
    
    /**
     * True if has "failSecurityTestOnCheckErrors" attribute
     */
    public boolean isSetFailSecurityTestOnCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILSECURITYTESTONCHECKERRORS$14) != null;
        }
    }
    
    /**
     * Sets the "failSecurityTestOnCheckErrors" attribute
     */
    public void setFailSecurityTestOnCheckErrors(boolean failSecurityTestOnCheckErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            }
            target.setBooleanValue(failSecurityTestOnCheckErrors);
        }
    }
    
    /**
     * Sets (as xml) the "failSecurityTestOnCheckErrors" attribute
     */
    public void xsetFailSecurityTestOnCheckErrors(org.apache.xmlbeans.XmlBoolean failSecurityTestOnCheckErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILSECURITYTESTONCHECKERRORS$14);
            }
            target.set(failSecurityTestOnCheckErrors);
        }
    }
    
    /**
     * Unsets the "failSecurityTestOnCheckErrors" attribute
     */
    public void unsetFailSecurityTestOnCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILSECURITYTESTONCHECKERRORS$14);
        }
    }
    
    /**
     * Gets the "failSecurityTestOnScanErrors" attribute
     */
    public boolean getFailSecurityTestOnScanErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failSecurityTestOnScanErrors" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailSecurityTestOnScanErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            return target;
        }
    }
    
    /**
     * True if has "failSecurityTestOnScanErrors" attribute
     */
    public boolean isSetFailSecurityTestOnScanErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILSECURITYTESTONSCANERRORS$16) != null;
        }
    }
    
    /**
     * Sets the "failSecurityTestOnScanErrors" attribute
     */
    public void setFailSecurityTestOnScanErrors(boolean failSecurityTestOnScanErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            }
            target.setBooleanValue(failSecurityTestOnScanErrors);
        }
    }
    
    /**
     * Sets (as xml) the "failSecurityTestOnScanErrors" attribute
     */
    public void xsetFailSecurityTestOnScanErrors(org.apache.xmlbeans.XmlBoolean failSecurityTestOnScanErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILSECURITYTESTONSCANERRORS$16);
            }
            target.set(failSecurityTestOnScanErrors);
        }
    }
    
    /**
     * Unsets the "failSecurityTestOnScanErrors" attribute
     */
    public void unsetFailSecurityTestOnScanErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILSECURITYTESTONSCANERRORS$16);
        }
    }
    
    /**
     * Gets the "skipDataSourceLoops" attribute
     */
    public boolean getSkipDataSourceLoops()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPDATASOURCELOOPS$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "skipDataSourceLoops" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSkipDataSourceLoops()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SKIPDATASOURCELOOPS$18);
            return target;
        }
    }
    
    /**
     * True if has "skipDataSourceLoops" attribute
     */
    public boolean isSetSkipDataSourceLoops()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SKIPDATASOURCELOOPS$18) != null;
        }
    }
    
    /**
     * Sets the "skipDataSourceLoops" attribute
     */
    public void setSkipDataSourceLoops(boolean skipDataSourceLoops)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPDATASOURCELOOPS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPDATASOURCELOOPS$18);
            }
            target.setBooleanValue(skipDataSourceLoops);
        }
    }
    
    /**
     * Sets (as xml) the "skipDataSourceLoops" attribute
     */
    public void xsetSkipDataSourceLoops(org.apache.xmlbeans.XmlBoolean skipDataSourceLoops)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SKIPDATASOURCELOOPS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SKIPDATASOURCELOOPS$18);
            }
            target.set(skipDataSourceLoops);
        }
    }
    
    /**
     * Unsets the "skipDataSourceLoops" attribute
     */
    public void unsetSkipDataSourceLoops()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SKIPDATASOURCELOOPS$18);
        }
    }
}
