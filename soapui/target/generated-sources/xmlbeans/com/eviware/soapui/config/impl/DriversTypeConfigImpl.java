/*
 * XML Type:  DriversType
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DriversTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DriversType(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DriversTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DriversTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public DriversTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DRIVER$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "driver");
    
    
    /**
     * Gets a List of "driver" elements
     */
    public java.util.List<com.eviware.soapui.config.DriverConfigConfig> getDriverList()
    {
        final class DriverList extends java.util.AbstractList<com.eviware.soapui.config.DriverConfigConfig>
        {
            public com.eviware.soapui.config.DriverConfigConfig get(int i)
                { return DriversTypeConfigImpl.this.getDriverArray(i); }
            
            public com.eviware.soapui.config.DriverConfigConfig set(int i, com.eviware.soapui.config.DriverConfigConfig o)
            {
                com.eviware.soapui.config.DriverConfigConfig old = DriversTypeConfigImpl.this.getDriverArray(i);
                DriversTypeConfigImpl.this.setDriverArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.DriverConfigConfig o)
                { DriversTypeConfigImpl.this.insertNewDriver(i).set(o); }
            
            public com.eviware.soapui.config.DriverConfigConfig remove(int i)
            {
                com.eviware.soapui.config.DriverConfigConfig old = DriversTypeConfigImpl.this.getDriverArray(i);
                DriversTypeConfigImpl.this.removeDriver(i);
                return old;
            }
            
            public int size()
                { return DriversTypeConfigImpl.this.sizeOfDriverArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DriverList();
        }
    }
    
    /**
     * Gets array of all "driver" elements
     * @deprecated
     */
    public com.eviware.soapui.config.DriverConfigConfig[] getDriverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.DriverConfigConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.DriverConfigConfig>();
            get_store().find_all_element_users(DRIVER$0, targetList);
            com.eviware.soapui.config.DriverConfigConfig[] result = new com.eviware.soapui.config.DriverConfigConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "driver" element
     */
    public com.eviware.soapui.config.DriverConfigConfig getDriverArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DriverConfigConfig target = null;
            target = (com.eviware.soapui.config.DriverConfigConfig)get_store().find_element_user(DRIVER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "driver" element
     */
    public int sizeOfDriverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRIVER$0);
        }
    }
    
    /**
     * Sets array of all "driver" element
     */
    public void setDriverArray(com.eviware.soapui.config.DriverConfigConfig[] driverArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(driverArray, DRIVER$0);
        }
    }
    
    /**
     * Sets ith "driver" element
     */
    public void setDriverArray(int i, com.eviware.soapui.config.DriverConfigConfig driver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DriverConfigConfig target = null;
            target = (com.eviware.soapui.config.DriverConfigConfig)get_store().find_element_user(DRIVER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(driver);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "driver" element
     */
    public com.eviware.soapui.config.DriverConfigConfig insertNewDriver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DriverConfigConfig target = null;
            target = (com.eviware.soapui.config.DriverConfigConfig)get_store().insert_element_user(DRIVER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "driver" element
     */
    public com.eviware.soapui.config.DriverConfigConfig addNewDriver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DriverConfigConfig target = null;
            target = (com.eviware.soapui.config.DriverConfigConfig)get_store().add_element_user(DRIVER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "driver" element
     */
    public void removeDriver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRIVER$0, i);
        }
    }
}
