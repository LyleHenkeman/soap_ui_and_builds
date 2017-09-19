/*
 * XML Type:  operationType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.OperationType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML operationType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class OperationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.OperationType
{
    private static final long serialVersionUID = 1L;
    
    public OperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "parameter");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ONEWAY$4 = 
        new javax.xml.namespace.QName("", "one-way");
    private static final javax.xml.namespace.QName RETURNXMLNAME$6 = 
        new javax.xml.namespace.QName("", "return-xml-name");
    
    
    /**
     * Gets a List of "parameter" elements
     */
    public java.util.List<org.jboss.jbosswsTools.ParameterType> getParameterList()
    {
        final class ParameterList extends java.util.AbstractList<org.jboss.jbosswsTools.ParameterType>
        {
            public org.jboss.jbosswsTools.ParameterType get(int i)
                { return OperationTypeImpl.this.getParameterArray(i); }
            
            public org.jboss.jbosswsTools.ParameterType set(int i, org.jboss.jbosswsTools.ParameterType o)
            {
                org.jboss.jbosswsTools.ParameterType old = OperationTypeImpl.this.getParameterArray(i);
                OperationTypeImpl.this.setParameterArray(i, o);
                return old;
            }
            
            public void add(int i, org.jboss.jbosswsTools.ParameterType o)
                { OperationTypeImpl.this.insertNewParameter(i).set(o); }
            
            public org.jboss.jbosswsTools.ParameterType remove(int i)
            {
                org.jboss.jbosswsTools.ParameterType old = OperationTypeImpl.this.getParameterArray(i);
                OperationTypeImpl.this.removeParameter(i);
                return old;
            }
            
            public int size()
                { return OperationTypeImpl.this.sizeOfParameterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterList();
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     * @deprecated
     */
    public org.jboss.jbosswsTools.ParameterType[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.jboss.jbosswsTools.ParameterType> targetList = new java.util.ArrayList<org.jboss.jbosswsTools.ParameterType>();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            org.jboss.jbosswsTools.ParameterType[] result = new org.jboss.jbosswsTools.ParameterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.jboss.jbosswsTools.ParameterType getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType target = null;
            target = (org.jboss.jbosswsTools.ParameterType)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "parameter" element
     */
    public void setParameterArray(org.jboss.jbosswsTools.ParameterType[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.jboss.jbosswsTools.ParameterType parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType target = null;
            target = (org.jboss.jbosswsTools.ParameterType)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public org.jboss.jbosswsTools.ParameterType insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType target = null;
            target = (org.jboss.jbosswsTools.ParameterType)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.jboss.jbosswsTools.ParameterType addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType target = null;
            target = (org.jboss.jbosswsTools.ParameterType)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(org.apache.xmlbeans.XmlAnySimpleType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "one-way" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ONEWAY$4);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "one-way" attribute
     */
    public boolean isSetOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONEWAY$4) != null;
        }
    }
    
    /**
     * Sets the "one-way" attribute
     */
    public void setOneWay(org.apache.xmlbeans.XmlAnySimpleType oneWay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ONEWAY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ONEWAY$4);
            }
            target.set(oneWay);
        }
    }
    
    /**
     * Appends and returns a new empty "one-way" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ONEWAY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "one-way" attribute
     */
    public void unsetOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONEWAY$4);
        }
    }
    
    /**
     * Gets the "return-xml-name" attribute
     */
    public javax.xml.namespace.QName getReturnXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNXMLNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "return-xml-name" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetReturnXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(RETURNXMLNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "return-xml-name" attribute
     */
    public boolean isSetReturnXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RETURNXMLNAME$6) != null;
        }
    }
    
    /**
     * Sets the "return-xml-name" attribute
     */
    public void setReturnXmlName(javax.xml.namespace.QName returnXmlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNXMLNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNXMLNAME$6);
            }
            target.setQNameValue(returnXmlName);
        }
    }
    
    /**
     * Sets (as xml) the "return-xml-name" attribute
     */
    public void xsetReturnXmlName(org.apache.xmlbeans.XmlQName returnXmlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(RETURNXMLNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(RETURNXMLNAME$6);
            }
            target.set(returnXmlName);
        }
    }
    
    /**
     * Unsets the "return-xml-name" attribute
     */
    public void unsetReturnXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RETURNXMLNAME$6);
        }
    }
}
