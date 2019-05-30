package dragonball.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DragonBallView extends JFrame {

	private JPanel backstats = new JPanel();
	private JPanel playerstats = new JPanel();
	private JPanel fighterstats = new JPanel();
	private JPanel buttonstats = new JPanel();
	private JButton b66;
	private int ii = 1;
	private JPanel switchFighterPanel = new JPanel();
	private JPanel createFighterPanel = new JPanel();
	private JPanel upgradeFighterPanel = new JPanel();
	private JPanel upgradeFighterButtonsPanel = new JPanel();
	private JLabel abilityPointsCounter = new JLabel();
	private JPanel assignAttacksPanel = new JPanel();
	private JPanel assignAttacksButtonsPanel = new JPanel();
	private JPanel assignAttacksButtonsPanel2 = new JPanel();
	private JPanel mappanel = new JPanel();
	private ImageIcon dirtIcon;
	private ImageIcon grassIcon;

	public JPanel getMappanel() {
		return mappanel;
	}

	public void setMappanel(JPanel mappanel) {
		this.mappanel = mappanel;
	}

	public JPanel getSwitchFighterPanel() {
		return switchFighterPanel;
	}

	public void setSwitchFighterPanel(JPanel switchFighterPanel) {
		this.switchFighterPanel = switchFighterPanel;
	}
	private JLabel aa = new JLabel();
	private JLabel bb = new JLabel();
	private JLabel cc = new JLabel();
	private JLabel dd = new JLabel();
	private JLabel ee = new JLabel();
	private ImageIcon saiyanIcon;
	private ImageIcon imageIcon;
	private ImageIcon namekianIcon;
	private ImageIcon majinIcon;
	private ImageIcon friezaIcon;
	private ImageIcon earthlingIcon;
	private ImageIcon plusIcon;
	private JTextField textField3 = new JTextField("Enter the fighter's name", 20);
	private JButton b44;
	private JButton b55;
	private JButton b666;
	private JButton b6666;
	private JButton upgradeFighterButton1 = new JButton();
	private JButton upgradeFighterButton2 = new JButton();
	private JButton upgradeFighterButton3 = new JButton();
	private JButton upgradeFighterButton4 = new JButton();
	private JButton upgradeFighterButton5 = new JButton();
	private JLabel backgroundUpgrade;
	private JLabel exploredMaps = new JLabel();
	private JButton BlockBut = new JButton("Block");
	private JLabel logs = new JLabel();
	private JPanel turnlogs = new JPanel();
	private JButton backBut = new JButton("Back");
	private JPanel playerbuttons = new JPanel();
	private JPanel ultimateattacksbuttons = new JPanel();
	private JPanel superattacksbuttons = new JPanel();
	private JPanel specialbuttons = new JPanel();
	private JButton useBut = new JButton("Use");
	private JLabel foe = new JLabel();
	private JButton Boss = new JButton();
	private JButton NextKey = new JButton("Next");
	private	JLabel fighterLevel = new JLabel();
	private	JLabel fighterSenzu = new JLabel();
	private	JProgressBar fighterStamina = new JProgressBar();
	private JProgressBar fighterKi = new JProgressBar();
	private JLabel foeSenzu = new JLabel();
	private JProgressBar foeStamina = new JProgressBar();
	private JProgressBar foeKiBar = new JProgressBar();
	private JLabel foeLevel = new JLabel();
	private JPanel	fighterInfo = new JPanel();
	private JPanel 	foeInfo = new JPanel();
	private JButton attack = new JButton("Attack");
	private JButton block = new JButton("Block");
	private JButton use = new JButton("Use");
	private JButton special = new JButton("Special Attack");
	private JProgressBar fighterHP = new JProgressBar();
	private JProgressBar foeHP = new JProgressBar();
	private JLabel fighter = new JLabel();
	private JPanel battlePanel = new JPanel();
	private JButton sen = new JButton();
	private JButton abi = new JButton();
	private JButton sup = new JButton();
	private JButton ult = new JButton();
	private JPanel dragonbuttonsPanel = new JPanel();
	private JPanel dragonPanel = new JPanel();
	private JPanel introstats = new JPanel();
	private JButton selectedButton = null;
	private ImageIcon smallIcon = null;
	private Image smallImage;
	private Image small;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b10;
	private JButton b12;
	private JLabel activeFighterAbilityPoints = new JLabel();
	private JLabel activeFighterLevel = new JLabel();
	private JProgressBar FighterStaminaBar = new JProgressBar();
	private JProgressBar FighterKiBar = new JProgressBar();
	private JProgressBar FighterXpBar = new JProgressBar();
	private JProgressBar FighterStats = new JProgressBar();
	private JProgressBar FighterStats2 = new JProgressBar();
	private JProgressBar FighterStats3 = new JProgressBar();
	private JProgressBar activeFighterStaminaBar = new JProgressBar();
	private JProgressBar activeFighterKiBar = new JProgressBar();
	private JProgressBar activeFighterXpBar = new JProgressBar();
	private JProgressBar activeFighterStats = new JProgressBar();
	private JProgressBar activeFighterStats2 = new JProgressBar();
	private JProgressBar activeFighterStats3 = new JProgressBar();
	private JLabel NumberOfSenzuBeans = new JLabel();
	private JLabel NumberOfDragonBalls = new JLabel();
	private JLabel activefightername = new JLabel();
	private JLabel stats = new JLabel();
	private JLabel playername = new JLabel();
	private JTextField textField = new JTextField("Enter the name", 10);
	private char characterName = 'S';
	private int i = 1;
	private JPanel firstpanel = new JPanel();
	private JPanel nextpanel = new JPanel();
	private JPanel statspanel = new JPanel();
	private JPanel imagespanel = new JPanel();
	private JButton b1;
	private ImageIcon playIcon;
	private Image play;
	private Image playImage;
	private JButton b2;
	private ImageIcon creditsIcon;
	private Image credits;
	private Image creditsImage;
	private JButton b3;
	private ImageIcon loadIcon;
	private Image load;
	private Image loadImage;
	private ImageIcon nextIcon;
	private Image next;
	private Image nextImage;
	private ImageIcon prevIcon;
	private Image prev;
	private Image prevImage;
	private ImageIcon CharacterIcon;
	private Image character;
	private Image CharacterImage;
	private JButton b4;
	private JButton b5;
	private ImageIcon CharacterIcon2;
	private Image character2;
	private Image CharacterImage2;
	private ImageIcon CharacterIcon3;
	private Image character3;
	private Image CharacterImage3;
	private ImageIcon CharacterIcon4;
	private Image character4;
	private Image CharacterImage4;
	private ImageIcon CharacterIcon5;
	private Image character5;
	private Image CharacterImage5;
	private Image continue1;
	private JLabel a = new JLabel();
	private JLabel b = new JLabel();
	private JLabel c = new JLabel();
	private JLabel d = new JLabel();
	private JLabel e = new JLabel();
	private JButton b6;
	private ImageIcon continueIcon;
	private Image continueImage;
	private JTextField textField2 = new JTextField("Enter the fighter's name", 10);
	private ImageIcon createIcon;
	private Image create;
	private Image createImage;
	private ImageIcon switch1Icon;
	private Image switch1;
	private Image switch1Image;
	private ImageIcon upgradeIcon;
	private Image upgrade;
	private Image upgradeImage;
	private ImageIcon assignIcon;
	private Image assign;
	private Image assignImage;
	private JButton b11;
	private JButton but1 = new JButton();
	private JPanel exitPanel = new JPanel();
	private JButton exitBut = new JButton();
	private JButton b66666 = new JButton();
	private JButton bCurrentSuperAttacks;
	private JButton bCurrentUltimateAttacks;
	private ImageIcon saveIcon;
	private Image save;
	private Image saveImage;
	private ImageIcon statbackIcon;
	private Clip clip;

	public Clip getClip() {
		return clip;
	}

	public void setClip(Clip clip) {
		this.clip = clip;
	}

	public JButton getExitBut() {
		return exitBut;
	}

	public void setExitBut(JButton exitBut) {
		this.exitBut = exitBut;
	}

	public JPanel getTurnlogs() {
		return turnlogs;
	}


	public void setTurnlogs(JPanel turnlogs) {
		this.turnlogs = turnlogs;
	}


	public JLabel getFoe() {
		return foe;
	}


	public void setFoe(JLabel foe) {
		this.foe = foe;
	}


	public JLabel getFighterLevel() {
		return fighterLevel;
	}


	public void setFighterLevel(JLabel fighterLevel) {
		this.fighterLevel = fighterLevel;
	}


	public JLabel getFighterSenzu() {
		return fighterSenzu;
	}


	public void setFighterSenzu(JLabel fighterSenzu) {
		this.fighterSenzu = fighterSenzu;
	}

	public JLabel getFighter() {
		return fighter;
	}


	public void setFighter(JLabel fighter) {
		this.fighter = fighter;
	}

	public JProgressBar getFighterStamina() {
		return fighterStamina;
	}


	public void setFighterStamina(JProgressBar fighterStamina) {
		this.fighterStamina = fighterStamina;
	}


	public JPanel getPlayerbuttons() {
		return playerbuttons;
	}


	public void setPlayerbuttons(JPanel playerbuttons) {
		this.playerbuttons = playerbuttons;
	}


	public JLabel getFoeSenzu() {
		return foeSenzu;
	}


	public void setFoeSenzu(JLabel foeSenzu) {
		this.foeSenzu = foeSenzu;
	}


	public JProgressBar getFoeStamina() {
		return foeStamina;
	}


	public void setFoeStamina(JProgressBar foeStamina) {
		this.foeStamina = foeStamina;
	}


	public JProgressBar getFoeKiBar() {
		return foeKiBar;
	}


	public void setFoeKiBar(JProgressBar foeKiBar) {
		this.foeKiBar = foeKiBar;
	}


	public JLabel getFoeLevel() {
		return foeLevel;
	}


	public void setFoeLevel(JLabel foeLevel) {
		this.foeLevel = foeLevel;
	}

	public JButton getBut1() {
		return but1;
	}


	public void setBut1(JButton but1) {
		this.but1 = but1;
	}


	public ImageIcon getSmallIcon() {
		return smallIcon;
	}


	public void setSmallIcon(ImageIcon smallIcon) {
		this.smallIcon = smallIcon;
	}


	public Image getSmall() {
		return small;
	}


	public void setSmall(Image small) {
		this.small = small;
	}


	public Image getSmallImage() {
		return smallImage;
	}


	public void setSmallImage(Image smallImage) {
		this.smallImage = smallImage;
	}


	public void setNextpanel(JPanel nextpanel) {
		this.nextpanel = nextpanel;
	}


	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextField2(JTextField textField) {
		this.textField2 = textField;
	}


	public char getCharacterName() {
		return characterName;
	}

	public int getI() {
		return i;
	}

	public JPanel getFirstpanel() {
		return firstpanel;
	}

	public JPanel getNextpanel() {
		return nextpanel;
	}

	public JButton getB1() {
		return b1;
	}

	public ImageIcon getPlayIcon() {
		return playIcon;
	}

	public Image getPlay() {
		return play;
	}

	public Image getPlayImage() {
		return playImage;
	}

	public JButton getB2() {
		return b2;
	}

	public ImageIcon getCreditsIcon() {
		return creditsIcon;
	}

	public Image getCredits() {
		return credits;
	}

	public Image getCreditsImage() {
		return creditsImage;
	}

	public JButton getB3() {
		return b3;
	}

	public ImageIcon getLoadIcon() {
		return loadIcon;
	}

	public Image getLoad() {
		return load;
	}

	public Image getLoadImage() {
		return loadImage;
	}

	public ImageIcon getNextIcon() {
		return nextIcon;
	}

	public Image getNext() {
		return next;
	}

	public Image getNextImage() {
		return nextImage;
	}

	public ImageIcon getPrevIcon() {
		return prevIcon;
	}

	public Image getPrev() {
		return prev;
	}

	public Image getPrevImage() {
		return prevImage;
	}

	public ImageIcon getCharacterIcon() {
		return CharacterIcon;
	}

	public Image getCharacter() {
		return character;
	}

	public Image getCharacterImage() {
		return CharacterImage;
	}

	public JButton getB4() {
		return b4;
	}

	public JButton getB5() {
		return b5;
	}

	public ImageIcon getCharacterIcon2() {
		return CharacterIcon2;
	}

	public Image getCharacter2() {
		return character2;
	}

	public Image getCharacterImage2() {
		return CharacterImage2;
	}

	public ImageIcon getCharacterIcon3() {
		return CharacterIcon3;
	}

	public Image getCharacter3() {
		return character3;
	}

	public Image getCharacterImage3() {
		return CharacterImage3;
	}

	public ImageIcon getCharacterIcon4() {
		return CharacterIcon4;
	}

	public Image getCharacter4() {
		return character4;
	}

	public Image getCharacterImage4() {
		return CharacterImage4;
	}

	public ImageIcon getCharacterIcon5() {
		return CharacterIcon5;
	}

	public Image getCharacter5() {
		return character5;
	}

	public Image getCharacterImage5() {
		return CharacterImage5;
	}

	public Image getContinue1() {
		return continue1;
	}

	public JLabel getA() {
		return a;
	}

	public JLabel getB() {
		return b;
	}

	public JLabel getC() {
		return c;
	}

	public JLabel getD() {
		return d;
	}

	public JLabel getE() {
		return e;
	}

	public JButton getB6() {
		return b6;
	}

	public ImageIcon getContinueIcon() {
		return continueIcon;
	}

	public Image getContinueImage() {
		return continueImage;
	}

	public JLabel getActivefightername() {
		return activefightername;
	}


	public void setActivefightername(JLabel activefightername) {
		this.activefightername = activefightername;
	}


	public JLabel getStats() {
		return stats;
	}


	public void setStats(JLabel stats) {
		this.stats = stats;
	}

	public JLabel getPlayername() {
		return playername;
	}


	public void setPlayername(JLabel playername) {
		this.playername = playername;
	}



	public void setPlayImage(Image playImage) {
		this.playImage = playImage;
	}

	public void setPlayIcon(ImageIcon playIcon) {
		this.playIcon = playIcon;
	}

	public void setCreditsImage(Image creditsImage) {
		this.creditsImage = creditsImage;
	}

	public void setCreditsIcon(ImageIcon creditsIcon) {
		this.creditsIcon = creditsIcon;
	}

	public void setLoadImage(Image loadImage) {
		this.loadImage = loadImage;
	}

	public void setLoadIcon(ImageIcon loadIcon) {
		this.loadIcon = loadIcon;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setCharacterName(char c) {
		this.characterName=c;
	}


	public JLabel getNumberOfSenzuBeans() {
		return NumberOfSenzuBeans;
	}


	public void setNumberOfSenzuBeans(JLabel numberOfSenzuBeans) {
		NumberOfSenzuBeans = numberOfSenzuBeans;
	}


	public JLabel getNumberOfDragonBalls() {
		return NumberOfDragonBalls;
	}


	public void setNumberOfDragonBalls(JLabel numberOfDragonBalls) {
		NumberOfDragonBalls = numberOfDragonBalls;
	}


	public JProgressBar getActiveFighterStats() {
		return activeFighterStats;
	}


	public void setActiveFighterStats(JProgressBar activeFighterStats) {
		this.activeFighterStats = activeFighterStats;
	}


	public JProgressBar getActiveFighterStats2() {
		return activeFighterStats2;
	}


	public void setActiveFighterStats2(JProgressBar activeFighterStats2) {
		this.activeFighterStats2 = activeFighterStats2;
	}


	public JProgressBar getActiveFighterStats3() {
		return activeFighterStats3;
	}


	public void setActiveFighterStats3(JProgressBar activeFighterStats3) {
		this.activeFighterStats3 = activeFighterStats3;
	}


	public JLabel getActiveFighterLevel() {
		return activeFighterLevel;
	}


	public void setActiveFighterLevel(JLabel activeFighterLevel) {
		this.activeFighterLevel = activeFighterLevel;
	}


	public JProgressBar getActiveFighterXpBar() {
		return activeFighterXpBar;
	}


	public void setActiveFighterXpBar(JProgressBar activeFighterXpBar) {
		this.activeFighterXpBar = activeFighterXpBar;
	}


	public JLabel getActiveFighterAbilityPoints() {
		return activeFighterAbilityPoints;
	}


	public void setActiveFighterAbilityPoints(JLabel activeFighterAbilityPoints) {
		this.activeFighterAbilityPoints = activeFighterAbilityPoints;
	}


	public JProgressBar getActiveFighterKiBar() {
		return activeFighterKiBar;
	}


	public void setActiveFighterKiBar(JProgressBar activeFighterKiBar) {
		this.activeFighterKiBar = activeFighterKiBar;
	}


	public JProgressBar getActiveFighterStaminaBar() {
		return activeFighterStaminaBar;
	}


	public void setActiveFighterStaminaBar(JProgressBar activeFighterStaminaBar) {
		this.activeFighterStaminaBar = activeFighterStaminaBar;
	}



	public JPanel getSpecialbuttons() {
		return specialbuttons;
	}


	public void setSpecialbuttons(JPanel specialbuttons) {
		this.specialbuttons = specialbuttons;
	}


	public JPanel getImagespanel() {
		return imagespanel;
	}


	public void setImagespanel(JPanel imagespanel) {
		this.imagespanel = imagespanel;
	}






	public DragonBallView() {


		setSize(1080, 720);
		setLocationRelativeTo(null);
		setTitle("Dragon Ball Adventures");
		setFocusable(true);
		firstpanel.setLayout(null);
		firstpanel.setBounds(0, 0, 1080, 720);

		getContentPane().setLayout(null);

		ImageIcon imageIcon = new ImageIcon("Assets/dbalogo.jpg");
		Image image = imageIcon.getImage();
		Image updatedImage = image.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(updatedImage);

		setPlayIcon(new ImageIcon("Assets/play.png"));
		play = getPlayIcon().getImage();
		setPlayImage(play.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		setPlayIcon(new ImageIcon(getPlayImage()));

		setCreditsIcon(new ImageIcon("Assets/Credits.png"));
		credits = getCreditsIcon().getImage();
		setCreditsImage(credits.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
		setCreditsIcon(new ImageIcon(getCreditsImage()));

		setLoadIcon(new ImageIcon("Assets/Load.png"));
		load = getLoadIcon().getImage();
		setLoadImage(load.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
		setLoadIcon(new ImageIcon(getLoadImage()));

		JLabel background = new JLabel(imageIcon);
		background.setBounds(0, 0, 1080, 720);

		b1 = new JButton();
		b1.setBounds(440, 450, getPlayIcon().getIconWidth(), getPlayIcon().getIconHeight());
		b1.setIcon(getPlayIcon());
		b1.setBorderPainted(false);
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.setContentAreaFilled(false);

		b2 = new JButton();
		b2.setBounds(250, 475, getCreditsIcon().getIconWidth(), getCreditsIcon().getIconHeight());
		b2.setIcon(getCreditsIcon());
		b2.setBorderPainted(false);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setContentAreaFilled(false);


		b3 = new JButton();
		b3.setBounds(680, 475, getLoadIcon().getIconWidth(), getLoadIcon().getIconHeight());
		b3.setIcon(getLoadIcon());
		b3.setBorderPainted(false);
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.setContentAreaFilled(false);

		firstpanel.add(b1);
		firstpanel.add(b2);
		firstpanel.add(b3);
		firstpanel.setOpaque(false);
		getContentPane().add(firstpanel);
		getContentPane().add(background);


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}

	public void switchPanelsToIntro(){

		Font font1 = new Font("Courier", Font.BOLD, 20);


		getContentPane().removeAll();
		nextpanel.setLayout(null);

		getContentPane().add(nextpanel);

		nextpanel.setSize(100,100);
		nextpanel.setBounds(0, 0, 1080, 720);


		ImageIcon imageIcon = new ImageIcon("Assets/intro2.jpg");
		Image image = imageIcon.getImage();
		Image updatedImage = image.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(updatedImage);
		JLabel background = new JLabel(imageIcon);
		background.setBounds(0, 0, 1080, 720);

		nextIcon = new ImageIcon("Assets/nextkey.png");
		next = nextIcon.getImage();
		nextImage = next.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		nextIcon = new ImageIcon(nextImage);

		prevIcon = new ImageIcon("Assets/prevkey.png");
		prev = prevIcon.getImage();
		prevImage = prev.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		prevIcon = new ImageIcon(prevImage);

		continueIcon = new ImageIcon("Assets/continue.png");
		continue1 = continueIcon.getImage();
		continueImage = continue1.getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH);
		continueIcon = new ImageIcon(continueImage);


		b4 = new JButton();
		b4.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b4.setIcon(nextIcon);
		b4.setBorderPainted(false);
		b4.setBorder(BorderFactory.createEmptyBorder());
		b4.setContentAreaFilled(false);

		b5 = new JButton();
		b5.setBounds(200, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b5.setIcon(prevIcon);
		b5.setBorderPainted(false);
		b5.setBorder(BorderFactory.createEmptyBorder());
		b5.setContentAreaFilled(false);

		b6 = new JButton();
		b6.setBounds(100, 480, continueIcon.getIconWidth(), continueIcon.getIconHeight());
		b6.setIcon(continueIcon);
		b6.setBorderPainted(false);
		b6.setBorder(BorderFactory.createEmptyBorder());
		b6.setContentAreaFilled(false);


		textField.setBounds(171, 116, 195, 45);
		textField.setFont(font1);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setForeground(Color.ORANGE);

		textField2.setBounds(171, 258, 195, 45);
		textField2.setFont(font1);
		textField2.setHorizontalAlignment(JTextField.CENTER);
		textField2.setBackground(Color.DARK_GRAY);
		textField2.setBorder(BorderFactory.createEmptyBorder());
		textField2.setForeground(Color.ORANGE);

		/*ImageIcon CharacterIcon = createCharacters(1);
		ImageIcon CharacterIcon2 = createCharacters(2);
		ImageIcon CharacterIcon3 = createCharacters(3);
		ImageIcon CharacterIcon4 = createCharacters(4);
		ImageIcon CharacterIcon5 = createCharacters(5);*/


		CharacterIcon = new ImageIcon("Assets/Saiyan.gif");
		character = CharacterIcon.getImage();
		CharacterImage = character.getScaledInstance(200, 320, java.awt.Image.SCALE_DEFAULT);
		CharacterIcon = new ImageIcon(CharacterImage);

		CharacterIcon2 = new ImageIcon("Assets/Frieza.gif");
		character2 = CharacterIcon2.getImage();
		CharacterImage2 = character2.getScaledInstance(200, 320, java.awt.Image.SCALE_DEFAULT);
		CharacterIcon2 = new ImageIcon(CharacterImage2);

		CharacterIcon3 = new ImageIcon("Assets/Namekian.gif");
		character3 = CharacterIcon3.getImage();
		CharacterImage3 = character3.getScaledInstance(200, 320, java.awt.Image.SCALE_DEFAULT);
		CharacterIcon3 = new ImageIcon(CharacterImage3);

		CharacterIcon4 = new ImageIcon("Assets/Earthling.gif");
		character4 = CharacterIcon4.getImage();
		CharacterImage4 = character4.getScaledInstance(200, 320, java.awt.Image.SCALE_DEFAULT);
		CharacterIcon4 = new ImageIcon(CharacterImage4);

		CharacterIcon5 = new ImageIcon("Assets/Majin.gif");
		character5 = CharacterIcon5.getImage();
		CharacterImage5 = character5.getScaledInstance(200, 320, java.awt.Image.SCALE_DEFAULT);
		CharacterIcon5 = new ImageIcon(CharacterImage5);

		a.setBounds(760, 100, CharacterIcon.getIconWidth(), CharacterIcon.getIconHeight());
		a.setIcon(CharacterIcon);

		b.setBounds(760, 100, CharacterIcon2.getIconWidth(), CharacterIcon2.getIconHeight());
		b.setIcon(CharacterIcon2);

		c.setBounds(760, 100, CharacterIcon3.getIconWidth(), CharacterIcon3.getIconHeight());
		c.setIcon(CharacterIcon3);

		d.setBounds(760, 100, CharacterIcon4.getIconWidth(), CharacterIcon4.getIconHeight());
		d.setIcon(CharacterIcon4);

		e.setBounds(760, 100, CharacterIcon5.getIconWidth(), CharacterIcon5.getIconHeight());
		e.setIcon(CharacterIcon5);

		a.setVisible(true);
		b.setVisible(false);
		c.setVisible(false);
		d.setVisible(false);
		e.setVisible(false);


		getIntrostats().setSize(320,160);
		getIntrostats().setLayout(new GridLayout(5,1));
		getIntrostats().setBounds(695, 430, getIntrostats().getWidth(), getIntrostats().getHeight());

		getIntrostats().add(getFighterStats());
		getIntrostats().add(getFighterStats2());
		getIntrostats().add(getFighterStats3());
		getIntrostats().add(getFighterKiBar());
		getIntrostats().add(getFighterStaminaBar());
		nextpanel.add(getIntrostats());
		nextpanel.add(a);
		nextpanel.add(b);
		nextpanel.add(c);
		nextpanel.add(d);
		nextpanel.add(e);
		nextpanel.add(b4);
		nextpanel.add(b5);
		nextpanel.add(b6);
		nextpanel.add(textField2);
		nextpanel.add(textField);
		nextpanel.add(background);

		this.validate();
		this.setVisible(true);

	}

	public void switchPanelsToWorld(){

	//	Font font1 = new Font("SansSerif", Font.BOLD, 20);

		 try {
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Assets/p.wav"));
			 clip = AudioSystem.getClip();
			 clip.open(inputStream);
			 clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		this.getContentPane().removeAll();
		dragonPanel.setLayout(null);
		nextpanel.setLayout(new GridLayout(10,10));
		statspanel.setLayout(new GridLayout(3,1));
		playerstats.setLayout(new GridLayout(10, 1));
		fighterstats.setLayout(new GridLayout(10, 1));
		buttonstats.setLayout(new GridLayout(5, 1));
		imagespanel.setLayout(new GridLayout(10,10));
		mappanel.setLayout(new GridLayout(10,10));




		this.getContentPane().add(nextpanel);
		this.getContentPane().add(imagespanel);
		this.getContentPane().add(mappanel);
		this.getContentPane().add(statspanel);
		this.getContentPane().add(dragonPanel);
		this.getContentPane().add(battlePanel);
		nextpanel.setFocusable(true);

		battlePanel.setVisible(false);
		dragonPanel.setVisible(false);


	/*	JLabel activefighter =  new JLabel();
		playername1.setText("Active Fighter: " + getActiveFighterName());
		//playername1.setBounds(800, 0, x.getWidth(), x.getHeight());
		playername1.setFont(font1);
	*/


		ImageIcon grassIcon = new ImageIcon("Assets/grassblock.png");
		Image grass = grassIcon.getImage();
		Image grassImage = grass.getScaledInstance(125, 113, java.awt.Image.SCALE_SMOOTH);
		grassIcon = new ImageIcon(grassImage);

		ImageIcon dirtIcon = new ImageIcon("Assets/dirtblock.png");
		Image dirt = dirtIcon.getImage();
		Image dirtImage = dirt.getScaledInstance(125, 113, java.awt.Image.SCALE_SMOOTH);
		dirtIcon = new ImageIcon(dirtImage);

		setDirtIcon(dirtIcon);
		setGrassIcon(grassIcon);

		saveIcon = new ImageIcon("Assets/saveprogress.png");
		save = saveIcon.getImage();
		saveImage = save.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
		saveIcon = new ImageIcon(saveImage);

		switch1Icon = new ImageIcon("Assets/switchfighter.png");
		switch1 = switch1Icon.getImage();
		switch1Image = switch1.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
		switch1Icon = new ImageIcon(switch1Image);

		upgradeIcon = new ImageIcon("Assets/upgradefighter.png");
		upgrade = upgradeIcon.getImage();
		upgradeImage = upgrade.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
		upgradeIcon = new ImageIcon(upgradeImage);

		assignIcon = new ImageIcon("Assets/assignattacks.png");
		assign = assignIcon.getImage();
		assignImage = assign.getScaledInstance(250, 45, java.awt.Image.SCALE_SMOOTH);
		assignIcon = new ImageIcon(assignImage);


		b7 = new JButton();
		b7.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b7.setIcon(saveIcon);
		b7.setBorderPainted(false);
		b7.setBorder(BorderFactory.createEmptyBorder());
		b7.setContentAreaFilled(false);

		b8 = new JButton();
		b8.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b8.setIcon(switch1Icon);
		b8.setBorderPainted(false);
		b8.setBorder(BorderFactory.createEmptyBorder());
		b8.setContentAreaFilled(false);

		b9 = new JButton();
		b9.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b9.setIcon(upgradeIcon);
		b9.setBorderPainted(false);
		b9.setBorder(BorderFactory.createEmptyBorder());
		b9.setContentAreaFilled(false);

		b10 = new JButton();
		b10.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b10.setIcon(assignIcon);
		b10.setBorderPainted(false);
		b10.setBorder(BorderFactory.createEmptyBorder());
		b10.setContentAreaFilled(false);





		if(getI() == 1){
			small = getCharacterIcon().getImage();
			smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			smallIcon = new ImageIcon(smallImage);
		} else if (getI() == 2){
			small = getCharacterIcon2().getImage();
			smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			smallIcon = new ImageIcon(smallImage);
		} else if (getI() == 3){
			small = getCharacterIcon3().getImage();
			smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			smallIcon = new ImageIcon(smallImage);
		} else if (getI() == 4){
			small = getCharacterIcon4().getImage();
			smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			smallIcon = new ImageIcon(smallImage);
		} else if (getI() == 5){
			small = getCharacterIcon5().getImage();
			smallImage = small.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
			smallIcon = new ImageIcon(smallImage);
		}

		getBut1().setIcon(smallIcon);
		setSelectedButton(getBut1());


		ImageIcon bossIcon = new ImageIcon("Assets/Boss.gif");
		Image boss = bossIcon.getImage();
		Image bossImage = boss.getScaledInstance(70, 50, java.awt.Image.SCALE_DEFAULT);
		bossIcon = new ImageIcon(bossImage);
		getBoss().setIcon(bossIcon);



		playerstats.add(getPlayername());
		playerstats.add(exploredMaps);
		playerstats.add(getNumberOfDragonBalls());
		playerstats.add(getNumberOfSenzuBeans());
		statspanel.add(playerstats);
		fighterstats.add(getActivefightername());
		fighterstats.add(getActiveFighterLevel());
		fighterstats.add(getActiveFighterAbilityPoints());
		fighterstats.add(getActiveFighterXpBar());
		fighterstats.add(getActiveFighterKiBar());
		fighterstats.add(getActiveFighterStaminaBar());
		fighterstats.add(getActiveFighterStats());
		fighterstats.add(getActiveFighterStats2());
		fighterstats.add(getActiveFighterStats3());
		statspanel.add(fighterstats);
		buttonstats.add(b8);
		buttonstats.add(b9);
		buttonstats.add(b10);
		buttonstats.add(b7);
		statspanel.add(buttonstats);

		//statspanel.add(getActivefightername());
		//statspanel.add(getPlayername());
		//statspanel.add(getActivefightername());
		//statspanel.add(getPlayername());
		//statspanel.add(getActivefightername());

		dragonPanel.setSize(1080,720);
		dragonPanel.setBounds(0, 0, dragonPanel.getWidth(), dragonPanel.getHeight());


		battlePanel.setSize(1080,720);
		battlePanel.setBounds(0, 0, battlePanel.getWidth(), battlePanel.getHeight());


		statspanel.setSize(100,100);
		statspanel.setBounds(800, 0, 280, 720);


		statspanel.setOpaque(false);

		nextpanel.setSize(100,100);
		nextpanel.setBounds(25, 25, 750, 635);
		nextpanel.setOpaque(true);

		imagespanel.setSize(100,100);
		imagespanel.setBounds(25, 25, 750, 635);

		backstats.setBounds(800, -10, 280, 720);

		mappanel.setSize(100,100);
		mappanel.setBounds(25, 25, 750, 635);

		nextpanel.setOpaque(false);
		imagespanel.setOpaque(false);


		for(int i = 0; i<99; i++){
			JButton x1 = new JButton();
			x1.setOpaque(false);
			x1.setBorderPainted(false);
			x1.setBorder(BorderFactory.createEmptyBorder());
			x1.setContentAreaFilled(false);
			x1.setIcon(grassIcon);
			mappanel.add(x1);
		}

		JButton lastcell = new JButton();
		lastcell.setOpaque(false);
		lastcell.setBorderPainted(false);
		lastcell.setBorder(BorderFactory.createEmptyBorder());
		lastcell.setContentAreaFilled(false);
		lastcell.setIcon(dirtIcon);
		mappanel.add(lastcell);

		for(int i = 0; i<100; i++){
			JButton x1 = new JButton();
			x1.setOpaque(false);
			x1.setBorderPainted(false);
			x1.setBorder(BorderFactory.createEmptyBorder());
			x1.setContentAreaFilled(false);
			imagespanel.add(x1);
		}

		mappanel.setOpaque(false);
		dragonPanel.setVisible(false);

		switch (getI()) {
		case 1:
			statbackIcon = new ImageIcon("Assets/gokuback.jpg");
			Image statback = statbackIcon.getImage();
			Image updatedstatback = statback.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
			statbackIcon = new ImageIcon(updatedstatback);
			JLabel x = new JLabel();
			x.setBounds(800, 0, 280, 720);
			x.setIcon(statbackIcon);
			backstats.add(x);
			break;
		case 2:
			statbackIcon = new ImageIcon("Assets/friezaback.jpg");
			Image statback1 = statbackIcon.getImage();
			Image updatedstatback1 = statback1.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
			statbackIcon = new ImageIcon(updatedstatback1);
			JLabel x1 = new JLabel();
			x1.setBounds(800, 0, 280, 720);
			x1.setIcon(statbackIcon);
			backstats.add(x1);
			break;
		case 3:
			statbackIcon = new ImageIcon("Assets/namekianback.jpg");
			Image statback11 = statbackIcon.getImage();
			Image updatedstatback11 = statback11.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
			statbackIcon = new ImageIcon(updatedstatback11);
			JLabel x11 = new JLabel();
			x11.setBounds(800, 0, 280, 720);
			x11.setIcon(statbackIcon);
			backstats.add(x11);
			break;
		case 4:
			statbackIcon = new ImageIcon("Assets/earthlingback.jpg");
			Image statback111 = statbackIcon.getImage();
			Image updatedstatback111 = statback111.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
			statbackIcon = new ImageIcon(updatedstatback111);
			JLabel x111 = new JLabel();
			x111.setBounds(800, 0, 280, 720);
			x111.setIcon(statbackIcon);
			backstats.add(x111);
			break;
		case 5:
			statbackIcon = new ImageIcon("Assets/majinback.jpg");
			Image statback1111 = statbackIcon.getImage();
			Image updatedstatback1111 = statback1111.getScaledInstance(280, 720, java.awt.Image.SCALE_SMOOTH);
			statbackIcon = new ImageIcon(updatedstatback1111);
			JLabel x1111 = new JLabel();
			x1111.setBounds(800, 0, 280, 720);
			x1111.setIcon(statbackIcon);
			backstats.add(x1111);
			break;
		}


		playerstats.setOpaque(false);
		fighterstats.setOpaque(false);
		buttonstats.setOpaque(false);
		getContentPane().add(backstats);
		getContentPane().setBackground(Color.BLACK);
		this.validate();
		this.setVisible(true);

	}


	public void switchPanelsToDragon() {
		nextpanel.setVisible(false);
		statspanel.setVisible(false);
		imagespanel.setVisible(false);
		mappanel.setVisible(false);

		getDragonbuttonsPanel().setSize(250, 250);
		getDragonbuttonsPanel().setBounds(415, 235, getDragonbuttonsPanel().getWidth(), getDragonbuttonsPanel().getHeight());
		getDragonbuttonsPanel().setLayout(new GridLayout(4,1));
		dragonPanel.add(getDragonbuttonsPanel());

		ImageIcon SenzuButIcon = new ImageIcon("Assets/senzubeanbut.png");
		Image SenzuBut = SenzuButIcon.getImage();
		Image SenzuButImage = SenzuBut.getScaledInstance(300, 140, java.awt.Image.SCALE_SMOOTH);
		SenzuButIcon = new ImageIcon(SenzuButImage);

		ImageIcon AbilityButIcon = new ImageIcon("Assets/abilitypointsbut.png");
		Image AbilityBut = AbilityButIcon.getImage();
		Image AbilityImage = AbilityBut.getScaledInstance(300, 140, java.awt.Image.SCALE_SMOOTH);
		AbilityButIcon = new ImageIcon(AbilityImage);

		ImageIcon SuperButIcon = new ImageIcon("Assets/superattacksbut.png");
		Image SuperBut = SuperButIcon.getImage();
		Image SuperButImage = SuperBut.getScaledInstance(300, 140, java.awt.Image.SCALE_SMOOTH);
		SuperButIcon = new ImageIcon(SuperButImage);

		ImageIcon UltimateButIcon = new ImageIcon("Assets/ultimateattacksbut.png");
		Image UltimateBut = UltimateButIcon.getImage();
		Image UltimateButImage = UltimateBut.getScaledInstance(300, 140, java.awt.Image.SCALE_SMOOTH);
		UltimateButIcon = new ImageIcon(UltimateButImage);


		ImageIcon DragTranIcon = new ImageIcon("Assets/dragontransanimated.gif");
		Image DragTran = DragTranIcon.getImage();
		Image DragTranImage = DragTran.getScaledInstance(1080, 720, java.awt.Image.SCALE_DEFAULT);
		DragTranIcon = new ImageIcon(DragTranImage);

		ImageIcon dragonIcon = new ImageIcon("Assets/dragon.gif");
		Image dragon = dragonIcon.getImage();
		Image dragonImage = dragon.getScaledInstance(1080, 720, java.awt.Image.SCALE_DEFAULT);
		dragonIcon = new ImageIcon(dragonImage);


		getSen().setIcon(SenzuButIcon);
		getSen().setBorderPainted(false);
		getSen().setBorder(BorderFactory.createEmptyBorder());
		getSen().setContentAreaFilled(false);

		getAbi().setIcon(AbilityButIcon);
		getAbi().setBorderPainted(false);
		getAbi().setBorder(BorderFactory.createEmptyBorder());
		getAbi().setContentAreaFilled(false);

		getSup().setIcon(SuperButIcon);
		getSup().setBorderPainted(false);
		getSup().setBorder(BorderFactory.createEmptyBorder());
		getSup().setContentAreaFilled(false);

		getUlt().setIcon(UltimateButIcon);
		getUlt().setBorderPainted(false);
		getUlt().setBorder(BorderFactory.createEmptyBorder());
		getUlt().setContentAreaFilled(false);

		dragonPanel.setOpaque(true);
		dragonPanel.setVisible(true);
		dragonPanel.setFocusable(true);

		/*

		long time = 0;
		long duration = 5000;

		while (time<duration) {
			x.setVisible(true);
		    time+=1000;
		}

		x.setVisible(false);
		*/

		JLabel x = new JLabel();
		x.setIcon(dragonIcon);
		x.setSize(1080,720);
		x.setBounds(0, 0, x.getWidth(), x.getHeight());
		x.setVisible(true);
		dragonbuttonsPanel.setOpaque(false);
		dragonPanel.add(x);

	}

	public void switchPanelsToBattle(){
		getClip().stop();
		 try {
				AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Assets/battle.wav"));
				 clip = AudioSystem.getClip();
				 clip.open(inputStream);
				 clip.loop(Clip.LOOP_CONTINUOUSLY);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		nextpanel.setVisible(false);
		statspanel.setVisible(false);
		imagespanel.setVisible(false);
		dragonPanel.setVisible(false);
		mappanel.setVisible(false);
		battlePanel.setVisible(true);

		battlePanel.setLayout(null);

		Font font1 = new Font("Courier", Font.BOLD, 20);
		Font font2 = new Font("Courier", Font.BOLD, 25);
		Font font3 = new Font("Courier", Font.BOLD, 18);

		ImageIcon BattleBackIcon = new ImageIcon("Assets/battlebackground2.gif");
		Image BattleBack = BattleBackIcon.getImage();
		Image BattleBackImage = BattleBack.getScaledInstance(1080, 720, java.awt.Image.SCALE_DEFAULT);
		BattleBackIcon = new ImageIcon(BattleBackImage);

		ImageIcon DragTranIcon = new ImageIcon("Assets/foe.gif");
		Image DragTran = DragTranIcon.getImage();
		Image DragTranImage = DragTran.getScaledInstance(230, 230, java.awt.Image.SCALE_DEFAULT);
		DragTranIcon = new ImageIcon(DragTranImage);


		ImageIcon senzuIcon = new ImageIcon("Assets/Senzu_Bean.png");
		Image senzu = senzuIcon.getImage();
		Image senzuImage = senzu.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
		senzuIcon = new ImageIcon(senzuImage);

		ImageIcon senzuIcon2 = new ImageIcon("Assets/Senzu_Bean.png");
		Image senzu2 = senzuIcon2.getImage();
		Image senzuImage2 = senzu2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		senzuIcon2 = new ImageIcon(senzuImage2);

		getFighterSenzu().setHorizontalAlignment(JLabel.CENTER);
		getFighterLevel().setHorizontalAlignment(JLabel.CENTER);
		getFoeLevel().setHorizontalAlignment(JLabel.CENTER);


		fighter.setSize(450, 350);
		fighter.setBounds(630, 165, fighter.getWidth(), fighter.getHeight());
		fighter.setVisible(true);


		foe.setIcon(DragTranIcon);
		foe.setSize(500, 400);
		foe.setBounds(125, 0, foe.getWidth(), foe.getHeight());


		JLabel x = new JLabel();
		x.setIcon(BattleBackIcon);
		x.setSize(1080,720);
		x.setBounds(0, 0, x.getWidth(), x.getHeight());
		x.setVisible(true);

		fighterHP.setForeground(Color.RED);
		foeHP.setForeground(Color.RED);
		fighterStamina.setForeground(Color.BLUE);
		foeStamina.setForeground(Color.BLUE);
		fighterKi.setForeground(Color.GREEN);
		foeKiBar.setForeground(Color.GREEN);

		playerbuttons.setLayout(new GridLayout(2,2));
		playerbuttons.setSize(450, 130);
		playerbuttons.setBounds(555, 543, playerbuttons.getWidth(), playerbuttons.getHeight());

		specialbuttons.setSize(450, 130);
		specialbuttons.setBounds(555, 543, specialbuttons.getWidth(), playerbuttons.getHeight());
		specialbuttons.setBackground(Color.BLACK);
		specialbuttons.setLayout(new GridLayout(2,1));

		turnlogs.setSize(425, 65);
		turnlogs.setBackground(Color.GRAY);
		turnlogs.setBounds(100, 543, turnlogs.getWidth(), turnlogs.getHeight());

		logs.setSize(425,65);
		logs.setBounds(100, 540, logs.getWidth(), logs.getHeight());
		logs.setFont(font3);

		superattacksbuttons.setLayout(new GridLayout(1,4));
		ultimateattacksbuttons.setLayout(new GridLayout(1,4));

		specialbuttons.add(superattacksbuttons);
		specialbuttons.add(ultimateattacksbuttons);
		specialbuttons.setVisible(false);

		getFighterHP().setSize(425, 63);;
		getFighterHP().setBounds(20,335,425,63);
		getFighterHP().setStringPainted(true);

		getFoeHP().setSize(425, 50);;
		getFoeHP().setBounds(632,20,425,50);
		getFoeHP().setStringPainted(true);

		fighterLevel.setText("Lvl: ");
		fighterLevel.setFont(font2);
		fighterSenzu.setIcon(senzuIcon2);

		fighterSenzu.setFont(font2);

		getFighterKi().setStringPainted(true);
		getFighterKi().setString("Ki");

		fighterInfo.add(fighterKi);
		fighterInfo.add(fighterStamina);
		fighterInfo.add(fighterSenzu);
		fighterInfo.add(fighterLevel);
		fighterInfo.setSize(425, 63);
		fighterInfo.setBounds(20, 401, fighterInfo.getWidth(), fighterInfo.getHeight());
		fighterInfo.setLayout(new GridLayout(1,4));
		fighterInfo.setBackground(Color.PINK);

		foeLevel.setText("Lvl: ");
		foeLevel.setFont(font1);
		foeSenzu.setIcon(senzuIcon);

		foeInfo.add(foeKiBar);
		foeInfo.add(foeStamina);
		foeInfo.add(foeLevel);
		foeInfo.setSize(425, 40);
		foeInfo.setBounds(632, 73, foeInfo.getWidth(), foeInfo.getHeight());
		foeInfo.setLayout(new GridLayout(1,4));
		foeInfo.setBackground(Color.PINK);

		getNextKey().setVisible(false);

		getNextKey().setSize(150, 45);
		getNextKey().setBounds(375, 615, getNextKey().getWidth(), getNextKey().getHeight());
	//	turnlogs.add(logs);
		battlePanel.add(logs);
		battlePanel.add(turnlogs);
		battlePanel.add(getNextKey());
		battlePanel.add(foeInfo);
		battlePanel.add(fighterInfo);
		battlePanel.add(getFighterHP());
		battlePanel.add(getFoeHP());
		playerbuttons.add(attack);
		playerbuttons.add(getBlockBut());
		playerbuttons.add(useBut);
		playerbuttons.add(special);
		battlePanel.add(specialbuttons);
		battlePanel.add(playerbuttons);
		battlePanel.add(foe);
		battlePanel.add(fighter);
		battlePanel.add(x);



	}

	public void switchPanelsBackToWorld(){

			clip.stop();
		 try {
				AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Assets/p.wav"));
				 clip = AudioSystem.getClip();
				 clip.open(inputStream);
				 clip.loop(Clip.LOOP_CONTINUOUSLY);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		getDragonPanel().removeAll();
		getDragonPanel().revalidate();
		getDragonPanel().repaint();

		getBattlePanel().removeAll();
		getBattlePanel().revalidate();
		getBattlePanel().repaint();
		getFoe().setVisible(true);
		getFighter().setVisible(true);
		getNextKey().setVisible(true);
		getPlayerbuttons().setVisible(true);

		mappanel.setVisible(true);
		nextpanel.setVisible(true);
		statspanel.setVisible(true);
		imagespanel.setVisible(true);
		dragonPanel.setVisible(false);
		battlePanel.setVisible(false);



	}


	public JPanel getDragonPanel() {
		return dragonPanel;
	}


	public void setDragonPanel(JPanel dragonPanel) {
		this.dragonPanel = dragonPanel;
	}


	public JButton getB12() {
		return b12;
	}


	public void setB12(JButton b12) {
		this.b12 = b12;
	}



	public static void main(String [] args){
	}


	public JPanel getDragonbuttonsPanel() {
		return dragonbuttonsPanel;
	}


	public void setDragonbuttonsPanel(JPanel dragonbuttonsPanel) {
		this.dragonbuttonsPanel = dragonbuttonsPanel;
	}


	public JButton getSen() {
		return sen;
	}


	public void setSen(JButton sen) {
		this.sen = sen;
	}


	public JButton getAbi() {
		return abi;
	}


	public void setAbi(JButton abi) {
		this.abi = abi;
	}


	public JButton getSup() {
		return sup;
	}


	public void setSup(JButton sup) {
		this.sup = sup;
	}


	public JButton getUlt() {
		return ult;
	}


	public void setUlt(JButton ult) {
		this.ult = ult;
	}


	public JPanel getBattlePanel() {
		return battlePanel;
	}


	public void setBattlePanel(JPanel battlePanel) {
		this.battlePanel = battlePanel;
	}


	public JProgressBar getFighterHP() {
		return fighterHP;
	}


	public void setFighterHP(JProgressBar fighterHP) {
		this.fighterHP = fighterHP;
	}


	public JProgressBar getFoeHP() {
		return foeHP;
	}


	public void setFoeHP(JProgressBar foeHP) {
		this.foeHP = foeHP;
	}


	public JButton getBlock() {
		return block;
	}


	public void setBlock(JButton block) {
		this.block = block;
	}


	public JButton getAttack() {
		return attack;
	}


	public void setAttack(JButton attack) {
		this.attack = attack;
	}


	public JButton getUse() {
		return use;
	}


	public void setUse(JButton use) {
		this.use = use;
	}


	public JButton getSpecial() {
		return special;
	}


	public void setSpecial(JButton special) {
		this.special = special;
	}


	public JPanel getFighterInfo() {
		return fighterInfo;
	}


	public void setFighterInfo(JPanel fighterInfo) {
		this.fighterInfo = fighterInfo;
	}


	public JPanel getFoeInfo() {
		return foeInfo;
	}


	public void setFoeInfo(JPanel foeInfo) {
		this.foeInfo = foeInfo;
	}


	public JProgressBar getFighterKi() {
		return fighterKi;
	}


	public void setFighterKi(JProgressBar fighterKi) {
		this.fighterKi = fighterKi;
	}


	public JButton getNextKey() {
		return NextKey;
	}


	public void setNextKey(JButton nextKey) {
		NextKey = nextKey;
	}


	public JButton getBoss() {
		return Boss;
	}


	public void setBoss(JButton boss) {
		Boss = boss;
	}


	public JButton getUseBut() {
		return useBut;
	}


	public void setUseBut(JButton useBut) {
		this.useBut = useBut;
	}


	public JPanel getSuperattacksbuttons() {
		return superattacksbuttons;
	}


	public void setSuperattacksbuttons(JPanel superattacksbuttons) {
		this.superattacksbuttons = superattacksbuttons;
	}


	public JPanel getUltimateattacksbuttons() {
		return ultimateattacksbuttons;
	}


	public void setUltimateattacksbuttons(JPanel ultimateattacksbuttons) {
		this.ultimateattacksbuttons = ultimateattacksbuttons;
	}


	public JButton getBackBut() {
		return backBut;
	}


	public void setBackBut(JButton backBut) {
		this.backBut = backBut;
	}


	public JLabel getLogs() {
		return logs;
	}


	public void setLogs(JLabel logs) {
		this.logs = logs;
	}


	public JButton getBlockBut() {
		return BlockBut;
	}


	public void setBlockBut(JButton blockBut) {
		BlockBut = blockBut;
	}


	public JLabel getExploredMaps() {
		return exploredMaps;
	}


	public void setExploredMaps(JLabel exploredMaps) {
		this.exploredMaps = exploredMaps;
	}

	public void setA(JLabel a) {
		this.a = a;
	}

	public void setB(JLabel b) {
		this.b = b;
	}

	public void setC(JLabel c) {
		this.c = c;
	}

	public void setD(JLabel d) {
		this.d = d;
	}

	public void setE(JLabel e) {
		this.e = e;
	}

	public void upgradeFighterButton() {
		upgradeFighterPanel.setBounds(0, 0, 1080, 720);
		upgradeFighterPanel.setLayout(null);

		ImageIcon backgroundIcon = new ImageIcon("Assets/upgradingfighter.jpg");
		Image backgroundImage = backgroundIcon.getImage();
		Image updatedBackgroundImage = backgroundImage.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		backgroundIcon = new ImageIcon(updatedBackgroundImage);

		backgroundUpgrade = new JLabel(backgroundIcon);
		backgroundUpgrade.setBounds(0, 0, 1080, 720);

		upgradeFighterButtonsPanel.setBounds(130, 200, 250, 250);
		upgradeFighterButtonsPanel.setLayout(new GridLayout(5, 1));

		upgradeFighterButtonsPanel.add(upgradeFighterButton1);
		upgradeFighterButton1.setText("Increase Max Health Points By 50");
		upgradeFighterButtonsPanel.add(upgradeFighterButton2);
		upgradeFighterButton2.setText("Increase Physical Damage by 50 points.");
		upgradeFighterButtonsPanel.add(upgradeFighterButton3);
		upgradeFighterButton3.setText(" Increase Blast Damage by 50 points");
		upgradeFighterButtonsPanel.add(upgradeFighterButton4);
		upgradeFighterButton4.setText("Increase Max Ki by one bar");
		upgradeFighterButtonsPanel.add(upgradeFighterButton5);
		upgradeFighterButton5.setText("Increase Max Stamina by one bar");
		upgradeFighterButtonsPanel.setOpaque(false);

		b6666 = new JButton();
		b6666.setBounds(100, 480, continueIcon.getIconWidth(), continueIcon.getIconHeight());
		b6666.setIcon(continueIcon);
		b6666.setBorderPainted(false);
		b6666.setBorder(BorderFactory.createEmptyBorder());
		b6666.setContentAreaFilled(false);

		abilityPointsCounter = new JLabel();
		Font font1 = new Font("Courier", Font.BOLD, 30);
		abilityPointsCounter.setBounds(335, 385, 250, 250);
		abilityPointsCounter.setFont(font1);

		upgradeFighterPanel.add(abilityPointsCounter);
		upgradeFighterPanel.add(b6666);
		upgradeFighterPanel.add(upgradeFighterButtonsPanel);
		upgradeFighterPanel.add(backgroundUpgrade);

		aa.setBounds(760, 100, CharacterIcon.getIconWidth(), CharacterIcon.getIconHeight());
		aa.setIcon(CharacterIcon);

		bb.setBounds(760, 100, CharacterIcon2.getIconWidth(), CharacterIcon2.getIconHeight());
		bb.setIcon(CharacterIcon2);

		cc.setBounds(760, 100, CharacterIcon3.getIconWidth(), CharacterIcon3.getIconHeight());
		cc.setIcon(CharacterIcon3);

		dd.setBounds(760, 100, CharacterIcon4.getIconWidth(), CharacterIcon4.getIconHeight());
		dd.setIcon(CharacterIcon4);

		ee.setBounds(760, 100, CharacterIcon5.getIconWidth(), CharacterIcon5.getIconHeight());
		ee.setIcon(CharacterIcon5);

		// aa.setVisible(false);
		// bb.setVisible(false);
		// cc.setVisible(false);
		// dd.setVisible(false);
		// ee.setVisible(false);

		getContentPane().add(upgradeFighterPanel);

		this.validate();
		this.setVisible(true);

	}



	public JLabel getAbilityPointsCounter() {
		return abilityPointsCounter;
	}

	public void setAbilityPointsCounter(JLabel abilityPointsCounter) {
		this.abilityPointsCounter = abilityPointsCounter;
	}

	public JPanel getStatspanel() {
		return statspanel;
	}

	public void setStatspanel(JPanel statspanel) {
		this.statspanel = statspanel;
	}

	public JPanel getCreateFighterPanel() {
		return createFighterPanel;
	}

	public void setCreateFighterPanel(JPanel createFighterPanel) {
		this.createFighterPanel = createFighterPanel;
	}




	public JButton getB7() {
		return b7;
	}

	public void setB7(JButton b7) {
		this.b7 = b7;
	}

	public JButton getB8() {
		return b8;
	}

	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	public JButton getB9() {
		return b9;
	}

	public void setB9(JButton b9) {
		this.b9 = b9;
	}

	public JButton getB10() {
		return b10;
	}

	public void setB10(JButton b10) {
		this.b10 = b10;
	}

	public JButton getB11() {
		return b11;
	}

	public void setB11(JButton b11) {
		this.b11 = b11;
	}

	public JButton getSelectedButton() {
		return selectedButton;
	}

	public void setSelectedButton(JButton selectedButton) {
		this.selectedButton = selectedButton;
	}

	public ImageIcon getEarthlingIcon() {
		return earthlingIcon;
	}

	public void setEarthlingIcon(ImageIcon earthlingIcon) {
		this.earthlingIcon = earthlingIcon;
	}

	public ImageIcon getMajinIcon() {
		return majinIcon;
	}

	public void setMajinIcon(ImageIcon majinIcon) {
		this.majinIcon = majinIcon;
	}

	public ImageIcon getNamekianIcon() {
		return namekianIcon;
	}

	public void setNamekianIcon(ImageIcon namekianIcon) {
		this.namekianIcon = namekianIcon;
	}

	public ImageIcon getFriezaIcon() {
		return friezaIcon;
	}

	public void setFriezaIcon(ImageIcon friezaIcon) {
		this.friezaIcon = friezaIcon;
	}

	public ImageIcon getPlusIcon() {
		return plusIcon;
	}

	public void setPlusIcon(ImageIcon plusIcon) {
		this.plusIcon = plusIcon;
	}

	public JProgressBar getFighterStaminaBar() {
		return FighterStaminaBar;
	}

	public void setFighterStaminaBar(JProgressBar fighterStaminaBar) {
		FighterStaminaBar = fighterStaminaBar;
	}

	public JProgressBar getFighterKiBar() {
		return FighterKiBar;
	}

	public void setFighterKiBar(JProgressBar fighterKiBar) {
		FighterKiBar = fighterKiBar;
	}

	public JProgressBar getFighterXpBar() {
		return FighterXpBar;
	}

	public void setFighterXpBar(JProgressBar fighterXpBar) {
		FighterXpBar = fighterXpBar;
	}

	public JProgressBar getFighterStats() {
		return FighterStats;
	}

	public void setFighterStats(JProgressBar fighterStats) {
		FighterStats = fighterStats;
	}

	public JProgressBar getFighterStats2() {
		return FighterStats2;
	}

	public void setFighterStats2(JProgressBar fighterStats2) {
		FighterStats2 = fighterStats2;
	}

	public JProgressBar getFighterStats3() {
		return FighterStats3;
	}

	public void setFighterStats3(JProgressBar fighterStats3) {
		FighterStats3 = fighterStats3;
	}

	public JLabel getAa() {
		return aa;
	}

	public void setAa(JLabel aa) {
		this.aa = aa;
	}

	public JLabel getBb() {
		return bb;
	}

	public void setBb(JLabel bb) {
		this.bb = bb;
	}

	public JLabel getCc() {
		return cc;
	}

	public void setCc(JLabel cc) {
		this.cc = cc;
	}

	public JLabel getDd() {
		return dd;
	}

	public void setDd(JLabel dd) {
		this.dd = dd;
	}

	public JLabel getEe() {
		return ee;
	}

	public void setEe(JLabel ee) {
		this.ee = ee;
	}

	public int getIi() {
		return ii;
	}

	public void setIi(int ii) {
		this.ii = ii;
	}


	public JPanel getIntrostats() {
		return introstats;
	}

	public void setIntrostats(JPanel introstats) {
		this.introstats = introstats;
	}

	public JPanel getUpgradeFighterPanel() {
		return upgradeFighterPanel;
	}

	public void setUpgradeFighterPanel(JPanel upgradeFighterPanel) {
		this.upgradeFighterPanel = upgradeFighterPanel;
	}

	public JPanel getUpgradeFighterButtonsPanel() {
		return upgradeFighterButtonsPanel;
	}

	public void setUpgradeFighterButtonsPanel(JPanel upgradeFighterButtonsPanel) {
		this.upgradeFighterButtonsPanel = upgradeFighterButtonsPanel;
	}

	public JButton getUpgradeFighterButton1() {
		return upgradeFighterButton1;
	}

	public void setUpgradeFighterButton1(JButton upgradeFighterButton1) {
		this.upgradeFighterButton1 = upgradeFighterButton1;
	}

	public JButton getUpgradeFighterButton2() {
		return upgradeFighterButton2;
	}

	public void setUpgradeFighterButton2(JButton upgradeFighterButton2) {
		this.upgradeFighterButton2 = upgradeFighterButton2;
	}

	public JButton getUpgradeFighterButton3() {
		return upgradeFighterButton3;
	}

	public void setUpgradeFighterButton3(JButton upgradeFighterButton3) {
		this.upgradeFighterButton3 = upgradeFighterButton3;
	}

	public JButton getUpgradeFighterButton4() {
		return upgradeFighterButton4;
	}

	public void setUpgradeFighterButton4(JButton upgradeFighterButton4) {
		this.upgradeFighterButton4 = upgradeFighterButton4;
	}

	public JButton getUpgradeFighterButton5() {
		return upgradeFighterButton5;
	}

	public void setUpgradeFighterButton5(JButton upgradeFighterButton5) {
		this.upgradeFighterButton5 = upgradeFighterButton5;
	}

	public JButton getB6666() {
		return b6666;
	}

	public JButton getB666() {
		return b666;
	}

	public void setB666(JButton b666) {
		this.b666 = b666;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public JLabel getBackgroundUpgrade() {
		return backgroundUpgrade;
	}

	public void setBackgroundUpgrade(JLabel backgroundUpgrade) {
		this.backgroundUpgrade = backgroundUpgrade;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	public ImageIcon getSaiyanIcon() {
		return saiyanIcon;
	}

	public void setSaiyanIcon(ImageIcon saiyanIcon) {
		this.saiyanIcon = saiyanIcon;
	}

	public JTextField getTextField3() {
		return textField3;
	}

	public void setTextField3(JTextField textField3) {
		this.textField3 = textField3;
	}

	public JButton getB44() {
		return b44;
	}

	public void setB44(JButton b44) {
		this.b44 = b44;
	}

	public JButton getB55() {
		return b55;
	}

	public void setB55(JButton b55) {
		this.b55 = b55;
	}


	public void setB6666(JButton b6666) {
		this.b6666 = b6666;
	}

	public JPanel getAssignAttacksPanel() {
		return assignAttacksPanel;
	}

	public void setAssignAttacksPanel(JPanel assignAttacksPanel) {
		this.assignAttacksPanel = assignAttacksPanel;
	}

	public JPanel getAssignAttacksButtonsPanel() {
		return assignAttacksButtonsPanel;
	}

	public void setAssignAttacksButtonsPanel(JPanel assignAttacksButtonsPanel) {
		this.assignAttacksButtonsPanel = assignAttacksButtonsPanel;
	}

	public JPanel getAssignAttacksButtonsPanel2() {
		return assignAttacksButtonsPanel2;
	}

	public void setAssignAttacksButtonsPanel2(JPanel assignAttacksButtonsPanel2) {
		this.assignAttacksButtonsPanel2 = assignAttacksButtonsPanel2;
	}

	public JButton getB66() {
		return b66;
	}

	public void setB66(JButton b66) {
		this.b66 = b66;
	}

	public void createFighterButton() {
		createFighterPanel.setBounds(0, 0, 1080, 720);
		createFighterPanel.setLayout(null);
		getContentPane().add(createFighterPanel);

		Font font1 = new Font("Courier", Font.BOLD, 20);

		ImageIcon backgroundIcon = new ImageIcon("Assets/creatingfighter.jpg");
		Image backgroundImage = backgroundIcon.getImage();
		Image updatedBackgroundImage = backgroundImage.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		backgroundIcon = new ImageIcon(updatedBackgroundImage);

		JLabel background = new JLabel(backgroundIcon);
		background.setBounds(0, 0, 1080, 720);

		a.setBounds(760, 100, CharacterIcon.getIconWidth(), CharacterIcon.getIconHeight());
		a.setIcon(CharacterIcon);

		b.setBounds(760, 100, CharacterIcon2.getIconWidth(), CharacterIcon2.getIconHeight());
		b.setIcon(CharacterIcon2);

		c.setBounds(760, 100, CharacterIcon3.getIconWidth(), CharacterIcon3.getIconHeight());
		c.setIcon(CharacterIcon3);

		d.setBounds(760, 100, CharacterIcon4.getIconWidth(), CharacterIcon4.getIconHeight());
		d.setIcon(CharacterIcon4);

		e.setBounds(760, 100, CharacterIcon5.getIconWidth(), CharacterIcon5.getIconHeight());
		e.setIcon(CharacterIcon5);

		a.setVisible(true);
		b.setVisible(false);
		c.setVisible(false);
		d.setVisible(false);
		e.setVisible(false);

		b44 = new JButton();
		b44.setBounds(260, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b44.setIcon(nextIcon);
		b44.setBorderPainted(false);
		b44.setBorder(BorderFactory.createEmptyBorder());
		b44.setContentAreaFilled(false);

		b55 = new JButton();
		b55.setBounds(200, 450, nextIcon.getIconWidth(), nextIcon.getIconHeight());
		b55.setIcon(prevIcon);
		b55.setBorderPainted(false);
		b55.setBorder(BorderFactory.createEmptyBorder());
		b55.setContentAreaFilled(false);

		b66 = new JButton();
		b66.setBounds(100, 480, continueIcon.getIconWidth(), continueIcon.getIconHeight());
		b66.setIcon(continueIcon);
		b66.setBorderPainted(false);
		b66.setBorder(BorderFactory.createEmptyBorder());
		b66.setContentAreaFilled(false);

		textField3.setBounds(171, 172, 195, 45);
		textField3.setFont(font1);
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setBackground(Color.DARK_GRAY);
		textField3.setBorder(BorderFactory.createEmptyBorder());
		textField3.setForeground(Color.ORANGE);

		createFighterPanel.add(introstats);
		createFighterPanel.add(a);
		createFighterPanel.add(b);
		createFighterPanel.add(c);
		createFighterPanel.add(d);
		createFighterPanel.add(e);
		createFighterPanel.add(textField3);
		createFighterPanel.add(b44);
		createFighterPanel.add(b55);
		createFighterPanel.add(b66);
		createFighterPanel.add(background);

		this.validate();
		this.setVisible(true);
	}

	public void switchFighterButton() {
		switchFighterPanel.setBounds(0, 0, 1080, 720);
		switchFighterPanel.setLayout(null);
		getContentPane().add(switchFighterPanel);

		// getContentPane().setBackground(Color.white);

		imageIcon = new ImageIcon("Assets/switchingfighter.jpg");
		Image image = imageIcon.getImage();
		Image updatedImage = image.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(updatedImage);

		// JLabel background = new JLabel(imageIcon);
		// background.setBounds(0, 0, 1080, 720);

		saiyanIcon = new ImageIcon("Assets/Saiyan.png");
		Image saiyan = saiyanIcon.getImage();
		Image updatedSaiyan = saiyan.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		saiyanIcon = new ImageIcon(updatedSaiyan);

		majinIcon = new ImageIcon("Assets/Majin.png");
		Image majin = majinIcon.getImage();
		Image updatedMajin = majin.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		majinIcon = new ImageIcon(updatedMajin);

		friezaIcon = new ImageIcon("Assets/Frieza.png");
		Image frieza = friezaIcon.getImage();
		Image updatedFrieza = frieza.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		friezaIcon = new ImageIcon(updatedFrieza);

		namekianIcon = new ImageIcon("Assets/Namekian.png");
		Image namekian = namekianIcon.getImage();
		Image updatedNamekian = namekian.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		namekianIcon = new ImageIcon(updatedNamekian);

		earthlingIcon = new ImageIcon("Assets/Earthling.png");
		Image earthling = earthlingIcon.getImage();
		Image updatedEarthling = earthling.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		earthlingIcon = new ImageIcon(updatedEarthling);

		plusIcon = new ImageIcon("Assets/Plus.png");
		Image plus = plusIcon.getImage();
		Image updatedPlus = plus.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		plusIcon = new ImageIcon(updatedPlus);

		b666 = new JButton();
		b666.setBounds(100, 480, continueIcon.getIconWidth(), continueIcon.getIconHeight());
		b666.setIcon(continueIcon);
		b666.setBorderPainted(false);
		b666.setBorder(BorderFactory.createEmptyBorder());
		b666.setContentAreaFilled(false);

		aa.setBounds(760, 100, CharacterIcon.getIconWidth(), CharacterIcon.getIconHeight());
		aa.setIcon(CharacterIcon);

		bb.setBounds(760, 100, CharacterIcon2.getIconWidth(), CharacterIcon2.getIconHeight());
		bb.setIcon(CharacterIcon2);

		cc.setBounds(760, 100, CharacterIcon3.getIconWidth(), CharacterIcon3.getIconHeight());
		cc.setIcon(CharacterIcon3);

		dd.setBounds(760, 100, CharacterIcon4.getIconWidth(), CharacterIcon4.getIconHeight());
		dd.setIcon(CharacterIcon4);

		ee.setBounds(760, 100, CharacterIcon5.getIconWidth(), CharacterIcon5.getIconHeight());
		ee.setIcon(CharacterIcon5);

		aa.setVisible(true);

		switchFighterPanel.add(b666);

		this.validate();
		this.setVisible(true);

	}

	public JPanel getExitPanel() {
		return exitPanel;
	}

	public void setExitPanel(JPanel exitPanel) {
		this.exitPanel = exitPanel;
	}

	public JButton getB66666() {
		return b66666;
	}

	public void setB66666(JButton b66666) {
		this.b66666 = b66666;
	}

	public JButton getbCurrentSuperAttacks() {
		return bCurrentSuperAttacks;
	}

	public void setbCurrentSuperAttacks(JButton bCurrentSuperAttacks) {
		this.bCurrentSuperAttacks = bCurrentSuperAttacks;
	}

	public JButton getbCurrentUltimateAttacks() {
		return bCurrentUltimateAttacks;
	}

	public void setbCurrentUltimateAttacks(JButton bCurrentUltimateAttacks) {
		this.bCurrentUltimateAttacks = bCurrentUltimateAttacks;
	}


	public void assignAttacksButtons() {
		assignAttacksPanel.setBounds(0, 0, 1080, 720);
		assignAttacksPanel.setLayout(null);
		getContentPane().add(assignAttacksPanel);

		assignIcon = new ImageIcon("Assets/assignattacks2.jpg");
		Image assign = assignIcon.getImage();
		Image updatedassign = assign.getScaledInstance(1080, 720, java.awt.Image.SCALE_SMOOTH);
		assignIcon = new ImageIcon(updatedassign);

		JLabel x = new JLabel();
		x.setSize(1080, 720);
		x.setBounds(0, 0, x.getWidth(), x.getHeight());
		x.setIcon(assignIcon);

		assignAttacksButtonsPanel.setLayout(new GridLayout(10, 10));
		assignAttacksButtonsPanel.setBounds(25, 80, 300, 500);
		assignAttacksButtonsPanel2.setLayout(new GridLayout(10, 10));
		assignAttacksButtonsPanel2.setBounds(375, 80, 300, 500);
		assignAttacksPanel.add(assignAttacksButtonsPanel);
		assignAttacksPanel.add(assignAttacksButtonsPanel2);

		b66666 = new JButton();
		b66666.setBounds(120, 510, continueIcon.getIconWidth(), continueIcon.getIconHeight());
		b66666.setIcon(continueIcon);
		b66666.setBorderPainted(false);
		b66666.setBorder(BorderFactory.createEmptyBorder());
		b66666.setContentAreaFilled(false);
		assignAttacksPanel.add(b66666);

		bCurrentSuperAttacks = new JButton();
		bCurrentSuperAttacks.setBounds(700, 400, 300, 50);
		bCurrentSuperAttacks.setText("Current Super Attacks");

		bCurrentUltimateAttacks = new JButton();
		bCurrentUltimateAttacks.setBounds(700, 470, 300, 50);
		bCurrentUltimateAttacks.setText("Current Ultimate Attacks");

		assignAttacksPanel.add(bCurrentSuperAttacks);
		assignAttacksPanel.add(bCurrentUltimateAttacks);

		assignAttacksButtonsPanel.setOpaque(false);
		assignAttacksButtonsPanel2.setOpaque(false);
		assignAttacksPanel.add(x);

		this.validate();
		this.setVisible(true);
	}

	public ImageIcon getDirtIcon() {
		return dirtIcon;
	}

	public void setDirtIcon(ImageIcon dirtIcon) {
		this.dirtIcon = dirtIcon;
	}

	public ImageIcon getGrassIcon() {
		return grassIcon;
	}

	public void setGrassIcon(ImageIcon grassIcon) {
		this.grassIcon = grassIcon;
	}

	public JPanel getPlayerstats() {
		return playerstats;
	}

	public void setPlayerstats(JPanel playerstats) {
		this.playerstats = playerstats;
	}

	public JPanel getFighterstats() {
		return fighterstats;
	}

	public void setFighterstats(JPanel fighterstats) {
		this.fighterstats = fighterstats;
	}

	public JPanel getButtonstats() {
		return buttonstats;
	}

	public void setButtonstats(JPanel buttonstats) {
		this.buttonstats = buttonstats;
	}

	public JPanel getBackstats() {
		return backstats;
	}

	public void setBackstats(JPanel backstats) {
		this.backstats = backstats;
	}

}
