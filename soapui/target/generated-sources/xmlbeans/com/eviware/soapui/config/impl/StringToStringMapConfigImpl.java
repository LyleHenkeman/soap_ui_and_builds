/*
 * XML Type:  StringToStringMap
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.StringToStringMapConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML StringToStringMap(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class StringToStringMapConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.StringToStringMapConfig
{
    private static final long serialVersionUID = 1L;
    
    public StringToStringMapConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "entry");
    
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<com.eviware.soapui.config.StringToStringMapConfig.Entry> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<com.eviware.soapui.config.StringToStringMapConfig.Entry>
        {
            public com.eviware.soapui.config.StringToStringMapConfig.Entry get(int i)
                { return StringToStringMapConfigImpl.this.getEntryArray(i); }
            
            public com.eviware.soapui.config.StringToStringMapConfig.Entry set(int i, com.eviware.soapui.config.StringToStringMapConfig.Entry o)
            {
                com.eviware.soapui.config.StringToStringMapConfig.Entry old = StringToStringMapConfigImpl.this.getEntryArray(i);
                StringToStringMapConfigImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.StringToStringMapConfig.Entry o)
                { StringToStringMapConfigImpl.this.insertNewEntry(i).set(o); }
            
            public com.eviware.soapui.config.StringToStringMapConfig.Entry remove(int i)
            {
                com.eviware.soapui.config.StringToStringMapConfig.Entry old = StringToStringMapConfigImpl.this.getEntryArray(i);
                StringToStringMapConfigImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return StringToStringMapConfigImpl.this.sizeOfEntryArray(); }
            
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
    public com.eviware.soapui.config.StringToStringMapConfig.Entry[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.StringToStringMapConfig.Entry> targetList = new java.util.ArrayList<com.eviware.soapui.config.StringToStringMapConfig.Entry>();
            get_store().find_all_element_users(ENTRY$0, targetList);
            com.eviware.soapui.config.StringToStringMapConfig.Entry[] result = new com.eviware.soapui.config.StringToStringMapConfig.Entry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig.Entry getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig.Entry target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig.Entry)get_store().find_element_user(ENTRY$0, i);
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
    public void setEntryArray(com.eviware.soapui.config.StringToStringMapConfig.Entry[] entryArray)
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
    public void setEntryArray(int i, com.eviware.soapui.config.StringToStringMapConfig.Entry entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig.Entry target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig.Entry)get_store().find_element_user(ENTRY$0, i);
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
    public com.eviware.soapui.config.StringToStringMapConfig.Entry insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig.Entry target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig.Entry)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig.Entry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig.Entry target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig.Entry)get_store().add_element_user(ENTRY$0);
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
    /**
     * An XML entry(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public static class EntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.StringToStringMapConfig.Entry
    {
        private static final long serialVersionUID = 1L;
        
        public EntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("", "key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "key" attribute
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                return target;
            }
        }
        
        /**
         * True if has "key" attribute
         */
        public boolean isSetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEY$0) != null;
            }
        }
        
        /**
         * Sets the "key" attribute
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" attribute
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Unsets the "key" attribute
         */
        public void unsetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEY$0);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$2) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$2);
            }
        }
    }
}
