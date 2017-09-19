/*
 * XML Type:  SearchPatterns
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SearchPatternsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SearchPatterns(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SearchPatternsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SearchPatternsConfig
{
    private static final long serialVersionUID = 1L;
    
    public SearchPatternsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGEX$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Regex");
    
    
    /**
     * Gets a List of "Regex" elements
     */
    public java.util.List<com.eviware.soapui.config.RegexConfig> getRegexList()
    {
        final class RegexList extends java.util.AbstractList<com.eviware.soapui.config.RegexConfig>
        {
            public com.eviware.soapui.config.RegexConfig get(int i)
                { return SearchPatternsConfigImpl.this.getRegexArray(i); }
            
            public com.eviware.soapui.config.RegexConfig set(int i, com.eviware.soapui.config.RegexConfig o)
            {
                com.eviware.soapui.config.RegexConfig old = SearchPatternsConfigImpl.this.getRegexArray(i);
                SearchPatternsConfigImpl.this.setRegexArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RegexConfig o)
                { SearchPatternsConfigImpl.this.insertNewRegex(i).set(o); }
            
            public com.eviware.soapui.config.RegexConfig remove(int i)
            {
                com.eviware.soapui.config.RegexConfig old = SearchPatternsConfigImpl.this.getRegexArray(i);
                SearchPatternsConfigImpl.this.removeRegex(i);
                return old;
            }
            
            public int size()
                { return SearchPatternsConfigImpl.this.sizeOfRegexArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RegexList();
        }
    }
    
    /**
     * Gets array of all "Regex" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RegexConfig[] getRegexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RegexConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RegexConfig>();
            get_store().find_all_element_users(REGEX$0, targetList);
            com.eviware.soapui.config.RegexConfig[] result = new com.eviware.soapui.config.RegexConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Regex" element
     */
    public com.eviware.soapui.config.RegexConfig getRegexArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RegexConfig target = null;
            target = (com.eviware.soapui.config.RegexConfig)get_store().find_element_user(REGEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Regex" element
     */
    public int sizeOfRegexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGEX$0);
        }
    }
    
    /**
     * Sets array of all "Regex" element
     */
    public void setRegexArray(com.eviware.soapui.config.RegexConfig[] regexArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(regexArray, REGEX$0);
        }
    }
    
    /**
     * Sets ith "Regex" element
     */
    public void setRegexArray(int i, com.eviware.soapui.config.RegexConfig regex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RegexConfig target = null;
            target = (com.eviware.soapui.config.RegexConfig)get_store().find_element_user(REGEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(regex);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Regex" element
     */
    public com.eviware.soapui.config.RegexConfig insertNewRegex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RegexConfig target = null;
            target = (com.eviware.soapui.config.RegexConfig)get_store().insert_element_user(REGEX$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Regex" element
     */
    public com.eviware.soapui.config.RegexConfig addNewRegex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RegexConfig target = null;
            target = (com.eviware.soapui.config.RegexConfig)get_store().add_element_user(REGEX$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Regex" element
     */
    public void removeRegex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGEX$0, i);
        }
    }
}
