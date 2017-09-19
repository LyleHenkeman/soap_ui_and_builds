/*
 * XML Type:  bindingType
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.BindingType
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * An XML bindingType(@http://schemas.xmlsoap.org/wsdl/http/).
 *
 * This is a complex type.
 */
public class BindingTypeImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.http.BindingType
{
    private static final long serialVersionUID = 1L;
    
    public BindingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERB$0 = 
        new javax.xml.namespace.QName("", "verb");
    
    
    /**
     * Gets the "verb" attribute
     */
    public java.lang.String getVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERB$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "verb" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VERB$0);
            return target;
        }
    }
    
    /**
     * Sets the "verb" attribute
     */
    public void setVerb(java.lang.String verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERB$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERB$0);
            }
            target.setStringValue(verb);
        }
    }
    
    /**
     * Sets (as xml) the "verb" attribute
     */
    public void xsetVerb(org.apache.xmlbeans.XmlNMTOKEN verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VERB$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(VERB$0);
            }
            target.set(verb);
        }
    }
}
