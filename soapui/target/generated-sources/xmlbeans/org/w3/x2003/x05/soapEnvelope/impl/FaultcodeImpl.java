/*
 * XML Type:  faultcode
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.Faultcode
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML faultcode(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class FaultcodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.Faultcode
{
    private static final long serialVersionUID = 1L;
    
    public FaultcodeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public org.w3.x2003.x05.soapEnvelope.FaultcodeEnum xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.FaultcodeEnum target = null;
            target = (org.w3.x2003.x05.soapEnvelope.FaultcodeEnum)get_store().find_element_user(VALUE$0, 0);
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
    public void xsetValue(org.w3.x2003.x05.soapEnvelope.FaultcodeEnum value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.FaultcodeEnum target = null;
            target = (org.w3.x2003.x05.soapEnvelope.FaultcodeEnum)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.FaultcodeEnum)get_store().add_element_user(VALUE$0);
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
