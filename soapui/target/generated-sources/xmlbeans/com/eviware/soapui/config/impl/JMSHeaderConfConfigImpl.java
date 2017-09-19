/*
 * XML Type:  JMSHeaderConf
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.JMSHeaderConfConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML JMSHeaderConf(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class JMSHeaderConfConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.JMSHeaderConfConfig
{
    private static final long serialVersionUID = 1L;
    
    public JMSHeaderConfConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JMSCORRELATIONID$0 = 
        new javax.xml.namespace.QName("", "JMSCorrelationID");
    private static final javax.xml.namespace.QName JMSREPLYTO$2 = 
        new javax.xml.namespace.QName("", "JMSReplyTo");
    private static final javax.xml.namespace.QName JMSTYPE$4 = 
        new javax.xml.namespace.QName("", "JMSType");
    private static final javax.xml.namespace.QName JMSPRIORITY$6 = 
        new javax.xml.namespace.QName("", "JMSPriority");
    private static final javax.xml.namespace.QName JMSDELIVERYMODE$8 = 
        new javax.xml.namespace.QName("", "JMSDeliveryMode");
    private static final javax.xml.namespace.QName TIMETOLIVE$10 = 
        new javax.xml.namespace.QName("", "TimeToLive");
    private static final javax.xml.namespace.QName DURABLESUBSCRIPTIONNAME$12 = 
        new javax.xml.namespace.QName("", "durableSubscriptionName");
    private static final javax.xml.namespace.QName CLIENTID$14 = 
        new javax.xml.namespace.QName("", "clientID");
    private static final javax.xml.namespace.QName MESSAGESELECTOR$16 = 
        new javax.xml.namespace.QName("", "messageSelector");
    private static final javax.xml.namespace.QName SENDASBYTESMESSAGE$18 = 
        new javax.xml.namespace.QName("", "sendAsBytesMessage");
    private static final javax.xml.namespace.QName SOAPACTIONADD$20 = 
        new javax.xml.namespace.QName("", "soapActionAdd");
    
    
    /**
     * Gets the "JMSCorrelationID" attribute
     */
    public java.lang.String getJMSCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSCORRELATIONID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JMSCorrelationID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJMSCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSCORRELATIONID$0);
            return target;
        }
    }
    
    /**
     * True if has "JMSCorrelationID" attribute
     */
    public boolean isSetJMSCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JMSCORRELATIONID$0) != null;
        }
    }
    
    /**
     * Sets the "JMSCorrelationID" attribute
     */
    public void setJMSCorrelationID(java.lang.String jmsCorrelationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSCORRELATIONID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JMSCORRELATIONID$0);
            }
            target.setStringValue(jmsCorrelationID);
        }
    }
    
    /**
     * Sets (as xml) the "JMSCorrelationID" attribute
     */
    public void xsetJMSCorrelationID(org.apache.xmlbeans.XmlString jmsCorrelationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSCORRELATIONID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JMSCORRELATIONID$0);
            }
            target.set(jmsCorrelationID);
        }
    }
    
    /**
     * Unsets the "JMSCorrelationID" attribute
     */
    public void unsetJMSCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JMSCORRELATIONID$0);
        }
    }
    
    /**
     * Gets the "JMSReplyTo" attribute
     */
    public java.lang.String getJMSReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSREPLYTO$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JMSReplyTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJMSReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSREPLYTO$2);
            return target;
        }
    }
    
    /**
     * True if has "JMSReplyTo" attribute
     */
    public boolean isSetJMSReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JMSREPLYTO$2) != null;
        }
    }
    
    /**
     * Sets the "JMSReplyTo" attribute
     */
    public void setJMSReplyTo(java.lang.String jmsReplyTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSREPLYTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JMSREPLYTO$2);
            }
            target.setStringValue(jmsReplyTo);
        }
    }
    
    /**
     * Sets (as xml) the "JMSReplyTo" attribute
     */
    public void xsetJMSReplyTo(org.apache.xmlbeans.XmlString jmsReplyTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSREPLYTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JMSREPLYTO$2);
            }
            target.set(jmsReplyTo);
        }
    }
    
    /**
     * Unsets the "JMSReplyTo" attribute
     */
    public void unsetJMSReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JMSREPLYTO$2);
        }
    }
    
    /**
     * Gets the "JMSType" attribute
     */
    public java.lang.String getJMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSTYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JMSType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "JMSType" attribute
     */
    public boolean isSetJMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JMSTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "JMSType" attribute
     */
    public void setJMSType(java.lang.String jmsType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JMSTYPE$4);
            }
            target.setStringValue(jmsType);
        }
    }
    
    /**
     * Sets (as xml) the "JMSType" attribute
     */
    public void xsetJMSType(org.apache.xmlbeans.XmlString jmsType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JMSTYPE$4);
            }
            target.set(jmsType);
        }
    }
    
    /**
     * Unsets the "JMSType" attribute
     */
    public void unsetJMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JMSTYPE$4);
        }
    }
    
    /**
     * Gets the "JMSPriority" attribute
     */
    public java.lang.String getJMSPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSPRIORITY$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JMSPriority" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJMSPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSPRIORITY$6);
            return target;
        }
    }
    
    /**
     * True if has "JMSPriority" attribute
     */
    public boolean isSetJMSPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JMSPRIORITY$6) != null;
        }
    }
    
    /**
     * Sets the "JMSPriority" attribute
     */
    public void setJMSPriority(java.lang.String jmsPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSPRIORITY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JMSPRIORITY$6);
            }
            target.setStringValue(jmsPriority);
        }
    }
    
    /**
     * Sets (as xml) the "JMSPriority" attribute
     */
    public void xsetJMSPriority(org.apache.xmlbeans.XmlString jmsPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JMSPRIORITY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JMSPRIORITY$6);
            }
            target.set(jmsPriority);
        }
    }
    
    /**
     * Unsets the "JMSPriority" attribute
     */
    public void unsetJMSPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JMSPRIORITY$6);
        }
    }
    
    /**
     * Gets the "JMSDeliveryMode" attribute
     */
    public com.eviware.soapui.config.JMSDeliveryModeTypeConfig.Enum getJMSDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSDELIVERYMODE$8);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.JMSDeliveryModeTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "JMSDeliveryMode" attribute
     */
    public com.eviware.soapui.config.JMSDeliveryModeTypeConfig xgetJMSDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSDeliveryModeTypeConfig target = null;
            target = (com.eviware.soapui.config.JMSDeliveryModeTypeConfig)get_store().find_attribute_user(JMSDELIVERYMODE$8);
            return target;
        }
    }
    
    /**
     * True if has "JMSDeliveryMode" attribute
     */
    public boolean isSetJMSDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JMSDELIVERYMODE$8) != null;
        }
    }
    
    /**
     * Sets the "JMSDeliveryMode" attribute
     */
    public void setJMSDeliveryMode(com.eviware.soapui.config.JMSDeliveryModeTypeConfig.Enum jmsDeliveryMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JMSDELIVERYMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JMSDELIVERYMODE$8);
            }
            target.setEnumValue(jmsDeliveryMode);
        }
    }
    
    /**
     * Sets (as xml) the "JMSDeliveryMode" attribute
     */
    public void xsetJMSDeliveryMode(com.eviware.soapui.config.JMSDeliveryModeTypeConfig jmsDeliveryMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSDeliveryModeTypeConfig target = null;
            target = (com.eviware.soapui.config.JMSDeliveryModeTypeConfig)get_store().find_attribute_user(JMSDELIVERYMODE$8);
            if (target == null)
            {
                target = (com.eviware.soapui.config.JMSDeliveryModeTypeConfig)get_store().add_attribute_user(JMSDELIVERYMODE$8);
            }
            target.set(jmsDeliveryMode);
        }
    }
    
    /**
     * Unsets the "JMSDeliveryMode" attribute
     */
    public void unsetJMSDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JMSDELIVERYMODE$8);
        }
    }
    
    /**
     * Gets the "TimeToLive" attribute
     */
    public java.lang.String getTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOLIVE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeToLive" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETOLIVE$10);
            return target;
        }
    }
    
    /**
     * True if has "TimeToLive" attribute
     */
    public boolean isSetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMETOLIVE$10) != null;
        }
    }
    
    /**
     * Sets the "TimeToLive" attribute
     */
    public void setTimeToLive(java.lang.String timeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOLIVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETOLIVE$10);
            }
            target.setStringValue(timeToLive);
        }
    }
    
    /**
     * Sets (as xml) the "TimeToLive" attribute
     */
    public void xsetTimeToLive(org.apache.xmlbeans.XmlString timeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETOLIVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMETOLIVE$10);
            }
            target.set(timeToLive);
        }
    }
    
    /**
     * Unsets the "TimeToLive" attribute
     */
    public void unsetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMETOLIVE$10);
        }
    }
    
    /**
     * Gets the "durableSubscriptionName" attribute
     */
    public java.lang.String getDurableSubscriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "durableSubscriptionName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDurableSubscriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            return target;
        }
    }
    
    /**
     * True if has "durableSubscriptionName" attribute
     */
    public boolean isSetDurableSubscriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DURABLESUBSCRIPTIONNAME$12) != null;
        }
    }
    
    /**
     * Sets the "durableSubscriptionName" attribute
     */
    public void setDurableSubscriptionName(java.lang.String durableSubscriptionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            }
            target.setStringValue(durableSubscriptionName);
        }
    }
    
    /**
     * Sets (as xml) the "durableSubscriptionName" attribute
     */
    public void xsetDurableSubscriptionName(org.apache.xmlbeans.XmlString durableSubscriptionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURABLESUBSCRIPTIONNAME$12);
            }
            target.set(durableSubscriptionName);
        }
    }
    
    /**
     * Unsets the "durableSubscriptionName" attribute
     */
    public void unsetDurableSubscriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DURABLESUBSCRIPTIONNAME$12);
        }
    }
    
    /**
     * Gets the "clientID" attribute
     */
    public java.lang.String getClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTID$14);
            return target;
        }
    }
    
    /**
     * True if has "clientID" attribute
     */
    public boolean isSetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIENTID$14) != null;
        }
    }
    
    /**
     * Sets the "clientID" attribute
     */
    public void setClientID(java.lang.String clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTID$14);
            }
            target.setStringValue(clientID);
        }
    }
    
    /**
     * Sets (as xml) the "clientID" attribute
     */
    public void xsetClientID(org.apache.xmlbeans.XmlString clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTID$14);
            }
            target.set(clientID);
        }
    }
    
    /**
     * Unsets the "clientID" attribute
     */
    public void unsetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIENTID$14);
        }
    }
    
    /**
     * Gets the "messageSelector" attribute
     */
    public java.lang.String getMessageSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGESELECTOR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageSelector" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMessageSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGESELECTOR$16);
            return target;
        }
    }
    
    /**
     * True if has "messageSelector" attribute
     */
    public boolean isSetMessageSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGESELECTOR$16) != null;
        }
    }
    
    /**
     * Sets the "messageSelector" attribute
     */
    public void setMessageSelector(java.lang.String messageSelector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGESELECTOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGESELECTOR$16);
            }
            target.setStringValue(messageSelector);
        }
    }
    
    /**
     * Sets (as xml) the "messageSelector" attribute
     */
    public void xsetMessageSelector(org.apache.xmlbeans.XmlString messageSelector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGESELECTOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGESELECTOR$16);
            }
            target.set(messageSelector);
        }
    }
    
    /**
     * Unsets the "messageSelector" attribute
     */
    public void unsetMessageSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGESELECTOR$16);
        }
    }
    
    /**
     * Gets the "sendAsBytesMessage" attribute
     */
    public boolean getSendAsBytesMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDASBYTESMESSAGE$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendAsBytesMessage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendAsBytesMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDASBYTESMESSAGE$18);
            return target;
        }
    }
    
    /**
     * True if has "sendAsBytesMessage" attribute
     */
    public boolean isSetSendAsBytesMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SENDASBYTESMESSAGE$18) != null;
        }
    }
    
    /**
     * Sets the "sendAsBytesMessage" attribute
     */
    public void setSendAsBytesMessage(boolean sendAsBytesMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDASBYTESMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENDASBYTESMESSAGE$18);
            }
            target.setBooleanValue(sendAsBytesMessage);
        }
    }
    
    /**
     * Sets (as xml) the "sendAsBytesMessage" attribute
     */
    public void xsetSendAsBytesMessage(org.apache.xmlbeans.XmlBoolean sendAsBytesMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDASBYTESMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SENDASBYTESMESSAGE$18);
            }
            target.set(sendAsBytesMessage);
        }
    }
    
    /**
     * Unsets the "sendAsBytesMessage" attribute
     */
    public void unsetSendAsBytesMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SENDASBYTESMESSAGE$18);
        }
    }
    
    /**
     * Gets the "soapActionAdd" attribute
     */
    public boolean getSoapActionAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTIONADD$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapActionAdd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSoapActionAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPACTIONADD$20);
            return target;
        }
    }
    
    /**
     * True if has "soapActionAdd" attribute
     */
    public boolean isSetSoapActionAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPACTIONADD$20) != null;
        }
    }
    
    /**
     * Sets the "soapActionAdd" attribute
     */
    public void setSoapActionAdd(boolean soapActionAdd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTIONADD$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPACTIONADD$20);
            }
            target.setBooleanValue(soapActionAdd);
        }
    }
    
    /**
     * Sets (as xml) the "soapActionAdd" attribute
     */
    public void xsetSoapActionAdd(org.apache.xmlbeans.XmlBoolean soapActionAdd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPACTIONADD$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOAPACTIONADD$20);
            }
            target.set(soapActionAdd);
        }
    }
    
    /**
     * Unsets the "soapActionAdd" attribute
     */
    public void unsetSoapActionAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPACTIONADD$20);
        }
    }
}
