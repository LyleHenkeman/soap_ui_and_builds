/*
 * XML Type:  Service
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Service(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ServiceConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ServiceConfig
{
    private static final long serialVersionUID = 1L;
    
    public ServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACEID$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interfaceId");
    private static final javax.xml.namespace.QName ENDPOINT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "interfaceId" element
     */
    public java.lang.String getInterfaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interfaceId" element
     */
    public org.apache.xmlbeans.XmlString xgetInterfaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interfaceId" element
     */
    public void setInterfaceId(java.lang.String interfaceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACEID$0);
            }
            target.setStringValue(interfaceId);
        }
    }
    
    /**
     * Sets (as xml) the "interfaceId" element
     */
    public void xsetInterfaceId(org.apache.xmlbeans.XmlString interfaceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERFACEID$0);
            }
            target.set(interfaceId);
        }
    }
    
    /**
     * Gets the "endpoint" element
     */
    public com.eviware.soapui.config.EnvironmentEndpointConfig getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentEndpointConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentEndpointConfig)get_store().find_element_user(ENDPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endpoint" element
     */
    public boolean isSetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$2) != 0;
        }
    }
    
    /**
     * Sets the "endpoint" element
     */
    public void setEndpoint(com.eviware.soapui.config.EnvironmentEndpointConfig endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentEndpointConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentEndpointConfig)get_store().find_element_user(ENDPOINT$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.EnvironmentEndpointConfig)get_store().add_element_user(ENDPOINT$2);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Appends and returns a new empty "endpoint" element
     */
    public com.eviware.soapui.config.EnvironmentEndpointConfig addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EnvironmentEndpointConfig target = null;
            target = (com.eviware.soapui.config.EnvironmentEndpointConfig)get_store().add_element_user(ENDPOINT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "endpoint" element
     */
    public void unsetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$2, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$4) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public com.eviware.soapui.config.ServiceConfig.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ServiceConfig.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public com.eviware.soapui.config.ServiceConfig.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig.Type target = null;
            target = (com.eviware.soapui.config.ServiceConfig.Type)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(com.eviware.soapui.config.ServiceConfig.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(com.eviware.soapui.config.ServiceConfig.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ServiceConfig.Type target = null;
            target = (com.eviware.soapui.config.ServiceConfig.Type)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ServiceConfig.Type)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$6);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.ServiceConfig$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.ServiceConfig.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
