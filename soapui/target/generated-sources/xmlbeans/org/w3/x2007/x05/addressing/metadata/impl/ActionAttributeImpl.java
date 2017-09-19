/*
 * An XML attribute type.
 * Localname: Action
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.ActionAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one Action(@http://www.w3.org/2007/05/addressing/metadata) attribute.
 *
 * This is a complex type.
 */
public class ActionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.ActionAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ActionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "Action");
    
    
    /**
     * Gets the "Action" attribute
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ACTION$0);
            return target;
        }
    }
    
    /**
     * True if has "Action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$0) != null;
        }
    }
    
    /**
     * Sets the "Action" attribute
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$0);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" attribute
     */
    public void xsetAction(org.apache.xmlbeans.XmlAnyURI action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ACTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ACTION$0);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "Action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$0);
        }
    }
}
