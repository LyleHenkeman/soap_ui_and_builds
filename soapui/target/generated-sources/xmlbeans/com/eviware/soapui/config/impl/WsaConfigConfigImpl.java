/*
 * XML Type:  WsaConfig
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsaConfigConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WsaConfig(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WsaConfigConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.WsaConfigConfig
{
    private static final long serialVersionUID = 1L;
    
    public WsaConfigConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLYTO$0 = 
        new javax.xml.namespace.QName("", "replyTo");
    private static final javax.xml.namespace.QName FAULTTO$2 = 
        new javax.xml.namespace.QName("", "faultTo");
    private static final javax.xml.namespace.QName ACTION$4 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName FROM$6 = 
        new javax.xml.namespace.QName("", "from");
    private static final javax.xml.namespace.QName MESSAGEID$8 = 
        new javax.xml.namespace.QName("", "messageID");
    private static final javax.xml.namespace.QName TO$10 = 
        new javax.xml.namespace.QName("", "to");
    private static final javax.xml.namespace.QName RELATIONSHIPTYPE$12 = 
        new javax.xml.namespace.QName("", "relationshipType");
    private static final javax.xml.namespace.QName RELATESTO$14 = 
        new javax.xml.namespace.QName("", "relatesTo");
    private static final javax.xml.namespace.QName VERSION$16 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName MUSTUNDERSTAND$18 = 
        new javax.xml.namespace.QName("", "mustUnderstand");
    private static final javax.xml.namespace.QName GENERATEMESSAGEID$20 = 
        new javax.xml.namespace.QName("", "generateMessageId");
    private static final javax.xml.namespace.QName ADDDEFAULTTO$22 = 
        new javax.xml.namespace.QName("", "addDefaultTo");
    private static final javax.xml.namespace.QName ADDDEFAULTACTION$24 = 
        new javax.xml.namespace.QName("", "addDefaultAction");
    private static final javax.xml.namespace.QName REPLYTOREFPARAMS$26 = 
        new javax.xml.namespace.QName("", "replyToRefParams");
    private static final javax.xml.namespace.QName FAULTTOREFPARAMS$28 = 
        new javax.xml.namespace.QName("", "faultToRefParams");
    
    
    /**
     * Gets the "replyTo" attribute
     */
    public java.lang.String getReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLYTO$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "replyTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLYTO$0);
            return target;
        }
    }
    
    /**
     * True if has "replyTo" attribute
     */
    public boolean isSetReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPLYTO$0) != null;
        }
    }
    
    /**
     * Sets the "replyTo" attribute
     */
    public void setReplyTo(java.lang.String replyTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLYTO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLYTO$0);
            }
            target.setStringValue(replyTo);
        }
    }
    
    /**
     * Sets (as xml) the "replyTo" attribute
     */
    public void xsetReplyTo(org.apache.xmlbeans.XmlString replyTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLYTO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPLYTO$0);
            }
            target.set(replyTo);
        }
    }
    
    /**
     * Unsets the "replyTo" attribute
     */
    public void unsetReplyTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPLYTO$0);
        }
    }
    
    /**
     * Gets the "faultTo" attribute
     */
    public java.lang.String getFaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTTO$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTTO$2);
            return target;
        }
    }
    
    /**
     * True if has "faultTo" attribute
     */
    public boolean isSetFaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAULTTO$2) != null;
        }
    }
    
    /**
     * Sets the "faultTo" attribute
     */
    public void setFaultTo(java.lang.String faultTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAULTTO$2);
            }
            target.setStringValue(faultTo);
        }
    }
    
    /**
     * Sets (as xml) the "faultTo" attribute
     */
    public void xsetFaultTo(org.apache.xmlbeans.XmlString faultTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAULTTO$2);
            }
            target.set(faultTo);
        }
    }
    
    /**
     * Unsets the "faultTo" attribute
     */
    public void unsetFaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAULTTO$2);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$4);
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$4) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$4);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$4);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$4);
        }
    }
    
    /**
     * Gets the "from" attribute
     */
    public java.lang.String getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "from" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$6);
            return target;
        }
    }
    
    /**
     * True if has "from" attribute
     */
    public boolean isSetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FROM$6) != null;
        }
    }
    
    /**
     * Sets the "from" attribute
     */
    public void setFrom(java.lang.String from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$6);
            }
            target.setStringValue(from);
        }
    }
    
    /**
     * Sets (as xml) the "from" attribute
     */
    public void xsetFrom(org.apache.xmlbeans.XmlString from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$6);
            }
            target.set(from);
        }
    }
    
    /**
     * Unsets the "from" attribute
     */
    public void unsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FROM$6);
        }
    }
    
    /**
     * Gets the "messageID" attribute
     */
    public java.lang.String getMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGEID$8);
            return target;
        }
    }
    
    /**
     * True if has "messageID" attribute
     */
    public boolean isSetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGEID$8) != null;
        }
    }
    
    /**
     * Sets the "messageID" attribute
     */
    public void setMessageID(java.lang.String messageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEID$8);
            }
            target.setStringValue(messageID);
        }
    }
    
    /**
     * Sets (as xml) the "messageID" attribute
     */
    public void xsetMessageID(org.apache.xmlbeans.XmlString messageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGEID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGEID$8);
            }
            target.set(messageID);
        }
    }
    
    /**
     * Unsets the "messageID" attribute
     */
    public void unsetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGEID$8);
        }
    }
    
    /**
     * Gets the "to" attribute
     */
    public java.lang.String getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "to" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$10);
            return target;
        }
    }
    
    /**
     * True if has "to" attribute
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TO$10) != null;
        }
    }
    
    /**
     * Sets the "to" attribute
     */
    public void setTo(java.lang.String to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$10);
            }
            target.setStringValue(to);
        }
    }
    
    /**
     * Sets (as xml) the "to" attribute
     */
    public void xsetTo(org.apache.xmlbeans.XmlString to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$10);
            }
            target.set(to);
        }
    }
    
    /**
     * Unsets the "to" attribute
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TO$10);
        }
    }
    
    /**
     * Gets the "relationshipType" attribute
     */
    public java.lang.String getRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPTYPE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationshipType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONSHIPTYPE$12);
            return target;
        }
    }
    
    /**
     * True if has "relationshipType" attribute
     */
    public boolean isSetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATIONSHIPTYPE$12) != null;
        }
    }
    
    /**
     * Sets the "relationshipType" attribute
     */
    public void setRelationshipType(java.lang.String relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPTYPE$12);
            }
            target.setStringValue(relationshipType);
        }
    }
    
    /**
     * Sets (as xml) the "relationshipType" attribute
     */
    public void xsetRelationshipType(org.apache.xmlbeans.XmlString relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONSHIPTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATIONSHIPTYPE$12);
            }
            target.set(relationshipType);
        }
    }
    
    /**
     * Unsets the "relationshipType" attribute
     */
    public void unsetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATIONSHIPTYPE$12);
        }
    }
    
    /**
     * Gets the "relatesTo" attribute
     */
    public java.lang.String getRelatesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATESTO$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatesTo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRelatesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATESTO$14);
            return target;
        }
    }
    
    /**
     * True if has "relatesTo" attribute
     */
    public boolean isSetRelatesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATESTO$14) != null;
        }
    }
    
    /**
     * Sets the "relatesTo" attribute
     */
    public void setRelatesTo(java.lang.String relatesTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATESTO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATESTO$14);
            }
            target.setStringValue(relatesTo);
        }
    }
    
    /**
     * Sets (as xml) the "relatesTo" attribute
     */
    public void xsetRelatesTo(org.apache.xmlbeans.XmlString relatesTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATESTO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATESTO$14);
            }
            target.set(relatesTo);
        }
    }
    
    /**
     * Unsets the "relatesTo" attribute
     */
    public void unsetRelatesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATESTO$14);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public com.eviware.soapui.config.WsaVersionTypeConfig.Enum getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$16);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WsaVersionTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.eviware.soapui.config.WsaVersionTypeConfig xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().find_attribute_user(VERSION$16);
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
            return get_store().find_attribute_user(VERSION$16) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(com.eviware.soapui.config.WsaVersionTypeConfig.Enum version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$16);
            }
            target.setEnumValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.eviware.soapui.config.WsaVersionTypeConfig version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().find_attribute_user(VERSION$16);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().add_attribute_user(VERSION$16);
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
            get_store().remove_attribute(VERSION$16);
        }
    }
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    public com.eviware.soapui.config.MustUnderstandTypeConfig.Enum getMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.MustUnderstandTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    public com.eviware.soapui.config.MustUnderstandTypeConfig xgetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MustUnderstandTypeConfig target = null;
            target = (com.eviware.soapui.config.MustUnderstandTypeConfig)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            return target;
        }
    }
    
    /**
     * True if has "mustUnderstand" attribute
     */
    public boolean isSetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUSTUNDERSTAND$18) != null;
        }
    }
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    public void setMustUnderstand(com.eviware.soapui.config.MustUnderstandTypeConfig.Enum mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUSTUNDERSTAND$18);
            }
            target.setEnumValue(mustUnderstand);
        }
    }
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    public void xsetMustUnderstand(com.eviware.soapui.config.MustUnderstandTypeConfig mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MustUnderstandTypeConfig target = null;
            target = (com.eviware.soapui.config.MustUnderstandTypeConfig)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MustUnderstandTypeConfig)get_store().add_attribute_user(MUSTUNDERSTAND$18);
            }
            target.set(mustUnderstand);
        }
    }
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    public void unsetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUSTUNDERSTAND$18);
        }
    }
    
    /**
     * Gets the "generateMessageId" attribute
     */
    public boolean getGenerateMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATEMESSAGEID$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "generateMessageId" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGenerateMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATEMESSAGEID$20);
            return target;
        }
    }
    
    /**
     * True if has "generateMessageId" attribute
     */
    public boolean isSetGenerateMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GENERATEMESSAGEID$20) != null;
        }
    }
    
    /**
     * Sets the "generateMessageId" attribute
     */
    public void setGenerateMessageId(boolean generateMessageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATEMESSAGEID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATEMESSAGEID$20);
            }
            target.setBooleanValue(generateMessageId);
        }
    }
    
    /**
     * Sets (as xml) the "generateMessageId" attribute
     */
    public void xsetGenerateMessageId(org.apache.xmlbeans.XmlBoolean generateMessageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATEMESSAGEID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATEMESSAGEID$20);
            }
            target.set(generateMessageId);
        }
    }
    
    /**
     * Unsets the "generateMessageId" attribute
     */
    public void unsetGenerateMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GENERATEMESSAGEID$20);
        }
    }
    
    /**
     * Gets the "addDefaultTo" attribute
     */
    public boolean getAddDefaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDDEFAULTTO$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "addDefaultTo" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAddDefaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDDEFAULTTO$22);
            return target;
        }
    }
    
    /**
     * True if has "addDefaultTo" attribute
     */
    public boolean isSetAddDefaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDDEFAULTTO$22) != null;
        }
    }
    
    /**
     * Sets the "addDefaultTo" attribute
     */
    public void setAddDefaultTo(boolean addDefaultTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDDEFAULTTO$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDDEFAULTTO$22);
            }
            target.setBooleanValue(addDefaultTo);
        }
    }
    
    /**
     * Sets (as xml) the "addDefaultTo" attribute
     */
    public void xsetAddDefaultTo(org.apache.xmlbeans.XmlBoolean addDefaultTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDDEFAULTTO$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADDDEFAULTTO$22);
            }
            target.set(addDefaultTo);
        }
    }
    
    /**
     * Unsets the "addDefaultTo" attribute
     */
    public void unsetAddDefaultTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDDEFAULTTO$22);
        }
    }
    
    /**
     * Gets the "addDefaultAction" attribute
     */
    public boolean getAddDefaultAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDDEFAULTACTION$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "addDefaultAction" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAddDefaultAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDDEFAULTACTION$24);
            return target;
        }
    }
    
    /**
     * True if has "addDefaultAction" attribute
     */
    public boolean isSetAddDefaultAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDDEFAULTACTION$24) != null;
        }
    }
    
    /**
     * Sets the "addDefaultAction" attribute
     */
    public void setAddDefaultAction(boolean addDefaultAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDDEFAULTACTION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDDEFAULTACTION$24);
            }
            target.setBooleanValue(addDefaultAction);
        }
    }
    
    /**
     * Sets (as xml) the "addDefaultAction" attribute
     */
    public void xsetAddDefaultAction(org.apache.xmlbeans.XmlBoolean addDefaultAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADDDEFAULTACTION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADDDEFAULTACTION$24);
            }
            target.set(addDefaultAction);
        }
    }
    
    /**
     * Unsets the "addDefaultAction" attribute
     */
    public void unsetAddDefaultAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDDEFAULTACTION$24);
        }
    }
    
    /**
     * Gets the "replyToRefParams" attribute
     */
    public java.lang.String getReplyToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLYTOREFPARAMS$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "replyToRefParams" attribute
     */
    public org.apache.xmlbeans.XmlString xgetReplyToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLYTOREFPARAMS$26);
            return target;
        }
    }
    
    /**
     * True if has "replyToRefParams" attribute
     */
    public boolean isSetReplyToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPLYTOREFPARAMS$26) != null;
        }
    }
    
    /**
     * Sets the "replyToRefParams" attribute
     */
    public void setReplyToRefParams(java.lang.String replyToRefParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLYTOREFPARAMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLYTOREFPARAMS$26);
            }
            target.setStringValue(replyToRefParams);
        }
    }
    
    /**
     * Sets (as xml) the "replyToRefParams" attribute
     */
    public void xsetReplyToRefParams(org.apache.xmlbeans.XmlString replyToRefParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLYTOREFPARAMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPLYTOREFPARAMS$26);
            }
            target.set(replyToRefParams);
        }
    }
    
    /**
     * Unsets the "replyToRefParams" attribute
     */
    public void unsetReplyToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPLYTOREFPARAMS$26);
        }
    }
    
    /**
     * Gets the "faultToRefParams" attribute
     */
    public java.lang.String getFaultToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTTOREFPARAMS$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultToRefParams" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFaultToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTTOREFPARAMS$28);
            return target;
        }
    }
    
    /**
     * True if has "faultToRefParams" attribute
     */
    public boolean isSetFaultToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAULTTOREFPARAMS$28) != null;
        }
    }
    
    /**
     * Sets the "faultToRefParams" attribute
     */
    public void setFaultToRefParams(java.lang.String faultToRefParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTTOREFPARAMS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAULTTOREFPARAMS$28);
            }
            target.setStringValue(faultToRefParams);
        }
    }
    
    /**
     * Sets (as xml) the "faultToRefParams" attribute
     */
    public void xsetFaultToRefParams(org.apache.xmlbeans.XmlString faultToRefParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTTOREFPARAMS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAULTTOREFPARAMS$28);
            }
            target.set(faultToRefParams);
        }
    }
    
    /**
     * Unsets the "faultToRefParams" attribute
     */
    public void unsetFaultToRefParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAULTTOREFPARAMS$28);
        }
    }
}
