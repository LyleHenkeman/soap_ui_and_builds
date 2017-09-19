/*
 * XML Type:  MessageContentAssertion
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MessageContentAssertionConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MessageContentAssertion(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MessageContentAssertionConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MessageContentAssertionConfig
{
    private static final long serialVersionUID = 1L;
    
    public MessageContentAssertionConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENTS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "elements");
    private static final javax.xml.namespace.QName ORIGINALMESSAGE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "originalMessage");
    
    
    /**
     * Gets a List of "elements" elements
     */
    public java.util.List<com.eviware.soapui.config.MessageContentElementConfig> getElementsList()
    {
        final class ElementsList extends java.util.AbstractList<com.eviware.soapui.config.MessageContentElementConfig>
        {
            public com.eviware.soapui.config.MessageContentElementConfig get(int i)
                { return MessageContentAssertionConfigImpl.this.getElementsArray(i); }
            
            public com.eviware.soapui.config.MessageContentElementConfig set(int i, com.eviware.soapui.config.MessageContentElementConfig o)
            {
                com.eviware.soapui.config.MessageContentElementConfig old = MessageContentAssertionConfigImpl.this.getElementsArray(i);
                MessageContentAssertionConfigImpl.this.setElementsArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MessageContentElementConfig o)
                { MessageContentAssertionConfigImpl.this.insertNewElements(i).set(o); }
            
            public com.eviware.soapui.config.MessageContentElementConfig remove(int i)
            {
                com.eviware.soapui.config.MessageContentElementConfig old = MessageContentAssertionConfigImpl.this.getElementsArray(i);
                MessageContentAssertionConfigImpl.this.removeElements(i);
                return old;
            }
            
            public int size()
                { return MessageContentAssertionConfigImpl.this.sizeOfElementsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ElementsList();
        }
    }
    
    /**
     * Gets array of all "elements" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MessageContentElementConfig[] getElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MessageContentElementConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MessageContentElementConfig>();
            get_store().find_all_element_users(ELEMENTS$0, targetList);
            com.eviware.soapui.config.MessageContentElementConfig[] result = new com.eviware.soapui.config.MessageContentElementConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "elements" element
     */
    public com.eviware.soapui.config.MessageContentElementConfig getElementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MessageContentElementConfig target = null;
            target = (com.eviware.soapui.config.MessageContentElementConfig)get_store().find_element_user(ELEMENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "elements" element
     */
    public int sizeOfElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENTS$0);
        }
    }
    
    /**
     * Sets array of all "elements" element
     */
    public void setElementsArray(com.eviware.soapui.config.MessageContentElementConfig[] elementsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(elementsArray, ELEMENTS$0);
        }
    }
    
    /**
     * Sets ith "elements" element
     */
    public void setElementsArray(int i, com.eviware.soapui.config.MessageContentElementConfig elements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MessageContentElementConfig target = null;
            target = (com.eviware.soapui.config.MessageContentElementConfig)get_store().find_element_user(ELEMENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(elements);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "elements" element
     */
    public com.eviware.soapui.config.MessageContentElementConfig insertNewElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MessageContentElementConfig target = null;
            target = (com.eviware.soapui.config.MessageContentElementConfig)get_store().insert_element_user(ELEMENTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "elements" element
     */
    public com.eviware.soapui.config.MessageContentElementConfig addNewElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MessageContentElementConfig target = null;
            target = (com.eviware.soapui.config.MessageContentElementConfig)get_store().add_element_user(ELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "elements" element
     */
    public void removeElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENTS$0, i);
        }
    }
    
    /**
     * Gets the "originalMessage" element
     */
    public com.eviware.soapui.config.CompressedStringConfig getOriginalMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(ORIGINALMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "originalMessage" element
     */
    public void setOriginalMessage(com.eviware.soapui.config.CompressedStringConfig originalMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(ORIGINALMESSAGE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(ORIGINALMESSAGE$2);
            }
            target.set(originalMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "originalMessage" element
     */
    public com.eviware.soapui.config.CompressedStringConfig addNewOriginalMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(ORIGINALMESSAGE$2);
            return target;
        }
    }
}
