/*
 * XML Type:  SoapUIFactories
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIFactoriesConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIFactories(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIFactoriesConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIFactoriesConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIFactoriesConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACTORY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "factory");
    
    
    /**
     * Gets a List of "factory" elements
     */
    public java.util.List<com.eviware.soapui.config.SoapUIFactoryConfig> getFactoryList()
    {
        final class FactoryList extends java.util.AbstractList<com.eviware.soapui.config.SoapUIFactoryConfig>
        {
            public com.eviware.soapui.config.SoapUIFactoryConfig get(int i)
                { return SoapUIFactoriesConfigImpl.this.getFactoryArray(i); }
            
            public com.eviware.soapui.config.SoapUIFactoryConfig set(int i, com.eviware.soapui.config.SoapUIFactoryConfig o)
            {
                com.eviware.soapui.config.SoapUIFactoryConfig old = SoapUIFactoriesConfigImpl.this.getFactoryArray(i);
                SoapUIFactoriesConfigImpl.this.setFactoryArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SoapUIFactoryConfig o)
                { SoapUIFactoriesConfigImpl.this.insertNewFactory(i).set(o); }
            
            public com.eviware.soapui.config.SoapUIFactoryConfig remove(int i)
            {
                com.eviware.soapui.config.SoapUIFactoryConfig old = SoapUIFactoriesConfigImpl.this.getFactoryArray(i);
                SoapUIFactoriesConfigImpl.this.removeFactory(i);
                return old;
            }
            
            public int size()
                { return SoapUIFactoriesConfigImpl.this.sizeOfFactoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FactoryList();
        }
    }
    
    /**
     * Gets array of all "factory" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SoapUIFactoryConfig[] getFactoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SoapUIFactoryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SoapUIFactoryConfig>();
            get_store().find_all_element_users(FACTORY$0, targetList);
            com.eviware.soapui.config.SoapUIFactoryConfig[] result = new com.eviware.soapui.config.SoapUIFactoryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "factory" element
     */
    public com.eviware.soapui.config.SoapUIFactoryConfig getFactoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoryConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoryConfig)get_store().find_element_user(FACTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "factory" element
     */
    public int sizeOfFactoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACTORY$0);
        }
    }
    
    /**
     * Sets array of all "factory" element
     */
    public void setFactoryArray(com.eviware.soapui.config.SoapUIFactoryConfig[] factoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(factoryArray, FACTORY$0);
        }
    }
    
    /**
     * Sets ith "factory" element
     */
    public void setFactoryArray(int i, com.eviware.soapui.config.SoapUIFactoryConfig factory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoryConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoryConfig)get_store().find_element_user(FACTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(factory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "factory" element
     */
    public com.eviware.soapui.config.SoapUIFactoryConfig insertNewFactory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoryConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoryConfig)get_store().insert_element_user(FACTORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "factory" element
     */
    public com.eviware.soapui.config.SoapUIFactoryConfig addNewFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoryConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoryConfig)get_store().add_element_user(FACTORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "factory" element
     */
    public void removeFactory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACTORY$0, i);
        }
    }
}
