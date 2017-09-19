/*
 * XML Type:  PropertiesType
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PropertiesTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML PropertiesType(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class PropertiesTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PropertiesTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public PropertiesTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "property");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<com.eviware.soapui.config.PropertyConfig> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<com.eviware.soapui.config.PropertyConfig>
        {
            public com.eviware.soapui.config.PropertyConfig get(int i)
                { return PropertiesTypeConfigImpl.this.getPropertyArray(i); }
            
            public com.eviware.soapui.config.PropertyConfig set(int i, com.eviware.soapui.config.PropertyConfig o)
            {
                com.eviware.soapui.config.PropertyConfig old = PropertiesTypeConfigImpl.this.getPropertyArray(i);
                PropertiesTypeConfigImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.PropertyConfig o)
                { PropertiesTypeConfigImpl.this.insertNewProperty(i).set(o); }
            
            public com.eviware.soapui.config.PropertyConfig remove(int i)
            {
                com.eviware.soapui.config.PropertyConfig old = PropertiesTypeConfigImpl.this.getPropertyArray(i);
                PropertiesTypeConfigImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return PropertiesTypeConfigImpl.this.sizeOfPropertyArray(); }
            
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
    public com.eviware.soapui.config.PropertyConfig[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.PropertyConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.PropertyConfig>();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            com.eviware.soapui.config.PropertyConfig[] result = new com.eviware.soapui.config.PropertyConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public com.eviware.soapui.config.PropertyConfig getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$0, i);
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
    public void setPropertyArray(com.eviware.soapui.config.PropertyConfig[] propertyArray)
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
    public void setPropertyArray(int i, com.eviware.soapui.config.PropertyConfig property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$0, i);
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
    public com.eviware.soapui.config.PropertyConfig insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public com.eviware.soapui.config.PropertyConfig addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().add_element_user(PROPERTY$0);
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
