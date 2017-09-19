/*
 * XML Type:  AssertionEntry
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AssertionEntryConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML AssertionEntry(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AssertionEntryConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.AssertionEntryConfig
{
    private static final long serialVersionUID = 1L;
    
    public AssertionEntryConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "id");
    private static final javax.xml.namespace.QName ISGROUP$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "isGroup");
    private static final javax.xml.namespace.QName SOURCEID$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sourceId");
    private static final javax.xml.namespace.QName PROPERTYNAME$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "propertyName");
    private static final javax.xml.namespace.QName ASSERTION$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "isGroup" element
     */
    public boolean getIsGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGROUP$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isGroup" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGROUP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isGroup" element
     */
    public void setIsGroup(boolean isGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISGROUP$2);
            }
            target.setBooleanValue(isGroup);
        }
    }
    
    /**
     * Sets (as xml) the "isGroup" element
     */
    public void xsetIsGroup(org.apache.xmlbeans.XmlBoolean isGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGROUP$2);
            }
            target.set(isGroup);
        }
    }
    
    /**
     * Gets the "sourceId" element
     */
    public java.lang.String getSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceId" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceId" element
     */
    public void setSourceId(java.lang.String sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$4);
            }
            target.setStringValue(sourceId);
        }
    }
    
    /**
     * Sets (as xml) the "sourceId" element
     */
    public void xsetSourceId(org.apache.xmlbeans.XmlString sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEID$4);
            }
            target.set(sourceId);
        }
    }
    
    /**
     * Gets the "propertyName" element
     */
    public java.lang.String getPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "propertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "propertyName" element
     */
    public void setPropertyName(java.lang.String propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$6);
            }
            target.setStringValue(propertyName);
        }
    }
    
    /**
     * Sets (as xml) the "propertyName" element
     */
    public void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$6);
            }
            target.set(propertyName);
        }
    }
    
    /**
     * Gets the "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assertion" element
     */
    public void setAssertion(com.eviware.soapui.config.TestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$8);
            }
            target.set(assertion);
        }
    }
    
    /**
     * Appends and returns a new empty "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$8);
            return target;
        }
    }
}
