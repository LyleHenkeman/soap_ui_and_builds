/*
 * XML Type:  ReferenceType
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.ReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * An XML ReferenceType(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd).
 *
 * This is a complex type.
 */
public class ReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.ReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URI$0 = 
        new javax.xml.namespace.QName("", "URI");
    private static final javax.xml.namespace.QName VALUETYPE$2 = 
        new javax.xml.namespace.QName("", "ValueType");
    
    
    /**
     * Gets the "URI" attribute
     */
    public java.lang.String getURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URI" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
            return target;
        }
    }
    
    /**
     * True if has "URI" attribute
     */
    public boolean isSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$0) != null;
        }
    }
    
    /**
     * Sets the "URI" attribute
     */
    public void setURI(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$0);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "URI" attribute
     */
    public void xsetURI(org.apache.xmlbeans.XmlAnyURI uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$0);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "URI" attribute
     */
    public void unsetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$2);
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
            return get_store().find_attribute_user(VALUETYPE$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VALUETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(VALUETYPE$2);
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
            get_store().remove_attribute(VALUETYPE$2);
        }
    }
}
