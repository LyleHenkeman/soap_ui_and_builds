/*
 * XML Type:  JdbcRequestTestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.JdbcRequestTestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML JdbcRequestTestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class JdbcRequestTestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.JdbcRequestTestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public JdbcRequestTestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBCONNECTIONNAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dbConnectionName");
    private static final javax.xml.namespace.QName DRIVER$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "driver");
    private static final javax.xml.namespace.QName CONNECTIONSTRING$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "connectionString");
    private static final javax.xml.namespace.QName PASSWORD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "password");
    private static final javax.xml.namespace.QName QUERY$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "query");
    private static final javax.xml.namespace.QName STOREDPROCEDURE$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "storedProcedure");
    private static final javax.xml.namespace.QName ASSERTION$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName PROPERTIES$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName CONVERTCOLUMNNAMESTOUPPERCASE$16 = 
        new javax.xml.namespace.QName("", "convertColumnNamesToUpperCase");
    private static final javax.xml.namespace.QName QUERYTIMEOUT$18 = 
        new javax.xml.namespace.QName("", "queryTimeout");
    private static final javax.xml.namespace.QName MAXROWS$20 = 
        new javax.xml.namespace.QName("", "maxRows");
    private static final javax.xml.namespace.QName FETCHSIZE$22 = 
        new javax.xml.namespace.QName("", "fetchSize");
    
    
    /**
     * Gets the "dbConnectionName" element
     */
    public java.lang.String getDbConnectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBCONNECTIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dbConnectionName" element
     */
    public org.apache.xmlbeans.XmlString xgetDbConnectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBCONNECTIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dbConnectionName" element
     */
    public void setDbConnectionName(java.lang.String dbConnectionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBCONNECTIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBCONNECTIONNAME$0);
            }
            target.setStringValue(dbConnectionName);
        }
    }
    
    /**
     * Sets (as xml) the "dbConnectionName" element
     */
    public void xsetDbConnectionName(org.apache.xmlbeans.XmlString dbConnectionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBCONNECTIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBCONNECTIONNAME$0);
            }
            target.set(dbConnectionName);
        }
    }
    
    /**
     * Gets the "driver" element
     */
    public java.lang.String getDriver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "driver" element
     */
    public org.apache.xmlbeans.XmlString xgetDriver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "driver" element
     */
    public void setDriver(java.lang.String driver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRIVER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRIVER$2);
            }
            target.setStringValue(driver);
        }
    }
    
    /**
     * Sets (as xml) the "driver" element
     */
    public void xsetDriver(org.apache.xmlbeans.XmlString driver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DRIVER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DRIVER$2);
            }
            target.set(driver);
        }
    }
    
    /**
     * Gets the "connectionString" element
     */
    public java.lang.String getConnectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONSTRING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectionString" element
     */
    public org.apache.xmlbeans.XmlString xgetConnectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTIONSTRING$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "connectionString" element
     */
    public void setConnectionString(java.lang.String connectionString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTIONSTRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTIONSTRING$4);
            }
            target.setStringValue(connectionString);
        }
    }
    
    /**
     * Sets (as xml) the "connectionString" element
     */
    public void xsetConnectionString(org.apache.xmlbeans.XmlString connectionString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTIONSTRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONNECTIONSTRING$4);
            }
            target.set(connectionString);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$6);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$6);
            }
            target.set(password);
        }
    }
    
    /**
     * Gets the "query" element
     */
    public java.lang.String getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "query" element
     */
    public org.apache.xmlbeans.XmlString xgetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(java.lang.String query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$8);
            }
            target.setStringValue(query);
        }
    }
    
    /**
     * Sets (as xml) the "query" element
     */
    public void xsetQuery(org.apache.xmlbeans.XmlString query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$8);
            }
            target.set(query);
        }
    }
    
    /**
     * Gets the "storedProcedure" element
     */
    public boolean getStoredProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOREDPROCEDURE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "storedProcedure" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetStoredProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STOREDPROCEDURE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "storedProcedure" element
     */
    public void setStoredProcedure(boolean storedProcedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOREDPROCEDURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOREDPROCEDURE$10);
            }
            target.setBooleanValue(storedProcedure);
        }
    }
    
    /**
     * Sets (as xml) the "storedProcedure" element
     */
    public void xsetStoredProcedure(org.apache.xmlbeans.XmlBoolean storedProcedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STOREDPROCEDURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(STOREDPROCEDURE$10);
            }
            target.set(storedProcedure);
        }
    }
    
    /**
     * Gets a List of "assertion" elements
     */
    public java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList()
    {
        final class AssertionList extends java.util.AbstractList<com.eviware.soapui.config.TestAssertionConfig>
        {
            public com.eviware.soapui.config.TestAssertionConfig get(int i)
                { return JdbcRequestTestStepConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = JdbcRequestTestStepConfigImpl.this.getAssertionArray(i);
                JdbcRequestTestStepConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { JdbcRequestTestStepConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = JdbcRequestTestStepConfigImpl.this.getAssertionArray(i);
                JdbcRequestTestStepConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return JdbcRequestTestStepConfigImpl.this.sizeOfAssertionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionList();
        }
    }
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestAssertionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestAssertionConfig>();
            get_store().find_all_element_users(ASSERTION$12, targetList);
            com.eviware.soapui.config.TestAssertionConfig[] result = new com.eviware.soapui.config.TestAssertionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertion" element
     */
    public int sizeOfAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTION$12);
        }
    }
    
    /**
     * Sets array of all "assertion" element
     */
    public void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionArray, ASSERTION$12);
        }
    }
    
    /**
     * Sets ith "assertion" element
     */
    public void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().insert_element_user(ASSERTION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertion" element
     */
    public void removeAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTION$12, i);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$14);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$14);
            return target;
        }
    }
    
    /**
     * Gets the "convertColumnNamesToUpperCase" attribute
     */
    public boolean getConvertColumnNamesToUpperCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "convertColumnNamesToUpperCase" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetConvertColumnNamesToUpperCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            return target;
        }
    }
    
    /**
     * True if has "convertColumnNamesToUpperCase" attribute
     */
    public boolean isSetConvertColumnNamesToUpperCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16) != null;
        }
    }
    
    /**
     * Sets the "convertColumnNamesToUpperCase" attribute
     */
    public void setConvertColumnNamesToUpperCase(boolean convertColumnNamesToUpperCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            }
            target.setBooleanValue(convertColumnNamesToUpperCase);
        }
    }
    
    /**
     * Sets (as xml) the "convertColumnNamesToUpperCase" attribute
     */
    public void xsetConvertColumnNamesToUpperCase(org.apache.xmlbeans.XmlBoolean convertColumnNamesToUpperCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONVERTCOLUMNNAMESTOUPPERCASE$16);
            }
            target.set(convertColumnNamesToUpperCase);
        }
    }
    
    /**
     * Unsets the "convertColumnNamesToUpperCase" attribute
     */
    public void unsetConvertColumnNamesToUpperCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONVERTCOLUMNNAMESTOUPPERCASE$16);
        }
    }
    
    /**
     * Gets the "queryTimeout" attribute
     */
    public java.lang.String getQueryTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYTIMEOUT$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryTimeout" attribute
     */
    public org.apache.xmlbeans.XmlString xgetQueryTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERYTIMEOUT$18);
            return target;
        }
    }
    
    /**
     * True if has "queryTimeout" attribute
     */
    public boolean isSetQueryTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUERYTIMEOUT$18) != null;
        }
    }
    
    /**
     * Sets the "queryTimeout" attribute
     */
    public void setQueryTimeout(java.lang.String queryTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYTIMEOUT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYTIMEOUT$18);
            }
            target.setStringValue(queryTimeout);
        }
    }
    
    /**
     * Sets (as xml) the "queryTimeout" attribute
     */
    public void xsetQueryTimeout(org.apache.xmlbeans.XmlString queryTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERYTIMEOUT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUERYTIMEOUT$18);
            }
            target.set(queryTimeout);
        }
    }
    
    /**
     * Unsets the "queryTimeout" attribute
     */
    public void unsetQueryTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUERYTIMEOUT$18);
        }
    }
    
    /**
     * Gets the "maxRows" attribute
     */
    public java.lang.String getMaxRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXROWS$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxRows" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMaxRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXROWS$20);
            return target;
        }
    }
    
    /**
     * True if has "maxRows" attribute
     */
    public boolean isSetMaxRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXROWS$20) != null;
        }
    }
    
    /**
     * Sets the "maxRows" attribute
     */
    public void setMaxRows(java.lang.String maxRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXROWS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXROWS$20);
            }
            target.setStringValue(maxRows);
        }
    }
    
    /**
     * Sets (as xml) the "maxRows" attribute
     */
    public void xsetMaxRows(org.apache.xmlbeans.XmlString maxRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXROWS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAXROWS$20);
            }
            target.set(maxRows);
        }
    }
    
    /**
     * Unsets the "maxRows" attribute
     */
    public void unsetMaxRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXROWS$20);
        }
    }
    
    /**
     * Gets the "fetchSize" attribute
     */
    public java.lang.String getFetchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHSIZE$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fetchSize" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFetchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FETCHSIZE$22);
            return target;
        }
    }
    
    /**
     * True if has "fetchSize" attribute
     */
    public boolean isSetFetchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FETCHSIZE$22) != null;
        }
    }
    
    /**
     * Sets the "fetchSize" attribute
     */
    public void setFetchSize(java.lang.String fetchSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FETCHSIZE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FETCHSIZE$22);
            }
            target.setStringValue(fetchSize);
        }
    }
    
    /**
     * Sets (as xml) the "fetchSize" attribute
     */
    public void xsetFetchSize(org.apache.xmlbeans.XmlString fetchSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FETCHSIZE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FETCHSIZE$22);
            }
            target.set(fetchSize);
        }
    }
    
    /**
     * Unsets the "fetchSize" attribute
     */
    public void unsetFetchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FETCHSIZE$22);
        }
    }
}
