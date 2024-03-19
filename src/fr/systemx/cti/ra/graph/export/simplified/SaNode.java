/**
 * Licensed under Apache 2.0.
 */

package fr.systemx.cti.ra.graph.export.simplified;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.systemx.cti.math.types.*;

/**
 * A software node.
 * 
 * @author Artur Rataj
 */
public class SaNode {
    public Int2 POS;
    public String NAME;
    /**
     * If one of the software targets.
     */
    public boolean TARGET;
    /**
     * Null if architectural distances are not calculated.
     */
    public Double ARCH_DIST;
    
    public SaNode(
            @JsonProperty("POS") Int2 pos,
            @JsonProperty("NAME") String name,
            @JsonProperty("TARGET") boolean target,
            @JsonProperty("ARCH_DIST") Double archDist) {
        POS = pos;
        NAME = name;
        TARGET = target;
        ARCH_DIST = archDist;
    }
}
