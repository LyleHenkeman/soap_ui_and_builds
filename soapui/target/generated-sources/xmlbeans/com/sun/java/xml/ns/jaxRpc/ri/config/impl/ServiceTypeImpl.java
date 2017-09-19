/*
 * XML Type:  serviceType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML serviceType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class ServiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "interface");
    private static final javax.xml.namespace.QName TYPEMAPPINGREGISTRY$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "typeMappingRegistry");
    private static final javax.xml.namespace.QName HANDLERCHAINS$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "handlerChains");
    private static final javax.xml.namespace.QName NAMESPACEMAPPINGREGISTRY$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "namespaceMappingRegistry");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$10 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName TYPENAMESPACE$12 = 
        new javax.xml.namespace.QName("", "typeNamespace");
    private static final javax.xml.namespace.QName PACKAGENAME$14 = 
        new javax.xml.namespace.QName("", "packageName");
    
    
    /**
     * Gets a List of "interface" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType> getInterfaceList()
    {
        final class InterfaceList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType get(int i)
                { return ServiceTypeImpl.this.getInterfaceArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType old = ServiceTypeImpl.this.getInterfaceArray(i);
                ServiceTypeImpl.this.setInterfaceArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType o)
                { ServiceTypeImpl.this.insertNewInterface(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType old = ServiceTypeImpl.this.getInterfaceArray(i);
                ServiceTypeImpl.this.removeInterface(i);
                return old;
            }
            
            public int size()
                { return ServiceTypeImpl.this.sizeOfInterfaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InterfaceList();
        }
    }
    
    /**
     * Gets array of all "interface" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[] getInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType>();
            get_store().find_all_element_users(INTERFACE$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interface" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType getInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interface" element
     */
    public int sizeOfInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACE$0);
        }
    }
    
    /**
     * Sets array of all "interface" element
     */
    public void setInterfaceArray(com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[] xinterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xinterfaceArray, INTERFACE$0);
        }
    }
    
    /**
     * Sets ith "interface" element
     */
    public void setInterfaceArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType insertNewInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType)get_store().insert_element_user(INTERFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "interface" element
     */
    public void removeInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACE$0, i);
        }
    }
    
    /**
     * Gets the "typeMappingRegistry" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType getTypeMappingRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().find_element_user(TYPEMAPPINGREGISTRY$2, 0);
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
            return get_store().count_elements(TYPEMAPPINGREGISTRY$2) != 0;
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().find_element_user(TYPEMAPPINGREGISTRY$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().add_element_user(TYPEMAPPINGREGISTRY$2);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType)get_store().add_element_user(TYPEMAPPINGREGISTRY$2);
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
            get_store().remove_element(TYPEMAPPINGREGISTRY$2, 0);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$4, 0);
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
            return get_store().count_elements(HANDLERCHAINS$4) != 0;
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().find_element_user(HANDLERCHAINS$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$4);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType)get_store().add_element_user(HANDLERCHAINS$4);
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
            get_store().remove_element(HANDLERCHAINS$4, 0);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().find_element_user(NAMESPACEMAPPINGREGISTRY$6, 0);
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
            return get_store().count_elements(NAMESPACEMAPPINGREGISTRY$6) != 0;
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().find_element_user(NAMESPACEMAPPINGREGISTRY$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().add_element_user(NAMESPACEMAPPINGREGISTRY$6);
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
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType)get_store().add_element_user(NAMESPACEMAPPINGREGISTRY$6);
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
            get_store().remove_element(NAMESPACEMAPPINGREGISTRY$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$10);
            return target;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$10);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$10);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Gets the "typeNamespace" attribute
     */
    public java.lang.String getTypeNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPENAMESPACE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTypeNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPENAMESPACE$12);
            return target;
        }
    }
    
    /**
     * Sets the "typeNamespace" attribute
     */
    public void setTypeNamespace(java.lang.String typeNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPENAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPENAMESPACE$12);
            }
            target.setStringValue(typeNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "typeNamespace" attribute
     */
    public void xsetTypeNamespace(org.apache.xmlbeans.XmlAnyURI typeNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPENAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TYPENAMESPACE$12);
            }
            target.set(typeNamespace);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGENAME$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGENAME$14);
            }
            target.set(packageName);
        }
    }
}
