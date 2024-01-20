package org.example;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
    private DecimalFormat format;

    public TaxVisitor() {
        format =  new DecimalFormat("#.##");
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : Price with Tax");
        return Double.parseDouble(format.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item : Price with Tax");
        return Double.parseDouble(format.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item : Price with Tax");
        return Double.parseDouble(format.format((necessityItem.getPrice() * 0) + necessityItem.getPrice()));
    }
}
