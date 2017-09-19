/*
 * XML Type:  BaseMockService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML BaseMockService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class BaseMockServiceConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.BaseMockServiceConfig
{
    private static final long serialVersionUID = 1L;
    
    public BaseMockServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTSCRIPT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "startScript");
    private static final javax.xml.namespace.QName STOPSCRIPT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "stopScript");
    private static final javax.xml.namespace.QName PROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName ONREQUESTSCRIPT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "onRequestScript");
    private static final javax.xml.namespace.QName AFTERREQUESTSCRIPT$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "afterRequestScript");
    private static final javax.xml.namespace.QName PORT$10 = 
        new javax.xml.namespace.QName("", "port");
    private static final javax.xml.namespace.QName HOST$12 = 
        new javax.xml.namespace.QName("", "host");
    private static final javax.xml.namespace.QName BINDTOHOSTONLY$14 = 
        new javax.xml.namespace.QName("", "bindToHostOnly");
    private static final javax.xml.namespace.QName PATH$16 = 
        new javax.xml.namespace.QName("", "path");
    private static final javax.xml.namespace.QName DOCROOT$18 = 
        new javax.xml.namespace.QName("", "docroot");
    private static final javax.xml.namespace.QName FAULTMOCKOPERATION$20 = 
        new javax.xml.namespace.QName("", "faultMockOperation");
    private static final javax.xml.namespace.QName DISPATCHRESPONSEMESSAGES$22 = 
        new javax.xml.namespace.QName("", "dispatchResponseMessages");
    
    
    /**
     * Gets the "startScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getStartScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(STARTSCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "startScript" element
     */
    public boolean isSetStartScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTSCRIPT$0) != 0;
        }
    }
    
    /**
     * Sets the "startScript" element
     */
    public void setStartScript(com.eviware.soapui.config.ScriptConfig startScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(STARTSCRIPT$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(STARTSCRIPT$0);
            }
            target.set(startScript);
        }
    }
    
    /**
     * Appends and returns a new empty "startScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewStartScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(STARTSCRIPT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "startScript" element
     */
    public void unsetStartScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTSCRIPT$0, 0);
        }
    }
    
    /**
     * Gets the "stopScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getStopScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(STOPSCRIPT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stopScript" element
     */
    public boolean isSetStopScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOPSCRIPT$2) != 0;
        }
    }
    
    /**
     * Sets the "stopScript" element
     */
    public void setStopScript(com.eviware.soapui.config.ScriptConfig stopScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(STOPSCRIPT$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(STOPSCRIPT$2);
            }
            target.set(stopScript);
        }
    }
    
    /**
     * Appends and returns a new empty "stopScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewStopScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(STOPSCRIPT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "stopScript" element
     */
    public void unsetStopScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOPSCRIPT$2, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$4) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$4, 0);
        }
    }
    
    /**
     * Gets the "onRequestScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getOnRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(ONREQUESTSCRIPT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onRequestScript" element
     */
    public boolean isSetOnRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONREQUESTSCRIPT$6) != 0;
        }
    }
    
    /**
     * Sets the "onRequestScript" element
     */
    public void setOnRequestScript(com.eviware.soapui.config.ScriptConfig onRequestScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(ONREQUESTSCRIPT$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(ONREQUESTSCRIPT$6);
            }
            target.set(onRequestScript);
        }
    }
    
    /**
     * Appends and returns a new empty "onRequestScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewOnRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(ONREQUESTSCRIPT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "onRequestScript" element
     */
    public void unsetOnRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONREQUESTSCRIPT$6, 0);
        }
    }
    
    /**
     * Gets the "afterRequestScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getAfterRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERREQUESTSCRIPT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "afterRequestScript" element
     */
    public boolean isSetAfterRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFTERREQUESTSCRIPT$8) != 0;
        }
    }
    
    /**
     * Sets the "afterRequestScript" element
     */
    public void setAfterRequestScript(com.eviware.soapui.config.ScriptConfig afterRequestScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(AFTERREQUESTSCRIPT$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERREQUESTSCRIPT$8);
            }
            target.set(afterRequestScript);
        }
    }
    
    /**
     * Appends and returns a new empty "afterRequestScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewAfterRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(AFTERREQUESTSCRIPT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "afterRequestScript" element
     */
    public void unsetAfterRequestScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFTERREQUESTSCRIPT$8, 0);
        }
    }
    
    /**
     * Gets the "port" attribute
     */
    public int getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "port" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PORT$10);
            return target;
        }
    }
    
    /**
     * True if has "port" attribute
     */
    public boolean isSetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PORT$10) != null;
        }
    }
    
    /**
     * Sets the "port" attribute
     */
    public void setPort(int port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PORT$10);
            }
            target.setIntValue(port);
        }
    }
    
    /**
     * Sets (as xml) the "port" attribute
     */
    public void xsetPort(org.apache.xmlbeans.XmlInt port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PORT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PORT$10);
            }
            target.set(port);
        }
    }
    
    /**
     * Unsets the "port" attribute
     */
    public void unsetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PORT$10);
        }
    }
    
    /**
     * Gets the "host" attribute
     */
    public java.lang.String getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "host" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$12);
            return target;
        }
    }
    
    /**
     * True if has "host" attribute
     */
    public boolean isSetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HOST$12) != null;
        }
    }
    
    /**
     * Sets the "host" attribute
     */
    public void setHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$12);
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) the "host" attribute
     */
    public void xsetHost(org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$12);
            }
            target.set(host);
        }
    }
    
    /**
     * Unsets the "host" attribute
     */
    public void unsetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HOST$12);
        }
    }
    
    /**
     * Gets the "bindToHostOnly" attribute
     */
    public boolean getBindToHostOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDTOHOSTONLY$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bindToHostOnly" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBindToHostOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BINDTOHOSTONLY$14);
            return target;
        }
    }
    
    /**
     * True if has "bindToHostOnly" attribute
     */
    public boolean isSetBindToHostOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BINDTOHOSTONLY$14) != null;
        }
    }
    
    /**
     * Sets the "bindToHostOnly" attribute
     */
    public void setBindToHostOnly(boolean bindToHostOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDTOHOSTONLY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDTOHOSTONLY$14);
            }
            target.setBooleanValue(bindToHostOnly);
        }
    }
    
    /**
     * Sets (as xml) the "bindToHostOnly" attribute
     */
    public void xsetBindToHostOnly(org.apache.xmlbeans.XmlBoolean bindToHostOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BINDTOHOSTONLY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BINDTOHOSTONLY$14);
            }
            target.set(bindToHostOnly);
        }
    }
    
    /**
     * Unsets the "bindToHostOnly" attribute
     */
    public void unsetBindToHostOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BINDTOHOSTONLY$14);
        }
    }
    
    /**
     * Gets the "path" attribute
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$16);
            return target;
        }
    }
    
    /**
     * True if has "path" attribute
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATH$16) != null;
        }
    }
    
    /**
     * Sets the "path" attribute
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$16);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" attribute
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$16);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "path" attribute
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATH$16);
        }
    }
    
    /**
     * Gets the "docroot" attribute
     */
    public java.lang.String getDocroot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCROOT$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "docroot" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDocroot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCROOT$18);
            return target;
        }
    }
    
    /**
     * True if has "docroot" attribute
     */
    public boolean isSetDocroot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOCROOT$18) != null;
        }
    }
    
    /**
     * Sets the "docroot" attribute
     */
    public void setDocroot(java.lang.String docroot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCROOT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCROOT$18);
            }
            target.setStringValue(docroot);
        }
    }
    
    /**
     * Sets (as xml) the "docroot" attribute
     */
    public void xsetDocroot(org.apache.xmlbeans.XmlString docroot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCROOT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCROOT$18);
            }
            target.set(docroot);
        }
    }
    
    /**
     * Unsets the "docroot" attribute
     */
    public void unsetDocroot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOCROOT$18);
        }
    }
    
    /**
     * Gets the "faultMockOperation" attribute
     */
    public java.lang.String getFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTMOCKOPERATION$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultMockOperation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTMOCKOPERATION$20);
            return target;
        }
    }
    
    /**
     * True if has "faultMockOperation" attribute
     */
    public boolean isSetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAULTMOCKOPERATION$20) != null;
        }
    }
    
    /**
     * Sets the "faultMockOperation" attribute
     */
    public void setFaultMockOperation(java.lang.String faultMockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTMOCKOPERATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAULTMOCKOPERATION$20);
            }
            target.setStringValue(faultMockOperation);
        }
    }
    
    /**
     * Sets (as xml) the "faultMockOperation" attribute
     */
    public void xsetFaultMockOperation(org.apache.xmlbeans.XmlString faultMockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTMOCKOPERATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAULTMOCKOPERATION$20);
            }
            target.set(faultMockOperation);
        }
    }
    
    /**
     * Unsets the "faultMockOperation" attribute
     */
    public void unsetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAULTMOCKOPERATION$20);
        }
    }
    
    /**
     * Gets the "dispatchResponseMessages" attribute
     */
    public boolean getDispatchResponseMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dispatchResponseMessages" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDispatchResponseMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            return target;
        }
    }
    
    /**
     * True if has "dispatchResponseMessages" attribute
     */
    public boolean isSetDispatchResponseMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPATCHRESPONSEMESSAGES$22) != null;
        }
    }
    
    /**
     * Sets the "dispatchResponseMessages" attribute
     */
    public void setDispatchResponseMessages(boolean dispatchResponseMessages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            }
            target.setBooleanValue(dispatchResponseMessages);
        }
    }
    
    /**
     * Sets (as xml) the "dispatchResponseMessages" attribute
     */
    public void xsetDispatchResponseMessages(org.apache.xmlbeans.XmlBoolean dispatchResponseMessages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISPATCHRESPONSEMESSAGES$22);
            }
            target.set(dispatchResponseMessages);
        }
    }
    
    /**
     * Unsets the "dispatchResponseMessages" attribute
     */
    public void unsetDispatchResponseMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPATCHRESPONSEMESSAGES$22);
        }
    }
}
