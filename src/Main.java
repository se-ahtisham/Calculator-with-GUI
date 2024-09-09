
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = new JFrame();


    static JButton addBtn, subBtn, mulBtn, divBtn, perBtn;
    static JButton eqBtn, decBtn, clrBtn, delBtn;
    static JButton meanBtn, modeBtn, medianBtn, sdBtn;
    static JButton expBtn, logBtn, lnBtn;
    static JButton sinBtn,cosBtn,tanBtn,inversesinBtn,inversecosBtn,inversetanBtn;
    static JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn;


    static double number1;
    static double number2;
    static double result = 0;
    static char operator = 0;

    public static void main(String[] args) {

        jFrame.setTitle("Scientific Calculator");
        jFrame.setBounds(500, 300, 850, 500);
        jFrame.getContentPane().setBackground(new Color(38, 50, 56));
        jFrame.setLayout(null);
        ImageIcon imageIcon = new ImageIcon("D:\\Java\\Gui\\Calculator-with-GUI\\Calculator.png");
        jFrame.setIconImage(imageIcon.getImage());


        JTextField jTextField = new JTextField();
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setBounds(268, 30, 520, 55);
        jTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        jTextField.setForeground(Color.WHITE);
        jTextField.setBackground(new Color(32, 43, 47));
        jTextField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));


        JTextField preTextField = new JTextField();
        preTextField.setHorizontalAlignment(JTextField.RIGHT);
        preTextField.setBounds(45, 30, 200, 55);
        preTextField.setFont(new Font("Helvetica", Font.PLAIN, 15));
        preTextField.setForeground(Color.WHITE);
        preTextField.setText("Previous Calculations");
        preTextField.setForeground(new Color(131, 131, 131));
        preTextField.setBackground(new Color(32, 43, 47));
        preTextField.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));


        //static JButton addBtn,subBtn,mulBtn,divBtn,perBtn;
        // Add
        JButton addBtn = new JButton("+");
        addBtn.setBounds(686, 390, 100, 50);
        addBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        addBtn.setFocusable(false);
        addBtn.setBackground(new Color(43, 58, 65)); // Button background color
        addBtn.setForeground(new Color(233, 150, 35)); // Button text color
        addBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(addBtn);
        //Subtract Button
        subBtn = new JButton("-");
        subBtn.setBounds(686, 325, 100, 50);
        subBtn.setFont(new Font("Verdana", Font.PLAIN, 23));
        subBtn.setFocusable(false);
        subBtn.setBackground(new Color(43, 58, 65)); // Button background color
        subBtn.setForeground(new Color(233, 150, 35)); // Button text color
        subBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(subBtn);

        //MultiplyButton
        mulBtn = new JButton("x");
        mulBtn.setBounds(686, 260, 100, 50);
        mulBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        mulBtn.setFocusable(false);
        mulBtn.setBackground(new Color(43, 58, 65)); // Button background color
        mulBtn.setForeground(new Color(233, 150, 35)); // Button text color
        mulBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(mulBtn);

        divBtn = new JButton("/");
        divBtn.setBounds(686, 195, 100, 50);
        divBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        divBtn.setFocusable(false);
        divBtn.setBackground(new Color(43, 58, 65));// Button background color
        divBtn.setForeground(new Color(233, 150, 35)); // Button text color
        divBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(divBtn);


// static JButton eqBtn,decBtn,clrBtn,delBtn;
        //Equal
        eqBtn = new JButton("=");
        eqBtn.setBounds(686, 105, 100, 50);
        eqBtn.setFont(new Font("Verdana", Font.BOLD, 15));
        eqBtn.setFocusable(false);
        eqBtn.setBackground(new Color(233, 150, 35)); // Button text color
        eqBtn.setForeground(new Color(65, 65, 65)); // Button background color
        eqBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(eqBtn);

        ImageIcon clsIcon = new ImageIcon("D:\\Java\\Gui\\Calculator-with-GUI\\cls_Logo.png");
        Image img = clsIcon.getImage();
        Image scaledImg = img.getScaledInstance(21, 15, Image.SCALE_SMOOTH);
        clsIcon = new ImageIcon(scaledImg);
        clrBtn = new JButton(clsIcon); // Set the resized image as the button icon
        clrBtn.setBounds(572, 105, 80, 50);
        clrBtn.setFocusable(false);
        clrBtn.setBackground(new Color(43, 58, 65)); // Button background color
        clrBtn.setBorder(BorderFactory.createEmptyBorder());
        clrBtn.setHorizontalAlignment(SwingConstants.CENTER);
        clrBtn.setVerticalAlignment(SwingConstants.CENTER);
        jFrame.add(clrBtn);

        expBtn = new JButton("EXP");
        expBtn.setBounds(468, 105, 80, 50);
        expBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        expBtn.setFocusable(false);
        expBtn.setBackground(new Color(43, 58, 65));// Button background color
        expBtn.setForeground(new Color(200, 200, 200)); // Button text color
        expBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(expBtn);

        lnBtn = new JButton("LN");
        lnBtn.setBounds(368, 105, 80, 50);
        lnBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        lnBtn.setFocusable(false);
        lnBtn.setBackground(new Color(43, 58, 65));// Button background color
        lnBtn.setForeground(new Color(200, 200, 200)); // Button text color
        lnBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(lnBtn);

        logBtn = new JButton("LOG");
        logBtn.setBounds(268, 105, 80, 50);
        logBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        logBtn.setFocusable(false);
        logBtn.setBackground(new Color(43, 58, 65));// Button background color
        logBtn.setForeground(new Color(200, 200, 200)); // Button text color
        logBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(logBtn);

        delBtn = new JButton("RESET");
        delBtn.setBounds(46, 105, 200, 50);
        delBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        delBtn.setFocusable(false);
        delBtn.setBackground(new Color(43, 58, 65));// Button background color
        delBtn.setForeground(new Color(233, 150, 35)); // Button text color
        delBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(delBtn);


        meanBtn = new JButton("Mean");
        meanBtn.setBounds(46, 195, 100, 50);
        meanBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        meanBtn.setFocusable(false);
        meanBtn.setBackground(new Color(43, 58, 65));// Button background color
        meanBtn.setForeground(new Color(200, 200, 200)); // Button text color
        meanBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(meanBtn);

        modeBtn = new JButton("Mode");
        modeBtn.setBounds(46, 260, 100, 50);
        modeBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        modeBtn.setFocusable(false);
        modeBtn.setBackground(new Color(43, 58, 65));// Button background color
        modeBtn.setForeground(new Color(200, 200, 200)); // Button text color
        modeBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(modeBtn);

        medianBtn = new JButton("Median");
        medianBtn.setBounds(46, 325, 100, 50);
        medianBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        medianBtn.setFocusable(false);
        medianBtn.setBackground(new Color(43, 58, 65));// Button background color
        medianBtn.setForeground(new Color(200, 200, 200)); // Button text color
        medianBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(medianBtn);

        sdBtn = new JButton("Standard Deviation");
        sdBtn.setBounds(46, 390, 303, 50);
        sdBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        sdBtn.setFocusable(false);
        sdBtn.setBackground(new Color(43, 58, 65));// Button background color
        sdBtn.setForeground(new Color(200, 200, 200)); // Button text color
        sdBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sdBtn);


        sinBtn = new JButton("SIN");
        sinBtn.setBounds(268, 195, 80, 50);
        sinBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        sinBtn.setFocusable(false);
        sinBtn.setBackground(new Color(43, 58, 65));// Button background color
        sinBtn.setForeground(new Color(200, 200, 200)); // Button text color
        sinBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sinBtn);

        inversesinBtn = new JButton("SIN.IN");
        inversesinBtn.setBounds(168, 195, 80, 50);
        inversesinBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        inversesinBtn.setFocusable(false);
        inversesinBtn.setBackground(new Color(43, 58, 65));// Button background color
        inversesinBtn.setForeground(new Color(200, 200, 200)); // Button text color
        inversesinBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(inversesinBtn);

        cosBtn = new JButton("COS");
        cosBtn.setBounds(268, 260, 80, 50);
        cosBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        cosBtn.setFocusable(false);
        cosBtn.setBackground(new Color(43, 58, 65));// Button background color
        cosBtn.setForeground(new Color(200, 200, 200)); // Button text color
        cosBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(cosBtn);

        inversecosBtn = new JButton("COS.IN");
        inversecosBtn.setBounds(168, 260, 80, 50);
        inversecosBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        inversecosBtn.setFocusable(false);
        inversecosBtn.setBackground(new Color(43, 58, 65));// Button background color
        inversecosBtn.setForeground(new Color(200, 200, 200)); // Button text color
        inversecosBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(inversecosBtn);



        tanBtn = new JButton("TAN");
        tanBtn.setBounds(268, 325, 80, 50);
        tanBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        tanBtn.setFocusable(false);
        tanBtn.setBackground(new Color(43, 58, 65));// Button background color
        tanBtn.setForeground(new Color(200, 200, 200)); // Button text color
        tanBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(tanBtn);

        inversetanBtn = new JButton("TAN.IN");
        inversetanBtn.setBounds(168, 325, 80, 50);
        inversetanBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
        inversetanBtn.setFocusable(false);
        inversetanBtn.setBackground(new Color(43, 58, 65));// Button background color
        inversetanBtn.setForeground(new Color(200, 200, 200)); // Button text color
        inversetanBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(inversetanBtn);


        zeroBtn = new JButton("0");
        zeroBtn.setBounds(468, 390, 80, 50);
        zeroBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        zeroBtn.setFocusable(false);
        zeroBtn.setBackground(new Color(33, 44, 49));
        zeroBtn.setForeground(new Color(200, 200, 200)); // Button text color
        zeroBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(zeroBtn);

        decBtn = new JButton(".");
        decBtn.setBounds(568, 390, 80, 50);
        decBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        decBtn.setFocusable(false);
        decBtn.setBackground(new Color(33, 44, 49));
        decBtn.setForeground(new Color(200, 200, 200)); // Button text color
        decBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(decBtn);

        perBtn = new JButton("%");
        perBtn.setBounds(368, 390, 80, 50);
        perBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        perBtn.setFocusable(false);
        perBtn.setBackground(new Color(33, 44, 49));
        perBtn.setForeground(new Color(200, 200, 200)); // Button text color
        perBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(perBtn);


        oneBtn = new JButton("1");
        oneBtn.setBounds(368, 325, 80, 50);
        oneBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        oneBtn.setFocusable(false);
        oneBtn.setBackground(new Color(33, 44, 49));
        oneBtn.setForeground(new Color(200, 200, 200)); // Button text color
        oneBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(oneBtn);


        twoBtn = new JButton("2");
        twoBtn.setBounds(468, 325, 80, 50);
        twoBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        twoBtn.setFocusable(false);
        twoBtn.setBackground(new Color(33, 44, 49));
        twoBtn.setForeground(new Color(200, 200, 200)); // Button text color
        twoBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(twoBtn);

        threeBtn = new JButton("3");
        threeBtn.setBounds(568, 325, 80, 50);
        threeBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        threeBtn.setFocusable(false);
        threeBtn.setBackground(new Color(33, 44, 49));
        threeBtn.setForeground(new Color(200, 200, 200)); // Button text color
        threeBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(threeBtn);


        fourBtn = new JButton("4");
        fourBtn.setBounds(368, 260, 80, 50);
        fourBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        fourBtn.setFocusable(false);
        fourBtn.setBackground(new Color(33, 44, 49));
        fourBtn.setForeground(new Color(200, 200, 200)); // Button text color
        fourBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(fourBtn);


        fiveBtn = new JButton("5");
        fiveBtn.setBounds(468, 260, 80, 50);
        fiveBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        fiveBtn.setFocusable(false);
        fiveBtn.setBackground(new Color(33, 44, 49));
        fiveBtn.setForeground(new Color(200, 200, 200)); // Button text color
        fiveBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(fiveBtn);

        sixBtn = new JButton("6");
        sixBtn.setBounds(568, 260, 80, 50);
        sixBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        sixBtn.setFocusable(false);
        sixBtn.setBackground(new Color(33, 44, 49));
        sixBtn.setForeground(new Color(200, 200, 200)); // Button text color
        sixBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sixBtn);

        sevenBtn = new JButton("7");
        sevenBtn.setBounds(368, 195, 80, 50);
        sevenBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        sevenBtn.setFocusable(false);
        sevenBtn.setBackground(new Color(33, 44, 49));
        sevenBtn.setForeground(new Color(200, 200, 200)); // Button text color
        sevenBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sevenBtn);

        eightBtn = new JButton("8");
        eightBtn.setBounds(468, 195, 80, 50);
        eightBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        eightBtn.setFocusable(false);
        eightBtn.setBackground(new Color(33, 44, 49));
        eightBtn.setForeground(new Color(200, 200, 200)); // Button text color
        eightBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(eightBtn);

        nineBtn = new JButton("9");
        nineBtn.setBounds(568, 195, 80, 50);
        nineBtn.setFont(new Font("Verdana", Font.PLAIN, 15));
        nineBtn.setFocusable(false);
        nineBtn.setBackground(new Color(33, 44, 49));
        nineBtn.setForeground(new Color(200, 200, 200)); // Button text color
        nineBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(nineBtn);

        // Buttons Actions

        zeroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 0);
                preTextField.setForeground(Color.WHITE);
            }
        });


        oneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 1);
            }
        });

        twoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 2);
            }
        });

        threeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 3);
            }
        });

        fourBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 4);
            }
        });

        fiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 5);
            }
        });

        sixBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 6);
            }
        });

        sevenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 7);
            }
        });


        eightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 8);
            }
        });

        nineBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + 9);
            }
        });


        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                boolean integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                if (integer && (result % 1 == 0)) {
                    preTextField.setText(preTextField.getText() + (int) number1 + " + ");
                } else {
                    preTextField.setText(preTextField.getText() + number1 + " + ");
                }

                operator = '+';
                jTextField.setText("");
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                boolean integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                if (integer && (result % 1 == 0)) {
                    preTextField.setText(preTextField.getText() + (int) number1 + " - ");
                } else {
                    preTextField.setText(preTextField.getText() + number1 + " - ");
                }

                operator = '-';
                jTextField.setText("");
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                boolean integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                if (integer && (result % 1 == 0)) {
                    preTextField.setText(preTextField.getText() + (int) number1 + " x ");
                } else {
                    preTextField.setText(preTextField.getText() + number1 + " x ");
                }
                operator = '*';
                jTextField.setText("");
            }
        });

        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                boolean integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                if (integer && (result % 1 == 0)) {
                    preTextField.setText(preTextField.getText() + (int) number1 + " / ");
                } else {
                    preTextField.setText(preTextField.getText() + number1 + " / ");
                }

                operator = '/';
                jTextField.setText("");
            }
        });

        expBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                boolean integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                if (integer && (result % 1 == 0)) {
                    preTextField.setText(preTextField.getText() + (int) number1 + " ^ ");
                } else {
                    preTextField.setText(preTextField.getText() + number1 + " ^ ");
                }

                operator = '^';
                jTextField.setText("");
            }
        });


        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(" ");
                preTextField.setText(" ");
            }
        });


        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();
                jTextField.setText(text.substring(0, text.length() - 1));
            }
        });

        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = jTextField.getText();
                // Check if the current text already contains a decimal point
                if (!currentText.contains(".")) {
                    jTextField.setText(currentText + ".");
                }
            }
        });

        //        static JButton expBtn, logBtn, lnBtn;
        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                number1 = Double.parseDouble(jTextField.getText());
                preTextField.setText(preTextField.getText() + "LOG(" + number1 + ") ");
                double answer = Math.log10(number1); // Base 10 logarithm
                jTextField.setText(String.valueOf(answer));
                number1=answer;
            }
        });

        lnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(jTextField.getText());

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                preTextField.setText(preTextField.getText() + "LN(" + number1 + ") ");
                double answer = Math.log(number1); // Base e logarithm
                jTextField.setText(String.valueOf(answer));
                number1=result;
            }
        });


        meanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(jTextField.getText());
                int length = String.valueOf(number1).length();
                int sum = 0;
                int originalNumber = number1; // Store original number to calculate length
                while (number1 != 0) {
                    double rem = number1 % 10;
                    sum += rem;
                    number1 /= 10;
                }

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                int result = (length == 0) ? 0 : sum / length;
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "MEAN(" + originalNumber + ") =");
                number2=result;
            }
        });


        modeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jTextField.getText();
                int length = input.length();
                int[] digits = new int[length];
                for (int i = 0; i < length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
                java.util.Arrays.sort(digits);
                int maxCount = 0;
                int currentCount = 1;
                int mode = digits[0];

                for (int i = 1; i < length; i++) {
                    if (digits[i] == digits[i - 1]) {
                        currentCount++;
                    } else {
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            mode = digits[i - 1];
                        }
                        currentCount = 1;
                    }
                }
                if (currentCount > maxCount) {
                    mode = digits[length - 1];
                }
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                preTextField.setText(preTextField.getText() + "MODE(" + input + ") =");
                jTextField.setText(String.valueOf((int) mode));
                number1=mode;
            }
        });


        medianBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the input string from the text field
                String input = jTextField.getText();
                int length = input.length();
                int[] digits = new int[length];
                for (int i = 0; i < length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
                java.util.Arrays.sort(digits);
                double median;
                if (length % 2 == 0) {
                    // If even, average the two middle numbers
                    median = (digits[length / 2 - 1] + digits[length / 2]) / 2.0;
                } else {
                    // If odd, return the middle number
                    median = digits[length / 2];
                }

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                preTextField.setText(preTextField.getText() + "MEDIAN(" + input + ") = ");
                jTextField.setText(String.valueOf((int) median));
                number1 = median;
            }
        });


        sdBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                int length = String.valueOf(number1).length();
                int sum = 0;
                double varianceSum = 0;
                double result = 0;
                double orignalMumber = number1;
                while (number1 != 0) {
                    double rem = number1 % 10;
                    sum += rem;
                    varianceSum += Math.pow(rem - result, 2);
                    number1 /= 10;
                }
                result = (length == 0) ? 0 : sum / length;
                double variance = varianceSum / length;
                double standardDeviation = Math.sqrt(variance);

                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                preTextField.setText(preTextField.getText() + "SD(" + orignalMumber + ") =");
                jTextField.setText(String.valueOf(standardDeviation));
                number1 = standardDeviation ;
            }
        });


        sinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.sin(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "SIN (" + number1 + ") =");
                number1 = result;
            }
        });


        cosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.cos(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "COS (" + number1 + ") =");
                number1 = result;
            }
        });


        tanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.tan(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "TAN (" + number1 + ") =");
                number1 = result;
            }
        });


        inversesinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.asin(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "SIN.IN (" + number1 + ") =");
                number1 = result;
            }
        });


        inversecosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.acos(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "COS.IN (" + number1 + ") =");
                number1 = result;
            }
        });



        inversetanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Integer.parseInt(jTextField.getText());
                double result = Math.atan(number1);
                if (preTextField.getText().contains("Previous Calculations")) {
                    preTextField.setForeground(Color.WHITE);
                    preTextField.setText("");
                }
                preTextField.setForeground(Color.WHITE);
                jTextField.setText(String.valueOf(result));
                preTextField.setText(preTextField.getText() + "TAN.IN (" + number1 + ") =");
                number1 = result;
            }
        });




        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number2 = Double.parseDouble(jTextField.getText());
                boolean integer;
                switch (operator) {
                    case '+':
                        result = number1 + number2;

                        integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                        if (integer && (result % 1 == 0)) {
                            preTextField.setText(preTextField.getText() + (int) number2 + " =  ");
                            jTextField.setText(String.valueOf((int) result));
                        } else {
                            preTextField.setText(preTextField.getText() + number2 + " =  ");
                            jTextField.setText(String.valueOf(result));
                        }

                        break;
                    case '-':
                        result = number1 - number2;

                        integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                        if (integer && (result % 1 == 0)) {
                            preTextField.setText(preTextField.getText() + (int) number2 + " =  ");
                            jTextField.setText(String.valueOf((int) result));
                        } else {
                            preTextField.setText(preTextField.getText() + number2 + " =  ");
                            jTextField.setText(String.valueOf(result));
                        }

                        break;
                    case '*':
                        result = number1 * number2;

                        integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                        if (integer && (result % 1 == 0)) {
                            preTextField.setText(preTextField.getText() + (int) number2 + " =  ");
                            jTextField.setText(String.valueOf((int) result));
                        } else {
                            preTextField.setText(preTextField.getText() + number2 + " =  ");
                            jTextField.setText(String.valueOf(result));
                        }

                        break;
                    case '/':
                        result = number1 / number2;
                        integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                        if (integer && (result % 1 == 0)) {
                            preTextField.setText(preTextField.getText() + (int) number2 + " =  ");
                            jTextField.setText(String.valueOf((int) result));
                        } else {
                            preTextField.setText(preTextField.getText() + number2 + " =  ");
                            jTextField.setText(String.valueOf(result));
                        }

                        break;
                    case '^':
                        result = Math.pow(number1, number2);

                        integer = (number1 % 1 == 0) && (number2 % 1 == 0);
                        if (integer && (result % 1 == 0)) {
                            preTextField.setText(preTextField.getText() + (int) number2 + " =  ");
                            jTextField.setText(String.valueOf((int) result));
                        } else {
                            preTextField.setText(preTextField.getText() + number2 + " =  ");
                            jTextField.setText(String.valueOf(result));
                        }

                        break;
                }
                number1 = result;
            }
        });


        jFrame.setVisible(true); // Make JFrame visible
        jFrame.add(jTextField);
        jFrame.add(preTextField);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true); // Make JFrame visible


    }
}