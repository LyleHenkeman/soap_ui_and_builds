/*
 * XML Type:  activation-configType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ActivationConfigType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML activation-configType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ActivationConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ActivationConfigType
{
    private static final long serialVersionUID = 1L;
    
    public ActivationConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName ACTIVATIONCONFIGPROPERTY$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "activation-config-property");
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
                { return ActivationConfigTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ActivationConfigTypeImpl.this.getDescriptionArray(i);
                ActivationConfigTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { ActivationConfigTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ActivationConfigTypeImpl.this.getDescriptionArray(i);
                ActivationConfigTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ActivationConfigTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets a List of "activation-config-property" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType> getActivationConfigPropertyList()
    {
        final class ActivationConfigPropertyList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType>
        {
            public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType get(int i)
                { return ActivationConfigTypeImpl.this.getActivationConfigPropertyArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType set(int i, com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType o)
            {
                com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType old = ActivationConfigTypeImpl.this.getActivationConfigPropertyArray(i);
                ActivationConfigTypeImpl.this.setActivationConfigPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType o)
                { ActivationConfigTypeImpl.this.insertNewActivationConfigProperty(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType old = ActivationConfigTypeImpl.this.getActivationConfigPropertyArray(i);
                ActivationConfigTypeImpl.this.removeActivationConfigProperty(i);
                return old;
            }
            
            public int size()
                { return ActivationConfigTypeImpl.this.sizeOfActivationConfigPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActivationConfigPropertyList();
        }
    }
    
    /**
     * Gets array of all "activation-config-property" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType[] getActivationConfigPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType>();
            get_store().find_all_element_users(ACTIVATIONCONFIGPROPERTY$2, targetList);
            com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType[] result = new com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activation-config-property" element
     */
    public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType getActivationConfigPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activation-config-property" element
     */
    public int sizeOfActivationConfigPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATIONCONFIGPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "activation-config-property" element
     */
    public void setActivationConfigPropertyArray(com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType[] activationConfigPropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activationConfigPropertyArray, ACTIVATIONCONFIGPROPERTY$2);
        }
    }
    
    /**
     * Sets ith "activation-config-property" element
     */
    public void setActivationConfigPropertyArray(int i, com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType activationConfigProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activationConfigProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activation-config-property" element
     */
    public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType insertNewActivationConfigProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType)get_store().insert_element_user(ACTIVATIONCONFIGPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activation-config-property" element
     */
    public com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType addNewActivationConfigProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType)get_store().add_element_user(ACTIVATIONCONFIGPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "activation-config-property" element
     */
    public void removeActivationConfigProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATIONCONFIGPROPERTY$2, i);
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
