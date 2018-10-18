package org.reactome.server.diagram.converter.layout.output;

/**
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
public class Stoichiometry {
    public Integer value;
    public Shape shape;

    public void translate(Coordinate panning){
        if(shape!=null) shape.translate(panning);
    }
}
