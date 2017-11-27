import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BattleshipProject extends JPanel {
	static JFrame window;

	static JPanel board;
	JPanel[][] JPanelArray = new JPanel[7][7];
	JButton[][] JButtonArray = new JButton[7][7];
	int cellArray[][] = new int[7][7];
	int rowCount, colCount;

	static JPanel topScreen;
	static JButton newGame;
	static JLabel introGame;

	static JLabel countShots, bestScore, message;
	static JPanel botScreen;
	static int counter = 0;
	static int bestCount = 20;
	static int placement = 0;
	static int j = 0;
	static int k = 0;
	static int x;
	static int y;

	public BattleshipProject() {

		board = new JPanel();
		board.setMinimumSize(new Dimension(400, 400));
		board.setLayout(new GridLayout(7, 7));
		createBoard();

	}

	public void createBoard() {

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				cellArray[rowCount][colCount] = 0;
			}
		}
		shipDirection();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(cellArray[i][j] + "");

			}
			System.out.println("");
		}
		for (int rowCount = 0; rowCount < 7; rowCount++) {
			for (int colCount = 0; colCount < 7; colCount++) {

				JPanelArray[rowCount][colCount] = new JPanel();
				/*	
					public void paintComponent(Graphics g) {
						super.paintComponent(g);
						for (int y = 0; y < 7; y++) {
							for (int z = 0; z < 7; z++) {
								if (cellArray[y][z] == 1) {
									g.setColor(Color.red);
									g.drawLine(25, 15, 35, 25);
									g.drawLine(25, 25, 35, 15);
								} else {
									g.setColor(Color.blue);
									g.drawOval(25, 15, 15, 15);
								}

							}
						}
					}
				};  */
				JPanelArray[rowCount][colCount].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JPanelArray[rowCount][colCount].setSize(new Dimension(70, 70));
				JPanelArray[rowCount][colCount].setBackground(new Color(135, 206, 250));
				

				JButtonArray[rowCount][colCount] = new JButton("?");

				JButtonArray[rowCount][colCount].addActionListener(new BoardListener());

				JButtonArray[rowCount][colCount].setSize(new Dimension(70, 70));
				JPanelArray[rowCount][colCount].add(JButtonArray[rowCount][colCount]);
				board.add(JPanelArray[rowCount][colCount]);

			}

		}

	}

	public void randomShip() {
		// TODO Auto-generated method stub

		shipDirection();
	}

	public void shipDirection() {
		// TODO Auto-generated method stub
		boolean check = false;
		boolean boat1 = false;
		boolean boat2 = false;
		boolean boat3 = false;
		int randomDir;
		int randomPointX, randomPointY;
		int x;
		int y;

		randomPointX = (int) (Math.random() * 7);
		randomPointY = (int) (Math.random() * 7);

		x = randomPointX;
		y = randomPointY;
		System.out.println("" + x + "" + y);
		cellArray[x][y] = 1;

		randomDir = (int) (Math.random() * 2);
		randomPointX = (int) (Math.random() * 5);
		randomPointY = (int) (Math.random() * 5);
		x = randomPointX;
		y = randomPointY;

		while (check == false) {

			System.out.println("" + x + "" + y);

			if (cellArray[x][y] != 1 && cellArray[x + 1][y] != 1 && cellArray[x][y + 1] != 1) {
				if (randomDir == 0) {
					// will be horizontal

					cellArray[x][y] = 1;
					cellArray[x][y + 1] = 1;
					System.out.println(" " + cellArray[x][y]);
					check = true;
				} else if (randomDir == 1) {
					cellArray[x][y] = 1;
					cellArray[x + 1][y] = 1;

					check = true;
					// will be vertical
				}
			} else {
				randomPointX = (int) (Math.random() * 5);
				randomPointY = (int) (Math.random() * 5);
				x = randomPointX;
				y = randomPointY;

			}
		}

		randomDir = (int) (Math.random() * 2);
		randomPointX = (int) (Math.random() * 4);
		randomPointY = (int) (Math.random() * 4);
		x = randomPointX;
		y = randomPointY;

		while (check == true) {

			if (cellArray[x][y] != 1 && cellArray[x + 1][y] != 1 && cellArray[x + 2][y] != 1 && cellArray[x][y + 1] != 1
					&& cellArray[x][y + 2] != 1) {

				if (randomDir == 0) {
					// will be horizontal

					cellArray[x][y] = 1;
					cellArray[x][y + 1] = 1;
					cellArray[x][y + 2] = 1;
					System.out.println(" " + cellArray[x][y]);
					check = false;
				} else if (randomDir == 1) {
					// will be vertical
					cellArray[x][y] = 1;
					cellArray[x + 1][y] = 1;
					cellArray[x + 2][y] = 1;
					check = false;
						
					
				}
			} else {
				randomPointX = (int) (Math.random() * 5);
				randomPointY = (int) (Math.random() * 5);
				x = randomPointX;
				y = randomPointY;
			}
		}

	}

	public static void gameIntro() {
		// TODO Auto-generated method stub
		topScreen = new JPanel();
		introGame = new JLabel("Welcome to Battleship");
		introGame.setFont(new Font("Arial", Font.PLAIN, 30));
		//newGame = new JButton("New Game");
		//newGame.setBounds(new Rectangle(20, 50));
		topScreen.add(introGame);
		//topScreen.add(newGame);

	}

	class BoardListener implements ActionListener { // for jbuttons

		@Override
		public void actionPerformed(ActionEvent e) {

			Toolkit.getDefaultToolkit().beep();

	

			
				for (int i = 0; i < 7; i++) {
					for (int j = 0; j < 7; j++) {
						if (e.getSource() == JButtonArray[i][j]) {
							JButtonArray[i][j].setVisible(false);
							counter += 1;
							countShots.setText("Shots Taken: " + counter);
							
							if (cellArray[i][j] == 1) {
								for (int rowCount = 0; rowCount < 7; rowCount++) {
									for (int colCount = 0; colCount < 7; colCount++) {

										JPanelArray[rowCount][colCount] = new JPanel(){
											
											public void paintComponent(Graphics g) {
												super.paintComponent(g);
												for (int y = 0; y < 7; y++) {
													for (int z = 0; z < 7; z++) {
														if (cellArray[y][z] == 1) {
															g.setColor(Color.red);
															g.drawLine(25, 15, 35, 25);
															g.drawLine(25, 25, 35, 15);
														} else {
															g.setColor(Color.blue);
															g.drawOval(25, 15, 15, 15);
														}

													}
												}
											}
										};

						
					}
						
				}
			}
							else{
								JPanelArray[rowCount][colCount] = new JPanel(){
									
									public void paintComponent(Graphics g) {
										super.paintComponent(g);
										for (int y = 0; y < 7; y++) {
											for (int z = 0; z < 7; z++) {
												if (cellArray[y][z] == 1) {
													g.setColor(Color.red);
													g.drawLine(25, 15, 35, 25);
													g.drawLine(25, 25, 35, 15);
												} else {
													g.setColor(Color.blue);
													g.drawOval(25, 15, 15, 15);
												}

											}
										}
									}
								};
							
		}}}}
	}
}
	public static void scoresBot() {
		// TODO Auto-generated method stub
		botScreen = new JPanel();

		countShots = new JLabel("Shots Taken: " + counter);
		bestScore = new JLabel("Best score: " + bestCount);
		botScreen.add(countShots);

		botScreen.add(bestScore);
	}
	public static void resetGame(){
		gameIntro();
		new BattleshipProject();
		scoresBot();
		
		counter = 0;
		countShots = new JLabel("Shots Taken: " + counter);
	}

	public static void main(String[] args) {


		window = new JFrame();
		window.setMinimumSize(new Dimension(450, 400));
		// window.setMaximumSize(new Dimension(410,410));
		window.setLayout(new BorderLayout());
		gameIntro();
		new BattleshipProject();
		scoresBot();
		window.add(topScreen, BorderLayout.NORTH);
		window.add(board, BorderLayout.CENTER);
		window.add(botScreen, BorderLayout.SOUTH);

		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
