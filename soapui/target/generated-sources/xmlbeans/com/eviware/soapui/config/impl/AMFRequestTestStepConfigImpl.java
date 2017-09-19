/*
 * XML Type:  AMFRequestTestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AMFRequestTestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML AMFRequestTestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AMFRequestTestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.AMFRequestTestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public AMFRequestTestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName ASSERTION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName ENDPOINT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    private static final javax.xml.namespace.QName SCRIPT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "script");
    private static final javax.xml.namespace.QName AMFCALL$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "amfCall");
    
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$0, 0);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$0);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$0);
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
                { return AMFRequestTestStepConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AMFRequestTestStepConfigImpl.this.getAssertionArray(i);
                AMFRequestTestStepConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { AMFRequestTestStepConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AMFRequestTestStepConfigImpl.this.getAssertionArray(i);
                AMFRequestTestStepConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return AMFRequestTestStepConfigImpl.this.sizeOfAssertionArray(); }
            
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
     * Gets the "endpoint" element
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endpoint" element
     */
    public org.apache.xmlbeans.XmlString xgetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endpoint" element
     */
    public void setEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$4);
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) the "endpoint" element
     */
    public void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDPOINT$4);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Gets the "script" element
     */
    public com.eviware.soapui.config.ScriptConfig getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SCRIPT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(com.eviware.soapui.config.ScriptConfig script)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SCRIPT$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SCRIPT$6);
            }
            target.set(script);
        }
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SCRIPT$6);
            return target;
        }
    }
    
    /**
     * Gets the "amfCall" element
     */
    public java.lang.String getAmfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMFCALL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "amfCall" element
     */
    public org.apache.xmlbeans.XmlString xgetAmfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMFCALL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "amfCall" element
     */
    public void setAmfCall(java.lang.String amfCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMFCALL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMFCALL$8);
            }
            target.setStringValue(amfCall);
        }
    }
    
    /**
     * Sets (as xml) the "amfCall" element
     */
    public void xsetAmfCall(org.apache.xmlbeans.XmlString amfCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMFCALL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AMFCALL$8);
            }
            target.set(amfCall);
        }
    }
}
