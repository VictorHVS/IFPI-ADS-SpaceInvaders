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
//Invader Herda de Sprite, ou seja, ele tem direito a todos os metodos e atributos publicos da classe Sprite
public class Invader extends Sprite {
	//Atributo usado para distinguir se o invasor vai para esquerda ou direita
	boolean moverX;
	// Construtor da classe invader, recebe o endereco da imagem
	public Invader(String filename) {
		// envio a string passada por parametro para o construtor da superclasse Sprite
		super(filename);
		this.moverX = true; //true = direita
	}
	//Metodo responsavel pela movimentacao do invasor, recebe  a velocidade.
	public void moverX(int velocidade) {
		//Se o invasor estiver antes do fim de tela e estiver andando pra direita
		if (this.x <= (800 - this.width) && moverX == true) {
			this.x += velocidade; //entao ele incrementa velocidade no X
		} else {
			moverX = false;
		}
		//Se o invasor estiver antes do fim de tela e estiver andando pra direita
		if (this.x >= 10 && moverX == false) {
			this.x -= velocidade; //entao ele decrementa velocidade no X
		} else {
			moverX = true;
		}
	}
}
