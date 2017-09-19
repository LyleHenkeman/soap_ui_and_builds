/*
 * XML Type:  log
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.Log
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML log(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class LogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.log.Log
{
    private static final long serialVersionUID = 1L;
    
    public LogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONITOR$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "monitor");
    private static final javax.xml.namespace.QName MESSAGEENTRY$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "messageEntry");
    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
        new javax.xml.namespace.QName("", "timestamp");
    
    
    /**
     * Gets the "monitor" element
     */
    public org.wsI.testing.x2003.x03.log.Monitor getMonitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Monitor target = null;
            target = (org.wsI.testing.x2003.x03.log.Monitor)get_store().find_element_user(MONITOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "monitor" element
     */
    public void setMonitor(org.wsI.testing.x2003.x03.log.Monitor monitor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Monitor target = null;
            target = (org.wsI.testing.x2003.x03.log.Monitor)get_store().find_element_user(MONITOR$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.Monitor)get_store().add_element_user(MONITOR$0);
            }
            target.set(monitor);
        }
    }
    
    /**
     * Appends and returns a new empty "monitor" element
     */
    public org.wsI.testing.x2003.x03.log.Monitor addNewMonitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Monitor target = null;
            target = (org.wsI.testing.x2003.x03.log.Monitor)get_store().add_element_user(MONITOR$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "messageEntry" elements
     */
    public java.util.List<org.wsI.testing.x2003.x03.log.MessageEntry> getMessageEntryList()
    {
        final class MessageEntryList extends java.util.AbstractList<org.wsI.testing.x2003.x03.log.MessageEntry>
        {
            public org.wsI.testing.x2003.x03.log.MessageEntry get(int i)
                { return LogImpl.this.getMessageEntryArray(i); }
            
            public org.wsI.testing.x2003.x03.log.MessageEntry set(int i, org.wsI.testing.x2003.x03.log.MessageEntry o)
            {
                org.wsI.testing.x2003.x03.log.MessageEntry old = LogImpl.this.getMessageEntryArray(i);
                LogImpl.this.setMessageEntryArray(i, o);
                return old;
            }
            
            public void add(int i, org.wsI.testing.x2003.x03.log.MessageEntry o)
                { LogImpl.this.insertNewMessageEntry(i).set(o); }
            
            public org.wsI.testing.x2003.x03.log.MessageEntry remove(int i)
            {
                org.wsI.testing.x2003.x03.log.MessageEntry old = LogImpl.this.getMessageEntryArray(i);
                LogImpl.this.removeMessageEntry(i);
                return old;
            }
            
            public int size()
                { return LogImpl.this.sizeOfMessageEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageEntryList();
        }
    }
    
    /**
     * Gets array of all "messageEntry" elements
     * @deprecated
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry[] getMessageEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.wsI.testing.x2003.x03.log.MessageEntry> targetList = new java.util.ArrayList<org.wsI.testing.x2003.x03.log.MessageEntry>();
            get_store().find_all_element_users(MESSAGEENTRY$2, targetList);
            org.wsI.testing.x2003.x03.log.MessageEntry[] result = new org.wsI.testing.x2003.x03.log.MessageEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageEntry" element
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry getMessageEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry)get_store().find_element_user(MESSAGEENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageEntry" element
     */
    public int sizeOfMessageEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEENTRY$2);
        }
    }
    
    /**
     * Sets array of all "messageEntry" element
     */
    public void setMessageEntryArray(org.wsI.testing.x2003.x03.log.MessageEntry[] messageEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageEntryArray, MESSAGEENTRY$2);
        }
    }
    
    /**
     * Sets ith "messageEntry" element
     */
    public void setMessageEntryArray(int i, org.wsI.testing.x2003.x03.log.MessageEntry messageEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry)get_store().find_element_user(MESSAGEENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageEntry" element
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry insertNewMessageEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry)get_store().insert_element_user(MESSAGEENTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageEntry" element
     */
    public org.wsI.testing.x2003.x03.log.MessageEntry addNewMessageEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.MessageEntry target = null;
            target = (org.wsI.testing.x2003.x03.log.MessageEntry)get_store().add_element_user(MESSAGEENTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageEntry" element
     */
    public void removeMessageEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEENTRY$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$4);
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
            return get_store().find_attribute_user(TIMESTAMP$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$4);
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
            get_store().remove_attribute(TIMESTAMP$4);
        }
    }
}
