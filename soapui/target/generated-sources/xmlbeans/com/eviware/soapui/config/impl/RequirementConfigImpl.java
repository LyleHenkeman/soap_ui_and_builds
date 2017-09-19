/*
 * XML Type:  Requirement
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RequirementConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Requirement(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RequirementConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RequirementConfig
{
    private static final long serialVersionUID = 1L;
    
    public RequirementConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "id");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "description");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "status");
    private static final javax.xml.namespace.QName DETAILS$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "details");
    private static final javax.xml.namespace.QName LINKS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "links");
    private static final javax.xml.namespace.QName TESTCASES$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testCases");
    
    
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
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$6);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "details" element
     */
    public java.lang.String getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "details" element
     */
    public org.apache.xmlbeans.XmlString xgetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(java.lang.String details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAILS$8);
            }
            target.setStringValue(details);
        }
    }
    
    /**
     * Sets (as xml) the "details" element
     */
    public void xsetDetails(org.apache.xmlbeans.XmlString details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETAILS$8);
            }
            target.set(details);
        }
    }
    
    /**
     * Gets the "links" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig getLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().find_element_user(LINKS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "links" element
     */
    public void setLinks(com.eviware.soapui.config.StringToStringMapConfig links)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().find_element_user(LINKS$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().add_element_user(LINKS$10);
            }
            target.set(links);
        }
    }
    
    /**
     * Appends and returns a new empty "links" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig addNewLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().add_element_user(LINKS$10);
            return target;
        }
    }
    
    /**
     * Gets the "testCases" element
     */
    public com.eviware.soapui.config.StringListConfig getTestCases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(TESTCASES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testCases" element
     */
    public void setTestCases(com.eviware.soapui.config.StringListConfig testCases)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(TESTCASES$12, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(TESTCASES$12);
            }
            target.set(testCases);
        }
    }
    
    /**
     * Appends and returns a new empty "testCases" element
     */
    public com.eviware.soapui.config.StringListConfig addNewTestCases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(TESTCASES$12);
            return target;
        }
    }
}
