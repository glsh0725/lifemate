package fs.four.dropout.mate.vo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component("mateVO")
public class MateVO {

    private Number mt_number;
    private String usr_id;
    private String mt_info;
    private String mt_location;
    private String mt_category;
    private String mt_facility_name;
    private String mt_contact;
    private String mt_new_address;
    private String mt_old_address;
    private String mt_url;
    private char mt_entry_fee;
    private char mt_fee_parking;
    private char mt_paid_parking;
    private String mt_entry_age;
    private char mt_family_toilet;
    private char mt_stroller_rental;
    private char mt_nursing_room;
    private char mt_kid_zone;
    private Date mt_last_updated;

    public MateVO() {

    }

    public Number getMt_number() {
        return mt_number;
    }

    public void setMt_number(Number mt_number) {
        this.mt_number = mt_number;
    }

    public String getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }

    public String getMt_info() {
        return mt_info;
    }

    public void setMt_info(String mt_info) {
        this.mt_info = mt_info;
    }

    public String getMt_location() {
        return mt_location;
    }

    public void setMt_location(String mt_location) {
        this.mt_location = mt_location;
    }

    public String getMt_category() {
        return mt_category;
    }

    public void setMt_category(String mt_category) {
        this.mt_category = mt_category;
    }

    public String getMt_facility_name() {
        return mt_facility_name;
    }

    public void setMt_facility_name(String mt_facility_name) {
        this.mt_facility_name = mt_facility_name;
    }

    public String getMt_contact() {
        return mt_contact;
    }

    public void setMt_contact(String mt_contact) {
        this.mt_contact = mt_contact;
    }

    public String getMt_new_address() {
        return mt_new_address;
    }

    public void setMt_new_address(String mt_new_address) {
        this.mt_new_address = mt_new_address;
    }

    public String getMt_old_address() {
        return mt_old_address;
    }

    public void setMt_old_address(String mt_old_address) {
        this.mt_old_address = mt_old_address;
    }

    public String getMt_url() {
        return mt_url;
    }

    public void setMt_url(String mt_url) {
        this.mt_url = mt_url;
    }

    public char getMt_entry_fee() {
        return mt_entry_fee;
    }

    public void setMt_entry_fee(char mt_entry_fee) {
        this.mt_entry_fee = mt_entry_fee;
    }

    public char getMt_fee_parking() {
        return mt_fee_parking;
    }

    public void setMt_fee_parking(char mt_fee_parking) {
        this.mt_fee_parking = mt_fee_parking;
    }

    public char getMt_paid_parking() {
        return mt_paid_parking;
    }

    public void setMt_paid_parking(char mt_paid_parking) {
        this.mt_paid_parking = mt_paid_parking;
    }

    public String getMt_entry_age() {
        return mt_entry_age;
    }

    public void setMt_entry_age(String mt_entry_age) {
        this.mt_entry_age = mt_entry_age;
    }

    public char getMt_family_toilet() {
        return mt_family_toilet;
    }

    public void setMt_family_toilet(char mt_family_toilet) {
        this.mt_family_toilet = mt_family_toilet;
    }

    public char getMt_stroller_rental() {
        return mt_stroller_rental;
    }

    public void setMt_stroller_rental(char mt_stroller_rental) {
        this.mt_stroller_rental = mt_stroller_rental;
    }

    public char getMt_nursing_room() {
        return mt_nursing_room;
    }

    public void setMt_nursing_room(char mt_nursing_room) {
        this.mt_nursing_room = mt_nursing_room;
    }

    public char getMt_kid_zone() {
        return mt_kid_zone;
    }

    public void setMt_kid_zone(char mt_kid_zone) {
        this.mt_kid_zone = mt_kid_zone;
    }

    public Date getMt_last_updated() {
        return mt_last_updated;
    }

    public void setMt_last_updated(Date mt_last_updated) {
        this.mt_last_updated = mt_last_updated;
    }
}
