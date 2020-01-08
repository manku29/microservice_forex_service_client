package com.in28minutes.springboot.microservice.example.currencyconversion;

import java.io.Serializable;

public class Mappings implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 85563122250872625L;
	private Boolean IsDirectCopy ;
	private String NaColumnOption ;
	private Long SequenceNumber ;
	private String SourceExpression ;
	private String TargetColumnName ;
	public Boolean getIsDirectCopy() {
		return IsDirectCopy;
	}
	public void setIsDirectCopy(Boolean isDirectCopy) {
		IsDirectCopy = isDirectCopy;
	}
	public String getNaColumnOption() {
		return NaColumnOption;
	}
	public void setNaColumnOption(String naColumnOption) {
		NaColumnOption = naColumnOption;
	}
	public Long getSequenceNumber() {
		return SequenceNumber;
	}
	public void setSequenceNumber(Long sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}
	public String getSourceExpression() {
		return SourceExpression;
	}
	public void setSourceExpression(String sourceExpression) {
		SourceExpression = sourceExpression;
	}
	public String getTargetColumnName() {
		return TargetColumnName;
	}
	public void setTargetColumnName(String targetColumnName) {
		TargetColumnName = targetColumnName;
	}
	
	
}
