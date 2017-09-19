/*
 * XML Type:  SecurityScan
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SecurityScanConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SecurityScan(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SecurityScanConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.SecurityScanConfig
{
    private static final long serialVersionUID = 1L;
    
    public SecurityScanConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIG$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "config");
    private static final javax.xml.namespace.QName ASSERTION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName TESTSTEP$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStep");
    private static final javax.xml.namespace.QName CHECKEDPARAMETERS$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "checkedParameters");
    private static final javax.xml.namespace.QName EXECUTIONSTRATEGY$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "executionStrategy");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName APPLYFORFAILEDSTEP$12 = 
        new javax.xml.namespace.QName("", "applyForFailedStep");
    private static final javax.xml.namespace.QName DISABLED$14 = 
        new javax.xml.namespace.QName("", "disabled");
    private static final javax.xml.namespace.QName RUNONLYONCE$16 = 
        new javax.xml.namespace.QName("", "runOnlyOnce");
    
    
    /**
     * Gets the "config" element
     */
    public org.apache.xmlbeans.XmlObject getConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "config" element
     */
    public void setConfig(org.apache.xmlbeans.XmlObject config)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONFIG$0);
            }
            target.set(config);
        }
    }
    
    /**
     * Appends and returns a new empty "config" element
     */
    public org.apache.xmlbeans.XmlObject addNewConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONFIG$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "assertion" elements
     */
    public java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList()
    {
        final class AssertionList extends java.util.AbstractList<com.eviware.soapui.config.TestAssertionConfig>
        {
            public com.eviware.soapui.config.TestAssertionConfig get(int i)
                { return SecurityScanConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = SecurityScanConfigImpl.this.getAssertionArray(i);
                SecurityScanConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { SecurityScanConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = SecurityScanConfigImpl.this.getAssertionArray(i);
                SecurityScanConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return SecurityScanConfigImpl.this.sizeOfAssertionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionList();
        }
    }
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestAssertionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestAssertionConfig>();
            get_store().find_all_element_users(ASSERTION$2, targetList);
            com.eviware.soapui.config.TestAssertionConfig[] result = new com.eviware.soapui.config.TestAssertionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertion" element
     */
    public int sizeOfAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTION$2);
        }
    }
    
    /**
     * Sets array of all "assertion" element
     */
    public void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionArray, ASSERTION$2);
        }
    }
    
    /**
     * Sets ith "assertion" element
     */
    public void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().insert_element_user(ASSERTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertion" element
     */
    public void removeAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTION$2, i);
        }
    }
    
    /**
     * Gets the "testStep" element
     */
    public com.eviware.soapui.config.TestStepConfig getTestStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().find_element_user(TESTSTEP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testStep" element
     */
    public void setTestStep(com.eviware.soapui.config.TestStepConfig testStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().find_element_user(TESTSTEP$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestStepConfig)get_store().add_element_user(TESTSTEP$4);
            }
            target.set(testStep);
        }
    }
    
    /**
     * Appends and returns a new empty "testStep" element
     */
    public com.eviware.soapui.config.TestStepConfig addNewTestStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestStepConfig target = null;
            target = (com.eviware.soapui.config.TestStepConfig)get_store().add_element_user(TESTSTEP$4);
            return target;
        }
    }
    
    /**
     * Gets the "checkedParameters" element
     */
    public com.eviware.soapui.config.CheckedParametersListConfig getCheckedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParametersListConfig target = null;
            target = (com.eviware.soapui.config.CheckedParametersListConfig)get_store().find_element_user(CHECKEDPARAMETERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkedParameters" element
     */
    public void setCheckedParameters(com.eviware.soapui.config.CheckedParametersListConfig checkedParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParametersListConfig target = null;
            target = (com.eviware.soapui.config.CheckedParametersListConfig)get_store().find_element_user(CHECKEDPARAMETERS$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CheckedParametersListConfig)get_store().add_element_user(CHECKEDPARAMETERS$6);
            }
            target.set(checkedParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "checkedParameters" element
     */
    public com.eviware.soapui.config.CheckedParametersListConfig addNewCheckedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParametersListConfig target = null;
            target = (com.eviware.soapui.config.CheckedParametersListConfig)get_store().add_element_user(CHECKEDPARAMETERS$6);
            return target;
        }
    }
    
    /**
     * Gets the "executionStrategy" element
     */
    public com.eviware.soapui.config.ExecutionStrategyConfig getExecutionStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ExecutionStrategyConfig target = null;
            target = (com.eviware.soapui.config.ExecutionStrategyConfig)get_store().find_element_user(EXECUTIONSTRATEGY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "executionStrategy" element
     */
    public void setExecutionStrategy(com.eviware.soapui.config.ExecutionStrategyConfig executionStrategy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ExecutionStrategyConfig target = null;
            target = (com.eviware.soapui.config.ExecutionStrategyConfig)get_store().find_element_user(EXECUTIONSTRATEGY$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ExecutionStrategyConfig)get_store().add_element_user(EXECUTIONSTRATEGY$8);
            }
            target.set(executionStrategy);
        }
    }
    
    /**
     * Appends and returns a new empty "executionStrategy" element
     */
    public com.eviware.soapui.config.ExecutionStrategyConfig addNewExecutionStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ExecutionStrategyConfig target = null;
            target = (com.eviware.soapui.config.ExecutionStrategyConfig)get_store().add_element_user(EXECUTIONSTRATEGY$8);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$10) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$10);
        }
    }
    
    /**
     * Gets the "applyForFailedStep" attribute
     */
    public boolean getApplyForFailedStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFORFAILEDSTEP$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyForFailedStep" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyForFailedStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFORFAILEDSTEP$12);
            return target;
        }
    }
    
    /**
     * True if has "applyForFailedStep" attribute
     */
    public boolean isSetApplyForFailedStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFORFAILEDSTEP$12) != null;
        }
    }
    
    /**
     * Sets the "applyForFailedStep" attribute
     */
    public void setApplyForFailedStep(boolean applyForFailedStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFORFAILEDSTEP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFORFAILEDSTEP$12);
            }
            target.setBooleanValue(applyForFailedStep);
        }
    }
    
    /**
     * Sets (as xml) the "applyForFailedStep" attribute
     */
    public void xsetApplyForFailedStep(org.apache.xmlbeans.XmlBoolean applyForFailedStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFORFAILEDSTEP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFORFAILEDSTEP$12);
            }
            target.set(applyForFailedStep);
        }
    }
    
    /**
     * Unsets the "applyForFailedStep" attribute
     */
    public void unsetApplyForFailedStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFORFAILEDSTEP$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$14);
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
            return get_store().find_attribute_user(DISABLED$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$14);
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
            get_store().remove_attribute(DISABLED$14);
        }
    }
    
    /**
     * Gets the "runOnlyOnce" attribute
     */
    public boolean getRunOnlyOnce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNONLYONCE$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "runOnlyOnce" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRunOnlyOnce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNONLYONCE$16);
            return target;
        }
    }
    
    /**
     * True if has "runOnlyOnce" attribute
     */
    public boolean isSetRunOnlyOnce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RUNONLYONCE$16) != null;
        }
    }
    
    /**
     * Sets the "runOnlyOnce" attribute
     */
    public void setRunOnlyOnce(boolean runOnlyOnce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNONLYONCE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNONLYONCE$16);
            }
            target.setBooleanValue(runOnlyOnce);
        }
    }
    
    /**
     * Sets (as xml) the "runOnlyOnce" attribute
     */
    public void xsetRunOnlyOnce(org.apache.xmlbeans.XmlBoolean runOnlyOnce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNONLYONCE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RUNONLYONCE$16);
            }
            target.set(runOnlyOnce);
        }
    }
    
    /**
     * Unsets the "runOnlyOnce" attribute
     */
    public void unsetRunOnlyOnce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RUNONLYONCE$16);
        }
    }
}
