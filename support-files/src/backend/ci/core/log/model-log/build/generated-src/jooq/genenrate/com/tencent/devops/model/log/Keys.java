/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.log;


import com.tencent.devops.model.log.tables.TLogIndices;
import com.tencent.devops.model.log.tables.TLogIndicesV2;
import com.tencent.devops.model.log.tables.TLogStatusV2;
import com.tencent.devops.model.log.tables.records.TLogIndicesRecord;
import com.tencent.devops.model.log.tables.records.TLogIndicesV2Record;
import com.tencent.devops.model.log.tables.records.TLogStatusV2Record;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>devops_log</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TLogIndicesV2Record, Long> IDENTITY_T_LOG_INDICES_V2 = Identities0.IDENTITY_T_LOG_INDICES_V2;
    public static final Identity<TLogStatusV2Record, Long> IDENTITY_T_LOG_STATUS_V2 = Identities0.IDENTITY_T_LOG_STATUS_V2;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TLogIndicesRecord> KEY_T_LOG_INDICES_PRIMARY = UniqueKeys0.KEY_T_LOG_INDICES_PRIMARY;
    public static final UniqueKey<TLogIndicesV2Record> KEY_T_LOG_INDICES_V2_PRIMARY = UniqueKeys0.KEY_T_LOG_INDICES_V2_PRIMARY;
    public static final UniqueKey<TLogIndicesV2Record> KEY_T_LOG_INDICES_V2_BUILD_ID = UniqueKeys0.KEY_T_LOG_INDICES_V2_BUILD_ID;
    public static final UniqueKey<TLogStatusV2Record> KEY_T_LOG_STATUS_V2_PRIMARY = UniqueKeys0.KEY_T_LOG_STATUS_V2_PRIMARY;
    public static final UniqueKey<TLogStatusV2Record> KEY_T_LOG_STATUS_V2_BUILD_ID_2 = UniqueKeys0.KEY_T_LOG_STATUS_V2_BUILD_ID_2;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TLogIndicesV2Record, Long> IDENTITY_T_LOG_INDICES_V2 = createIdentity(TLogIndicesV2.T_LOG_INDICES_V2, TLogIndicesV2.T_LOG_INDICES_V2.ID);
        public static Identity<TLogStatusV2Record, Long> IDENTITY_T_LOG_STATUS_V2 = createIdentity(TLogStatusV2.T_LOG_STATUS_V2, TLogStatusV2.T_LOG_STATUS_V2.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TLogIndicesRecord> KEY_T_LOG_INDICES_PRIMARY = createUniqueKey(TLogIndices.T_LOG_INDICES, "KEY_T_LOG_INDICES_PRIMARY", TLogIndices.T_LOG_INDICES.ID);
        public static final UniqueKey<TLogIndicesV2Record> KEY_T_LOG_INDICES_V2_PRIMARY = createUniqueKey(TLogIndicesV2.T_LOG_INDICES_V2, "KEY_T_LOG_INDICES_V2_PRIMARY", TLogIndicesV2.T_LOG_INDICES_V2.ID);
        public static final UniqueKey<TLogIndicesV2Record> KEY_T_LOG_INDICES_V2_BUILD_ID = createUniqueKey(TLogIndicesV2.T_LOG_INDICES_V2, "KEY_T_LOG_INDICES_V2_BUILD_ID", TLogIndicesV2.T_LOG_INDICES_V2.BUILD_ID);
        public static final UniqueKey<TLogStatusV2Record> KEY_T_LOG_STATUS_V2_PRIMARY = createUniqueKey(TLogStatusV2.T_LOG_STATUS_V2, "KEY_T_LOG_STATUS_V2_PRIMARY", TLogStatusV2.T_LOG_STATUS_V2.ID);
        public static final UniqueKey<TLogStatusV2Record> KEY_T_LOG_STATUS_V2_BUILD_ID_2 = createUniqueKey(TLogStatusV2.T_LOG_STATUS_V2, "KEY_T_LOG_STATUS_V2_BUILD_ID_2", TLogStatusV2.T_LOG_STATUS_V2.BUILD_ID, TLogStatusV2.T_LOG_STATUS_V2.TAG, TLogStatusV2.T_LOG_STATUS_V2.EXECUTE_COUNT);
    }
}