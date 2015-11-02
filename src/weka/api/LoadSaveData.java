package weka.api;

import weka.core.Instances;
import weka.core.converters.ArffSaver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoadSaveData {
	public static void main(String args[]) throws Exception {
		Instances dataset = new Instances(new FileReader("/home/rasuishere/weka-3-6-12/data/iris.arff"));
		
		System.out.println(dataset.toString());
		
		ArffSaver saver = new ArffSaver();
		saver.setInstances(dataset);
		saver.setFile(new File("/home/rasuishere/weka-3-6-12/new.arff"));
		saver.writeBatch();
	}
}
