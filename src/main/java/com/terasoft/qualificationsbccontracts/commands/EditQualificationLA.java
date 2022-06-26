package com.terasoft.qualificationsbccontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditQualificationLA {
    @TargetAggregateIdentifier
    private String qualificationId;
    private String comment;
    private Integer score;
}
