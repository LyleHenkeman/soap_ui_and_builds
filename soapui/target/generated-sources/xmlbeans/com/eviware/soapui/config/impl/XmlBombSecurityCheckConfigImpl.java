/*
 * XML Type:  XmlBombSecurityCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.XmlBombSecurityCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML XmlBombSecurityCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class XmlBombSecurityCheckConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.XmlBombSecurityCheckConfig
{
    private static final long serialVersionUID = 1L;
    
    public XmlBombSecurityCheckConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XMLBOMBS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "xmlBombs");
    private static final javax.xml.namespace.QName ATTACHXMLBOMB$2 = 
        new javax.xml.namespace.QName("", "attachXmlBomb");
    private static final javax.xml.namespace.QName XMLATTACHMENTPREFIX$4 = 
        new javax.xml.namespace.QName("", "xmlAttachmentPrefix");
    
    
    /**
     * Gets a List of "xmlBombs" elements
     */
    public java.util.List<java.lang.String> getXmlBombsList()
    {
        final class XmlBombsList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return XmlBombSecurityCheckConfigImpl.this.getXmlBombsArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = XmlBombSecurityCheckConfigImpl.this.getXmlBombsArray(i);
                XmlBombSecurityCheckConfigImpl.this.setXmlBombsArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { XmlBombSecurityCheckConfigImpl.this.insertXmlBombs(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = XmlBombSecurityCheckConfigImpl.this.getXmlBombsArray(i);
                XmlBombSecurityCheckConfigImpl.this.removeXmlBombs(i);
                return old;
            }
            
            public int size()
                { return XmlBombSecurityCheckConfigImpl.this.sizeOfXmlBombsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XmlBombsList();
        }
    }
    
    /**
     * Gets array of all "xmlBombs" elements
     * @deprecated
     */
    public java.lang.String[] getXmlBombsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(XMLBOMBS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "xmlBombs" element
     */
    public java.lang.String getXmlBombsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XMLBOMBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "xmlBombs" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetXmlBombsList()
    {
        final class XmlBombsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return XmlBombSecurityCheckConfigImpl.this.xgetXmlBombsArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = XmlBombSecurityCheckConfigImpl.this.xgetXmlBombsArray(i);
                XmlBombSecurityCheckConfigImpl.this.xsetXmlBombsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { XmlBombSecurityCheckConfigImpl.this.insertNewXmlBombs(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = XmlBombSecurityCheckConfigImpl.this.xgetXmlBombsArray(i);
                XmlBombSecurityCheckConfigImpl.this.removeXmlBombs(i);
                return old;
            }
            
            public int size()
                { return XmlBombSecurityCheckConfigImpl.this.sizeOfXmlBombsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XmlBombsList();
        }
    }
    
    /**
     * Gets array of all "xmlBombs" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetXmlBombsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(XMLBOMBS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "xmlBombs" element
     */
    public org.apache.xmlbeans.XmlString xgetXmlBombsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XMLBOMBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "xmlBombs" element
     */
    public int sizeOfXmlBombsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLBOMBS$0);
        }
    }
    
    /**
     * Sets array of all "xmlBombs" element
     */
    public void setXmlBombsArray(java.lang.String[] xmlBombsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xmlBombsArray, XMLBOMBS$0);
        }
    }
    
    /**
     * Sets ith "xmlBombs" element
     */
    public void setXmlBombsArray(int i, java.lang.String xmlBombs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XMLBOMBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(xmlBombs);
        }
    }
    
    /**
     * Sets (as xml) array of all "xmlBombs" element
     */
    public void xsetXmlBombsArray(org.apache.xmlbeans.XmlString[]xmlBombsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xmlBombsArray, XMLBOMBS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "xmlBombs" element
     */
    public void xsetXmlBombsArray(int i, org.apache.xmlbeans.XmlString xmlBombs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XMLBOMBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xmlBombs);
        }
    }
    
    /**
     * Inserts the value as the ith "xmlBombs" element
     */
    public void insertXmlBombs(int i, java.lang.String xmlBombs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(XMLBOMBS$0, i);
            target.setStringValue(xmlBombs);
        }
    }
    
    /**
     * Appends the value as the last "xmlBombs" element
     */
    public void addXmlBombs(java.lang.String xmlBombs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XMLBOMBS$0);
            target.setStringValue(xmlBombs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xmlBombs" element
     */
    public org.apache.xmlbeans.XmlString insertNewXmlBombs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(XMLBOMBS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xmlBombs" element
     */
    public org.apache.xmlbeans.XmlString addNewXmlBombs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XMLBOMBS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "xmlBombs" element
     */
    public void removeXmlBombs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLBOMBS$0, i);
        }
    }
    
    /**
     * Gets the "attachXmlBomb" attribute
     */
    public boolean getAttachXmlBomb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHXMLBOMB$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachXmlBomb" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAttachXmlBomb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATTACHXMLBOMB$2);
            return target;
        }
    }
    
    /**
     * True if has "attachXmlBomb" attribute
     */
    public boolean isSetAttachXmlBomb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTACHXMLBOMB$2) != null;
        }
    }
    
    /**
     * Sets the "attachXmlBomb" attribute
     */
    public void setAttachXmlBomb(boolean attachXmlBomb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHXMLBOMB$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHXMLBOMB$2);
            }
            target.setBooleanValue(attachXmlBomb);
        }
    }
    
    /**
     * Sets (as xml) the "attachXmlBomb" attribute
     */
    public void xsetAttachXmlBomb(org.apache.xmlbeans.XmlBoolean attachXmlBomb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATTACHXMLBOMB$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ATTACHXMLBOMB$2);
            }
            target.set(attachXmlBomb);
        }
    }
    
    /**
     * Unsets the "attachXmlBomb" attribute
     */
    public void unsetAttachXmlBomb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTACHXMLBOMB$2);
        }
    }
    
    /**
     * Gets the "xmlAttachmentPrefix" attribute
     */
    public java.lang.String getXmlAttachmentPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLATTACHMENTPREFIX$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xmlAttachmentPrefix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetXmlAttachmentPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XMLATTACHMENTPREFIX$4);
            return target;
        }
    }
    
    /**
     * True if has "xmlAttachmentPrefix" attribute
     */
    public boolean isSetXmlAttachmentPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLATTACHMENTPREFIX$4) != null;
        }
    }
    
    /**
     * Sets the "xmlAttachmentPrefix" attribute
     */
    public void setXmlAttachmentPrefix(java.lang.String xmlAttachmentPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLATTACHMENTPREFIX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLATTACHMENTPREFIX$4);
            }
            target.setStringValue(xmlAttachmentPrefix);
        }
    }
    
    /**
     * Sets (as xml) the "xmlAttachmentPrefix" attribute
     */
    public void xsetXmlAttachmentPrefix(org.apache.xmlbeans.XmlString xmlAttachmentPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XMLATTACHMENTPREFIX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(XMLATTACHMENTPREFIX$4);
            }
            target.set(xmlAttachmentPrefix);
        }
    }
    
    /**
     * Unsets the "xmlAttachmentPrefix" attribute
     */
    public void unsetXmlAttachmentPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLATTACHMENTPREFIX$4);
        }
    }
}
