/**
 * Licensed under Apache 2.0.
 */

package fr.systemx.cti.ra.graph.export.simplified;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Exports a simplified adjacency graph.
 * 
 * @author Artur Rataj
 */
public class SaRoot {
    /**
     * List of software nodes.
     */
    public List<SaNode> NODES;
    /**
     * List of attack vectors.
     */
    public List<SaVector> VECTORS;
    
    /**
     * New instance.
     * 
     */
    public SaRoot() {
        NODES = new ArrayList<>();
        VECTORS = new ArrayList<>();
    }
    /**
     * Produces a serial representation of this snapshot.
     * 
     * @return json representation
     */
    public String toJson() {
        ObjectMapper mapper = new ObjectMapper(); //.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.PUBLIC_ONLY);
        try { 
           JsonNode rootNode = mapper.valueToTree(this);
           return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("unexpected: " + e.getMessage());
        }
    }
}
