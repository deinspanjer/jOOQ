/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaCity extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> {

	private static final long serialVersionUID = -1186640641;

	/**
	 * The singleton instance of <code>sakila.city</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaCity CITY = new org.jooq.examples.mysql.sakila.tables.SakilaCity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord.class;
	}

	/**
	 * The column <code>sakila.city.city_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.Short> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.city.city</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.String> CITY_ = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>sakila.city.country_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.Short> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.city.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.city</code> table reference
	 */
	public SakilaCity() {
		super("city", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.city</code> table reference
	 */
	public SakilaCity(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_CITY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_CITY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_CITY_COUNTRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaCity as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaCity(alias);
	}
}
