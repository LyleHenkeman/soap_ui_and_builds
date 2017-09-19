/*
 * XML Type:  SimpleType
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SimpleTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML SimpleType(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class SimpleTypeConfigImpl extends com.eviware.soapui.inferredSchema.impl.TypeConfigImpl implements com.eviware.soapui.inferredSchema.SimpleTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public SimpleTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETED$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "completed");
    private static final javax.xml.namespace.QName TYPENAME$2 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "typeName");
    
    
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
    
    /**
     * Gets the "typeName" element
     */
    public java.lang.String getTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPENAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPENAME$2);
            }
            target.set(typeName);
        }
    }
}
