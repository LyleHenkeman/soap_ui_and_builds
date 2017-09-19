/*
 * XML Type:  Script
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ScriptConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Script(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.ScriptConfig.
 */
public class ScriptConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.ScriptConfig
{
    private static final long serialVersionUID = 1L;
    
    public ScriptConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ScriptConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName DISABLED$4 = 
        new javax.xml.namespace.QName("", "disabled");
    
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGUAGE$0);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$0) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$0);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGUAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
    
    /**
     * Gets the "disabled" attribute
     */
    public boolean getDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$4);
            return target;
        }
    }
    
    /**
     * True if has "disabled" attribute
     */
    public boolean isSetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLED$4) != null;
        }
    }
    
    /**
     * Sets the "disabled" attribute
     */
    public void setDisabled(boolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$4);
            }
            target.setBooleanValue(disabled);
        }
    }
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$4);
            }
            target.set(disabled);
        }
    }
    
    /**
     * Unsets the "disabled" attribute
     */
    public void unsetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLED$4);
        }
    }
}
