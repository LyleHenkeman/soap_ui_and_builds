/*
 * XML Type:  DataGeneratorProperty
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataGeneratorPropertyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DataGeneratorProperty(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DataGeneratorPropertyConfigImpl extends com.eviware.soapui.config.impl.RegistryEntryConfigImpl implements com.eviware.soapui.config.DataGeneratorPropertyConfig
{
    private static final long serialVersionUID = 1L;
    
    public DataGeneratorPropertyConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName MODE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mode");
    private static final javax.xml.namespace.QName SHARED$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "shared");
    
    
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
     * Gets the "mode" element
     */
    public com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode.Enum getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "mode" element
     */
    public com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode)get_store().find_element_user(MODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode.Enum mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$2);
            }
            target.setEnumValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "mode" element
     */
    public void xsetMode(com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode target = null;
            target = (com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode)get_store().find_element_user(MODE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode)get_store().add_element_user(MODE$2);
            }
            target.set(mode);
        }
    }
    
    /**
     * Gets the "shared" element
     */
    public boolean getShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "shared" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shared" element
     */
    public void setShared(boolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHARED$4);
            }
            target.setBooleanValue(shared);
        }
    }
    
    /**
     * Sets (as xml) the "shared" element
     */
    public void xsetShared(org.apache.xmlbeans.XmlBoolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHARED$4);
            }
            target.set(shared);
        }
    }
    /**
     * An XML mode(@http://eviware.com/soapui/config).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.DataGeneratorPropertyConfig$Mode.
     */
    public static class ModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.DataGeneratorPropertyConfig.Mode
    {
        private static final long serialVersionUID = 1L;
        
        public ModeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
