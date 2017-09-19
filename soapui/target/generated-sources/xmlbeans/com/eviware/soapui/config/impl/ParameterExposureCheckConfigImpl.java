/*
 * XML Type:  ParameterExposureCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ParameterExposureCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ParameterExposureCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ParameterExposureCheckConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ParameterExposureCheckConfig
{
    private static final long serialVersionUID = 1L;
    
    public ParameterExposureCheckConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETEREXPOSURESTRINGS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameterExposureStrings");
    
    
    /**
     * Gets a List of "parameterExposureStrings" elements
     */
    public java.util.List<java.lang.String> getParameterExposureStringsList()
    {
        final class ParameterExposureStringsList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ParameterExposureCheckConfigImpl.this.getParameterExposureStringsArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ParameterExposureCheckConfigImpl.this.getParameterExposureStringsArray(i);
                ParameterExposureCheckConfigImpl.this.setParameterExposureStringsArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ParameterExposureCheckConfigImpl.this.insertParameterExposureStrings(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ParameterExposureCheckConfigImpl.this.getParameterExposureStringsArray(i);
                ParameterExposureCheckConfigImpl.this.removeParameterExposureStrings(i);
                return old;
            }
            
            public int size()
                { return ParameterExposureCheckConfigImpl.this.sizeOfParameterExposureStringsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterExposureStringsList();
        }
    }
    
    /**
     * Gets array of all "parameterExposureStrings" elements
     * @deprecated
     */
    public java.lang.String[] getParameterExposureStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PARAMETEREXPOSURESTRINGS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "parameterExposureStrings" element
     */
    public java.lang.String getParameterExposureStringsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "parameterExposureStrings" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetParameterExposureStringsList()
    {
        final class ParameterExposureStringsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ParameterExposureCheckConfigImpl.this.xgetParameterExposureStringsArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ParameterExposureCheckConfigImpl.this.xgetParameterExposureStringsArray(i);
                ParameterExposureCheckConfigImpl.this.xsetParameterExposureStringsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ParameterExposureCheckConfigImpl.this.insertNewParameterExposureStrings(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ParameterExposureCheckConfigImpl.this.xgetParameterExposureStringsArray(i);
                ParameterExposureCheckConfigImpl.this.removeParameterExposureStrings(i);
                return old;
            }
            
            public int size()
                { return ParameterExposureCheckConfigImpl.this.sizeOfParameterExposureStringsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterExposureStringsList();
        }
    }
    
    /**
     * Gets array of all "parameterExposureStrings" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetParameterExposureStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PARAMETEREXPOSURESTRINGS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "parameterExposureStrings" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterExposureStringsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "parameterExposureStrings" element
     */
    public int sizeOfParameterExposureStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETEREXPOSURESTRINGS$0);
        }
    }
    
    /**
     * Sets array of all "parameterExposureStrings" element
     */
    public void setParameterExposureStringsArray(java.lang.String[] parameterExposureStringsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterExposureStringsArray, PARAMETEREXPOSURESTRINGS$0);
        }
    }
    
    /**
     * Sets ith "parameterExposureStrings" element
     */
    public void setParameterExposureStringsArray(int i, java.lang.String parameterExposureStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(parameterExposureStrings);
        }
    }
    
    /**
     * Sets (as xml) array of all "parameterExposureStrings" element
     */
    public void xsetParameterExposureStringsArray(org.apache.xmlbeans.XmlString[]parameterExposureStringsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterExposureStringsArray, PARAMETEREXPOSURESTRINGS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "parameterExposureStrings" element
     */
    public void xsetParameterExposureStringsArray(int i, org.apache.xmlbeans.XmlString parameterExposureStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameterExposureStrings);
        }
    }
    
    /**
     * Inserts the value as the ith "parameterExposureStrings" element
     */
    public void insertParameterExposureStrings(int i, java.lang.String parameterExposureStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            target.setStringValue(parameterExposureStrings);
        }
    }
    
    /**
     * Appends the value as the last "parameterExposureStrings" element
     */
    public void addParameterExposureStrings(java.lang.String parameterExposureStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETEREXPOSURESTRINGS$0);
            target.setStringValue(parameterExposureStrings);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterExposureStrings" element
     */
    public org.apache.xmlbeans.XmlString insertNewParameterExposureStrings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PARAMETEREXPOSURESTRINGS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterExposureStrings" element
     */
    public org.apache.xmlbeans.XmlString addNewParameterExposureStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETEREXPOSURESTRINGS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterExposureStrings" element
     */
    public void removeParameterExposureStrings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETEREXPOSURESTRINGS$0, i);
        }
    }
}
