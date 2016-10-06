package org.zxczxc.app.jlonglat.longlatformatmodel;

import java.util.LinkedList;

import org.zxczxc.app.jlonglat.longlatformatlistener.LongLatFormatListener;

public class LongLatFormatModel {

	private LongLatFormatListener.LongLatFormat longLatFormat;

	private LinkedList<LongLatFormatListener> listListeners;

	/**
	 * @param longLatFormat
	 */
	public LongLatFormatModel(LongLatFormatListener.LongLatFormat longLatFormat) {
		this.longLatFormat = longLatFormat;
		this.listListeners = new LinkedList<LongLatFormatListener>();
	}

	public void addLongLatFormatListener(LongLatFormatListener longLatFormatListener) {
		longLatFormatListener.setNewLongLatFormat(this.longLatFormat);
		this.listListeners.add(longLatFormatListener);
	}
	
	/**
	 *
	 * @param longLatFormat
	 */
	public void fireLongLatFormat(LongLatFormatListener.LongLatFormat longLatFormat) {
		for (LongLatFormatListener longLatFormatListener : listListeners) {
			longLatFormatListener.setNewLongLatFormat(longLatFormat);
		}
	}

	
	/**
	 * @return the longLatFormat
	 */
	public LongLatFormatListener.LongLatFormat getLongLatFormat() {
		return longLatFormat;
	}

	/**
	 * @param longLatFormat
	 *            the longLatFormat to set
	 */
	public void setLongLatFormat(LongLatFormatListener.LongLatFormat longLatFormat) {
		this.longLatFormat = longLatFormat;
		fireLongLatFormat(longLatFormat);
	}
}
