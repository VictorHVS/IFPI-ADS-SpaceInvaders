/**
 * @author Victor Hugo V. Sousa
 * @mail vhv.sousa@gmail.com
 * @website bracode.net
 * @GitHub github.com/VictorHVS
 * @date 13/03/2014
 */
package net.bracode.jplay.spaceInvaders;

import java.awt.Color;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class Game {

	// Aqui declaramos os atributos da classe
	Window 		window;
	GameImage 	background;
	Nave		nave;
	Invader		invader;
	Keyboard	keyboard;
	GameImage[]	lifeNave;
	GameImage	close;
	
	int			score;
	int			life;
	public Game() {
		init(); //Uso para fazer o papel de construtor
		loop(); //Contem o loop do game
	}

	/*
	 * Este metodo eh responsavel por inicializar ou instanciar todos os nossos
	 * atributos
	 */
	public void init() {
		window 		= new Window(800, 600);
		background 	= new GameImage("resource/image/background.png");
		nave		= new Nave("resource/image/nave.png");
		nave.x		= background.width/2 - nave.width/2;
		nave.y		= background.height- nave.height;
		invader		= new Invader("resource/image/invader.png");
		invader.x	= background.width/2 - invader.width/2;
		invader.y	= 80;
		keyboard	= window.getKeyboard();
		life		= 3;
		score		= 0;
		lifeNave	= new GameImage[3];
		
		for(int i = 0; i < 3; i++){
			lifeNave[i]		= new GameImage("resource/image/life.png");
			lifeNave[i].x	= 507 + i * (lifeNave[i].width + 2);
			lifeNave[i].y	= 53;
		}
		
		close		= new GameImage("resource/image/close.png");
		close.x		= background.width - close.width;
		close.y		= 0;
	}

	// Metodo responsavel por desenhar em tela todos os elementos.
	public void draw() {
		background.draw();
		nave.draw();
		invader.draw();
		for(GameImage life : lifeNave){
			life.draw();
		}
		window.drawText(""+score, 300, 70, Color.WHITE);
		close.draw();
	}

	/*
	 * O loop eh o coracao do jogo, eh nele que serao colocadas todas as
	 * condicoes de interacoes e as atualizacos das imagens na tela. Os
	 * comportamentos do jogo devem ficar aqui!
	 */
	public void loop() {
		while (true) {
			draw(); //Metodo encarregado de possuir todos os draws
			
			//Move a nave no eixo X
			nave.moveX(1);
			
			//move o invasor
			invader.moverX(1);
			
			//ESC fecha a janela
			if(keyboard.keyDown(keyboard.ESCAPE_KEY)){
				window.exit();
			}
			
			//atualiza a janela
			window.update(); 
		}
	}
}
