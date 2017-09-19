/*
 * An XML document type.
 * Localname: ejb-jar
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbJarDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * A document containing one ejb-jar(@http://java.sun.com/xml/ns/j2ee) element.
 *
 * This is a complex type.
 */
public class EjbJarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EjbJarDocument
{
    private static final long serialVersionUID = 1L;
    
    public EjbJarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBJAR$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-jar");
    
    
    /**
     * Gets the "ejb-jar" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbJarType getEjbJar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbJarType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbJarType)get_store().find_element_user(EJBJAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-jar" element
     */
    public void setEjbJar(com.sun.java.xml.ns.j2Ee.EjbJarType ejbJar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbJarType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbJarType)get_store().find_element_user(EJBJAR$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbJarType)get_store().add_element_user(EJBJAR$0);
            }
            target.set(ejbJar);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-jar" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbJarType addNewEjbJar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbJarType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbJarType)get_store().add_element_user(EJBJAR$0);
            return target;
        }
    }
}
