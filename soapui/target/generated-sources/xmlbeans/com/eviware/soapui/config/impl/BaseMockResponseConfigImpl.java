/*
 * XML Type:  BaseMockResponse
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockResponseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML BaseMockResponse(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class BaseMockResponseConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.BaseMockResponseConfig
{
    private static final long serialVersionUID = 1L;
    
    public BaseMockResponseConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "script");
    private static final javax.xml.namespace.QName RESPONSECONTENT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "responseContent");
    private static final javax.xml.namespace.QName ATTACHMENT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "attachment");
    private static final javax.xml.namespace.QName HEADER$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "header");
    private static final javax.xml.namespace.QName HTTPRESPONSESTATUS$8 = 
        new javax.xml.namespace.QName("", "httpResponseStatus");
    private static final javax.xml.namespace.QName DISABLED$10 = 
        new javax.xml.namespace.QName("", "disabled");
    private static final javax.xml.namespace.QName COMPRESSION$12 = 
        new javax.xml.namespace.QName("", "compression");
    private static final javax.xml.namespace.QName ENCODING$14 = 
        new javax.xml.namespace.QName("", "encoding");
    
    
    /**
     * Gets the "script" element
     */
    public com.eviware.soapui.config.ScriptConfig getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "script" element
     */
    public boolean isSetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPT$0) != 0;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(com.eviware.soapui.config.ScriptConfig script)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SCRIPT$0);
            }
            target.set(script);
        }
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "script" element
     */
    public void unsetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPT$0, 0);
        }
    }
    
    /**
     * Gets the "responseContent" element
     */
    public com.eviware.soapui.config.CompressedStringConfig getResponseContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(RESPONSECONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseContent" element
     */
    public void setResponseContent(com.eviware.soapui.config.CompressedStringConfig responseContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().find_element_user(RESPONSECONTENT$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(RESPONSECONTENT$2);
            }
            target.set(responseContent);
        }
    }
    
    /**
     * Appends and returns a new empty "responseContent" element
     */
    public com.eviware.soapui.config.CompressedStringConfig addNewResponseContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CompressedStringConfig target = null;
            target = (com.eviware.soapui.config.CompressedStringConfig)get_store().add_element_user(RESPONSECONTENT$2);
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
                { return BaseMockResponseConfigImpl.this.getAttachmentArray(i); }
            
            public com.eviware.soapui.config.AttachmentConfig set(int i, com.eviware.soapui.config.AttachmentConfig o)
            {
                com.eviware.soapui.config.AttachmentConfig old = BaseMockResponseConfigImpl.this.getAttachmentArray(i);
                BaseMockResponseConfigImpl.this.setAttachmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.AttachmentConfig o)
                { BaseMockResponseConfigImpl.this.insertNewAttachment(i).set(o); }
            
            public com.eviware.soapui.config.AttachmentConfig remove(int i)
            {
                com.eviware.soapui.config.AttachmentConfig old = BaseMockResponseConfigImpl.this.getAttachmentArray(i);
                BaseMockResponseConfigImpl.this.removeAttachment(i);
                return old;
            }
            
            public int size()
                { return BaseMockResponseConfigImpl.this.sizeOfAttachmentArray(); }
            
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
            get_store().find_all_element_users(ATTACHMENT$4, targetList);
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
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().find_element_user(ATTACHMENT$4, i);
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
            return get_store().count_elements(ATTACHMENT$4);
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
            arraySetterHelper(attachmentArray, ATTACHMENT$4);
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
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().find_element_user(ATTACHMENT$4, i);
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
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().insert_element_user(ATTACHMENT$4, i);
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
            target = (com.eviware.soapui.config.AttachmentConfig)get_store().add_element_user(ATTACHMENT$4);
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
            get_store().remove_element(ATTACHMENT$4, i);
        }
    }
    
    /**
     * Gets a List of "header" elements
     */
    public java.util.List<com.eviware.soapui.config.HeaderConfig> getHeaderList()
    {
        final class HeaderList extends java.util.AbstractList<com.eviware.soapui.config.HeaderConfig>
        {
            public com.eviware.soapui.config.HeaderConfig get(int i)
                { return BaseMockResponseConfigImpl.this.getHeaderArray(i); }
            
            public com.eviware.soapui.config.HeaderConfig set(int i, com.eviware.soapui.config.HeaderConfig o)
            {
                com.eviware.soapui.config.HeaderConfig old = BaseMockResponseConfigImpl.this.getHeaderArray(i);
                BaseMockResponseConfigImpl.this.setHeaderArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.HeaderConfig o)
                { BaseMockResponseConfigImpl.this.insertNewHeader(i).set(o); }
            
            public com.eviware.soapui.config.HeaderConfig remove(int i)
            {
                com.eviware.soapui.config.HeaderConfig old = BaseMockResponseConfigImpl.this.getHeaderArray(i);
                BaseMockResponseConfigImpl.this.removeHeader(i);
                return old;
            }
            
            public int size()
                { return BaseMockResponseConfigImpl.this.sizeOfHeaderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HeaderList();
        }
    }
    
    /**
     * Gets array of all "header" elements
     * @deprecated
     */
    public com.eviware.soapui.config.HeaderConfig[] getHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.HeaderConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.HeaderConfig>();
            get_store().find_all_element_users(HEADER$6, targetList);
            com.eviware.soapui.config.HeaderConfig[] result = new com.eviware.soapui.config.HeaderConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "header" element
     */
    public com.eviware.soapui.config.HeaderConfig getHeaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.HeaderConfig target = null;
            target = (com.eviware.soapui.config.HeaderConfig)get_store().find_element_user(HEADER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "header" element
     */
    public int sizeOfHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADER$6);
        }
    }
    
    /**
     * Sets array of all "header" element
     */
    public void setHeaderArray(com.eviware.soapui.config.HeaderConfig[] headerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headerArray, HEADER$6);
        }
    }
    
    /**
     * Sets ith "header" element
     */
    public void setHeaderArray(int i, com.eviware.soapui.config.HeaderConfig header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.HeaderConfig target = null;
            target = (com.eviware.soapui.config.HeaderConfig)get_store().find_element_user(HEADER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(header);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "header" element
     */
    public com.eviware.soapui.config.HeaderConfig insertNewHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.HeaderConfig target = null;
            target = (com.eviware.soapui.config.HeaderConfig)get_store().insert_element_user(HEADER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "header" element
     */
    public com.eviware.soapui.config.HeaderConfig addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.HeaderConfig target = null;
            target = (com.eviware.soapui.config.HeaderConfig)get_store().add_element_user(HEADER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "header" element
     */
    public void removeHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADER$6, i);
        }
    }
    
    /**
     * Gets the "httpResponseStatus" attribute
     */
    public java.lang.String getHttpResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPRESPONSESTATUS$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "httpResponseStatus" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHttpResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPRESPONSESTATUS$8);
            return target;
        }
    }
    
    /**
     * True if has "httpResponseStatus" attribute
     */
    public boolean isSetHttpResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HTTPRESPONSESTATUS$8) != null;
        }
    }
    
    /**
     * Sets the "httpResponseStatus" attribute
     */
    public void setHttpResponseStatus(java.lang.String httpResponseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPRESPONSESTATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTTPRESPONSESTATUS$8);
            }
            target.setStringValue(httpResponseStatus);
        }
    }
    
    /**
     * Sets (as xml) the "httpResponseStatus" attribute
     */
    public void xsetHttpResponseStatus(org.apache.xmlbeans.XmlString httpResponseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPRESPONSESTATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HTTPRESPONSESTATUS$8);
            }
            target.set(httpResponseStatus);
        }
    }
    
    /**
     * Unsets the "httpResponseStatus" attribute
     */
    public void unsetHttpResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HTTPRESPONSESTATUS$8);
        }
    }
    
    /**
     * Gets the "disabled" attribute
     */
    public boolean getDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$10);
            return target;
        }
    }
    
    /**
     * True if has "disabled" attribute
     */
    public boolean isSetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLED$10) != null;
        }
    }
    
    /**
     * Sets the "disabled" attribute
     */
    public void setDisabled(boolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$10);
            }
            target.setBooleanValue(disabled);
        }
    }
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$10);
            }
            target.set(disabled);
        }
    }
    
    /**
     * Unsets the "disabled" attribute
     */
    public void unsetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLED$10);
        }
    }
    
    /**
     * Gets the "compression" attribute
     */
    public java.lang.String getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPRESSION$12);
            return target;
        }
    }
    
    /**
     * True if has "compression" attribute
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPRESSION$12) != null;
        }
    }
    
    /**
     * Sets the "compression" attribute
     */
    public void setCompression(java.lang.String compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPRESSION$12);
            }
            target.setStringValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    public void xsetCompression(org.apache.xmlbeans.XmlString compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPRESSION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPRESSION$12);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" attribute
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPRESSION$12);
        }
    }
    
    /**
     * Gets the "encoding" attribute
     */
    public java.lang.String getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encoding" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$14);
            return target;
        }
    }
    
    /**
     * True if has "encoding" attribute
     */
    public boolean isSetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODING$14) != null;
        }
    }
    
    /**
     * Sets the "encoding" attribute
     */
    public void setEncoding(java.lang.String encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODING$14);
            }
            target.setStringValue(encoding);
        }
    }
    
    /**
     * Sets (as xml) the "encoding" attribute
     */
    public void xsetEncoding(org.apache.xmlbeans.XmlString encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODING$14);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Unsets the "encoding" attribute
     */
    public void unsetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODING$14);
        }
    }
}
