/*
 * XML Type:  Fuzzer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.FuzzerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Fuzzer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class FuzzerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.FuzzerConfig
{
    private static final long serialVersionUID = 1L;
    
    public FuzzerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Value");
    
    
    /**
     * Gets a List of "Value" elements
     */
    public java.util.List<java.lang.String> getValueList()
    {
        final class ValueList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return FuzzerConfigImpl.this.getValueArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = FuzzerConfigImpl.this.getValueArray(i);
                FuzzerConfigImpl.this.setValueArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { FuzzerConfigImpl.this.insertValue(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = FuzzerConfigImpl.this.getValueArray(i);
                FuzzerConfigImpl.this.removeValue(i);
                return old;
            }
            
            public int size()
                { return FuzzerConfigImpl.this.sizeOfValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValueList();
        }
    }
    
    /**
     * Gets array of all "Value" elements
     * @deprecated
     */
    public java.lang.String[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(VALUE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public java.lang.String getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Value" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetValueList()
    {
        final class ValueList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return FuzzerConfigImpl.this.xgetValueArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = FuzzerConfigImpl.this.xgetValueArray(i);
                FuzzerConfigImpl.this.xsetValueArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { FuzzerConfigImpl.this.insertNewValue(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = FuzzerConfigImpl.this.xgetValueArray(i);
                FuzzerConfigImpl.this.removeValue(i);
                return old;
            }
            
            public int size()
                { return FuzzerConfigImpl.this.sizeOfValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValueList();
        }
    }
    
    /**
     * Gets array of all "Value" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(VALUE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Value" element
     */
    public org.apache.xmlbeans.XmlString xgetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(java.lang.String[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    public void xsetValueArray(org.apache.xmlbeans.XmlString[]valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Value" element
     */
    public void xsetValueArray(int i, org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts the value as the ith "Value" element
     */
    public void insertValue(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALUE$0, i);
            target.setStringValue(value);
        }
    }
    
    /**
     * Appends the value as the last "Value" element
     */
    public void addValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            target.setStringValue(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public org.apache.xmlbeans.XmlString insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public org.apache.xmlbeans.XmlString addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, i);
        }
    }
}
