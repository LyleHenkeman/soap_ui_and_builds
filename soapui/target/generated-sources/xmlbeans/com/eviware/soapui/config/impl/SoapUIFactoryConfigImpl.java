/*
 * XML Type:  SoapUIFactory
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIFactoryConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIFactory(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIFactoryConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIFactoryConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIFactoryConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName FACTORYTYPE$2 = 
        new javax.xml.namespace.QName("", "factoryType");
    private static final javax.xml.namespace.QName FACTORYCLASS$4 = 
        new javax.xml.namespace.QName("", "factoryClass");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
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
            return get_store().find_attribute_user(ID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
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
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "factoryType" attribute
     */
    public java.lang.String getFactoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYTYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "factoryType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFactoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "factoryType" attribute
     */
    public boolean isSetFactoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FACTORYTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "factoryType" attribute
     */
    public void setFactoryType(java.lang.String factoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACTORYTYPE$2);
            }
            target.setStringValue(factoryType);
        }
    }
    
    /**
     * Sets (as xml) the "factoryType" attribute
     */
    public void xsetFactoryType(org.apache.xmlbeans.XmlString factoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FACTORYTYPE$2);
            }
            target.set(factoryType);
        }
    }
    
    /**
     * Unsets the "factoryType" attribute
     */
    public void unsetFactoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FACTORYTYPE$2);
        }
    }
    
    /**
     * Gets the "factoryClass" attribute
     */
    public java.lang.String getFactoryClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYCLASS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "factoryClass" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFactoryClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYCLASS$4);
            return target;
        }
    }
    
    /**
     * True if has "factoryClass" attribute
     */
    public boolean isSetFactoryClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FACTORYCLASS$4) != null;
        }
    }
    
    /**
     * Sets the "factoryClass" attribute
     */
    public void setFactoryClass(java.lang.String factoryClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYCLASS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACTORYCLASS$4);
            }
            target.setStringValue(factoryClass);
        }
    }
    
    /**
     * Sets (as xml) the "factoryClass" attribute
     */
    public void xsetFactoryClass(org.apache.xmlbeans.XmlString factoryClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYCLASS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FACTORYCLASS$4);
            }
            target.set(factoryClass);
        }
    }
    
    /**
     * Unsets the "factoryClass" attribute
     */
    public void unsetFactoryClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FACTORYCLASS$4);
        }
    }
}
