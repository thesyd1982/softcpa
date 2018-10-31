/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.constants;

import org.springframework.context.annotation.Profile;

/**
 *
 * @author f
 */
@Profile("en")
public abstract class Constants {
    
     interface DialogTitles {
        String CLIENT_MODAL = "Adding client";
        String ADDRESS_MODAL = "Adding address";
        String PAYMENT_METHOD_MODAL = "Adding payment methods";
        String PAYMENT_MODAL = "Adding payments";
        String RESERVATION_MODAL = "Adding reservations";
        String ROOM_STATUS_MODAL = "Adding room statuses";
        String ROOM_TYPE_MODAL = "Adding room types";
        String ROOM_MODAL = "Adding rooms";
        String RATE_MODAL = "Adding rates";
        String ROOM_X_RESERVATION_MODAL = "Adding room reservations";
    }

    interface Messages {
        String WINDOWS_STYLE_LOADING_ERROR_MESSAGE = "There was an error while loading windows look an feel: ";
        String ALERT_TILE = "Alert";
        String NON_ROW_SELECTED = "Non row has been selected";
        String INFORMATION_TITLE = "Information";
        String DELETE_ROW_ERROR = "Could not delete a row. Check if there are any connections between tables.";
    }

    
    //<editor-fold defaultstate="collapsed" desc="Labels">
    public static final String MAIN_MENU = "Hotel reservations";
    public static final String CLIENTS = "Clients";
    public static final String ADDRESSES = "Addresses";
    public static final String ADD_BTN = "Add";
    public static final String CANCEL_BTN = "Cancel";
    public static final String REMOVE_BTN = "Remove";
    public static final String NAME = "Name";
    public static final String SURNAME = "Surname";
    public static final String PESEL = "Pesel";
    public static final String PHONE_NUMBER = "Phone number";
    public static final String EMAIL = "E-mail";
    public static final String ADDRESS = "Address";
    public static final String HOUSE_NUMBER = "House number";
    public static final String CITY = "City";
    public static final String POSTAL_CODE = "Post code";
    public static final String INVOICE_STATUS = "Invoice status";
    public static final String PAYMENT_METHODS = "Payment methods";
    public static final String PAYMENTS = "Payments";
    public static final String PAYMENT_METHOD = "Payment method";
    public static final String VALUE = "Value";
    public static final String DATE_OF_PAYMENT = "Date of payment";
    public static final String PAYMENT = "Payment";
    public static final String CLIENT = "Client";
    public static final String FROM_DATE = "From";
    public static final String TO_DATE = "To";
    public static final String INVOICE_DATE = "Invoice date";
    public static final String AMOUNT = "Suma";
    public static final String ROOM_STATUS = "Room status";
    public static final String ROOM_STATUSES = "Room statuses";
    public static final String ROOM_STATUS_DESCRIPTION = "Room status description";
    public static final String ROOM_TYPE = "Room type";
    public static final String ROOM_MULTIPLIER = "Multiplier";
    public static final String ROOM_TYPES = "Room types";
    public static final String ROOM_TYPE_DESCRIPTION = "Room type description";
    public static final String ROOM_NUMBER_OF_PEOPLE = "Number of people";
    public static final String ROOM_DESCRIPTION = "Description";
    public static final String ROOMS = "Rooms";
    public static final String ROOM = "Room";
    public static final String BASIC_RATE = "Basic rate";
    public static final String RATES = "Rates";
    public static final String ROOM_X_RESERVATIONS = "Rooms reservations";
    public static final String RESERVATION = "Reservation";
    public static final String PRICE = "Price";
    public static final String FORMS = "Forms";
    public static final String REPORTS = "Raports";
    public static final String PAYMENT_COUNT = "Payment coun";
    public static final String NUMBER_OF_COUNT = "Number of count";
    public static final String NUMBER_OF_RESERVATIONS = "Number of reservations";
    public static final String CLIENT_RESERVATIONS = "Client's reservations";
    public static final String STREET = "Street";
//</editor-fold>
    

    interface ValidationMessages {
        String REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA = "Not all required fields have been filled or filled data is incorrect";
        String PESEL_LENGTH_INCORRECT = "PESEL should contain 11 characters.";
        String DATE_FROM_MUST_BE_EARLIER_THAN_TO_DATE = "Date from must be earlier than date to";
    }
}
