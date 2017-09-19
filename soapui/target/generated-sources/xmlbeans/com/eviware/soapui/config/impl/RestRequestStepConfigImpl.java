/*
 * XML Type:  RestRequestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestRequestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestRequestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestRequestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RestRequestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestRequestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTREQUEST$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "restRequest");
    private static final javax.xml.namespace.QName SERVICE$2 = 
        new javax.xml.namespace.QName("", "service");
    private static final javax.xml.namespace.QName RESOURCEPATH$4 = 
        new javax.xml.namespace.QName("", "resourcePath");
    private static final javax.xml.namespace.QName METHODNAME$6 = 
        new javax.xml.namespace.QName("", "methodName");
    
    
    /**
     * Gets the "restRequest" element
     */
    public com.eviware.soapui.config.RestRequestConfig getRestRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().find_element_user(RESTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restRequest" element
     */
    public void setRestRequest(com.eviware.soapui.config.RestRequestConfig restRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().find_element_user(RESTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestRequestConfig)get_store().add_element_user(RESTREQUEST$0);
            }
            target.set(restRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "restRequest" element
     */
    public com.eviware.soapui.config.RestRequestConfig addNewRestRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().add_element_user(RESTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Gets the "service" attribute
     */
    public java.lang.String getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "service" attribute
     */
    public org.apache.xmlbeans.XmlString xgetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICE$2);
            return target;
        }
    }
    
    /**
     * True if has "service" attribute
     */
    public boolean isSetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVICE$2) != null;
        }
    }
    
    /**
     * Sets the "service" attribute
     */
    public void setService(java.lang.String service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE$2);
            }
            target.setStringValue(service);
        }
    }
    
    /**
     * Sets (as xml) the "service" attribute
     */
    public void xsetService(org.apache.xmlbeans.XmlString service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICE$2);
            }
            target.set(service);
        }
    }
    
    /**
     * Unsets the "service" attribute
     */
    public void unsetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVICE$2);
        }
    }
    
    /**
     * Gets the "resourcePath" attribute
     */
    public java.lang.String getResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEPATH$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourcePath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEPATH$4);
            return target;
        }
    }
    
    /**
     * True if has "resourcePath" attribute
     */
    public boolean isSetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESOURCEPATH$4) != null;
        }
    }
    
    /**
     * Sets the "resourcePath" attribute
     */
    public void setResourcePath(java.lang.String resourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEPATH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCEPATH$4);
            }
            target.setStringValue(resourcePath);
        }
    }
    
    /**
     * Sets (as xml) the "resourcePath" attribute
     */
    public void xsetResourcePath(org.apache.xmlbeans.XmlString resourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEPATH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCEPATH$4);
            }
            target.set(resourcePath);
        }
    }
    
    /**
     * Unsets the "resourcePath" attribute
     */
    public void unsetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESOURCEPATH$4);
        }
    }
    
    /**
     * Gets the "methodName" attribute
     */
    public java.lang.String getMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "methodName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "methodName" attribute
     */
    public boolean isSetMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHODNAME$6) != null;
        }
    }
    
    /**
     * Sets the "methodName" attribute
     */
    public void setMethodName(java.lang.String methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHODNAME$6);
            }
            target.setStringValue(methodName);
        }
    }
    
    /**
     * Sets (as xml) the "methodName" attribute
     */
    public void xsetMethodName(org.apache.xmlbeans.XmlString methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHODNAME$6);
            }
            target.set(methodName);
        }
    }
    
    /**
     * Unsets the "methodName" attribute
     */
    public void unsetMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHODNAME$6);
        }
    }
}
