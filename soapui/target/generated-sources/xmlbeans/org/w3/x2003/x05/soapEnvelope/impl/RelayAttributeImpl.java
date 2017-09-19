/*
 * An XML attribute type.
 * Localname: relay
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.RelayAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one relay(@http://www.w3.org/2003/05/soap-envelope) attribute.
 *
 * This is a complex type.
 */
public class RelayAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.RelayAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RelayAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELAY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "relay");
    
    
    /**
     * Gets the "relay" attribute
     */
    public boolean getRelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RELAY$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "relay" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RELAY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "relay" attribute
     */
    public boolean isSetRelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELAY$0) != null;
        }
    }
    
    /**
     * Sets the "relay" attribute
     */
    public void setRelay(boolean relay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELAY$0);
            }
            target.setBooleanValue(relay);
        }
    }
    
    /**
     * Sets (as xml) the "relay" attribute
     */
    public void xsetRelay(org.apache.xmlbeans.XmlBoolean relay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RELAY$0);
            }
            target.set(relay);
        }
    }
    
    /**
     * Unsets the "relay" attribute
     */
    public void unsetRelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELAY$0);
        }
    }
}
