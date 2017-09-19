/*
 * XML Type:  AssertionTestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AssertionTestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML AssertionTestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AssertionTestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.AssertionTestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public AssertionTestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "entry");
    
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<com.eviware.soapui.config.AssertionEntryConfig> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<com.eviware.soapui.config.AssertionEntryConfig>
        {
            public com.eviware.soapui.config.AssertionEntryConfig get(int i)
                { return AssertionTestStepConfigImpl.this.getEntryArray(i); }
            
            public com.eviware.soapui.config.AssertionEntryConfig set(int i, com.eviware.soapui.config.AssertionEntryConfig o)
            {
                com.eviware.soapui.config.AssertionEntryConfig old = AssertionTestStepConfigImpl.this.getEntryArray(i);
                AssertionTestStepConfigImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.AssertionEntryConfig o)
                { AssertionTestStepConfigImpl.this.insertNewEntry(i).set(o); }
            
            public com.eviware.soapui.config.AssertionEntryConfig remove(int i)
            {
                com.eviware.soapui.config.AssertionEntryConfig old = AssertionTestStepConfigImpl.this.getEntryArray(i);
                AssertionTestStepConfigImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return AssertionTestStepConfigImpl.this.sizeOfEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntryList();
        }
    }
    
    /**
     * Gets array of all "entry" elements
     * @deprecated
     */
    public com.eviware.soapui.config.AssertionEntryConfig[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.AssertionEntryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.AssertionEntryConfig>();
            get_store().find_all_element_users(ENTRY$0, targetList);
            com.eviware.soapui.config.AssertionEntryConfig[] result = new com.eviware.soapui.config.AssertionEntryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$0);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(com.eviware.soapui.config.AssertionEntryConfig[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$0);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, com.eviware.soapui.config.AssertionEntryConfig entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public com.eviware.soapui.config.AssertionEntryConfig addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AssertionEntryConfig target = null;
            target = (com.eviware.soapui.config.AssertionEntryConfig)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$0, i);
        }
    }
}
