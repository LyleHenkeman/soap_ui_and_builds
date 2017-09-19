/*
 * XML Type:  OperatorContentType
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * An XML OperatorContentType(@http://schemas.xmlsoap.org/ws/2004/09/policy).
 *
 * This is a complex type.
 */
public class OperatorContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType
{
    private static final long serialVersionUID = 1L;
    
    public OperatorContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "Policy");
    private static final javax.xml.namespace.QName ALL$2 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "All");
    private static final javax.xml.namespace.QName EXACTLYONE$4 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "ExactlyOne");
    private static final javax.xml.namespace.QName POLICYREFERENCE$6 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "PolicyReference");
    private static final javax.xml.namespace.QName ADDRESSING$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "Addressing");
    private static final javax.xml.namespace.QName ANONYMOUSRESPONSES$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "AnonymousResponses");
    private static final javax.xml.namespace.QName NONANONYMOUSRESPONSES$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "NonAnonymousResponses");
    private static final javax.xml.namespace.QName USINGADDRESSING$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/2006/05/addressing/wsdl", "UsingAddressing");
    
    
    /**
     * Gets a List of "Policy" elements
     */
    public java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy> getPolicyList()
    {
        final class PolicyList extends java.util.AbstractList<org.xmlsoap.schemas.ws.x2004.x09.policy.Policy>
        {
            public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy get(int i)
                { return OperatorContentTypeImpl.this.getPolicyArray(i); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy o)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy old = OperatorContentTypeImpl.this.getPolicyArray(i);
                OperatorContentTypeImpl.this.setPolicyArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.Policy o)
                { OperatorContentTypeImpl.this.insertNewPolicy(i).set(o); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy remove(int i)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.Policy old = OperatorContentTypeImpl.this.getPolicyArray(i);
                OperatorContentTypeImpl.this.removePolicy(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfPolicyArray(); }
            
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
            get_store().find_all_element_users(POLICY$0, targetList);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, i);
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
            return get_store().count_elements(POLICY$0);
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
            arraySetterHelper(policyArray, POLICY$0);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, i);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().insert_element_user(POLICY$0, i);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$0);
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
            get_store().remove_element(POLICY$0, i);
        }
    }
    
    /**
     * Gets a List of "All" elements
     */
    public java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType> getAllList()
    {
        final class AllList extends java.util.AbstractList<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType>
        {
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType get(int i)
                { return OperatorContentTypeImpl.this.getAllArray(i); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType o)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType old = OperatorContentTypeImpl.this.getAllArray(i);
                OperatorContentTypeImpl.this.setAllArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType o)
                { OperatorContentTypeImpl.this.insertNewAll(i).set(o); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType remove(int i)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType old = OperatorContentTypeImpl.this.getAllArray(i);
                OperatorContentTypeImpl.this.removeAll(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfAllArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AllList();
        }
    }
    
    /**
     * Gets array of all "All" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] getAllArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType> targetList = new java.util.ArrayList<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType>();
            get_store().find_all_element_users(ALL$2, targetList);
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] result = new org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "All" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType getAllArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(ALL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "All" element
     */
    public int sizeOfAllArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$2);
        }
    }
    
    /**
     * Sets array of all "All" element
     */
    public void setAllArray(org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] allArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(allArray, ALL$2);
        }
    }
    
    /**
     * Sets ith "All" element
     */
    public void setAllArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(ALL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(all);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "All" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType insertNewAll(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().insert_element_user(ALL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "All" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(ALL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "All" element
     */
    public void removeAll(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$2, i);
        }
    }
    
    /**
     * Gets a List of "ExactlyOne" elements
     */
    public java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType> getExactlyOneList()
    {
        final class ExactlyOneList extends java.util.AbstractList<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType>
        {
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType get(int i)
                { return OperatorContentTypeImpl.this.getExactlyOneArray(i); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType o)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType old = OperatorContentTypeImpl.this.getExactlyOneArray(i);
                OperatorContentTypeImpl.this.setExactlyOneArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType o)
                { OperatorContentTypeImpl.this.insertNewExactlyOne(i).set(o); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType remove(int i)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType old = OperatorContentTypeImpl.this.getExactlyOneArray(i);
                OperatorContentTypeImpl.this.removeExactlyOne(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfExactlyOneArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExactlyOneList();
        }
    }
    
    /**
     * Gets array of all "ExactlyOne" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] getExactlyOneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType> targetList = new java.util.ArrayList<org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType>();
            get_store().find_all_element_users(EXACTLYONE$4, targetList);
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] result = new org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExactlyOne" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType getExactlyOneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(EXACTLYONE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExactlyOne" element
     */
    public int sizeOfExactlyOneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXACTLYONE$4);
        }
    }
    
    /**
     * Sets array of all "ExactlyOne" element
     */
    public void setExactlyOneArray(org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType[] exactlyOneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exactlyOneArray, EXACTLYONE$4);
        }
    }
    
    /**
     * Sets ith "ExactlyOne" element
     */
    public void setExactlyOneArray(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType exactlyOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(EXACTLYONE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exactlyOne);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExactlyOne" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType insertNewExactlyOne(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().insert_element_user(EXACTLYONE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExactlyOne" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType addNewExactlyOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(EXACTLYONE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExactlyOne" element
     */
    public void removeExactlyOne(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXACTLYONE$4, i);
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
                { return OperatorContentTypeImpl.this.getPolicyReferenceArray(i); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference set(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference o)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference old = OperatorContentTypeImpl.this.getPolicyReferenceArray(i);
                OperatorContentTypeImpl.this.setPolicyReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference o)
                { OperatorContentTypeImpl.this.insertNewPolicyReference(i).set(o); }
            
            public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference remove(int i)
            {
                org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference old = OperatorContentTypeImpl.this.getPolicyReferenceArray(i);
                OperatorContentTypeImpl.this.removePolicyReference(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfPolicyReferenceArray(); }
            
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
            get_store().find_all_element_users(POLICYREFERENCE$6, targetList);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$6, i);
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
            return get_store().count_elements(POLICYREFERENCE$6);
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
            arraySetterHelper(policyReferenceArray, POLICYREFERENCE$6);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().find_element_user(POLICYREFERENCE$6, i);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().insert_element_user(POLICYREFERENCE$6, i);
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
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyReferenceDocument.PolicyReference)get_store().add_element_user(POLICYREFERENCE$6);
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
            get_store().remove_element(POLICYREFERENCE$6, i);
        }
    }
    
    /**
     * Gets a List of "Addressing" elements
     */
    public java.util.List<org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing> getAddressingList()
    {
        final class AddressingList extends java.util.AbstractList<org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing>
        {
            public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing get(int i)
                { return OperatorContentTypeImpl.this.getAddressingArray(i); }
            
            public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing set(int i, org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing o)
            {
                org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing old = OperatorContentTypeImpl.this.getAddressingArray(i);
                OperatorContentTypeImpl.this.setAddressingArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing o)
                { OperatorContentTypeImpl.this.insertNewAddressing(i).set(o); }
            
            public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing remove(int i)
            {
                org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing old = OperatorContentTypeImpl.this.getAddressingArray(i);
                OperatorContentTypeImpl.this.removeAddressing(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfAddressingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AddressingList();
        }
    }
    
    /**
     * Gets array of all "Addressing" elements
     * @deprecated
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing[] getAddressingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing> targetList = new java.util.ArrayList<org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing>();
            get_store().find_all_element_users(ADDRESSING$8, targetList);
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing[] result = new org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Addressing" element
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing getAddressingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().find_element_user(ADDRESSING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Addressing" element
     */
    public int sizeOfAddressingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSING$8);
        }
    }
    
    /**
     * Sets array of all "Addressing" element
     */
    public void setAddressingArray(org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing[] addressingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressingArray, ADDRESSING$8);
        }
    }
    
    /**
     * Sets ith "Addressing" element
     */
    public void setAddressingArray(int i, org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().find_element_user(ADDRESSING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Addressing" element
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing insertNewAddressing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().insert_element_user(ADDRESSING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Addressing" element
     */
    public org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing addNewAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AddressingDocument.Addressing)get_store().add_element_user(ADDRESSING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Addressing" element
     */
    public void removeAddressing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSING$8, i);
        }
    }
    
    /**
     * Gets a List of "AnonymousResponses" elements
     */
    public java.util.List<org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses> getAnonymousResponsesList()
    {
        final class AnonymousResponsesList extends java.util.AbstractList<org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses>
        {
            public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses get(int i)
                { return OperatorContentTypeImpl.this.getAnonymousResponsesArray(i); }
            
            public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses set(int i, org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses o)
            {
                org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses old = OperatorContentTypeImpl.this.getAnonymousResponsesArray(i);
                OperatorContentTypeImpl.this.setAnonymousResponsesArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses o)
                { OperatorContentTypeImpl.this.insertNewAnonymousResponses(i).set(o); }
            
            public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses remove(int i)
            {
                org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses old = OperatorContentTypeImpl.this.getAnonymousResponsesArray(i);
                OperatorContentTypeImpl.this.removeAnonymousResponses(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfAnonymousResponsesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnonymousResponsesList();
        }
    }
    
    /**
     * Gets array of all "AnonymousResponses" elements
     * @deprecated
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses[] getAnonymousResponsesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses> targetList = new java.util.ArrayList<org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses>();
            get_store().find_all_element_users(ANONYMOUSRESPONSES$10, targetList);
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses[] result = new org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses getAnonymousResponsesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().find_element_user(ANONYMOUSRESPONSES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AnonymousResponses" element
     */
    public int sizeOfAnonymousResponsesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANONYMOUSRESPONSES$10);
        }
    }
    
    /**
     * Sets array of all "AnonymousResponses" element
     */
    public void setAnonymousResponsesArray(org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses[] anonymousResponsesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anonymousResponsesArray, ANONYMOUSRESPONSES$10);
        }
    }
    
    /**
     * Sets ith "AnonymousResponses" element
     */
    public void setAnonymousResponsesArray(int i, org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses anonymousResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().find_element_user(ANONYMOUSRESPONSES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anonymousResponses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses insertNewAnonymousResponses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().insert_element_user(ANONYMOUSRESPONSES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses addNewAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().add_element_user(ANONYMOUSRESPONSES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "AnonymousResponses" element
     */
    public void removeAnonymousResponses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANONYMOUSRESPONSES$10, i);
        }
    }
    
    /**
     * Gets a List of "NonAnonymousResponses" elements
     */
    public java.util.List<org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses> getNonAnonymousResponsesList()
    {
        final class NonAnonymousResponsesList extends java.util.AbstractList<org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses>
        {
            public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses get(int i)
                { return OperatorContentTypeImpl.this.getNonAnonymousResponsesArray(i); }
            
            public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses set(int i, org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses o)
            {
                org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses old = OperatorContentTypeImpl.this.getNonAnonymousResponsesArray(i);
                OperatorContentTypeImpl.this.setNonAnonymousResponsesArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses o)
                { OperatorContentTypeImpl.this.insertNewNonAnonymousResponses(i).set(o); }
            
            public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses remove(int i)
            {
                org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses old = OperatorContentTypeImpl.this.getNonAnonymousResponsesArray(i);
                OperatorContentTypeImpl.this.removeNonAnonymousResponses(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfNonAnonymousResponsesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NonAnonymousResponsesList();
        }
    }
    
    /**
     * Gets array of all "NonAnonymousResponses" elements
     * @deprecated
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses[] getNonAnonymousResponsesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses> targetList = new java.util.ArrayList<org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses>();
            get_store().find_all_element_users(NONANONYMOUSRESPONSES$12, targetList);
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses[] result = new org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NonAnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses getNonAnonymousResponsesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().find_element_user(NONANONYMOUSRESPONSES$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NonAnonymousResponses" element
     */
    public int sizeOfNonAnonymousResponsesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONANONYMOUSRESPONSES$12);
        }
    }
    
    /**
     * Sets array of all "NonAnonymousResponses" element
     */
    public void setNonAnonymousResponsesArray(org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses[] nonAnonymousResponsesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nonAnonymousResponsesArray, NONANONYMOUSRESPONSES$12);
        }
    }
    
    /**
     * Sets ith "NonAnonymousResponses" element
     */
    public void setNonAnonymousResponsesArray(int i, org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses nonAnonymousResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().find_element_user(NONANONYMOUSRESPONSES$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nonAnonymousResponses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NonAnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses insertNewNonAnonymousResponses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().insert_element_user(NONANONYMOUSRESPONSES$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NonAnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses addNewNonAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().add_element_user(NONANONYMOUSRESPONSES$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "NonAnonymousResponses" element
     */
    public void removeNonAnonymousResponses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONANONYMOUSRESPONSES$12, i);
        }
    }
    
    /**
     * Gets a List of "UsingAddressing" elements
     */
    public java.util.List<org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing> getUsingAddressingList()
    {
        final class UsingAddressingList extends java.util.AbstractList<org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing>
        {
            public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing get(int i)
                { return OperatorContentTypeImpl.this.getUsingAddressingArray(i); }
            
            public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing set(int i, org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing o)
            {
                org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing old = OperatorContentTypeImpl.this.getUsingAddressingArray(i);
                OperatorContentTypeImpl.this.setUsingAddressingArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing o)
                { OperatorContentTypeImpl.this.insertNewUsingAddressing(i).set(o); }
            
            public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing remove(int i)
            {
                org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing old = OperatorContentTypeImpl.this.getUsingAddressingArray(i);
                OperatorContentTypeImpl.this.removeUsingAddressing(i);
                return old;
            }
            
            public int size()
                { return OperatorContentTypeImpl.this.sizeOfUsingAddressingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsingAddressingList();
        }
    }
    
    /**
     * Gets array of all "UsingAddressing" elements
     * @deprecated
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing[] getUsingAddressingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing> targetList = new java.util.ArrayList<org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing>();
            get_store().find_all_element_users(USINGADDRESSING$14, targetList);
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing[] result = new org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UsingAddressing" element
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing getUsingAddressingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().find_element_user(USINGADDRESSING$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UsingAddressing" element
     */
    public int sizeOfUsingAddressingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USINGADDRESSING$14);
        }
    }
    
    /**
     * Sets array of all "UsingAddressing" element
     */
    public void setUsingAddressingArray(org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing[] usingAddressingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usingAddressingArray, USINGADDRESSING$14);
        }
    }
    
    /**
     * Sets ith "UsingAddressing" element
     */
    public void setUsingAddressingArray(int i, org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing usingAddressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().find_element_user(USINGADDRESSING$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(usingAddressing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UsingAddressing" element
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing insertNewUsingAddressing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().insert_element_user(USINGADDRESSING$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UsingAddressing" element
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing addNewUsingAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().add_element_user(USINGADDRESSING$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "UsingAddressing" element
     */
    public void removeUsingAddressing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USINGADDRESSING$14, i);
        }
    }
}
