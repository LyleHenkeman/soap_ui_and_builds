/*
 * An XML attribute type.
 * Localname: mustUnderstand
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one mustUnderstand(@http://www.w3.org/2003/05/soap-envelope) attribute.
 *
 * This is a complex type.
 */
public class MustUnderstandAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute
{
    private static final long serialVersionUID = 1L;
    
    public MustUnderstandAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUSTUNDERSTAND$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "mustUnderstand");
    
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    public boolean getMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MUSTUNDERSTAND$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MUSTUNDERSTAND$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "mustUnderstand" attribute
     */
    public boolean isSetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUSTUNDERSTAND$0) != null;
        }
    }
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    public void setMustUnderstand(boolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUSTUNDERSTAND$0);
            }
            target.setBooleanValue(mustUnderstand);
        }
    }
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    public void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MUSTUNDERSTAND$0);
            }
            target.set(mustUnderstand);
        }
    }
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    public void unsetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUSTUNDERSTAND$0);
        }
    }
}
