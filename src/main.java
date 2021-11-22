import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class main {
     static  int count=0;
    public static boolean checkWinner()
    {
        if(count>11)
        {
            System.out.println(count);
            return true;
        }
        System.out.println(count);
        return false;
    }

    public static void mainWindow()
    {
        // start game window
        final ImageIcon startWindow = new ImageIcon("src\\assets\\cover_photo.png");
        JPanel panel = new JPanel() {
            Image backCover = startWindow.getImage();
            {setOpaque(false);}
            public void paintComponent(Graphics startGraphics) {
                startGraphics.drawImage(backCover, 0, 0, this);
                super.paintComponent(startGraphics);
            }
        };
        JFrame window = new JFrame("FindMe ~By: S.ABILASH");
        Image gameIcon = Toolkit.getDefaultToolkit().getImage("src\\assets\\findme_icon.png");
        window.setIconImage(gameIcon);
        panel.setBorder(BorderFactory.createEmptyBorder(200,10,10,10));
        JScrollPane pane = new JScrollPane(panel);
        Container content = window.getContentPane();
        content.add(pane, BorderLayout.CENTER);

        JPanel gameWindow = new JPanel();
        gameWindow.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));
        window.getContentPane().add(BorderLayout.SOUTH,gameWindow);

        //list of Option
        JButton one = new JButton("Red Pin");
        JButton two = new JButton("Dice");
        JButton three = new JButton("Flute");
        JButton four = new JButton("Blue Flower");
        JButton five = new JButton("Bolt");
        JButton six = new JButton("Dart");
        JButton seven = new JButton("Harmonica");
        JButton eight = new JButton("Feather");
        JButton nine = new JButton("Key");
        JButton ten = new JButton("Teddy");
        JButton eleven = new JButton("Apple");
        gameWindow.add(one);
        gameWindow.add(two);
        gameWindow.add(three);
        gameWindow.add(four);
        gameWindow.add(five);
        gameWindow.add(six);
        gameWindow.add(seven);
        gameWindow.add(eight);
        gameWindow.add(nine);
        gameWindow.add(ten);
        gameWindow.add(eleven);
        gameWindow.setBackground(Color.BLACK);
        //set window size and location
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src\\assets\\findme_cursor.png").getImage(),new Point(0,0),"FINDME?"));
        window.setSize(946,600);
        window.setVisible(true);

        //mouse event
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //red pin postion
                if( (e.getX()>=30 && e.getX()<=50) && (e.getY()>=40 && e.getY()<=65) ){
                    one.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //dice position
                else if((e.getX()>=410 && e.getX()<=428) && (e.getY()>=360 && e.getY()<=380)){
                    two.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //flute position
                else if( (e.getX()>=475 && e.getX()<=570) && (e.getY()>=270 && e.getY()<=300)){
                    three.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //blue flower position
                else if( (e.getX()>=260 && e.getX()<=300)  && (e.getY()>=450 && e.getY()<=460)){
                    four.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //bolt position
                else if( (e.getX()>=500 && e.getX()<=520) && (e.getY()>=490 && e.getY()<=500)){
                    five.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //dart position
                else if( (e.getX()>=455 && e.getX()<=505) && (e.getY()>=165 && e.getY()<=200)){
                    six.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //harmonica position
                else if( (e.getX()>=150 && e.getX()<=220) && (e.getY()>=45 && e.getY()<=50)){
                    seven.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //feather position
                else if( (e.getX()>=610 && e.getX()<=690) && (e.getY()>=160 && e.getY()<=205)){
                    eight.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //key position
                else if( (e.getX()>=15 && e.getX()<=35) && (e.getY()>=75 && e.getY()<=125)){
                    nine.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //teddy position
                else if( (e.getX()>=410 && e.getX()<=480) && (e.getY()>=150 && e.getY()<=200)){
                    ten.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }
                //apple position
                else if( (e.getX()>=450 && e.getX()<=465) && (e.getY()>=295 && e.getY()<=315)){
                    eleven.setBackground(Color.GREEN);
                    count++;
                    if(checkWinner()){window.dispose();}
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }




    public static void main(String[] args)
    {
        System.out.println("FindMe ~By: S.ABILASH");

        // start game window
        final ImageIcon startWindow = new ImageIcon("src\\assets\\cover_photo_blur.jpg");
        JPanel panel = new JPanel() {
            Image backCover = startWindow.getImage();
            {setOpaque(false);}
            public void paintComponent(Graphics startGraphics) {
                startGraphics.drawImage(backCover, 0, 0, this);
                super.paintComponent(startGraphics);
            }
        };
                //create findme game window
        JFrame window = new JFrame("FindMe ~By: S.ABILASH ");
                //window Icon
        Image gameIcon = Toolkit.getDefaultToolkit().getImage("src\\assets\\findme_icon.png");
        window.setIconImage(gameIcon);
        panel.setBorder(BorderFactory.createEmptyBorder(200,10,10,10));
        JScrollPane pane = new JScrollPane(panel);
        Container content = window.getContentPane();
        content.add(pane, BorderLayout.CENTER);
                //title card in the start window
        JLabel titleCard = new JLabel("FIND ME?");
        titleCard.setFont(titleCard.getFont().deriveFont(50.F));
        titleCard.setForeground(Color.WHITE);

                //start button in start window
        JButton startButton = new JButton("START");
        startButton.setFont(startButton.getFont().deriveFont(30.F));
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        Dimension startButtonSize = startButton.getPreferredSize();
        startButton.setBounds(500,500,startButtonSize.width,startButtonSize.height);


        //add all the component in the panel
        panel.add(titleCard);
        panel.add(startButton);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set window size and location
        window.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src\\assets\\findme_cursor.png").getImage(),new Point(0,0),"FINDME?"));
        window.setSize(1000,600);
        window.setVisible(true);

        //start event listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               window.dispose();
               mainWindow();
            }
        });
    }
}
