package loader;
import java.io.File;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import gstock.Application;
import gstock.GstockPackage;  // Importez votre package gstock

public class ModelLoader {
    public static Application loadModel(String filePath) {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        ResourceSetImpl resourceSet = new ResourceSetImpl();

        // Enregistrement explicite du package "http://gstock"
        EPackage.Registry.INSTANCE.put("http://gstock", GstockPackage.eINSTANCE);
        /*Lorsque on travaille  avec des fichiers 
        XMI ou d'autres fichiers de modèle, EMF utilise l'URI pour savoir quel métamodèle utiliser pour interpréter
         correctement les données. L'URI http://gstock permet à EMF de savoir que les objets dans ce fichier XMI 
         correspondent au métamodèle défini par GstockPackage */

        try {
            // Chargez le fichier XMI
            Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(new File(filePath).getAbsolutePath()), true);
            return (Application) resource.getContents().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}