package it.hyperdata.diced.model.rdf;

import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.tdb.TDB;
import org.apache.jena.tdb.TDBFactory;

/**
 * Created by danny on 17/03/18.
 */

public class RDFStore {

    // private static final TaskTreeRDF db = new TaskTreeRDF();

    private static final String DIR = "db";
    private static final RDFStore store = new RDFStore();

    private Dataset dataset;

    private RDFStore() {
        init(DIR);
    }

    public static RDFStore getRDFStore() {
        return store;
    }

    private void init(String dir) {
        dataset = TDBFactory.createDataset(dir);
    }

    public Model getModel(String uri) {
        if (dataset.containsNamedModel(uri)) {
            return dataset.getNamedModel(uri);
        }
        Model model = ModelFactory.createDefaultModel();
        dataset.addNamedModel(uri, model);
        return model;
    }

    public void sync(Model model) {
        TDB.sync(model);
    }
}
