/*
 * XML Type:  XPathInjection
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.XPathInjectionConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML XPathInjection(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class XPathInjectionConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.XPathInjectionConfig
{
    private static final long serialVersionUID = 1L;
    
    public XPathInjectionConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XPATHLIST$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "xpathList");
    
    
    /**
     * Gets a List of "xpathList" elements
     */
    public java.util.List<java.lang.String> getXpathListList()
    {
        final class XpathListList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return XPathInjectionConfigImpl.this.getXpathListArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = XPathInjectionConfigImpl.this.getXpathListArray(i);
                XPathInjectionConfigImpl.this.setXpathListArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { XPathInjectionConfigImpl.this.insertXpathList(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = XPathInjectionConfigImpl.this.getXpathListArray(i);
                XPathInjectionConfigImpl.this.removeXpathList(i);
                return old;
            }
            
            public int size()
                { return XPathInjectionConfigImpl.this.sizeOfXpathListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XpathListList();
        }
    }
    
    /**
     * Gets array of all "xpathList" elements
     * @deprecated
     */
    public java.lang.String[] getXpathListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(XPATHLIST$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "xpathList" element
     */
    public java.lang.String getXpathListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATHLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "xpathList" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetXpathListList()
    {
        final class XpathListList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return XPathInjectionConfigImpl.this.xgetXpathListArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = XPathInjectionConfigImpl.this.xgetXpathListArray(i);
                XPathInjectionConfigImpl.this.xsetXpathListArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { XPathInjectionConfigImpl.this.insertNewXpathList(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = XPathInjectionConfigImpl.this.xgetXpathListArray(i);
                XPathInjectionConfigImpl.this.removeXpathList(i);
                return old;
            }
            
            public int size()
                { return XPathInjectionConfigImpl.this.sizeOfXpathListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XpathListList();
        }
    }
    
    /**
     * Gets array of all "xpathList" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetXpathListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(XPATHLIST$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "xpathList" element
     */
    public org.apache.xmlbeans.XmlString xgetXpathListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XPATHLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "xpathList" element
     */
    public int sizeOfXpathListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XPATHLIST$0);
        }
    }
    
    /**
     * Sets array of all "xpathList" element
     */
    public void setXpathListArray(java.lang.String[] xpathListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xpathListArray, XPATHLIST$0);
        }
    }
    
    /**
     * Sets ith "xpathList" element
     */
    public void setXpathListArray(int i, java.lang.String xpathList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATHLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(xpathList);
        }
    }
    
    /**
     * Sets (as xml) array of all "xpathList" element
     */
    public void xsetXpathListArray(org.apache.xmlbeans.XmlString[]xpathListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xpathListArray, XPATHLIST$0);
        }
    }
    
    /**
     * Sets (as xml) ith "xpathList" element
     */
    public void xsetXpathListArray(int i, org.apache.xmlbeans.XmlString xpathList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XPATHLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xpathList);
        }
    }
    
    /**
     * Inserts the value as the ith "xpathList" element
     */
    public void insertXpathList(int i, java.lang.String xpathList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(XPATHLIST$0, i);
            target.setStringValue(xpathList);
        }
    }
    
    /**
     * Appends the value as the last "xpathList" element
     */
    public void addXpathList(java.lang.String xpathList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XPATHLIST$0);
            target.setStringValue(xpathList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xpathList" element
     */
    public org.apache.xmlbeans.XmlString insertNewXpathList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(XPATHLIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xpathList" element
     */
    public org.apache.xmlbeans.XmlString addNewXpathList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XPATHLIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "xpathList" element
     */
    public void removeXpathList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XPATHLIST$0, i);
        }
    }
}
