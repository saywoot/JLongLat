package org.zxczxc.app;

import org.zxczxc.app.jlonglat.jlatitude.JLatitude;
import org.zxczxc.app.jlonglat.jlongitude.JLongitude;
import org.zxczxc.app.jlonglat.longlatformatlistener.LongLatFormatListener.LongLatFormat;
import org.zxczxc.app.jlonglat.longlatformatmodel.LongLatFormatModel;

/**
 * App
 *
 */
public class App {
    public static void main(String[] args) {
    	
        LongLatFormatModel model = new LongLatFormatModel(LongLatFormat.DEG_MIN_SEC);
        
        JLatitude latitude1 = new JLatitude(10);
        JLatitude latitude2 = new JLatitude(20);
        
        System.out.println("1 - ");
        model.setLongLatFormat(LongLatFormat.DEG_MIN_CENTI);
        System.out.println("---------\n");
        
        System.out.println("2 - ");
        model.addLongLatFormatListener(latitude1);
        model.addLongLatFormatListener(latitude2);
        System.out.println("---------\n");
        
        System.out.println("3 - ");
        model.setLongLatFormat(LongLatFormat.DEG_MIN_CENTI);
        System.out.println("---------\n");
        
        JLongitude longitude1 = new JLongitude(30);
        JLongitude longitude2 = new JLongitude(40);
        
        System.out.println("4 - ");
        model.addLongLatFormatListener(longitude1);
        model.addLongLatFormatListener(longitude2);
        System.out.println("---------\n");
        
        System.out.println("5 - ");
        model.setLongLatFormat(LongLatFormat.DEG_MIN_CENTI);
        System.out.println("---------\n");
        
        System.out.println("6 - ");
        model.setLongLatFormat(LongLatFormat.DEG_MIN_SEC);
        System.out.println("---------\n");
    }
}
