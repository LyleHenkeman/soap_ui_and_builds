/*
 * XML Type:  Fault
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.Fault
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML Fault(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class FaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.Fault
{
    private static final long serialVersionUID = 1L;
    
    public FaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Code");
    private static final javax.xml.namespace.QName REASON$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Reason");
    private static final javax.xml.namespace.QName NODE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Node");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Role");
    private static final javax.xml.namespace.QName DETAIL$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Detail");
    
    
    /**
     * Gets the "Code" element
     */
    public org.w3.x2003.x05.soapEnvelope.Faultcode getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultcode)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(org.w3.x2003.x05.soapEnvelope.Faultcode code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultcode)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Faultcode)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "Code" element
     */
    public org.w3.x2003.x05.soapEnvelope.Faultcode addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultcode target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultcode)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Reason" element
     */
    public org.w3.x2003.x05.soapEnvelope.Faultreason getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultreason target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultreason)get_store().find_element_user(REASON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Reason" element
     */
    public void setReason(org.w3.x2003.x05.soapEnvelope.Faultreason reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultreason target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultreason)get_store().find_element_user(REASON$2, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Faultreason)get_store().add_element_user(REASON$2);
            }
            target.set(reason);
        }
    }
    
    /**
     * Appends and returns a new empty "Reason" element
     */
    public org.w3.x2003.x05.soapEnvelope.Faultreason addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Faultreason target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Faultreason)get_store().add_element_user(REASON$2);
            return target;
        }
    }
    
    /**
     * Gets the "Node" element
     */
    public java.lang.String getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Node" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Node" element
     */
    public boolean isSetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODE$4) != 0;
        }
    }
    
    /**
     * Sets the "Node" element
     */
    public void setNode(java.lang.String node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODE$4);
            }
            target.setStringValue(node);
        }
    }
    
    /**
     * Sets (as xml) the "Node" element
     */
    public void xsetNode(org.apache.xmlbeans.XmlAnyURI node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(NODE$4);
            }
            target.set(node);
        }
    }
    
    /**
     * Unsets the "Node" element
     */
    public void unsetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODE$4, 0);
        }
    }
    
    /**
     * Gets the "Role" element
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Role" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ROLE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$6) != 0;
        }
    }
    
    /**
     * Sets the "Role" element
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$6);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "Role" element
     */
    public void xsetRole(org.apache.xmlbeans.XmlAnyURI role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ROLE$6);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "Role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$6, 0);
        }
    }
    
    /**
     * Gets the "Detail" element
     */
    public org.w3.x2003.x05.soapEnvelope.Detail getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Detail target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Detail)get_store().find_element_user(DETAIL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$8) != 0;
        }
    }
    
    /**
     * Sets the "Detail" element
     */
    public void setDetail(org.w3.x2003.x05.soapEnvelope.Detail detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Detail target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Detail)get_store().find_element_user(DETAIL$8, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Detail)get_store().add_element_user(DETAIL$8);
            }
            target.set(detail);
        }
    }
    
    /**
     * Appends and returns a new empty "Detail" element
     */
    public org.w3.x2003.x05.soapEnvelope.Detail addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Detail target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Detail)get_store().add_element_user(DETAIL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$8, 0);
        }
    }
}
