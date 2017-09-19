/*
 * XML Type:  chainType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ChainType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML chainType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class ChainTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.ChainType
{
    private static final long serialVersionUID = 1L;
    
    public ChainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDLER$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "handler");
    private static final javax.xml.namespace.QName RUNAT$2 = 
        new javax.xml.namespace.QName("", "runAt");
    private static final javax.xml.namespace.QName ROLES$4 = 
        new javax.xml.namespace.QName("", "roles");
    
    
    /**
     * Gets a List of "handler" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType> getHandlerList()
    {
        final class HandlerList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType get(int i)
                { return ChainTypeImpl.this.getHandlerArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType old = ChainTypeImpl.this.getHandlerArray(i);
                ChainTypeImpl.this.setHandlerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType o)
                { ChainTypeImpl.this.insertNewHandler(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType old = ChainTypeImpl.this.getHandlerArray(i);
                ChainTypeImpl.this.removeHandler(i);
                return old;
            }
            
            public int size()
                { return ChainTypeImpl.this.sizeOfHandlerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlerList();
        }
    }
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType[] getHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType>();
            get_store().find_all_element_users(HANDLER$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handler" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType getHandlerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType)get_store().find_element_user(HANDLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handler" element
     */
    public int sizeOfHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLER$0);
        }
    }
    
    /**
     * Sets array of all "handler" element
     */
    public void setHandlerArray(com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType[] handlerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlerArray, HANDLER$0);
        }
    }
    
    /**
     * Sets ith "handler" element
     */
    public void setHandlerArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType handler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType)get_store().find_element_user(HANDLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handler);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType insertNewHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType)get_store().insert_element_user(HANDLER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType addNewHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType)get_store().add_element_user(HANDLER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "handler" element
     */
    public void removeHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLER$0, i);
        }
    }
    
    /**
     * Gets the "runAt" attribute
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType.Enum getRunAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAT$2);
            if (target == null)
            {
                return null;
            }
            return (com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "runAt" attribute
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType xgetRunAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType)get_store().find_attribute_user(RUNAT$2);
            return target;
        }
    }
    
    /**
     * Sets the "runAt" attribute
     */
    public void setRunAt(com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType.Enum runAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNAT$2);
            }
            target.setEnumValue(runAt);
        }
    }
    
    /**
     * Sets (as xml) the "runAt" attribute
     */
    public void xsetRunAt(com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType runAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType)get_store().find_attribute_user(RUNAT$2);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.RunAtType)get_store().add_attribute_user(RUNAT$2);
            }
            target.set(runAt);
        }
    }
    
    /**
     * Gets the "roles" attribute
     */
    public java.util.List getRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLES$4);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "roles" attribute
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType xgetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType)get_store().find_attribute_user(ROLES$4);
            return target;
        }
    }
    
    /**
     * True if has "roles" attribute
     */
    public boolean isSetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLES$4) != null;
        }
    }
    
    /**
     * Sets the "roles" attribute
     */
    public void setRoles(java.util.List roles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLES$4);
            }
            target.setListValue(roles);
        }
    }
    
    /**
     * Sets (as xml) the "roles" attribute
     */
    public void xsetRoles(com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType roles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType)get_store().find_attribute_user(ROLES$4);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.RoleListType)get_store().add_attribute_user(ROLES$4);
            }
            target.set(roles);
        }
    }
    
    /**
     * Unsets the "roles" attribute
     */
    public void unsetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLES$4);
        }
    }
}
