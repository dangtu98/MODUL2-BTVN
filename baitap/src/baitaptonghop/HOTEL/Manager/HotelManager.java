package baitaptonghop.HOTEL.Manager;

import baitaptonghop.HOTEL.Hotel;
import baitaptonghop.HOTEL.Human;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HotelManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Hotel> hotels;

    public HotelManager() {
        this.hotels = new ArrayList<>();
    }

    public Hotel createHotel(Human human){
        System.out.println("nhập vào ngày bắt đầu trọ");
        String date = scanner.next();
        LocalDateTime startDate = LocalDateTime.from(LocalDate.parse(date , DateTimeFormatter.ofPattern("dd-ll-yyyy")));
        System.out.println("nhập vào loại phòng");
        String kind = scanner.nextLine();
        System.out.println("Nhập vào giá phòng");
        double price = scanner.nextDouble();
        Hotel hotel = new Hotel(startDate,kind,price,human);
        hotels.add(hotel);
        return hotel;
    }

    public void displayRoomTenants(){
        HashSet < Human > humanHashSet = new HashSet<>();
        for (Hotel hotel : hotels){
            humanHashSet.add(hotel.getHuman());
        }
        System.out.println(humanHashSet);
    }


    public void displayRoomOfHuman(String idCard){
        for (Hotel hotel : hotels){
            if (hotel.getHuman().getIdCard().equals(idCard)){
                System.out.println(hotel);
            }
        }
    }

    public double payForRoom(String idCard){
        ArrayList <Hotel> hotelIpay = new ArrayList<>();
        double sumPrice = 0;
        for (Hotel hotel : hotels){
            if (hotel.getHuman().getIdCard().equals(idCard)){
                sumPrice += hotel.getPrice()*(LocalDate.now().getDayOfYear() - hotel.getStartDate().getDayOfYear());
                hotelIpay.add(hotel);
            }
        }
        hotels.removeAll(hotelIpay);
         return sumPrice;

    }
}
