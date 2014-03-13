/**
 * @author Victor Hugo V. Sousa
 * @mail vhv.sousa@gmail.com
 * @website bracode.net
 * @GitHub github.com/VictorHVS
 * @date 13/03/2014
 */
package net.bracode.jplay.spaceInvaders;

import jplay.GameImage;
import jplay.Sprite;
import jplay.Window;

public class Game {

	// Aqui declaramos os atributos da classe
	Window 		window;
	GameImage 	background;
	Nave		nave;

	public Game() { // Este eh o construtor da classe
		init();
		loop();
	}

	/*
	 * Este metodo eh responsavel por inicializar ou instanciar todos os nossos
	 * atributos
	 */
	public void init() {
		window 		= new Window(800, 600);
		background 	= new GameImage("resource/image/background.png");
		nave		= new Nave("resource/image/nave.png");
		nave.x		= background.width/2 - nave.x/2;
		nave.y		= background.height- nave.height;
	}

	// Metodo responsavel por desenhar em tela todos os elementos.
	public void draw() {
		background.draw();
		nave.draw();
	}

	/*
	 * O loop eh o coracao do jogo, eh nele que serao colocadas todas as
	 * condicoes de interacoes e as atualizacos das imagens na tela. Os
	 * comportamentos do jogo devem ficar aqui!
	 */
	public void loop() {
		while (true) {
			draw(); //Metodo encarregado de possuir todos os draws
			
			
			window.update(); //atualiza a janela
		}
	}
}
