/*
 * XML Type:  Settings
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SettingsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Settings(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SettingsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SettingsConfig
{
    private static final long serialVersionUID = 1L;
    
    public SettingsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTING$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "setting");
    private static final javax.xml.namespace.QName ENCRYPTEDCONTENT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "encryptedContent");
    private static final javax.xml.namespace.QName ENCRYPTEDCONTENTALGORITHM$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "encryptedContentAlgorithm");
    
    
    /**
     * Gets a List of "setting" elements
     */
    public java.util.List<com.eviware.soapui.config.SettingConfig> getSettingList()
    {
        final class SettingList extends java.util.AbstractList<com.eviware.soapui.config.SettingConfig>
        {
            public com.eviware.soapui.config.SettingConfig get(int i)
                { return SettingsConfigImpl.this.getSettingArray(i); }
            
            public com.eviware.soapui.config.SettingConfig set(int i, com.eviware.soapui.config.SettingConfig o)
            {
                com.eviware.soapui.config.SettingConfig old = SettingsConfigImpl.this.getSettingArray(i);
                SettingsConfigImpl.this.setSettingArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SettingConfig o)
                { SettingsConfigImpl.this.insertNewSetting(i).set(o); }
            
            public com.eviware.soapui.config.SettingConfig remove(int i)
            {
                com.eviware.soapui.config.SettingConfig old = SettingsConfigImpl.this.getSettingArray(i);
                SettingsConfigImpl.this.removeSetting(i);
                return old;
            }
            
            public int size()
                { return SettingsConfigImpl.this.sizeOfSettingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SettingList();
        }
    }
    
    /**
     * Gets array of all "setting" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SettingConfig[] getSettingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SettingConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SettingConfig>();
            get_store().find_all_element_users(SETTING$0, targetList);
            com.eviware.soapui.config.SettingConfig[] result = new com.eviware.soapui.config.SettingConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "setting" element
     */
    public com.eviware.soapui.config.SettingConfig getSettingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingConfig target = null;
            target = (com.eviware.soapui.config.SettingConfig)get_store().find_element_user(SETTING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "setting" element
     */
    public int sizeOfSettingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETTING$0);
        }
    }
    
    /**
     * Sets array of all "setting" element
     */
    public void setSettingArray(com.eviware.soapui.config.SettingConfig[] settingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(settingArray, SETTING$0);
        }
    }
    
    /**
     * Sets ith "setting" element
     */
    public void setSettingArray(int i, com.eviware.soapui.config.SettingConfig setting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingConfig target = null;
            target = (com.eviware.soapui.config.SettingConfig)get_store().find_element_user(SETTING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(setting);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setting" element
     */
    public com.eviware.soapui.config.SettingConfig insertNewSetting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingConfig target = null;
            target = (com.eviware.soapui.config.SettingConfig)get_store().insert_element_user(SETTING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setting" element
     */
    public com.eviware.soapui.config.SettingConfig addNewSetting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingConfig target = null;
            target = (com.eviware.soapui.config.SettingConfig)get_store().add_element_user(SETTING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "setting" element
     */
    public void removeSetting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETTING$0, i);
        }
    }
    
    /**
     * Gets the "encryptedContent" element
     */
    public byte[] getEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedContent" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ENCRYPTEDCONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "encryptedContent" element
     */
    public boolean isSetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDCONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "encryptedContent" element
     */
    public void setEncryptedContent(byte[] encryptedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTEDCONTENT$2);
            }
            target.setByteArrayValue(encryptedContent);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedContent" element
     */
    public void xsetEncryptedContent(org.apache.xmlbeans.XmlBase64Binary encryptedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ENCRYPTEDCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(ENCRYPTEDCONTENT$2);
            }
            target.set(encryptedContent);
        }
    }
    
    /**
     * Unsets the "encryptedContent" element
     */
    public void unsetEncryptedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDCONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "encryptedContentAlgorithm" element
     */
    public java.lang.String getEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedContentAlgorithm" element
     */
    public org.apache.xmlbeans.XmlString xgetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "encryptedContentAlgorithm" element
     */
    public boolean isSetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDCONTENTALGORITHM$4) != 0;
        }
    }
    
    /**
     * Sets the "encryptedContentAlgorithm" element
     */
    public void setEncryptedContentAlgorithm(java.lang.String encryptedContentAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTEDCONTENTALGORITHM$4);
            }
            target.setStringValue(encryptedContentAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedContentAlgorithm" element
     */
    public void xsetEncryptedContentAlgorithm(org.apache.xmlbeans.XmlString encryptedContentAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDCONTENTALGORITHM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENCRYPTEDCONTENTALGORITHM$4);
            }
            target.set(encryptedContentAlgorithm);
        }
    }
    
    /**
     * Unsets the "encryptedContentAlgorithm" element
     */
    public void unsetEncryptedContentAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDCONTENTALGORITHM$4, 0);
        }
    }
}
