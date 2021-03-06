/**
 * This class is generated by jOOQ
 */
package org.jooq.example.chart.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.chart.db.Keys;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.CountryRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0",
        "schema version:public_2",
    },
    date = "2016-06-30T15:44:15.143Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = 1525771913;

    /**
     * The reference instance of <code>public.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>public.country.country_id</code>.
     */
    public final TableField<CountryRecord, Integer> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('country_country_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.country.country</code>.
     */
    public final TableField<CountryRecord, String> COUNTRY_ = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.country.last_update</code>.
     */
    public final TableField<CountryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.country</code> table reference
     */
    public Country() {
        this("country", null);
    }

    /**
     * Create an aliased <code>public.country</code> table reference
     */
    public Country(String alias) {
        this(alias, COUNTRY);
    }

    private Country(String alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(String alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CountryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.COUNTRY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.COUNTRY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(String alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    public Country rename(String name) {
        return new Country(name, null);
    }
}
