package com.xuele.log.send.kafka.formatter;

import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * 
 * Formatter implementation that simply returns the logback message.
 * 
 * @author tgoetz
 * 
 */
public class MessageFormatter implements Formatter {

	@Override
    public String format(ILoggingEvent event) {
        return event.getFormattedMessage();
    }

}
