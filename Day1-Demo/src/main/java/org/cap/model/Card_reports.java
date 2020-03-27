package org.cap.model;

public class Card_reports {
	
	public int card_id;
	public int card_type;
	public int no_of_reports;
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	public int getCard_type() {
		return card_type;
	}
	public void setCard_type(int card_type) {
		this.card_type = card_type;
	}
	public int getNo_of_reports() {
		return no_of_reports;
	}
	public void setNo_of_reports(int no_of_reports) {
		this.no_of_reports = no_of_reports;
	}
	public Card_reports(int card_id, int card_type, int no_of_reports) {
		super();
		this.card_id = card_id;
		this.card_type = card_type;
		this.no_of_reports = no_of_reports;
	}
	

}
