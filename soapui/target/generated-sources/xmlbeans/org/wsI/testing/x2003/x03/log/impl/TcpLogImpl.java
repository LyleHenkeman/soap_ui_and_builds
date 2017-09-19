/*
 * XML Type:  tcpLog
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.TcpLog
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML tcpLog(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class TcpLogImpl extends org.wsI.testing.x2003.x03.log.impl.MessageEntryImpl implements org.wsI.testing.x2003.x03.log.TcpLog
{
    private static final long serialVersionUID = 1L;
    
    public TcpLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDERHOSTANDPORT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "senderHostAndPort");
    private static final javax.xml.namespace.QName RECEIVERHOSTANDPORT$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "receiverHostAndPort");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "senderHostAndPort" element
     */
    public java.lang.String getSenderHostAndPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHOSTANDPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "senderHostAndPort" element
     */
    public org.apache.xmlbeans.XmlString xgetSenderHostAndPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHOSTANDPORT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "senderHostAndPort" element
     */
    public void setSenderHostAndPort(java.lang.String senderHostAndPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHOSTANDPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERHOSTANDPORT$0);
            }
            target.setStringValue(senderHostAndPort);
        }
    }
    
    /**
     * Sets (as xml) the "senderHostAndPort" element
     */
    public void xsetSenderHostAndPort(org.apache.xmlbeans.XmlString senderHostAndPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHOSTANDPORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDERHOSTANDPORT$0);
            }
            target.set(senderHostAndPort);
        }
    }
    
    /**
     * Gets the "receiverHostAndPort" element
     */
    public java.lang.String getReceiverHostAndPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERHOSTANDPORT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "receiverHostAndPort" element
     */
    public org.apache.xmlbeans.XmlString xgetReceiverHostAndPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECEIVERHOSTANDPORT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "receiverHostAndPort" element
     */
    public void setReceiverHostAndPort(java.lang.String receiverHostAndPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERHOSTANDPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVERHOSTANDPORT$2);
            }
            target.setStringValue(receiverHostAndPort);
        }
    }
    
    /**
     * Sets (as xml) the "receiverHostAndPort" element
     */
    public void xsetReceiverHostAndPort(org.apache.xmlbeans.XmlString receiverHostAndPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECEIVERHOSTANDPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECEIVERHOSTANDPORT$2);
            }
            target.set(receiverHostAndPort);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.wsI.testing.x2003.x03.log.TcpMessageType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.wsI.testing.x2003.x03.log.TcpMessageType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.wsI.testing.x2003.x03.log.TcpMessageType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.TcpMessageType target = null;
            target = (org.wsI.testing.x2003.x03.log.TcpMessageType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.wsI.testing.x2003.x03.log.TcpMessageType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.wsI.testing.x2003.x03.log.TcpMessageType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.TcpMessageType target = null;
            target = (org.wsI.testing.x2003.x03.log.TcpMessageType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.TcpMessageType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
}
