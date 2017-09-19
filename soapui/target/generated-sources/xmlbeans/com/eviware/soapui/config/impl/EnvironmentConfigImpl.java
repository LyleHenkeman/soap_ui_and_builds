/*
 * XML Type:  Environment
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EnvironmentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Environment(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class EnvironmentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.EnvironmentConfig
{
    private static final long serialVersionUID = 1L;
    
    public EnvironmentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "service");
    private static final javax.xml.namespace.QName PROPERTY$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "property");
    private static final javax.xml.namespace.QName DATABASECONNECTIONCONTAINER$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "databaseConnectionContainer");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "service" elements
     */
    public java.util.List<com.eviware.soapui.config.ServiceConfig> getServiceList()
    {
        final class ServiceList extends java.util.AbstractList<com.eviware.soapui.config.ServiceConfig>
        {
            public com.eviware.soapui.config.ServiceConfig get(int i)
                { return EnvironmentConfigImpl.this.getServiceArray(i); }
            
            public com.eviware.soapui.config.ServiceConfig set(int i, com.eviware.soapui.config.ServiceConfig o)
            {
                com.eviware.soapui.config.ServiceConfig old = EnvironmentConfigImpl.this.getServiceArray(i);
                EnvironmentConfigImpl.this.setServiceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.ServiceConfig o)
                { EnvironmentConfigImpl.this.insertNewService(i).set(o); }
            
            public com.eviware.soapui.config.ServiceConfig remove(int i)
            {
                com.eviware.soapui.config.ServiceConfig old = EnvironmentConfigImpl.this.getServiceArray(i);
                EnvironmentConfigImpl.this.removeService(i);
                return old;
            }
            
            public int size()
                { return EnvironmentConfigImpl.this.sizeOfServiceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceList();
        }
    }
    
    /**
     * Gets array of all "service" elements
     * @deprecated
     */
    public com.eviware.soapui.config.ServiceConfig[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.ServiceConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.ServiceConfig>();
            get_store().find_all_element_users(SERVICE$0, targetList);
            com.eviware.soapui.config.ServiceConfig[] result = new com.eviware.soapui.config.ServiceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public com.eviware.soapui.config.ServiceConfig getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig target = null;
            target = (com.eviware.soapui.config.ServiceConfig)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$0);
        }
    }
    
    /**
     * Sets array of all "service" element
     */
    public void setServiceArray(com.eviware.soapui.config.ServiceConfig[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$0);
        }
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, com.eviware.soapui.config.ServiceConfig service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig target = null;
            target = (com.eviware.soapui.config.ServiceConfig)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public com.eviware.soapui.config.ServiceConfig insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig target = null;
            target = (com.eviware.soapui.config.ServiceConfig)get_store().insert_element_user(SERVICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public com.eviware.soapui.config.ServiceConfig addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig target = null;
            target = (com.eviware.soapui.config.ServiceConfig)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$0, i);
        }
    }
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<com.eviware.soapui.config.PropertyConfig> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<com.eviware.soapui.config.PropertyConfig>
        {
            public com.eviware.soapui.config.PropertyConfig get(int i)
                { return EnvironmentConfigImpl.this.getPropertyArray(i); }
            
            public com.eviware.soapui.config.PropertyConfig set(int i, com.eviware.soapui.config.PropertyConfig o)
            {
                com.eviware.soapui.config.PropertyConfig old = EnvironmentConfigImpl.this.getPropertyArray(i);
                EnvironmentConfigImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.PropertyConfig o)
                { EnvironmentConfigImpl.this.insertNewProperty(i).set(o); }
            
            public com.eviware.soapui.config.PropertyConfig remove(int i)
            {
                com.eviware.soapui.config.PropertyConfig old = EnvironmentConfigImpl.this.getPropertyArray(i);
                EnvironmentConfigImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return EnvironmentConfigImpl.this.sizeOfPropertyArray(); }
            
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
            get_store().find_all_element_users(PROPERTY$2, targetList);
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
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$2, i);
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
            return get_store().count_elements(PROPERTY$2);
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
            arraySetterHelper(propertyArray, PROPERTY$2);
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
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$2, i);
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
            target = (com.eviware.soapui.config.PropertyConfig)get_store().insert_element_user(PROPERTY$2, i);
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
            target = (com.eviware.soapui.config.PropertyConfig)get_store().add_element_user(PROPERTY$2);
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
            get_store().remove_element(PROPERTY$2, i);
        }
    }
    
    /**
     * Gets the "databaseConnectionContainer" element
     */
    public com.eviware.soapui.config.DatabaseConnectionContainerConfig getDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().find_element_user(DATABASECONNECTIONCONTAINER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "databaseConnectionContainer" element
     */
    public boolean isSetDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABASECONNECTIONCONTAINER$4) != 0;
        }
    }
    
    /**
     * Sets the "databaseConnectionContainer" element
     */
    public void setDatabaseConnectionContainer(com.eviware.soapui.config.DatabaseConnectionContainerConfig databaseConnectionContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().find_element_user(DATABASECONNECTIONCONTAINER$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().add_element_user(DATABASECONNECTIONCONTAINER$4);
            }
            target.set(databaseConnectionContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "databaseConnectionContainer" element
     */
    public com.eviware.soapui.config.DatabaseConnectionContainerConfig addNewDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionContainerConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionContainerConfig)get_store().add_element_user(DATABASECONNECTIONCONTAINER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "databaseConnectionContainer" element
     */
    public void unsetDatabaseConnectionContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABASECONNECTIONCONTAINER$4, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
}
