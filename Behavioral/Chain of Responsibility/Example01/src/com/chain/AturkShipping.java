package com.chain;

public class AturkShipping {
    public static ShippingCompany getShippingCompany() {
        CankiriDepartment cankiriDepartment = new CankiriDepartment();
        AnkaraDepartment ankaraDepartment = new AnkaraDepartment();
        IstanbulDepartment istanbulDepartment = new IstanbulDepartment();
        AntalyaDepartment antalyaDepartment = new AntalyaDepartment();

        return cankiriDepartment.setNextShippingCompany(
                ankaraDepartment.setNextShippingCompany(istanbulDepartment.setNextShippingCompany(antalyaDepartment)));
    }
}
