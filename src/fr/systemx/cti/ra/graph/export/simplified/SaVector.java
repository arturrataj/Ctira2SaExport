/**
 * Licensed under Apache 2.0.
 */

package fr.systemx.cti.ra.graph.export.simplified;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An attack vector.
 * 
 * @author Artur Rataj
 */
public class SaVector {
    public String SOURCE;
    public String TARGET;
    public double COST;
    
    public SaVector(
            @JsonProperty("SOURCE") String s,
            @JsonProperty("TARGET") String t,
            @JsonProperty("COST") double c) {
        SOURCE = s;
        TARGET = t;
        COST = c;
    }
}
