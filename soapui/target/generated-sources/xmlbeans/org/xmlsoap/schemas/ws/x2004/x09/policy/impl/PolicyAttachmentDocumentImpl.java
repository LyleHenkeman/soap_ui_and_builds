/*
 * An XML document type.
 * Localname: PolicyAttachment
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one PolicyAttachment(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class PolicyAttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolicyAttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICYATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "PolicyAttachment");
    
    
    /**
     * Gets the "PolicyAttachment" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment getPolicyAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment)get_store().find_element_user(POLICYATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolicyAttachment" element
     */
    public void setPolicyAttachment(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment policyAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment)get_store().find_element_user(POLICYATTACHMENT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment)get_store().add_element_user(POLICYATTACHMENT$0);
            }
            target.set(policyAttachment);
        }
    }
    
    /**
     * Appends and returns a new empty "PolicyAttachment" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment addNewPolicyAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment)get_store().add_element_user(POLICYATTACHMENT$0);
            return target;
        }
    }
    /**
     * An XML PolicyAttachment(@http://schemas.xmlsoap.org/ws/2004/09/policy).
     *
     * This is a complex type.
     */
    public static class PolicyAttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyAttachmentDocument.PolicyAttachment
    {
        private static final long serialVersionUID = 1L;
        
        public PolicyAttachmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPLIESTO$0 = 
            new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "AppliesTo");
        private static final javax.xml.namespace.QName POLICY$2 = 
            new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "Policy");
        private static final javax.xml.namespace.QName POLICYREFERENCE$4 = 
            new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "PolicyReference");
        
        
        /**
         * Gets the "AppliesTo" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo getAppliesTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AppliesTo" element
         */
        public void setAppliesTo(org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo appliesTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
                }
                target.set(appliesTo);
            }
        }
        
        /**
         * Appends and returns a new empty "AppliesTo" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo addNewAppliesTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "Policy" elements
         */
        public java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy> getPolicyList()
        {
            final class PolicyList extends java.util.AbstractList<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy>
            {
                public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy get(int i)
                    { return PolicyAttachmentImpl.this.getPolicyArray(i); }
                
                public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy o)
                {
                    org.xmlsoap.schemas.ws.x2004.x09.policy.Policy old = PolicyAttachmentImpl.this.getPolicyArray(i);
                    PolicyAttachmentImpl.this.setPolicyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy o)
                    { PolicyAttachmentImpl.this.insertNewPolicy(i).set(o); }
                
                public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy remove(int i)
                {
                    org.xmlsoap.schemas.ws.x2004.x09.policy.Policy old = PolicyAttachmentImpl.this.getPolicyArray(i);
                    PolicyAttachmentImpl.this.removePolicy(i);
                    return old;
                }
                
                public int size()
                    { return PolicyAttachmentImpl.this.sizeOfPolicyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PolicyList();
            }
        }
        
        /**
         * Gets array of all "Policy" elements
         * @deprecated
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[] getPolicyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy> targetList = new java.util.ArrayList<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy>();
                get_store().find_all_element_users(POLICY$2, targetList);
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[] result = new org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Policy" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy getPolicyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Policy" element
         */
        public int sizeOfPolicyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLICY$2);
            }
        }
        
        /**
         * Sets array of all "Policy" element
         */
        public void setPolicyArray(org.xmlsoap.schemas.ws.x2004.x09.policy.Policy[] policyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(policyArray, POLICY$2);
            }
        }
        
        /**
         * Sets ith "Policy" element
         */
        public void setPolicyArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy policy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(policy);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Policy" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy insertNewPolicy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().insert_element_user(POLICY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Policy" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy addNewPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Policy" element
         */
        public void removePolicy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLICY$2, i);
            }
        }
        
        /**
         * Gets a List of "PolicyReference" elements
         */
        public java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference> getPolicyReferenceList()
        {
            final class PolicyReferenceList extends java.util.AbstractList<org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference>
            {
                public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference get(int i)
                    { return PolicyAttachmentImpl.this.getPolicyReferenceArray(i); }
                
                public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference o)
                {
                    org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference old = PolicyAttachmentImpl.this.getPolicyReferenceArray(i);
                    PolicyAttachmentImpl.this.setPolicyReferenceArray(i, o);
                    return old;
                }
                
                public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference o)
                    { PolicyAttachmentImpl.this.insertNewPolicyReference(i).set(o); }
                
                public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference remove(int i)
                {
                    org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference old = PolicyAttachmentImpl.this.getPolicyReferenceArray(i);
                    PolicyAttachmentImpl.this.removePolicyReference(i);
                    return old;
                }
                
                public int size()
                    { return PolicyAttachmentImpl.this.sizeOfPolicyReferenceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PolicyReferenceList();
            }
        }
        
        /**
         * Gets array of all "PolicyReference" elements
         * @deprecated
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[] getPolicyReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference> targetList = new java.util.ArrayList<org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference>();
                get_store().find_all_element_users(POLICYREFERENCE$4, targetList);
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[] result = new org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PolicyReference" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference getPolicyReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PolicyReference" element
         */
        public int sizeOfPolicyReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLICYREFERENCE$4);
            }
        }
        
        /**
         * Sets array of all "PolicyReference" element
         */
        public void setPolicyReferenceArray(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference[] policyReferenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(policyReferenceArray, POLICYREFERENCE$4);
            }
        }
        
        /**
         * Sets ith "PolicyReference" element
         */
        public void setPolicyReferenceArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference policyReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(policyReference);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PolicyReference" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference insertNewPolicyReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().insert_element_user(POLICYREFERENCE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PolicyReference" element
         */
        public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference addNewPolicyReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference target = null;
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().add_element_user(POLICYREFERENCE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "PolicyReference" element
         */
        public void removePolicyReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLICYREFERENCE$4, i);
            }
        }
    }
}
