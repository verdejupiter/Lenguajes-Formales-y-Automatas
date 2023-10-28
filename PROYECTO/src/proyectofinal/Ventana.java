package proyectofinal;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.*;

public class Ventana extends javax.swing.JFrame implements Runnable {

    //INGRESAR DATOS
    boolean bandera = false; 
    String datos;
    String nombres[] = {"Fabricio Julian","Ciara Mendez","Angely Mendez","Valentina Padilla","Angie Recalde"};
    String dni[]= {"75982504","12345678","76555487","76555488","87654321"}; 
    int conta[] = {1,6,2,1,0,0};    
    // VARIABLES PARA COMPRAR
    int Producto1=0,Producto2=0,Producto3=0,Producto4=0,Producto5=0,Producto6=0;
    
    // VARIABLES PARA CALCULOS
    double dinero=0, aux=0;
    int contador=1;
    String cantidades_ingresadas="",direccion="q0.JPG";
    
    // STOCK: PRODUCTOS DISPONIBLES
    //P1;P2;P3;P4;P5;P6
    int MaskQuir=10,MaskKn=10,Agel=10,ASetenta=10,Protector=10,Guantes=10;  
    
    // Estados: FUNCION QUE ACTUALIZA ESTADOS EN PANTALLA DE AUTOMATA
    public void estados()
    {
	String path ="/estados/"+direccion+"";  
	java.net.URL url = this.getClass().getResource(path);  
	ImageIcon icon = new ImageIcon(url);  
	jLabel1.setIcon(icon);  
    }    
    
    //FUNCION PARA LIMPIAR TEXT AREAS
    public void limpiar()
    {
	jTextArea1.setText(null); 
        jTextArea2.setText(null);
        jTextStock.setText(null); 		
    }
    
    //FUNCION PARA SUBIR IMAGENES
    public void carga_productos()
    {
        String path0 ="/productos/KN95.png";  
	java.net.URL url0 = this.getClass().getResource(path0);  
	ImageIcon icon0 = new ImageIcon(url0);  
	jLabeKN95.setIcon(icon0);
        
        String path1 ="/productos/mascq.png";  
	java.net.URL url1 = this.getClass().getResource(path1);  
	ImageIcon icon1 = new ImageIcon(url1);  
	jLabelMasc.setIcon(icon1);
       
        String path2 ="/productos/guantes.png";  
	java.net.URL url2 = this.getClass().getResource(path2);  
	ImageIcon icon2 = new ImageIcon(url2);  
	jLabelGuantes.setIcon(icon2);
        
        String path3 ="/productos/protector.png";  
	java.net.URL url3 = this.getClass().getResource(path3);  
	ImageIcon icon3 = new ImageIcon(url3);  
	jLabelProtector.setIcon(icon3);
        
        String path4 ="/productos/gel.png";  
	java.net.URL url4 = this.getClass().getResource(path4);  
	ImageIcon icon4 = new ImageIcon(url4);  
	jLabelGel.setIcon(icon4);
        
        String path5 ="/productos/alcohol.png";  
	java.net.URL url5 = this.getClass().getResource(path5);  
	ImageIcon icon5 = new ImageIcon(url5);  
	jLabelAlcohol.setIcon(icon5);
        
        String path6 ="/productos/moneda1.png";  
	java.net.URL url6 = this.getClass().getResource(path6);  
	ImageIcon icon6 = new ImageIcon(url6);  
	jLabelMoneda1.setIcon(icon6);
        
        String path7 ="/productos/moneda2.png";  
	java.net.URL url7 = this.getClass().getResource(path7);  
	ImageIcon icon7 = new ImageIcon(url7);  
	jLabelMoneda2.setIcon(icon7);
        
        String path8 ="/productos/moneda5.png";  
	java.net.URL url8 = this.getClass().getResource(path8);  
	ImageIcon icon8 = new ImageIcon(url8);  
	jLabelMoneda5.setIcon(icon8);
        
        String path9 ="/productos/billete10.png";  
	java.net.URL url9 = this.getClass().getResource(path9);  
	ImageIcon icon9 = new ImageIcon(url9);  
	jLabelBillete10.setIcon(icon9);
        
        String path10 ="/productos/billete20.png";  
	java.net.URL ur20 = this.getClass().getResource(path10);  
	ImageIcon icon10 = new ImageIcon(ur20);  
	jLabelBillete20.setIcon(icon10);
    }
          
    //FECHA Y HORA ACTUAL
    String hora, minutos, segundos;
    Thread hilo;
    
    public Ventana()
    {
        initComponents();        
              
        //FECHA EN LA PANTALLA
        lbfecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);  
        jTextArea2.setEditable(false);//true:editar false:no editar
        jTextArea1.setEditable(false);//true:editar false:no editar
        jTextStock.setEditable(false);//true:editar false:no editar
        
        //DECLARACION DE FUNCIONES (PARA VER IMAGENES)     
        carga_productos();
        estados(); //Para mostrar al abrir ventana empieza en estado 0

    }
    
    //FUNCIONES FECHA-HORA -----------------------------------------------------------------------------------------------------------
    public static String fecha()
    {
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    public void hora()
    {
        Calendar calendario = new GregorianCalendar();
	Date horaactual=new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    public void run()
    {
        Thread current=Thread.currentThread();
        
        while(current==hilo)
        {
           hora();
           lbhora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButtonComprar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextStock = new javax.swing.JTextArea();
        jLabeKN95 = new javax.swing.JLabel();
        jLabelMasc = new javax.swing.JLabel();
        jLabelAlcohol = new javax.swing.JLabel();
        jLabelGel = new javax.swing.JLabel();
        jLabelProtector = new javax.swing.JLabel();
        jLabelGuantes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        jLabelMoneda1 = new javax.swing.JLabel();
        jLabelMoneda2 = new javax.swing.JLabel();
        jLabelBillete10 = new javax.swing.JLabel();
        jLabelMoneda5 = new javax.swing.JLabel();
        jLabelBillete20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpantalla = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField1.setText("   DINERO INGRESADO");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField2.setText("       DINERO TOTAL");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 153));
        jButton7.setText("S/. 5.00");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setText("S/.1.00");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 153));
        jButton9.setText("S/. 2.00");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 204));
        jButton10.setText("S/. 10.00");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButtonComprar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonComprar.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(0, 102, 51));
        jButtonComprar.setText("COMPRAR");
        jButtonComprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(153, 0, 0));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Mascarilla quirurgica:S/. 0.50");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 240, 50));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Mascarilla KN95:S/. 3.00");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 240, 50));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Alcohol Gel :S/. 5.00");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 240, 50));

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Alcohol 76° :S/. 4.00");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 240, 50));

        jButton6.setBackground(new java.awt.Color(0, 204, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Guantes:S/. 1.00 ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 240, 50));

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Protectores Faciales: S/.8.00");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 240, 50));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        jTextStock.setBackground(new java.awt.Color(255, 255, 255));
        jTextStock.setColumns(20);
        jTextStock.setForeground(new java.awt.Color(0, 0, 0));
        jTextStock.setRows(5);
        jScrollPane4.setViewportView(jTextStock);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, 200, 100));

        jLabeKN95.setText("jLabel4");
        jPanel2.add(jLabeKN95, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 137, 120));

        jLabelMasc.setText("jLabel4");
        jPanel2.add(jLabelMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 220, 123));

        jLabelAlcohol.setText("jLabel4");
        jPanel2.add(jLabelAlcohol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 109, 109));

        jLabelGel.setText("jLabel6");
        jPanel2.add(jLabelGel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 88, 118));

        jLabelProtector.setText("jLabel4");
        jPanel2.add(jLabelProtector, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 102));

        jLabelGuantes.setText("jLabel4");
        jPanel2.add(jLabelGuantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 102, 108));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/Maquinasimulador (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 790));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("MÁQUINA EXPENDEDORA DE PRODUCTOS DE PROTECCIÓN PERSONAL");

        jButton11.setBackground(new java.awt.Color(0, 0, 153));
        jButton11.setText("S/. 20.00");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA");

        lbfecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD//MM/YYYY");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HORA");

        lbhora.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("00:00:00");

        jLabelMoneda1.setText("j");

        jLabelMoneda2.setText("j");

        jLabelBillete10.setText("j");

        jLabelMoneda5.setText("j");

        jLabelBillete20.setText("jLabel4");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        txtpantalla.setBackground(new java.awt.Color(153, 153, 153));
        txtpantalla.setColumns(20);
        txtpantalla.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtpantalla.setForeground(new java.awt.Color(0, 0, 0));
        txtpantalla.setRows(5);
        txtpantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(txtpantalla);

        btn1.setBackground(new java.awt.Color(102, 102, 102));
        btn1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(204, 204, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 102, 102));
        btn3.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(204, 204, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 102, 102));
        btn4.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(204, 204, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 102, 102));
        btn5.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(204, 204, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(102, 102, 102));
        btn6.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(204, 204, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 102, 102));
        btn7.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(204, 204, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 102, 102));
        btn8.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(204, 204, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(102, 102, 102));
        btn9.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn9.setForeground(new java.awt.Color(204, 204, 0));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(102, 102, 102));
        btn10.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 255, 0));
        btn10.setText("0");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(102, 102, 102));
        btn11.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn11.setForeground(new java.awt.Color(255, 255, 0));
        btn11.setText("C");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(102, 102, 102));
        btn12.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn12.setForeground(new java.awt.Color(204, 204, 0));
        btn12.setText("CLEAR");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(102, 102, 102));
        btn13.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btn13.setForeground(new java.awt.Color(51, 204, 0));
        btn13.setText("BUSCAR");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn12)))))
                .addGap(265, 265, 265)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jButton10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(418, 418, 418)
                                    .addComponent(lbhora)
                                    .addGap(102, 102, 102))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabelBillete10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabelMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMoneda5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBillete20, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11))))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(lbfecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabelMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabelMoneda5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbfecha)
                            .addComponent(jLabel5)
                            .addComponent(lbhora))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabelMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabelBillete10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabelBillete20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton11)
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextStock.setText("Mascarilla Quirurgica: Disponible "+MaskQuir+" unidades.");
        Producto1 = 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

      // MONEDA DE 1 SOLES
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
        dinero=dinero+1;
	cantidades_ingresadas=cantidades_ingresadas + " S/. 1.00 \n" ;		
        
        //IMPRIMIR EN EL TEXT AREA LAS CANTIDADES INGRESADAS
	jTextArea1.append(""+contador+"- S/. 1.00");
	jTextArea1.append(System.getProperty("line.separator"));  
	jTextArea2.setText("S/."+dinero+"");
	contador++;				
				
	//ESTADO q1
        direccion="q1.JPG";
	estados();       
    }//GEN-LAST:event_jButton8ActionPerformed
    
    // MONEDA DE 5 SOLES
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dinero=dinero+5;
	cantidades_ingresadas=cantidades_ingresadas + " S/. 5.00 \n" ;			
        
        //IMPRIMIR EN EL TEXT AREA LAS CANTIDADES INGRESADAS
	jTextArea1.append(""+contador+"- S/. 5.00");
	jTextArea1.append(System.getProperty("line.separator"));  
	jTextArea2.setText("S/."+dinero+"");
	contador++;				
				
	//ESTADO q1
        direccion="q1.JPG";
	estados();	
    }//GEN-LAST:event_jButton7ActionPerformed

    // MONEDA DE 2 SOLES 
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dinero=dinero+2;
	cantidades_ingresadas=cantidades_ingresadas + " S/. 2.00 \n" ;			
        
        //IMPRIMIR EN EL TEXT AREA LAS CANTIDADES INGRESADAS
	jTextArea1.append(""+contador+"- S/. 2.00");
	jTextArea1.append(System.getProperty("line.separator"));  
	jTextArea2.setText("S/."+dinero+"");
	contador++;				
				
	//ESTADO q1
        direccion="q1.JPG";
	estados();	 
    }//GEN-LAST:event_jButton9ActionPerformed

    // BILLETE DE 10 SOLES    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      dinero=dinero+10;
	cantidades_ingresadas=cantidades_ingresadas + " S/. 10.00 \n" ;			
        
        //IMPRIMIR EN EL TEXT AREA LAS CANTIDADES INGRESADAS
	jTextArea1.append(""+contador+"- S/. 10.00");
	jTextArea1.append(System.getProperty("line.separator"));  
	jTextArea2.setText("S/."+dinero+"");
	contador++;				
				
	//ESTADO q1
        direccion="q1.JPG";
	estados(); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    // BOTON CANCELAR
    jTextArea2.setVisible(true);
    jTextArea1.setVisible(true);
    jTextStock.setVisible(true);
    txtpantalla.setText("");    
    
    if(contador >=2 )
    {	
	System.out.println("---TU DINERO---\n"+cantidades_ingresadas+"");
	cantidades_ingresadas="";
	dinero=0;
	jTextArea2.setText("");
	contador=1;
	jTextArea1.setText("");	
	
        //ACTUALIZA BANDERAS DE PRODUCTOS
        Producto1 = 0;
        Producto2 = 0;
        Producto3 = 0;
        Producto4 = 0;
        Producto5 = 0;
        Producto6 = 0;       
                
	//LIMPIAR
	limpiar();  		
	//ESTADO q1
	direccion="q0.JPG";
        //ESTADOS
	estados();
    }        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextStock.setText("Mascarilla KN95: Disponible "+MaskKn+" unidades.");
        Producto2 = 1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextStock.setText("Alcohol en gel: Disponible "+Agel+" unidades.");        
        Producto3 = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextStock.setText("Alcohol 76°: Disponible "+ASetenta+" unidades.");        
        Producto4 = 1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       jTextStock.setText("Protectores Faciales: Disponible "+Protector+" unidades.");
       Producto5 = 1;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextStock.setText("Guantes: Disponible "+Guantes+" unidades");
        Producto6 = 1;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:
         if( bandera == true){
        String mensaje="";
	
	if(contador>=2)
	{    
            //P1: MASCARILLAS QUIRURGICAS-------------------------------------------------------------------------- 
            if(Producto1 == 1)
            {
               if(MaskQuir>0)
                {
                    if(dinero>=0.50) //PRECIO
                    {
                        aux = dinero-0.50; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Mascarilla Quirurgica|\n"+mensaje+" ¡Gracias!");
                        MaskQuir=MaskQuir-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto1 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto1 = 0;
                } 		 	
            }
            //-------------------------------------------------------------------------- 
            //P2: MASCARILLAS KN95-------------------------------------------------------------------------- 
            if(Producto2 == 1)
            {
               if(MaskKn>0)
                {
                    if(dinero>=3.00) //PRECIO
                    {
                        aux = dinero-3.00; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Mascarilla KN95|\n"+mensaje+" ¡Gracias!");
                        MaskKn=MaskKn-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto2 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto2 = 0;
                } 		 	
            }
            //--------------------------------------------------------------------------
            //P3: ALCOHOL GEL-------------------------------------------------------------------------- 
            if(Producto3 == 1)
            {
               if(Agel>0)
                {
                    if(dinero>=5.00) //PRECIO
                    {
                        aux = dinero-5.00; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Alcohol Gel|\n"+mensaje+" ¡Gracias!");
                        Agel=Agel-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto3 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto3 = 0;
                } 		 	
            }
            //-------------------------------------------------------------------------- 
            //P4: ALCOHOL 76°-------------------------------------------------------------------------- 
            if(Producto4 == 1)
            {
               if(ASetenta>0)
                {
                    if(dinero>=4.00) //PRECIO
                    {
                        aux = dinero-4.00; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Alcohol 76°|\n"+mensaje+" ¡Gracias!");
                        ASetenta=ASetenta-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto4 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto4 = 0;
                } 		 	
            }
            //--------------------------------------------------------------------------
            //P5: PROTECTORES FACIALES -------------------------------------------------------------------------- 
            if(Producto5 == 1)
            {
               if(Protector>0)
                {
                    if(dinero>=8.00) //PRECIO
                    {
                        aux = dinero-8.00; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Protector Facial|\n"+mensaje+" ¡Gracias!");
                        Protector=Protector-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto5 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto5 = 0;
                } 		 	
            }
            //-------------------------------------------------------------------------- 
            //P6: GUANTES -------------------------------------------------------------------------- 
            if(Producto6 == 1)
            {
               if(Guantes>0)
                {
                    if(dinero>=1.00) //PRECIO
                    {
                        aux = dinero-1.00; //PRECIO
                        if(aux > 0)
                        {
                            mensaje="Su cambio es S/. "+aux+"";
                        }
                        
                        //ESTADO q2
                        direccion="q2.JPG";
                        estados();
                        
                        JOptionPane.showMessageDialog(null,"Ha comprado |Protector Facial|\n"+mensaje+" ¡Gracias!");
                        Guantes=Guantes-1;
                        
                        //REINICIA MAQUINA EXPENDEDORA
                        cantidades_ingresadas="";
                        dinero=0;
                        jTextArea2.setText("");
                        contador=1;
                        jTextArea1.setText("");
                        jTextStock.setText("");
                        direccion="q0.JPG";
                        Producto6 = 0;
                        estados();
                        limpiar();		
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Revise su bolsillo, por favor.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No hay STOCK DISPONIBLE.");
                    Producto6 = 0;
                } 		 	
            }
            //--------------------------------------------------------------------------
        }   
         }
         else {
             JOptionPane.showMessageDialog(null,"NO PUEDE COMPRAR, SE LLENO COMPRAS");
         }
         
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    
     // BILLETE DE 20 SOLES   
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        dinero=dinero+20;
	cantidades_ingresadas=cantidades_ingresadas + " S/. 20.00 \n" ;			
        
        //IMPRIMIR EN EL TEXT AREA LAS CANTIDADES INGRESADAS
	jTextArea1.append(""+contador+"- S/. 20.00");
	jTextArea1.append(System.getProperty("line.separator"));  
	jTextArea2.setText("S/."+dinero+"");
	contador++;				
				
	//ESTADO q1
        direccion="q1.JPG";
	estados();	 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"0");
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
         ///BORRAR CARACTERER 
        String cadena;
        cadena = txtpantalla.getText();
        int a = cadena.length()-1;
        if(cadena.length()>0)
        {
            cadena = cadena.substring(0, a);
            txtpantalla.setText(cadena);
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        ///BORRAR TODOOO
        txtpantalla.setText("");
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        ///BUSCAR DNI
        int cont = 0;
        int indice;
        datos = txtpantalla.getText();
        boolean band = false;
        indice = dni.length;
        
        for(int i=0 ; i<indice; i++)
        {
            if(datos.equals(dni[i]))
            {
                band=true;
                conta[i]= conta[i] + 1;
                if(conta[i] < 5)
                {
                    txtpantalla.setText("");
                    txtpantalla.setText("Bienvenid@ : "+nombres[i]+"\n"+"| CONTINUE CON  SU COMPRA |");
                    bandera = true;
                }
                else
                {
                    txtpantalla.setText("");
                    txtpantalla.setText("Bienvenid@ : "+nombres[i]+"\nNo puede continuar,\n ha completado el número máximo\n de compras.");
                    jTextArea2.setVisible(false);
                    jTextArea1.setVisible(false);
                    jTextStock.setVisible(false);  
                    bandera = false;
                }
            }
        }
    
    }//GEN-LAST:event_btn13ActionPerformed

       
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JLabel jLabeKN95;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAlcohol;
    private javax.swing.JLabel jLabelBillete10;
    private javax.swing.JLabel jLabelBillete20;
    private javax.swing.JLabel jLabelGel;
    private javax.swing.JLabel jLabelGuantes;
    private javax.swing.JLabel jLabelMasc;
    private javax.swing.JLabel jLabelMoneda1;
    private javax.swing.JLabel jLabelMoneda2;
    private javax.swing.JLabel jLabelMoneda5;
    private javax.swing.JLabel jLabelProtector;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea jTextStock;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbhora;
    private javax.swing.JTextArea txtpantalla;
    // End of variables declaration//GEN-END:variables
}
