/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.log.tables.records;


import com.tencent.devops.model.log.tables.TLogIndices;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLogIndicesRecord extends UpdatableRecordImpl<TLogIndicesRecord> implements Record4<String, String, Long, Boolean> {

    private static final long serialVersionUID = 185773436;

    /**
     * Setter for <code>devops_log.T_LOG_INDICES.ID</code>.
     */
    public TLogIndicesRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES.INDEX_NAME</code>.
     */
    public TLogIndicesRecord setIndexName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES.LAST_LINE_NUM</code>. 最后行号
     */
    public TLogIndicesRecord setLastLineNum(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES.LAST_LINE_NUM</code>. 最后行号
     */
    public Long getLastLineNum() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES.CREATE_TYPE_MAPPING</code>. create the type mapping or not
     */
    public TLogIndicesRecord setCreateTypeMapping(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES.CREATE_TYPE_MAPPING</code>. create the type mapping or not
     */
    public Boolean getCreateTypeMapping() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Long, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Long, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TLogIndices.T_LOG_INDICES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TLogIndices.T_LOG_INDICES.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TLogIndices.T_LOG_INDICES.LAST_LINE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TLogIndices.T_LOG_INDICES.CREATE_TYPE_MAPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getLastLineNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getCreateTypeMapping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesRecord value2(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesRecord value3(Long value) {
        setLastLineNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesRecord value4(Boolean value) {
        setCreateTypeMapping(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesRecord values(String value1, String value2, Long value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLogIndicesRecord
     */
    public TLogIndicesRecord() {
        super(TLogIndices.T_LOG_INDICES);
    }

    /**
     * Create a detached, initialised TLogIndicesRecord
     */
    public TLogIndicesRecord(String id, String indexName, Long lastLineNum, Boolean createTypeMapping) {
        super(TLogIndices.T_LOG_INDICES);

        set(0, id);
        set(1, indexName);
        set(2, lastLineNum);
        set(3, createTypeMapping);
    }
}