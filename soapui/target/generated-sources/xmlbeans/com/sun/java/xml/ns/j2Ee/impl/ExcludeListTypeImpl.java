/*
 * XML Type:  exclude-listType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ExcludeListType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML exclude-listType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ExcludeListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ExcludeListType
{
    private static final long serialVersionUID = 1L;
    
    public ExcludeListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName METHOD$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return ExcludeListTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ExcludeListTypeImpl.this.getDescriptionArray(i);
                ExcludeListTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { ExcludeListTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ExcludeListTypeImpl.this.getDescriptionArray(i);
                ExcludeListTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ExcludeListTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets a List of "method" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MethodType> getMethodList()
    {
        final class MethodList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MethodType>
        {
            public com.sun.java.xml.ns.j2Ee.MethodType get(int i)
                { return ExcludeListTypeImpl.this.getMethodArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MethodType set(int i, com.sun.java.xml.ns.j2Ee.MethodType o)
            {
                com.sun.java.xml.ns.j2Ee.MethodType old = ExcludeListTypeImpl.this.getMethodArray(i);
                ExcludeListTypeImpl.this.setMethodArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MethodType o)
                { ExcludeListTypeImpl.this.insertNewMethod(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MethodType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MethodType old = ExcludeListTypeImpl.this.getMethodArray(i);
                ExcludeListTypeImpl.this.removeMethod(i);
                return old;
            }
            
            public int size()
                { return ExcludeListTypeImpl.this.sizeOfMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodList();
        }
    }
    
    /**
     * Gets array of all "method" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MethodType[] getMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MethodType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MethodType>();
            get_store().find_all_element_users(METHOD$2, targetList);
            com.sun.java.xml.ns.j2Ee.MethodType[] result = new com.sun.java.xml.ns.j2Ee.MethodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType getMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().find_element_user(METHOD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method" element
     */
    public int sizeOfMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$2);
        }
    }
    
    /**
     * Sets array of all "method" element
     */
    public void setMethodArray(com.sun.java.xml.ns.j2Ee.MethodType[] methodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodArray, METHOD$2);
        }
    }
    
    /**
     * Sets ith "method" element
     */
    public void setMethodArray(int i, com.sun.java.xml.ns.j2Ee.MethodType method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().find_element_user(METHOD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(method);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType insertNewMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().insert_element_user(METHOD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().add_element_user(METHOD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "method" element
     */
    public void removeMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
}
