package com.terasoft.qualificationsbccontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterQualificationCLC {
    @TargetAggregateIdentifier
    private String qualificationId;
    private String comment;
    private Integer score;
    private String lawyerId;
    private String customerId;
    private String customLegalCaseId;
}
