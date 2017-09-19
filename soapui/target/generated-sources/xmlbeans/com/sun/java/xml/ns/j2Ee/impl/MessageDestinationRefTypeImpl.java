/*
 * XML Type:  message-destination-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MessageDestinationRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML message-destination-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class MessageDestinationRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.MessageDestinationRefType
{
    private static final long serialVersionUID = 1L;
    
    public MessageDestinationRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-ref-name");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-type");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONUSAGE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-usage");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONLINK$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-link");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return MessageDestinationRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MessageDestinationRefTypeImpl.this.getDescriptionArray(i);
                MessageDestinationRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { MessageDestinationRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MessageDestinationRefTypeImpl.this.getDescriptionArray(i);
                MessageDestinationRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return MessageDestinationRefTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.j2Ee.DescriptionType[] result = new com.sun.java.xml.ns.j2Ee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets the "message-destination-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType getMessageDestinationRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(MESSAGEDESTINATIONREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-ref-name" element
     */
    public void setMessageDestinationRefName(com.sun.java.xml.ns.j2Ee.JndiNameType messageDestinationRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(MESSAGEDESTINATIONREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(MESSAGEDESTINATIONREFNAME$2);
            }
            target.set(messageDestinationRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType addNewMessageDestinationRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(MESSAGEDESTINATIONREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "message-destination-type" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType getMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType)get_store().find_element_user(MESSAGEDESTINATIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-type" element
     */
    public void setMessageDestinationType(com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType messageDestinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType)get_store().find_element_user(MESSAGEDESTINATIONTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType)get_store().add_element_user(MESSAGEDESTINATIONTYPE$4);
            }
            target.set(messageDestinationType);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-type" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType addNewMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationTypeType)get_store().add_element_user(MESSAGEDESTINATIONTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "message-destination-usage" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType getMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType)get_store().find_element_user(MESSAGEDESTINATIONUSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-usage" element
     */
    public void setMessageDestinationUsage(com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType messageDestinationUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType)get_store().find_element_user(MESSAGEDESTINATIONUSAGE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType)get_store().add_element_user(MESSAGEDESTINATIONUSAGE$6);
            }
            target.set(messageDestinationUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-usage" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType addNewMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationUsageType)get_store().add_element_user(MESSAGEDESTINATIONUSAGE$6);
            return target;
        }
    }
    
    /**
     * Gets the "message-destination-link" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType getMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType)get_store().find_element_user(MESSAGEDESTINATIONLINK$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "message-destination-link" element
     */
    public boolean isSetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONLINK$8) != 0;
        }
    }
    
    /**
     * Sets the "message-destination-link" element
     */
    public void setMessageDestinationLink(com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType messageDestinationLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType)get_store().find_element_user(MESSAGEDESTINATIONLINK$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType)get_store().add_element_user(MESSAGEDESTINATIONLINK$8);
            }
            target.set(messageDestinationLink);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-link" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType addNewMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationLinkType)get_store().add_element_user(MESSAGEDESTINATIONLINK$8);
            return target;
        }
    }
    
    /**
     * Unsets the "message-destination-link" element
     */
    public void unsetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONLINK$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
}
