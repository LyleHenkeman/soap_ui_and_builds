/*
 * An XML attribute type.
 * Localname: Optional
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one Optional(@http://schemas.xmlsoap.org/ws/2004/09/policy) attribute.
 *
 * This is a complex type.
 */
public class OptionalAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalAttribute
{
    private static final long serialVersionUID = 1L;
    
    public OptionalAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONAL$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "Optional");
    
    
    /**
     * Gets the "Optional" attribute
     */
    public boolean getOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPTIONAL$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Optional" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OPTIONAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OPTIONAL$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "Optional" attribute
     */
    public boolean isSetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPTIONAL$0) != null;
        }
    }
    
    /**
     * Sets the "Optional" attribute
     */
    public void setOptional(boolean optional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIONAL$0);
            }
            target.setBooleanValue(optional);
        }
    }
    
    /**
     * Sets (as xml) the "Optional" attribute
     */
    public void xsetOptional(org.apache.xmlbeans.XmlBoolean optional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OPTIONAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OPTIONAL$0);
            }
            target.set(optional);
        }
    }
    
    /**
     * Unsets the "Optional" attribute
     */
    public void unsetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPTIONAL$0);
        }
    }
}
