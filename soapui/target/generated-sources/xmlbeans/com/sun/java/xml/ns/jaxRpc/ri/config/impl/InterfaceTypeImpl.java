/*
 * XML Type:  interfaceType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML interfaceType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class InterfaceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDLERCHAINS$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "handlerChains");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SERVANTNAME$4 = 
        new javax.xml.namespace.QName("", "servantName");
    private static final javax.xml.namespace.QName SOAPACTION$6 = 
        new javax.xml.namespace.QName("", "soapAction");
    private static final javax.xml.namespace.QName SOAPACTIONBASE$8 = 
        new javax.xml.namespace.QName("", "soapActionBase");
    
    
    /**
     * Gets the "handlerChains" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType getHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handlerChains" element
     */
    public boolean isSetHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLERCHAINS$0) != 0;
        }
    }
    
    /**
     * Sets the "handlerChains" element
     */
    public void setHandlerChains(com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType handlerChains)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$0);
            }
            target.set(handlerChains);
        }
    }
    
    /**
     * Appends and returns a new empty "handlerChains" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType addNewHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "handlerChains" element
     */
    public void unsetHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLERCHAINS$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "servantName" attribute
     */
    public java.lang.String getServantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVANTNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "servantName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetServantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVANTNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "servantName" attribute
     */
    public boolean isSetServantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVANTNAME$4) != null;
        }
    }
    
    /**
     * Sets the "servantName" attribute
     */
    public void setServantName(java.lang.String servantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVANTNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVANTNAME$4);
            }
            target.setStringValue(servantName);
        }
    }
    
    /**
     * Sets (as xml) the "servantName" attribute
     */
    public void xsetServantName(org.apache.xmlbeans.XmlString servantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVANTNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVANTNAME$4);
            }
            target.set(servantName);
        }
    }
    
    /**
     * Unsets the "servantName" attribute
     */
    public void unsetServantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVANTNAME$4);
        }
    }
    
    /**
     * Gets the "soapAction" attribute
     */
    public java.lang.String getSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapAction" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPACTION$6);
            return target;
        }
    }
    
    /**
     * True if has "soapAction" attribute
     */
    public boolean isSetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPACTION$6) != null;
        }
    }
    
    /**
     * Sets the "soapAction" attribute
     */
    public void setSoapAction(java.lang.String soapAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPACTION$6);
            }
            target.setStringValue(soapAction);
        }
    }
    
    /**
     * Sets (as xml) the "soapAction" attribute
     */
    public void xsetSoapAction(org.apache.xmlbeans.XmlString soapAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOAPACTION$6);
            }
            target.set(soapAction);
        }
    }
    
    /**
     * Unsets the "soapAction" attribute
     */
    public void unsetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPACTION$6);
        }
    }
    
    /**
     * Gets the "soapActionBase" attribute
     */
    public java.lang.String getSoapActionBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTIONBASE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapActionBase" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoapActionBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPACTIONBASE$8);
            return target;
        }
    }
    
    /**
     * True if has "soapActionBase" attribute
     */
    public boolean isSetSoapActionBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPACTIONBASE$8) != null;
        }
    }
    
    /**
     * Sets the "soapActionBase" attribute
     */
    public void setSoapActionBase(java.lang.String soapActionBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTIONBASE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPACTIONBASE$8);
            }
            target.setStringValue(soapActionBase);
        }
    }
    
    /**
     * Sets (as xml) the "soapActionBase" attribute
     */
    public void xsetSoapActionBase(org.apache.xmlbeans.XmlString soapActionBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPACTIONBASE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOAPACTIONBASE$8);
            }
            target.set(soapActionBase);
        }
    }
    
    /**
     * Unsets the "soapActionBase" attribute
     */
    public void unsetSoapActionBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPACTIONBASE$8);
        }
    }
}
