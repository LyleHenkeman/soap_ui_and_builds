/*
 * An XML document type.
 * Localname: Addressing
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.AddressingDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one Addressing(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public class AddressingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.AddressingDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSING$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "Addressing");
    
    
    /**
     * Gets the "Addressing" element
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing getAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().find_element_user(ADDRESSING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Addressing" element
     */
    public void setAddressing(org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().find_element_user(ADDRESSING$0, 0);
            if (target == null)
            {
                target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().add_element_user(ADDRESSING$0);
            }
            target.set(addressing);
        }
    }
    
    /**
     * Appends and returns a new empty "Addressing" element
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addNewAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().add_element_user(ADDRESSING$0);
            return target;
        }
    }
    /**
     * An XML Addressing(@http://www.w3.org/2007/05/addressing/metadata).
     *
     * This is a complex type.
     */
    public static class AddressingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing
    {
        private static final long serialVersionUID = 1L;
        
        public AddressingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POLICY$0 = 
            new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "Policy");
        private static final javax.xml.namespace.QName OPTIONAL$2 = 
            new javax.xml.namespace.QName("", "Optional");
        
        
        /**
         * Gets the "Policy" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy getPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Policy" element
         */
        public void setPolicy(org.xmlsoap.schemas.ws.x2004.x09.policy.Policy policy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$0);
                }
                target.set(policy);
            }
        }
        
        /**
         * Appends and returns a new empty "Policy" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy addNewPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$0);
                return target;
            }
        }
        
        /**
         * Gets the "Optional" attribute
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType.Enum getOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$2);
                if (target == null)
                {
                    return null;
                }
                return (org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Optional" attribute
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType xgetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType)get_store().find_attribute_user(OPTIONAL$2);
                return target;
            }
        }
        
        /**
         * True if has "Optional" attribute
         */
        public boolean isSetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPTIONAL$2) != null;
            }
        }
        
        /**
         * Sets the "Optional" attribute
         */
        public void setOptional(org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType.Enum optional)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIONAL$2);
                }
                target.setEnumValue(optional);
            }
        }
        
        /**
         * Sets (as xml) the "Optional" attribute
         */
        public void xsetOptional(org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType optional)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType)get_store().find_attribute_user(OPTIONAL$2);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OptionalType)get_store().add_attribute_user(OPTIONAL$2);
                }
                target.set(optional);
            }
        }
        
        /**
         * Unsets the "Optional" attribute
         */
        public void unsetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPTIONAL$2);
            }
        }
    }
}
