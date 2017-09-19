/*
 * XML Type:  locale-encoding-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML locale-encoding-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class LocaleEncodingMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingType
{
    private static final long serialVersionUID = 1L;
    
    public LocaleEncodingMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "locale");
    private static final javax.xml.namespace.QName ENCODING$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "encoding");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "locale" element
     */
    public java.lang.String getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locale" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleType xgetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleType)get_store().find_element_user(LOCALE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "locale" element
     */
    public void setLocale(java.lang.String locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALE$0);
            }
            target.setStringValue(locale);
        }
    }
    
    /**
     * Sets (as xml) the "locale" element
     */
    public void xsetLocale(com.sun.java.xml.ns.j2Ee.LocaleType locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleType)get_store().find_element_user(LOCALE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.LocaleType)get_store().add_element_user(LOCALE$0);
            }
            target.set(locale);
        }
    }
    
    /**
     * Gets the "encoding" element
     */
    public java.lang.String getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encoding" element
     */
    public com.sun.java.xml.ns.j2Ee.EncodingType xgetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EncodingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EncodingType)get_store().find_element_user(ENCODING$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "encoding" element
     */
    public void setEncoding(java.lang.String encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCODING$2);
            }
            target.setStringValue(encoding);
        }
    }
    
    /**
     * Sets (as xml) the "encoding" element
     */
    public void xsetEncoding(com.sun.java.xml.ns.j2Ee.EncodingType encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EncodingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EncodingType)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EncodingType)get_store().add_element_user(ENCODING$2);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
}
