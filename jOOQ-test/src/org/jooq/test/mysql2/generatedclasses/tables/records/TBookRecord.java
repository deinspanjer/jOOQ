/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book", schema = "test2")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> {

	private static final long serialVersionUID = 1883887614;

	/**
	 * Setter for <code>test2.t_book.ID</code>. The book ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test2.t_book.ID</code>. The book ID
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>test2.t_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test2.t_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 10)
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>test2.t_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test2.t_book.co_author_id</code>. 
	 */
	@javax.persistence.Column(name = "co_author_id", precision = 10)
	public java.lang.Integer getCoAuthorId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>test2.t_book.DETAILS_ID</code>. Some more details about the book
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test2.t_book.DETAILS_ID</code>. Some more details about the book
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 10)
	public java.lang.Integer getDetailsId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>test2.t_book.TITLE</code>. The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>test2.t_book.TITLE</code>. The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 65535)
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>test2.t_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>test2.t_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 10)
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>test2.t_book.LANGUAGE_ID</code>. The language of the book
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>test2.t_book.LANGUAGE_ID</code>. The language of the book
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 10)
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>test2.t_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>test2.t_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>test2.t_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>test2.t_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	/**
	 * Setter for <code>test2.t_book.STATUS</code>. The book's stock status
	 */
	public void setStatus(org.jooq.test.mysql2.generatedclasses.enums.TBookStatus value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>test2.t_book.STATUS</code>. The book's stock status
	 */
	@javax.persistence.Column(name = "STATUS", length = 8)
	public org.jooq.test.mysql2.generatedclasses.enums.TBookStatus getStatus() {
		return (org.jooq.test.mysql2.generatedclasses.enums.TBookStatus) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> field10() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.enums.TBookStatus value10() {
		return getStatus();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK);
	}
}
