/*
 * An XML document type.
 * Localname: schemaSystem
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SchemaSystemDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * A document containing one schemaSystem(@http://www.eviware.com/soapui/InferredSchema) element.
 *
 * This is a complex type.
 */
public class SchemaSystemDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.SchemaSystemDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SchemaSystemDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMASYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "schemaSystem");
    
    
    /**
     * Gets the "schemaSystem" element
     */
    public com.eviware.soapui.inferredSchema.SchemaSetConfig getSchemaSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaSetConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaSetConfig)get_store().find_element_user(SCHEMASYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schemaSystem" element
     */
    public void setSchemaSystem(com.eviware.soapui.inferredSchema.SchemaSetConfig schemaSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaSetConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaSetConfig)get_store().find_element_user(SCHEMASYSTEM$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.inferredSchema.SchemaSetConfig)get_store().add_element_user(SCHEMASYSTEM$0);
            }
            target.set(schemaSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "schemaSystem" element
     */
    public com.eviware.soapui.inferredSchema.SchemaSetConfig addNewSchemaSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaSetConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaSetConfig)get_store().add_element_user(SCHEMASYSTEM$0);
            return target;
        }
    }
}
