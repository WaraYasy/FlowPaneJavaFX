package org.dein;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lanzador {
    private static final Logger log = LoggerFactory.getLogger(Lanzador.class);

    public static void main(String[] args) {
        log.info("Se ha iniciado AppFlowPane..");
        AppFlowPane.main(args);
    }
}
