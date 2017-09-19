/*
 * XML Type:  GroovySecurityCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.GroovySecurityCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML GroovySecurityCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class GroovySecurityCheckConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.GroovySecurityCheckConfig
{
    private static final long serialVersionUID = 1L;
    
    public GroovySecurityCheckConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTESCRIPT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "executeScript");
    
    
    /**
     * Gets the "executeScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getExecuteScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(EXECUTESCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "executeScript" element
     */
    public void setExecuteScript(com.eviware.soapui.config.ScriptConfig executeScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(EXECUTESCRIPT$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(EXECUTESCRIPT$0);
            }
            target.set(executeScript);
        }
    }
    
    /**
     * Appends and returns a new empty "executeScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewExecuteScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(EXECUTESCRIPT$0);
            return target;
        }
    }
}
