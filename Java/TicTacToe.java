 public class TicTacToe{
   public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      int gamestate=0; //0=Main Menu, 1 = Game in Progress, 2 = Game Ended, 3==Quit
      int input, player=1;
      char p1 = '1',p2 = '2',p3 = '3',p4 ='4',p5 = '5',p6 = '6',p7 = '7',p8 = '8',p9 = '9', winner = '?';
      while(gamestate==0)
      {
          System.out.print("\f\n1. Play\n2. Info\n3. Quit\n");
          input = s.nextInt();
          if(input == 1)
          {
              gamestate=1;
          }
          else if(input == 2)
          {
              System.out.print("This was made because I was bored.");
          }
          else if(input == 3)
          {
              gamestate=3;
          }
          else
          {
              continue;
          }
      }
      while(gamestate==1)
      {
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p1 + "  |  " + p2 + "  |  " + p3 + "  ");
          System.out.print("\n_____|_____|_____");
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p4 + "  |  " + p5 + "  |  " + p6 + "  ");
          System.out.print("\n_____|_____|_____");
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p7 + "  |  " + p8 + "  |  " + p9 + "  ");
          System.out.print("\n     |     |     ");
           if(p1 != '1' && p2 != '2' && p3 != '3' && p4 != '4' && p5 != '5' && p6 != '6' && p7 != '7' && p8 != '8' && p9 != '9')
          {
              winner = '?';
              gamestate = 2;
              break;
          }
          if(p1 == p2 && p2 == p3)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
           if(p4 == p5 && p5 == p6)
          {
              winner = p4;
              gamestate = 2;
              break;
          }
            if(p7 == p8 && p8 == p9)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
            if(p1 == p5 && p5 == p9)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
            if(p3==p5 && p5 == p7)
            {
              winner = p1;
              gamestate = 2;
              break;
            }
          while(player==1 && gamestate == 1)
          {
              System.out.print("\n O's turn.\n");
              input = s.nextInt();
              if(input>=1 && input <=9)
              {
                  if(input == 1)
                  {
                      if(p1 == '1')
                      {
                          p1 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 2)
                  {
                      if(p2 == '2')
                      {
                          p2 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 3)
                  {
                      if(p3 == '3')
                      {
                          p3 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 4)
                  {
                      if(p4 == '4')
                      {
                          p4 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 5)
                  {
                      if(p5 == '5')
                      {
                          p5 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 6)
                  {
                      if(p6 == '6')
                      {
                          p6 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 7)
                  {
                      if(p7 == '7')
                      {
                          p7 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 8)
                  {
                      if(p8 == '8')
                      {
                          p8 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 9)
                  {
                      if(p9 == '9')
                      {
                          p9 = 'O';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
              }
              else
              {
              System.out.print("\nInvalid Move");
              continue;
              }
          }
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p1 + "  |  " + p2 + "  |  " + p3 + "  ");
          System.out.print("\n_____|_____|_____");
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p4 + "  |  " + p5 + "  |  " + p6 + "  ");
          System.out.print("\n_____|_____|_____");
          System.out.print("\n     |     |     ");
          System.out.print("\n  " + p7 + "  |  " + p8 + "  |  " + p9 + "  ");
          System.out.print("\n     |     |     ");
          if(p1 != '1' && p2 != '2' && p3 != '3' && p4 != '4' && p5 != '5' && p6 != '6' && p7 != '7' && p8 != '8' && p9 != '9')
          {
              winner = '?';
              gamestate = 2;
              break;
          }
          if(p1 == p2 && p2 == p3)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
           if(p4 == p5 && p5 == p6)
          {
              winner = p4;
              gamestate = 2;
              break;
          }
            if(p7 == p8 && p8 == p9)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
            if(p1 == p5 && p5 == p9)
          {
              winner = p1;
              gamestate = 2;
              break;
          }
            if(p3==p5 && p5 == p7)
            {
              winner = p1;
              gamestate = 2;
              break;
            }
          while(player==2 && gamestate == 1)
          {
              System.out.print("\n X's turn.\n");
              input = s.nextInt();
              if(input>=1 && input <=9)
              {
                  if(input == 1)
                  {
                      if(p1 == '1')
                      {
                          p1 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 2)
                  {
                      if(p2 == '2')
                      {
                          p2 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 3)
                  {
                      if(p3 == '3')
                      {
                          p3 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 4)
                  {
                      if(p4 == '4')
                      {
                          p4 = 'X';
                          player=2;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 5)
                  {
                      if(p5 == '5')
                      {
                          p5 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 6)
                  {
                      if(p6 == '6')
                      {
                          p6 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 7)
                  {
                      if(p7 == '7')
                      {
                          p7 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 8)
                  {
                      if(p8 == '8')
                      {
                          p8 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
                  if(input == 9)
                  {
                      if(p9 == '9')
                      {
                          p9 = 'X';
                          player=1;
                          continue;
                      }
                      else
                      {
                            System.out.print("\nInvalid Move");
                            continue;
                      }
                  }
              }
              else
              {
              System.out.print("\nInvalid Move");
              continue;
              }
          }
      }
      if(gamestate==2 && winner != '?')
      {
          System.out.print("\n" + winner + " is the Winner!");
      }
      else if (gamestate==2 && winner == '?')
      {
          System.out.print("No one won!");
      }
}
}