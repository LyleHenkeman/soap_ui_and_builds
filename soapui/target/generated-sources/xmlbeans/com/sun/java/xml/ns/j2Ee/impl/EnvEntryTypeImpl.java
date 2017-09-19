/*
 * XML Type:  env-entryType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EnvEntryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML env-entryType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class EnvEntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EnvEntryType
{
    private static final long serialVersionUID = 1L;
    
    public EnvEntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName ENVENTRYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "env-entry-name");
    private static final javax.xml.namespace.QName ENVENTRYTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "env-entry-type");
    private static final javax.xml.namespace.QName ENVENTRYVALUE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "env-entry-value");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return EnvEntryTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EnvEntryTypeImpl.this.getDescriptionArray(i);
                EnvEntryTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { EnvEntryTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EnvEntryTypeImpl.this.getDescriptionArray(i);
                EnvEntryTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EnvEntryTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "env-entry-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType getEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(ENVENTRYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "env-entry-name" element
     */
    public void setEnvEntryName(com.sun.java.xml.ns.j2Ee.JndiNameType envEntryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(ENVENTRYNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(ENVENTRYNAME$2);
            }
            target.set(envEntryName);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType addNewEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(ENVENTRYNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "env-entry-type" element
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType getEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType)get_store().find_element_user(ENVENTRYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "env-entry-type" element
     */
    public void setEnvEntryType(com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType envEntryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType)get_store().find_element_user(ENVENTRYTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType)get_store().add_element_user(ENVENTRYTYPE$4);
            }
            target.set(envEntryType);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-type" element
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType addNewEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryTypeValuesType)get_store().add_element_user(ENVENTRYTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "env-entry-value" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType getEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ENVENTRYVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "env-entry-value" element
     */
    public boolean isSetEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRYVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "env-entry-value" element
     */
    public void setEnvEntryValue(com.sun.java.xml.ns.j2Ee.XsdStringType envEntryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ENVENTRYVALUE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ENVENTRYVALUE$6);
            }
            target.set(envEntryValue);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-value" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType addNewEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ENVENTRYVALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "env-entry-value" element
     */
    public void unsetEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRYVALUE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
