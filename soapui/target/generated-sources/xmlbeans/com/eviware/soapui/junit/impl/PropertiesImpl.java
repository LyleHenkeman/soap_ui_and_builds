/*
 * XML Type:  properties
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Properties
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * An XML properties(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.Properties
{
    private static final long serialVersionUID = 1L;
    
    public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "property");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<com.eviware.soapui.junit.Property> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<com.eviware.soapui.junit.Property>
        {
            public com.eviware.soapui.junit.Property get(int i)
                { return PropertiesImpl.this.getPropertyArray(i); }
            
            public com.eviware.soapui.junit.Property set(int i, com.eviware.soapui.junit.Property o)
            {
                com.eviware.soapui.junit.Property old = PropertiesImpl.this.getPropertyArray(i);
                PropertiesImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.junit.Property o)
                { PropertiesImpl.this.insertNewProperty(i).set(o); }
            
            public com.eviware.soapui.junit.Property remove(int i)
            {
                com.eviware.soapui.junit.Property old = PropertiesImpl.this.getPropertyArray(i);
                PropertiesImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return PropertiesImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    public com.eviware.soapui.junit.Property[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.junit.Property> targetList = new java.util.ArrayList<com.eviware.soapui.junit.Property>();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            com.eviware.soapui.junit.Property[] result = new com.eviware.soapui.junit.Property[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public com.eviware.soapui.junit.Property getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(com.eviware.soapui.junit.Property[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, com.eviware.soapui.junit.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public com.eviware.soapui.junit.Property insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public com.eviware.soapui.junit.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
}
