/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import facades.AirlineFacade;

/**
 *
 * @author Eske Wolff
 */
public class Tester {
    
    public static void main(String[] args) {
        
        AirlineFacade af = new AirlineFacade();
        System.out.println(af.getFlightsFrom("CPH", "2016-01-26T13:00:00.000Z", 2));
    }
    
}
