/*
 * An XML attribute type.
 * Localname: NewAttribute
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.NewAttributeAttributeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one NewAttribute(@http://eviware.com/soapui/config) attribute.
 *
 * This is a complex type.
 */
public class NewAttributeAttributeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.NewAttributeAttributeConfig
{
    private static final long serialVersionUID = 1L;
    
    public NewAttributeAttributeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "NewAttribute");
    
    
    /**
     * Gets the "NewAttribute" attribute
     */
    public java.lang.String getNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWATTRIBUTE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewAttribute" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NEWATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * True if has "NewAttribute" attribute
     */
    public boolean isSetNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEWATTRIBUTE$0) != null;
        }
    }
    
    /**
     * Sets the "NewAttribute" attribute
     */
    public void setNewAttribute(java.lang.String newAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWATTRIBUTE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEWATTRIBUTE$0);
            }
            target.setStringValue(newAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "NewAttribute" attribute
     */
    public void xsetNewAttribute(org.apache.xmlbeans.XmlString newAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NEWATTRIBUTE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NEWATTRIBUTE$0);
            }
            target.set(newAttribute);
        }
    }
    
    /**
     * Unsets the "NewAttribute" attribute
     */
    public void unsetNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEWATTRIBUTE$0);
        }
    }
}
