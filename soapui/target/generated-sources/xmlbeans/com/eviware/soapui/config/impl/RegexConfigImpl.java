/*
 * XML Type:  Regex
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RegexConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Regex(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RegexConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RegexConfig
{
    private static final long serialVersionUID = 1L;
    
    public RegexConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "description");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "message");
    private static final javax.xml.namespace.QName PATTERN$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "pattern");
    
    
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
            }
            target.set(message);
        }
    }
    
    /**
     * Gets a List of "pattern" elements
     */
    public java.util.List<java.lang.String> getPatternList()
    {
        final class PatternList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return RegexConfigImpl.this.getPatternArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = RegexConfigImpl.this.getPatternArray(i);
                RegexConfigImpl.this.setPatternArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { RegexConfigImpl.this.insertPattern(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = RegexConfigImpl.this.getPatternArray(i);
                RegexConfigImpl.this.removePattern(i);
                return old;
            }
            
            public int size()
                { return RegexConfigImpl.this.sizeOfPatternArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PatternList();
        }
    }
    
    /**
     * Gets array of all "pattern" elements
     * @deprecated
     */
    public java.lang.String[] getPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PATTERN$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "pattern" element
     */
    public java.lang.String getPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "pattern" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetPatternList()
    {
        final class PatternList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return RegexConfigImpl.this.xgetPatternArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = RegexConfigImpl.this.xgetPatternArray(i);
                RegexConfigImpl.this.xsetPatternArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { RegexConfigImpl.this.insertNewPattern(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = RegexConfigImpl.this.xgetPatternArray(i);
                RegexConfigImpl.this.removePattern(i);
                return old;
            }
            
            public int size()
                { return RegexConfigImpl.this.sizeOfPatternArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PatternList();
        }
    }
    
    /**
     * Gets array of all "pattern" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PATTERN$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "pattern" element
     */
    public org.apache.xmlbeans.XmlString xgetPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "pattern" element
     */
    public int sizeOfPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERN$6);
        }
    }
    
    /**
     * Sets array of all "pattern" element
     */
    public void setPatternArray(java.lang.String[] patternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$6);
        }
    }
    
    /**
     * Sets ith "pattern" element
     */
    public void setPatternArray(int i, java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Sets (as xml) array of all "pattern" element
     */
    public void xsetPatternArray(org.apache.xmlbeans.XmlString[]patternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$6);
        }
    }
    
    /**
     * Sets (as xml) ith "pattern" element
     */
    public void xsetPatternArray(int i, org.apache.xmlbeans.XmlString pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pattern);
        }
    }
    
    /**
     * Inserts the value as the ith "pattern" element
     */
    public void insertPattern(int i, java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PATTERN$6, i);
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Appends the value as the last "pattern" element
     */
    public void addPattern(java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATTERN$6);
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    public org.apache.xmlbeans.XmlString insertNewPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PATTERN$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    public org.apache.xmlbeans.XmlString addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATTERN$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "pattern" element
     */
    public void removePattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERN$6, i);
        }
    }
}
