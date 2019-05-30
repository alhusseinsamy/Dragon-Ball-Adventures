package dragonball.controller;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import dragonball.model.attack.PhysicalAttack;
import dragonball.model.attack.SuperAttack;
import dragonball.model.attack.UltimateAttack;
import dragonball.model.battle.Battle;
import dragonball.model.battle.BattleEvent;
import dragonball.model.battle.BattleEventType;
import dragonball.model.cell.Collectible;
import dragonball.model.character.fighter.Earthling;
import dragonball.model.character.fighter.Fighter;
import dragonball.model.character.fighter.Frieza;
import dragonball.model.character.fighter.Majin;
import dragonball.model.character.fighter.Namekian;
import dragonball.model.character.fighter.NonPlayableFighter;
import dragonball.model.character.fighter.PlayableFighter;
import dragonball.model.character.fighter.Saiyan;
import dragonball.model.dragon.Dragon;
import dragonball.model.dragon.DragonWish;
import dragonball.model.exceptions.DuplicateAttackException;
import dragonball.model.exceptions.MapIndexOutOfBoundsException;
import dragonball.model.exceptions.MaximumAttacksLearnedException;
import dragonball.model.exceptions.MissingFieldException;
import dragonball.model.exceptions.NotASaiyanException;
import dragonball.model.exceptions.NotEnoughAbilityPointsException;
import dragonball.model.exceptions.NotEnoughKiException;
import dragonball.model.exceptions.NotEnoughSenzuBeansException;
import dragonball.model.exceptions.UnknownAttackTypeException;
import dragonball.model.game.Game;
import dragonball.model.game.GameListener;
import dragonball.view.DragonBallView;


@SuppressWarnings("serial")
public class DragonBallGUI implements GameListener, ActionListener, MouseListener , KeyListener {



		Font font1 = new Font("SansSerif", Font.BOLD, 15);
		private JButton plusButton;
		private Fighter fighterChoosed;
		private JLabel background;
		private Battle currentBattle;
		private DragonWish selectedWish;
		private DragonWish selectedWish1;
		private DragonWish selectedWish2;
		private DragonWish selectedWish3;
		private NonPlayableFighter foe;
		private Game game;
		private DragonBallView dragonballview;
		private JFileChooser fileChooser = new JFileChooser();
		private String path = "";

		public DragonBallGUI() throws MissingFieldException, UnknownAttackTypeException {

			game = new Game();
			game.setListener(this);
			setDragonballview(new DragonBallView());
			getDragonballview().getB1().addMouseListener(this);
			getDragonballview().getB1().addActionListener(this);
			getDragonballview().getB2().addMouseListener(this);
			getDragonballview().getB2().addActionListener(this);
			getDragonballview().getB3().addMouseListener(this);
			getDragonballview().getB3().addActionListener(this);
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

		}

		public DragonBallView getDragonballview() {
			return dragonballview;
		}
		public void setDragonballview(DragonBallView dragonballview) {
			this.dragonballview = dragonballview;
		}
		public NonPlayableFighter getFoe() {
			return foe;
		}

		public void setFoe(NonPlayableFighter foe) {
			this.foe = foe;
		}


		@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton) e.getSource()).equals(this.getDragonballview().getB1())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().switchPanelsToIntro();
			getDragonballview().getB4().addMouseListener(this);
			getDragonballview().getB4().addActionListener(this);

			getDragonballview().getB5().addMouseListener(this);
			getDragonballview().getB5().addActionListener(this);

			getDragonballview().getB6().addMouseListener(this);
			getDragonballview().getB6().addActionListener(this);

			getDragonballview().getTextField().addMouseListener(this);
			getDragonballview().getTextField2().addMouseListener(this);
			showStats('S');

			// Player x = new Player(name);
		} else if ((JButton) e.getSource() == this.getDragonballview().getB2()) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
			UIManager.put("OptionPane.messageFont", font);
			UIManager.put("OptionPane.buttonFont", font);
			UIManager.put("OptionPane.minimumSize", new Dimension(200, 100));
			JOptionPane.showMessageDialog(null,
					"     " + "Tarek Morsi " + "\n" + "   " + "Omar El-Etreby " + "\n" + "    " + "Hussein Samy",
					"Credits", JOptionPane.PLAIN_MESSAGE);

		}else if ((JButton) e.getSource() == this.getDragonballview().getB7()) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.save(path);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Error while saving the game.",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}

		}else if ((JButton) e.getSource() == this.getDragonballview().getB3()) {
		/*	int ret = fileChooser.showOpenDialog(this.getDragonballview());
			 if (ret == JFileChooser.APPROVE_OPTION) {
		            File file = fileChooser.getSelectedFile();
		            String filename = file.getName();
		            try {
						game.load(filename);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			 }
			*/
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.load(path);
			} catch (ClassNotFoundException | IOException e1) {

				JOptionPane.showMessageDialog(new JFrame(), "No saved game found.",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
				}

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getB4())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if (this.getDragonballview().getI() == 5) {
				this.getDragonballview().getE().setVisible(false);
				this.getDragonballview().getA().setVisible(true);
				this.getDragonballview().setI(1);
				this.getDragonballview().setCharacterName('S');
			} else if (this.getDragonballview().getI() == 1) {
				this.getDragonballview().getA().setVisible(false);
				this.getDragonballview().getB().setVisible(true);
				this.getDragonballview().setI(2);
				this.getDragonballview().setCharacterName('F');
			} else if (this.getDragonballview().getI() == 2) {
				this.getDragonballview().getB().setVisible(false);
				this.getDragonballview().getC().setVisible(true);
				this.getDragonballview().setI(3);
				this.getDragonballview().setCharacterName('N');
			} else if (this.getDragonballview().getI() == 3) {
				this.getDragonballview().getC().setVisible(false);
				this.getDragonballview().getD().setVisible(true);
				this.getDragonballview().setI(4);
				this.getDragonballview().setCharacterName('E');
			} else if (this.getDragonballview().getI() == 4) {
				this.getDragonballview().getD().setVisible(false);
				this.getDragonballview().getE().setVisible(true);
				this.getDragonballview().setI(5);
				this.getDragonballview().setCharacterName('M');
			}
			showStats(this.getDragonballview().getCharacterName());
			this.getDragonballview().getNextpanel().revalidate();
			this.getDragonballview().getNextpanel().repaint();

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getB5())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if (this.getDragonballview().getI() == 1) {
				this.getDragonballview().getA().setVisible(false);
				this.getDragonballview().getE().setVisible(true);
				this.getDragonballview().setI(5);
				this.getDragonballview().setCharacterName('M');
			} else if (this.getDragonballview().getI() == 5) {
				this.getDragonballview().getE().setVisible(false);
				this.getDragonballview().getD().setVisible(true);
				this.getDragonballview().setI(4);
				this.getDragonballview().setCharacterName('E');
			} else if (this.getDragonballview().getI() == 4) {
				this.getDragonballview().getD().setVisible(false);
				this.getDragonballview().getC().setVisible(true);
				this.getDragonballview().setI(3);
				this.getDragonballview().setCharacterName('N');
			} else if (this.getDragonballview().getI() == 3) {
				this.getDragonballview().getC().setVisible(false);
				this.getDragonballview().getB().setVisible(true);
				this.getDragonballview().setI(2);
				this.getDragonballview().setCharacterName('F');

			} else if (this.getDragonballview().getI() == 2) {
				this.getDragonballview().getB().setVisible(false);
				this.getDragonballview().getA().setVisible(true);
				this.getDragonballview().setI(1);
				this.getDragonballview().setCharacterName('S');

			}

			showStats(this.getDragonballview().getCharacterName());
			this.getDragonballview().getNextpanel().revalidate();
			this.getDragonballview().getNextpanel().repaint();

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getB6())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().setNextpanel(new JPanel());
			this.getDragonballview().addKeyListener(this);

			String y = (this.getDragonballview().getTextField2().getText());
			String x = (this.getDragonballview().getTextField()).getText();
			game.getPlayer().setName(x);

			game.getPlayer().createFighter(this.getDragonballview().getCharacterName(), y);
			this.getDragonballview().switchPanelsToWorld();

			this.getDragonballview().getPlayername().setText("<html><font color=black>Name: </font> <font color=yellow>"+x+"</font></html>");
			this.getDragonballview().getPlayername().setFont(font1);
			this.getDragonballview().getPlayername().setHorizontalAlignment(JLabel.CENTER);

			this.getDragonballview().getActivefightername().setText("<html><font color=black>Active Fighter: </font> <font color=yellow>"+y+"</font></html>");
			this.getDragonballview().getActivefightername().setFont(font1);
			this.getDragonballview().getActivefightername().setHorizontalAlignment(JLabel.CENTER);

			updateStats();

			int j = 0;

			this.getDragonballview().getNextpanel().add(this.getDragonballview().getBoss());
		//	this.getDragonballview().addKeyListener(this);
			this.getDragonballview().getBoss().setOpaque(false);
			this.getDragonballview().getBoss().setBorderPainted(false);
			this.getDragonballview().getBoss().setBorder(BorderFactory.createEmptyBorder());
			this.getDragonballview().getBoss().setContentAreaFilled(false);


			while (j < 98) {

				JButton but = new JButton();
				but.setOpaque(false);
				but.setBorderPainted(false);
				but.setBorder(BorderFactory.createEmptyBorder());
				but.setContentAreaFilled(false);
				this.getDragonballview().getNextpanel().add(but);
		//		but.addKeyListener(this);
		//		but.addActionListener(this); // mouse controller
		//		but.addKeyListener(this);
				j++;

			}

			this.getDragonballview().getBut1().setOpaque(false);
			this.getDragonballview().getBut1().setBorderPainted(false);
			this.getDragonballview().getBut1().setBorder(BorderFactory.createEmptyBorder());
			this.getDragonballview().getBut1().setContentAreaFilled(false);
		//	this.getDragonballview().getBut1().addKeyListener(this);
			this.getDragonballview().getNextpanel().add(this.getDragonballview().getBut1());

			// this.getDragonballview().getBut1().addActionListener(this);

			dragonballview.getB7().addActionListener(this);
			dragonballview.getB7().addMouseListener(this);
			dragonballview.getB8().addMouseListener(this);
			dragonballview.getB8().addActionListener(this);
			dragonballview.getB9().addMouseListener(this);
			dragonballview.getB9().addActionListener(this);
			dragonballview.getB10().addMouseListener(this);
			dragonballview.getB10().addActionListener(this);
			dragonballview.setA(new JLabel());
			dragonballview.setB(new JLabel());
			dragonballview.setC(new JLabel());
			dragonballview.setD(new JLabel());
			dragonballview.setE(new JLabel());
			dragonballview.setI(1);
			dragonballview.setCharacterName('S');


		} else if (((JButton) e.getSource()).getParent() == this.getDragonballview().getNextpanel()) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().getSelectedButton().setIcon(null);
			(((JButton) e.getSource())).setIcon(this.getDragonballview().getSmallIcon());
			this.getDragonballview().setSelectedButton(((JButton) e.getSource()));

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getB12())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().getDragonPanel().setVisible(false);
			this.getDragonballview().getNextpanel().setVisible(true);
			this.getDragonballview().getImagespanel().setVisible(true);
			this.getDragonballview().getStatspanel().setVisible(true);
			this.getDragonballview().getNextpanel().setFocusable(true);

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getSen())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			game.getPlayer().chooseWish(getSelectedWish());
			this.getDragonballview().getDragonPanel().setVisible(false);
			this.getDragonballview().switchPanelsBackToWorld();
			updateStats();
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getAbi())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			game.getPlayer().chooseWish(getSelectedWish1());
			this.getDragonballview().switchPanelsBackToWorld();
			updateStats();
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getSup())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			game.getPlayer().chooseWish(getSelectedWish2());
			this.getDragonballview().switchPanelsBackToWorld();
			updateStats();
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getUlt())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			game.getPlayer().chooseWish(getSelectedWish3());
			this.getDragonballview().switchPanelsBackToWorld();
			updateStats();
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getAttack())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
				try {
				getCurrentBattle().attack(new PhysicalAttack());
				} catch (NotEnoughKiException e1) {
				e1.printStackTrace();
				}
				this.getDragonballview().getPlayerbuttons().setVisible(false);
				this.getDragonballview().getNextKey().setVisible(true);
			}

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getBlockBut())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if (getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())) {
				getCurrentBattle().block();
				this.getDragonballview().getPlayerbuttons().setVisible(false);
				this.getDragonballview().getNextKey().setVisible(true);
			}

		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getUseBut())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
				if(game.getPlayer().getSenzuBeans() == 0){
					try {
						getCurrentBattle().use(game.getPlayer(), Collectible.SENZU_BEAN);
					} catch (NotEnoughSenzuBeansException e1) {
						JOptionPane.showMessageDialog(this.getDragonballview(), "Not Enough Senzu Beans.");
					}
					this.getDragonballview().getPlayerbuttons().setVisible(true);
					this.getDragonballview().getNextKey().setVisible(false);
				}else{
					try {
						getCurrentBattle().use(game.getPlayer(), Collectible.SENZU_BEAN);
					} catch (NotEnoughSenzuBeansException e1) {
						JOptionPane.showMessageDialog(this.getDragonballview(), "Not Enough Senzu Beans.");
					}
					this.getDragonballview().getPlayerbuttons().setVisible(false);
					this.getDragonballview().getNextKey().setVisible(true);

				}

			}
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getNextKey())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if(((Fighter)this.getCurrentBattle().getAttacker()).getHealthPoints() == 0 	|| ((Fighter)this.getCurrentBattle().getDefender()).getHealthPoints() == 0){
				updateStats();
				this.getDragonballview().switchPanelsBackToWorld();

			}else	if(getCurrentBattle().getAttacker().equals(getFoe())){
					try {
						getCurrentBattle().play();
					} catch (NotEnoughKiException e1) {
						e1.printStackTrace();
					}
					this.getDragonballview().getPlayerbuttons().setVisible(true);
					if(this.game.getPlayer().getActiveFighter().getHealthPoints() != 0){
						this.getDragonballview().getNextKey().setVisible(false);
						this.getDragonballview().getPlayerbuttons().setVisible(true);
					}else{
						this.getDragonballview().getNextKey().setVisible(true);
						this.getDragonballview().getPlayerbuttons().setVisible(false);
					}
				}
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getSpecial())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
					this.getDragonballview().getPlayerbuttons().setVisible(false);
					//this.getDragonballview().getPlayerbuttons().setOpaque(false);
					this.getDragonballview().getSpecialbuttons().setVisible(true);
			}
		} else if (((JButton) e.getSource()).equals(this.getDragonballview().getBackBut())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().getPlayerbuttons().setVisible(true);
			this.getDragonballview().getSpecialbuttons().setVisible(false);
		}


		else if (((JButton) e.getSource()).getParent() == this.getDragonballview().getImagespanel()) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().getNextpanel().setFocusable(true);

		} else if (((JButton) e.getSource()).getParent() == this.getDragonballview().getNextpanel()) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			this.getDragonballview().getNextpanel().setFocusable(true);

		}else if (((JButton) e.getSource()).equals(dragonballview.getB8())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getNextpanel().setVisible(false);
			dragonballview.getStatspanel().setVisible(false);
			dragonballview.getImagespanel().setVisible(false);
			dragonballview.getNextpanel().setEnabled(false);
			dragonballview.getStatspanel().setEnabled(false);
			dragonballview.getImagespanel().setEnabled(false);
			dragonballview.getDragonPanel().setVisible(false);
			dragonballview.getDragonPanel().setEnabled(false);
			dragonballview.getBattlePanel().setVisible(false);
			dragonballview.getBattlePanel().setEnabled(false);
			dragonballview.getMappanel().setVisible(false);
			dragonballview.getMappanel().setEnabled(false);
			dragonballview.getBackstats().setVisible(false);
			dragonballview.getBackstats().setEnabled(false);
			dragonballview.switchFighterButton();
			dragonballview.getB666().addActionListener(this);
			dragonballview.getB666().addMouseListener(this);
			ArrayList<PlayableFighter> a = game.getPlayer().getFighters();
			int numberOfButtons = 0;
			if (!a.isEmpty()) {
				for (int i = 0; i < a.size(); i++) {
					final Fighter f = a.get(i);
					JButton b = new JButton();
					int horiz = (numberOfButtons * 100) + 60;
					if (a.get(i) instanceof Saiyan) {
						b.setBounds(horiz, 160, dragonballview.getSaiyanIcon().getIconWidth(),
								dragonballview.getSaiyanIcon().getIconHeight());
						b.setIcon(dragonballview.getSaiyanIcon());
						b.setBorderPainted(false);
						b.setContentAreaFilled(false);
						dragonballview.getSwitchFighterPanel().add(b);
						numberOfButtons++;
					} else if (a.get(i) instanceof Namekian) {
						b.setBounds(horiz, 160, dragonballview.getNamekianIcon().getIconWidth(),
								dragonballview.getNamekianIcon().getIconHeight());
						b.setIcon(dragonballview.getNamekianIcon());
						b.setBorderPainted(false);
						b.setBorder(BorderFactory.createEmptyBorder());
						b.setContentAreaFilled(false);
						dragonballview.getSwitchFighterPanel().add(b);
						numberOfButtons++;
					} else if (a.get(i) instanceof Frieza) {
						b.setBounds(horiz, 160, dragonballview.getFriezaIcon().getIconWidth(),
								dragonballview.getFriezaIcon().getIconHeight());
						b.setIcon(dragonballview.getFriezaIcon());
						b.setBorderPainted(false);
						b.setBorder(BorderFactory.createEmptyBorder());
						b.setContentAreaFilled(false);
						dragonballview.getSwitchFighterPanel().add(b);
						numberOfButtons++;
					} else if (a.get(i) instanceof Majin) {
						b.setBounds(horiz, 160, dragonballview.getMajinIcon().getIconWidth(),
								dragonballview.getMajinIcon().getIconHeight());
						b.setIcon(dragonballview.getMajinIcon());
						b.setBorderPainted(false);
						b.setBorder(BorderFactory.createEmptyBorder());
						b.setContentAreaFilled(false);
						dragonballview.getSwitchFighterPanel().add(b);
						numberOfButtons++;
					} else if (a.get(i) instanceof Earthling) {
						b.setBounds(horiz, 160, dragonballview.getEarthlingIcon().getIconWidth(),
								dragonballview.getEarthlingIcon().getIconHeight());
						b.setIcon(dragonballview.getEarthlingIcon());
						b.setBorderPainted(false);
						b.setBorder(BorderFactory.createEmptyBorder());
						b.setContentAreaFilled(false);
						dragonballview.getSwitchFighterPanel().add(b);
						numberOfButtons++;
					}
					b.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							fighterChoosed = f;
							game.getPlayer().setActiveFighter((PlayableFighter) f);
							dragonballview.getSwitchFighterPanel().remove(background);
							if (f instanceof Frieza) {
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
								dragonballview.getSwitchFighterPanel().add(dragonballview.getBb());
							} else if (f instanceof Saiyan) {
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
								dragonballview.getSwitchFighterPanel().add(dragonballview.getAa());
							} else if (f instanceof Namekian) {
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
								dragonballview.getSwitchFighterPanel().add(dragonballview.getCc());
							} else if (f instanceof Earthling) {
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
								dragonballview.getSwitchFighterPanel().add(dragonballview.getDd());
							} else if (f instanceof Majin) {
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
								dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
								dragonballview.getSwitchFighterPanel().add(dragonballview.getEe());
							}
							organizeProgressBars(f);
							dragonballview.getSwitchFighterPanel().add(dragonballview.getIntrostats());
							dragonballview.getSwitchFighterPanel().add(background);
							dragonballview.getSwitchFighterPanel().revalidate();
							dragonballview.getSwitchFighterPanel().repaint();
						}
					});
				}
			}

			plusButton = new JButton();
			int horiz = (numberOfButtons * 100) + 60;
			plusButton.setBounds(horiz, 180, dragonballview.getPlusIcon().getIconWidth(),
					dragonballview.getPlusIcon().getIconHeight());
			plusButton.setIcon(dragonballview.getPlusIcon());
			plusButton.setBorderPainted(false);
			plusButton.setBorder(BorderFactory.createEmptyBorder());
			plusButton.setContentAreaFilled(false);
			plusButton.addActionListener(this);
			background = new JLabel(dragonballview.getImageIcon());
			background.setBounds(0, 0, 1080, 720);
			dragonballview.getSwitchFighterPanel().add(plusButton);
			// JPanel statsPanel2 = new JPanel();
			// statsPanel2.setSize(320, 160);
			// statsPanel2.setLayout(new GridLayout(5, 1));
			// statsPanel2.setBounds(695, 430, statsPanel2.getWidth(),
			// statsPanel2.getHeight());
			//
			// dragonballview.setFighterKiBar(new JProgressBar());
			// dragonballview.setFighterStaminaBar(new JProgressBar());
			// dragonballview.setFighterStats(new JProgressBar());
			// dragonballview.setFighterStats2(new JProgressBar());
			// dragonballview.setFighterStats3(new JProgressBar());
			// dragonballview.setActiveFighterXpBar(new JProgressBar());
			// this.organizeProgressBars(game.getPlayer().getActiveFighter());
			// statsPanel2.add(dragonballview.getFighterStats());
			// statsPanel2.add(dragonballview.getFighterStats2());
			// statsPanel2.add(dragonballview.getFighterStats3());
			// statsPanel2.add(dragonballview.getFighterKiBar());
			// statsPanel2.add(dragonballview.getFighterStaminaBar());
			// dragonballview.getSwitchFighterPanel().add(statsPanel2);
			dragonballview.getSwitchFighterPanel().add(background);
			dragonballview.getSwitchFighterPanel().revalidate();
			dragonballview.getSwitchFighterPanel().repaint();

		} else if (((JButton) e.getSource()).equals(plusButton)) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getSwitchFighterPanel().setVisible(false);
			dragonballview.getSwitchFighterPanel().setEnabled(false);
			dragonballview.createFighterButton();
			dragonballview.getTextField3().addMouseListener(this);
			dragonballview.getB44().addActionListener(this);
			dragonballview.getB55().addActionListener(this);
			dragonballview.getB66().addActionListener(this);
			dragonballview.getB66().addMouseListener(this);
			dragonballview.getCreateFighterPanel().revalidate();
			dragonballview.getCreateFighterPanel().repaint();
		} else if (((JButton) e.getSource()).equals(dragonballview.getB66())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getContentPane().remove(dragonballview.getCreateFighterPanel());
			dragonballview.getSwitchFighterPanel().setVisible(true);
			dragonballview.getSwitchFighterPanel().setEnabled(true);
			String name = dragonballview.getTextField3().getText();
			game.getPlayer().createFighter(dragonballview.getCharacterName(), name);
			dragonballview.getSwitchFighterPanel()
					.remove(dragonballview.getSwitchFighterPanel().getComponentCount() - 2);
			dragonballview.getSwitchFighterPanel().remove(plusButton);

			int horiz = ((dragonballview.getSwitchFighterPanel().getComponentCount() - 2) * 100) + 60;
			final Fighter f = game.getPlayer().getFighters().get(game.getPlayer().getFighters().size() - 1);
			JButton b = new JButton();
			if (f instanceof Saiyan) {
				b = new JButton();
				b.setBounds(horiz, 160, dragonballview.getSaiyanIcon().getIconWidth(),
						dragonballview.getSaiyanIcon().getIconHeight());
				b.setIcon(dragonballview.getSaiyanIcon());
				b.setBorderPainted(false);
				b.setBorder(BorderFactory.createEmptyBorder());
				b.setContentAreaFilled(false);
				dragonballview.getSwitchFighterPanel().add(b);
			} else if (f instanceof Namekian) {
				b = new JButton();
				b.setBounds(horiz, 160, dragonballview.getNamekianIcon().getIconWidth(),
						dragonballview.getNamekianIcon().getIconHeight());
				b.setIcon(dragonballview.getNamekianIcon());
				b.setBorderPainted(false);
				b.setBorder(BorderFactory.createEmptyBorder());
				b.setContentAreaFilled(false);
				dragonballview.getSwitchFighterPanel().add(b);
			} else if (f instanceof Frieza) {
				b = new JButton();
				b.setBounds(horiz, 160, dragonballview.getFriezaIcon().getIconWidth(),
						dragonballview.getFriezaIcon().getIconHeight());
				b.setIcon(dragonballview.getFriezaIcon());
				b.setBorderPainted(false);
				b.setBorder(BorderFactory.createEmptyBorder());
				b.setContentAreaFilled(false);
				dragonballview.getSwitchFighterPanel().add(b);
			} else if (f instanceof Majin) {
				b = new JButton();
				b.setBounds(horiz, 160, dragonballview.getMajinIcon().getIconWidth(),
						dragonballview.getMajinIcon().getIconHeight());
				b.setIcon(dragonballview.getMajinIcon());
				b.setBorderPainted(false);
				b.setBorder(BorderFactory.createEmptyBorder());
				b.setContentAreaFilled(false);
				dragonballview.getSwitchFighterPanel().add(b);
			} else if (f instanceof Earthling) {
				b = new JButton();
				b.setBounds(horiz, 160, dragonballview.getEarthlingIcon().getIconWidth(),
						dragonballview.getEarthlingIcon().getIconHeight());
				b.setIcon(dragonballview.getEarthlingIcon());
				b.setBorderPainted(false);
				b.setBorder(BorderFactory.createEmptyBorder());
				b.setContentAreaFilled(false);
				dragonballview.getSwitchFighterPanel().add(b);
			}
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					fighterChoosed = f;
					game.getPlayer().setActiveFighter((PlayableFighter) f);
					dragonballview.getSwitchFighterPanel().remove(background);
					if (f instanceof Frieza) {
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
						dragonballview.getSwitchFighterPanel().add(dragonballview.getBb());
					} else if (f instanceof Saiyan) {
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
						dragonballview.getSwitchFighterPanel().add(dragonballview.getAa());
					} else if (f instanceof Namekian) {
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
						dragonballview.getSwitchFighterPanel().add(dragonballview.getCc());
					} else if (f instanceof Earthling) {
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getEe());
						dragonballview.getSwitchFighterPanel().add(dragonballview.getDd());
					} else if (f instanceof Majin) {
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getAa());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getCc());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getDd());
						dragonballview.getSwitchFighterPanel().remove(dragonballview.getBb());
						dragonballview.getSwitchFighterPanel().add(dragonballview.getEe());
					}
					organizeProgressBars(f);
					dragonballview.getSwitchFighterPanel().add(dragonballview.getIntrostats());
					dragonballview.getSwitchFighterPanel().add(background);
					dragonballview.getSwitchFighterPanel().revalidate();
					dragonballview.getSwitchFighterPanel().repaint();
				}
			});
			plusButton = new JButton();
			horiz = ((dragonballview.getSwitchFighterPanel().getComponentCount() - 2) * 100) + 60;
			plusButton.setBounds(horiz, 180, dragonballview.getPlusIcon().getIconWidth(),
					dragonballview.getPlusIcon().getIconHeight());
			plusButton.setIcon(dragonballview.getPlusIcon());
			plusButton.setBorderPainted(false);
			plusButton.setBorder(BorderFactory.createEmptyBorder());
			plusButton.setContentAreaFilled(false);
			plusButton.addActionListener(this);
			dragonballview.getSwitchFighterPanel().add(plusButton);
			// JLabel background = new JLabel(dragonballview.getImageIcon());
			// background.setBounds(0, 0, 1080, 720);
			dragonballview.getSwitchFighterPanel().add(background);
			dragonballview.setCreateFighterPanel(new JPanel());
			dragonballview.setI(1);
			dragonballview.setA(new JLabel());
			dragonballview.setC(new JLabel());
			dragonballview.setD(new JLabel());
			dragonballview.setE(new JLabel());
			dragonballview.setB(new JLabel());
			dragonballview.setTextField3(new JTextField("Enter the fighter's name", 20));
			dragonballview.setCharacterName('S');
			dragonballview.getSwitchFighterPanel().revalidate();
			dragonballview.getSwitchFighterPanel().repaint();
		} else if (((JButton) e.getSource()).equals(dragonballview.getB666())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getContentPane().remove(dragonballview.getSwitchFighterPanel());
			dragonballview.setSwitchFighterPanel(new JPanel());
			dragonballview.getNextpanel().setVisible(true);
			dragonballview.getNextpanel().setEnabled(true);
			dragonballview.getStatspanel().setVisible(true);
			dragonballview.getStatspanel().setEnabled(true);
			dragonballview.getImagespanel().setVisible(true);
			dragonballview.getImagespanel().setEnabled(true);
			dragonballview.getMappanel().setVisible(true);
			dragonballview.getMappanel().setEnabled(true);
			dragonballview.getBackstats().setVisible(true);
			dragonballview.getBackstats().setEnabled(true);

			if (fighterChoosed instanceof Frieza) {
				Image small = dragonballview.getCharacterIcon2().getImage();
				Image smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
				ImageIcon smallIcon = new ImageIcon(smallImage);
				dragonballview.setSmallIcon(smallIcon);
				dragonballview.getSelectedButton().setIcon(smallIcon);
			} else if (fighterChoosed instanceof Saiyan) {
				Image small = dragonballview.getCharacterIcon().getImage();
				Image smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
				ImageIcon smallIcon = new ImageIcon(smallImage);
				dragonballview.setSmallIcon(smallIcon);
				dragonballview.getSelectedButton().setIcon(smallIcon);
			} else if (fighterChoosed instanceof Namekian) {
				Image small = dragonballview.getCharacterIcon3().getImage();
				Image smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
				ImageIcon smallIcon = new ImageIcon(smallImage);
				dragonballview.setSmallIcon(smallIcon);
				dragonballview.getSelectedButton().setIcon(smallIcon);
			} else if (fighterChoosed instanceof Earthling) {
				Image small = dragonballview.getCharacterIcon4().getImage();
				Image smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
				ImageIcon smallIcon = new ImageIcon(smallImage);
				dragonballview.setSmallIcon(smallIcon);
				dragonballview.getSelectedButton().setIcon(smallIcon);
			} else if (fighterChoosed instanceof Majin) {
				Image small = dragonballview.getCharacterIcon5().getImage();
				Image smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
				ImageIcon smallIcon = new ImageIcon(smallImage);
				dragonballview.setSmallIcon(smallIcon);
				dragonballview.getSelectedButton().setIcon(smallIcon);
			}
			game.getPlayer().setActiveFighter((PlayableFighter) fighterChoosed);
			this.updateStats();
			dragonballview.getContentPane().setBackground(Color.BLACK);
			dragonballview.getNextpanel().revalidate();
			dragonballview.getNextpanel().repaint();
			dragonballview.getStatspanel().revalidate();
			dragonballview.getStatspanel().repaint();
			dragonballview.revalidate();
			dragonballview.repaint();

		} else if (((JButton) e.getSource()).equals(dragonballview.getB55())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if (this.getDragonballview().getI() == 1) {
				this.getDragonballview().getA().setVisible(false);
				this.getDragonballview().getE().setVisible(true);
				this.getDragonballview().setI(5);
				this.getDragonballview().setCharacterName('M');
			} else if (this.getDragonballview().getI() == 5) {
				this.getDragonballview().getE().setVisible(false);
				this.getDragonballview().getD().setVisible(true);
				this.getDragonballview().setI(4);
				this.getDragonballview().setCharacterName('E');
			} else if (this.getDragonballview().getI() == 4) {
				this.getDragonballview().getD().setVisible(false);
				this.getDragonballview().getC().setVisible(true);
				this.getDragonballview().setI(3);
				this.getDragonballview().setCharacterName('N');
			} else if (this.getDragonballview().getI() == 3) {
				this.getDragonballview().getC().setVisible(false);
				this.getDragonballview().getB().setVisible(true);
				this.getDragonballview().setI(2);
				this.getDragonballview().setCharacterName('F');

			} else if (this.getDragonballview().getI() == 2) {
				this.getDragonballview().getB().setVisible(false);
				this.getDragonballview().getA().setVisible(true);
				this.getDragonballview().setI(1);
				this.getDragonballview().setCharacterName('S');

			}
			this.showStats(dragonballview.getCharacterName());
			this.getDragonballview().getCreateFighterPanel().revalidate();
			this.getDragonballview().getCreateFighterPanel().repaint();

		} else if (((JButton) e.getSource()).equals(dragonballview.getB44())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if (this.getDragonballview().getI() == 5) {
				this.getDragonballview().getE().setVisible(false);
				this.getDragonballview().getA().setVisible(true);
				this.getDragonballview().setI(1);
				this.getDragonballview().setCharacterName('S');
			} else if (this.getDragonballview().getI() == 1) {
				this.getDragonballview().getA().setVisible(false);
				this.getDragonballview().getB().setVisible(true);
				this.getDragonballview().setI(2);
				this.getDragonballview().setCharacterName('F');
			} else if (this.getDragonballview().getI() == 2) {
				this.getDragonballview().getB().setVisible(false);
				this.getDragonballview().getC().setVisible(true);
				this.getDragonballview().setI(3);
				this.getDragonballview().setCharacterName('N');
			} else if (this.getDragonballview().getI() == 3) {
				this.getDragonballview().getC().setVisible(false);
				this.getDragonballview().getD().setVisible(true);
				this.getDragonballview().setI(4);
				this.getDragonballview().setCharacterName('E');
			} else if (this.getDragonballview().getI() == 4) {
				this.getDragonballview().getD().setVisible(false);
				this.getDragonballview().getE().setVisible(true);
				this.getDragonballview().setI(5);
				this.getDragonballview().setCharacterName('M');
			}
			this.showStats(dragonballview.getCharacterName());
			this.getDragonballview().getCreateFighterPanel().revalidate();
			this.getDragonballview().getCreateFighterPanel().repaint();
		} else if (((JButton) e.getSource()).equals(dragonballview.getB9())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getNextpanel().setVisible(false);
			dragonballview.getStatspanel().setVisible(false);
			dragonballview.getNextpanel().setEnabled(false);
			dragonballview.getStatspanel().setEnabled(false);
			dragonballview.getImagespanel().setVisible(false);
			dragonballview.getImagespanel().setEnabled(false);
			dragonballview.getDragonPanel().setVisible(false);
			dragonballview.getDragonPanel().setEnabled(false);
			dragonballview.getBattlePanel().setVisible(false);
			dragonballview.getBattlePanel().setEnabled(false);
			dragonballview.getMappanel().setVisible(false);
			dragonballview.getMappanel().setEnabled(false);
			dragonballview.getBackstats().setVisible(false);
			dragonballview.getBackstats().setEnabled(false);

			dragonballview.upgradeFighterButton();
			dragonballview.getAbilityPointsCounter()
					.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
			dragonballview.getUpgradeFighterButton1().addActionListener(this);
			dragonballview.getUpgradeFighterButton2().addActionListener(this);
			dragonballview.getUpgradeFighterButton3().addActionListener(this);
			dragonballview.getUpgradeFighterButton4().addActionListener(this);
			dragonballview.getUpgradeFighterButton5().addActionListener(this);
			dragonballview.getB6666().addActionListener(this);
			dragonballview.getB6666().addMouseListener(this);
			Fighter f1 = game.getPlayer().getActiveFighter();
			dragonballview.getUpgradeFighterPanel().remove(dragonballview.getBackgroundUpgrade());
			if (f1 instanceof Frieza) {
				dragonballview.getUpgradeFighterPanel().add(dragonballview.getBb());
			} else if (f1 instanceof Saiyan) {
				dragonballview.getUpgradeFighterPanel().add(dragonballview.getAa());
			} else if (f1 instanceof Namekian) {
				dragonballview.getUpgradeFighterPanel().add(dragonballview.getCc());
			} else if (f1 instanceof Earthling) {
				dragonballview.getUpgradeFighterPanel().add(dragonballview.getDd());
			} else if (f1 instanceof Majin) {
				dragonballview.getUpgradeFighterPanel().add(dragonballview.getEe());
			}
			this.organizeProgressBars(game.getPlayer().getActiveFighter());
			dragonballview.getUpgradeFighterPanel().add(dragonballview.getIntrostats());
			dragonballview.getUpgradeFighterPanel().add(dragonballview.getBackgroundUpgrade());

			dragonballview.getUpgradeFighterPanel().repaint();
			dragonballview.getUpgradeFighterPanel().revalidate();

		} else if (((JButton) e.getSource()).equals(dragonballview.getUpgradeFighterButton1())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.getPlayer().upgradeFighter(game.getPlayer().getActiveFighter(), 'H');
				this.organizeProgressBars(game.getPlayer().getActiveFighter());
				dragonballview.getAbilityPointsCounter()
						.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
			} catch (NotEnoughAbilityPointsException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Not enough ability points to perform this upgrade!",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}
		} else if (((JButton) e.getSource()).equals(dragonballview.getB6666())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getContentPane().remove(dragonballview.getUpgradeFighterPanel());
			dragonballview.setUpgradeFighterButtonsPanel(new JPanel());
			dragonballview.setUpgradeFighterPanel(new JPanel());
			dragonballview.setUpgradeFighterButton1(new JButton());
			dragonballview.setUpgradeFighterButton2(new JButton());
			dragonballview.setUpgradeFighterButton3(new JButton());
			dragonballview.setUpgradeFighterButton4(new JButton());
			dragonballview.setUpgradeFighterButton5(new JButton());
			dragonballview.getNextpanel().setVisible(true);
			dragonballview.getStatspanel().setVisible(true);
			dragonballview.getNextpanel().setEnabled(true);
			dragonballview.getStatspanel().setEnabled(true);
			dragonballview.getImagespanel().setVisible(true);
			dragonballview.getImagespanel().setEnabled(true);
			dragonballview.getMappanel().setVisible(true);
			dragonballview.getMappanel().setEnabled(true);
			dragonballview.getBackstats().setVisible(true);
			dragonballview.getBackstats().setEnabled(true);

			this.updateStats();
			dragonballview.setAa(new JLabel());
			dragonballview.setCc(new JLabel());
			dragonballview.setDd(new JLabel());
			dragonballview.setEe(new JLabel());
			dragonballview.setBb(new JLabel());
			dragonballview.getNextpanel().revalidate();
			dragonballview.getNextpanel().repaint();
			dragonballview.getStatspanel().revalidate();
			dragonballview.getStatspanel().repaint();
			dragonballview.revalidate();
			dragonballview.repaint();
		} else if (((JButton) e.getSource()).equals(dragonballview.getUpgradeFighterButton2())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.getPlayer().upgradeFighter(game.getPlayer().getActiveFighter(), 'P');
				dragonballview.getAbilityPointsCounter()
						.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
				this.organizeProgressBars(game.getPlayer().getActiveFighter());
			} catch (NotEnoughAbilityPointsException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Not enough ability points to perform this upgrade!",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}
		} else if (((JButton) e.getSource()).equals(dragonballview.getUpgradeFighterButton3())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.getPlayer().upgradeFighter(game.getPlayer().getActiveFighter(), 'B');
				dragonballview.getAbilityPointsCounter()
						.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
				this.organizeProgressBars(game.getPlayer().getActiveFighter());
			} catch (NotEnoughAbilityPointsException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Not enough ability points to perform this upgrade!",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}
		} else if (((JButton) e.getSource()).equals(dragonballview.getUpgradeFighterButton4())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.getPlayer().upgradeFighter(game.getPlayer().getActiveFighter(), 'K');
				dragonballview.getAbilityPointsCounter()
						.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
				this.organizeProgressBars(game.getPlayer().getActiveFighter());
			} catch (NotEnoughAbilityPointsException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Not enough ability points to perform this upgrade!",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}
		} else if (((JButton) e.getSource()).equals(dragonballview.getUpgradeFighterButton5())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			try {
				game.getPlayer().upgradeFighter(game.getPlayer().getActiveFighter(), 'S');
				dragonballview.getAbilityPointsCounter()
						.setText(game.getPlayer().getActiveFighter().getAbilityPoints() + "");
				this.organizeProgressBars(game.getPlayer().getActiveFighter());
			} catch (NotEnoughAbilityPointsException e1) {
				JOptionPane.showMessageDialog(new JFrame(), "Not enough ability points to perform this upgrade!",
						"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
			}

		}	else if (((JButton) e.getSource()).getParent().equals(dragonballview.getSuperattacksbuttons())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			if(game.getPlayer().getActiveFighter().getKi() == 0){
					for(int i = 0; i<game.getPlayer().getActiveFighter().getSuperAttacks().size(); i++)
							if(	((JButton) e.getSource()).getText().equals(game.getPlayer().getActiveFighter().getSuperAttacks().get(i).getName())){
								if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
									try {
									getCurrentBattle().attack(game.getPlayer().getActiveFighter().getSuperAttacks().get(i));
									} catch (NotEnoughKiException e1) {
										JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
												"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
									}
									this.getDragonballview().getPlayerbuttons().setVisible(false);
									this.getDragonballview().getSpecialbuttons().setVisible(true);
									this.getDragonballview().getNextKey().setVisible(false);

							}

							}
			}else{
				for(int i = 0; i<game.getPlayer().getActiveFighter().getSuperAttacks().size(); i++)
					if(	((JButton) e.getSource()).getText().equals(game.getPlayer().getActiveFighter().getSuperAttacks().get(i).getName())){
						if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
							try {
							getCurrentBattle().attack(game.getPlayer().getActiveFighter().getSuperAttacks().get(i));
							} catch (NotEnoughKiException e1) {
								JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
										"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

							}
							this.getDragonballview().getPlayerbuttons().setVisible(false);
							this.getDragonballview().getSpecialbuttons().setVisible(false);
							this.getDragonballview().getNextKey().setVisible(true);
					}

					}
			}

	}else if (((JButton) e.getSource()).getParent().equals(dragonballview.getUltimateattacksbuttons())) {
		 try {
			 File soundFile = new File( "Assets/butsound.wav" );
			 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
			 Clip clip = AudioSystem.getClip();
			 clip.open(audioInputStream);
			 clip.start();
			 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			e1.printStackTrace();
		}
		if(game.getPlayer().getActiveFighter().getKi() == 0){
					for(int i = 0; i<game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++)
						if(	((JButton) e.getSource()).getText().equals(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName())){
							if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
								try {
								getCurrentBattle().attack(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i));
								} catch (NotEnoughKiException e1) {
									JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
											"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

								}
								this.getDragonballview().getPlayerbuttons().setVisible(false);
								this.getDragonballview().getSpecialbuttons().setVisible(true);
								this.getDragonballview().getNextKey().setVisible(false);

								}
						}
		}else{

			for(int i = 0; i<game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++)
				if(	((JButton) e.getSource()).getText().equals(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName())){
					if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
						try {
						getCurrentBattle().attack(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i));
						} catch (NotEnoughKiException e1) {
							JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
									"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

						}
						this.getDragonballview().getPlayerbuttons().setVisible(false);
						this.getDragonballview().getSpecialbuttons().setVisible(false);
						this.getDragonballview().getNextKey().setVisible(true);

						}
				}
		}



		}else if (((JButton) e.getSource()).equals(dragonballview.getB66666())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			dragonballview.getContentPane().remove(dragonballview.getAssignAttacksPanel());
			dragonballview.setAssignAttacksPanel(new JPanel());
			dragonballview.setAssignAttacksButtonsPanel(new JPanel());
			dragonballview.setAssignAttacksButtonsPanel2(new JPanel());
			dragonballview.getNextpanel().setVisible(true);
			dragonballview.getStatspanel().setVisible(true);
			dragonballview.getNextpanel().setEnabled(true);
			dragonballview.getStatspanel().setEnabled(true);
			dragonballview.getImagespanel().setVisible(true);
			dragonballview.getImagespanel().setEnabled(true);
			dragonballview.getMappanel().setVisible(true);
			dragonballview.getMappanel().setEnabled(true);
			dragonballview.getBackstats().setVisible(true);
			dragonballview.getBackstats().setEnabled(true);

			dragonballview.getNextpanel().revalidate();
			dragonballview.getNextpanel().repaint();
			dragonballview.getStatspanel().revalidate();
			dragonballview.getStatspanel().repaint();
			dragonballview.getImagespanel().revalidate();
			dragonballview.getImagespanel().repaint();
			dragonballview.revalidate();
			dragonballview.repaint();
		} else if (((JButton) e.getSource()).getParent().equals(dragonballview.getSuperattacksbuttons())) {
			for (int i = 0; i < game.getPlayer().getActiveFighter().getSuperAttacks().size(); i++)
				if (((JButton) e.getSource()).getText()
						.equals(game.getPlayer().getActiveFighter().getSuperAttacks().get(i).getName())) {
					if (getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())) {
						try {
							getCurrentBattle().attack(game.getPlayer().getActiveFighter().getSuperAttacks().get(i));
						} catch (NotEnoughKiException e1) {
							JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
									"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
							this.getDragonballview().getPlayerbuttons().setVisible(false);
							this.getDragonballview().getSpecialbuttons().setVisible(true);

						}
							this.getDragonballview().getNextKey().setVisible(true);
					}
				}

		} else if (((JButton) e.getSource()).getParent().equals(dragonballview.getUltimateattacksbuttons())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			for (int i = 0; i < game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++)
				if (((JButton) e.getSource()).getText()
						.equals(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName())) {
					if (getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())) {
						try {
							getCurrentBattle().attack(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i));
						} catch (NotEnoughKiException e1) {
							JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
									"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
							this.getDragonballview().getPlayerbuttons().setVisible(false);
							this.getDragonballview().getSpecialbuttons().setVisible(true);

						}
							this.getDragonballview().getNextKey().setVisible(true);
					}
				}
	} else if (((JButton) e.getSource()).equals(dragonballview.getB10())) {
		 try {
			 File soundFile = new File( "Assets/butsound.wav" );
			 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
			 Clip clip = AudioSystem.getClip();
			 clip.open(audioInputStream);
			 clip.start();
			 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			e1.printStackTrace();
		}
			dragonballview.getNextpanel().setVisible(false);
			dragonballview.getStatspanel().setVisible(false);
			dragonballview.getNextpanel().setEnabled(false);
			dragonballview.getStatspanel().setEnabled(false);
			dragonballview.getImagespanel().setVisible(false);
			dragonballview.getImagespanel().setEnabled(false);
			dragonballview.getMappanel().setVisible(false);
			dragonballview.getMappanel().setEnabled(false);
			dragonballview.getBackstats().setVisible(false);
			dragonballview.getBackstats().setEnabled(false);

			dragonballview.assignAttacksButtons();
			dragonballview.getB66666().addActionListener(this);
			dragonballview.getB66666().addMouseListener(this);
			dragonballview.getbCurrentSuperAttacks().addActionListener(this);
			dragonballview.getbCurrentUltimateAttacks().addActionListener(this);

			for (int i = 0; i < game.getPlayer().getSuperAttacks().size(); i++) {
				JButton j = new JButton();
				j.setText(game.getPlayer().getSuperAttacks().get(i).getName() + "");
				dragonballview.getAssignAttacksButtonsPanel().add(j);
				final SuperAttack s = game.getPlayer().getSuperAttacks().get(i);
				j.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						final JDialog a = new JDialog(dragonballview, "Add your attack");
						a.setSize(350, 100);
						a.setLocationRelativeTo(null);
						JPanel p = new JPanel(new FlowLayout());
						for (int i = 0; i < game.getPlayer().getActiveFighter().getSuperAttacks().size(); i++) {
							JButton j = new JButton();
							j.setText(game.getPlayer().getActiveFighter().getSuperAttacks().get(i).getName() + "");
							p.add(j);
							final SuperAttack attackReplaced = game.getPlayer().getActiveFighter().getSuperAttacks().get(i);
							j.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									try {
										game.getPlayer().assignAttack(game.getPlayer().getActiveFighter(), s,
												attackReplaced);
										a.dispose();
									} catch (MaximumAttacksLearnedException e3) {
										JOptionPane.showMessageDialog(new JFrame(), "Maximum number of attacks has been reached",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
									}catch (DuplicateAttackException e2){
										JOptionPane.showMessageDialog(new JFrame(), "You can't assign duplicate attacks.",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}catch( NotASaiyanException e1){
										JOptionPane.showMessageDialog(new JFrame(), "The active fighter is a saiyan to obtain this attack",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}

								}
							});
						}
						while (p.getComponentCount() != 4) {
							JButton j = new JButton();
							j.setText("Empty");
							j.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									try {
										game.getPlayer().assignAttack(game.getPlayer().getActiveFighter(), s, null);
										a.dispose();
									} catch (MaximumAttacksLearnedException e3) {
										JOptionPane.showMessageDialog(new JFrame(), "Maximum number of attacks has been reached",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
									}catch (DuplicateAttackException e2){
										JOptionPane.showMessageDialog(new JFrame(), "You can't assign duplicate attacks.",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}catch( NotASaiyanException e1){
										JOptionPane.showMessageDialog(new JFrame(), "The active fighter is a saiyan to obtain this attack",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}
								}
							});
							p.add(j);
						}
						a.add(p);
						a.setVisible(true);
					}
				});

			}
			for (int i = 0; i < game.getPlayer().getUltimateAttacks().size(); i++) {
				JButton j = new JButton();
				j.setText(game.getPlayer().getUltimateAttacks().get(i).getName() + "");
				dragonballview.getAssignAttacksButtonsPanel2().add(j);
				final UltimateAttack s = game.getPlayer().getUltimateAttacks().get(i);
				j.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// ultimateAttackChoosed = s;
						final JDialog a = new JDialog(dragonballview, "Add your attack");
						a.setSize(350, 100);
						a.setLocationRelativeTo(null);
						JPanel p = new JPanel(new FlowLayout());
						for (int i = 0; i < game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++) {
							JButton j = new JButton();
							j.setText(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName() + "");
							p.add(j);
							final UltimateAttack attackReplaced = game.getPlayer().getActiveFighter().getUltimateAttacks()
									.get(i);
							j.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									try {
										game.getPlayer().assignAttack(game.getPlayer().getActiveFighter(), s,
												attackReplaced);
										a.dispose();
									} catch (MaximumAttacksLearnedException e3) {
										JOptionPane.showMessageDialog(new JFrame(), "Maximum number of attacks has been reached",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
									}catch (DuplicateAttackException e2){
										JOptionPane.showMessageDialog(new JFrame(), "You can't assign duplicate attacks.",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}catch( NotASaiyanException e1){
										JOptionPane.showMessageDialog(new JFrame(), "The active fighter is a saiyan to obtain this attack",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}

								}
							});
						}
						while (p.getComponentCount() != 2) {
							JButton j = new JButton();
							j.setText("Empty");
							j.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									try {
										game.getPlayer().assignAttack(game.getPlayer().getActiveFighter(), s, null);
										a.dispose();
									} catch (MaximumAttacksLearnedException e3) {
										JOptionPane.showMessageDialog(new JFrame(), "Maximum number of attacks has been reached",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
									}catch (DuplicateAttackException e2){
										JOptionPane.showMessageDialog(new JFrame(), "You can't assign duplicate attacks.",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}catch( NotASaiyanException e1){
										JOptionPane.showMessageDialog(new JFrame(), "The active fighter is a saiyan to obtain this attack",
												  "Dragon Ball Error", JOptionPane.ERROR_MESSAGE);

									}
								}
							});
							p.add(j);
						}
						a.add(p);
						a.setVisible(true);
					}
				});
			}
			dragonballview.getAssignAttacksPanel().revalidate();
			dragonballview.getAssignAttacksPanel().repaint();
	}else if (((JButton) e.getSource()).getParent().equals(dragonballview.getUltimateattacksbuttons())) {
		 try {
			 File soundFile = new File( "Assets/butsound.wav" );
			 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
			 Clip clip = AudioSystem.getClip();
			 clip.open(audioInputStream);
			 clip.start();
			 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
			e1.printStackTrace();
		}
		for(int i = 0; i<game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++)
			if(	((JButton) e.getSource()).getText().equals(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName())){
				if(getCurrentBattle().getAttacker().equals(game.getPlayer().getActiveFighter())){
					try {
					getCurrentBattle().attack(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i));
					} catch (NotEnoughKiException e1) {
						JOptionPane.showMessageDialog(new JFrame(), "Not enough Ki Bars to perform this attack!",
								"Dragon Ball Error", JOptionPane.ERROR_MESSAGE);
					}
					this.getDragonballview().getPlayerbuttons().setVisible(false);
					this.getDragonballview().getSpecialbuttons().setVisible(false);
					this.getDragonballview().getNextKey().setVisible(true);
				}
			}

		} else if (((JButton) e.getSource()).equals(dragonballview.getbCurrentSuperAttacks())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			JDialog a = new JDialog(dragonballview, "Current Super Attacks");
			a.setSize(350, 100);
			a.setLocationRelativeTo(null);
			JPanel p = new JPanel(new FlowLayout());
			for (int i = 0; i < game.getPlayer().getActiveFighter().getSuperAttacks().size(); i++) {
				JButton j = new JButton();
				j.setText(game.getPlayer().getActiveFighter().getSuperAttacks().get(i).getName() + "");
				p.add(j);
			}
			while (p.getComponentCount() != 4) {
				JButton j = new JButton();
				j.setText("Empty");
				p.add(j);
			}
			a.add(p);
			a.setVisible(true);
		} else if (((JButton) e.getSource()).equals(dragonballview.getbCurrentUltimateAttacks())) {
			 try {
				 File soundFile = new File( "Assets/butsound.wav" );
				 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInputStream);
				 clip.start();
				 } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			JDialog a = new JDialog(dragonballview, "Current Ultimate Attacks");
			a.setSize(350, 100);
			a.setLocationRelativeTo(null);
			JPanel p = new JPanel(new FlowLayout());
			for (int i = 0; i < game.getPlayer().getActiveFighter().getUltimateAttacks().size(); i++) {
				JButton j = new JButton();
				j.setText(game.getPlayer().getActiveFighter().getUltimateAttacks().get(i).getName() + "");
				p.add(j);
			}
			while (p.getComponentCount() != 2) {
				JButton j = new JButton();
				j.setText("Empty");
				p.add(j);
			}
			a.add(p);
			a.setVisible(true);
		}
	}

		@Override
		public void onDragonCalled(Dragon dragon) {

			this.getDragonballview().switchPanelsToDragon();
			int size = dragon.getWishes().length;
			DragonWish[] wishes = dragon.getWishes();


			for(int i = 0; i<size;i++){
				switch(wishes[i].getType()){
					case SENZU_BEANS:
						this.getDragonballview().getDragonbuttonsPanel().add(this.getDragonballview().getSen());
						setSelectedWish(wishes[i]);
						this.getDragonballview().getSen().addActionListener(this);
						break;
					case ABILITY_POINTS:
						this.getDragonballview().getDragonbuttonsPanel().add(this.getDragonballview().getAbi());
						this.getDragonballview().getAbi().addActionListener(this);
						setSelectedWish1(wishes[i]);
						break;
					case SUPER_ATTACK:
						this.getDragonballview().getDragonbuttonsPanel().add(this.getDragonballview().getSup());
						this.getDragonballview().getSup().addActionListener(this);
						setSelectedWish2(wishes[i]);
						break;
					case ULTIMATE_ATTACK:
						this.getDragonballview().getDragonbuttonsPanel().add(this.getDragonballview().getUlt());
						this.getDragonballview().getUlt().addActionListener(this);
						setSelectedWish3(wishes[i]);
						break;
				}
			}

		}

		@Override
		public void onCollectibleFound(Collectible collectible) {


			if(collectible.equals(Collectible.DRAGON_BALL)){
				this.getDragonballview().getNumberOfDragonBalls().setText("<html><font color=black>Dragon Balls: </font> <font color=yellow>"+game.getPlayer().getDragonBalls()+"</font></html>");
				this.getDragonballview().getNumberOfDragonBalls().setFont(font1);
				ImageIcon dragonballIcon = new ImageIcon("Assets/dragonball.png");
				Image dragonball = dragonballIcon.getImage();
				Image dragonballImage = dragonball.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				dragonballIcon = new ImageIcon(dragonballImage);
				((JButton) this.getDragonballview().getImagespanel().getComponentAt(this.getDragonballview().getSelectedButton().getLocation())).setIcon(dragonballIcon);


			}else if (collectible.equals(Collectible.SENZU_BEAN)){
				this.getDragonballview().getNumberOfSenzuBeans().setText("<html><font color=black>Senzu Beans: </font> <font color=yellow>"+game.getPlayer().getSenzuBeans()+"</font></html>");
				this.getDragonballview().getNumberOfSenzuBeans().setFont(font1);
				ImageIcon senzuIcon = new ImageIcon("Assets/Senzu_Bean.png");
				Image senzu = senzuIcon.getImage();
				Image senzuImage = senzu.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				senzuIcon = new ImageIcon(senzuImage);
				((JButton) this.getDragonballview().getImagespanel().getComponentAt(this.getDragonballview().getSelectedButton().getLocation())).setIcon(senzuIcon);

			}
		}
		@Override
		public void onBattleEvent(BattleEvent e) {
			setCurrentBattle((Battle)e.getSource());
			setFoe((NonPlayableFighter) ((Battle) e.getSource()).getFoe());
			int superattacksize = game.getPlayer().getActiveFighter().getSuperAttacks().size();
			int ultimateattacksize = game.getPlayer().getActiveFighter().getUltimateAttacks().size();
			Fighter attacker = ((Fighter)getCurrentBattle().getAttacker());
			Fighter winner = ((Fighter)e.getWinner());
			//		Fighter defender = ((Fighter)getCurrentBattle().getDefender());
			if(e.getType().equals(BattleEventType.STARTED)){

				this.getDragonballview().switchPanelsToBattle();
				ImageIcon DragTranIcon2 = null;
				Fighter f = game.getPlayer().getActiveFighter();
				if(f instanceof Saiyan){
					DragTranIcon2 = new ImageIcon("Assets/Saiyan.gif");
				}else if(f instanceof Frieza){
					DragTranIcon2 = new ImageIcon("Assets/Frieza.gif");
				}else if(f instanceof Namekian){
					DragTranIcon2 = new ImageIcon("Assets/Namekian.gif");
				}else if(f instanceof Earthling){
					DragTranIcon2 = new ImageIcon("Assets/Earthling.gif");
				}else if(f instanceof Majin){
					DragTranIcon2 = new ImageIcon("Assets/Majin.gif");
				}

				Image DragTran2 = DragTranIcon2.getImage();
				Image DragTranImage2 = DragTran2.getScaledInstance(350, 330, java.awt.Image.SCALE_DEFAULT);
				DragTranIcon2 = new ImageIcon(DragTranImage2);
				this.getDragonballview().getFighter().setIcon(DragTranIcon2);



				if(getFoe().isStrong()){
					ImageIcon bossIcon = new ImageIcon("Assets/Boss.gif");
					Image boss = bossIcon.getImage();
					Image bossImage = boss.getScaledInstance(235, 200, java.awt.Image.SCALE_DEFAULT);
					bossIcon = new ImageIcon(bossImage);
					this.getDragonballview().getFoe().setIcon(bossIcon);
				}

				this.getDragonballview().getLogs().setText("<html>"+"A wild " + foe.getName() +" has appeared (Your Turn)."+"<html>");

				for(int i = 0; i<superattacksize;i++){
					JButton x = new JButton(game.getPlayer().getSuperAttacks().get(i).getName());
					this.getDragonballview().getSuperattacksbuttons().add(x);
					x.addActionListener(this);
				}

				for(int i = 0; i<ultimateattacksize;i++){
					JButton x = new JButton(game.getPlayer().getUltimateAttacks().get(i).getName());
					this.getDragonballview().getUltimateattacksbuttons().add(x);
					x.addActionListener(this);
				}
				this.getDragonballview().getUltimateattacksbuttons().add(new JLabel());
				this.getDragonballview().getUltimateattacksbuttons().add(this.getDragonballview().getBackBut());

				this.getDragonballview().getBlockBut().addActionListener(this);
				this.getDragonballview().getBackBut().addActionListener(this);
				this.getDragonballview().getAttack().addActionListener(this);
				this.getDragonballview().getUseBut().addActionListener(this);
				this.getDragonballview().getSpecial().addActionListener(this);
				this.getDragonballview().getNextKey().addActionListener(this);
			}	else if (e.getType().equals(BattleEventType.ATTACK)){
				if(getCurrentBattle().getAttacker().equals(getFoe())){
					this.getDragonballview().getLogs().setText("<html>"+ attacker.getName() +" has used "+ e.getAttack().getName()+" (Your Turn)." +"<html>");
				}else{
					this.getDragonballview().getLogs().setText("<html>"+ attacker.getName() +" has used "+ e.getAttack().getName()+" (Foe's Turn)." +"<html>");

				}

				updateStatsDuringBattle();
			}  	else if	(e.getType().equals(BattleEventType.BLOCK)){
				if(getCurrentBattle().getAttacker().equals(getFoe())){
					this.getDragonballview().getLogs().setText("<html>"+ attacker.getName() +" has used Block (Your Turn)." +"<html>");
				}else{
					this.getDragonballview().getLogs().setText("<html>"+ attacker.getName() +" has used Block (Foe's Turn)." +"<html>");

				}
				updateStatsDuringBattle();
			}	else if	(e.getType().equals(BattleEventType.USE)){
				this.getDragonballview().getLogs().setText("<html>"+ attacker.getName() +" has used a Senzu Bean (Foe's Turn)" +"<html>");
				updateStatsDuringBattle();
			}	else if	(e.getType().equals(BattleEventType.NEW_TURN)){
				updateStatsDuringBattle();
			}	else if	(e.getType().equals(BattleEventType.ENDED)){
				this.getDragonballview().getLogs().setText("<html>"+ winner.getName() +" won!" +"<html>");
				if(winner.getName() != game.getPlayer().getActiveFighter().getName())
					this.getDragonballview().getFighter().setVisible(false);
				else
					this.getDragonballview().getFoe().setVisible(false);

				if(e.getWinner().equals(game.getPlayer().getActiveFighter()) && this.getFoe().isStrong()==true || e.getWinner().equals(getFoe())){
					regenerateMap();
				}

				this.getDragonballview().getSpecialbuttons().removeAll();
				this.getDragonballview().getSpecialbuttons().revalidate();
				this.getDragonballview().getSpecialbuttons().repaint();

				this.getDragonballview().getSuperattacksbuttons().removeAll();
				this.getDragonballview().getSuperattacksbuttons().revalidate();
				this.getDragonballview().getSuperattacksbuttons().repaint();

				this.getDragonballview().getUltimateattacksbuttons().removeAll();
				this.getDragonballview().getUltimateattacksbuttons().revalidate();
				this.getDragonballview().getUltimateattacksbuttons().repaint();


				this.getDragonballview().getSpecialbuttons().add(this.getDragonballview().getSuperattacksbuttons());
				this.getDragonballview().getSpecialbuttons().add(this.getDragonballview().getUltimateattacksbuttons());




			}
		}

		public void updateStatsDuringBattle(){

			this.getDragonballview().getFighterHP().setMinimum(0);
			this.getDragonballview().getFighterHP().setMaximum(game.getPlayer().getActiveFighter().getMaxHealthPoints());
			this.getDragonballview().getFighterHP().setValue(game.getPlayer().getActiveFighter().getHealthPoints());
			this.getDragonballview().getFighterHP().setString(game.getPlayer().getActiveFighter().getName() + "");

			this.getDragonballview().getFoeHP().setMinimum(0);
			this.getDragonballview().getFoeHP().setMaximum(getFoe().getMaxHealthPoints());
			this.getDragonballview().getFoeHP().setValue(getFoe().getHealthPoints());
			this.getDragonballview().getFoeHP().setString(getFoe().getName() + "");

			this.getDragonballview().getFighterLevel().setText("Lvl:" + game.getPlayer().getActiveFighter().getLevel());
			this.getDragonballview().getFoeLevel().setText("Lvl:" + getFoe().getLevel());
			this.getDragonballview().getFighterSenzu().setText("x"+game.getPlayer().getSenzuBeans());

			this.getDragonballview().getFighterStamina().setMinimum(0);
			this.getDragonballview().getFighterStamina().setMaximum(game.getPlayer().getActiveFighter().getMaxStamina());
			this.getDragonballview().getFighterStamina().setValue(game.getPlayer().getActiveFighter().getStamina());
			this.getDragonballview().getFighterStamina().setStringPainted(true);
			this.getDragonballview().getFighterStamina().setString("Stamina");

			this.getDragonballview().getFoeStamina().setMinimum(0);
			this.getDragonballview().getFoeStamina().setMaximum(getFoe().getMaxStamina());
			this.getDragonballview().getFoeStamina().setValue(getFoe().getStamina());
			this.getDragonballview().getFoeStamina().setStringPainted(true);
			this.getDragonballview().getFoeStamina().setString("Stamina");


			this.getDragonballview().getFighterKi().setMinimum(0);
			this.getDragonballview().getFighterKi().setMaximum(game.getPlayer().getActiveFighter().getMaxKi());
			this.getDragonballview().getFighterKi().setValue(game.getPlayer().getActiveFighter().getKi());
			this.getDragonballview().getFighterKi().setStringPainted(true);
			this.getDragonballview().getFighterKi().setString("Ki");


			this.getDragonballview().getFoeKiBar().setMinimum(0);
			this.getDragonballview().getFoeKiBar().setMaximum(getFoe().getMaxKi());
			this.getDragonballview().getFoeKiBar().setValue(getFoe().getKi());
			this.getDragonballview().getFoeKiBar().setStringPainted(true);
			this.getDragonballview().getFoeKiBar().setString("Ki");
		}


		public void regenerateMap(){

			this.getDragonballview().getNextpanel().removeAll();
			this.getDragonballview().getNextpanel().revalidate();
			this.getDragonballview().getNextpanel().repaint();

			this.getDragonballview().getImagespanel().removeAll();
			this.getDragonballview().getImagespanel().revalidate();
			this.getDragonballview().getImagespanel().repaint();

			this.getDragonballview().getMappanel().removeAll();
			this.getDragonballview().getMappanel().revalidate();
			this.getDragonballview().getMappanel().repaint();

			for(int i = 0; i<100;i++){
				JButton x = new JButton();
				x.setOpaque(false);
				x.setBorderPainted(false);
				x.setBorder(BorderFactory.createEmptyBorder());
				x.setContentAreaFilled(false);
				this.getDragonballview().getImagespanel().add(x);
			}

			ImageIcon bossIcon = new ImageIcon("Assets/Boss.gif");
			Image boss = bossIcon.getImage();
			Image bossImage = boss.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			bossIcon = new ImageIcon(bossImage);

			ImageIcon grassIcon = new ImageIcon("Assets/grassblock.png");
			Image grass = grassIcon.getImage();
			Image grassImage = grass.getScaledInstance(125, 113, java.awt.Image.SCALE_SMOOTH);
			grassIcon = new ImageIcon(grassImage);

			ImageIcon dirtIcon = new ImageIcon("Assets/dirtblock.png");
			Image dirt = dirtIcon.getImage();
			Image dirtImage = dirt.getScaledInstance(125, 113, java.awt.Image.SCALE_SMOOTH);
			dirtIcon = new ImageIcon(dirtImage);


			JButton y = new JButton();
			y.setOpaque(false);
			y.setBorderPainted(false);
			y.setBorder(BorderFactory.createEmptyBorder());
			y.setContentAreaFilled(false);
			y.setIcon(bossIcon);
			this.getDragonballview().getNextpanel().add(y);

			for(int i = 0; i<98; i++){
				JButton x = new JButton();
				x.setOpaque(false);
				x.setBorderPainted(false);
				x.setBorder(BorderFactory.createEmptyBorder());
				x.setContentAreaFilled(false);
				this.getDragonballview().getNextpanel().add(x);
			}
			JButton x = new JButton();

			x.setOpaque(false);
			x.setBorderPainted(false);
			x.setBorder(BorderFactory.createEmptyBorder());
			x.setContentAreaFilled(false);

			x.setIcon(this.getDragonballview().getSelectedButton().getIcon());
			this.getDragonballview().getNextpanel().add(x);
			this.getDragonballview().setSelectedButton(x);


			for(int i = 0; i<99; i++){
				JButton x1 = new JButton();
				x1.setOpaque(false);
				x1.setBorderPainted(false);
				x1.setBorder(BorderFactory.createEmptyBorder());
				x1.setContentAreaFilled(false);
				x1.setIcon(grassIcon);
				this.getDragonballview().getMappanel().add(x1);
			}

			JButton lastcell = new JButton();
			lastcell.setOpaque(false);
			lastcell.setBorderPainted(false);
			lastcell.setBorder(BorderFactory.createEmptyBorder());
			lastcell.setContentAreaFilled(false);
			lastcell.setIcon(dirtIcon);
			this.getDragonballview().getMappanel().add(lastcell);



		}

		public void mouseClicked(MouseEvent e) {
			if(e.getComponent() == this.getDragonballview().getTextField()){
				this.getDragonballview().getTextField().setText("");
			} else if (e.getComponent() == this.getDragonballview().getTextField2()){
				this.getDragonballview().getTextField2().setText("");
			} else if (e.getComponent() == dragonballview.getTextField3()) {
				this.getDragonballview().getTextField3().setText("");
			}


		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseEntered(MouseEvent e) {
			if (e.getComponent() == this.getDragonballview().getB1()) {
				this.getDragonballview().setPlayImage(this.getDragonballview().getPlay().getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setPlayIcon(new ImageIcon(this.getDragonballview().getPlayImage()));
				this.getDragonballview().getB1().setBounds(430, 440, this.getDragonballview().getPlayIcon().getIconWidth(), this.getDragonballview().getPlayIcon().getIconHeight());
				this.getDragonballview().getB1().setIcon(this.getDragonballview().getPlayIcon());

			} else if (e.getComponent() == this.getDragonballview().getB2()) {
				this.getDragonballview().setCreditsImage(this.getDragonballview().getCredits().getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setCreditsIcon(new ImageIcon(this.getDragonballview().getCreditsImage()));
				this.getDragonballview().getB2().setBounds(240, 465, this.getDragonballview().getCreditsIcon().getIconWidth(), this.getDragonballview().getCreditsIcon().getIconHeight());
				this.getDragonballview().getB2().setIcon(this.getDragonballview().getCreditsIcon());

			} else if (e.getComponent() == this.getDragonballview().getB3()) {
				this.getDragonballview().setLoadImage(this.getDragonballview().getLoad().getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setLoadIcon(new ImageIcon(this.getDragonballview().getLoadImage()));
				this.getDragonballview().getB3().setBounds(670, 465, this.getDragonballview().getLoadIcon().getIconWidth(), this.getDragonballview().getLoadIcon().getIconHeight());
				this.getDragonballview().getB3().setIcon(this.getDragonballview().getLoadIcon());
			} else if (e.getComponent() == this.getDragonballview().getB8()) {
				ImageIcon switch1Icon = new ImageIcon("Assets/switchfighter2.png");
				Image switch1 = switch1Icon.getImage();
				Image switch1Image = switch1.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				switch1Icon = new ImageIcon(switch1Image);
				this.getDragonballview().getB8().setIcon(switch1Icon);
			} else if (e.getComponent() == this.getDragonballview().getB9()) {
				ImageIcon upgradeIcon = new ImageIcon("Assets/upgradefighter2.png");
				Image upgrade = upgradeIcon.getImage();
				Image upgradeImage = upgrade.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				upgradeIcon = new ImageIcon(upgradeImage);
				this.getDragonballview().getB9().setIcon(upgradeIcon);
			} else if (e.getComponent() == this.getDragonballview().getB10()) {
				ImageIcon assignIcon = new ImageIcon("Assets/assignattacks2.png");
				Image assign = assignIcon.getImage();
				Image assignImage = assign.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				assignIcon = new ImageIcon(assignImage);
				this.getDragonballview().getB10().setIcon(assignIcon);

			} else if (e.getComponent() == this.getDragonballview().getB7()) {
				ImageIcon saveIcon = new ImageIcon("Assets/saveprogress2.png");
				Image save = saveIcon.getImage();
				Image saveImage = save.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				saveIcon = new ImageIcon(saveImage);
				this.getDragonballview().getB7().setIcon(saveIcon);

			} else if(e.getComponent() == this.getDragonballview().getB6()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue-button2.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB6().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB66()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue-button2.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB66().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue-button2.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB666().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB6666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue-button2.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB6666().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB66666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue-button2.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB66666().setIcon(continueIcon);

			}

		}


		public void mouseExited(MouseEvent e) {
			if (e.getComponent() == this.getDragonballview().getB1()) {
				this.getDragonballview().setPlayImage(this.getDragonballview().getPlay().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setPlayIcon(new ImageIcon(this.getDragonballview().getPlayImage()));
				this.getDragonballview().getB1().setBounds(440, 450, this.getDragonballview().getPlayIcon().getIconWidth(), this.getDragonballview().getPlayIcon().getIconHeight());
				this.getDragonballview().getB1().setIcon(this.getDragonballview().getPlayIcon());
			} else if (e.getComponent() == this.getDragonballview().getB2()) {
				this.getDragonballview().setCreditsImage(this.getDragonballview().getCredits().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setCreditsIcon(new ImageIcon(this.getDragonballview().getCreditsImage()));
				this.getDragonballview().getB2().setBounds(250, 475, this.getDragonballview().getCreditsIcon().getIconWidth(), this.getDragonballview().getCreditsIcon().getIconHeight());
				this.getDragonballview().getB2().setIcon(this.getDragonballview().getCreditsIcon());
			} else if (e.getComponent() == this.getDragonballview().getB3()) {
				this.getDragonballview().setLoadImage(this.getDragonballview().getLoad().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
				this.getDragonballview().setLoadIcon(new ImageIcon(this.getDragonballview().getLoadImage()));
				this.getDragonballview().getB3().setBounds(680, 475, this.getDragonballview().getLoadIcon().getIconWidth(), this.getDragonballview().getLoadIcon().getIconHeight());
				this.getDragonballview().getB3().setIcon(this.getDragonballview().getLoadIcon());
			} else if (e.getComponent() == this.getDragonballview().getB8()) {
				ImageIcon switch1Icon = new ImageIcon("Assets/switchfighter.png");
				Image switch1 = switch1Icon.getImage();
				Image switch1Image = switch1.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				switch1Icon = new ImageIcon(switch1Image);
				this.getDragonballview().getB8().setIcon(switch1Icon);
			} else if (e.getComponent() == this.getDragonballview().getB9()) {
				ImageIcon upgradeIcon = new ImageIcon("Assets/upgradefighter.png");
				Image upgrade = upgradeIcon.getImage();
				Image upgradeImage = upgrade.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				upgradeIcon = new ImageIcon(upgradeImage);
				this.getDragonballview().getB9().setIcon(upgradeIcon);

			} else if (e.getComponent() == this.getDragonballview().getB10()) {
				ImageIcon assignIcon = new ImageIcon("Assets/assignattacks.png");
				Image assign = assignIcon.getImage();
				Image assignImage = assign.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				assignIcon = new ImageIcon(assignImage);
				this.getDragonballview().getB10().setIcon(assignIcon);

			} else if (e.getComponent() == this.getDragonballview().getB7()) {
				ImageIcon saveIcon = new ImageIcon("Assets/saveprogress.png");
				Image save = saveIcon.getImage();
				Image saveImage = save.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
				saveIcon = new ImageIcon(saveImage);
				this.getDragonballview().getB7().setIcon(saveIcon);

			} else if(e.getComponent() == this.getDragonballview().getB6()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB6().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB66()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB66().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB666().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB6666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB6666().setIcon(continueIcon);

			} else if(e.getComponent() == this.getDragonballview().getB66666()){
				ImageIcon continueIcon = new ImageIcon("Assets/continue.png");
				Image continue1 = continueIcon.getImage();
				Image continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
				continueIcon = new ImageIcon(continueImage);
				this.getDragonballview().getB66666().setIcon(continueIcon);

			}

		}



		@Override
	public void keyPressed(KeyEvent e) {
		try{
		if (!dragonballview.getNextpanel().isVisible()) {
				   return;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			this.getDragonballview().getSelectedButton().setIcon(null);
			this.getDragonballview().repaint();
			this.getDragonballview().revalidate();
			((JButton) this.getDragonballview().getNextpanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x,
					this.getDragonballview().getSelectedButton().getLocation().y - (40)))
							.setIcon(this.getDragonballview().getSmallIcon());

			((JButton) this.getDragonballview().getMappanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x,
					this.getDragonballview().getSelectedButton().getLocation().y - (40)))
							.setIcon(this.getDragonballview().getDirtIcon());

			this.getDragonballview()
					.setSelectedButton(((JButton) this.getDragonballview().getNextpanel().getComponentAt(
							this.getDragonballview().getSelectedButton().getLocation().x,
							this.getDragonballview().getSelectedButton().getLocation().y - (40))));
			game.getWorld().moveUp();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.getDragonballview().getSelectedButton().setIcon(null);
			this.getDragonballview().repaint();
			this.getDragonballview().revalidate();
			((JButton) this.getDragonballview().getNextpanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x,
					this.getDragonballview().getSelectedButton().getLocation().y + (80)))
							.setIcon(this.getDragonballview().getSmallIcon());

			((JButton) this.getDragonballview().getMappanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x,
					this.getDragonballview().getSelectedButton().getLocation().y + (80)))
							.setIcon(this.getDragonballview().getDirtIcon());


			this.getDragonballview()
					.setSelectedButton(((JButton) this.getDragonballview().getNextpanel().getComponentAt(
							this.getDragonballview().getSelectedButton().getLocation().x,
							this.getDragonballview().getSelectedButton().getLocation().y + (80))));
			game.getWorld().moveDown();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.getDragonballview().getSelectedButton().setIcon(null);
			this.getDragonballview().repaint();
			this.getDragonballview().revalidate();
			((JButton) this.getDragonballview().getNextpanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x - 40,
					this.getDragonballview().getSelectedButton().getLocation().y))
							.setIcon(this.getDragonballview().getSmallIcon());

			((JButton) this.getDragonballview().getMappanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x - 40,
					this.getDragonballview().getSelectedButton().getLocation().y))
							.setIcon(this.getDragonballview().getDirtIcon());


			this.getDragonballview()
					.setSelectedButton(((JButton) this.getDragonballview().getNextpanel().getComponentAt(
							this.getDragonballview().getSelectedButton().getLocation().x - 40,
							this.getDragonballview().getSelectedButton().getLocation().y)));
			game.getWorld().moveLeft();

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.getDragonballview().getSelectedButton().setIcon(null);
			this.getDragonballview().repaint();
			this.getDragonballview().revalidate();
			((JButton) this.getDragonballview().getNextpanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x + (80),
					this.getDragonballview().getSelectedButton().getLocation().y))
							.setIcon(this.getDragonballview().getSmallIcon());

			((JButton) this.getDragonballview().getMappanel().getComponentAt(
					this.getDragonballview().getSelectedButton().getLocation().x + (80),
					this.getDragonballview().getSelectedButton().getLocation().y))
							.setIcon(this.getDragonballview().getDirtIcon());


			this.getDragonballview()
					.setSelectedButton(((JButton) this.getDragonballview().getNextpanel().getComponentAt(
							this.getDragonballview().getSelectedButton().getLocation().x + 80,
							this.getDragonballview().getSelectedButton().getLocation().y)));
			game.getWorld().moveRight();

		}
		}catch(MapIndexOutOfBoundsException | NullPointerException e2){
			this.getDragonballview().getSelectedButton().setIcon(this.getDragonballview().getSmallIcon());
		}
	}




		public void showStats(char a){
			switch(a){
			case 'S':	organizeProgressBars(new Saiyan("")); break;
			case 'F':	organizeProgressBars(new Frieza("")); break;
			case 'N':	organizeProgressBars(new Namekian("")); break;
			case 'E':	organizeProgressBars(new Earthling("")); break;
			case 'M':	organizeProgressBars(new Majin("")); break;
			}

		}

		public void organizeProgressBars(Fighter x){
			this.getDragonballview().getFighterStats().setMinimum(0);
			this.getDragonballview().getFighterStats().setMaximum(500);
			this.getDragonballview().getFighterStats().setStringPainted(true);
			this.getDragonballview().getFighterStats().setValue(x.getPhysicalDamage());
			this.getDragonballview().getFighterStats().setString("Physical Damage");

			this.getDragonballview().getFighterStats2().setMinimum(0);
			this.getDragonballview().getFighterStats2().setMaximum(500);
			this.getDragonballview().getFighterStats2().setStringPainted(true);
			this.getDragonballview().getFighterStats2().setValue(x.getBlastDamage());
			this.getDragonballview().getFighterStats2().setString("Blast Damage");

			this.getDragonballview().getFighterStats3().setMinimum(0);
			this.getDragonballview().getFighterStats3().setMaximum(2500);
			this.getDragonballview().getFighterStats3().setStringPainted(true);
			this.getDragonballview().getFighterStats3().setValue(x.getMaxHealthPoints());
			this.getDragonballview().getFighterStats3().setString("Max. Health Points");

			this.getDragonballview().getFighterKiBar().setMinimum(0);
			this.getDragonballview().getFighterKiBar().setMaximum(15);
			this.getDragonballview().getFighterKiBar().setStringPainted(true);
			this.getDragonballview().getFighterKiBar().setValue(x.getMaxKi());
			this.getDragonballview().getFighterKiBar().setString("Max. Ki Bars");

			this.getDragonballview().getFighterStaminaBar().setMinimum(0);
			this.getDragonballview().getFighterStaminaBar().setMaximum(15);
			this.getDragonballview().getFighterStaminaBar().setStringPainted(true);
			this.getDragonballview().getFighterStaminaBar().setValue(x.getMaxStamina());
			this.getDragonballview().getFighterStaminaBar().setString("Max. Stamina");
		}

		public void updateStats(){

			this.getDragonballview().getActivefightername().setText("<html><font color=black>Active Fighter: </font> <font color=yellow>"+game.getPlayer().getActiveFighter().getName()+"</font></html>");
			this.getDragonballview().getActivefightername().setFont(font1);
			this.getDragonballview().getActivefightername().setHorizontalAlignment(JLabel.CENTER);


			this.getDragonballview().getExploredMaps().setText("<html><font color=black>Explored Maps: </font> <font color=yellow>"+game.getPlayer().getExploredMaps()+"</font></html>");
			this.getDragonballview().getExploredMaps().setFont(font1);
			this.getDragonballview().getExploredMaps().setHorizontalAlignment(JLabel.CENTER);


			this.getDragonballview().getNumberOfDragonBalls().setText("<html><font color=black>Dragon Balls: </font> <font color=yellow>"+game.getPlayer().getDragonBalls()+"</font></html>");
			this.getDragonballview().getNumberOfDragonBalls().setFont(font1);
			this.getDragonballview().getNumberOfDragonBalls().setHorizontalAlignment(JLabel.CENTER);


			this.getDragonballview().getNumberOfSenzuBeans().setText("<html><font color=black>Senzu Beans: </font> <font color=yellow>"+game.getPlayer().getSenzuBeans()+"</font></html>");
			this.getDragonballview().getNumberOfSenzuBeans().setFont(font1);
			this.getDragonballview().getNumberOfSenzuBeans().setHorizontalAlignment(JLabel.CENTER);


			this.getDragonballview().getActiveFighterAbilityPoints().setText("<html><font color=black>Ability Points: </font> <font color=yellow>"+game.getPlayer().getActiveFighter().getAbilityPoints()+"</font></html>");
			this.getDragonballview().getActiveFighterAbilityPoints().setFont(font1);
			this.getDragonballview().getActiveFighterAbilityPoints().setHorizontalAlignment(JLabel.CENTER);


			this.getDragonballview().getActiveFighterLevel().setText("<html><font color=black>Level: </font> <font color=yellow>"+game.getPlayer().getActiveFighter().getLevel()+"</font></html>");
			this.getDragonballview().getActiveFighterLevel().setFont(font1);
			this.getDragonballview().getActiveFighterLevel().setHorizontalAlignment(JLabel.CENTER);

			this.getDragonballview().getActiveFighterXpBar().setMinimum(0);
			this.getDragonballview().getActiveFighterXpBar().setMaximum(game.getPlayer().getActiveFighter().getTargetXp());
			this.getDragonballview().getActiveFighterXpBar().setStringPainted(true);
			this.getDragonballview().getActiveFighterXpBar().setValue(game.getPlayer().getActiveFighter().getXp());
			this.getDragonballview().getActiveFighterXpBar().setString(this.getDragonballview().getActiveFighterXpBar().getValue() + " Xp Points");


			this.getDragonballview().getActiveFighterStats().setMinimum(0);
			this.getDragonballview().getActiveFighterStats().setMaximum(500);
			this.getDragonballview().getActiveFighterStats().setStringPainted(true);
			this.getDragonballview().getActiveFighterStats().setValue(game.getPlayer().getActiveFighter().getPhysicalDamage());
			this.getDragonballview().getActiveFighterStats().setString("Physical Damage");


			this.getDragonballview().getActiveFighterStats2().setMinimum(0);
			this.getDragonballview().getActiveFighterStats2().setMaximum(500);
			this.getDragonballview().getActiveFighterStats2().setStringPainted(true);
			this.getDragonballview().getActiveFighterStats2().setValue(game.getPlayer().getActiveFighter().getBlastDamage());
			this.getDragonballview().getActiveFighterStats2().setString("Blast Damage");


			this.getDragonballview().getActiveFighterStats3().setMinimum(0);
			this.getDragonballview().getActiveFighterStats3().setMaximum(2500);
			this.getDragonballview().getActiveFighterStats3().setStringPainted(true);
			this.getDragonballview().getActiveFighterStats3().setValue(game.getPlayer().getActiveFighter().getMaxHealthPoints());
			this.getDragonballview().getActiveFighterStats3().setString("Max. Health Points");


			this.getDragonballview().getActiveFighterKiBar().setMinimum(0);
			this.getDragonballview().getActiveFighterKiBar().setMaximum(15);
			this.getDragonballview().getActiveFighterKiBar().setStringPainted(true);
			this.getDragonballview().getActiveFighterKiBar().setValue(game.getPlayer().getActiveFighter().getMaxKi());
			this.getDragonballview().getActiveFighterKiBar().setString("Max. Ki Bars");


			this.getDragonballview().getActiveFighterStaminaBar().setMinimum(0);
			this.getDragonballview().getActiveFighterStaminaBar().setMaximum(15);
			this.getDragonballview().getActiveFighterStaminaBar().setStringPainted(true);
			this.getDragonballview().getActiveFighterStaminaBar().setValue(game.getPlayer().getActiveFighter().getMaxStamina());
			this.getDragonballview().getActiveFighterStaminaBar().setString("Max. Stamina");

			this.getDragonballview().getBackstats().removeAll();
			this.getDragonballview().getBackstats().revalidate();
			this.getDragonballview().getBackstats().repaint();

			Fighter f = game.getPlayer().getActiveFighter();
			ImageIcon statbackIcon;
			if(f instanceof Saiyan) {
				statbackIcon = new ImageIcon("Assets/gokuback.jpg");
				Image statback = statbackIcon.getImage();
				Image updatedstatback = statback.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
				statbackIcon = new ImageIcon(updatedstatback);
				JLabel x = new JLabel();
				x.setBounds(800, 0, 280, 720);
				x.setIcon(statbackIcon);
				this.getDragonballview().getBackstats().add(x);
			}	else if(f instanceof Frieza){
				statbackIcon = new ImageIcon("Assets/friezaback.jpg");
				Image statback1 = statbackIcon.getImage();
				Image updatedstatback1 = statback1.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
				statbackIcon = new ImageIcon(updatedstatback1);
				JLabel x1 = new JLabel();
				x1.setBounds(800, 0, 280, 720);
				x1.setIcon(statbackIcon);
				this.getDragonballview().getBackstats().add(x1);
			}	else if(f instanceof Namekian){
				statbackIcon = new ImageIcon("Assets/namekianback.jpg");
				Image statback11 = statbackIcon.getImage();
				Image updatedstatback11 = statback11.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
				statbackIcon = new ImageIcon(updatedstatback11);
				JLabel x11 = new JLabel();
				x11.setBounds(800, 0, 280, 720);
				x11.setIcon(statbackIcon);
				this.getDragonballview().getBackstats().add(x11);
			}	else if(f instanceof Earthling){
				statbackIcon = new ImageIcon("Assets/earthlingback.jpg");
				Image statback111 = statbackIcon.getImage();
				Image updatedstatback111 = statback111.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
				statbackIcon = new ImageIcon(updatedstatback111);
				JLabel x111 = new JLabel();
				x111.setBounds(800, 0, 280, 720);
				x111.setIcon(statbackIcon);
				this.getDragonballview().getBackstats().add(x111);
			}	else if(f instanceof Majin){
				statbackIcon = new ImageIcon("Assets/majinback.jpg");
				Image statback1111 = statbackIcon.getImage();
				Image updatedstatback1111 = statback1111.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
				statbackIcon = new ImageIcon(updatedstatback1111);
				JLabel x1111 = new JLabel();
				x1111.setBounds(800, 0, 280, 720);
				x1111.setIcon(statbackIcon);
				this.getDragonballview().getBackstats().add(x1111);

			}




		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}


		public static void main(String [] args) throws MissingFieldException, UnknownAttackTypeException{
			DragonBallGUI x = new DragonBallGUI();
			x.game.getPlayer().setDragonBalls(6);
		}

		public DragonWish getSelectedWish() {
			return selectedWish;
		}

		public void setSelectedWish(DragonWish selectedWish) {
			this.selectedWish = selectedWish;
		}

		public DragonWish getSelectedWish1() {
			return selectedWish1;
		}

		public void setSelectedWish1(DragonWish selectedWish1) {
			this.selectedWish1 = selectedWish1;
		}

		public DragonWish getSelectedWish2() {
			return selectedWish2;
		}

		public void setSelectedWish2(DragonWish selectedWish2) {
			this.selectedWish2 = selectedWish2;
		}

		public DragonWish getSelectedWish3() {
			return selectedWish3;
		}

		public void setSelectedWish3(DragonWish selectedWish3) {
			this.selectedWish3 = selectedWish3;
		}

		public Battle getCurrentBattle() {
			return currentBattle;
		}

		public void setCurrentBattle(Battle currentBattle) {
			this.currentBattle = currentBattle;
		}







}
