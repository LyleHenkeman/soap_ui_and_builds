/*
 * XML Type:  ElementParticle
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.ElementParticleConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML ElementParticle(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class ElementParticleConfigImpl extends com.eviware.soapui.inferredSchema.impl.ParticleConfigImpl implements com.eviware.soapui.inferredSchema.ElementParticleConfig
{
    private static final long serialVersionUID = 1L;
    
    public ElementParticleConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "type");
    
    
    /**
     * Gets the "type" element
     */
    public com.eviware.soapui.inferredSchema.TypeConfig getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.TypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.TypeConfig)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(com.eviware.soapui.inferredSchema.TypeConfig type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.TypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.TypeConfig)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.inferredSchema.TypeConfig)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public com.eviware.soapui.inferredSchema.TypeConfig addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.TypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.TypeConfig)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
}
