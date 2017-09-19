/*
 * An XML attribute type.
 * Localname: encodingStyle
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.EncodingStyleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one encodingStyle(@http://www.w3.org/2003/05/soap-envelope) attribute.
 *
 * This is a complex type.
 */
public class EncodingStyleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.EncodingStyleAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EncodingStyleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODINGSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "encodingStyle");
    
    
    /**
     * Gets the "encodingStyle" attribute
     */
    public java.lang.String getEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGSTYLE$0);
            return target;
        }
    }
    
    /**
     * True if has "encodingStyle" attribute
     */
    public boolean isSetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGSTYLE$0) != null;
        }
    }
    
    /**
     * Sets the "encodingStyle" attribute
     */
    public void setEncodingStyle(java.lang.String encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$0);
            }
            target.setStringValue(encodingStyle);
        }
    }
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    public void xsetEncodingStyle(org.apache.xmlbeans.XmlAnyURI encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ENCODINGSTYLE$0);
            }
            target.set(encodingStyle);
        }
    }
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    public void unsetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGSTYLE$0);
        }
    }
}
