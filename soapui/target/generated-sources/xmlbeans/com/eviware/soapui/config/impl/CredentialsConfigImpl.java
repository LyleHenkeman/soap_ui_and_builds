/*
 * XML Type:  Credentials
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CredentialsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Credentials(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class CredentialsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.CredentialsConfig
{
    private static final long serialVersionUID = 1L;
    
    public CredentialsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "username");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "password");
    private static final javax.xml.namespace.QName DOMAIN$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "domain");
    private static final javax.xml.namespace.QName SELECTEDAUTHPROFILE$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "selectedAuthProfile");
    private static final javax.xml.namespace.QName ADDEDBASICAUTHENTICATIONTYPES$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "addedBasicAuthenticationTypes");
    private static final javax.xml.namespace.QName PREEMPTIVE$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "preemptive");
    private static final javax.xml.namespace.QName AUTHTYPE$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "authType");
    
    
    /**
     * Gets the "username" element
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" element
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "username" element
     */
    public boolean isSetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "username" element
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" element
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
            }
            target.set(username);
        }
    }
    
    /**
     * Unsets the "username" element
     */
    public void unsetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERNAME$0, 0);
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
     * True if has "password" element
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSWORD$2) != 0;
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
     * Unsets the "password" element
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSWORD$2, 0);
        }
    }
    
    /**
     * Gets the "domain" element
     */
    public java.lang.String getDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAIN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domain" element
     */
    public org.apache.xmlbeans.XmlString xgetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAIN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "domain" element
     */
    public boolean isSetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAIN$4) != 0;
        }
    }
    
    /**
     * Sets the "domain" element
     */
    public void setDomain(java.lang.String domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAIN$4);
            }
            target.setStringValue(domain);
        }
    }
    
    /**
     * Sets (as xml) the "domain" element
     */
    public void xsetDomain(org.apache.xmlbeans.XmlString domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAIN$4);
            }
            target.set(domain);
        }
    }
    
    /**
     * Unsets the "domain" element
     */
    public void unsetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAIN$4, 0);
        }
    }
    
    /**
     * Gets the "selectedAuthProfile" element
     */
    public java.lang.String getSelectedAuthProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTEDAUTHPROFILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "selectedAuthProfile" element
     */
    public org.apache.xmlbeans.XmlString xgetSelectedAuthProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELECTEDAUTHPROFILE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "selectedAuthProfile" element
     */
    public boolean isSetSelectedAuthProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTEDAUTHPROFILE$6) != 0;
        }
    }
    
    /**
     * Sets the "selectedAuthProfile" element
     */
    public void setSelectedAuthProfile(java.lang.String selectedAuthProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTEDAUTHPROFILE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTEDAUTHPROFILE$6);
            }
            target.setStringValue(selectedAuthProfile);
        }
    }
    
    /**
     * Sets (as xml) the "selectedAuthProfile" element
     */
    public void xsetSelectedAuthProfile(org.apache.xmlbeans.XmlString selectedAuthProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELECTEDAUTHPROFILE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELECTEDAUTHPROFILE$6);
            }
            target.set(selectedAuthProfile);
        }
    }
    
    /**
     * Unsets the "selectedAuthProfile" element
     */
    public void unsetSelectedAuthProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTEDAUTHPROFILE$6, 0);
        }
    }
    
    /**
     * Gets a List of "addedBasicAuthenticationTypes" elements
     */
    public java.util.List<java.lang.String> getAddedBasicAuthenticationTypesList()
    {
        final class AddedBasicAuthenticationTypesList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CredentialsConfigImpl.this.getAddedBasicAuthenticationTypesArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CredentialsConfigImpl.this.getAddedBasicAuthenticationTypesArray(i);
                CredentialsConfigImpl.this.setAddedBasicAuthenticationTypesArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CredentialsConfigImpl.this.insertAddedBasicAuthenticationTypes(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CredentialsConfigImpl.this.getAddedBasicAuthenticationTypesArray(i);
                CredentialsConfigImpl.this.removeAddedBasicAuthenticationTypes(i);
                return old;
            }
            
            public int size()
                { return CredentialsConfigImpl.this.sizeOfAddedBasicAuthenticationTypesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AddedBasicAuthenticationTypesList();
        }
    }
    
    /**
     * Gets array of all "addedBasicAuthenticationTypes" elements
     * @deprecated
     */
    public java.lang.String[] getAddedBasicAuthenticationTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ADDEDBASICAUTHENTICATIONTYPES$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "addedBasicAuthenticationTypes" element
     */
    public java.lang.String getAddedBasicAuthenticationTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "addedBasicAuthenticationTypes" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAddedBasicAuthenticationTypesList()
    {
        final class AddedBasicAuthenticationTypesList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return CredentialsConfigImpl.this.xgetAddedBasicAuthenticationTypesArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CredentialsConfigImpl.this.xgetAddedBasicAuthenticationTypesArray(i);
                CredentialsConfigImpl.this.xsetAddedBasicAuthenticationTypesArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CredentialsConfigImpl.this.insertNewAddedBasicAuthenticationTypes(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CredentialsConfigImpl.this.xgetAddedBasicAuthenticationTypesArray(i);
                CredentialsConfigImpl.this.removeAddedBasicAuthenticationTypes(i);
                return old;
            }
            
            public int size()
                { return CredentialsConfigImpl.this.sizeOfAddedBasicAuthenticationTypesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AddedBasicAuthenticationTypesList();
        }
    }
    
    /**
     * Gets array of all "addedBasicAuthenticationTypes" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetAddedBasicAuthenticationTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ADDEDBASICAUTHENTICATIONTYPES$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "addedBasicAuthenticationTypes" element
     */
    public org.apache.xmlbeans.XmlString xgetAddedBasicAuthenticationTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "addedBasicAuthenticationTypes" element
     */
    public int sizeOfAddedBasicAuthenticationTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDEDBASICAUTHENTICATIONTYPES$8);
        }
    }
    
    /**
     * Sets array of all "addedBasicAuthenticationTypes" element
     */
    public void setAddedBasicAuthenticationTypesArray(java.lang.String[] addedBasicAuthenticationTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addedBasicAuthenticationTypesArray, ADDEDBASICAUTHENTICATIONTYPES$8);
        }
    }
    
    /**
     * Sets ith "addedBasicAuthenticationTypes" element
     */
    public void setAddedBasicAuthenticationTypesArray(int i, java.lang.String addedBasicAuthenticationTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(addedBasicAuthenticationTypes);
        }
    }
    
    /**
     * Sets (as xml) array of all "addedBasicAuthenticationTypes" element
     */
    public void xsetAddedBasicAuthenticationTypesArray(org.apache.xmlbeans.XmlString[]addedBasicAuthenticationTypesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addedBasicAuthenticationTypesArray, ADDEDBASICAUTHENTICATIONTYPES$8);
        }
    }
    
    /**
     * Sets (as xml) ith "addedBasicAuthenticationTypes" element
     */
    public void xsetAddedBasicAuthenticationTypesArray(int i, org.apache.xmlbeans.XmlString addedBasicAuthenticationTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addedBasicAuthenticationTypes);
        }
    }
    
    /**
     * Inserts the value as the ith "addedBasicAuthenticationTypes" element
     */
    public void insertAddedBasicAuthenticationTypes(int i, java.lang.String addedBasicAuthenticationTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            target.setStringValue(addedBasicAuthenticationTypes);
        }
    }
    
    /**
     * Appends the value as the last "addedBasicAuthenticationTypes" element
     */
    public void addAddedBasicAuthenticationTypes(java.lang.String addedBasicAuthenticationTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDEDBASICAUTHENTICATIONTYPES$8);
            target.setStringValue(addedBasicAuthenticationTypes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addedBasicAuthenticationTypes" element
     */
    public org.apache.xmlbeans.XmlString insertNewAddedBasicAuthenticationTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ADDEDBASICAUTHENTICATIONTYPES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addedBasicAuthenticationTypes" element
     */
    public org.apache.xmlbeans.XmlString addNewAddedBasicAuthenticationTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDEDBASICAUTHENTICATIONTYPES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "addedBasicAuthenticationTypes" element
     */
    public void removeAddedBasicAuthenticationTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDEDBASICAUTHENTICATIONTYPES$8, i);
        }
    }
    
    /**
     * Gets the "preemptive" element
     */
    public boolean getPreemptive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTIVE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preemptive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreemptive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREEMPTIVE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "preemptive" element
     */
    public boolean isSetPreemptive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREEMPTIVE$10) != 0;
        }
    }
    
    /**
     * Sets the "preemptive" element
     */
    public void setPreemptive(boolean preemptive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREEMPTIVE$10);
            }
            target.setBooleanValue(preemptive);
        }
    }
    
    /**
     * Sets (as xml) the "preemptive" element
     */
    public void xsetPreemptive(org.apache.xmlbeans.XmlBoolean preemptive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREEMPTIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PREEMPTIVE$10);
            }
            target.set(preemptive);
        }
    }
    
    /**
     * Unsets the "preemptive" element
     */
    public void unsetPreemptive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREEMPTIVE$10, 0);
        }
    }
    
    /**
     * Gets the "authType" element
     */
    public com.eviware.soapui.config.CredentialsConfig.AuthType.Enum getAuthType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.CredentialsConfig.AuthType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "authType" element
     */
    public com.eviware.soapui.config.CredentialsConfig.AuthType xgetAuthType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CredentialsConfig.AuthType target = null;
            target = (com.eviware.soapui.config.CredentialsConfig.AuthType)get_store().find_element_user(AUTHTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authType" element
     */
    public void setAuthType(com.eviware.soapui.config.CredentialsConfig.AuthType.Enum authType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHTYPE$12);
            }
            target.setEnumValue(authType);
        }
    }
    
    /**
     * Sets (as xml) the "authType" element
     */
    public void xsetAuthType(com.eviware.soapui.config.CredentialsConfig.AuthType authType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CredentialsConfig.AuthType target = null;
            target = (com.eviware.soapui.config.CredentialsConfig.AuthType)get_store().find_element_user(AUTHTYPE$12, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CredentialsConfig.AuthType)get_store().add_element_user(AUTHTYPE$12);
            }
            target.set(authType);
        }
    }
    /**
     * An XML authType(@http://eviware.com/soapui/config).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.CredentialsConfig$AuthType.
     */
    public static class AuthTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.CredentialsConfig.AuthType
    {
        private static final long serialVersionUID = 1L;
        
        public AuthTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AuthTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
