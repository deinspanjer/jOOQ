/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_unsigned", schema = "test2")
public class TUnsigned implements java.io.Serializable {

	private static final long serialVersionUID = 1580344862;

	private org.jooq.types.UByte    uByte;
	private org.jooq.types.UShort   uShort;
	private org.jooq.types.UInteger uInt;
	private org.jooq.types.ULong    uLong;

	@javax.persistence.Column(name = "u_byte", precision = 3)
	public org.jooq.types.UByte getUByte() {
		return this.uByte;
	}

	public void setUByte(org.jooq.types.UByte uByte) {
		this.uByte = uByte;
	}

	@javax.persistence.Column(name = "u_short", precision = 5)
	public org.jooq.types.UShort getUShort() {
		return this.uShort;
	}

	public void setUShort(org.jooq.types.UShort uShort) {
		this.uShort = uShort;
	}

	@javax.persistence.Column(name = "u_int", precision = 10)
	public org.jooq.types.UInteger getUInt() {
		return this.uInt;
	}

	public void setUInt(org.jooq.types.UInteger uInt) {
		this.uInt = uInt;
	}

	@javax.persistence.Column(name = "u_long", precision = 20)
	public org.jooq.types.ULong getULong() {
		return this.uLong;
	}

	public void setULong(org.jooq.types.ULong uLong) {
		this.uLong = uLong;
	}
}
