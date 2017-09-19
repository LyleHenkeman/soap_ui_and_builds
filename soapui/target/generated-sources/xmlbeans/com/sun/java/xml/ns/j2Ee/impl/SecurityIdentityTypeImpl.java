/*
 * XML Type:  security-identityType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.SecurityIdentityType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML security-identityType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class SecurityIdentityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.SecurityIdentityType
{
    private static final long serialVersionUID = 1L;
    
    public SecurityIdentityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName USECALLERIDENTITY$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "use-caller-identity");
    private static final javax.xml.namespace.QName RUNAS$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "run-as");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return SecurityIdentityTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = SecurityIdentityTypeImpl.this.getDescriptionArray(i);
                SecurityIdentityTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { SecurityIdentityTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = SecurityIdentityTypeImpl.this.getDescriptionArray(i);
                SecurityIdentityTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return SecurityIdentityTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "use-caller-identity" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getUseCallerIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(USECALLERIDENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "use-caller-identity" element
     */
    public boolean isSetUseCallerIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECALLERIDENTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "use-caller-identity" element
     */
    public void setUseCallerIdentity(com.sun.java.xml.ns.j2Ee.EmptyType useCallerIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(USECALLERIDENTITY$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(USECALLERIDENTITY$2);
            }
            target.set(useCallerIdentity);
        }
    }
    
    /**
     * Appends and returns a new empty "use-caller-identity" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewUseCallerIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(USECALLERIDENTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "use-caller-identity" element
     */
    public void unsetUseCallerIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECALLERIDENTITY$2, 0);
        }
    }
    
    /**
     * Gets the "run-as" element
     */
    public com.sun.java.xml.ns.j2Ee.RunAsType getRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RunAsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RunAsType)get_store().find_element_user(RUNAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "run-as" element
     */
    public boolean isSetRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNAS$4) != 0;
        }
    }
    
    /**
     * Sets the "run-as" element
     */
    public void setRunAs(com.sun.java.xml.ns.j2Ee.RunAsType runAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RunAsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RunAsType)get_store().find_element_user(RUNAS$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.RunAsType)get_store().add_element_user(RUNAS$4);
            }
            target.set(runAs);
        }
    }
    
    /**
     * Appends and returns a new empty "run-as" element
     */
    public com.sun.java.xml.ns.j2Ee.RunAsType addNewRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RunAsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RunAsType)get_store().add_element_user(RUNAS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "run-as" element
     */
    public void unsetRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNAS$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
