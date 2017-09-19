/*
 * XML Type:  KeyIdentifierType
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * An XML KeyIdentifierType(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd).
 *
 * This is an atomic type that is a restriction of org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType.
 */
public class KeyIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public KeyIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected KeyIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
    private static final javax.xml.namespace.QName ENCODINGTYPE$2 = 
        new javax.xml.namespace.QName("", "EncodingType");
    private static final javax.xml.namespace.QName VALUETYPE$4 = 
        new javax.xml.namespace.QName("", "ValueType");
    
    
    /**
     * Gets the "Id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "Id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "Id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "Id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "EncodingType" attribute
     */
    public java.lang.String getEncodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGTYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EncodingType" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEncodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "EncodingType" attribute
     */
    public boolean isSetEncodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "EncodingType" attribute
     */
    public void setEncodingType(java.lang.String encodingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGTYPE$2);
            }
            target.setStringValue(encodingType);
        }
    }
    
    /**
     * Sets (as xml) the "EncodingType" attribute
     */
    public void xsetEncodingType(org.apache.xmlbeans.XmlAnyURI encodingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ENCODINGTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ENCODINGTYPE$2);
            }
            target.set(encodingType);
        }
    }
    
    /**
     * Unsets the "EncodingType" attribute
     */
    public void unsetEncodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGTYPE$2);
        }
    }
    
    /**
     * Gets the "ValueType" attribute
     */
    public java.lang.String getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$4);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$4);
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
            return get_store().find_attribute_user(VALUETYPE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$4);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(VALUETYPE$4);
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
            get_store().remove_attribute(VALUETYPE$4);
        }
    }
}
