/*
 * XML Type:  TestOnDemandKeystore
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandKeystoreConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandKeystore(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestOnDemandKeystoreConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandKeystoreConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandKeystoreConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "File");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Password");
    
    
    /**
     * Gets the "File" element
     */
    public com.eviware.soapui.config.TestOnDemandFileConfig getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandFileConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandFileConfig)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "File" element
     */
    public void setFile(com.eviware.soapui.config.TestOnDemandFileConfig file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandFileConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandFileConfig)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandFileConfig)get_store().add_element_user(FILE$0);
            }
            target.set(file);
        }
    }
    
    /**
     * Appends and returns a new empty "File" element
     */
    public com.eviware.soapui.config.TestOnDemandFileConfig addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandFileConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandFileConfig)get_store().add_element_user(FILE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Password" element
     */
    public com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Password" element
     */
    public void setPassword(com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig)get_store().add_element_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Appends and returns a new empty "Password" element
     */
    public com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig addNewPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystorePasswordConfig)get_store().add_element_user(PASSWORD$2);
            return target;
        }
    }
}
