/*
 * XML Type:  java-wsdl-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML java-wsdl-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class JavaWsdlMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType
{
    private static final long serialVersionUID = 1L;
    
    public JavaWsdlMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMAPPING$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "package-mapping");
    private static final javax.xml.namespace.QName JAVAXMLTYPEMAPPING$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "java-xml-type-mapping");
    private static final javax.xml.namespace.QName EXCEPTIONMAPPING$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "exception-mapping");
    private static final javax.xml.namespace.QName SERVICEINTERFACEMAPPING$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-interface-mapping");
    private static final javax.xml.namespace.QName SERVICEENDPOINTINTERFACEMAPPING$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint-interface-mapping");
    private static final javax.xml.namespace.QName VERSION$10 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "package-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PackageMappingType> getPackageMappingList()
    {
        final class PackageMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PackageMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.PackageMappingType get(int i)
                { return JavaWsdlMappingTypeImpl.this.getPackageMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PackageMappingType set(int i, com.sun.java.xml.ns.j2Ee.PackageMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.PackageMappingType old = JavaWsdlMappingTypeImpl.this.getPackageMappingArray(i);
                JavaWsdlMappingTypeImpl.this.setPackageMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PackageMappingType o)
                { JavaWsdlMappingTypeImpl.this.insertNewPackageMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PackageMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PackageMappingType old = JavaWsdlMappingTypeImpl.this.getPackageMappingArray(i);
                JavaWsdlMappingTypeImpl.this.removePackageMapping(i);
                return old;
            }
            
            public int size()
                { return JavaWsdlMappingTypeImpl.this.sizeOfPackageMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PackageMappingList();
        }
    }
    
    /**
     * Gets array of all "package-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PackageMappingType[] getPackageMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PackageMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PackageMappingType>();
            get_store().find_all_element_users(PACKAGEMAPPING$0, targetList);
            com.sun.java.xml.ns.j2Ee.PackageMappingType[] result = new com.sun.java.xml.ns.j2Ee.PackageMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "package-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PackageMappingType getPackageMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PackageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PackageMappingType)get_store().find_element_user(PACKAGEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "package-mapping" element
     */
    public int sizeOfPackageMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "package-mapping" element
     */
    public void setPackageMappingArray(com.sun.java.xml.ns.j2Ee.PackageMappingType[] packageMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(packageMappingArray, PACKAGEMAPPING$0);
        }
    }
    
    /**
     * Sets ith "package-mapping" element
     */
    public void setPackageMappingArray(int i, com.sun.java.xml.ns.j2Ee.PackageMappingType packageMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PackageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PackageMappingType)get_store().find_element_user(PACKAGEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(packageMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "package-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PackageMappingType insertNewPackageMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PackageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PackageMappingType)get_store().insert_element_user(PACKAGEMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "package-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PackageMappingType addNewPackageMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PackageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PackageMappingType)get_store().add_element_user(PACKAGEMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "package-mapping" element
     */
    public void removePackageMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEMAPPING$0, i);
        }
    }
    
    /**
     * Gets a List of "java-xml-type-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType> getJavaXmlTypeMappingList()
    {
        final class JavaXmlTypeMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType get(int i)
                { return JavaWsdlMappingTypeImpl.this.getJavaXmlTypeMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType set(int i, com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType old = JavaWsdlMappingTypeImpl.this.getJavaXmlTypeMappingArray(i);
                JavaWsdlMappingTypeImpl.this.setJavaXmlTypeMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType o)
                { JavaWsdlMappingTypeImpl.this.insertNewJavaXmlTypeMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType old = JavaWsdlMappingTypeImpl.this.getJavaXmlTypeMappingArray(i);
                JavaWsdlMappingTypeImpl.this.removeJavaXmlTypeMapping(i);
                return old;
            }
            
            public int size()
                { return JavaWsdlMappingTypeImpl.this.sizeOfJavaXmlTypeMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JavaXmlTypeMappingList();
        }
    }
    
    /**
     * Gets array of all "java-xml-type-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[] getJavaXmlTypeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType>();
            get_store().find_all_element_users(JAVAXMLTYPEMAPPING$2, targetList);
            com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[] result = new com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "java-xml-type-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType getJavaXmlTypeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType)get_store().find_element_user(JAVAXMLTYPEMAPPING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "java-xml-type-mapping" element
     */
    public int sizeOfJavaXmlTypeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JAVAXMLTYPEMAPPING$2);
        }
    }
    
    /**
     * Sets array of all "java-xml-type-mapping" element
     */
    public void setJavaXmlTypeMappingArray(com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[] javaXmlTypeMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(javaXmlTypeMappingArray, JAVAXMLTYPEMAPPING$2);
        }
    }
    
    /**
     * Sets ith "java-xml-type-mapping" element
     */
    public void setJavaXmlTypeMappingArray(int i, com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType javaXmlTypeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType)get_store().find_element_user(JAVAXMLTYPEMAPPING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(javaXmlTypeMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "java-xml-type-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType insertNewJavaXmlTypeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType)get_store().insert_element_user(JAVAXMLTYPEMAPPING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "java-xml-type-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType addNewJavaXmlTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType)get_store().add_element_user(JAVAXMLTYPEMAPPING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "java-xml-type-mapping" element
     */
    public void removeJavaXmlTypeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JAVAXMLTYPEMAPPING$2, i);
        }
    }
    
    /**
     * Gets a List of "exception-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ExceptionMappingType> getExceptionMappingList()
    {
        final class ExceptionMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ExceptionMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.ExceptionMappingType get(int i)
                { return JavaWsdlMappingTypeImpl.this.getExceptionMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ExceptionMappingType set(int i, com.sun.java.xml.ns.j2Ee.ExceptionMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.ExceptionMappingType old = JavaWsdlMappingTypeImpl.this.getExceptionMappingArray(i);
                JavaWsdlMappingTypeImpl.this.setExceptionMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ExceptionMappingType o)
                { JavaWsdlMappingTypeImpl.this.insertNewExceptionMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ExceptionMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ExceptionMappingType old = JavaWsdlMappingTypeImpl.this.getExceptionMappingArray(i);
                JavaWsdlMappingTypeImpl.this.removeExceptionMapping(i);
                return old;
            }
            
            public int size()
                { return JavaWsdlMappingTypeImpl.this.sizeOfExceptionMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExceptionMappingList();
        }
    }
    
    /**
     * Gets array of all "exception-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ExceptionMappingType[] getExceptionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ExceptionMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ExceptionMappingType>();
            get_store().find_all_element_users(EXCEPTIONMAPPING$4, targetList);
            com.sun.java.xml.ns.j2Ee.ExceptionMappingType[] result = new com.sun.java.xml.ns.j2Ee.ExceptionMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "exception-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ExceptionMappingType getExceptionMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExceptionMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExceptionMappingType)get_store().find_element_user(EXCEPTIONMAPPING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "exception-mapping" element
     */
    public int sizeOfExceptionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCEPTIONMAPPING$4);
        }
    }
    
    /**
     * Sets array of all "exception-mapping" element
     */
    public void setExceptionMappingArray(com.sun.java.xml.ns.j2Ee.ExceptionMappingType[] exceptionMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exceptionMappingArray, EXCEPTIONMAPPING$4);
        }
    }
    
    /**
     * Sets ith "exception-mapping" element
     */
    public void setExceptionMappingArray(int i, com.sun.java.xml.ns.j2Ee.ExceptionMappingType exceptionMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExceptionMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExceptionMappingType)get_store().find_element_user(EXCEPTIONMAPPING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exceptionMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exception-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ExceptionMappingType insertNewExceptionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExceptionMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExceptionMappingType)get_store().insert_element_user(EXCEPTIONMAPPING$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exception-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ExceptionMappingType addNewExceptionMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExceptionMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExceptionMappingType)get_store().add_element_user(EXCEPTIONMAPPING$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "exception-mapping" element
     */
    public void removeExceptionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCEPTIONMAPPING$4, i);
        }
    }
    
    /**
     * Gets a List of "service-interface-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType> getServiceInterfaceMappingList()
    {
        final class ServiceInterfaceMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType get(int i)
                { return JavaWsdlMappingTypeImpl.this.getServiceInterfaceMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType set(int i, com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType old = JavaWsdlMappingTypeImpl.this.getServiceInterfaceMappingArray(i);
                JavaWsdlMappingTypeImpl.this.setServiceInterfaceMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType o)
                { JavaWsdlMappingTypeImpl.this.insertNewServiceInterfaceMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType old = JavaWsdlMappingTypeImpl.this.getServiceInterfaceMappingArray(i);
                JavaWsdlMappingTypeImpl.this.removeServiceInterfaceMapping(i);
                return old;
            }
            
            public int size()
                { return JavaWsdlMappingTypeImpl.this.sizeOfServiceInterfaceMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceInterfaceMappingList();
        }
    }
    
    /**
     * Gets array of all "service-interface-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[] getServiceInterfaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType>();
            get_store().find_all_element_users(SERVICEINTERFACEMAPPING$6, targetList);
            com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[] result = new com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType getServiceInterfaceMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType)get_store().find_element_user(SERVICEINTERFACEMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-interface-mapping" element
     */
    public int sizeOfServiceInterfaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEINTERFACEMAPPING$6);
        }
    }
    
    /**
     * Sets array of all "service-interface-mapping" element
     */
    public void setServiceInterfaceMappingArray(com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[] serviceInterfaceMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceInterfaceMappingArray, SERVICEINTERFACEMAPPING$6);
        }
    }
    
    /**
     * Sets ith "service-interface-mapping" element
     */
    public void setServiceInterfaceMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType serviceInterfaceMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType)get_store().find_element_user(SERVICEINTERFACEMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceInterfaceMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType insertNewServiceInterfaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType)get_store().insert_element_user(SERVICEINTERFACEMAPPING$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType addNewServiceInterfaceMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType)get_store().add_element_user(SERVICEINTERFACEMAPPING$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-interface-mapping" element
     */
    public void removeServiceInterfaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEINTERFACEMAPPING$6, i);
        }
    }
    
    /**
     * Gets a List of "service-endpoint-interface-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType> getServiceEndpointInterfaceMappingList()
    {
        final class ServiceEndpointInterfaceMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType get(int i)
                { return JavaWsdlMappingTypeImpl.this.getServiceEndpointInterfaceMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType set(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType old = JavaWsdlMappingTypeImpl.this.getServiceEndpointInterfaceMappingArray(i);
                JavaWsdlMappingTypeImpl.this.setServiceEndpointInterfaceMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType o)
                { JavaWsdlMappingTypeImpl.this.insertNewServiceEndpointInterfaceMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType old = JavaWsdlMappingTypeImpl.this.getServiceEndpointInterfaceMappingArray(i);
                JavaWsdlMappingTypeImpl.this.removeServiceEndpointInterfaceMapping(i);
                return old;
            }
            
            public int size()
                { return JavaWsdlMappingTypeImpl.this.sizeOfServiceEndpointInterfaceMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceEndpointInterfaceMappingList();
        }
    }
    
    /**
     * Gets array of all "service-endpoint-interface-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[] getServiceEndpointInterfaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType>();
            get_store().find_all_element_users(SERVICEENDPOINTINTERFACEMAPPING$8, targetList);
            com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[] result = new com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-endpoint-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType getServiceEndpointInterfaceMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType)get_store().find_element_user(SERVICEENDPOINTINTERFACEMAPPING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-endpoint-interface-mapping" element
     */
    public int sizeOfServiceEndpointInterfaceMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEENDPOINTINTERFACEMAPPING$8);
        }
    }
    
    /**
     * Sets array of all "service-endpoint-interface-mapping" element
     */
    public void setServiceEndpointInterfaceMappingArray(com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[] serviceEndpointInterfaceMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceEndpointInterfaceMappingArray, SERVICEENDPOINTINTERFACEMAPPING$8);
        }
    }
    
    /**
     * Sets ith "service-endpoint-interface-mapping" element
     */
    public void setServiceEndpointInterfaceMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType serviceEndpointInterfaceMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType)get_store().find_element_user(SERVICEENDPOINTINTERFACEMAPPING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceEndpointInterfaceMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-endpoint-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType insertNewServiceEndpointInterfaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType)get_store().insert_element_user(SERVICEENDPOINTINTERFACEMAPPING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-endpoint-interface-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType addNewServiceEndpointInterfaceMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType)get_store().add_element_user(SERVICEENDPOINTINTERFACEMAPPING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-endpoint-interface-mapping" element
     */
    public void removeServiceEndpointInterfaceMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEENDPOINTINTERFACEMAPPING$8, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.sun.java.xml.ns.j2Ee.DeweyVersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DeweyVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_default_attribute_value(VERSION$10);
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$10);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.sun.java.xml.ns.j2Ee.DeweyVersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DeweyVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().add_attribute_user(VERSION$10);
            }
            target.set(version);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
}
