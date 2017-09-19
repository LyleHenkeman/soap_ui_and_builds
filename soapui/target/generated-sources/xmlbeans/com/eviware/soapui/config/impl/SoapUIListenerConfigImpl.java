/*
 * XML Type:  SoapUIListener
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIListenerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIListener(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIListenerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIListenerConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIListenerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName LISTENERCLASS$2 = 
        new javax.xml.namespace.QName("", "listenerClass");
    private static final javax.xml.namespace.QName LISTENERINTERFACE$4 = 
        new javax.xml.namespace.QName("", "listenerInterface");
    private static final javax.xml.namespace.QName SINGLETON$6 = 
        new javax.xml.namespace.QName("", "singleton");
    
    
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
     * Gets the "listenerClass" attribute
     */
    public java.lang.String getListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENERCLASS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listenerClass" attribute
     */
    public org.apache.xmlbeans.XmlString xgetListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENERCLASS$2);
            return target;
        }
    }
    
    /**
     * True if has "listenerClass" attribute
     */
    public boolean isSetListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTENERCLASS$2) != null;
        }
    }
    
    /**
     * Sets the "listenerClass" attribute
     */
    public void setListenerClass(java.lang.String listenerClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENERCLASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENERCLASS$2);
            }
            target.setStringValue(listenerClass);
        }
    }
    
    /**
     * Sets (as xml) the "listenerClass" attribute
     */
    public void xsetListenerClass(org.apache.xmlbeans.XmlString listenerClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENERCLASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENERCLASS$2);
            }
            target.set(listenerClass);
        }
    }
    
    /**
     * Unsets the "listenerClass" attribute
     */
    public void unsetListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTENERCLASS$2);
        }
    }
    
    /**
     * Gets the "listenerInterface" attribute
     */
    public java.lang.String getListenerInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENERINTERFACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listenerInterface" attribute
     */
    public org.apache.xmlbeans.XmlString xgetListenerInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENERINTERFACE$4);
            return target;
        }
    }
    
    /**
     * True if has "listenerInterface" attribute
     */
    public boolean isSetListenerInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTENERINTERFACE$4) != null;
        }
    }
    
    /**
     * Sets the "listenerInterface" attribute
     */
    public void setListenerInterface(java.lang.String listenerInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENERINTERFACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENERINTERFACE$4);
            }
            target.setStringValue(listenerInterface);
        }
    }
    
    /**
     * Sets (as xml) the "listenerInterface" attribute
     */
    public void xsetListenerInterface(org.apache.xmlbeans.XmlString listenerInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENERINTERFACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENERINTERFACE$4);
            }
            target.set(listenerInterface);
        }
    }
    
    /**
     * Unsets the "listenerInterface" attribute
     */
    public void unsetListenerInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTENERINTERFACE$4);
        }
    }
    
    /**
     * Gets the "singleton" attribute
     */
    public boolean getSingleton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLETON$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "singleton" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSingleton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SINGLETON$6);
            return target;
        }
    }
    
    /**
     * True if has "singleton" attribute
     */
    public boolean isSetSingleton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SINGLETON$6) != null;
        }
    }
    
    /**
     * Sets the "singleton" attribute
     */
    public void setSingleton(boolean singleton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLETON$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINGLETON$6);
            }
            target.setBooleanValue(singleton);
        }
    }
    
    /**
     * Sets (as xml) the "singleton" attribute
     */
    public void xsetSingleton(org.apache.xmlbeans.XmlBoolean singleton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SINGLETON$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SINGLETON$6);
            }
            target.set(singleton);
        }
    }
    
    /**
     * Unsets the "singleton" attribute
     */
    public void unsetSingleton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SINGLETON$6);
        }
    }
}
