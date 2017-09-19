/*
 * XML Type:  subcode
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.Subcode
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML subcode(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class SubcodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.Subcode
{
    private static final long serialVersionUID = 1L;
    
    public SubcodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Value");
    private static final javax.xml.namespace.QName SUBCODE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Subcode");
    
    
    /**
     * Gets the "Value" element
     */
    public javax.xml.namespace.QName getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.apache.xmlbeans.XmlQName xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(javax.xml.namespace.QName value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setQNameValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlQName value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "Subcode" element
     */
    public org.w3.x2003.x05.soapEnvelope.Subcode getSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Subcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Subcode)get_store().find_element_user(SUBCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Subcode" element
     */
    public boolean isSetSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "Subcode" element
     */
    public void setSubcode(org.w3.x2003.x05.soapEnvelope.Subcode subcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Subcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Subcode)get_store().find_element_user(SUBCODE$2, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Subcode)get_store().add_element_user(SUBCODE$2);
            }
            target.set(subcode);
        }
    }
    
    /**
     * Appends and returns a new empty "Subcode" element
     */
    public org.w3.x2003.x05.soapEnvelope.Subcode addNewSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Subcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Subcode)get_store().add_element_user(SUBCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Subcode" element
     */
    public void unsetSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCODE$2, 0);
        }
    }
}
