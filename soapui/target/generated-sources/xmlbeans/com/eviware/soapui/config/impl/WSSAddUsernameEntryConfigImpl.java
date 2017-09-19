/*
 * XML Type:  WSSAddUsernameEntry
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WSSAddUsernameEntryConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WSSAddUsernameEntry(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WSSAddUsernameEntryConfigImpl extends com.eviware.soapui.config.impl.WSSEntryConfigImpl implements com.eviware.soapui.config.WSSAddUsernameEntryConfig
{
    private static final long serialVersionUID = 1L;
    
    public WSSAddUsernameEntryConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDCREATED$0 = 
        new javax.xml.namespace.QName("", "addCreated");
    private static final javax.xml.namespace.QName ADDNONCE$2 = 
        new javax.xml.namespace.QName("", "addNonce");
    private static final javax.xml.namespace.QName PASSWORDTYPE$4 = 
        new javax.xml.namespace.QName("", "passwordType");
    
    
    /**
     * Gets the "addCreated" attribute
     */
    public boolean getAddCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDCREATED$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "addCreated" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAddCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDCREATED$0);
            return target;
        }
    }
    
    /**
     * True if has "addCreated" attribute
     */
    public boolean isSetAddCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDCREATED$0) != null;
        }
    }
    
    /**
     * Sets the "addCreated" attribute
     */
    public void setAddCreated(boolean addCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDCREATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDCREATED$0);
            }
            target.setBooleanValue(addCreated);
        }
    }
    
    /**
     * Sets (as xml) the "addCreated" attribute
     */
    public void xsetAddCreated(org.apache.xmlbeans.XmlBoolean addCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDCREATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADDCREATED$0);
            }
            target.set(addCreated);
        }
    }
    
    /**
     * Unsets the "addCreated" attribute
     */
    public void unsetAddCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDCREATED$0);
        }
    }
    
    /**
     * Gets the "addNonce" attribute
     */
    public boolean getAddNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDNONCE$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "addNonce" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAddNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDNONCE$2);
            return target;
        }
    }
    
    /**
     * True if has "addNonce" attribute
     */
    public boolean isSetAddNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDNONCE$2) != null;
        }
    }
    
    /**
     * Sets the "addNonce" attribute
     */
    public void setAddNonce(boolean addNonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDNONCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDNONCE$2);
            }
            target.setBooleanValue(addNonce);
        }
    }
    
    /**
     * Sets (as xml) the "addNonce" attribute
     */
    public void xsetAddNonce(org.apache.xmlbeans.XmlBoolean addNonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDNONCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADDNONCE$2);
            }
            target.set(addNonce);
        }
    }
    
    /**
     * Unsets the "addNonce" attribute
     */
    public void unsetAddNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDNONCE$2);
        }
    }
    
    /**
     * Gets the "passwordType" attribute
     */
    public com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig.Enum getPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORDTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "passwordType" attribute
     */
    public com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig xgetPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig target = null;
            target = (com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig)get_store().find_attribute_user(PASSWORDTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "passwordType" attribute
     */
    public boolean isSetPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORDTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "passwordType" attribute
     */
    public void setPasswordType(com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig.Enum passwordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORDTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORDTYPE$4);
            }
            target.setEnumValue(passwordType);
        }
    }
    
    /**
     * Sets (as xml) the "passwordType" attribute
     */
    public void xsetPasswordType(com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig passwordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig target = null;
            target = (com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig)get_store().find_attribute_user(PASSWORDTYPE$4);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WSSUsernamePasswordPasswordTypeConfig)get_store().add_attribute_user(PASSWORDTYPE$4);
            }
            target.set(passwordType);
        }
    }
    
    /**
     * Unsets the "passwordType" attribute
     */
    public void unsetPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORDTYPE$4);
        }
    }
}
