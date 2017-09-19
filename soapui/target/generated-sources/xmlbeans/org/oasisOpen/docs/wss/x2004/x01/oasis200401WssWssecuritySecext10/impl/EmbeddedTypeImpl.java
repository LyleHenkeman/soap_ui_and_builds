/*
 * XML Type:  EmbeddedType
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * An XML EmbeddedType(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd).
 *
 * This is a complex type.
 */
public class EmbeddedTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType
{
    private static final long serialVersionUID = 1L;
    
    public EmbeddedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUETYPE$0 = 
        new javax.xml.namespace.QName("", "ValueType");
    
    
    /**
     * Gets the "ValueType" attribute
     */
    public java.lang.String getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueType" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "ValueType" attribute
     */
    public boolean isSetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUETYPE$0) != null;
        }
    }
    
    /**
     * Sets the "ValueType" attribute
     */
    public void setValueType(java.lang.String valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$0);
            }
            target.setStringValue(valueType);
        }
    }
    
    /**
     * Sets (as xml) the "ValueType" attribute
     */
    public void xsetValueType(org.apache.xmlbeans.XmlAnyURI valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(VALUETYPE$0);
            }
            target.set(valueType);
        }
    }
    
    /**
     * Unsets the "ValueType" attribute
     */
    public void unsetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUETYPE$0);
        }
    }
}
