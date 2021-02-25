package hotelReservationUC1;

import java.util.ArrayList;


public class HotelReservation {
	
	private static ArrayList<HotelDetails> hotelList = new ArrayList<>();
	
	public ArrayList<HotelDetails> getHotelList() {
		return hotelList;
	}
	
	public static void addHotel(String name, int price){
		HotelDetails temporary = new HotelDetails(name,price);
		hotelList.add(temporary);
	}
	
	public static int countNoOfHotels() {
		return hotelList.size();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation");
		HotelDetails lakeWood=new HotelDetails("Lakewood",110);
		HotelDetails bridgeWood=new HotelDetails("Bridgewood",110);
		HotelDetails ridgeWood=new HotelDetails("Ridgewood",110);
		hotelList.add(lakeWood);
		hotelList.add(bridgeWood);
		hotelList.add(ridgeWood);
		System.out.println(hotelList);
	}
}
