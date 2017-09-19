/*
 * XML Type:  TestScenario
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestScenarioConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestScenario(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestScenarioConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.TestScenarioConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestScenarioConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEFORERUNSCRIPT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "beforeRunScript");
    private static final javax.xml.namespace.QName AFTERRUNSCRIPT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "afterRunScript");
    private static final javax.xml.namespace.QName RUNTYPE$4 = 
        new javax.xml.namespace.QName("", "runType");
    private static final javax.xml.namespace.QName ABORTONERROR$6 = 
        new javax.xml.namespace.QName("", "abortOnError");
    private static final javax.xml.namespace.QName FAILONERRORS$8 = 
        new javax.xml.namespace.QName("", "failOnErrors");
    private static final javax.xml.namespace.QName TIMEOUT$10 = 
        new javax.xml.namespace.QName("", "timeout");
    
    
    /**
     * Gets the "beforeRunScript" element
     */
    public java.lang.String getBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEFORERUNSCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "beforeRunScript" element
     */
    public org.apache.xmlbeans.XmlString xgetBeforeRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEFORERUNSCRIPT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "beforeRunScript" element
     */
    public void setBeforeRunScript(java.lang.String beforeRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEFORERUNSCRIPT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEFORERUNSCRIPT$0);
            }
            target.setStringValue(beforeRunScript);
        }
    }
    
    /**
     * Sets (as xml) the "beforeRunScript" element
     */
    public void xsetBeforeRunScript(org.apache.xmlbeans.XmlString beforeRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEFORERUNSCRIPT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEFORERUNSCRIPT$0);
            }
            target.set(beforeRunScript);
        }
    }
    
    /**
     * Gets the "afterRunScript" element
     */
    public java.lang.String getAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFTERRUNSCRIPT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "afterRunScript" element
     */
    public org.apache.xmlbeans.XmlString xgetAfterRunScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFTERRUNSCRIPT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "afterRunScript" element
     */
    public void setAfterRunScript(java.lang.String afterRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFTERRUNSCRIPT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFTERRUNSCRIPT$2);
            }
            target.setStringValue(afterRunScript);
        }
    }
    
    /**
     * Sets (as xml) the "afterRunScript" element
     */
    public void xsetAfterRunScript(org.apache.xmlbeans.XmlString afterRunScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFTERRUNSCRIPT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AFTERRUNSCRIPT$2);
            }
            target.set(afterRunScript);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNTYPE$4);
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
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_attribute_user(RUNTYPE$4);
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
            return get_store().find_attribute_user(RUNTYPE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNTYPE$4);
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
            target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().find_attribute_user(RUNTYPE$4);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestSuiteRunTypesConfig)get_store().add_attribute_user(RUNTYPE$4);
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
            get_store().remove_attribute(RUNTYPE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$6);
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
            return get_store().find_attribute_user(ABORTONERROR$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABORTONERROR$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABORTONERROR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABORTONERROR$6);
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
            get_store().remove_attribute(ABORTONERROR$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERRORS$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERRORS$8);
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
            return get_store().find_attribute_user(FAILONERRORS$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERRORS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILONERRORS$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERRORS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILONERRORS$8);
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
            get_store().remove_attribute(FAILONERRORS$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$10);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$10);
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
            return get_store().find_attribute_user(TIMEOUT$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEOUT$10);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIMEOUT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(TIMEOUT$10);
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
            get_store().remove_attribute(TIMEOUT$10);
        }
    }
}
