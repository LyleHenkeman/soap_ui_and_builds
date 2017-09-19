/*
 * An XML document type.
 * Localname: searchPatterns
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SearchPatternsDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one searchPatterns(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SearchPatternsDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SearchPatternsDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SearchPatternsDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHPATTERNS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "searchPatterns");
    
    
    /**
     * Gets the "searchPatterns" element
     */
    public com.eviware.soapui.config.SearchPatternsConfig getSearchPatterns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SearchPatternsConfig target = null;
            target = (com.eviware.soapui.config.SearchPatternsConfig)get_store().find_element_user(SEARCHPATTERNS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "searchPatterns" element
     */
    public void setSearchPatterns(com.eviware.soapui.config.SearchPatternsConfig searchPatterns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SearchPatternsConfig target = null;
            target = (com.eviware.soapui.config.SearchPatternsConfig)get_store().find_element_user(SEARCHPATTERNS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SearchPatternsConfig)get_store().add_element_user(SEARCHPATTERNS$0);
            }
            target.set(searchPatterns);
        }
    }
    
    /**
     * Appends and returns a new empty "searchPatterns" element
     */
    public com.eviware.soapui.config.SearchPatternsConfig addNewSearchPatterns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SearchPatternsConfig target = null;
            target = (com.eviware.soapui.config.SearchPatternsConfig)get_store().add_element_user(SEARCHPATTERNS$0);
            return target;
        }
    }
}
