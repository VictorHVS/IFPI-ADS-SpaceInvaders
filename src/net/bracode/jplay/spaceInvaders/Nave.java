/**
 * @author Victor Hugo V. Sousa
 * @mail vhv.sousa@gmail.com
 * @website bracode.net
 * @GitHub github.com/VictorHVS
 * @date 13/03/2014
 */
package net.bracode.jplay.spaceInvaders;

//Importacoes devem ser feitas após o nome do pacote e antes do nome da classe
import jplay.Sprite;

//Nave Herda de Sprite, ou seja, ele tem direito a todos os metodos e atributos publicos da classe Sprite
public class Nave extends Sprite {
	// Construtor da classe nave, recebe o endereco da imagem
	public Nave(String fileName) {
		// envio a string passada por parametro para o construtor da superclasse Sprite
		super(fileName);
	}

}
