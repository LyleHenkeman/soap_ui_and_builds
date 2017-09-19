/*
 * XML Type:  methodType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MethodType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML methodType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class MethodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.MethodType
{
    private static final long serialVersionUID = 1L;
    
    public MethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName EJBNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-name");
    private static final javax.xml.namespace.QName METHODINTF$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-intf");
    private static final javax.xml.namespace.QName METHODNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-name");
    private static final javax.xml.namespace.QName METHODPARAMS$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-params");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return MethodTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MethodTypeImpl.this.getDescriptionArray(i);
                MethodTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { MethodTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MethodTypeImpl.this.getDescriptionArray(i);
                MethodTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return MethodTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.j2Ee.DescriptionType[] result = new com.sun.java.xml.ns.j2Ee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets the "ejb-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbNameType getEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().find_element_user(EJBNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-name" element
     */
    public void setEjbName(com.sun.java.xml.ns.j2Ee.EjbNameType ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().find_element_user(EJBNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().add_element_user(EJBNAME$2);
            }
            target.set(ejbName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbNameType addNewEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().add_element_user(EJBNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "method-intf" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodIntfType getMethodIntf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodIntfType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodIntfType)get_store().find_element_user(METHODINTF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "method-intf" element
     */
    public boolean isSetMethodIntf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODINTF$4) != 0;
        }
    }
    
    /**
     * Sets the "method-intf" element
     */
    public void setMethodIntf(com.sun.java.xml.ns.j2Ee.MethodIntfType methodIntf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodIntfType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodIntfType)get_store().find_element_user(METHODINTF$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MethodIntfType)get_store().add_element_user(METHODINTF$4);
            }
            target.set(methodIntf);
        }
    }
    
    /**
     * Appends and returns a new empty "method-intf" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodIntfType addNewMethodIntf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodIntfType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodIntfType)get_store().add_element_user(METHODINTF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "method-intf" element
     */
    public void unsetMethodIntf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODINTF$4, 0);
        }
    }
    
    /**
     * Gets the "method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodNameType getMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().find_element_user(METHODNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method-name" element
     */
    public void setMethodName(com.sun.java.xml.ns.j2Ee.MethodNameType methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().find_element_user(METHODNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().add_element_user(METHODNAME$6);
            }
            target.set(methodName);
        }
    }
    
    /**
     * Appends and returns a new empty "method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodNameType addNewMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().add_element_user(METHODNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "method-params" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamsType getMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().find_element_user(METHODPARAMS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "method-params" element
     */
    public boolean isSetMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODPARAMS$8) != 0;
        }
    }
    
    /**
     * Sets the "method-params" element
     */
    public void setMethodParams(com.sun.java.xml.ns.j2Ee.MethodParamsType methodParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().find_element_user(METHODPARAMS$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().add_element_user(METHODPARAMS$8);
            }
            target.set(methodParams);
        }
    }
    
    /**
     * Appends and returns a new empty "method-params" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamsType addNewMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().add_element_user(METHODPARAMS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "method-params" element
     */
    public void unsetMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODPARAMS$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
        }
    }
}
