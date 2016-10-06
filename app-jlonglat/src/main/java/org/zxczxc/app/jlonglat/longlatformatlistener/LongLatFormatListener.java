package org.zxczxc.app.jlonglat.longlatformatlistener;

import java.awt.event.ActionListener;

public interface LongLatFormatListener extends ActionListener {
	public enum LongLatFormat {DEG_MIN_SEC, DEG_MIN_CENTI};
	
	public void setNewLongLatFormat(LongLatFormat longLatFormat);
}
