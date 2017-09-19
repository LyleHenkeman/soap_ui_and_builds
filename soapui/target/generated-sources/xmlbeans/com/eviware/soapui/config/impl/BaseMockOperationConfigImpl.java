/*
 * XML Type:  BaseMockOperation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockOperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML BaseMockOperation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class BaseMockOperationConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.BaseMockOperationConfig
{
    private static final long serialVersionUID = 1L;
    
    public BaseMockOperationConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "defaultResponse");
    private static final javax.xml.namespace.QName DISPATCHSTYLE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dispatchStyle");
    private static final javax.xml.namespace.QName DISPATCHPATH$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dispatchPath");
    
    
    /**
     * Gets the "defaultResponse" element
     */
    public java.lang.String getDefaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultResponse" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTRESPONSE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultResponse" element
     */
    public boolean isSetDefaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "defaultResponse" element
     */
    public void setDefaultResponse(java.lang.String defaultResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTRESPONSE$0);
            }
            target.setStringValue(defaultResponse);
        }
    }
    
    /**
     * Sets (as xml) the "defaultResponse" element
     */
    public void xsetDefaultResponse(org.apache.xmlbeans.XmlString defaultResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTRESPONSE$0);
            }
            target.set(defaultResponse);
        }
    }
    
    /**
     * Unsets the "defaultResponse" element
     */
    public void unsetDefaultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTRESPONSE$0, 0);
        }
    }
    
    /**
     * Gets the "dispatchStyle" element
     */
    public com.eviware.soapui.config.MockOperationDispatchStyleConfig.Enum getDispatchStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPATCHSTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.MockOperationDispatchStyleConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dispatchStyle" element
     */
    public com.eviware.soapui.config.MockOperationDispatchStyleConfig xgetDispatchStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationDispatchStyleConfig target = null;
            target = (com.eviware.soapui.config.MockOperationDispatchStyleConfig)get_store().find_element_user(DISPATCHSTYLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dispatchStyle" element
     */
    public boolean isSetDispatchStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPATCHSTYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "dispatchStyle" element
     */
    public void setDispatchStyle(com.eviware.soapui.config.MockOperationDispatchStyleConfig.Enum dispatchStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPATCHSTYLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPATCHSTYLE$2);
            }
            target.setEnumValue(dispatchStyle);
        }
    }
    
    /**
     * Sets (as xml) the "dispatchStyle" element
     */
    public void xsetDispatchStyle(com.eviware.soapui.config.MockOperationDispatchStyleConfig dispatchStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationDispatchStyleConfig target = null;
            target = (com.eviware.soapui.config.MockOperationDispatchStyleConfig)get_store().find_element_user(DISPATCHSTYLE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MockOperationDispatchStyleConfig)get_store().add_element_user(DISPATCHSTYLE$2);
            }
            target.set(dispatchStyle);
        }
    }
    
    /**
     * Unsets the "dispatchStyle" element
     */
    public void unsetDispatchStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPATCHSTYLE$2, 0);
        }
    }
    
    /**
     * Gets the "dispatchPath" element
     */
    public java.lang.String getDispatchPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPATCHPATH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dispatchPath" element
     */
    public org.apache.xmlbeans.XmlString xgetDispatchPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPATCHPATH$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dispatchPath" element
     */
    public boolean isSetDispatchPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPATCHPATH$4) != 0;
        }
    }
    
    /**
     * Sets the "dispatchPath" element
     */
    public void setDispatchPath(java.lang.String dispatchPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPATCHPATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPATCHPATH$4);
            }
            target.setStringValue(dispatchPath);
        }
    }
    
    /**
     * Sets (as xml) the "dispatchPath" element
     */
    public void xsetDispatchPath(org.apache.xmlbeans.XmlString dispatchPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPATCHPATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPATCHPATH$4);
            }
            target.set(dispatchPath);
        }
    }
    
    /**
     * Unsets the "dispatchPath" element
     */
    public void unsetDispatchPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPATCHPATH$4, 0);
        }
    }
}
