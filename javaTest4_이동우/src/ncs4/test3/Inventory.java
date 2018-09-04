package ncs4.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	public Inventory() {}
	
	public Inventory(String productName,Date putDate,Date getDate,int putAmount,int getAmount,int inventoryAmount) {
		this.productName=productName;
		this.putDate=putDate;
		this.getDate=getDate;
		this.putAmount=putAmount;
		this.getAmount=getAmount;
		this.inventoryAmount=inventoryAmount;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일");
		return productName+", "+sdf.format(putDate)+" 입고, "+putAmount+"개, "+(getDate instanceof Date?sdf.format(getDate):"null")+" 출고, "+getAmount+"개, 재고 "+inventoryAmount+"개";
	}
	
	public void setGetDate(Date getDate) {
		this.getDate=getDate;
	}
	
	public void setGetAmount(int getAmount) throws AmountNotEnough {
		this.getAmount=getAmount;
		if(getAmount>inventoryAmount) {
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		} else {
			this.inventoryAmount-=getAmount;
		}
	}

	
}
