package org.zxczxc.app.jlonglat.jlatitude;

import java.awt.event.ActionEvent;

import javax.swing.JComponent;

import org.zxczxc.app.jlonglat.longlatformatlistener.LongLatFormatListener;

/**
 * @author flo
 *
 */
public class JLatitude extends JComponent implements LongLatFormatListener {
	private double degree;
	
	private int minute;
	private int second;
	private int centi;
	
	private LongLatFormat longLatFormat;
	
	public JLatitude(double degree) {
		this.degree = degree;
	}

	/**
	 * @return the degree
	 */
	public double getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(double degree) {
		this.degree = degree;
	}

	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * @return the centi
	 */
	public int getCenti() {
		return centi;
	}

	/**
	 * @param centi the centi to set
	 */
	public void setCenti(int centi) {
		this.centi = centi;
	}

	public void actionPerformed(ActionEvent e) {
		// Make the convertion
	}


	/**
	 * @return the longLatFormat
	 */
	public LongLatFormat getLongLatFormat() {
		return longLatFormat;
	}

	public void setNewLongLatFormat(LongLatFormat longLatFormat) {
		if (longLatFormat != this.longLatFormat) {
			System.out.println("Latitude - Update to " + longLatFormat);
			this.longLatFormat = longLatFormat;
		}			
	}
	
}
