package de.sturmm.rxdemo.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

/**
 * Created by sturmm on 06.06.17.
 */
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogRecord {

    private String id;

    private Instant startTimestamp;
    private Instant endTimestamp;
    private int startMileage;
    private int endMileage;

}
