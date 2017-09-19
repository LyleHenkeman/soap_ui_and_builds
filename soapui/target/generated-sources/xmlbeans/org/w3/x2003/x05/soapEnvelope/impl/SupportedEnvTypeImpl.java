/*
 * XML Type:  SupportedEnvType
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.SupportedEnvType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML SupportedEnvType(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class SupportedEnvTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.SupportedEnvType
{
    private static final long serialVersionUID = 1L;
    
    public SupportedEnvTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QNAME$0 = 
        new javax.xml.namespace.QName("", "qname");
    
    
    /**
     * Gets the "qname" attribute
     */
    public javax.xml.namespace.QName getQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "qname" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(QNAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "qname" attribute
     */
    public void setQname(javax.xml.namespace.QName qname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QNAME$0);
            }
            target.setQNameValue(qname);
        }
    }
    
    /**
     * Sets (as xml) the "qname" attribute
     */
    public void xsetQname(org.apache.xmlbeans.XmlQName qname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(QNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(QNAME$0);
            }
            target.set(qname);
        }
    }
}
