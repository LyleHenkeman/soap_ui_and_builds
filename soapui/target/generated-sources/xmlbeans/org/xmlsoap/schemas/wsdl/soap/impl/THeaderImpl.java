/*
 * XML Type:  tHeader
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.THeader
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tHeader(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class THeaderImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.soap.THeader
{
    private static final long serialVersionUID = 1L;
    
    public THeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "headerfault");
    private static final javax.xml.namespace.QName MESSAGE$2 = 
        new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName PART$4 = 
        new javax.xml.namespace.QName("", "part");
    private static final javax.xml.namespace.QName USE$6 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName ENCODINGSTYLE$8 = 
        new javax.xml.namespace.QName("", "encodingStyle");
    private static final javax.xml.namespace.QName NAMESPACE$10 = 
        new javax.xml.namespace.QName("", "namespace");
    
    
    /**
     * Gets a List of "headerfault" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.soap.THeaderFault> getHeaderfaultList()
    {
        final class HeaderfaultList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.soap.THeaderFault>
        {
            public org.xmlsoap.schemas.wsdl.soap.THeaderFault get(int i)
                { return THeaderImpl.this.getHeaderfaultArray(i); }
            
            public org.xmlsoap.schemas.wsdl.soap.THeaderFault set(int i, org.xmlsoap.schemas.wsdl.soap.THeaderFault o)
            {
                org.xmlsoap.schemas.wsdl.soap.THeaderFault old = THeaderImpl.this.getHeaderfaultArray(i);
                THeaderImpl.this.setHeaderfaultArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.soap.THeaderFault o)
                { THeaderImpl.this.insertNewHeaderfault(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.soap.THeaderFault remove(int i)
            {
                org.xmlsoap.schemas.wsdl.soap.THeaderFault old = THeaderImpl.this.getHeaderfaultArray(i);
                THeaderImpl.this.removeHeaderfault(i);
                return old;
            }
            
            public int size()
                { return THeaderImpl.this.sizeOfHeaderfaultArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HeaderfaultList();
        }
    }
    
    /**
     * Gets array of all "headerfault" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault[] getHeaderfaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.soap.THeaderFault> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.soap.THeaderFault>();
            get_store().find_all_element_users(HEADERFAULT$0, targetList);
            org.xmlsoap.schemas.wsdl.soap.THeaderFault[] result = new org.xmlsoap.schemas.wsdl.soap.THeaderFault[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "headerfault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault getHeaderfaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().find_element_user(HEADERFAULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "headerfault" element
     */
    public int sizeOfHeaderfaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERFAULT$0);
        }
    }
    
    /**
     * Sets array of all "headerfault" element
     */
    public void setHeaderfaultArray(org.xmlsoap.schemas.wsdl.soap.THeaderFault[] headerfaultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headerfaultArray, HEADERFAULT$0);
        }
    }
    
    /**
     * Sets ith "headerfault" element
     */
    public void setHeaderfaultArray(int i, org.xmlsoap.schemas.wsdl.soap.THeaderFault headerfault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().find_element_user(HEADERFAULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(headerfault);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "headerfault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault insertNewHeaderfault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().insert_element_user(HEADERFAULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "headerfault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault addNewHeaderfault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().add_element_user(HEADERFAULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "headerfault" element
     */
    public void removeHeaderfault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERFAULT$0, i);
        }
    }
    
    /**
     * Gets the "message" attribute
     */
    public javax.xml.namespace.QName getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGE$2);
            return target;
        }
    }
    
    /**
     * Sets the "message" attribute
     */
    public void setMessage(javax.xml.namespace.QName message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$2);
            }
            target.setQNameValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" attribute
     */
    public void xsetMessage(org.apache.xmlbeans.XmlQName message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(MESSAGE$2);
            }
            target.set(message);
        }
    }
    
    /**
     * Gets the "part" attribute
     */
    public java.lang.String getPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "part" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$4);
            return target;
        }
    }
    
    /**
     * Sets the "part" attribute
     */
    public void setPart(java.lang.String part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PART$4);
            }
            target.setStringValue(part);
        }
    }
    
    /**
     * Sets (as xml) the "part" attribute
     */
    public void xsetPart(org.apache.xmlbeans.XmlNMTOKEN part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(PART$4);
            }
            target.set(part);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$6);
            if (target == null)
            {
                return null;
            }
            return (org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.UseChoice xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.UseChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().find_attribute_user(USE$6);
            return target;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$6);
            }
            target.setEnumValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(org.xmlsoap.schemas.wsdl.soap.UseChoice use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.UseChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().find_attribute_user(USE$6);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().add_attribute_user(USE$6);
            }
            target.set(use);
        }
    }
    
    /**
     * Gets the "encodingStyle" attribute
     */
    public java.util.List getEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.EncodingStyle xgetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$8);
            return target;
        }
    }
    
    /**
     * True if has "encodingStyle" attribute
     */
    public boolean isSetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGSTYLE$8) != null;
        }
    }
    
    /**
     * Sets the "encodingStyle" attribute
     */
    public void setEncodingStyle(java.util.List encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$8);
            }
            target.setListValue(encodingStyle);
        }
    }
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    public void xsetEncodingStyle(org.xmlsoap.schemas.wsdl.soap.EncodingStyle encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$8);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().add_attribute_user(ENCODINGSTYLE$8);
            }
            target.set(encodingStyle);
        }
    }
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    public void unsetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGSTYLE$8);
        }
    }
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$10);
            return target;
        }
    }
    
    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMESPACE$10) != null;
        }
    }
    
    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$10);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$10);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMESPACE$10);
        }
    }
}
