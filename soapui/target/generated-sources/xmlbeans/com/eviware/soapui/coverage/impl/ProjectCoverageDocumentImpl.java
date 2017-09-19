/*
 * An XML document type.
 * Localname: projectCoverage
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.ProjectCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * A document containing one projectCoverage(@http://eviware.com/soapui/coverage) element.
 *
 * This is a complex type.
 */
public class ProjectCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.ProjectCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "projectCoverage");
    
    
    /**
     * Gets the "projectCoverage" element
     */
    public com.eviware.soapui.coverage.ProjectCoverageType getProjectCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.ProjectCoverageType target = null;
            target = (com.eviware.soapui.coverage.ProjectCoverageType)get_store().find_element_user(PROJECTCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "projectCoverage" element
     */
    public void setProjectCoverage(com.eviware.soapui.coverage.ProjectCoverageType projectCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.ProjectCoverageType target = null;
            target = (com.eviware.soapui.coverage.ProjectCoverageType)get_store().find_element_user(PROJECTCOVERAGE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.ProjectCoverageType)get_store().add_element_user(PROJECTCOVERAGE$0);
            }
            target.set(projectCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "projectCoverage" element
     */
    public com.eviware.soapui.coverage.ProjectCoverageType addNewProjectCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.ProjectCoverageType target = null;
            target = (com.eviware.soapui.coverage.ProjectCoverageType)get_store().add_element_user(PROJECTCOVERAGE$0);
            return target;
        }
    }
}
