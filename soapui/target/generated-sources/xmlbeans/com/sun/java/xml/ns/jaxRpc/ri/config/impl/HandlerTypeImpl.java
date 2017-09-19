/*
 * XML Type:  handlerType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML handlerType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class HandlerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.HandlerType
{
    private static final long serialVersionUID = 1L;
    
    public HandlerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "property");
    private static final javax.xml.namespace.QName CLASSNAME$2 = 
        new javax.xml.namespace.QName("", "className");
    private static final javax.xml.namespace.QName HEADERS$4 = 
        new javax.xml.namespace.QName("", "headers");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType get(int i)
                { return HandlerTypeImpl.this.getPropertyArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType old = HandlerTypeImpl.this.getPropertyArray(i);
                HandlerTypeImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType o)
                { HandlerTypeImpl.this.insertNewProperty(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType old = HandlerTypeImpl.this.getPropertyArray(i);
                HandlerTypeImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return HandlerTypeImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType>();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.PropertyType)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
    
    /**
     * Gets the "className" attribute
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "className" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "className" attribute
     */
    public void setClassName(java.lang.String className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$2);
            }
            target.setStringValue(className);
        }
    }
    
    /**
     * Sets (as xml) the "className" attribute
     */
    public void xsetClassName(org.apache.xmlbeans.XmlString className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$2);
            }
            target.set(className);
        }
    }
    
    /**
     * Gets the "headers" attribute
     */
    public java.util.List getHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$4);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "headers" attribute
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType xgetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType)get_store().find_attribute_user(HEADERS$4);
            return target;
        }
    }
    
    /**
     * True if has "headers" attribute
     */
    public boolean isSetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERS$4) != null;
        }
    }
    
    /**
     * Sets the "headers" attribute
     */
    public void setHeaders(java.util.List headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERS$4);
            }
            target.setListValue(headers);
        }
    }
    
    /**
     * Sets (as xml) the "headers" attribute
     */
    public void xsetHeaders(com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType)get_store().find_attribute_user(HEADERS$4);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.HeaderListType)get_store().add_attribute_user(HEADERS$4);
            }
            target.set(headers);
        }
    }
    
    /**
     * Unsets the "headers" attribute
     */
    public void unsetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERS$4);
        }
    }
}
