/*
 * XML Type:  TestOnDemandUploadBody
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandUploadBodyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandUploadBody(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestOnDemandUploadBodyConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandUploadBodyConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandUploadBodyConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMAND$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Command");
    private static final javax.xml.namespace.QName TXN$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Txn");
    private static final javax.xml.namespace.QName KEYSTORE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Keystore");
    
    
    /**
     * Gets the "Command" element
     */
    public com.eviware.soapui.config.TestOnDemandCommandConfig getCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().find_element_user(COMMAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Command" element
     */
    public void setCommand(com.eviware.soapui.config.TestOnDemandCommandConfig command)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().find_element_user(COMMAND$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().add_element_user(COMMAND$0);
            }
            target.set(command);
        }
    }
    
    /**
     * Appends and returns a new empty "Command" element
     */
    public com.eviware.soapui.config.TestOnDemandCommandConfig addNewCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().add_element_user(COMMAND$0);
            return target;
        }
    }
    
    /**
     * Gets the "Txn" element
     */
    public com.eviware.soapui.config.TestOnDemandTxnConfig getTxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTxnConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTxnConfig)get_store().find_element_user(TXN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Txn" element
     */
    public void setTxn(com.eviware.soapui.config.TestOnDemandTxnConfig txn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTxnConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTxnConfig)get_store().find_element_user(TXN$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandTxnConfig)get_store().add_element_user(TXN$2);
            }
            target.set(txn);
        }
    }
    
    /**
     * Appends and returns a new empty "Txn" element
     */
    public com.eviware.soapui.config.TestOnDemandTxnConfig addNewTxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTxnConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTxnConfig)get_store().add_element_user(TXN$2);
            return target;
        }
    }
    
    /**
     * Gets the "Keystore" element
     */
    public com.eviware.soapui.config.TestOnDemandKeystoreConfig getKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystoreConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystoreConfig)get_store().find_element_user(KEYSTORE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Keystore" element
     */
    public void setKeystore(com.eviware.soapui.config.TestOnDemandKeystoreConfig keystore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystoreConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystoreConfig)get_store().find_element_user(KEYSTORE$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandKeystoreConfig)get_store().add_element_user(KEYSTORE$4);
            }
            target.set(keystore);
        }
    }
    
    /**
     * Appends and returns a new empty "Keystore" element
     */
    public com.eviware.soapui.config.TestOnDemandKeystoreConfig addNewKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandKeystoreConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandKeystoreConfig)get_store().add_element_user(KEYSTORE$4);
            return target;
        }
    }
}
