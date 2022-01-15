package com.uttara.device;







public class TestDevice {

	public static void main(String[] args) {
		
		//Device d = new Device();  //can not instantiate device
		
		Device.test();
		
		Device d = new MobilePhone();
		APerson p = new APerson();
		p.use(d);
		
	}

}
