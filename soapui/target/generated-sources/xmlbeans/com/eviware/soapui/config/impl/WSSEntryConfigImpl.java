/*
 * XML Type:  WSSEntry
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WSSEntryConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WSSEntry(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WSSEntryConfigImpl extends com.eviware.soapui.config.impl.RegistryEntryConfigImpl implements com.eviware.soapui.config.WSSEntryConfig
{
    private static final long serialVersionUID = 1L;
    
    public WSSEntryConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("", "username");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("", "password");
    private static final javax.xml.namespace.QName KEYIDENTIFIERTYPE$4 = 
        new javax.xml.namespace.QName("", "keyIdentifierType");
    
    
    /**
     * Gets the "username" attribute
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "username" attribute
     */
    public boolean isSetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERNAME$0) != null;
        }
    }
    
    /**
     * Sets the "username" attribute
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERNAME$0);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" attribute
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERNAME$0);
            }
            target.set(username);
        }
    }
    
    /**
     * Unsets the "username" attribute
     */
    public void unsetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERNAME$0);
        }
    }
    
    /**
     * Gets the "password" attribute
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            return target;
        }
    }
    
    /**
     * True if has "password" attribute
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORD$2) != null;
        }
    }
    
    /**
     * Sets the "password" attribute
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" attribute
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" attribute
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORD$2);
        }
    }
    
    /**
     * Gets the "keyIdentifierType" attribute
     */
    public com.eviware.soapui.config.KeyIdentifierTypeConfig.Enum getKeyIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYIDENTIFIERTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.KeyIdentifierTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "keyIdentifierType" attribute
     */
    public com.eviware.soapui.config.KeyIdentifierTypeConfig xgetKeyIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyIdentifierTypeConfig target = null;
            target = (com.eviware.soapui.config.KeyIdentifierTypeConfig)get_store().find_attribute_user(KEYIDENTIFIERTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "keyIdentifierType" attribute
     */
    public boolean isSetKeyIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYIDENTIFIERTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "keyIdentifierType" attribute
     */
    public void setKeyIdentifierType(com.eviware.soapui.config.KeyIdentifierTypeConfig.Enum keyIdentifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYIDENTIFIERTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYIDENTIFIERTYPE$4);
            }
            target.setEnumValue(keyIdentifierType);
        }
    }
    
    /**
     * Sets (as xml) the "keyIdentifierType" attribute
     */
    public void xsetKeyIdentifierType(com.eviware.soapui.config.KeyIdentifierTypeConfig keyIdentifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyIdentifierTypeConfig target = null;
            target = (com.eviware.soapui.config.KeyIdentifierTypeConfig)get_store().find_attribute_user(KEYIDENTIFIERTYPE$4);
            if (target == null)
            {
                target = (com.eviware.soapui.config.KeyIdentifierTypeConfig)get_store().add_attribute_user(KEYIDENTIFIERTYPE$4);
            }
            target.set(keyIdentifierType);
        }
    }
    
    /**
     * Unsets the "keyIdentifierType" attribute
     */
    public void unsetKeyIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYIDENTIFIERTYPE$4);
        }
    }
}
