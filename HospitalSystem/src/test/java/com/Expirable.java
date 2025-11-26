package test.java.com;

import java.time.LocalDate;

public interface Expirable {
	LocalDate getExpiryDate();
    boolean isExpired();
}

interface Chargeable {
    double calculateCost();
}


