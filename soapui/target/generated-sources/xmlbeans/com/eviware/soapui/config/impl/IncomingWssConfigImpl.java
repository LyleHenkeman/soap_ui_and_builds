/*
 * XML Type:  IncomingWss
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.IncomingWssConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML IncomingWss(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class IncomingWssConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.IncomingWssConfig
{
    private static final long serialVersionUID = 1L;
    
    public IncomingWssConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName DECRYPTCRYPTO$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "decryptCrypto");
    private static final javax.xml.namespace.QName SIGNATURECRYPTO$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "signatureCrypto");
    private static final javax.xml.namespace.QName DECRYPTPASSWORD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "decryptPassword");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "decryptCrypto" element
     */
    public java.lang.String getDecryptCrypto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECRYPTCRYPTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decryptCrypto" element
     */
    public org.apache.xmlbeans.XmlString xgetDecryptCrypto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECRYPTCRYPTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "decryptCrypto" element
     */
    public void setDecryptCrypto(java.lang.String decryptCrypto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECRYPTCRYPTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECRYPTCRYPTO$2);
            }
            target.setStringValue(decryptCrypto);
        }
    }
    
    /**
     * Sets (as xml) the "decryptCrypto" element
     */
    public void xsetDecryptCrypto(org.apache.xmlbeans.XmlString decryptCrypto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECRYPTCRYPTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECRYPTCRYPTO$2);
            }
            target.set(decryptCrypto);
        }
    }
    
    /**
     * Gets the "signatureCrypto" element
     */
    public java.lang.String getSignatureCrypto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURECRYPTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "signatureCrypto" element
     */
    public org.apache.xmlbeans.XmlString xgetSignatureCrypto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURECRYPTO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "signatureCrypto" element
     */
    public void setSignatureCrypto(java.lang.String signatureCrypto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURECRYPTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURECRYPTO$4);
            }
            target.setStringValue(signatureCrypto);
        }
    }
    
    /**
     * Sets (as xml) the "signatureCrypto" element
     */
    public void xsetSignatureCrypto(org.apache.xmlbeans.XmlString signatureCrypto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURECRYPTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATURECRYPTO$4);
            }
            target.set(signatureCrypto);
        }
    }
    
    /**
     * Gets the "decryptPassword" element
     */
    public java.lang.String getDecryptPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECRYPTPASSWORD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decryptPassword" element
     */
    public org.apache.xmlbeans.XmlString xgetDecryptPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECRYPTPASSWORD$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "decryptPassword" element
     */
    public void setDecryptPassword(java.lang.String decryptPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECRYPTPASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECRYPTPASSWORD$6);
            }
            target.setStringValue(decryptPassword);
        }
    }
    
    /**
     * Sets (as xml) the "decryptPassword" element
     */
    public void xsetDecryptPassword(org.apache.xmlbeans.XmlString decryptPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECRYPTPASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECRYPTPASSWORD$6);
            }
            target.set(decryptPassword);
        }
    }
}
