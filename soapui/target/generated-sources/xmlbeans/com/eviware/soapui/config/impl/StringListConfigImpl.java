/*
 * XML Type:  StringList
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.StringListConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML StringList(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class StringListConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.StringListConfig
{
    private static final long serialVersionUID = 1L;
    
    public StringListConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "entry");
    
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<java.lang.String> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return StringListConfigImpl.this.getEntryArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = StringListConfigImpl.this.getEntryArray(i);
                StringListConfigImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { StringListConfigImpl.this.insertEntry(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = StringListConfigImpl.this.getEntryArray(i);
                StringListConfigImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return StringListConfigImpl.this.sizeOfEntryArray(); }
            
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
    public java.lang.String[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ENTRY$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public java.lang.String getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "entry" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetEntryList()
    {
        final class EntryList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return StringListConfigImpl.this.xgetEntryArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = StringListConfigImpl.this.xgetEntryArray(i);
                StringListConfigImpl.this.xsetEntryArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { StringListConfigImpl.this.insertNewEntry(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = StringListConfigImpl.this.xgetEntryArray(i);
                StringListConfigImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return StringListConfigImpl.this.sizeOfEntryArray(); }
            
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
    public org.apache.xmlbeans.XmlString[] xgetEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ENTRY$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "entry" element
     */
    public org.apache.xmlbeans.XmlString xgetEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
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
    public void setEntryArray(java.lang.String[] entryArray)
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
    public void setEntryArray(int i, java.lang.String entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(entry);
        }
    }
    
    /**
     * Sets (as xml) array of all "entry" element
     */
    public void xsetEntryArray(org.apache.xmlbeans.XmlString[]entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "entry" element
     */
    public void xsetEntryArray(int i, org.apache.xmlbeans.XmlString entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts the value as the ith "entry" element
     */
    public void insertEntry(int i, java.lang.String entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTRY$0, i);
            target.setStringValue(entry);
        }
    }
    
    /**
     * Appends the value as the last "entry" element
     */
    public void addEntry(java.lang.String entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTRY$0);
            target.setStringValue(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public org.apache.xmlbeans.XmlString insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public org.apache.xmlbeans.XmlString addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTRY$0);
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
