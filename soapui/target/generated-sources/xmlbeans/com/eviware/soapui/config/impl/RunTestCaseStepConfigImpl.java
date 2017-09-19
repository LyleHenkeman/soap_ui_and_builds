/*
 * XML Type:  RunTestCaseStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RunTestCaseStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RunTestCaseStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RunTestCaseStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RunTestCaseStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public RunTestCaseStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETTESTCASE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetTestCase");
    private static final javax.xml.namespace.QName PROPERTIES$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName RETURNPROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "returnProperties");
    private static final javax.xml.namespace.QName RUNMODE$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "runMode");
    private static final javax.xml.namespace.QName COPYLOADTESTPROPERTIES$8 = 
        new javax.xml.namespace.QName("", "copyLoadTestProperties");
    private static final javax.xml.namespace.QName COPYHTTPSESSION$10 = 
        new javax.xml.namespace.QName("", "copyHttpSession");
    private static final javax.xml.namespace.QName IGNOREEMPTYPROPERTIES$12 = 
        new javax.xml.namespace.QName("", "ignoreEmptyProperties");
    
    
    /**
     * Gets the "targetTestCase" element
     */
    public java.lang.String getTargetTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTESTCASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetTestCase" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTESTCASE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetTestCase" element
     */
    public void setTargetTestCase(java.lang.String targetTestCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTESTCASE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTESTCASE$0);
            }
            target.setStringValue(targetTestCase);
        }
    }
    
    /**
     * Sets (as xml) the "targetTestCase" element
     */
    public void xsetTargetTestCase(org.apache.xmlbeans.XmlString targetTestCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTESTCASE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETTESTCASE$0);
            }
            target.set(targetTestCase);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$2);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Gets the "returnProperties" element
     */
    public com.eviware.soapui.config.StringListConfig getReturnProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(RETURNPROPERTIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "returnProperties" element
     */
    public void setReturnProperties(com.eviware.soapui.config.StringListConfig returnProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(RETURNPROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(RETURNPROPERTIES$4);
            }
            target.set(returnProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "returnProperties" element
     */
    public com.eviware.soapui.config.StringListConfig addNewReturnProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(RETURNPROPERTIES$4);
            return target;
        }
    }
    
    /**
     * Gets the "runMode" element
     */
    public com.eviware.soapui.config.RunTestCaseRunModeTypeConfig.Enum getRunMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNMODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.RunTestCaseRunModeTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "runMode" element
     */
    public com.eviware.soapui.config.RunTestCaseRunModeTypeConfig xgetRunMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RunTestCaseRunModeTypeConfig target = null;
            target = (com.eviware.soapui.config.RunTestCaseRunModeTypeConfig)get_store().find_element_user(RUNMODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "runMode" element
     */
    public void setRunMode(com.eviware.soapui.config.RunTestCaseRunModeTypeConfig.Enum runMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNMODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNMODE$6);
            }
            target.setEnumValue(runMode);
        }
    }
    
    /**
     * Sets (as xml) the "runMode" element
     */
    public void xsetRunMode(com.eviware.soapui.config.RunTestCaseRunModeTypeConfig runMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RunTestCaseRunModeTypeConfig target = null;
            target = (com.eviware.soapui.config.RunTestCaseRunModeTypeConfig)get_store().find_element_user(RUNMODE$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RunTestCaseRunModeTypeConfig)get_store().add_element_user(RUNMODE$6);
            }
            target.set(runMode);
        }
    }
    
    /**
     * Gets the "copyLoadTestProperties" attribute
     */
    public boolean getCopyLoadTestProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYLOADTESTPROPERTIES$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "copyLoadTestProperties" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCopyLoadTestProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYLOADTESTPROPERTIES$8);
            return target;
        }
    }
    
    /**
     * True if has "copyLoadTestProperties" attribute
     */
    public boolean isSetCopyLoadTestProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COPYLOADTESTPROPERTIES$8) != null;
        }
    }
    
    /**
     * Sets the "copyLoadTestProperties" attribute
     */
    public void setCopyLoadTestProperties(boolean copyLoadTestProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYLOADTESTPROPERTIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPYLOADTESTPROPERTIES$8);
            }
            target.setBooleanValue(copyLoadTestProperties);
        }
    }
    
    /**
     * Sets (as xml) the "copyLoadTestProperties" attribute
     */
    public void xsetCopyLoadTestProperties(org.apache.xmlbeans.XmlBoolean copyLoadTestProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYLOADTESTPROPERTIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COPYLOADTESTPROPERTIES$8);
            }
            target.set(copyLoadTestProperties);
        }
    }
    
    /**
     * Unsets the "copyLoadTestProperties" attribute
     */
    public void unsetCopyLoadTestProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COPYLOADTESTPROPERTIES$8);
        }
    }
    
    /**
     * Gets the "copyHttpSession" attribute
     */
    public boolean getCopyHttpSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYHTTPSESSION$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "copyHttpSession" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCopyHttpSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYHTTPSESSION$10);
            return target;
        }
    }
    
    /**
     * True if has "copyHttpSession" attribute
     */
    public boolean isSetCopyHttpSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COPYHTTPSESSION$10) != null;
        }
    }
    
    /**
     * Sets the "copyHttpSession" attribute
     */
    public void setCopyHttpSession(boolean copyHttpSession)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYHTTPSESSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPYHTTPSESSION$10);
            }
            target.setBooleanValue(copyHttpSession);
        }
    }
    
    /**
     * Sets (as xml) the "copyHttpSession" attribute
     */
    public void xsetCopyHttpSession(org.apache.xmlbeans.XmlBoolean copyHttpSession)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYHTTPSESSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COPYHTTPSESSION$10);
            }
            target.set(copyHttpSession);
        }
    }
    
    /**
     * Unsets the "copyHttpSession" attribute
     */
    public void unsetCopyHttpSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COPYHTTPSESSION$10);
        }
    }
    
    /**
     * Gets the "ignoreEmptyProperties" attribute
     */
    public boolean getIgnoreEmptyProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREEMPTYPROPERTIES$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ignoreEmptyProperties" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIgnoreEmptyProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREEMPTYPROPERTIES$12);
            return target;
        }
    }
    
    /**
     * True if has "ignoreEmptyProperties" attribute
     */
    public boolean isSetIgnoreEmptyProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IGNOREEMPTYPROPERTIES$12) != null;
        }
    }
    
    /**
     * Sets the "ignoreEmptyProperties" attribute
     */
    public void setIgnoreEmptyProperties(boolean ignoreEmptyProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREEMPTYPROPERTIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREEMPTYPROPERTIES$12);
            }
            target.setBooleanValue(ignoreEmptyProperties);
        }
    }
    
    /**
     * Sets (as xml) the "ignoreEmptyProperties" attribute
     */
    public void xsetIgnoreEmptyProperties(org.apache.xmlbeans.XmlBoolean ignoreEmptyProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREEMPTYPROPERTIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREEMPTYPROPERTIES$12);
            }
            target.set(ignoreEmptyProperties);
        }
    }
    
    /**
     * Unsets the "ignoreEmptyProperties" attribute
     */
    public void unsetIgnoreEmptyProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IGNOREEMPTYPROPERTIES$12);
        }
    }
}
