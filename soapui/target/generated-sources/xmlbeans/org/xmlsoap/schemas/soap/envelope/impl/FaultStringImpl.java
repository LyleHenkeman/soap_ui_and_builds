/*
 * XML Type:  FaultString
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.FaultString
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * An XML FaultString(@http://schemas.xmlsoap.org/soap/envelope/).
 *
 * This is an atomic type that is a restriction of org.xmlsoap.schemas.soap.envelope.FaultString.
 */
public class FaultStringImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.xmlsoap.schemas.soap.envelope.FaultString
{
    private static final long serialVersionUID = 1L;
    
    public FaultStringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected FaultStringImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANG$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$0);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$0) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$0);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$0);
        }
    }
}
