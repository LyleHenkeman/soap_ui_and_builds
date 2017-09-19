/*
 * XML Type:  handlerChainsType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML handlerChainsType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class HandlerChainsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType
{
    private static final long serialVersionUID = 1L;
    
    public HandlerChainsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHAIN$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "chain");
    
    
    /**
     * Gets a List of "chain" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.ChainType> getChainList()
    {
        final class ChainList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.ChainType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType get(int i)
                { return HandlerChainsTypeImpl.this.getChainArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ChainType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.ChainType old = HandlerChainsTypeImpl.this.getChainArray(i);
                HandlerChainsTypeImpl.this.setChainArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ChainType o)
                { HandlerChainsTypeImpl.this.insertNewChain(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.ChainType old = HandlerChainsTypeImpl.this.getChainArray(i);
                HandlerChainsTypeImpl.this.removeChain(i);
                return old;
            }
            
            public int size()
                { return HandlerChainsTypeImpl.this.sizeOfChainArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ChainList();
        }
    }
    
    /**
     * Gets array of all "chain" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType[] getChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.ChainType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.ChainType>();
            get_store().find_all_element_users(CHAIN$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.ChainType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.ChainType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "chain" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType getChainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ChainType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ChainType)get_store().find_element_user(CHAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "chain" element
     */
    public int sizeOfChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHAIN$0);
        }
    }
    
    /**
     * Sets array of all "chain" element
     */
    public void setChainArray(com.sun.java.xml.ns.jaxRpc.ri.config.ChainType[] chainArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(chainArray, CHAIN$0);
        }
    }
    
    /**
     * Sets ith "chain" element
     */
    public void setChainArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ChainType chain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ChainType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ChainType)get_store().find_element_user(CHAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(chain);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "chain" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType insertNewChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ChainType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ChainType)get_store().insert_element_user(CHAIN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "chain" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ChainType addNewChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ChainType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ChainType)get_store().add_element_user(CHAIN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "chain" element
     */
    public void removeChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHAIN$0, i);
        }
    }
}
