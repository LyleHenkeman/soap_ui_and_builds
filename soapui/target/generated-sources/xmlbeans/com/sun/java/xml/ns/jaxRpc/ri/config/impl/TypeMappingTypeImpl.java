/*
 * XML Type:  typeMappingType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML typeMappingType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class TypeMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType
{
    private static final long serialVersionUID = 1L;
    
    public TypeMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "entry");
    private static final javax.xml.namespace.QName ENCODINGSTYLE$2 = 
        new javax.xml.namespace.QName("", "encodingStyle");
    
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.EntryType> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.EntryType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType get(int i)
                { return TypeMappingTypeImpl.this.getEntryArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.EntryType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.EntryType old = TypeMappingTypeImpl.this.getEntryArray(i);
                TypeMappingTypeImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.EntryType o)
                { TypeMappingTypeImpl.this.insertNewEntry(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.EntryType old = TypeMappingTypeImpl.this.getEntryArray(i);
                TypeMappingTypeImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return TypeMappingTypeImpl.this.sizeOfEntryArray(); }
            
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
    public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.EntryType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.EntryType>();
            get_store().find_all_element_users(ENTRY$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.EntryType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.EntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.EntryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.EntryType)get_store().find_element_user(ENTRY$0, i);
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
    public void setEntryArray(com.sun.java.xml.ns.jaxRpc.ri.config.EntryType[] entryArray)
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
    public void setEntryArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.EntryType entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.EntryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.EntryType)get_store().find_element_user(ENTRY$0, i);
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
    public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.EntryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.EntryType)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.EntryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.EntryType)get_store().add_element_user(ENTRY$0);
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
     * Gets the "encodingStyle" attribute
     */
    public java.lang.String getEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGSTYLE$2);
            return target;
        }
    }
    
    /**
     * Sets the "encodingStyle" attribute
     */
    public void setEncodingStyle(java.lang.String encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$2);
            }
            target.setStringValue(encodingStyle);
        }
    }
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    public void xsetEncodingStyle(org.apache.xmlbeans.XmlAnyURI encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGSTYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ENCODINGSTYLE$2);
            }
            target.set(encodingStyle);
        }
    }
}
