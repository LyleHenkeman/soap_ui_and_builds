/*
 * XML Type:  DatabaseConnectionContainer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DatabaseConnectionContainerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DatabaseConnectionContainer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DatabaseConnectionContainerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DatabaseConnectionContainerConfig
{
    private static final long serialVersionUID = 1L;
    
    public DatabaseConnectionContainerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABASECONNECTION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "databaseConnection");
    
    
    /**
     * Gets a List of "databaseConnection" elements
     */
    public java.util.List<com.eviware.soapui.config.DatabaseConnectionConfig> getDatabaseConnectionList()
    {
        final class DatabaseConnectionList extends java.util.AbstractList<com.eviware.soapui.config.DatabaseConnectionConfig>
        {
            public com.eviware.soapui.config.DatabaseConnectionConfig get(int i)
                { return DatabaseConnectionContainerConfigImpl.this.getDatabaseConnectionArray(i); }
            
            public com.eviware.soapui.config.DatabaseConnectionConfig set(int i, com.eviware.soapui.config.DatabaseConnectionConfig o)
            {
                com.eviware.soapui.config.DatabaseConnectionConfig old = DatabaseConnectionContainerConfigImpl.this.getDatabaseConnectionArray(i);
                DatabaseConnectionContainerConfigImpl.this.setDatabaseConnectionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.DatabaseConnectionConfig o)
                { DatabaseConnectionContainerConfigImpl.this.insertNewDatabaseConnection(i).set(o); }
            
            public com.eviware.soapui.config.DatabaseConnectionConfig remove(int i)
            {
                com.eviware.soapui.config.DatabaseConnectionConfig old = DatabaseConnectionContainerConfigImpl.this.getDatabaseConnectionArray(i);
                DatabaseConnectionContainerConfigImpl.this.removeDatabaseConnection(i);
                return old;
            }
            
            public int size()
                { return DatabaseConnectionContainerConfigImpl.this.sizeOfDatabaseConnectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DatabaseConnectionList();
        }
    }
    
    /**
     * Gets array of all "databaseConnection" elements
     * @deprecated
     */
    public com.eviware.soapui.config.DatabaseConnectionConfig[] getDatabaseConnectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.DatabaseConnectionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.DatabaseConnectionConfig>();
            get_store().find_all_element_users(DATABASECONNECTION$0, targetList);
            com.eviware.soapui.config.DatabaseConnectionConfig[] result = new com.eviware.soapui.config.DatabaseConnectionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "databaseConnection" element
     */
    public com.eviware.soapui.config.DatabaseConnectionConfig getDatabaseConnectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionConfig)get_store().find_element_user(DATABASECONNECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "databaseConnection" element
     */
    public int sizeOfDatabaseConnectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABASECONNECTION$0);
        }
    }
    
    /**
     * Sets array of all "databaseConnection" element
     */
    public void setDatabaseConnectionArray(com.eviware.soapui.config.DatabaseConnectionConfig[] databaseConnectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(databaseConnectionArray, DATABASECONNECTION$0);
        }
    }
    
    /**
     * Sets ith "databaseConnection" element
     */
    public void setDatabaseConnectionArray(int i, com.eviware.soapui.config.DatabaseConnectionConfig databaseConnection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionConfig)get_store().find_element_user(DATABASECONNECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(databaseConnection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "databaseConnection" element
     */
    public com.eviware.soapui.config.DatabaseConnectionConfig insertNewDatabaseConnection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionConfig)get_store().insert_element_user(DATABASECONNECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "databaseConnection" element
     */
    public com.eviware.soapui.config.DatabaseConnectionConfig addNewDatabaseConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DatabaseConnectionConfig target = null;
            target = (com.eviware.soapui.config.DatabaseConnectionConfig)get_store().add_element_user(DATABASECONNECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "databaseConnection" element
     */
    public void removeDatabaseConnection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABASECONNECTION$0, i);
        }
    }
}
