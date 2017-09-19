/*
 * XML Type:  resource-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ResourceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML resource-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ResourceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ResourceRefType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName RESREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "res-ref-name");
    private static final javax.xml.namespace.QName RESTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "res-type");
    private static final javax.xml.namespace.QName RESAUTH$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "res-auth");
    private static final javax.xml.namespace.QName RESSHARINGSCOPE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "res-sharing-scope");
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
                { return ResourceRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ResourceRefTypeImpl.this.getDescriptionArray(i);
                ResourceRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { ResourceRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ResourceRefTypeImpl.this.getDescriptionArray(i);
                ResourceRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ResourceRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "res-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType getResRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(RESREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "res-ref-name" element
     */
    public void setResRefName(com.sun.java.xml.ns.j2Ee.JndiNameType resRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(RESREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(RESREFNAME$2);
            }
            target.set(resRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "res-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType addNewResRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(RESREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "res-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(RESTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "res-type" element
     */
    public void setResType(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType resType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(RESTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(RESTYPE$4);
            }
            target.set(resType);
        }
    }
    
    /**
     * Appends and returns a new empty "res-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(RESTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "res-auth" element
     */
    public com.sun.java.xml.ns.j2Ee.ResAuthType getResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResAuthType)get_store().find_element_user(RESAUTH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "res-auth" element
     */
    public void setResAuth(com.sun.java.xml.ns.j2Ee.ResAuthType resAuth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResAuthType)get_store().find_element_user(RESAUTH$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ResAuthType)get_store().add_element_user(RESAUTH$6);
            }
            target.set(resAuth);
        }
    }
    
    /**
     * Appends and returns a new empty "res-auth" element
     */
    public com.sun.java.xml.ns.j2Ee.ResAuthType addNewResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResAuthType)get_store().add_element_user(RESAUTH$6);
            return target;
        }
    }
    
    /**
     * Gets the "res-sharing-scope" element
     */
    public com.sun.java.xml.ns.j2Ee.ResSharingScopeType getResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResSharingScopeType)get_store().find_element_user(RESSHARINGSCOPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "res-sharing-scope" element
     */
    public boolean isSetResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESSHARINGSCOPE$8) != 0;
        }
    }
    
    /**
     * Sets the "res-sharing-scope" element
     */
    public void setResSharingScope(com.sun.java.xml.ns.j2Ee.ResSharingScopeType resSharingScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResSharingScopeType)get_store().find_element_user(RESSHARINGSCOPE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ResSharingScopeType)get_store().add_element_user(RESSHARINGSCOPE$8);
            }
            target.set(resSharingScope);
        }
    }
    
    /**
     * Appends and returns a new empty "res-sharing-scope" element
     */
    public com.sun.java.xml.ns.j2Ee.ResSharingScopeType addNewResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResSharingScopeType)get_store().add_element_user(RESSHARINGSCOPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "res-sharing-scope" element
     */
    public void unsetResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESSHARINGSCOPE$8, 0);
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
