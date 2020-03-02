package in.nit.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ShipmentTypeUtil {
	public void generatePie(String path,List<Object[]> data)  {
		//create DataSet
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] arr:data) {
			//key-shipMode,value=count
			dataset.setValue(arr[0].toString(), Double.valueOf(arr[1].toString()));
		}
		//jfreechartusing chartfactory
		JFreeChart chart=ChartFactory.createPieChart3D("ShipmentTypeModes", dataset, true, true,false);
		//save as img using charutils
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/shipmentA.jpg"),  chart, 400, 400);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
