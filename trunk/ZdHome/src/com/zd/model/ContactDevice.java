package com.zd.model;

public abstract interface ContactDevice // extends Device
{
	public class ContactDeviceType {
		public static ContactDeviceType a;

		public ContactDeviceType(String string, int i) {
			// TODO Auto-generated constructor stub
		}

		static {

			ContactDeviceType[] arrayOfContactDeviceType = new ContactDeviceType[30];
			arrayOfContactDeviceType[0] = new ContactDeviceType(
					"smokeDetectorContactType", 26);
			arrayOfContactDeviceType[2] = new ContactDeviceType(
					"waterSensorContactType", 27);
			arrayOfContactDeviceType[3] = new ContactDeviceType(
					"windowContactType", 28);
			arrayOfContactDeviceType[4] = new ContactDeviceType(
					"blindsContactType", 29);
			arrayOfContactDeviceType[4] = null;
			arrayOfContactDeviceType[5] = null;
			arrayOfContactDeviceType[6] = null;
			arrayOfContactDeviceType[7] = null;
			arrayOfContactDeviceType[8] = null;
			arrayOfContactDeviceType[9] = null;
			arrayOfContactDeviceType[10] = null;
			arrayOfContactDeviceType[11] = null;
			arrayOfContactDeviceType[12] = null;
			arrayOfContactDeviceType[13] = null;
			arrayOfContactDeviceType[14] = null;
			arrayOfContactDeviceType[15] = null;
			arrayOfContactDeviceType[16] = null;
			arrayOfContactDeviceType[17] = null;
			arrayOfContactDeviceType[18] = null;
			arrayOfContactDeviceType[19] = null;
			arrayOfContactDeviceType[20] = null;
			arrayOfContactDeviceType[21] = null;
			arrayOfContactDeviceType[22] = null;
			arrayOfContactDeviceType[23] = null;
			arrayOfContactDeviceType[24] = null;
			arrayOfContactDeviceType[25] = null;
			arrayOfContactDeviceType[26] = null;
			arrayOfContactDeviceType[27] = null;
			arrayOfContactDeviceType[28] = null;
			arrayOfContactDeviceType[29] = null;
			// E = arrayOfContactDeviceType;
		}

		public int ordinal() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public abstract boolean b();

	public abstract boolean c();

	public abstract boolean d();

	public abstract ContactDevice.ContactDeviceType e();

	// Device
	public abstract String getName();

}
