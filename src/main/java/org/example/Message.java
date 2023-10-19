package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {

    COVERED_KEY(": ******"),
    EMPTY("Mapa jest pusta."),
    SEPARATOR(" : ");

    private final String message;
}
