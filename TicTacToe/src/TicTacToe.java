

import javax.swing.JOptionPane;

public class TicTacToe
{
	public static void main( String[] args )
	{
		boolean gameNotOver = true;
		int computerChoice = 0;
		String cell1 = "1", cell2 = "2", cell3 = "3", cell4 = "4", cell5 = "5";
		String cell6 = "6", cell7 = "7", cell8 = "8", cell9 = "9";
		JOptionPane.showMessageDialog( null, "Welcome to the Tic-Tac-Toe game!" );
		
		do {
			boolean invalidMove = false;
			do {			
					String gameBoard = "------------------\n|  " + cell1 + "  |  " + cell2 + "  |  " + cell3 + "  |\n" +
										"------------------\n|  " + cell4 + "  |  " + cell5 + "  |  " + cell6 + "  |\n" +
										"------------------\n|  " + cell7 + "  |  " + cell8 + "  |  " + cell9 + "  |\n" +
										"------------------\n\nWhere would you like to play your move?";
					String playerMove = JOptionPane.showInputDialog( null, gameBoard );
					
					switch( Integer.parseInt(playerMove) )
					{
					case 1:
						if ((cell1.equals("X")) || cell1.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell1 = "X";
							invalidMove = false;
						}
						break;
					case 2:
						if ((cell2.equals("X")) || cell2.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell2 = "X";
							invalidMove = false;
						}
						break;
					case 3:
						if ((cell3.equals("X")) || cell3.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell3 = "X";
							invalidMove = false;
						}
						break;
					case 4:
						if ((cell4.equals("X")) || cell4.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell4 = "X";
							invalidMove = false;
						}
						break;
					case 5:
						if ((cell5.equals("X")) || cell5.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell5 = "X";
							invalidMove = false;
						}
						break;
					case 6:
						if ((cell6.equals("X")) || cell6.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell6 = "X";
							invalidMove = false;
						}
						break;
					case 7:
						if ((cell7.equals("X")) || cell7.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell7 = "X";
							invalidMove = false;
						}
						break;
					case 8:
						if ((cell8.equals("X")) || cell8.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell8 = "X";
							invalidMove = false;
						}
						break;
					case 9:
						if ((cell9.equals("X")) || cell9.equals("O"))
						{
							JOptionPane.showMessageDialog( null, "That space is already taken!");
							invalidMove = true;
						}
						else
						{
							cell9 = "X";
							invalidMove = false;
						}
						break;
					default:
						JOptionPane.showMessageDialog( null, "You didn't select a number between 1 and 9!" );
						invalidMove = true;
						break;
					}
				} while (invalidMove);
			
				if ( (cell1.equals("X")) && (cell2.equals("X")) && (cell3.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell4.equals("X")) && (cell5.equals("X")) && (cell6.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell7.equals("X")) && (cell8.equals("X")) && (cell9.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell1.equals("X")) && (cell4.equals("X")) && (cell7.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell2.equals("X")) && (cell5.equals("X")) && (cell8.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell3.equals("X")) && (cell6.equals("X")) && (cell9.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell1.equals("X")) && (cell5.equals("X")) && (cell9.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( (cell3.equals("X")) && (cell5.equals("X")) && (cell7.equals("X")) )
				{
					JOptionPane.showMessageDialog( null, "You Win!" );
					gameNotOver = false; 
				}
				if ( ((cell1.equals("X")) || (cell1.equals ("O"))) && ((cell2.equals("X")) || (cell2.equals ("O")))
						&& ((cell3.equals("X")) || (cell3.equals ("O"))) && ((cell4.equals("X")) || (cell4.equals ("O")))
						&& ((cell5.equals("X")) || (cell5.equals ("O"))) && ((cell6.equals("X")) || (cell6.equals ("O")))
						&& ((cell7.equals("X")) || (cell7.equals ("O"))) && ((cell8.equals("X")) || (cell8.equals ("O")))
						&& ((cell9.equals("X")) || (cell9.equals ("O"))) && (gameNotOver) )
				{
					JOptionPane.showMessageDialog( null, "Cat's game!  Nobody wins." );
					gameNotOver = false;
				}
				if (gameNotOver)
				{
					invalidMove = false;
					do {			
		
							computerChoice = 1 + (int)(Math.random()* 9);
					
							switch( computerChoice )
							{
							case 1:
								if ((cell1.equals("X")) || cell1.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell1 = "O";
									invalidMove = false;
								}
								break;
							case 2:
								if ((cell2.equals("X")) || cell2.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell2 = "O";
									invalidMove = false;
								}
								break;
							case 3:
								if ((cell3.equals("X")) || cell3.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell3 = "O";
									invalidMove = false;
								}
								break;
							case 4:
								if ((cell4.equals("X")) || cell4.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell4 = "O";
									invalidMove = false;
								}
								break;
							case 5:
								if ((cell5.equals("X")) || cell5.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell5 = "O";
									invalidMove = false;
								}
								break;
							case 6:
								if ((cell6.equals("X")) || cell6.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell6 = "O";
									invalidMove = false;
								}
								break;
							case 7:
								if ((cell7.equals("X")) || cell7.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell7 = "O";
									invalidMove = false;
								}
								break;
							case 8:
								if ((cell8.equals("X")) || cell8.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell8 = "O";
									invalidMove = false;
								}
								break;
							case 9:
								if ((cell9.equals("X")) || cell9.equals("O"))
								{
									invalidMove = true;
								}
								else
								{
									cell9 = "O";
									invalidMove = false;
								}
								break;
							default:
								invalidMove = true;
								break;
							}
						} while (invalidMove);
					
					String gameBoard = "------------------\n|  " + cell1 + "  |  " + cell2 + "  |  " + cell3 + "  |\n" +
					"------------------\n|  " + cell4 + "  |  " + cell5 + "  |  " + cell6 + "  |\n" +
					"------------------\n|  " + cell7 + "  |  " + cell8 + "  |  " + cell9 + "  |\n" +
					"The computer chose space " + computerChoice + ".";
					JOptionPane.showMessageDialog( null, gameBoard );
					
						if ( (cell1.equals("O")) && (cell2.equals("O")) && (cell3.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell4.equals("O")) && (cell5.equals("O")) && (cell6.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell7.equals("O")) && (cell8.equals("O")) && (cell9.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell1.equals("O")) && (cell4.equals("O")) && (cell7.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell2.equals("O")) && (cell5.equals("O")) && (cell8.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell3.equals("O")) && (cell6.equals("O")) && (cell9.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell1.equals("O")) && (cell5.equals("O")) && (cell9.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( (cell3.equals("O")) && (cell5.equals("O")) && (cell7.equals("O")) )
						{
							JOptionPane.showMessageDialog( null, "The Computer Wins." );
							gameNotOver = false; 
						}
						if ( ((cell1.equals("X")) || (cell1.equals ("O"))) && ((cell2.equals("X")) || (cell2.equals ("O")))
								&& ((cell3.equals("X")) || (cell3.equals ("O"))) && ((cell4.equals("X")) || (cell4.equals ("O")))
								&& ((cell5.equals("X")) || (cell5.equals ("O"))) && ((cell6.equals("X")) || (cell6.equals ("O")))
								&& ((cell7.equals("X")) || (cell7.equals ("O"))) && ((cell8.equals("X")) || (cell8.equals ("O")))
								&& ((cell9.equals("X")) || (cell9.equals ("O"))) && (gameNotOver) )
						{
							JOptionPane.showMessageDialog( null, "Cat's game!  Nobody wins." );
							gameNotOver = false;
						}
				}
			
		} while (gameNotOver);		
	} // end main
}// end class TicTacToe
