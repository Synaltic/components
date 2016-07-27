// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.datastewardship.runtime;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.avro.Schema;
import org.talend.components.api.component.runtime.WriteOperation;
import org.talend.components.api.container.RuntimeContainer;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.components.datastewardship.tdatastewardshipcampaignoutput.TDataStewardshipCampaignOutputProperties;
import org.talend.daikon.NamedThing;

public class TdsCampaignSink extends TdsSink {

    private static final long serialVersionUID = 3228265006313531905L;
    
    private String campaignSchema;

    @Override
    public WriteOperation<?> createWriteOperation() {
        return new TdsCampaignWriteOperation(this);
    }

    @Override
    public void initialize(RuntimeContainer container, ComponentProperties properties) {
        super.initialize(container, properties);
        TDataStewardshipCampaignOutputProperties outputProperties = (TDataStewardshipCampaignOutputProperties) properties;
        campaignSchema = outputProperties.campaignSchema.getValue();
    }

    @Override
    public List<NamedThing> getSchemaNames(RuntimeContainer runtimeContainer) throws IOException {
        return Collections.emptyList();
    }

    @Override
    public Schema getEndpointSchema(RuntimeContainer runtimeContainer, String s) throws IOException {
        return null;
    }
    
    public String getCampaignSchema() {
        return campaignSchema;
    }
    
    public void setCampaignSchema(String campaignSchema) {
        this.campaignSchema = campaignSchema;
    }
    
}