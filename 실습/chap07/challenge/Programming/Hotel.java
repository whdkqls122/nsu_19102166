package challenge_07_programming;

public class Hotel {
    int number;
    String name;
    class Room {
        String[] hotelRoom = new String[10];
        void addReservation(){
            hotelRoom[Hotel.this.number-1] = Hotel.this.name;
        }
        void addReservationShow(){
            for (int i = 0; i<hotelRoom.length; i++){
                if (hotelRoom[i]!=null) System.out.printf("%d번 방을 %s가 예약했습니다.\n", i+1, hotelRoom[i]);
            }
        }
    }
    Room ReservationSituation = new Room();
        void add(int number, String name) {
            this.number = number;
            this.name = name;
            ReservationSituation.addReservation();
        }

        void show() {
            ReservationSituation.addReservationShow();
        }
}
