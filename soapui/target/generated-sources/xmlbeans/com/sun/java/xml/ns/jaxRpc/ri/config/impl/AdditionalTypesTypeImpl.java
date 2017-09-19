/*
 * XML Type:  additionalTypesType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML additionalTypesType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class AdditionalTypesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType
{
    private static final long serialVersionUID = 1L;
    
    public AdditionalTypesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASS1$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "class");
    
    
    /**
     * Gets a List of "class" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.ClassType> getClass1List()
    {
        final class Class1List extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.ClassType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType get(int i)
                { return AdditionalTypesTypeImpl.this.getClass1Array(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ClassType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.ClassType old = AdditionalTypesTypeImpl.this.getClass1Array(i);
                AdditionalTypesTypeImpl.this.setClass1Array(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ClassType o)
                { AdditionalTypesTypeImpl.this.insertNewClass1(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.ClassType old = AdditionalTypesTypeImpl.this.getClass1Array(i);
                AdditionalTypesTypeImpl.this.removeClass1(i);
                return old;
            }
            
            public int size()
                { return AdditionalTypesTypeImpl.this.sizeOfClass1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Class1List();
        }
    }
    
    /**
     * Gets array of all "class" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType[] getClass1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.ClassType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.ClassType>();
            get_store().find_all_element_users(CLASS1$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.ClassType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.ClassType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "class" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType getClass1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ClassType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ClassType)get_store().find_element_user(CLASS1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "class" element
     */
    public int sizeOfClass1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASS1$0);
        }
    }
    
    /**
     * Sets array of all "class" element
     */
    public void setClass1Array(com.sun.java.xml.ns.jaxRpc.ri.config.ClassType[] class1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(class1Array, CLASS1$0);
        }
    }
    
    /**
     * Sets ith "class" element
     */
    public void setClass1Array(int i, com.sun.java.xml.ns.jaxRpc.ri.config.ClassType class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ClassType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ClassType)get_store().find_element_user(CLASS1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(class1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "class" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType insertNewClass1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ClassType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ClassType)get_store().insert_element_user(CLASS1$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "class" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ClassType addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ClassType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ClassType)get_store().add_element_user(CLASS1$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "class" element
     */
    public void removeClass1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASS1$0, i);
        }
    }
}
