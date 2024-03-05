/**
 * Licensed under Apache 2.0.
 */

package fr.systemx.cti.ra.graph.export.simplified;

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
     * Null if architectural distances are not calculated.
     */
    public Double ARCH_DIST;
    
    public SaNode(Int2 pos, String name, Double archDist) {
        POS = pos;
        NAME = name;
        ARCH_DIST = archDist;
    }
}
