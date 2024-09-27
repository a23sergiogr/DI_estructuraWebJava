import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {
    public Ventana() {
        super("Practica0");
        new FlowLayout();



        /**********************/
        /********Colors********/
        /**********************/

        Color red = new Color(205,92,92);
        Color orange = new Color(189,183,107);



        /**********************/
        /********Border********/
        /**********************/

        Border whiteBorderMargin = BorderFactory.createLineBorder(Color.WHITE, 5);
        Border whiteBorderMarginLeftRight = BorderFactory.createMatteBorder(0,10,0,10,Color.WHITE);
        Border redBorderMargin = BorderFactory.createLineBorder(red, 12);



        /***********************/
        /********JPanels********/
        /***********************/

        //Layout
        GridBagLayout gblBody = new GridBagLayout();
        GridBagLayout gblMain = new GridBagLayout();
        GridBagLayout gblSection = new GridBagLayout();

        //Constraints
        GridBagConstraints gbc = new GridBagConstraints();


        //Body
        JPanel body = new JPanel(gblBody);
        body.setOpaque(true);
        body.setBackground(Color.PINK);
        body.setBorder(whiteBorderMargin);

        //Main JPanels
        JPanel headerJpanel = new JPanel(new GridBagLayout());
        headerJpanel.setOpaque(true);
        headerJpanel.setBackground(red);
        headerJpanel.setBorder(whiteBorderMargin);

        JPanel mainJpanel = new JPanel(gblMain);
        mainJpanel.setOpaque(true);
        mainJpanel.setBackground(red);
        mainJpanel.setBorder(whiteBorderMargin);

        JPanel footerJpanel = new JPanel(new GridBagLayout());
        footerJpanel.setOpaque(true);
        footerJpanel.setBackground(red);
        footerJpanel.setBorder(whiteBorderMargin);


        //Center Panels
        JPanel navJPanel = new JPanel(new GridBagLayout());
        navJPanel.setOpaque(true);
        navJPanel.setBackground(red);

        JPanel sectionJPanel = new JPanel(gblSection);
        sectionJPanel.setOpaque(true);
        sectionJPanel.setBackground(red);
        sectionJPanel.setBorder(whiteBorderMarginLeftRight);

        JPanel asideJPanel = new JPanel(new GridBagLayout());
        asideJPanel.setOpaque(true);
        asideJPanel.setBackground(red);


        //Inner Panels
        JPanel innerInvisibleJpanel = new JPanel(new GridBagLayout());
        innerInvisibleJpanel.setOpaque(true);
        innerInvisibleJpanel.setBackground(red);
        innerInvisibleJpanel.setBorder(redBorderMargin);

        JPanel innerHeaderJpanel = new JPanel(new GridBagLayout());
        innerHeaderJpanel.setOpaque(true);
        innerHeaderJpanel.setBackground(orange);
        innerHeaderJpanel.setBorder(redBorderMargin);

        JPanel innerArticleJpanel = new JPanel(new GridBagLayout());
        innerArticleJpanel.setOpaque(true);
        innerArticleJpanel.setBackground(orange);
        innerArticleJpanel.setBorder(redBorderMargin);

        JPanel innerFooterJpanel = new JPanel(new GridBagLayout());
        innerFooterJpanel.setOpaque(true);
        innerFooterJpanel.setBackground(orange);
        innerFooterJpanel.setBorder(redBorderMargin);



        /************************/
        /*********JLabels********/
        /************************/

        JLabel headerText = new JLabel("\n<Header>\n");
        headerText.setForeground(Color.white);


        JLabel footerText = new JLabel("\n<Footer>\n");
        footerText.setForeground(Color.white);


        JLabel navText = new JLabel("\n<Nav>\n");
        navText.setForeground(Color.white);


        JLabel asideText = new JLabel("\n<Aside>\n");
        asideText.setForeground(Color.white);


        JLabel sectionText = new JLabel("\n<Section>\n");
        sectionText.setForeground(Color.white);


        JLabel innerHeaderText = new JLabel("\n<Header>\n");
        innerHeaderText.setForeground(Color.white);


        JLabel articleText = new JLabel("\n<Article>\n");
        articleText.setForeground(Color.white);


        JLabel innerFooterText = new JLabel("\n<Footer>\n");
        innerFooterText.setForeground(Color.white);



        /*********************/
        /*********ADDs********/
        /*********************/

        headerJpanel.add(headerText);
        footerJpanel.add(footerText);
        navJPanel.add(navText);
        sectionJPanel.add(sectionText);
        asideJPanel.add(asideText);
        innerHeaderJpanel.add(innerHeaderText);
        innerArticleJpanel.add(articleText);
        innerFooterJpanel.add(innerFooterText);


        //GridBagConstraints for section
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        sectionJPanel.add(innerInvisibleJpanel,gbc);

        gbc.weighty = 2;
        gbc.gridy = 1;
        sectionJPanel.add(innerHeaderJpanel, gbc);

        gbc.weighty = 6;
        gbc.gridy = 2;
        sectionJPanel.add(innerArticleJpanel, gbc);

        gbc.weighty = 2;
        gbc.gridy = 6;
        sectionJPanel.add(innerFooterJpanel, gbc);


        //GridBagConstraints for Main
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        mainJpanel.add(navJPanel, gbc);

        gbc.weightx = 6;
        gbc.gridx = 1;
        mainJpanel.add(sectionJPanel, gbc);

        gbc.weightx = 1;
        gbc.gridx = 6;
        mainJpanel.add(asideJPanel, gbc);


        //GridBagConstraints for Body
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        body.add(headerJpanel, gbc);

        gbc.weighty = 4;
        gbc.gridy = 1;
        body.add(mainJpanel, gbc);

        gbc.weighty = 1;
        gbc.gridy = 4;
        body.add(footerJpanel, gbc);

        add(body);



        /***********************/
        /*********Window********/
        /***********************/

        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
