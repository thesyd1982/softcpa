/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.constants;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author f
 */
@Profile("en")
@Primary
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

 public interface Messages {

        public static String CHOOSE_CLIENT = "Choose the client to invoice.";

        String CLICK_A_BUTTON = "Click a button";

        String ENTER_VALID_POSTAL_CODE ="Enter a valid Postal code (only numbers).";

        String ENTER_VALID_SURNAME="Enter a valid surname (only letters).";

        String ENTER_VALID_EMAIL = "Enter a valid name Email.";
        String WINDOWS_STYLE_LOADING_ERROR_MESSAGE = "There was an error while loading windows look an feel: ";
        String ALERT_TILE = "Alert";
        String NON_ROW_SELECTED = "Non row has been selected";
        String INFORMATION_TITLE = "Information";
        String DELETE_ROW_ERROR = "Could not delete a row. Check if there are any connections between tables.";
        String ENTER_VALID_NAME ="Enter a valid name (only letters).";
        String DELETE_CLIENT_ALERT = "Are you sure you want to delete this client?";
    }

    
    //<editor-fold defaultstate="collapsed" desc="Labels">
  public interface Labels {
    
    public static final String CLIENT_ID="Client ID";
    public static final String MAIN_MENU = "Hotel reservations";
    public static final String CLIENTS = "Clients";
    public static final String ADDRESSES = "Addresses";
    public static final String ADD_BTN = "ADD";
    public static final String CANCEL_BTN = "Cancel";
    public static final String REMOVE_BTN = "Delete";
    public static final String UPDATE_BTN = "Modify";
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
    public static final String SEARCH = "Search";
    public static final String CREATE = "Create";
    public static final String CLIENT_STATUS_PRO ="Professional";
    public static final String CLIENT_STATUS_INDIVIDUAL = "Individual";
    public static final String CLIENT_STATUS = "Client Status";
    public static final String COMPANY_NAME = "Company Name";
    public static final String COMPANY_ID = "Company Id";
    public static String COMPANY = "COMPANY";
    public static String OK = "OK";
    public static String INVOICING= "Invoicing";
    public static String PART_ID = "Part ID";
    public static String EAN_CODE = "Ean Code";
    public static String DESIGNATION = "Designation";
    public static String BRAND = "Brand";
    public static String PROVIDER = "Provider";
    public static String PUR_PRICE = "Purchasing Price";
    public static String QUANTITY = "Quantity";
    public static String SELLING_PRICE = "Selling Price";
    public static String REF = "Reference";
    public static String SELECT_A_FILE = "Select a file";
    public static String CSV_FILE = "CSV File";
    public static String REFRESH_BTN = "Refresh";
    public static String ONE_PART = "Only One part found";
    public static String PARTS="Parts";
    public static String PROVIDER_ID = "Provider ID";
    public static String RROVIDERS = "Providers";
    public static String ONE_PROVIDER= "One Provider found!";
    public static String STOCK = "Stock";
    public static String SELLING_PRICE_HEADER ="ISP";
    public static String PUR_PRICE_HEADER="PP";
    public static String PRO_SELLING_PRICE=" Pro price" ;
     public static String PRO_SELLING_PRICE_HEADER ="PSP";
    }
//</editor-fold>
    

    interface ValidationMessages {
        String REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA = "Not all required fields have been filled or filled data is incorrect";
        String PESEL_LENGTH_INCORRECT = "PESEL should contain 11 characters.";
        String DATE_FROM_MUST_BE_EARLIER_THAN_TO_DATE = "Date from must be earlier than date to";
    }
}
