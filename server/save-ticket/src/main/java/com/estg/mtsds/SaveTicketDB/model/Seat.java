package com.estg.mtsds.SaveTicketDB.model;

public class Seat {

    private boolean isOccupied;
    private String reservationId;
    private boolean paid;
    private String dateTime;

    public Seat(boolean isOccupied, String reservationId, boolean paid, String dateTime) {
        this.isOccupied = isOccupied;
        this.reservationId = reservationId;
        this.paid = paid;
        this.dateTime = dateTime;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "isOccupied=" + isOccupied +
                ", reservationId='" + reservationId + '\'' +
                ", paid=" + paid +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
