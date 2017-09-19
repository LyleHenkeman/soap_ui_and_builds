/*
 * XML Type:  wsdl-return-value-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML wsdl-return-value-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WsdlReturnValueMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType
{
    private static final long serialVersionUID = 1L;
    
    public WsdlReturnValueMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODRETURNVALUE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-return-value");
    private static final javax.xml.namespace.QName WSDLMESSAGE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message");
    private static final javax.xml.namespace.QName WSDLMESSAGEPARTNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message-part-name");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "method-return-value" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getMethodReturnValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(METHODRETURNVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method-return-value" element
     */
    public void setMethodReturnValue(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType methodReturnValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(METHODRETURNVALUE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(METHODRETURNVALUE$0);
            }
            target.set(methodReturnValue);
        }
    }
    
    /**
     * Appends and returns a new empty "method-return-value" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewMethodReturnValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(METHODRETURNVALUE$0);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-message" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessageType getWsdlMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().find_element_user(WSDLMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-message" element
     */
    public void setWsdlMessage(com.sun.java.xml.ns.j2Ee.WsdlMessageType wsdlMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().find_element_user(WSDLMESSAGE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().add_element_user(WSDLMESSAGE$2);
            }
            target.set(wsdlMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-message" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessageType addNewWsdlMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().add_element_user(WSDLMESSAGE$2);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-message-part-name" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType getWsdlMessagePartName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().find_element_user(WSDLMESSAGEPARTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdl-message-part-name" element
     */
    public boolean isSetWsdlMessagePartName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLMESSAGEPARTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-message-part-name" element
     */
    public void setWsdlMessagePartName(com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType wsdlMessagePartName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().find_element_user(WSDLMESSAGEPARTNAME$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().add_element_user(WSDLMESSAGEPARTNAME$4);
            }
            target.set(wsdlMessagePartName);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-message-part-name" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType addNewWsdlMessagePartName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().add_element_user(WSDLMESSAGEPARTNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdl-message-part-name" element
     */
    public void unsetWsdlMessagePartName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLMESSAGEPARTNAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
