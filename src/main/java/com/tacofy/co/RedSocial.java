package com.tacofy.co;

public enum RedSocial {
	UNKNOWN(0),
	FACEBOOK(1),
	INSTAGRAM(2),
	WEBSITE(3),
	WHATSAPP(4);
	
	private final int value;

	RedSocial(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static RedSocial getById(int id) {
        for(RedSocial e : values()) {
            if(e.value ==id) return e;
        }
        return UNKNOWN;
    }
   
}
