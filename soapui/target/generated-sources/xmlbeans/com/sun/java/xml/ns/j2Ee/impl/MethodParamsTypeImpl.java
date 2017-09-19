/*
 * XML Type:  method-paramsType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MethodParamsType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML method-paramsType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class MethodParamsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.MethodParamsType
{
    private static final long serialVersionUID = 1L;
    
    public MethodParamsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODPARAM$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-param");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "method-param" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.JavaTypeType> getMethodParamList()
    {
        final class MethodParamList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.JavaTypeType>
        {
            public com.sun.java.xml.ns.j2Ee.JavaTypeType get(int i)
                { return MethodParamsTypeImpl.this.getMethodParamArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.JavaTypeType set(int i, com.sun.java.xml.ns.j2Ee.JavaTypeType o)
            {
                com.sun.java.xml.ns.j2Ee.JavaTypeType old = MethodParamsTypeImpl.this.getMethodParamArray(i);
                MethodParamsTypeImpl.this.setMethodParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.JavaTypeType o)
                { MethodParamsTypeImpl.this.insertNewMethodParam(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.JavaTypeType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.JavaTypeType old = MethodParamsTypeImpl.this.getMethodParamArray(i);
                MethodParamsTypeImpl.this.removeMethodParam(i);
                return old;
            }
            
            public int size()
                { return MethodParamsTypeImpl.this.sizeOfMethodParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodParamList();
        }
    }
    
    /**
     * Gets array of all "method-param" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType[] getMethodParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.JavaTypeType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.JavaTypeType>();
            get_store().find_all_element_users(METHODPARAM$0, targetList);
            com.sun.java.xml.ns.j2Ee.JavaTypeType[] result = new com.sun.java.xml.ns.j2Ee.JavaTypeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method-param" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType getMethodParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(METHODPARAM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method-param" element
     */
    public int sizeOfMethodParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODPARAM$0);
        }
    }
    
    /**
     * Sets array of all "method-param" element
     */
    public void setMethodParamArray(com.sun.java.xml.ns.j2Ee.JavaTypeType[] methodParamArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodParamArray, METHODPARAM$0);
        }
    }
    
    /**
     * Sets ith "method-param" element
     */
    public void setMethodParamArray(int i, com.sun.java.xml.ns.j2Ee.JavaTypeType methodParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(METHODPARAM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(methodParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-param" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType insertNewMethodParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().insert_element_user(METHODPARAM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-param" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType addNewMethodParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().add_element_user(METHODPARAM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "method-param" element
     */
    public void removeMethodParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODPARAM$0, i);
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
