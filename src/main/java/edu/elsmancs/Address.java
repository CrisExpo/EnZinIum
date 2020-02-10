package edu.elsmancs;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

    /*    Propiedades    */

    public PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance =0;

    /*      constructores     */

    public Address() {
    }

    /*      Getters      */

    public PublicKey getPK() {
        return this.PK;
    }

    /*      Setters      */
    /*      Metodos      */

    public void generateKeyPair() {
    }



}
