/*
 * XML Type:  wsdlType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML wsdlType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class WsdlTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType
{
    private static final long serialVersionUID = 1L;
    
    public WsdlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEMAPPINGREGISTRY$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "typeMappingRegistry");
    private static final javax.xml.namespace.QName HANDLERCHAINS$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "handlerChains");
    private static final javax.xml.namespace.QName NAMESPACEMAPPINGREGISTRY$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "namespaceMappingRegistry");
    private static final javax.xml.namespace.QName LOCATION$6 = 
        new javax.xml.namespace.QName("", "location");
    private static final javax.xml.namespace.QName PACKAGENAME$8 = 
        new javax.xml.namespace.QName("", "packageName");
    
    
    /**
     * Gets the "typeMappingRegistry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType getTypeMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().find_element_user(TYPEMAPPINGREGISTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "typeMappingRegistry" element
     */
    public boolean isSetTypeMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEMAPPINGREGISTRY$0) != 0;
        }
    }
    
    /**
     * Sets the "typeMappingRegistry" element
     */
    public void setTypeMappingRegistry(com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType typeMappingRegistry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().find_element_user(TYPEMAPPINGREGISTRY$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().add_element_user(TYPEMAPPINGREGISTRY$0);
            }
            target.set(typeMappingRegistry);
        }
    }
    
    /**
     * Appends and returns a new empty "typeMappingRegistry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType addNewTypeMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().add_element_user(TYPEMAPPINGREGISTRY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "typeMappingRegistry" element
     */
    public void unsetTypeMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEMAPPINGREGISTRY$0, 0);
        }
    }
    
    /**
     * Gets the "handlerChains" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType getHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$2, 0);
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
            return get_store().count_elements(HANDLERCHAINS$2) != 0;
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$2);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$2);
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
            get_store().remove_element(HANDLERCHAINS$2, 0);
        }
    }
    
    /**
     * Gets the "namespaceMappingRegistry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType getNamespaceMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().find_element_user(NAMESPACEMAPPINGREGISTRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "namespaceMappingRegistry" element
     */
    public boolean isSetNamespaceMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESPACEMAPPINGREGISTRY$4) != 0;
        }
    }
    
    /**
     * Sets the "namespaceMappingRegistry" element
     */
    public void setNamespaceMappingRegistry(com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType namespaceMappingRegistry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().find_element_user(NAMESPACEMAPPINGREGISTRY$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().add_element_user(NAMESPACEMAPPINGREGISTRY$4);
            }
            target.set(namespaceMappingRegistry);
        }
    }
    
    /**
     * Appends and returns a new empty "namespaceMappingRegistry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType addNewNamespaceMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().add_element_user(NAMESPACEMAPPINGREGISTRY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "namespaceMappingRegistry" element
     */
    public void unsetNamespaceMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESPACEMAPPINGREGISTRY$4, 0);
        }
    }
    
    /**
     * Gets the "location" attribute
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$6);
            return target;
        }
    }
    
    /**
     * Sets the "location" attribute
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$6);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" attribute
     */
    public void xsetLocation(org.apache.xmlbeans.XmlAnyURI location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LOCATION$6);
            }
            target.set(location);
        }
    }
    
    /**
     * Gets the "packageName" attribute
     */
    public java.lang.String getPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packageName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPackageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$8);
            return target;
        }
    }
    
    /**
     * Sets the "packageName" attribute
     */
    public void setPackageName(java.lang.String packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGENAME$8);
            }
            target.setStringValue(packageName);
        }
    }
    
    /**
     * Sets (as xml) the "packageName" attribute
     */
    public void xsetPackageName(org.apache.xmlbeans.XmlString packageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGENAME$8);
            }
            target.set(packageName);
        }
    }
}
