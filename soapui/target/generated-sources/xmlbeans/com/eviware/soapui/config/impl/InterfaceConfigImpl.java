/*
 * XML Type:  Interface
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.InterfaceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Interface(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class InterfaceConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.InterfaceConfig
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONCACHE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "definitionCache");
    private static final javax.xml.namespace.QName ENDPOINTS$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoints");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "definitionCache" element
     */
    public com.eviware.soapui.config.DefinitionCacheConfig getDefinitionCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefinitionCacheConfig target = null;
            target = (com.eviware.soapui.config.DefinitionCacheConfig)get_store().find_element_user(DEFINITIONCACHE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "definitionCache" element
     */
    public boolean isSetDefinitionCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITIONCACHE$0) != 0;
        }
    }
    
    /**
     * Sets the "definitionCache" element
     */
    public void setDefinitionCache(com.eviware.soapui.config.DefinitionCacheConfig definitionCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefinitionCacheConfig target = null;
            target = (com.eviware.soapui.config.DefinitionCacheConfig)get_store().find_element_user(DEFINITIONCACHE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DefinitionCacheConfig)get_store().add_element_user(DEFINITIONCACHE$0);
            }
            target.set(definitionCache);
        }
    }
    
    /**
     * Appends and returns a new empty "definitionCache" element
     */
    public com.eviware.soapui.config.DefinitionCacheConfig addNewDefinitionCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefinitionCacheConfig target = null;
            target = (com.eviware.soapui.config.DefinitionCacheConfig)get_store().add_element_user(DEFINITIONCACHE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "definitionCache" element
     */
    public void unsetDefinitionCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITIONCACHE$0, 0);
        }
    }
    
    /**
     * Gets the "endpoints" element
     */
    public com.eviware.soapui.config.EndpointsConfig getEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointsConfig target = null;
            target = (com.eviware.soapui.config.EndpointsConfig)get_store().find_element_user(ENDPOINTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endpoints" element
     */
    public void setEndpoints(com.eviware.soapui.config.EndpointsConfig endpoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointsConfig target = null;
            target = (com.eviware.soapui.config.EndpointsConfig)get_store().find_element_user(ENDPOINTS$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.EndpointsConfig)get_store().add_element_user(ENDPOINTS$2);
            }
            target.set(endpoints);
        }
    }
    
    /**
     * Appends and returns a new empty "endpoints" element
     */
    public com.eviware.soapui.config.EndpointsConfig addNewEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointsConfig target = null;
            target = (com.eviware.soapui.config.EndpointsConfig)get_store().add_element_user(ENDPOINTS$2);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
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
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
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
            get_store().remove_attribute(TYPE$4);
        }
    }
}
