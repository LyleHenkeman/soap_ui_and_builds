/*
 * XML Type:  ejb-local-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbLocalRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML ejb-local-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class EjbLocalRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EjbLocalRefType
{
    private static final long serialVersionUID = 1L;
    
    public EjbLocalRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName EJBREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-ref-name");
    private static final javax.xml.namespace.QName EJBREFTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-ref-type");
    private static final javax.xml.namespace.QName LOCALHOME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "local-home");
    private static final javax.xml.namespace.QName LOCAL$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "local");
    private static final javax.xml.namespace.QName EJBLINK$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-link");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return EjbLocalRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbLocalRefTypeImpl.this.getDescriptionArray(i);
                EjbLocalRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { EjbLocalRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbLocalRefTypeImpl.this.getDescriptionArray(i);
                EjbLocalRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EjbLocalRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "ejb-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefNameType getEjbRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefNameType)get_store().find_element_user(EJBREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-ref-name" element
     */
    public void setEjbRefName(com.sun.java.xml.ns.j2Ee.EjbRefNameType ejbRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefNameType)get_store().find_element_user(EJBREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbRefNameType)get_store().add_element_user(EJBREFNAME$2);
            }
            target.set(ejbRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefNameType addNewEjbRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefNameType)get_store().add_element_user(EJBREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "ejb-ref-type" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefTypeType getEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefTypeType)get_store().find_element_user(EJBREFTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-ref-type" element
     */
    public void setEjbRefType(com.sun.java.xml.ns.j2Ee.EjbRefTypeType ejbRefType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefTypeType)get_store().find_element_user(EJBREFTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbRefTypeType)get_store().add_element_user(EJBREFTYPE$4);
            }
            target.set(ejbRefType);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-ref-type" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefTypeType addNewEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefTypeType)get_store().add_element_user(EJBREFTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "local-home" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalHomeType getLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().find_element_user(LOCALHOME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "local-home" element
     */
    public void setLocalHome(com.sun.java.xml.ns.j2Ee.LocalHomeType localHome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().find_element_user(LOCALHOME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().add_element_user(LOCALHOME$6);
            }
            target.set(localHome);
        }
    }
    
    /**
     * Appends and returns a new empty "local-home" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalHomeType addNewLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().add_element_user(LOCALHOME$6);
            return target;
        }
    }
    
    /**
     * Gets the "local" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalType getLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().find_element_user(LOCAL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "local" element
     */
    public void setLocal(com.sun.java.xml.ns.j2Ee.LocalType local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().find_element_user(LOCAL$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().add_element_user(LOCAL$8);
            }
            target.set(local);
        }
    }
    
    /**
     * Appends and returns a new empty "local" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalType addNewLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().add_element_user(LOCAL$8);
            return target;
        }
    }
    
    /**
     * Gets the "ejb-link" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLinkType getEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().find_element_user(EJBLINK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-link" element
     */
    public boolean isSetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLINK$10) != 0;
        }
    }
    
    /**
     * Sets the "ejb-link" element
     */
    public void setEjbLink(com.sun.java.xml.ns.j2Ee.EjbLinkType ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().find_element_user(EJBLINK$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().add_element_user(EJBLINK$10);
            }
            target.set(ejbLink);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-link" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLinkType addNewEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().add_element_user(EJBLINK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-link" element
     */
    public void unsetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLINK$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
}
