package com.currencydescription.enums;

public enum Tens {

	Ten(10, "ten")
	,ELEVEN(11,"eleven")
	,TWELVE(12,"twelve")
	,THIRTEEN(13,"thirteen")
	,FOURTEEN(14,"fourteen")
	,FIFTEEN(15,"fifteen")
	,SIXTEEN(16,"sixteen")
	,SEVENTEEN(17,"seventeen")
	,EIGHTEEN(18,"eighteen")
	,NINTEEN(19, "ninteen")
	,TWENTY(20, "twenty")
	,THIRTY(30, "thirty")
	,FOURTY(40, "fourty")
	,FIVTY(50, "fivty")
	,SIXTY(60, "sixty")
	,SEVENTY(70, "seventy")
	,EIGHTTY(80, "eighty")
	,NINETY(90, "ninty");
	
	private String description;
	private int numberValue;
	
	Tens(int numberValue, String description) {
		this.numberValue = numberValue;
		this.description = description;
	}
	
	public int getNumberValue() {
		return this.numberValue;
	}

	public String getDescription() {
		return this.description;
	}
	
}
