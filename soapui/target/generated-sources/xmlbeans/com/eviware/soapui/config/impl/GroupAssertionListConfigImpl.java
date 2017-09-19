/*
 * XML Type:  GroupAssertionList
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.GroupAssertionListConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML GroupAssertionList(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class GroupAssertionListConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.GroupAssertionListConfig
{
    private static final long serialVersionUID = 1L;
    
    public GroupAssertionListConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSERTIONS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertions");
    private static final javax.xml.namespace.QName OPERATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    
    
    /**
     * Gets a List of "assertions" elements
     */
    public java.util.List<com.eviware.soapui.config.AssertionEntryConfig> getAssertionsList()
    {
        final class AssertionsList extends java.util.AbstractList<com.eviware.soapui.config.AssertionEntryConfig>
        {
            public com.eviware.soapui.config.AssertionEntryConfig get(int i)
                { return GroupAssertionListConfigImpl.this.getAssertionsArray(i); }
            
            public com.eviware.soapui.config.AssertionEntryConfig set(int i, com.eviware.soapui.config.AssertionEntryConfig o)
            {
                com.eviware.soapui.config.AssertionEntryConfig old = GroupAssertionListConfigImpl.this.getAssertionsArray(i);
                GroupAssertionListConfigImpl.this.setAssertionsArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.AssertionEntryConfig o)
                { GroupAssertionListConfigImpl.this.insertNewAssertions(i).set(o); }
            
            public com.eviware.soapui.config.AssertionEntryConfig remove(int i)
            {
                com.eviware.soapui.config.AssertionEntryConfig old = GroupAssertionListConfigImpl.this.getAssertionsArray(i);
                GroupAssertionListConfigImpl.this.removeAssertions(i);
                return old;
            }
            
            public int size()
                { return GroupAssertionListConfigImpl.this.sizeOfAssertionsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionsList();
        }
    }
    
    /**
     * Gets array of all "assertions" elements
     * @deprecated
     */
    public com.eviware.soapui.config.AssertionEntryConfig[] getAssertionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.AssertionEntryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.AssertionEntryConfig>();
            get_store().find_all_element_users(ASSERTIONS$0, targetList);
            com.eviware.soapui.config.AssertionEntryConfig[] result = new com.eviware.soapui.config.AssertionEntryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertions" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig getAssertionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().find_element_user(ASSERTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertions" element
     */
    public int sizeOfAssertionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTIONS$0);
        }
    }
    
    /**
     * Sets array of all "assertions" element
     */
    public void setAssertionsArray(com.eviware.soapui.config.AssertionEntryConfig[] assertionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionsArray, ASSERTIONS$0);
        }
    }
    
    /**
     * Sets ith "assertions" element
     */
    public void setAssertionsArray(int i, com.eviware.soapui.config.AssertionEntryConfig assertions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().find_element_user(ASSERTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertions" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig insertNewAssertions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().insert_element_user(ASSERTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertions" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig addNewAssertions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().add_element_user(ASSERTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertions" element
     */
    public void removeAssertions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTIONS$0, i);
        }
    }
    
    /**
     * Gets the "operation" element
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operation" element
     */
    public org.apache.xmlbeans.XmlString xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$2);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "operation" element
     */
    public void xsetOperation(org.apache.xmlbeans.XmlString operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$2);
            }
            target.set(operation);
        }
    }
}
