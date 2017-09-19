/*
 * XML Type:  exception-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ExceptionMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML exception-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ExceptionMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ExceptionMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ExceptionMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPTIONTYPE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "exception-type");
    private static final javax.xml.namespace.QName WSDLMESSAGE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message");
    private static final javax.xml.namespace.QName WSDLMESSAGEPARTNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message-part-name");
    private static final javax.xml.namespace.QName CONSTRUCTORPARAMETERORDER$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "constructor-parameter-order");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "exception-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(EXCEPTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exception-type" element
     */
    public void setExceptionType(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType exceptionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(EXCEPTIONTYPE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(EXCEPTIONTYPE$0);
            }
            target.set(exceptionType);
        }
    }
    
    /**
     * Appends and returns a new empty "exception-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(EXCEPTIONTYPE$0);
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
     * Gets the "constructor-parameter-order" element
     */
    public com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType getConstructorParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType)get_store().find_element_user(CONSTRUCTORPARAMETERORDER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "constructor-parameter-order" element
     */
    public boolean isSetConstructorParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRUCTORPARAMETERORDER$6) != 0;
        }
    }
    
    /**
     * Sets the "constructor-parameter-order" element
     */
    public void setConstructorParameterOrder(com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType constructorParameterOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType)get_store().find_element_user(CONSTRUCTORPARAMETERORDER$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType)get_store().add_element_user(CONSTRUCTORPARAMETERORDER$6);
            }
            target.set(constructorParameterOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "constructor-parameter-order" element
     */
    public com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType addNewConstructorParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ConstructorParameterOrderType)get_store().add_element_user(CONSTRUCTORPARAMETERORDER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "constructor-parameter-order" element
     */
    public void unsetConstructorParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRUCTORPARAMETERORDER$6, 0);
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
