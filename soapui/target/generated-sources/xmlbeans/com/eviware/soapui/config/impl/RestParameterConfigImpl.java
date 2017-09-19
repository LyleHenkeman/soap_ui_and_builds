/*
 * XML Type:  RestParameter
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestParameterConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestParameter(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestParameterConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RestParameterConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestParameterConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "value");
    private static final javax.xml.namespace.QName STYLE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "style");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "type");
    private static final javax.xml.namespace.QName DEFAULT$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "default");
    private static final javax.xml.namespace.QName PATH$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "path");
    private static final javax.xml.namespace.QName LINK$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "link");
    private static final javax.xml.namespace.QName OPTION$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "option");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "description");
    private static final javax.xml.namespace.QName REQUIRED$18 = 
        new javax.xml.namespace.QName("", "required");
    private static final javax.xml.namespace.QName REPEATING$20 = 
        new javax.xml.namespace.QName("", "repeating");
    private static final javax.xml.namespace.QName DISABLEURLENCODING$22 = 
        new javax.xml.namespace.QName("", "disableUrlEncoding");
    
    
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
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "style" element
     */
    public com.eviware.soapui.config.RestParameterConfig.Style.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.RestParameterConfig.Style.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" element
     */
    public com.eviware.soapui.config.RestParameterConfig.Style xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig.Style target = null;
            target = (com.eviware.soapui.config.RestParameterConfig.Style)get_store().find_element_user(STYLE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(com.eviware.soapui.config.RestParameterConfig.Style.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STYLE$4);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" element
     */
    public void xsetStyle(com.eviware.soapui.config.RestParameterConfig.Style style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig.Style target = null;
            target = (com.eviware.soapui.config.RestParameterConfig.Style)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestParameterConfig.Style)get_store().add_element_user(STYLE$4);
            }
            target.set(style);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$6);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$6, 0);
        }
    }
    
    /**
     * Gets the "default" element
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" element
     */
    public org.apache.xmlbeans.XmlString xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "default" element
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULT$8) != 0;
        }
    }
    
    /**
     * Sets the "default" element
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULT$8);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" element
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULT$8);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" element
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULT$8, 0);
        }
    }
    
    /**
     * Gets the "path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "path" element
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$10) != 0;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$10);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$10);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "path" element
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$10, 0);
        }
    }
    
    /**
     * Gets the "link" element
     */
    public java.lang.String getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "link" element
     */
    public org.apache.xmlbeans.XmlString xgetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "link" element
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$12) != 0;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(java.lang.String link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINK$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINK$12);
            }
            target.setStringValue(link);
        }
    }
    
    /**
     * Sets (as xml) the "link" element
     */
    public void xsetLink(org.apache.xmlbeans.XmlString link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINK$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINK$12);
            }
            target.set(link);
        }
    }
    
    /**
     * Unsets the "link" element
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$12, 0);
        }
    }
    
    /**
     * Gets a List of "option" elements
     */
    public java.util.List<java.lang.String> getOptionList()
    {
        final class OptionList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return RestParameterConfigImpl.this.getOptionArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = RestParameterConfigImpl.this.getOptionArray(i);
                RestParameterConfigImpl.this.setOptionArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { RestParameterConfigImpl.this.insertOption(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = RestParameterConfigImpl.this.getOptionArray(i);
                RestParameterConfigImpl.this.removeOption(i);
                return old;
            }
            
            public int size()
                { return RestParameterConfigImpl.this.sizeOfOptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OptionList();
        }
    }
    
    /**
     * Gets array of all "option" elements
     * @deprecated
     */
    public java.lang.String[] getOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(OPTION$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "option" element
     */
    public java.lang.String getOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "option" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetOptionList()
    {
        final class OptionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return RestParameterConfigImpl.this.xgetOptionArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = RestParameterConfigImpl.this.xgetOptionArray(i);
                RestParameterConfigImpl.this.xsetOptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { RestParameterConfigImpl.this.insertNewOption(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = RestParameterConfigImpl.this.xgetOptionArray(i);
                RestParameterConfigImpl.this.removeOption(i);
                return old;
            }
            
            public int size()
                { return RestParameterConfigImpl.this.sizeOfOptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OptionList();
        }
    }
    
    /**
     * Gets array of all "option" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(OPTION$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "option" element
     */
    public org.apache.xmlbeans.XmlString xgetOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "option" element
     */
    public int sizeOfOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTION$14);
        }
    }
    
    /**
     * Sets array of all "option" element
     */
    public void setOptionArray(java.lang.String[] optionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionArray, OPTION$14);
        }
    }
    
    /**
     * Sets ith "option" element
     */
    public void setOptionArray(int i, java.lang.String option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(option);
        }
    }
    
    /**
     * Sets (as xml) array of all "option" element
     */
    public void xsetOptionArray(org.apache.xmlbeans.XmlString[]optionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionArray, OPTION$14);
        }
    }
    
    /**
     * Sets (as xml) ith "option" element
     */
    public void xsetOptionArray(int i, org.apache.xmlbeans.XmlString option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(option);
        }
    }
    
    /**
     * Inserts the value as the ith "option" element
     */
    public void insertOption(int i, java.lang.String option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OPTION$14, i);
            target.setStringValue(option);
        }
    }
    
    /**
     * Appends the value as the last "option" element
     */
    public void addOption(java.lang.String option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTION$14);
            target.setStringValue(option);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "option" element
     */
    public org.apache.xmlbeans.XmlString insertNewOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OPTION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "option" element
     */
    public org.apache.xmlbeans.XmlString addNewOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPTION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "option" element
     */
    public void removeOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTION$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$16);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$16, 0);
        }
    }
    
    /**
     * Gets the "required" attribute
     */
    public boolean getRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "required" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$18);
            return target;
        }
    }
    
    /**
     * True if has "required" attribute
     */
    public boolean isSetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUIRED$18) != null;
        }
    }
    
    /**
     * Sets the "required" attribute
     */
    public void setRequired(boolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$18);
            }
            target.setBooleanValue(required);
        }
    }
    
    /**
     * Sets (as xml) the "required" attribute
     */
    public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REQUIRED$18);
            }
            target.set(required);
        }
    }
    
    /**
     * Unsets the "required" attribute
     */
    public void unsetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUIRED$18);
        }
    }
    
    /**
     * Gets the "repeating" attribute
     */
    public boolean getRepeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATING$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "repeating" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRepeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPEATING$20);
            return target;
        }
    }
    
    /**
     * True if has "repeating" attribute
     */
    public boolean isSetRepeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATING$20) != null;
        }
    }
    
    /**
     * Sets the "repeating" attribute
     */
    public void setRepeating(boolean repeating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATING$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATING$20);
            }
            target.setBooleanValue(repeating);
        }
    }
    
    /**
     * Sets (as xml) the "repeating" attribute
     */
    public void xsetRepeating(org.apache.xmlbeans.XmlBoolean repeating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPEATING$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REPEATING$20);
            }
            target.set(repeating);
        }
    }
    
    /**
     * Unsets the "repeating" attribute
     */
    public void unsetRepeating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATING$20);
        }
    }
    
    /**
     * Gets the "disableUrlEncoding" attribute
     */
    public boolean getDisableUrlEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEURLENCODING$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disableUrlEncoding" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisableUrlEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEURLENCODING$22);
            return target;
        }
    }
    
    /**
     * True if has "disableUrlEncoding" attribute
     */
    public boolean isSetDisableUrlEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLEURLENCODING$22) != null;
        }
    }
    
    /**
     * Sets the "disableUrlEncoding" attribute
     */
    public void setDisableUrlEncoding(boolean disableUrlEncoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEURLENCODING$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEURLENCODING$22);
            }
            target.setBooleanValue(disableUrlEncoding);
        }
    }
    
    /**
     * Sets (as xml) the "disableUrlEncoding" attribute
     */
    public void xsetDisableUrlEncoding(org.apache.xmlbeans.XmlBoolean disableUrlEncoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEURLENCODING$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLEURLENCODING$22);
            }
            target.set(disableUrlEncoding);
        }
    }
    
    /**
     * Unsets the "disableUrlEncoding" attribute
     */
    public void unsetDisableUrlEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLEURLENCODING$22);
        }
    }
    /**
     * An XML style(@http://eviware.com/soapui/config).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.RestParameterConfig$Style.
     */
    public static class StyleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.RestParameterConfig.Style
    {
        private static final long serialVersionUID = 1L;
        
        public StyleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StyleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
