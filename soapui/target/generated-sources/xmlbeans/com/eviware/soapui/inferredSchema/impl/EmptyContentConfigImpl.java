/*
 * XML Type:  EmptyContent
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.EmptyContentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML EmptyContent(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class EmptyContentConfigImpl extends com.eviware.soapui.inferredSchema.impl.ContentConfigImpl implements com.eviware.soapui.inferredSchema.EmptyContentConfig
{
    private static final long serialVersionUID = 1L;
    
    public EmptyContentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETED$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "completed");
    
    
    /**
     * Gets the "completed" element
     */
    public boolean getCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "completed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "completed" element
     */
    public void setCompleted(boolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETED$0);
            }
            target.setBooleanValue(completed);
        }
    }
    
    /**
     * Sets (as xml) the "completed" element
     */
    public void xsetCompleted(org.apache.xmlbeans.XmlBoolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPLETED$0);
            }
            target.set(completed);
        }
    }
}
