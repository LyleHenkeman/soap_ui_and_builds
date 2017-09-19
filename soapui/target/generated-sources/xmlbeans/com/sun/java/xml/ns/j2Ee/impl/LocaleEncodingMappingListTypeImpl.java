/*
 * XML Type:  locale-encoding-mapping-listType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML locale-encoding-mapping-listType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class LocaleEncodingMappingListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType
{
    private static final long serialVersionUID = 1L;
    
    public LocaleEncodingMappingListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALEENCODINGMAPPING$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "locale-encoding-mapping");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "locale-encoding-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType> getLocaleEncodingMappingList()
    {
        final class LocaleEncodingMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType get(int i)
                { return LocaleEncodingMappingListTypeImpl.this.getLocaleEncodingMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType set(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType old = LocaleEncodingMappingListTypeImpl.this.getLocaleEncodingMappingArray(i);
                LocaleEncodingMappingListTypeImpl.this.setLocaleEncodingMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType o)
                { LocaleEncodingMappingListTypeImpl.this.insertNewLocaleEncodingMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType old = LocaleEncodingMappingListTypeImpl.this.getLocaleEncodingMappingArray(i);
                LocaleEncodingMappingListTypeImpl.this.removeLocaleEncodingMapping(i);
                return old;
            }
            
            public int size()
                { return LocaleEncodingMappingListTypeImpl.this.sizeOfLocaleEncodingMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocaleEncodingMappingList();
        }
    }
    
    /**
     * Gets array of all "locale-encoding-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType[] getLocaleEncodingMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType>();
            get_store().find_all_element_users(LOCALEENCODINGMAPPING$0, targetList);
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType[] result = new com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "locale-encoding-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType getLocaleEncodingMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType)get_store().find_element_user(LOCALEENCODINGMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "locale-encoding-mapping" element
     */
    public int sizeOfLocaleEncodingMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALEENCODINGMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "locale-encoding-mapping" element
     */
    public void setLocaleEncodingMappingArray(com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType[] localeEncodingMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localeEncodingMappingArray, LOCALEENCODINGMAPPING$0);
        }
    }
    
    /**
     * Sets ith "locale-encoding-mapping" element
     */
    public void setLocaleEncodingMappingArray(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType localeEncodingMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType)get_store().find_element_user(LOCALEENCODINGMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localeEncodingMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale-encoding-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType insertNewLocaleEncodingMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType)get_store().insert_element_user(LOCALEENCODINGMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale-encoding-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType addNewLocaleEncodingMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType)get_store().add_element_user(LOCALEENCODINGMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "locale-encoding-mapping" element
     */
    public void removeLocaleEncodingMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALEENCODINGMAPPING$0, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
