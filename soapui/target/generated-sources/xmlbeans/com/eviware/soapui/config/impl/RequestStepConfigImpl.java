/*
 * XML Type:  RequestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RequestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RequestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RequestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RequestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public RequestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interface");
    private static final javax.xml.namespace.QName OPERATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    private static final javax.xml.namespace.QName REQUEST$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "request");
    
    
    /**
     * Gets the "interface" element
     */
    public java.lang.String getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interface" element
     */
    public org.apache.xmlbeans.XmlString xgetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(java.lang.String xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACE$0);
            }
            target.setStringValue(xinterface);
        }
    }
    
    /**
     * Sets (as xml) the "interface" element
     */
    public void xsetInterface(org.apache.xmlbeans.XmlString xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERFACE$0);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Gets the "operation" element
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operation" element
     */
    public org.apache.xmlbeans.XmlString xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$2);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "operation" element
     */
    public void xsetOperation(org.apache.xmlbeans.XmlString operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$2);
            }
            target.set(operation);
        }
    }
    
    /**
     * Gets the "request" element
     */
    public com.eviware.soapui.config.WsdlRequestConfig getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().find_element_user(REQUEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(com.eviware.soapui.config.WsdlRequestConfig request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().find_element_user(REQUEST$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().add_element_user(REQUEST$4);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public com.eviware.soapui.config.WsdlRequestConfig addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().add_element_user(REQUEST$4);
            return target;
        }
    }
}
