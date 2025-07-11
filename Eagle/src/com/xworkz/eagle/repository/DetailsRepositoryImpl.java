package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.DetailsDto;
import com.xworkz.eagle.dto.EducationDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DetailsRepositoryImpl implements DetailsRepository {

    private final Set<DetailsDto> detailsSet = new HashSet<>();

    public DetailsRepositoryImpl(EducationRepository educationRepository) {
        Iterator<EducationDto> iterator = educationRepository.findEducation().iterator();

        detailsSet.add(new DetailsDto("Personal", "Verified", iterator.next(), "All documents submitted"));
        detailsSet.add(new DetailsDto("Employment", "Pending", iterator.next(), "Waiting for HR confirmation"));
        detailsSet.add(new DetailsDto("Academic", "Verified", iterator.next(), "Verified by registrar"));
        detailsSet.add(new DetailsDto("Financial", "Rejected", iterator.next(), "Incomplete records"));
        detailsSet.add(new DetailsDto("Criminal", "Verified", iterator.next(), "Clean record"));
        detailsSet.add(new DetailsDto("Medical", "Pending", iterator.next(), "Reports awaited"));
        detailsSet.add(new DetailsDto("Travel", "Verified", iterator.next(), "Frequent traveler"));
        detailsSet.add(new DetailsDto("Residency", "Verified", iterator.next(), "Current address confirmed"));
        detailsSet.add(new DetailsDto("Marriage", "Pending", iterator.next(), "Certificate submission required"));
        detailsSet.add(new DetailsDto("Tax", "Verified", iterator.next(), "No issues found"));

        detailsSet.add(new DetailsDto("Visa", "Approved", iterator.next(), "Documents valid"));
        detailsSet.add(new DetailsDto("Passport", "Verified", iterator.next(), "Active passport"));
        detailsSet.add(new DetailsDto("Driving License", "Expired", iterator.next(), "Renewal needed"));
        detailsSet.add(new DetailsDto("Police Clearance", "Verified", iterator.next(), "No FIR records"));
        detailsSet.add(new DetailsDto("Work Permit", "Pending", iterator.next(), "Under process"));
        detailsSet.add(new DetailsDto("Loan", "Verified", iterator.next(), "Loan paid off"));
        detailsSet.add(new DetailsDto("Insurance", "Verified", iterator.next(), "Policy active"));
        detailsSet.add(new DetailsDto("Bank Account", "Verified", iterator.next(), "Valid account"));
        detailsSet.add(new DetailsDto("Credit Score", "Rejected", iterator.next(), "Below average"));
        detailsSet.add(new DetailsDto("Rental", "Pending", iterator.next(), "Agreement under review"));

        detailsSet.add(new DetailsDto("Birth Certificate", "Verified", iterator.next(), "Issued from government"));
        detailsSet.add(new DetailsDto("ID Card", "Verified", iterator.next(), "Photo matched"));
        detailsSet.add(new DetailsDto("Social Media", "Verified", iterator.next(), "Reviewed manually"));
        detailsSet.add(new DetailsDto("Reference", "Pending", iterator.next(), "One reference missing"));
        detailsSet.add(new DetailsDto("Utility Bills", "Verified", iterator.next(), "Address matched"));
        detailsSet.add(new DetailsDto("Employment Letter", "Rejected", iterator.next(), "Mismatch in dates"));
        detailsSet.add(new DetailsDto("Academic Certificate", "Verified", iterator.next(), "Authenticated"));
        detailsSet.add(new DetailsDto("Offer Letter", "Pending", iterator.next(), "Awaiting signature"));
        detailsSet.add(new DetailsDto("Relocation", "Verified", iterator.next(), "Ready for transfer"));
        detailsSet.add(new DetailsDto("Emergency Contact", "Verified", iterator.next(), "Phone number confirmed"));
    }

    @Override
    public Set<DetailsDto> findDetails() {
        return detailsSet;
    }
}
