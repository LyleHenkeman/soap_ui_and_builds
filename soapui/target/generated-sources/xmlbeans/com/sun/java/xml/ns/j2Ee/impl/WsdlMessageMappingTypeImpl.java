/*
 * XML Type:  wsdl-message-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML wsdl-message-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WsdlMessageMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType
{
    private static final long serialVersionUID = 1L;
    
    public WsdlMessageMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WSDLMESSAGE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message");
    private static final javax.xml.namespace.QName WSDLMESSAGEPARTNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message-part-name");
    private static final javax.xml.namespace.QName PARAMETERMODE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "parameter-mode");
    private static final javax.xml.namespace.QName SOAPHEADER$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "soap-header");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "wsdl-message" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessageType getWsdlMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().find_element_user(WSDLMESSAGE$0, 0);
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
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().find_element_user(WSDLMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().add_element_user(WSDLMESSAGE$0);
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
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageType)get_store().add_element_user(WSDLMESSAGE$0);
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
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().find_element_user(WSDLMESSAGEPARTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().find_element_user(WSDLMESSAGEPARTNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().add_element_user(WSDLMESSAGEPARTNAME$2);
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
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType)get_store().add_element_user(WSDLMESSAGEPARTNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "parameter-mode" element
     */
    public com.sun.java.xml.ns.j2Ee.ParameterModeType getParameterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParameterModeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParameterModeType)get_store().find_element_user(PARAMETERMODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameter-mode" element
     */
    public void setParameterMode(com.sun.java.xml.ns.j2Ee.ParameterModeType parameterMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParameterModeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParameterModeType)get_store().find_element_user(PARAMETERMODE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ParameterModeType)get_store().add_element_user(PARAMETERMODE$4);
            }
            target.set(parameterMode);
        }
    }
    
    /**
     * Appends and returns a new empty "parameter-mode" element
     */
    public com.sun.java.xml.ns.j2Ee.ParameterModeType addNewParameterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParameterModeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParameterModeType)get_store().add_element_user(PARAMETERMODE$4);
            return target;
        }
    }
    
    /**
     * Gets the "soap-header" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(SOAPHEADER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "soap-header" element
     */
    public boolean isSetSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPHEADER$6) != 0;
        }
    }
    
    /**
     * Sets the "soap-header" element
     */
    public void setSoapHeader(com.sun.java.xml.ns.j2Ee.EmptyType soapHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(SOAPHEADER$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(SOAPHEADER$6);
            }
            target.set(soapHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "soap-header" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(SOAPHEADER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "soap-header" element
     */
    public void unsetSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPHEADER$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
