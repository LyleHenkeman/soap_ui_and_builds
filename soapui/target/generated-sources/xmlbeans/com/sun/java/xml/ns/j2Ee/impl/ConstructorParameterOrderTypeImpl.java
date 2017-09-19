/*
 * XML Type:  constructor-parameter-orderType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML constructor-parameter-orderType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ConstructorParameterOrderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType
{
    private static final long serialVersionUID = 1L;
    
    public ConstructorParameterOrderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENTNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "element-name");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "element-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.String> getElementNameList()
    {
        final class ElementNameList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.String>
        {
            public com.sun.java.xml.ns.j2Ee.String get(int i)
                { return ConstructorParameterOrderTypeImpl.this.getElementNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.String set(int i, com.sun.java.xml.ns.j2Ee.String o)
            {
                com.sun.java.xml.ns.j2Ee.String old = ConstructorParameterOrderTypeImpl.this.getElementNameArray(i);
                ConstructorParameterOrderTypeImpl.this.setElementNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.String o)
                { ConstructorParameterOrderTypeImpl.this.insertNewElementName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.String remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.String old = ConstructorParameterOrderTypeImpl.this.getElementNameArray(i);
                ConstructorParameterOrderTypeImpl.this.removeElementName(i);
                return old;
            }
            
            public int size()
                { return ConstructorParameterOrderTypeImpl.this.sizeOfElementNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ElementNameList();
        }
    }
    
    /**
     * Gets array of all "element-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.String[] getElementNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.String> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.String>();
            get_store().find_all_element_users(ELEMENTNAME$0, targetList);
            com.sun.java.xml.ns.j2Ee.String[] result = new com.sun.java.xml.ns.j2Ee.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "element-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getElementNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(ELEMENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "element-name" element
     */
    public int sizeOfElementNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENTNAME$0);
        }
    }
    
    /**
     * Sets array of all "element-name" element
     */
    public void setElementNameArray(com.sun.java.xml.ns.j2Ee.String[] elementNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(elementNameArray, ELEMENTNAME$0);
        }
    }
    
    /**
     * Sets ith "element-name" element
     */
    public void setElementNameArray(int i, com.sun.java.xml.ns.j2Ee.String elementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(ELEMENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(elementName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String insertNewElementName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().insert_element_user(ELEMENTNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(ELEMENTNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "element-name" element
     */
    public void removeElementName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENTNAME$0, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
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
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
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
            get_store().remove_attribute(ID$2);
        }
    }
}
