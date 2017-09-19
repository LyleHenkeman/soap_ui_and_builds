/*
 * An XML attribute type.
 * Localname: required
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.RequiredAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * A document containing one required(@http://schemas.xmlsoap.org/wsdl/) attribute.
 *
 * This is a complex type.
 */
public class RequiredAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.RequiredAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RequiredAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIRED$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "required");
    
    
    /**
     * Gets the "required" attribute
     */
    public boolean getRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "required" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$0);
            return target;
        }
    }
    
    /**
     * True if has "required" attribute
     */
    public boolean isSetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUIRED$0) != null;
        }
    }
    
    /**
     * Sets the "required" attribute
     */
    public void setRequired(boolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$0);
            }
            target.setBooleanValue(required);
        }
    }
    
    /**
     * Sets (as xml) the "required" attribute
     */
    public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REQUIRED$0);
            }
            target.set(required);
        }
    }
    
    /**
     * Unsets the "required" attribute
     */
    public void unsetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUIRED$0);
        }
    }
}
