/*
 * XML Type:  ReflectedXSSScan
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReflectedXSSScanConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ReflectedXSSScan(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ReflectedXSSScanConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ReflectedXSSScanConfig
{
    private static final long serialVersionUID = 1L;
    
    public ReflectedXSSScanConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMTOCHECK$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "paramToCheck");
    
    
    /**
     * Gets a List of "paramToCheck" elements
     */
    public java.util.List<java.lang.String> getParamToCheckList()
    {
        final class ParamToCheckList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ReflectedXSSScanConfigImpl.this.getParamToCheckArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ReflectedXSSScanConfigImpl.this.getParamToCheckArray(i);
                ReflectedXSSScanConfigImpl.this.setParamToCheckArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ReflectedXSSScanConfigImpl.this.insertParamToCheck(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ReflectedXSSScanConfigImpl.this.getParamToCheckArray(i);
                ReflectedXSSScanConfigImpl.this.removeParamToCheck(i);
                return old;
            }
            
            public int size()
                { return ReflectedXSSScanConfigImpl.this.sizeOfParamToCheckArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParamToCheckList();
        }
    }
    
    /**
     * Gets array of all "paramToCheck" elements
     * @deprecated
     */
    public java.lang.String[] getParamToCheckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PARAMTOCHECK$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "paramToCheck" element
     */
    public java.lang.String getParamToCheckArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMTOCHECK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "paramToCheck" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetParamToCheckList()
    {
        final class ParamToCheckList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ReflectedXSSScanConfigImpl.this.xgetParamToCheckArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ReflectedXSSScanConfigImpl.this.xgetParamToCheckArray(i);
                ReflectedXSSScanConfigImpl.this.xsetParamToCheckArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ReflectedXSSScanConfigImpl.this.insertNewParamToCheck(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ReflectedXSSScanConfigImpl.this.xgetParamToCheckArray(i);
                ReflectedXSSScanConfigImpl.this.removeParamToCheck(i);
                return old;
            }
            
            public int size()
                { return ReflectedXSSScanConfigImpl.this.sizeOfParamToCheckArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParamToCheckList();
        }
    }
    
    /**
     * Gets array of all "paramToCheck" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetParamToCheckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PARAMTOCHECK$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "paramToCheck" element
     */
    public org.apache.xmlbeans.XmlString xgetParamToCheckArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMTOCHECK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "paramToCheck" element
     */
    public int sizeOfParamToCheckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMTOCHECK$0);
        }
    }
    
    /**
     * Sets array of all "paramToCheck" element
     */
    public void setParamToCheckArray(java.lang.String[] paramToCheckArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paramToCheckArray, PARAMTOCHECK$0);
        }
    }
    
    /**
     * Sets ith "paramToCheck" element
     */
    public void setParamToCheckArray(int i, java.lang.String paramToCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMTOCHECK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(paramToCheck);
        }
    }
    
    /**
     * Sets (as xml) array of all "paramToCheck" element
     */
    public void xsetParamToCheckArray(org.apache.xmlbeans.XmlString[]paramToCheckArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paramToCheckArray, PARAMTOCHECK$0);
        }
    }
    
    /**
     * Sets (as xml) ith "paramToCheck" element
     */
    public void xsetParamToCheckArray(int i, org.apache.xmlbeans.XmlString paramToCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMTOCHECK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(paramToCheck);
        }
    }
    
    /**
     * Inserts the value as the ith "paramToCheck" element
     */
    public void insertParamToCheck(int i, java.lang.String paramToCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARAMTOCHECK$0, i);
            target.setStringValue(paramToCheck);
        }
    }
    
    /**
     * Appends the value as the last "paramToCheck" element
     */
    public void addParamToCheck(java.lang.String paramToCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMTOCHECK$0);
            target.setStringValue(paramToCheck);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "paramToCheck" element
     */
    public org.apache.xmlbeans.XmlString insertNewParamToCheck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PARAMTOCHECK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "paramToCheck" element
     */
    public org.apache.xmlbeans.XmlString addNewParamToCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMTOCHECK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "paramToCheck" element
     */
    public void removeParamToCheck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMTOCHECK$0, i);
        }
    }
}
