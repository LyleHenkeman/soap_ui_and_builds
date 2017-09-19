/*
 * An XML document type.
 * Localname: error
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * A document containing one error(@http://eviware.com/soapui/junit) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "error");
    
    
    /**
     * Gets the "error" element
     */
    public com.eviware.soapui.junit.ErrorDocument.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(com.eviware.soapui.junit.ErrorDocument.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "error" element
     */
    public com.eviware.soapui.junit.ErrorDocument.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    /**
     * An XML error(@http://eviware.com/soapui/junit).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.junit.ErrorDocument$Error.
     */
    public static class ErrorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.junit.ErrorDocument.Error
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ErrorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName MESSAGE$2 = 
            new javax.xml.namespace.QName("", "message");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
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
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
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
                get_store().remove_attribute(TYPE$0);
            }
        }
        
        /**
         * Gets the "message" attribute
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$2);
                return target;
            }
        }
        
        /**
         * True if has "message" attribute
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGE$2) != null;
            }
        }
        
        /**
         * Sets the "message" attribute
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$2);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" attribute
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$2);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" attribute
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGE$2);
            }
        }
    }
}
