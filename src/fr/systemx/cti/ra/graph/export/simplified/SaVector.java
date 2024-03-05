/**
 * Licensed under Apache 2.0.
 */

package fr.systemx.cti.ra.graph.export.simplified;

/**
 * An attack vector.
 * 
 * @author Artur Rataj
 */
public class SaVector {
    public String SOURCE;
    public String TARGET;
    public double COST;
    
    public SaVector(String s, String t, double c){
        SOURCE = s;
        TARGET = t;
        COST = c;
    }
}
