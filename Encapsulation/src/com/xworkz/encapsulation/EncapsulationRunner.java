package com.xworkz.encapsulation;

import com.xworkz.encapsulation.internal.*;
import com.xworkz.encapsulation.external.*;

public class EncapsulationRunner {

    public static void main(String[] args) {
        System.out.println("Mutant Operations:");
        Mutant mutant = new Mutant();
        SecondMutant secondMutant = new SecondMutant();
        secondMutant.modifyMutant();
        ExternalMutant externalMutant = new ExternalMutant();
        externalMutant.readMutantDetails();
        System.out.println();

        System.out.println("KeyChain Operations:");
        SecondKeyChain secondKeyChain = new SecondKeyChain();
        secondKeyChain.modifyKeychain();
        ExternalKeyChain externalKeyChain = new ExternalKeyChain();
        externalKeyChain.readKeyChainDetails();
        System.out.println();

        System.out.println("Tank Operations:");
        SecondTank secondTank = new SecondTank();
        secondTank.modifyTank();
        ExternalTank externalTank = new ExternalTank();
        externalTank.readTankDetails();
        System.out.println();

        System.out.println("Badge Operations:");
        SecondBadge secondBadge = new SecondBadge();
        secondBadge.modifyBadge();
        ExternalBadge externalBadge = new ExternalBadge();
        externalBadge.readBadgeDetails();
        System.out.println();

        System.out.println("PostOffice Operations:");
        SecondPostOffice secondPostOffice = new SecondPostOffice();
        secondPostOffice.modifyPostOffice();
        ExternalPostOffice externalPostOffice = new ExternalPostOffice();
        externalPostOffice.readPostOfficeDetails();
        System.out.println();

        System.out.println("Jet Operations:");
        SecondJet secondJet = new SecondJet();
        secondJet.modifyJet();
        ExternalJet externalJet = new ExternalJet();
        externalJet.readJetDetails();
        System.out.println();

        System.out.println("Garage Operations:");
        SecondGarage secondGarage = new SecondGarage();
        secondGarage.modifyGarage();
        ExternalGarage externalGarage = new ExternalGarage();
        externalGarage.readGarageDetails();
        System.out.println();

        System.out.println("Gym Operations:");
        SecondGym secondGym = new SecondGym();
        secondGym.modifyGym();
        ExternalGym externalGym = new ExternalGym();
        externalGym.readGymDetails();
        System.out.println();

        System.out.println("Apartment Operations:");
        SecondApartment secondApartment = new SecondApartment();
        secondApartment.modifyApartment();
        ExternalApartment externalApartment = new ExternalApartment();
        externalApartment.readApartmentDetails();
        System.out.println();

        System.out.println("Occupation Operations:");
        SecondOccupation secondOccupation = new SecondOccupation();
        secondOccupation.modifyOccupation();
        ExternalOccupation externalOccupation = new ExternalOccupation();
        externalOccupation.readOccupationDetails();
        System.out.println();
    }
}


