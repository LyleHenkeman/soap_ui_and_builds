/*
 * XML Type:  WsrmConfig
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsrmConfigConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WsrmConfig(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WsrmConfigConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.WsrmConfigConfig
{
    private static final long serialVersionUID = 1L;
    
    public WsrmConfigConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ACKTO$2 = 
        new javax.xml.namespace.QName("", "ackTo");
    private static final javax.xml.namespace.QName SEQUENCEEXPIRES$4 = 
        new javax.xml.namespace.QName("", "sequenceExpires");
    private static final javax.xml.namespace.QName OFFERENDPOINT$6 = 
        new javax.xml.namespace.QName("", "offerEndpoint");
    
    
    /**
     * Gets the "version" attribute
     */
    public com.eviware.soapui.config.WsrmVersionTypeConfig.Enum getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WsrmVersionTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.eviware.soapui.config.WsrmVersionTypeConfig xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().find_attribute_user(VERSION$0);
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$0) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(com.eviware.soapui.config.WsrmVersionTypeConfig.Enum version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$0);
            }
            target.setEnumValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.eviware.soapui.config.WsrmVersionTypeConfig version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsrmVersionTypeConfig)get_store().add_attribute_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$0);
        }
    }
    
    /**
     * Gets the "ackTo" attribute
     */
    public java.lang.String getAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACKTO$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ackTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACKTO$2);
            return target;
        }
    }
    
    /**
     * True if has "ackTo" attribute
     */
    public boolean isSetAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACKTO$2) != null;
        }
    }
    
    /**
     * Sets the "ackTo" attribute
     */
    public void setAckTo(java.lang.String ackTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACKTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACKTO$2);
            }
            target.setStringValue(ackTo);
        }
    }
    
    /**
     * Sets (as xml) the "ackTo" attribute
     */
    public void xsetAckTo(org.apache.xmlbeans.XmlString ackTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACKTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACKTO$2);
            }
            target.set(ackTo);
        }
    }
    
    /**
     * Unsets the "ackTo" attribute
     */
    public void unsetAckTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACKTO$2);
        }
    }
    
    /**
     * Gets the "sequenceExpires" attribute
     */
    public java.math.BigInteger getSequenceExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCEEXPIRES$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sequenceExpires" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSequenceExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SEQUENCEEXPIRES$4);
            return target;
        }
    }
    
    /**
     * True if has "sequenceExpires" attribute
     */
    public boolean isSetSequenceExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEQUENCEEXPIRES$4) != null;
        }
    }
    
    /**
     * Sets the "sequenceExpires" attribute
     */
    public void setSequenceExpires(java.math.BigInteger sequenceExpires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCEEXPIRES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQUENCEEXPIRES$4);
            }
            target.setBigIntegerValue(sequenceExpires);
        }
    }
    
    /**
     * Sets (as xml) the "sequenceExpires" attribute
     */
    public void xsetSequenceExpires(org.apache.xmlbeans.XmlInteger sequenceExpires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SEQUENCEEXPIRES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SEQUENCEEXPIRES$4);
            }
            target.set(sequenceExpires);
        }
    }
    
    /**
     * Unsets the "sequenceExpires" attribute
     */
    public void unsetSequenceExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEQUENCEEXPIRES$4);
        }
    }
    
    /**
     * Gets the "offerEndpoint" attribute
     */
    public java.lang.String getOfferEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFERENDPOINT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerEndpoint" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOfferEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFERENDPOINT$6);
            return target;
        }
    }
    
    /**
     * True if has "offerEndpoint" attribute
     */
    public boolean isSetOfferEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFERENDPOINT$6) != null;
        }
    }
    
    /**
     * Sets the "offerEndpoint" attribute
     */
    public void setOfferEndpoint(java.lang.String offerEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFERENDPOINT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFERENDPOINT$6);
            }
            target.setStringValue(offerEndpoint);
        }
    }
    
    /**
     * Sets (as xml) the "offerEndpoint" attribute
     */
    public void xsetOfferEndpoint(org.apache.xmlbeans.XmlString offerEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFERENDPOINT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OFFERENDPOINT$6);
            }
            target.set(offerEndpoint);
        }
    }
    
    /**
     * Unsets the "offerEndpoint" attribute
     */
    public void unsetOfferEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFERENDPOINT$6);
        }
    }
}
