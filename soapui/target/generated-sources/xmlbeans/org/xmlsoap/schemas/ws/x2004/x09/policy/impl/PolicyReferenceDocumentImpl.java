/*
 * An XML document type.
 * Localname: PolicyReference
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one PolicyReference(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class PolicyReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolicyReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICYREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "PolicyReference");
    
    
    /**
     * Gets the "PolicyReference" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference getPolicyReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolicyReference" element
     */
    public void setPolicyReference(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference policyReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().add_element_user(POLICYREFERENCE$0);
            }
            target.set(policyReference);
        }
    }
    
    /**
     * Appends and returns a new empty "PolicyReference" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference addNewPolicyReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().add_element_user(POLICYREFERENCE$0);
            return target;
        }
    }
    /**
     * An XML PolicyReference(@http://schemas.xmlsoap.org/ws/2004/09/policy).
     *
     * This is a complex type.
     */
    public static class PolicyReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference
    {
        private static final long serialVersionUID = 1L;
        
        public PolicyReferenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URI$0 = 
            new javax.xml.namespace.QName("", "URI");
        private static final javax.xml.namespace.QName DIGEST$2 = 
            new javax.xml.namespace.QName("", "Digest");
        private static final javax.xml.namespace.QName DIGESTALGORITHM$4 = 
            new javax.xml.namespace.QName("", "DigestAlgorithm");
        
        
        /**
         * Gets the "URI" attribute
         */
        public java.lang.String getURI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URI" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetURI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
                return target;
            }
        }
        
        /**
         * Sets the "URI" attribute
         */
        public void setURI(java.lang.String uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$0);
                }
                target.setStringValue(uri);
            }
        }
        
        /**
         * Sets (as xml) the "URI" attribute
         */
        public void xsetURI(org.apache.xmlbeans.XmlAnyURI uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$0);
                }
                target.set(uri);
            }
        }
        
        /**
         * Gets the "Digest" attribute
         */
        public byte[] getDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIGEST$2);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "Digest" attribute
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(DIGEST$2);
                return target;
            }
        }
        
        /**
         * True if has "Digest" attribute
         */
        public boolean isSetDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIGEST$2) != null;
            }
        }
        
        /**
         * Sets the "Digest" attribute
         */
        public void setDigest(byte[] digest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIGEST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIGEST$2);
                }
                target.setByteArrayValue(digest);
            }
        }
        
        /**
         * Sets (as xml) the "Digest" attribute
         */
        public void xsetDigest(org.apache.xmlbeans.XmlBase64Binary digest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(DIGEST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(DIGEST$2);
                }
                target.set(digest);
            }
        }
        
        /**
         * Unsets the "Digest" attribute
         */
        public void unsetDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIGEST$2);
            }
        }
        
        /**
         * Gets the "DigestAlgorithm" attribute
         */
        public java.lang.String getDigestAlgorithm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIGESTALGORITHM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIGESTALGORITHM$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DigestAlgorithm" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetDigestAlgorithm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DIGESTALGORITHM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(DIGESTALGORITHM$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "DigestAlgorithm" attribute
         */
        public boolean isSetDigestAlgorithm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIGESTALGORITHM$4) != null;
            }
        }
        
        /**
         * Sets the "DigestAlgorithm" attribute
         */
        public void setDigestAlgorithm(java.lang.String digestAlgorithm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIGESTALGORITHM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIGESTALGORITHM$4);
                }
                target.setStringValue(digestAlgorithm);
            }
        }
        
        /**
         * Sets (as xml) the "DigestAlgorithm" attribute
         */
        public void xsetDigestAlgorithm(org.apache.xmlbeans.XmlAnyURI digestAlgorithm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DIGESTALGORITHM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(DIGESTALGORITHM$4);
                }
                target.set(digestAlgorithm);
            }
        }
        
        /**
         * Unsets the "DigestAlgorithm" attribute
         */
        public void unsetDigestAlgorithm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIGESTALGORITHM$4);
            }
        }
    }
}
