/*
 * XML Type:  messageEntry
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.MessageEntry
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML messageEntry(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class MessageEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.log.MessageEntry
{
    private static final long serialVersionUID = 1L;
    
    public MessageEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGECONTENT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "messageContent");
    private static final javax.xml.namespace.QName TIMESTAMP$2 = 
        new javax.xml.namespace.QName("", "timestamp");
    private static final javax.xml.namespace.QName CONVERSATIONID$4 = 
        new javax.xml.namespace.QName("", "conversationID");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    
    
    /**
     * Gets the "messageContent" element
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent getMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent)get_store().find_element_user(MESSAGECONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "messageContent" element
     */
    public boolean isSetMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGECONTENT$0) != 0;
        }
    }
    
    /**
     * Sets the "messageContent" element
     */
    public void setMessageContent(org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent messageContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent)get_store().find_element_user(MESSAGECONTENT$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent)get_store().add_element_user(MESSAGECONTENT$0);
            }
            target.set(messageContent);
        }
    }
    
    /**
     * Appends and returns a new empty "messageContent" element
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent addNewMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent)get_store().add_element_user(MESSAGECONTENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "messageContent" element
     */
    public void unsetMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGECONTENT$0, 0);
        }
    }
    
    /**
     * Gets the "timestamp" attribute
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
            return target;
        }
    }
    
    /**
     * True if has "timestamp" attribute
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMESTAMP$2) != null;
        }
    }
    
    /**
     * Sets the "timestamp" attribute
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" attribute
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$2);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "timestamp" attribute
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMESTAMP$2);
        }
    }
    
    /**
     * Gets the "conversationID" attribute
     */
    public java.lang.String getConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSATIONID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conversationID" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CONVERSATIONID$4);
            return target;
        }
    }
    
    /**
     * True if has "conversationID" attribute
     */
    public boolean isSetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONVERSATIONID$4) != null;
        }
    }
    
    /**
     * Sets the "conversationID" attribute
     */
    public void setConversationID(java.lang.String conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSATIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERSATIONID$4);
            }
            target.setStringValue(conversationID);
        }
    }
    
    /**
     * Sets (as xml) the "conversationID" attribute
     */
    public void xsetConversationID(org.apache.xmlbeans.XmlNMTOKEN conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CONVERSATIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CONVERSATIONID$4);
            }
            target.set(conversationID);
        }
    }
    
    /**
     * Unsets the "conversationID" attribute
     */
    public void unsetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONVERSATIONID$4);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
    /**
     * An XML messageContent(@http://www.ws-i.org/testing/2003/03/log/).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.log.MessageEntry$MessageContent.
     */
    public static class MessageContentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent
    {
        private static final long serialVersionUID = 1L;
        
        public MessageContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected MessageContentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName BOM$0 = 
            new javax.xml.namespace.QName("", "BOM");
        
        
        /**
         * Gets the "BOM" attribute
         */
        public long getBOM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOM$0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "BOM" attribute
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetBOM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BOM$0);
                return target;
            }
        }
        
        /**
         * True if has "BOM" attribute
         */
        public boolean isSetBOM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BOM$0) != null;
            }
        }
        
        /**
         * Sets the "BOM" attribute
         */
        public void setBOM(long bom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOM$0);
                }
                target.setLongValue(bom);
            }
        }
        
        /**
         * Sets (as xml) the "BOM" attribute
         */
        public void xsetBOM(org.apache.xmlbeans.XmlUnsignedInt bom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BOM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BOM$0);
                }
                target.set(bom);
            }
        }
        
        /**
         * Unsets the "BOM" attribute
         */
        public void unsetBOM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BOM$0);
            }
        }
    }
}
