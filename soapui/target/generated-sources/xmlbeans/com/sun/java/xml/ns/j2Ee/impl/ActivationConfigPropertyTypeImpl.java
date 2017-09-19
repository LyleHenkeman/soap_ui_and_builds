/*
 * XML Type:  activation-config-propertyType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML activation-config-propertyType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ActivationConfigPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ActivationConfigPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ActivationConfigPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATIONCONFIGPROPERTYNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "activation-config-property-name");
    private static final javax.xml.namespace.QName ACTIVATIONCONFIGPROPERTYVALUE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "activation-config-property-value");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "activation-config-property-name" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType getActivationConfigPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activation-config-property-name" element
     */
    public void setActivationConfigPropertyName(com.sun.java.xml.ns.j2Ee.XsdStringType activationConfigPropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ACTIVATIONCONFIGPROPERTYNAME$0);
            }
            target.set(activationConfigPropertyName);
        }
    }
    
    /**
     * Appends and returns a new empty "activation-config-property-name" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType addNewActivationConfigPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ACTIVATIONCONFIGPROPERTYNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "activation-config-property-value" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType getActivationConfigPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTYVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activation-config-property-value" element
     */
    public void setActivationConfigPropertyValue(com.sun.java.xml.ns.j2Ee.XsdStringType activationConfigPropertyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(ACTIVATIONCONFIGPROPERTYVALUE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ACTIVATIONCONFIGPROPERTYVALUE$2);
            }
            target.set(activationConfigPropertyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "activation-config-property-value" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType addNewActivationConfigPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(ACTIVATIONCONFIGPROPERTYVALUE$2);
            return target;
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
