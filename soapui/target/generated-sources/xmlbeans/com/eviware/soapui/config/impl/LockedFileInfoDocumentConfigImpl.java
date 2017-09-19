/*
 * An XML document type.
 * Localname: lockedFileInfo
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.LockedFileInfoDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one lockedFileInfo(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class LockedFileInfoDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.LockedFileInfoDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public LockedFileInfoDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCKEDFILEINFO$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "lockedFileInfo");
    
    
    /**
     * Gets the "lockedFileInfo" element
     */
    public com.eviware.soapui.config.LockedFileInfoConfig getLockedFileInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LockedFileInfoConfig target = null;
            target = (com.eviware.soapui.config.LockedFileInfoConfig)get_store().find_element_user(LOCKEDFILEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lockedFileInfo" element
     */
    public void setLockedFileInfo(com.eviware.soapui.config.LockedFileInfoConfig lockedFileInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LockedFileInfoConfig target = null;
            target = (com.eviware.soapui.config.LockedFileInfoConfig)get_store().find_element_user(LOCKEDFILEINFO$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.LockedFileInfoConfig)get_store().add_element_user(LOCKEDFILEINFO$0);
            }
            target.set(lockedFileInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "lockedFileInfo" element
     */
    public com.eviware.soapui.config.LockedFileInfoConfig addNewLockedFileInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LockedFileInfoConfig target = null;
            target = (com.eviware.soapui.config.LockedFileInfoConfig)get_store().add_element_user(LOCKEDFILEINFO$0);
            return target;
        }
    }
}
