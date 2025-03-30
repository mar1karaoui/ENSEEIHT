package gstock.validation;

import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import gstock.GstockPackage;

public class ValidateGStock {
    public static void main(String... args) {
        GstockPackage packageInstance = GstockPackage.eINSTANCE;

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        GStockValidator validator = new GStockValidator();

        for (String model : args) {
            URI modelURI = URI.createURI(model);
            Resource resource = resSet.getResource(modelURI, true);
            ValidationResult result = validator.validate(resource);

            System.out.println("Résultat de validation pour " + model + ":");
            result.getRecordedErrors().forEach(System.out::println);
        }

        System.out.println("Validation terminée.");
    }
}
