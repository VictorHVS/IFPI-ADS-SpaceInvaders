/**
 * @author Victor Hugo V. Sousa
 * @mail vhv.sousa@gmail.com
 * @website bracode.net
 * @GitHub github.com/VictorHVS
 * @date 13/03/2014
 */
package net.bracode.jplay.spaceInvaders;

import jplay.Sprite;

public class Bullet extends Sprite {

	public Bullet(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public void moveToUp(double x, double y, double vel) {
		this.y -= vel;
	}

	public void setPosition(double x) {
		this.x = x;
	}

}
