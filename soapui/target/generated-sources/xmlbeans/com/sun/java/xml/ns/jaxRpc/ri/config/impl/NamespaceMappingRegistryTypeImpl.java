/*
 * XML Type:  namespaceMappingRegistryType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML namespaceMappingRegistryType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class NamespaceMappingRegistryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType
{
    private static final long serialVersionUID = 1L;
    
    public NamespaceMappingRegistryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMESPACEMAPPING$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "namespaceMapping");
    
    
    /**
     * Gets a List of "namespaceMapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType> getNamespaceMappingList()
    {
        final class NamespaceMappingList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType get(int i)
                { return NamespaceMappingRegistryTypeImpl.this.getNamespaceMappingArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType old = NamespaceMappingRegistryTypeImpl.this.getNamespaceMappingArray(i);
                NamespaceMappingRegistryTypeImpl.this.setNamespaceMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType o)
                { NamespaceMappingRegistryTypeImpl.this.insertNewNamespaceMapping(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType old = NamespaceMappingRegistryTypeImpl.this.getNamespaceMappingArray(i);
                NamespaceMappingRegistryTypeImpl.this.removeNamespaceMapping(i);
                return old;
            }
            
            public int size()
                { return NamespaceMappingRegistryTypeImpl.this.sizeOfNamespaceMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NamespaceMappingList();
        }
    }
    
    /**
     * Gets array of all "namespaceMapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[] getNamespaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType>();
            get_store().find_all_element_users(NAMESPACEMAPPING$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "namespaceMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType getNamespaceMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType)get_store().find_element_user(NAMESPACEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "namespaceMapping" element
     */
    public int sizeOfNamespaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESPACEMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "namespaceMapping" element
     */
    public void setNamespaceMappingArray(com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[] namespaceMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(namespaceMappingArray, NAMESPACEMAPPING$0);
        }
    }
    
    /**
     * Sets ith "namespaceMapping" element
     */
    public void setNamespaceMappingArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType namespaceMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType)get_store().find_element_user(NAMESPACEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(namespaceMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "namespaceMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType insertNewNamespaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType)get_store().insert_element_user(NAMESPACEMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "namespaceMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType addNewNamespaceMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType)get_store().add_element_user(NAMESPACEMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "namespaceMapping" element
     */
    public void removeNamespaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESPACEMAPPING$0, i);
        }
    }
}
