/*
 * XML Type:  OAuth2ProfileContainer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OAuth2ProfileContainerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OAuth2ProfileContainer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OAuth2ProfileContainerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OAuth2ProfileContainerConfig
{
    private static final long serialVersionUID = 1L;
    
    public OAuth2ProfileContainerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OAUTH2PROFILE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "oAuth2Profile");
    
    
    /**
     * Gets a List of "oAuth2Profile" elements
     */
    public java.util.List<com.eviware.soapui.config.OAuth2ProfileConfig> getOAuth2ProfileList()
    {
        final class OAuth2ProfileList extends java.util.AbstractList<com.eviware.soapui.config.OAuth2ProfileConfig>
        {
            public com.eviware.soapui.config.OAuth2ProfileConfig get(int i)
                { return OAuth2ProfileContainerConfigImpl.this.getOAuth2ProfileArray(i); }
            
            public com.eviware.soapui.config.OAuth2ProfileConfig set(int i, com.eviware.soapui.config.OAuth2ProfileConfig o)
            {
                com.eviware.soapui.config.OAuth2ProfileConfig old = OAuth2ProfileContainerConfigImpl.this.getOAuth2ProfileArray(i);
                OAuth2ProfileContainerConfigImpl.this.setOAuth2ProfileArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.OAuth2ProfileConfig o)
                { OAuth2ProfileContainerConfigImpl.this.insertNewOAuth2Profile(i).set(o); }
            
            public com.eviware.soapui.config.OAuth2ProfileConfig remove(int i)
            {
                com.eviware.soapui.config.OAuth2ProfileConfig old = OAuth2ProfileContainerConfigImpl.this.getOAuth2ProfileArray(i);
                OAuth2ProfileContainerConfigImpl.this.removeOAuth2Profile(i);
                return old;
            }
            
            public int size()
                { return OAuth2ProfileContainerConfigImpl.this.sizeOfOAuth2ProfileArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OAuth2ProfileList();
        }
    }
    
    /**
     * Gets array of all "oAuth2Profile" elements
     * @deprecated
     */
    public com.eviware.soapui.config.OAuth2ProfileConfig[] getOAuth2ProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.OAuth2ProfileConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.OAuth2ProfileConfig>();
            get_store().find_all_element_users(OAUTH2PROFILE$0, targetList);
            com.eviware.soapui.config.OAuth2ProfileConfig[] result = new com.eviware.soapui.config.OAuth2ProfileConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oAuth2Profile" element
     */
    public com.eviware.soapui.config.OAuth2ProfileConfig getOAuth2ProfileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileConfig)get_store().find_element_user(OAUTH2PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oAuth2Profile" element
     */
    public int sizeOfOAuth2ProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OAUTH2PROFILE$0);
        }
    }
    
    /**
     * Sets array of all "oAuth2Profile" element
     */
    public void setOAuth2ProfileArray(com.eviware.soapui.config.OAuth2ProfileConfig[] oAuth2ProfileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oAuth2ProfileArray, OAUTH2PROFILE$0);
        }
    }
    
    /**
     * Sets ith "oAuth2Profile" element
     */
    public void setOAuth2ProfileArray(int i, com.eviware.soapui.config.OAuth2ProfileConfig oAuth2Profile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileConfig)get_store().find_element_user(OAUTH2PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oAuth2Profile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oAuth2Profile" element
     */
    public com.eviware.soapui.config.OAuth2ProfileConfig insertNewOAuth2Profile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileConfig)get_store().insert_element_user(OAUTH2PROFILE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oAuth2Profile" element
     */
    public com.eviware.soapui.config.OAuth2ProfileConfig addNewOAuth2Profile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth2ProfileConfig)get_store().add_element_user(OAUTH2PROFILE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "oAuth2Profile" element
     */
    public void removeOAuth2Profile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OAUTH2PROFILE$0, i);
        }
    }
}
