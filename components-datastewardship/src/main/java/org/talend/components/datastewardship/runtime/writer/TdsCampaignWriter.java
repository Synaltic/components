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
package org.talend.components.datastewardship.runtime.writer;

import org.talend.components.api.component.runtime.WriteOperation;
import org.talend.components.api.component.runtime.Writer;
import org.talend.components.datastewardship.runtime.TdsCampaignWriteOperation;

/**
 * TDS Campaign {@link Writer}
 */
public class TdsCampaignWriter extends TdsWriter {


    /**
     * Constructor sets {@link WriteOperation}
     * 
     * @param writeOperation TDS {@link WriteOperation} instance
     */
    public TdsCampaignWriter(TdsCampaignWriteOperation writeOperation) {
        super(writeOperation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TdsCampaignWriteOperation getWriteOperation() {
        return (TdsCampaignWriteOperation)super.getWriteOperation();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void write(Object datum) {
        
    }

}
