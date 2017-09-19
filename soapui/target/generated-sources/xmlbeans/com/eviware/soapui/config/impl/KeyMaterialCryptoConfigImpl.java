/*
 * XML Type:  KeyMaterialCrypto
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.KeyMaterialCryptoConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML KeyMaterialCrypto(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class KeyMaterialCryptoConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.KeyMaterialCryptoConfig
{
    private static final long serialVersionUID = 1L;
    
    public KeyMaterialCryptoConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "source");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "password");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "type");
    private static final javax.xml.namespace.QName DEFAULTALIAS$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "defaultAlias");
    private static final javax.xml.namespace.QName ALIASPASSWORD$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "aliasPassword");
    private static final javax.xml.namespace.QName CRYPTOPROVIDER$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "cryptoProvider");
    
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "defaultAlias" element
     */
    public java.lang.String getDefaultAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTALIAS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultAlias" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTALIAS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultAlias" element
     */
    public boolean isSetDefaultAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTALIAS$6) != 0;
        }
    }
    
    /**
     * Sets the "defaultAlias" element
     */
    public void setDefaultAlias(java.lang.String defaultAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTALIAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTALIAS$6);
            }
            target.setStringValue(defaultAlias);
        }
    }
    
    /**
     * Sets (as xml) the "defaultAlias" element
     */
    public void xsetDefaultAlias(org.apache.xmlbeans.XmlString defaultAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTALIAS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTALIAS$6);
            }
            target.set(defaultAlias);
        }
    }
    
    /**
     * Unsets the "defaultAlias" element
     */
    public void unsetDefaultAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTALIAS$6, 0);
        }
    }
    
    /**
     * Gets the "aliasPassword" element
     */
    public java.lang.String getAliasPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIASPASSWORD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "aliasPassword" element
     */
    public org.apache.xmlbeans.XmlString xgetAliasPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIASPASSWORD$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "aliasPassword" element
     */
    public boolean isSetAliasPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIASPASSWORD$8) != 0;
        }
    }
    
    /**
     * Sets the "aliasPassword" element
     */
    public void setAliasPassword(java.lang.String aliasPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIASPASSWORD$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIASPASSWORD$8);
            }
            target.setStringValue(aliasPassword);
        }
    }
    
    /**
     * Sets (as xml) the "aliasPassword" element
     */
    public void xsetAliasPassword(org.apache.xmlbeans.XmlString aliasPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIASPASSWORD$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALIASPASSWORD$8);
            }
            target.set(aliasPassword);
        }
    }
    
    /**
     * Unsets the "aliasPassword" element
     */
    public void unsetAliasPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIASPASSWORD$8, 0);
        }
    }
    
    /**
     * Gets the "cryptoProvider" element
     */
    public java.lang.String getCryptoProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRYPTOPROVIDER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptoProvider" element
     */
    public org.apache.xmlbeans.XmlString xgetCryptoProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRYPTOPROVIDER$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "cryptoProvider" element
     */
    public boolean isSetCryptoProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRYPTOPROVIDER$10) != 0;
        }
    }
    
    /**
     * Sets the "cryptoProvider" element
     */
    public void setCryptoProvider(java.lang.String cryptoProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRYPTOPROVIDER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRYPTOPROVIDER$10);
            }
            target.setStringValue(cryptoProvider);
        }
    }
    
    /**
     * Sets (as xml) the "cryptoProvider" element
     */
    public void xsetCryptoProvider(org.apache.xmlbeans.XmlString cryptoProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRYPTOPROVIDER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRYPTOPROVIDER$10);
            }
            target.set(cryptoProvider);
        }
    }
    
    /**
     * Unsets the "cryptoProvider" element
     */
    public void unsetCryptoProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRYPTOPROVIDER$10, 0);
        }
    }
}
