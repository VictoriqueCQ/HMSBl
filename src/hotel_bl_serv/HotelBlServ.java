package hotel_bl_serv;

import PO.HotelPO;

public interface HotelBlServ {
	public HotelPO getHotelInfo(String name);
	public boolean modifyHotelInfo(HotelPO hotel);
}
