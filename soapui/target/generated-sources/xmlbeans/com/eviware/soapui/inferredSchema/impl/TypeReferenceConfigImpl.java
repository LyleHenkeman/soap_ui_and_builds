/*
 * XML Type:  TypeReference
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.TypeReferenceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML TypeReference(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class TypeReferenceConfigImpl extends com.eviware.soapui.inferredSchema.impl.TypeConfigImpl implements com.eviware.soapui.inferredSchema.TypeReferenceConfig
{
    private static final long serialVersionUID = 1L;
    
    public TypeReferenceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "reference");
    
    
    /**
     * Gets the "reference" element
     */
    public javax.xml.namespace.QName getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "reference" element
     */
    public org.apache.xmlbeans.XmlQName xgetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(REFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(javax.xml.namespace.QName reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$0);
            }
            target.setQNameValue(reference);
        }
    }
    
    /**
     * Sets (as xml) the "reference" element
     */
    public void xsetReference(org.apache.xmlbeans.XmlQName reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(REFERENCE$0);
            }
            target.set(reference);
        }
    }
}
