package com.visa.springboot.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gifts")
public class gifts {

	@Id
	@Column(name = "giftid")
	private String giftId = UUID.randomUUID().toString();
	
	@Column(name = "giftcampaignid")
	private String giftCampaignId;
	
	@Column(name = "amount")
	private long amount;
	
	@Column(name = "giftdate")
	private Date giftDate;
	
	@Column(name = "giftmessage")
	private String giftMessage;
	
	@Column(name = "userid")
	private String userId;

	public gifts() {
		super();
	}

	public gifts(String giftCampaignId, long amount, Date giftDate, String giftMessage) {
		super();
		this.giftCampaignId = giftCampaignId;
		this.amount = amount;
		this.giftDate = giftDate;
		this.giftMessage = giftMessage;
	}

	public String getGiftId() {
		return giftId;
	}

	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	public String getGiftCampaignId() {
		return giftCampaignId;
	}

	public void setGiftCampaignId(String giftCampaignId) {
		this.giftCampaignId = giftCampaignId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getGiftDate() {
		return giftDate;
	}

	public void setGiftDate(Date giftDate) {
		this.giftDate = giftDate;
	}

	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "gifts [giftId=" + giftId + ", giftCampaignId=" + giftCampaignId + ", amount=" + amount + ", giftDate="
				+ giftDate + ", giftMessage=" + giftMessage + ", userId=" + userId + "]";
	}
	
	
	
	
	
}
