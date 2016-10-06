package org.zxczxc.app;

import org.zxczxc.app.jlonglat.jlatitude.JLatitude;
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
        
        
        model.addLongLatFormatListener(latitude1);
        model.addLongLatFormatListener(latitude2);
        
        
        model.setLongLatFormat(LongLatFormat.DEG_MIN_CENTI);
    }
}
