/*
 * XML Type:  AbstractRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AbstractRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML AbstractRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AbstractRequestConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.AbstractRequestConfig
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRequestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODING$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "encoding");
    private static final javax.xml.namespace.QName ENDPOINT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    private static final javax.xml.namespace.QName REQUEST$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "request");
    private static final javax.xml.namespace.QName ORIGINALURI$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "originalUri");
    private static final javax.xml.namespace.QName ASSERTION$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName CREDENTIALS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "credentials");
    private static final javax.xml.namespace.QName ATTACHMENT$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "attachment");
    private static final javax.xml.namespace.QName JMSCONFIG$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "jmsConfig");
    private static final javax.xml.namespace.QName JMSPROPERTYCONFIG$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "jmsPropertyConfig");
    private static final javax.xml.namespace.QName SSLKEYSTORE$18 = 
        new javax.xml.namespace.QName("", "sslKeystore");
    private static final javax.xml.namespace.QName TIMEOUT$20 = 
        new javax.xml.namespace.QName("", "timeout");
    
    
    /**
     * Gets the "encoding" element
     */
    public java.lang.String getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encoding" element
     */
    public org.apache.xmlbeans.XmlString xgetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCODING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "encoding" element
     */
    public void setEncoding(java.lang.String encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCODING$0);
            }
            target.setStringValue(encoding);
        }
    }
    
    /**
     * Sets (as xml) the "encoding" element
     */
    public void xsetEncoding(org.apache.xmlbeans.XmlString encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCODING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENCODING$0);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Gets the "endpoint" element
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endpoint" element
     */
    public org.apache.xmlbeans.XmlString xgetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endpoint" element
     */
    public void setEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$2);
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) the "endpoint" element
     */
    public void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDPOINT$2);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Gets the "request" element
     */
    public com.eviware.soapui.config.CompressedStringConfig getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(REQUEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(com.eviware.soapui.config.CompressedStringConfig request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(REQUEST$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(REQUEST$4);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public com.eviware.soapui.config.CompressedStringConfig addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(REQUEST$4);
            return target;
        }
    }
    
    /**
     * Gets the "originalUri" element
     */
    public java.lang.String getOriginalUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALURI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "originalUri" element
     */
    public org.apache.xmlbeans.XmlString xgetOriginalUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALURI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "originalUri" element
     */
    public boolean isSetOriginalUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALURI$6) != 0;
        }
    }
    
    /**
     * Sets the "originalUri" element
     */
    public void setOriginalUri(java.lang.String originalUri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALURI$6);
            }
            target.setStringValue(originalUri);
        }
    }
    
    /**
     * Sets (as xml) the "originalUri" element
     */
    public void xsetOriginalUri(org.apache.xmlbeans.XmlString originalUri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINALURI$6);
            }
            target.set(originalUri);
        }
    }
    
    /**
     * Unsets the "originalUri" element
     */
    public void unsetOriginalUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALURI$6, 0);
        }
    }
    
    /**
     * Gets a List of "assertion" elements
     */
    public java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList()
    {
        final class AssertionList extends java.util.AbstractList<com.eviware.soapui.config.TestAssertionConfig>
        {
            public com.eviware.soapui.config.TestAssertionConfig get(int i)
                { return AbstractRequestConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AbstractRequestConfigImpl.this.getAssertionArray(i);
                AbstractRequestConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { AbstractRequestConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AbstractRequestConfigImpl.this.getAssertionArray(i);
                AbstractRequestConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return AbstractRequestConfigImpl.this.sizeOfAssertionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionList();
        }
    }
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestAssertionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestAssertionConfig>();
            get_store().find_all_element_users(ASSERTION$8, targetList);
            com.eviware.soapui.config.TestAssertionConfig[] result = new com.eviware.soapui.config.TestAssertionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertion" element
     */
    public int sizeOfAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTION$8);
        }
    }
    
    /**
     * Sets array of all "assertion" element
     */
    public void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionArray, ASSERTION$8);
        }
    }
    
    /**
     * Sets ith "assertion" element
     */
    public void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().insert_element_user(ASSERTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertion" element
     */
    public void removeAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTION$8, i);
        }
    }
    
    /**
     * Gets the "credentials" element
     */
    public com.eviware.soapui.config.CredentialsConfig getCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CredentialsConfig target = null;
            target = (com.eviware.soapui.config.CredentialsConfig)get_store().find_element_user(CREDENTIALS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "credentials" element
     */
    public void setCredentials(com.eviware.soapui.config.CredentialsConfig credentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CredentialsConfig target = null;
            target = (com.eviware.soapui.config.CredentialsConfig)get_store().find_element_user(CREDENTIALS$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CredentialsConfig)get_store().add_element_user(CREDENTIALS$10);
            }
            target.set(credentials);
        }
    }
    
    /**
     * Appends and returns a new empty "credentials" element
     */
    public com.eviware.soapui.config.CredentialsConfig addNewCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CredentialsConfig target = null;
            target = (com.eviware.soapui.config.CredentialsConfig)get_store().add_element_user(CREDENTIALS$10);
            return target;
        }
    }
    
    /**
     * Gets a List of "attachment" elements
     */
    public java.util.List<com.eviware.soapui.config.AttachmentConfig> getAttachmentList()
    {
        final class AttachmentList extends java.util.AbstractList<com.eviware.soapui.config.AttachmentConfig>
        {
            public com.eviware.soapui.config.AttachmentConfig get(int i)
                { return AbstractRequestConfigImpl.this.getAttachmentArray(i); }
            
            public com.eviware.soapui.config.AttachmentConfig set(int i, com.eviware.soapui.config.AttachmentConfig o)
            {
                com.eviware.soapui.config.AttachmentConfig old = AbstractRequestConfigImpl.this.getAttachmentArray(i);
                AbstractRequestConfigImpl.this.setAttachmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.AttachmentConfig o)
                { AbstractRequestConfigImpl.this.insertNewAttachment(i).set(o); }
            
            public com.eviware.soapui.config.AttachmentConfig remove(int i)
            {
                com.eviware.soapui.config.AttachmentConfig old = AbstractRequestConfigImpl.this.getAttachmentArray(i);
                AbstractRequestConfigImpl.this.removeAttachment(i);
                return old;
            }
            
            public int size()
                { return AbstractRequestConfigImpl.this.sizeOfAttachmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttachmentList();
        }
    }
    
    /**
     * Gets array of all "attachment" elements
     * @deprecated
     */
    public com.eviware.soapui.config.AttachmentConfig[] getAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.AttachmentConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.AttachmentConfig>();
            get_store().find_all_element_users(ATTACHMENT$12, targetList);
            com.eviware.soapui.config.AttachmentConfig[] result = new com.eviware.soapui.config.AttachmentConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attachment" element
     */
    public com.eviware.soapui.config.AttachmentConfig getAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AttachmentConfig target = null;
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().find_element_user(ATTACHMENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attachment" element
     */
    public int sizeOfAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENT$12);
        }
    }
    
    /**
     * Sets array of all "attachment" element
     */
    public void setAttachmentArray(com.eviware.soapui.config.AttachmentConfig[] attachmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentArray, ATTACHMENT$12);
        }
    }
    
    /**
     * Sets ith "attachment" element
     */
    public void setAttachmentArray(int i, com.eviware.soapui.config.AttachmentConfig attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AttachmentConfig target = null;
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().find_element_user(ATTACHMENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attachment" element
     */
    public com.eviware.soapui.config.AttachmentConfig insertNewAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AttachmentConfig target = null;
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().insert_element_user(ATTACHMENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attachment" element
     */
    public com.eviware.soapui.config.AttachmentConfig addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AttachmentConfig target = null;
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().add_element_user(ATTACHMENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "attachment" element
     */
    public void removeAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENT$12, i);
        }
    }
    
    /**
     * Gets the "jmsConfig" element
     */
    public com.eviware.soapui.config.JMSHeaderConfConfig getJmsConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSHeaderConfConfig target = null;
            target = (com.eviware.soapui.config.JMSHeaderConfConfig)get_store().find_element_user(JMSCONFIG$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jmsConfig" element
     */
    public boolean isSetJmsConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JMSCONFIG$14) != 0;
        }
    }
    
    /**
     * Sets the "jmsConfig" element
     */
    public void setJmsConfig(com.eviware.soapui.config.JMSHeaderConfConfig jmsConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSHeaderConfConfig target = null;
            target = (com.eviware.soapui.config.JMSHeaderConfConfig)get_store().find_element_user(JMSCONFIG$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.JMSHeaderConfConfig)get_store().add_element_user(JMSCONFIG$14);
            }
            target.set(jmsConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "jmsConfig" element
     */
    public com.eviware.soapui.config.JMSHeaderConfConfig addNewJmsConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSHeaderConfConfig target = null;
            target = (com.eviware.soapui.config.JMSHeaderConfConfig)get_store().add_element_user(JMSCONFIG$14);
            return target;
        }
    }
    
    /**
     * Unsets the "jmsConfig" element
     */
    public void unsetJmsConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JMSCONFIG$14, 0);
        }
    }
    
    /**
     * Gets the "jmsPropertyConfig" element
     */
    public com.eviware.soapui.config.JMSPropertiesConfConfig getJmsPropertyConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertiesConfConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertiesConfConfig)get_store().find_element_user(JMSPROPERTYCONFIG$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jmsPropertyConfig" element
     */
    public boolean isSetJmsPropertyConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JMSPROPERTYCONFIG$16) != 0;
        }
    }
    
    /**
     * Sets the "jmsPropertyConfig" element
     */
    public void setJmsPropertyConfig(com.eviware.soapui.config.JMSPropertiesConfConfig jmsPropertyConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertiesConfConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertiesConfConfig)get_store().find_element_user(JMSPROPERTYCONFIG$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.JMSPropertiesConfConfig)get_store().add_element_user(JMSPROPERTYCONFIG$16);
            }
            target.set(jmsPropertyConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "jmsPropertyConfig" element
     */
    public com.eviware.soapui.config.JMSPropertiesConfConfig addNewJmsPropertyConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertiesConfConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertiesConfConfig)get_store().add_element_user(JMSPROPERTYCONFIG$16);
            return target;
        }
    }
    
    /**
     * Unsets the "jmsPropertyConfig" element
     */
    public void unsetJmsPropertyConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JMSPROPERTYCONFIG$16, 0);
        }
    }
    
    /**
     * Gets the "sslKeystore" attribute
     */
    public java.lang.String getSslKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SSLKEYSTORE$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sslKeystore" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSslKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SSLKEYSTORE$18);
            return target;
        }
    }
    
    /**
     * True if has "sslKeystore" attribute
     */
    public boolean isSetSslKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SSLKEYSTORE$18) != null;
        }
    }
    
    /**
     * Sets the "sslKeystore" attribute
     */
    public void setSslKeystore(java.lang.String sslKeystore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SSLKEYSTORE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SSLKEYSTORE$18);
            }
            target.setStringValue(sslKeystore);
        }
    }
    
    /**
     * Sets (as xml) the "sslKeystore" attribute
     */
    public void xsetSslKeystore(org.apache.xmlbeans.XmlString sslKeystore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SSLKEYSTORE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SSLKEYSTORE$18);
            }
            target.set(sslKeystore);
        }
    }
    
    /**
     * Unsets the "sslKeystore" attribute
     */
    public void unsetSslKeystore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SSLKEYSTORE$18);
        }
    }
    
    /**
     * Gets the "timeout" attribute
     */
    public java.lang.String getTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeout" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMEOUT$20);
            return target;
        }
    }
    
    /**
     * True if has "timeout" attribute
     */
    public boolean isSetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEOUT$20) != null;
        }
    }
    
    /**
     * Sets the "timeout" attribute
     */
    public void setTimeout(java.lang.String timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEOUT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEOUT$20);
            }
            target.setStringValue(timeout);
        }
    }
    
    /**
     * Sets (as xml) the "timeout" attribute
     */
    public void xsetTimeout(org.apache.xmlbeans.XmlString timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMEOUT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMEOUT$20);
            }
            target.set(timeout);
        }
    }
    
    /**
     * Unsets the "timeout" attribute
     */
    public void unsetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEOUT$20);
        }
    }
}
