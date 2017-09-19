/*
 * XML Type:  OAuth1ProfileContainer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OAuth1ProfileContainerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OAuth1ProfileContainer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OAuth1ProfileContainerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OAuth1ProfileContainerConfig
{
    private static final long serialVersionUID = 1L;
    
    public OAuth1ProfileContainerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OAUTH1PROFILE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "oAuth1Profile");
    
    
    /**
     * Gets a List of "oAuth1Profile" elements
     */
    public java.util.List<com.eviware.soapui.config.OAuth1ProfileConfig> getOAuth1ProfileList()
    {
        final class OAuth1ProfileList extends java.util.AbstractList<com.eviware.soapui.config.OAuth1ProfileConfig>
        {
            public com.eviware.soapui.config.OAuth1ProfileConfig get(int i)
                { return OAuth1ProfileContainerConfigImpl.this.getOAuth1ProfileArray(i); }
            
            public com.eviware.soapui.config.OAuth1ProfileConfig set(int i, com.eviware.soapui.config.OAuth1ProfileConfig o)
            {
                com.eviware.soapui.config.OAuth1ProfileConfig old = OAuth1ProfileContainerConfigImpl.this.getOAuth1ProfileArray(i);
                OAuth1ProfileContainerConfigImpl.this.setOAuth1ProfileArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.OAuth1ProfileConfig o)
                { OAuth1ProfileContainerConfigImpl.this.insertNewOAuth1Profile(i).set(o); }
            
            public com.eviware.soapui.config.OAuth1ProfileConfig remove(int i)
            {
                com.eviware.soapui.config.OAuth1ProfileConfig old = OAuth1ProfileContainerConfigImpl.this.getOAuth1ProfileArray(i);
                OAuth1ProfileContainerConfigImpl.this.removeOAuth1Profile(i);
                return old;
            }
            
            public int size()
                { return OAuth1ProfileContainerConfigImpl.this.sizeOfOAuth1ProfileArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OAuth1ProfileList();
        }
    }
    
    /**
     * Gets array of all "oAuth1Profile" elements
     * @deprecated
     */
    public com.eviware.soapui.config.OAuth1ProfileConfig[] getOAuth1ProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.OAuth1ProfileConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.OAuth1ProfileConfig>();
            get_store().find_all_element_users(OAUTH1PROFILE$0, targetList);
            com.eviware.soapui.config.OAuth1ProfileConfig[] result = new com.eviware.soapui.config.OAuth1ProfileConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oAuth1Profile" element
     */
    public com.eviware.soapui.config.OAuth1ProfileConfig getOAuth1ProfileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileConfig)get_store().find_element_user(OAUTH1PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oAuth1Profile" element
     */
    public int sizeOfOAuth1ProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OAUTH1PROFILE$0);
        }
    }
    
    /**
     * Sets array of all "oAuth1Profile" element
     */
    public void setOAuth1ProfileArray(com.eviware.soapui.config.OAuth1ProfileConfig[] oAuth1ProfileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oAuth1ProfileArray, OAUTH1PROFILE$0);
        }
    }
    
    /**
     * Sets ith "oAuth1Profile" element
     */
    public void setOAuth1ProfileArray(int i, com.eviware.soapui.config.OAuth1ProfileConfig oAuth1Profile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileConfig)get_store().find_element_user(OAUTH1PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oAuth1Profile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oAuth1Profile" element
     */
    public com.eviware.soapui.config.OAuth1ProfileConfig insertNewOAuth1Profile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileConfig)get_store().insert_element_user(OAUTH1PROFILE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oAuth1Profile" element
     */
    public com.eviware.soapui.config.OAuth1ProfileConfig addNewOAuth1Profile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth1ProfileConfig target = null;
            target = (com.eviware.soapui.config.OAuth1ProfileConfig)get_store().add_element_user(OAUTH1PROFILE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "oAuth1Profile" element
     */
    public void removeOAuth1Profile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OAUTH1PROFILE$0, i);
        }
    }
}
