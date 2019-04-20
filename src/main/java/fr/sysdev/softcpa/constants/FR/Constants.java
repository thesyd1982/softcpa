/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.constants.FR;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author f
 */
@Profile("default")
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

        public static String CHOOSE_CLIENT = "Choisissez le client à facturer.";
        public static Object SELECT_CLIENT = "Veuillez sélectionner un client.";
        public static Object SELECT_PARTS = "Veuillez sélectionner une pièce.";
        public static Object CLIENT_HAS_INVOICES="Impossible de supprimer ce client a des factures!";

        String CLICK_A_BUTTON = "Cliquez sur un bouton";

        String ENTER_VALID_POSTAL_CODE ="Entrez un code postal valide (uniquement des chiffres).";

        String ENTER_VALID_SURNAME="Entrez un nom de famille valide (lettres seulement).";

        String ENTER_VALID_EMAIL = "Entrer un email valide.";
        String WINDOWS_STYLE_LOADING_ERROR_MESSAGE = "Une erreur s'est produite lors du chargement du theme";
        String ALERT_TILE = "Alerte";
        String NON_ROW_SELECTED = "Aucune ligne n'a été sélectionnée";
        String INFORMATION_TITLE = "Information";
        String DELETE_ROW_ERROR = "Impossible de supprimer une ligne. Vérifiez s'il y a des connexions entre les tables.";
        String ENTER_VALID_NAME ="Entrez un nom valide (uniquement des lettres).";
        String DELETE_CLIENT_ALERT = "Êtes-vous sûr de vouloir supprimer ce client?";
    }
    public interface JFrameTitles {

        public static String INVOICES ="Factures";
        public static String STOCK ="Stock";
        public static String INVOICING ="Facturation";
        public static String CLIENTS ="Clients";
        public static String CREDIT_NOTES ="Avoirs";
        public static String QUOTATIONS ="devis";
        public static String PROVIDERS ="Fournisseurs";
    }
    
    //<editor-fold defaultstate="collapsed" desc="Labels">
  public interface Labels {
    
    public static final String CLIENT_ID="Client ID";
    public static final String MAIN_MENU = "Hotel reservations";
    public static final String CLIENTS = "Clients";
    public static final String ADDRESSES = "Adresses";
    public static final String ADD_BTN = "Ajouter";
    public static final String CANCEL_BTN = "Annuler";
    public static final String REMOVE_BTN = "Supprimer";
    public static final String UPDATE_BTN = "Modifier";
    public static final String NAME = "Nom";
    public static final String SURNAME = "Prénom";
    public static final String PESEL = "Pesel";
    public static final String PHONE_NUMBER = "Numéro de téléphone";
    public static final String EMAIL = "E-mail";
    public static final String ADDRESS = "Adresse";
    public static final String HOUSE_NUMBER = "Numéro de rue";
    public static final String CITY = "Ville";
    public static final String POSTAL_CODE = "Code postal";
    public static final String INVOICE_STATUS = "Statut de la facture";
    public static final String PAYMENT_METHODS = "Méthodes de payement";
    public static final String PAYMENTS = "Paiements";
    public static final String PAYMENT_METHOD = "Mode de paiement";
    public static final String VALUE = "Valeur";
    public static final String DATE_OF_PAYMENT = "Date of payment";
    public static final String PAYMENT = "Paiement";
    public static final String CLIENT = "Client";
    public static final String FROM_DATE = "De";
    public static final String TO_DATE = "À";
    public static final String INVOICE_DATE = "Date de facturation";
    public static final String AMOUNT = "Total";
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
    public static final String PRICE = "Prix";
    public static final String FORMS = "Forms";
    public static final String REPORTS = "Raports";
    public static final String PAYMENT_COUNT = "Payment coun";
    public static final String NUMBER_OF_COUNT = "Number of count";
    public static final String NUMBER_OF_RESERVATIONS = "Number of reservations";
    public static final String CLIENT_RESERVATIONS = "Client's reservations";
    public static final String STREET = "Rue";
    public static final String SEARCH = "Recherche";
    public static final String CREATE = "Créer";
    public static final String CLIENT_STATUS_PRO ="Professionnel";
    public static final String CLIENT_STATUS_INDIVIDUAL = "particulier";
    public static final String CLIENT_STATUS = "Statut du client";
    public static final String COMPANY_NAME = "Nom de société";
    public static final String COMPANY_ID = "Société Id";
    public static String COMPANY = "Société";
    public static String OK = "OK";
    public static String INVOICING= "Facturation";
    public static String PART_ID = "Pièce ID";
    public static String EAN_CODE = "Ean Code";
    public static String DESIGNATION = "Désignation";
    public static String BRAND = "Marque";
    public static String PROVIDER = "Fournisseur";
    public static String PUR_PRICE = "Prix d'achat";
    public static String QUANTITY = "Quantité";
    public static String SELLING_PRICE = "Prix de vente";
    public static String REF = "Référence";
    public static String SELECT_A_FILE = "Sélectionner un fichier";
    public static String CSV_FILE = "Fichier CSV";
    public static String REFRESH_BTN = "Rafraîchir";
    public static String ONE_PART = "Une seule pièce trouvéed";
    public static String PARTS="Pièces";
    public static String PROVIDER_ID = "Fournisseur ID";
    public static String RROVIDERS = "Fournisseurs";
    public static String ONE_PROVIDER= "Un seul fournisseur trouvé!";
    public static String STOCK = "Stock";
    public static String SELLING_PRICE_HEADER ="PVP";
    public static String PUR_PRICE_HEADER="PA";
    public static String PRO_SELLING_PRICE=" Pro price" ;
    public static String PRO_SELLING_PRICE_HEADER ="PP";
    public static String SELECTION_COUNT="Nombre de sélection";
    public static String INVOICE = "Facture";
    public static String CREDIT_NOTE = "Avoir";
    public static String DELIVERY_FORM = "Bon de livraison";
    public static String QUIT = "Quitter";
    public static String CONFIRMATION="Confirmation";
    public static String PLATENUMBER = "Numéro de la plaque";
    public static String VEHICLE_TYPE ="Type de véhicule";
    public static String VALIDATE = "Valider";
    public static String DATE = "Date";
    public static String UNPAID = "Impayée";
    public static String INVOICE_PREFIX ="INV";
    public static String INVOICE_NUMBER = "Numéro de facture";
    public static String PAYMENT_DATE ="Date du paiement";
    public static String PAYED="Payée";
    public static String PAYMENT_DETAILS="Détails du paiement";
    public static String PAYMENT_NUMBER="Numéro du paiement";
    public static String BANKCARD ="Carte bancaire";
    public static String CASH ="Espèces";
    public static String CHEQUE="chèque";
    public static String PENDING = "En attente";
    public static String DESCRIPTION = "Description";
    public static String INVOICE_DETAILS = "Détails de la facture";
    public static String UNIT_PRICE = "Prix unitaire";
    public static String TOTAL = "Total";
    public static String TOTAL_TAX = "total des taxes";
    public static String SUBTOTAL = "Sous-Total";
    public static String DISCOUNT = "Remise";
    public static String TAX_RATE = "Tva";
    public static String SUBTOTAL_LESS_DISCOUNT ="Subtotal Less Discount";
    public static String PAY_THE_BILL = "payer les factures";
    public static String SALES_REVENUES =  "Chiffre d'affaires";
    public static String BTN_CLIENTS ="Clients";
    public static String BTN_STOCK = "Stock";
    public static String QUOTES ="Devis";
    public static String BTN_PROVIDERS="Fournisseurs";
    public static String INVOICES ="Factures";
    public static String INDIVIDUAL ="Particulier";
    public static String PROFESSIONAL="Professionel";
    }
//</editor-fold>
    

    interface ValidationMessages {
        String REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA = "Tous les champs obligatoires n'ont pas été renseignés ou les données renseignées sont incorrectes";
        String PESEL_LENGTH_INCORRECT = "PESEL should contain 11 characters.";
        String DATE_FROM_MUST_BE_EARLIER_THAN_TO_DATE = "La date de doit être antérieure à la date de";
    }
}
