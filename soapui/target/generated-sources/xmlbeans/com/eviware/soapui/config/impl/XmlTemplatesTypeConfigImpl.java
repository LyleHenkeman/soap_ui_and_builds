/*
 * XML Type:  XmlTemplatesType
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.XmlTemplatesTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML XmlTemplatesType(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class XmlTemplatesTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.XmlTemplatesTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public XmlTemplatesTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "property");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "scope");
    private static final javax.xml.namespace.QName PATH$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "path");
    
    
    /**
     * Gets the "property" element
     */
    public com.eviware.soapui.config.PropertyConfig getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(com.eviware.soapui.config.PropertyConfig property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertyConfig)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public com.eviware.soapui.config.PropertyConfig addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyConfig target = null;
            target = (com.eviware.soapui.config.PropertyConfig)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public com.eviware.soapui.config.ScopeTypeConfig.Enum getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ScopeTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public com.eviware.soapui.config.ScopeTypeConfig xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScopeTypeConfig target = null;
            target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().find_element_user(SCOPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(com.eviware.soapui.config.ScopeTypeConfig.Enum scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$2);
            }
            target.setEnumValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(com.eviware.soapui.config.ScopeTypeConfig scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScopeTypeConfig target = null;
            target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().find_element_user(SCOPE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().add_element_user(SCOPE$2);
            }
            target.set(scope);
        }
    }
    
    /**
     * Gets the "path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$4);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$4);
            }
            target.set(path);
        }
    }
}
