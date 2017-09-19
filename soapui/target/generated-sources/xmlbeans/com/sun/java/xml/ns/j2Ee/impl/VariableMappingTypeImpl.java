/*
 * XML Type:  variable-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.VariableMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML variable-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class VariableMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.VariableMappingType
{
    private static final long serialVersionUID = 1L;
    
    public VariableMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVAVARIABLENAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "java-variable-name");
    private static final javax.xml.namespace.QName DATAMEMBER$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "data-member");
    private static final javax.xml.namespace.QName XMLATTRIBUTENAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "xml-attribute-name");
    private static final javax.xml.namespace.QName XMLELEMENTNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "xml-element-name");
    private static final javax.xml.namespace.QName XMLWILDCARD$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "xml-wildcard");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "java-variable-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getJavaVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(JAVAVARIABLENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "java-variable-name" element
     */
    public void setJavaVariableName(com.sun.java.xml.ns.j2Ee.String javaVariableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(JAVAVARIABLENAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(JAVAVARIABLENAME$0);
            }
            target.set(javaVariableName);
        }
    }
    
    /**
     * Appends and returns a new empty "java-variable-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewJavaVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(JAVAVARIABLENAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "data-member" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getDataMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(DATAMEMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "data-member" element
     */
    public boolean isSetDataMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAMEMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "data-member" element
     */
    public void setDataMember(com.sun.java.xml.ns.j2Ee.EmptyType dataMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(DATAMEMBER$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(DATAMEMBER$2);
            }
            target.set(dataMember);
        }
    }
    
    /**
     * Appends and returns a new empty "data-member" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewDataMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(DATAMEMBER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "data-member" element
     */
    public void unsetDataMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAMEMBER$2, 0);
        }
    }
    
    /**
     * Gets the "xml-attribute-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getXmlAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(XMLATTRIBUTENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xml-attribute-name" element
     */
    public boolean isSetXmlAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLATTRIBUTENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "xml-attribute-name" element
     */
    public void setXmlAttributeName(com.sun.java.xml.ns.j2Ee.String xmlAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(XMLATTRIBUTENAME$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(XMLATTRIBUTENAME$4);
            }
            target.set(xmlAttributeName);
        }
    }
    
    /**
     * Appends and returns a new empty "xml-attribute-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewXmlAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(XMLATTRIBUTENAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "xml-attribute-name" element
     */
    public void unsetXmlAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLATTRIBUTENAME$4, 0);
        }
    }
    
    /**
     * Gets the "xml-element-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getXmlElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(XMLELEMENTNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xml-element-name" element
     */
    public boolean isSetXmlElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLELEMENTNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "xml-element-name" element
     */
    public void setXmlElementName(com.sun.java.xml.ns.j2Ee.String xmlElementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(XMLELEMENTNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(XMLELEMENTNAME$6);
            }
            target.set(xmlElementName);
        }
    }
    
    /**
     * Appends and returns a new empty "xml-element-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewXmlElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(XMLELEMENTNAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "xml-element-name" element
     */
    public void unsetXmlElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLELEMENTNAME$6, 0);
        }
    }
    
    /**
     * Gets the "xml-wildcard" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getXmlWildcard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(XMLWILDCARD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xml-wildcard" element
     */
    public boolean isSetXmlWildcard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLWILDCARD$8) != 0;
        }
    }
    
    /**
     * Sets the "xml-wildcard" element
     */
    public void setXmlWildcard(com.sun.java.xml.ns.j2Ee.EmptyType xmlWildcard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(XMLWILDCARD$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(XMLWILDCARD$8);
            }
            target.set(xmlWildcard);
        }
    }
    
    /**
     * Appends and returns a new empty "xml-wildcard" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewXmlWildcard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(XMLWILDCARD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "xml-wildcard" element
     */
    public void unsetXmlWildcard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLWILDCARD$8, 0);
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
