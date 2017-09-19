/*
 * XML Type:  DataGeneratorStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataGeneratorStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DataGeneratorStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DataGeneratorStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DataGeneratorStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public DataGeneratorStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "property");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<com.eviware.soapui.config.DataGeneratorPropertyConfig> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<com.eviware.soapui.config.DataGeneratorPropertyConfig>
        {
            public com.eviware.soapui.config.DataGeneratorPropertyConfig get(int i)
                { return DataGeneratorStepConfigImpl.this.getPropertyArray(i); }
            
            public com.eviware.soapui.config.DataGeneratorPropertyConfig set(int i, com.eviware.soapui.config.DataGeneratorPropertyConfig o)
            {
                com.eviware.soapui.config.DataGeneratorPropertyConfig old = DataGeneratorStepConfigImpl.this.getPropertyArray(i);
                DataGeneratorStepConfigImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.DataGeneratorPropertyConfig o)
                { DataGeneratorStepConfigImpl.this.insertNewProperty(i).set(o); }
            
            public com.eviware.soapui.config.DataGeneratorPropertyConfig remove(int i)
            {
                com.eviware.soapui.config.DataGeneratorPropertyConfig old = DataGeneratorStepConfigImpl.this.getPropertyArray(i);
                DataGeneratorStepConfigImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return DataGeneratorStepConfigImpl.this.sizeOfPropertyArray(); }
            
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
    public com.eviware.soapui.config.DataGeneratorPropertyConfig[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.DataGeneratorPropertyConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.DataGeneratorPropertyConfig>();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            com.eviware.soapui.config.DataGeneratorPropertyConfig[] result = new com.eviware.soapui.config.DataGeneratorPropertyConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public com.eviware.soapui.config.DataGeneratorPropertyConfig getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig)get_store().find_element_user(PROPERTY$0, i);
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
    public void setPropertyArray(com.eviware.soapui.config.DataGeneratorPropertyConfig[] propertyArray)
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
    public void setPropertyArray(int i, com.eviware.soapui.config.DataGeneratorPropertyConfig property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig)get_store().find_element_user(PROPERTY$0, i);
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
    public com.eviware.soapui.config.DataGeneratorPropertyConfig insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public com.eviware.soapui.config.DataGeneratorPropertyConfig addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig)get_store().add_element_user(PROPERTY$0);
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
