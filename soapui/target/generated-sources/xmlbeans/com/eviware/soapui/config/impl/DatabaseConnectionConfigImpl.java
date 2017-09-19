/*
 * XML Type:  DatabaseConnection
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DatabaseConnectionConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DatabaseConnection(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DatabaseConnectionConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DatabaseConnectionConfig
{
    private static final long serialVersionUID = 1L;
    
    public DatabaseConnectionConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName DRIVER$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "driver");
    private static final javax.xml.namespace.QName CONNECTIONSTRING$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "connectionString");
    private static final javax.xml.namespace.QName PASSWORD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "password");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
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
}
