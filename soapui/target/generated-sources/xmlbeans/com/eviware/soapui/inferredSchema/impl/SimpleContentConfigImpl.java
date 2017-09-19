/*
 * XML Type:  SimpleContent
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SimpleContentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML SimpleContent(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class SimpleContentConfigImpl extends com.eviware.soapui.inferredSchema.impl.ContentConfigImpl implements com.eviware.soapui.inferredSchema.SimpleContentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SimpleContentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPENAME$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "typeName");
    
    
    /**
     * Gets the "typeName" element
     */
    public java.lang.String getTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeName" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "typeName" element
     */
    public void setTypeName(java.lang.String typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPENAME$0);
            }
            target.setStringValue(typeName);
        }
    }
    
    /**
     * Sets (as xml) the "typeName" element
     */
    public void xsetTypeName(org.apache.xmlbeans.XmlString typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPENAME$0);
            }
            target.set(typeName);
        }
    }
}
