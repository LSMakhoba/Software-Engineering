/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tholithemba
 */
public class Get_data {
    

    private int patient_id=-1;
    private int doctor_id=-1;
    private String check_in="";
    private String check_out="";
    private String booking_date="";
    
    public Get_data(String Booking_date, String Check_in, String Check_out,
    int Pateint_id, int Doctor_id)
    {
        this.booking_date = Booking_date;
        this.check_in = Check_in;
        this.check_out = Check_out;
        this.patient_id = Pateint_id;
        this.doctor_id = Doctor_id;
    }
    
    public String getBooking_date()
    {
        return booking_date;
    }
    
    public String getCheck_in()
    {
        return check_in;
    }
    
    public String getCheck_out()
    {
        return check_out;
    }
    
    public int getPatient_id()
    {
        return patient_id;
    }
    
    public int getDoctor_id()
    {
        return doctor_id;
    }    
}
