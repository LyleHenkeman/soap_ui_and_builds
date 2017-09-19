/*
 * An XML document type.
 * Localname: java-wsdl-mapping
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JavaWsdlMappingDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * A document containing one java-wsdl-mapping(@http://java.sun.com/xml/ns/j2ee) element.
 *
 * This is a complex type.
 */
public class JavaWsdlMappingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.JavaWsdlMappingDocument
{
    private static final long serialVersionUID = 1L;
    
    public JavaWsdlMappingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVAWSDLMAPPING$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "java-wsdl-mapping");
    
    
    /**
     * Gets the "java-wsdl-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType getJavaWsdlMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType)get_store().find_element_user(JAVAWSDLMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "java-wsdl-mapping" element
     */
    public void setJavaWsdlMapping(com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType javaWsdlMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType)get_store().find_element_user(JAVAWSDLMAPPING$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType)get_store().add_element_user(JAVAWSDLMAPPING$0);
            }
            target.set(javaWsdlMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "java-wsdl-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType addNewJavaWsdlMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType)get_store().add_element_user(JAVAWSDLMAPPING$0);
            return target;
        }
    }
}
