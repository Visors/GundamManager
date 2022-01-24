package com.sayo.pojo;

import java.util.Date;

public class Good {
	private String good_id;
	private String type;
	private String name;
	private String price;
	private String source;
	private Date last_date;
	private Date next_date;

	public String getGood_id() {
		return good_id;
	}

	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getLast_date() {
		return last_date;
	}

	public void setLast_date(Date last_date) {
		this.last_date = last_date;
	}

	public Date getNext_date() {
		return next_date;
	}

	public void setNext_date(Date next_date) {
		this.next_date = next_date;
	}

	@Override
	public String toString() {
		return "Good [good_id=" + good_id + ", type=" + type + ", name=" + name + ", price=" + price + ", source="
				+ source + ", last_date=" + last_date + ", next_date=" + next_date + "]";
	}

}
