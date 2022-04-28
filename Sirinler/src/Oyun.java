/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.RepaintManager;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Mertcan
 */
public class Oyun extends javax.swing.JFrame  {

    /**
     * Creates new form Oyun2
     */
    public int sayac=0;   
    public int art=-1;
    static int skor;
    int a,b;
    int ax1,ay1,ax2,ay2,ax3,ay3,ax4,ay4,ax5,ay5;
    private int gargamelx;
    private int gargamely;
    private int azmanx;
    private int azmany;
    static JLabel[][] ldizi=new JLabel[14][14];
    char dizi[][]=new char[14][14];
    static String satir1,satir2;
    private int x;
    private int y;
    static int hız;
    static int azman;
            Lokasyon lokasyon1 = new Lokasyon(250,50);          Lokasyon lokasyon2 = new Lokasyon(100,100);
            Lokasyon lokasyon3 = new Lokasyon(450,100);         Lokasyon lokasyon4 = new Lokasyon(250,150);
            Lokasyon lokasyon5 = new Lokasyon(350,150);         Lokasyon lokasyon6 = new Lokasyon(500,150);
            Lokasyon lokasyon7 = new Lokasyon(100,200);         Lokasyon lokasyon8 = new Lokasyon(200,200);
            Lokasyon lokasyon9 = new Lokasyon(350,200);         Lokasyon lokasyon10 = new Lokasyon(450,200);
            Lokasyon lokasyon11 = new Lokasyon(100,250);        Lokasyon lokasyon12 = new Lokasyon(450,250);
            Lokasyon lokasyon13 = new Lokasyon(100,300);        Lokasyon lokasyon14 = new Lokasyon(350,300);
            Lokasyon lokasyon15 = new Lokasyon(100,350);        Lokasyon lokasyon16 = new Lokasyon(100,400);
            Lokasyon lokasyon17 = new Lokasyon(200,400);        Lokasyon lokasyon18 = new Lokasyon(150,300);
            Lokasyon lokasyon19 = new Lokasyon(250,200);        Lokasyon lokasyon20 = new Lokasyon(250,400);
            Lokasyon lokasyon21 = new Lokasyon(300,400);        Lokasyon lokasyon22 = new Lokasyon(350,400);
            Lokasyon lokasyon23 = new Lokasyon(400,400);        Lokasyon lokasyon24 = new Lokasyon(500,100);
            Lokasyon lokasyon25 = new Lokasyon(500,200);        Lokasyon lokasyon26 = new Lokasyon(350,250);
    public Oyun() {
        initComponents();
        skorfield.setText("  "+Integer.toString(Oyun.skor));
        addKeyListener(new KlavyeKontrol());
        setFocusable(true);
        
        
        
        ImageIcon imggri = new javax.swing.ImageIcon(getClass().getResource("/images/gri.png"));
         ImageIcon imgbeyaz = new javax.swing.ImageIcon(getClass().getResource("/images/beyaz.png"));
         ImageIcon imgmavi = new javax.swing.ImageIcon(getClass().getResource("/images/mavi.png"));
         ImageIcon imgpembeA = new javax.swing.ImageIcon(getClass().getResource("/images/pembeA.png"));
         ImageIcon imgpembeB = new javax.swing.ImageIcon(getClass().getResource("/images/pembeB.png"));
         ImageIcon imgpembeC = new javax.swing.ImageIcon(getClass().getResource("/images/pembeC.png"));
         ImageIcon imgpembeD = new javax.swing.ImageIcon(getClass().getResource("/images/pembeD.png"));
         ImageIcon imgsirine = new javax.swing.ImageIcon(getClass().getResource("/images/sirine.png"));
         
         File f=new File("C:/Users/Mertcan/Desktop/Mertcan Üni/Java Projeler/Sirinler/dosya.txt");
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String s1=reader.readLine();
            String s2=reader.readLine();
            String s3=reader.readLine();
            String s4=reader.readLine();
            String s5=reader.readLine();
            String s6=reader.readLine();
            String s7=reader.readLine();
            String s8=reader.readLine();
            String s9=reader.readLine();
            String s10=reader.readLine();
            String s11=reader.readLine();
            String s12=reader.readLine();
            String s13=reader.readLine();
            Oyun.satir1=s1;
            Oyun.satir2=s2;
            if(satir2.equals("") && satir1.equals("Karakter:Gargamel,Kapi:A") || satir2.equals("") && satir1.equals("Karakter:Gargamel,Kapi:B") || satir2.equals("") && satir1.equals("Karakter:Gargamel,Kapi:C") || satir2.equals("") && satir1.equals("Karakter:Gargamel,Kapi:D")){
            azmanoyun.setVisible(false);
            }
            if(satir1.equals("") && satir2.equals("Karakter:Gargamel,Kapi:A") || satir1.equals("") && satir2.equals("Karakter:Gargamel,Kapi:B") || satir1.equals("") && satir2.equals("Karakter:Gargamel,Kapi:C") || satir1.equals("") && satir2.equals("Karakter:Gargamel,Kapi:D")){
            azmanoyun.setVisible(false);
            }
            
            for (int i = 0; i < 13; i++) {
                ldizi[i][2]=new JLabel("");
                dizi[2][i]=s3.charAt(i);
                if (dizi[2][i]=='0') {
                     ldizi[i][2].setIcon(imggri);                    
                }
                else if(dizi[2][i]=='1'){
                    ldizi[i][2].setIcon(imgbeyaz); 
                }
                        
                        ldizi[i][2].setBounds(i*50,0*50, 50, 50);
                        jPanel1.add(ldizi[i][2]);
                        ldizi[i][2].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][3]=new JLabel("");
                dizi[3][i]=s4.charAt(i);
                if (dizi[3][i]=='0') {
                     ldizi[i][3].setIcon(imggri);
                }
                else if(dizi[3][i]=='1'){
                    ldizi[i][3].setIcon(imgbeyaz); 
                }
                        ldizi[i][3].setBounds(i*50,1*50, 50, 50);
                        jPanel1.add(ldizi[i][3]);
                        ldizi[i][3].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][4]=new JLabel("");
                dizi[4][i]=s5.charAt(i);
                if (dizi[4][i]=='0') {
                     ldizi[i][4].setIcon(imggri);
                }
                else if(dizi[4][i]=='1'){
                    ldizi[i][4].setIcon(imgbeyaz); 
                }
                        ldizi[i][4].setBounds(i*50,2*50, 50, 50);
                        jPanel1.add(ldizi[i][4]);
                        ldizi[i][4].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][5]=new JLabel("");
                dizi[5][i]=s6.charAt(i);
                if (dizi[5][i]=='0') {
                     ldizi[i][5].setIcon(imggri);
                }
                else if(dizi[5][i]=='1'){
                    ldizi[i][5].setIcon(imgbeyaz); 
                }
                        ldizi[i][5].setBounds(i*50,3*50, 50, 50);
                        jPanel1.add(ldizi[i][5]);
                        ldizi[i][5].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][6]=new JLabel("");
                dizi[6][i]=s7.charAt(i);
                if (dizi[6][i]=='0') {
                     ldizi[i][6].setIcon(imggri);
                }
                else if(dizi[6][i]=='1'){
                    ldizi[i][6].setIcon(imgbeyaz); 
                }
                        ldizi[i][6].setBounds(i*50,4*50, 50, 50);
                        jPanel1.add(ldizi[i][6]);
                        ldizi[i][6].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][7]=new JLabel("");
                dizi[7][i]=s8.charAt(i);
                if (dizi[7][i]=='0') {
                     ldizi[i][7].setIcon(imggri);
                }
                else if(dizi[7][i]=='1'){
                    ldizi[i][7].setIcon(imgbeyaz); 
                }
                        ldizi[i][7].setBounds(i*50,5*50, 50, 50);
                        jPanel1.add(ldizi[i][7]);
                        ldizi[i][7].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][8]=new JLabel("");
                dizi[8][i]=s9.charAt(i);
                if (dizi[8][i]=='0') {
                     ldizi[i][8].setIcon(imggri);
                }
                else if(dizi[8][i]=='1'){
                    ldizi[i][8].setIcon(imgbeyaz); 
                }
                        ldizi[i][8].setBounds(i*50,6*50, 50, 50);
                        jPanel1.add(ldizi[i][8]);
                        ldizi[i][8].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][9]=new JLabel("");
                dizi[9][i]=s10.charAt(i);
                if (dizi[9][i]=='0') {
                     ldizi[i][9].setIcon(imggri);
                }
                else if(dizi[9][i]=='1'){
                    ldizi[i][9].setIcon(imgbeyaz); 
                }
                        ldizi[i][9].setBounds(i*50,7*50, 50, 50);
                        jPanel1.add(ldizi[i][9]);
                        ldizi[i][9].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][10]=new JLabel("");
                dizi[10][i]=s11.charAt(i);
                if (dizi[10][i]=='0') {
                     ldizi[i][10].setIcon(imggri);
                }
                else if(dizi[10][i]=='1'){
                    ldizi[i][10].setIcon(imgbeyaz); 
                }
                        ldizi[i][10].setBounds(i*50,8*50, 50, 50);
                        jPanel1.add(ldizi[i][10]);
                        ldizi[i][10].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][11]=new JLabel("");
                dizi[11][i]=s12.charAt(i);
                if (dizi[11][i]=='0') {
                     ldizi[i][11].setIcon(imggri);
                }
                else if(dizi[11][i]=='1'){
                    ldizi[i][11].setIcon(imgbeyaz); 
                }
                        ldizi[i][11].setBounds(i*50,9*50, 50, 50);
                        jPanel1.add(ldizi[i][11]);
                        ldizi[i][11].repaint();
            }
            for (int i = 0; i < 13; i++) {
                ldizi[i][12]=new JLabel("");
                dizi[12][i]=s13.charAt(i);
                if (dizi[12][i]=='0') {
                     ldizi[i][12].setIcon(imggri);
                }
                else if(dizi[12][i]=='1'){
                    ldizi[i][12].setIcon(imgbeyaz); 
                }
                        ldizi[i][12].setBounds(i*50,10*50, 50, 50);
                        jPanel1.add(ldizi[i][12]);
                        ldizi[i][12].repaint();
            }
        
        ldizi[6][7].setIcon(imgmavi);
        ldizi[3][2].setIcon(imgpembeA);
        ldizi[10][2].setIcon(imgpembeB);
        ldizi[0][7].setIcon(imgpembeC);
        ldizi[3][12].setIcon(imgpembeD);
        
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        
        
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gargameloyun = new javax.swing.JLabel();
        azmanoyun = new javax.swing.JLabel();
        ortadaki = new javax.swing.JLabel();
        tembelbutonu = new javax.swing.JButton();
        gozluklubutonu = new javax.swing.JButton();
        sirine = new javax.swing.JLabel();
        duvaralt = new javax.swing.JLabel();
        duvarsagalt = new javax.swing.JLabel();
        duvarsagust = new javax.swing.JLabel();
        duvarust = new javax.swing.JLabel();
        duvarsol = new javax.swing.JLabel();
        uyarı = new javax.swing.JTextField();
        skoryazısı = new javax.swing.JLabel();
        skorfield = new javax.swing.JTextField();
        altın5 = new javax.swing.JLabel();
        altın4 = new javax.swing.JLabel();
        altın3 = new javax.swing.JLabel();
        altın2 = new javax.swing.JLabel();
        altın1 = new javax.swing.JLabel();
        mantar = new javax.swing.JLabel();
        OyunLabeli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(gargameloyun);
        gargameloyun.setBounds(880, 370, 50, 50);
        getContentPane().add(azmanoyun);
        azmanoyun.setBounds(1130, 370, 50, 50);
        getContentPane().add(ortadaki);
        ortadaki.setBounds(300, 250, 50, 50);

        tembelbutonu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\Mertcan Üni\\Java Projeler\\Sirinler\\src\\images\\tembel.png")); // NOI18N
        tembelbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tembelbutonuActionPerformed(evt);
            }
        });
        getContentPane().add(tembelbutonu);
        tembelbutonu.setBounds(790, 110, 150, 210);

        gozluklubutonu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\Mertcan Üni\\Java Projeler\\Sirinler\\src\\images\\gozluklu.png")); // NOI18N
        gozluklubutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gozluklubutonuActionPerformed(evt);
            }
        });
        getContentPane().add(gozluklubutonu);
        gozluklubutonu.setBounds(1080, 110, 150, 210);

        sirine.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\Mertcan Üni\\Java Projeler\\Sirinler\\src\\images\\sirine.png")); // NOI18N
        getContentPane().add(sirine);
        sirine.setBounds(650, 350, 50, 50);
        getContentPane().add(duvaralt);
        duvaralt.setBounds(0, 500, 650, 50);
        getContentPane().add(duvarsagalt);
        duvarsagalt.setBounds(600, 400, 50, 150);
        getContentPane().add(duvarsagust);
        duvarsagust.setBounds(600, 0, 50, 350);
        getContentPane().add(duvarust);
        duvarust.setBounds(0, 0, 650, 50);
        getContentPane().add(duvarsol);
        duvarsol.setBounds(0, 0, 50, 500);
        getContentPane().add(uyarı);
        uyarı.setBounds(830, 370, 400, 150);

        skoryazısı.setText("SKOR");
        getContentPane().add(skoryazısı);
        skoryazısı.setBounds(1000, 540, 80, 30);

        skorfield.setEditable(false);
        skorfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skorfield.setText("     ");
        skorfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        skorfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skorfieldActionPerformed(evt);
            }
        });
        getContentPane().add(skorfield);
        skorfield.setBounds(990, 570, 50, 30);
        getContentPane().add(altın5);
        altın5.setBounds(200, 350, 50, 50);
        getContentPane().add(altın4);
        altın4.setBounds(200, 300, 50, 50);
        getContentPane().add(altın3);
        altın3.setBounds(200, 250, 50, 50);
        getContentPane().add(altın2);
        altın2.setBounds(150, 250, 50, 50);
        getContentPane().add(altın1);
        altın1.setBounds(150, 200, 50, 50);
        getContentPane().add(mantar);
        mantar.setBounds(150, 150, 50, 50);

        OyunLabeli.setBackground(new java.awt.Color(250, 250, 250));
        getContentPane().add(OyunLabeli);
        OyunLabeli.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tembelbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tembelbutonuActionPerformed
        // TODO add your handling code here:
        tembelbutonu.setVisible(false);
        gozluklubutonu.setVisible(false);
        ImageIcon imggozlukluortada = new javax.swing.ImageIcon(getClass().getResource("/images/gozlukluortada.png"));      
        ImageIcon imgtembelortada = new javax.swing.ImageIcon(getClass().getResource("/images/tembelortada.png"));
        ImageIcon imggargamel = new javax.swing.ImageIcon(getClass().getResource("/images/gargamel.png"));
        ImageIcon imgazman = new javax.swing.ImageIcon(getClass().getResource("/images/azman.png"));
        ortadaki.setIcon(imgtembelortada);
        
        Oyuncu.TembelSirin TembelSirin=new Oyuncu().new TembelSirin(50,20);
        Oyun.hız=TembelSirin.getHız();       
        int puan2=TembelSirin.getpuan();
        Oyuncu.Puan puan =new Oyuncu().new Puan(puan2);
        Oyun.skor=puan2;
        Obje.altın altın=new Obje().new altın(5000,5);
        
        Obje.mantar Mantar = new Obje().new mantar(7000);
        
        if(satir1.equals("Karakter:Gargamel,Kapi:A")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;     
        }       
        else if(satir1.equals("Karakter:Gargamel,Kapi:B")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
            uyarı.setText("!!!Gargamel B kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir1.equals("Karakter:Gargamel,Kapi:C")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=0;
            gargamely=250;
            uyarı.setText("!!!Gargamel C kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir1.equals("Karakter:Gargamel,Kapi:D")){
            gargameloyun.setBounds(150, 500, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=500;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:A")){
            azmanoyun.setBounds(150, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=0;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:B")){
           azmanoyun.setBounds(500, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=500;
            azmany=0;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:C")){
            azmanoyun.setBounds(0, 250, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=0;
            azmany=250;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:D")){
           azmanoyun.setBounds(150, 500, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=500;
        }
       if(satir2.equals("Karakter:Gargamel,Kapi:A")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:B")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
            uyarı.setText("!!!Gargamel B kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:C")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=0;
            gargamely=250;
            uyarı.setText("!!!Gargamel C kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:D")){
            gargameloyun.setBounds(150, 500, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=500;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:A")){
            azmanoyun.setBounds(150, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=0;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:B")){
            azmanoyun.setBounds(500, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=500;
            azmany=0;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:C")){
            azmanoyun.setBounds(0, 250, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=0;
            azmany=250;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:D")){
            azmanoyun.setBounds(150, 500, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=500;
        }
           
            ArrayList<Integer> randoms2 = new ArrayList<Integer>();
        randoms2.add(1);
        randoms2.add(2);
        randoms2.add(3);
        randoms2.add(4);
        randoms2.add(-1);
        randoms2.add(-2);
        randoms2.add(-3);
        randoms2.add(-4);
        
        Collections.shuffle(randoms2);
        
        Timer myTimer=new Timer();
       TimerTask gorev=new TimerTask() {
            @Override
            public void run() {
                
                ImageIcon imgmantar = new javax.swing.ImageIcon(getClass().getResource("/images/mantar.png"));
                
                    mantar.setIcon(imgmantar);
                    
                    sayac++;
                    
                    if(sayac%8==0){
                       Collections.shuffle(randoms2);
                       art=-1;
                    }
                    art++;
                    
                       a = (int) mantar.getBounds().getX();
                       b = (int) mantar.getBounds().getY();
                       
                        
                        
                        if(mantar.getX()==lokasyon1.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon1.getY()|| mantar.getX()==lokasyon2.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon2.getY()||mantar.getX()==lokasyon3.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon3.getY()|| mantar.getX()==lokasyon4.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon4.getY()||mantar.getX()==lokasyon5.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon5.getY()|| mantar.getX()==lokasyon6.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon6.getY()||mantar.getX()==lokasyon7.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon7.getY()|| mantar.getX()==lokasyon8.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon8.getY()||mantar.getX()==lokasyon9.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon9.getY()|| mantar.getX()==lokasyon10.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon10.getY()||mantar.getX()==lokasyon11.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon11.getY()|| mantar.getX()==lokasyon12.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon12.getY()||mantar.getX()==lokasyon13.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon13.getY()|| mantar.getX()==lokasyon14.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon14.getY()||mantar.getX()==lokasyon15.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon15.getY()|| mantar.getX()==lokasyon16.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon16.getY()||mantar.getX()==lokasyon17.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon17.getY()|| mantar.getX()==lokasyon18.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon18.getY()||mantar.getX()==lokasyon19.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon19.getY()|| mantar.getX()==lokasyon20.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon20.getY()||mantar.getX()==lokasyon21.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon21.getY()|| mantar.getX()==lokasyon22.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon22.getY()||mantar.getX()==lokasyon23.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon23.getY()|| mantar.getX()==lokasyon24.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon24.getY()||mantar.getX()==lokasyon25.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon25.getY()||mantar.getX()==lokasyon26.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon26.getY()){
                    mantar.setBounds(550, 50, 50, 50);
                }else if(a>=550-randoms2.get(art)*50){
                           
                            mantar.setBounds(250, 350, 50, 50);
                       } 
                else if(a<=50-randoms2.get(art)*50){
                          
                            mantar.setBounds(200, 100, 50, 50);
                       } 
                else if(b<=50-randoms2.get(art)*50){
                          
                            mantar.setBounds(50, 300, 50, 50);
                       } 
                else if(b>=500-randoms2.get(art)*50){
                           
                            mantar.setBounds(400, 250, 50, 50);
                       } 
                    else if(mantar.getX()==lokasyon1.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon1.getY()|| mantar.getX()==lokasyon2.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon2.getY()||mantar.getX()==lokasyon3.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon3.getY()|| mantar.getX()==lokasyon4.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon4.getY()||mantar.getX()==lokasyon5.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon5.getY()|| mantar.getX()==lokasyon6.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon6.getY()||mantar.getX()==lokasyon7.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon7.getY()|| mantar.getX()==lokasyon8.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon8.getY()||mantar.getX()==lokasyon9.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon9.getY()|| mantar.getX()==lokasyon10.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon10.getY()|| mantar.getX()==lokasyon12.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon12.getY()||mantar.getX()==lokasyon13.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon13.getY()|| mantar.getX()==lokasyon14.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon14.getY()||mantar.getX()==lokasyon15.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon15.getY()|| mantar.getX()==lokasyon16.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon16.getY()||mantar.getX()==lokasyon17.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon17.getY()|| mantar.getX()==lokasyon18.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon18.getY()||mantar.getX()==lokasyon19.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon19.getY()|| mantar.getX()==lokasyon20.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon20.getY()||mantar.getX()==lokasyon21.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon21.getY()|| mantar.getX()==lokasyon22.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon22.getY()||mantar.getX()==lokasyon23.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon23.getY()|| mantar.getX()==lokasyon24.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon24.getY()||mantar.getX()==lokasyon25.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon25.getY()||mantar.getX()==lokasyon26.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon26.getY()){
                     mantar.setBounds(450, 350, 50, 50);
                }
                    else if(mantar.getX()==lokasyon11.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon11.getY()){
                        mantar.setBounds(200, 150, 50, 50);
                    }
                    else if(mantar.getX()==lokasyon1.getX() && mantar.getY()==lokasyon1.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon2.getX() && mantar.getY()==lokasyon2.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon3.getX() && mantar.getY()==lokasyon3.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon4.getX() && mantar.getY()==lokasyon4.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon5.getX()&& mantar.getY()==lokasyon5.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon6.getX() && mantar.getY()==lokasyon6.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon7.getX() && mantar.getY()==lokasyon7.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon8.getX() && mantar.getY()==lokasyon8.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon9.getX() && mantar.getY()==lokasyon9.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon10.getX() && mantar.getY()==lokasyon10.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon11.getX() && mantar.getY()==lokasyon11.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon12.getX() && mantar.getY()==lokasyon12.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon13.getX() && mantar.getY()==lokasyon13.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon14.getX() && mantar.getY()==lokasyon14.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon15.getX()&& mantar.getY()==lokasyon15.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon16.getX() && mantar.getY()==lokasyon16.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon17.getX() && mantar.getY()==lokasyon17.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon18.getX()&& mantar.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||mantar.getX()==lokasyon19.getX() && mantar.getY()==lokasyon19.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon20.getX() && mantar.getY()==lokasyon20.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon21.getX() && mantar.getY()==lokasyon21.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon22.getX() && mantar.getY()==lokasyon22.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon23.getX() && mantar.getY()==lokasyon23.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon24.getX() && mantar.getY()==lokasyon24.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon25.getX() && mantar.getY()==lokasyon25.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon26.getX() && mantar.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    mantar.setBounds(300, 200, 50, 50);
                }
                     else if(mantar.getX()==lokasyon1.getX() && mantar.getY()==lokasyon1.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon2.getX() && mantar.getY()==lokasyon2.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon3.getX() && mantar.getY()==lokasyon3.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon4.getX() && mantar.getY()==lokasyon4.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon5.getX()&& mantar.getY()==lokasyon5.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon6.getX() && mantar.getY()==lokasyon6.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon7.getX() && mantar.getY()==lokasyon7.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon8.getX() && mantar.getY()==lokasyon8.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon9.getX() && mantar.getY()==lokasyon9.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon10.getX() && mantar.getY()==lokasyon10.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon11.getX() && mantar.getY()==lokasyon11.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon12.getX() && mantar.getY()==lokasyon12.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon13.getX() && mantar.getY()==lokasyon13.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon14.getX() && mantar.getY()==lokasyon14.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon15.getX()&& mantar.getY()==lokasyon15.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon16.getX() && mantar.getY()==lokasyon16.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon17.getX() && mantar.getY()==lokasyon17.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon18.getX()&& mantar.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||mantar.getX()==lokasyon19.getX() && mantar.getY()==lokasyon19.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon20.getX() && mantar.getY()==lokasyon20.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon21.getX() && mantar.getY()==lokasyon21.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon22.getX() && mantar.getY()==lokasyon22.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon23.getX() && mantar.getY()==lokasyon23.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon24.getX() && mantar.getY()==lokasyon24.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon25.getX() && mantar.getY()==lokasyon25.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon26.getX() && mantar.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    mantar.setBounds(350, 450, 50, 50);
                }
                    else mantar.setBounds(a+randoms2.get(art)*50, b, 50, 50);
                     
                        
            }
            
        };
      
         myTimer.schedule(gorev,0,Mantar.getSure());
          
         
         Timer myTimer2=new Timer();
       TimerTask gorev2=new TimerTask() {
            @Override
            public void run() {
                ImageIcon imgaltın = new javax.swing.ImageIcon(getClass().getResource("/images/altın.png"));
                altın1.setIcon(imgaltın); altın2.setIcon(imgaltın); altın3.setIcon(imgaltın); altın4.setIcon(imgaltın); altın5.setIcon(imgaltın);
                
                sayac++;
                    
                    if(sayac%8==0){
                       Collections.shuffle(randoms2);
                       art=-1;
                    }
                    art++;
                    
                    ax1 = (int) altın1.getBounds().getX();  ax2 = (int) altın2.getBounds().getX();  ax3 = (int) altın3.getBounds().getX();  ax4 = (int) altın4.getBounds().getX();  ax5 = (int) altın5.getBounds().getX();
                    ay1 = (int) altın1.getBounds().getY();  ay2 = (int) altın2.getBounds().getY();  ay3 = (int) altın3.getBounds().getY();  ay4 = (int) altın4.getBounds().getY();  ay5 = (int) altın5.getBounds().getY();  
                
                    if(altın1.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon1.getY()|| altın1.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon2.getY()||altın1.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon3.getY()|| altın1.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon4.getY()||altın1.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon5.getY()|| altın1.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon6.getY()||altın1.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon7.getY()|| altın1.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon8.getY()||altın1.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon9.getY()|| altın1.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon10.getY()||altın1.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon11.getY()|| altın1.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon12.getY()||altın1.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon13.getY()|| altın1.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon14.getY()||altın1.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon15.getY()|| altın1.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon16.getY()||altın1.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon17.getY()|| altın1.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon18.getY()||altın1.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon19.getY()|| altın1.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon20.getY()||altın1.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon21.getY()|| altın1.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon22.getY()||altın1.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon23.getY()|| altın1.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon24.getY()||altın1.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon25.getY()||altın1.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon26.getY()){
                    altın1.setBounds(450,150, 50, 50);
                }else if(ax1>=550-randoms2.get(art)*50){
                          
                            altın1.setBounds(350, 100, 50, 50);
                       }else if(ax1<=50-randoms2.get(art)*50){
                        
                            altın1.setBounds(50, 150, 50, 50);
                       }else if(ay1<=50-randoms2.get(art)*50){
                          
                            altın1.setBounds(250, 450, 50, 50);
                       }else if(ay1>=500-randoms2.get(art)*50){
                           
                            altın1.setBounds(200, 250, 50, 50);
                       }else if(altın1.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon1.getY()|| altın1.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon2.getY()||altın1.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon3.getY()|| altın1.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon4.getY()||altın1.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon5.getY()|| altın1.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon6.getY()||altın1.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon7.getY()|| altın1.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon8.getY()||altın1.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon9.getY()|| altın1.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon10.getY()|| altın1.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon12.getY()||altın1.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon13.getY()|| altın1.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon14.getY()||altın1.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon15.getY()|| altın1.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon16.getY()||altın1.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon17.getY()|| altın1.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon18.getY()||altın1.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon19.getY()|| altın1.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon20.getY()||altın1.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon21.getY()|| altın1.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon22.getY()||altın1.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon23.getY()|| altın1.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon24.getY()||altın1.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon25.getY()||altın1.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon26.getY()){
                     altın1.setBounds(550, 250, 50, 50);
                }else if(altın1.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon11.getY()){
                        altın1.setBounds(50, 450, 50, 50);
                    }else if(altın1.getX()==lokasyon1.getX() && altın1.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon2.getX() && altın1.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon3.getX() && altın1.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon4.getX() && altın1.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon5.getX()&& altın1.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon6.getX() && altın1.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon7.getX() && altın1.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon8.getX() && altın1.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon9.getX() && altın1.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon10.getX() && altın1.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon11.getX() && altın1.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon12.getX() && altın1.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon13.getX() && altın1.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon14.getX() && altın1.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon15.getX()&& altın1.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon16.getX() && altın1.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon17.getX() && altın1.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon18.getX()&& altın1.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın1.getX()==lokasyon19.getX() && altın1.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon20.getX() && altın1.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon21.getX() && altın1.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon22.getX() && altın1.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon23.getX() && altın1.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon24.getX() && altın1.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon25.getX() && altın1.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon26.getX() && altın1.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın1.setBounds(50, 50, 50, 50);
                }else if(altın1.getX()==lokasyon1.getX() && altın1.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon2.getX() && altın1.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon3.getX() && altın1.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon4.getX() && altın1.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon5.getX()&& altın1.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon6.getX() && altın1.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon7.getX() && altın1.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon8.getX() && altın1.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon9.getX() && altın1.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon10.getX() && altın1.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon11.getX() && altın1.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon12.getX() && altın1.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon13.getX() && altın1.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon14.getX() && altın1.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon15.getX()&& altın1.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon16.getX() && altın1.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon17.getX() && altın1.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon18.getX()&& altın1.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın1.getX()==lokasyon19.getX() && altın1.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon20.getX() && altın1.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon21.getX() && altın1.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon22.getX() && altın1.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon23.getX() && altın1.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon24.getX() && altın1.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon25.getX() && altın1.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon26.getX() && altın1.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın1.setBounds(500, 450, 50, 50);
                }else altın1.setBounds(ax1+randoms2.get(art)*50, ay1, 50, 50);   
                    
                    
                    if(altın2.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon1.getY()|| altın2.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon2.getY()||altın2.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon3.getY()|| altın2.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon4.getY()||altın2.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon5.getY()|| altın2.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon6.getY()||altın2.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon7.getY()|| altın2.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon8.getY()||altın2.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon9.getY()|| altın2.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon10.getY()||altın2.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon11.getY()|| altın2.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon12.getY()||altın2.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon13.getY()|| altın2.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon14.getY()||altın2.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon15.getY()|| altın2.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon16.getY()||altın2.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon17.getY()|| altın2.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon18.getY()||altın2.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon19.getY()|| altın2.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon20.getY()||altın2.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon21.getY()|| altın2.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon22.getY()||altın2.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon23.getY()|| altın2.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon24.getY()||altın2.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon25.getY()||altın2.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon26.getY()){
                    altın2.setBounds(200,50, 50, 50);
                }else if(ax2>=550-randoms2.get(art)*50){
                           
                            altın2.setBounds(300, 50, 50, 50);
                       }else if(ax2<=50-randoms2.get(art)*50){
                           
                            altın2.setBounds(400, 50, 50, 50);
                       }else if(ay2<=50-randoms2.get(art)*50){
                           
                            altın2.setBounds(550, 150, 50, 50);
                       }else if(ay2>=500-randoms2.get(art)*50){
                           
                            altın2.setBounds(350, 350, 50, 50);
                       }else if(altın2.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon1.getY()|| altın2.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon2.getY()||altın2.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon3.getY()|| altın2.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon4.getY()||altın2.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon5.getY()|| altın2.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon6.getY()||altın2.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon7.getY()|| altın2.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon8.getY()||altın2.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon9.getY()|| altın2.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon10.getY()|| altın2.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon12.getY()||altın2.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon13.getY()|| altın2.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon14.getY()||altın2.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon15.getY()|| altın2.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon16.getY()||altın2.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon17.getY()|| altın2.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon18.getY()||altın2.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon19.getY()|| altın2.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon20.getY()||altın2.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon21.getY()|| altın2.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon22.getY()||altın2.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon23.getY()|| altın2.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon24.getY()||altın2.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon25.getY()||altın2.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon26.getY()){
                     altın2.setBounds(50, 400, 50, 50);
                }else if(altın2.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon11.getY()){
                        altın2.setBounds(400, 450, 50, 50);
                    }else if(altın2.getX()==lokasyon1.getX() && altın2.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon2.getX() && altın2.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon3.getX() && altın2.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon4.getX() && altın2.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon5.getX()&& altın2.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon6.getX() && altın2.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon7.getX() && altın2.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon8.getX() && altın2.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon9.getX() && altın2.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon10.getX() && altın2.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon11.getX() && altın2.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon12.getX() && altın2.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon13.getX() && altın2.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon14.getX() && altın2.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon15.getX()&& altın2.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon16.getX() && altın2.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon17.getX() && altın2.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon18.getX()&& altın2.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın2.getX()==lokasyon19.getX() && altın2.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon20.getX() && altın2.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon21.getX() && altın2.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon22.getX() && altın2.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon23.getX() && altın2.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon24.getX() && altın2.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon25.getX() && altın2.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon26.getX() && altın2.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın2.setBounds(250, 300, 50, 50);
                }else if(altın2.getX()==lokasyon1.getX() && altın2.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon2.getX() && altın2.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon3.getX() && altın2.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon4.getX() && altın2.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon5.getX()&& altın2.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon6.getX() && altın2.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon7.getX() && altın2.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon8.getX() && altın2.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon9.getX() && altın2.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon10.getX() && altın2.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon11.getX() && altın2.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon12.getX() && altın2.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon13.getX() && altın2.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon14.getX() && altın2.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon15.getX()&& altın2.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon16.getX() && altın2.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon17.getX() && altın2.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon18.getX()&& altın2.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın2.getX()==lokasyon19.getX() && altın2.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon20.getX() && altın2.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon21.getX() && altın2.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon22.getX() && altın2.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon23.getX() && altın2.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon24.getX() && altın2.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon25.getX() && altın2.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon26.getX() && altın2.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın2.setBounds(550, 400, 50, 50);
                }else altın2.setBounds(ax2+randoms2.get(art)*50, ay2, 50, 50);
                    
                    
                    if(altın3.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon1.getY()|| altın3.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon2.getY()||altın3.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon3.getY()|| altın3.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon4.getY()||altın3.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon5.getY()|| altın3.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon6.getY()||altın3.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon7.getY()|| altın3.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon8.getY()||altın3.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon9.getY()|| altın3.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon10.getY()||altın3.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon11.getY()|| altın3.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon12.getY()||altın3.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon13.getY()|| altın3.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon14.getY()||altın3.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon15.getY()|| altın3.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon16.getY()||altın3.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon17.getY()|| altın3.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon18.getY()||altın3.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon19.getY()|| altın3.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon20.getY()||altın3.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon21.getY()|| altın3.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon22.getY()||altın3.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon23.getY()|| altın3.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon24.getY()||altın3.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon25.getY()||altın3.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon26.getY()){
                    altın3.setBounds(100,50, 50, 50);
                }else if(ax3>=550-randoms2.get(art)*50){
                           
                            altın3.setBounds(250, 100, 50, 50);
                       }else if(ax3<=50-randoms2.get(art)*50){
                           
                            altın3.setBounds(200, 450, 50, 50);
                       }else if(ay3<=50-randoms2.get(art)*50){
                          
                            altın3.setBounds(300, 350, 50, 50);
                       }else if(ay3>=500-randoms2.get(art)*50){
                          
                            altın3.setBounds(400, 300, 50, 50);
                       }else if(altın3.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon1.getY()|| altın3.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon2.getY()||altın3.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon3.getY()|| altın3.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon4.getY()||altın3.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon5.getY()|| altın3.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon6.getY()||altın3.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon7.getY()|| altın3.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon8.getY()||altın3.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon9.getY()|| altın3.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon10.getY()|| altın3.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon12.getY()||altın3.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon13.getY()|| altın3.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon14.getY()||altın3.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon15.getY()|| altın3.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon16.getY()||altın3.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon17.getY()|| altın3.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon18.getY()||altın3.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon19.getY()|| altın3.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon20.getY()||altın3.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon21.getY()|| altın3.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon22.getY()||altın3.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon23.getY()|| altın3.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon24.getY()||altın3.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon25.getY()){
                     altın3.setBounds(400, 150, 50, 50);
                }else if(altın3.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon11.getY()){
                        altın3.setBounds(500, 250, 50, 50);
                    }else if(altın3.getX()==lokasyon1.getX() && altın3.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon2.getX() && altın3.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon3.getX() && altın3.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon4.getX() && altın3.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon5.getX()&& altın3.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon6.getX() && altın3.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon7.getX() && altın3.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon8.getX() && altın3.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon9.getX() && altın3.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon10.getX() && altın3.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon11.getX() && altın3.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon12.getX() && altın3.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon13.getX() && altın3.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon14.getX() && altın3.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon15.getX()&& altın3.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon16.getX() && altın3.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon17.getX() && altın3.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon18.getX()&& altın3.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın3.getX()==lokasyon19.getX() && altın3.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon20.getX() && altın3.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon21.getX() && altın3.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon22.getX() && altın3.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon23.getX() && altın3.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon24.getX() && altın3.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon25.getX() && altın3.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon26.getX() && altın3.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın3.setBounds(150, 250, 50, 50);
                }else if(altın3.getX()==lokasyon1.getX() && altın3.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon2.getX() && altın3.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon3.getX() && altın3.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon4.getX() && altın3.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon5.getX()&& altın3.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon6.getX() && altın3.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon7.getX() && altın3.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon8.getX() && altın3.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon9.getX() && altın3.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon10.getX() && altın3.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon11.getX() && altın3.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon12.getX() && altın3.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon13.getX() && altın3.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon14.getX() && altın3.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon15.getX()&& altın3.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon16.getX() && altın3.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon17.getX() && altın3.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon18.getX()&& altın3.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın3.getX()==lokasyon19.getX() && altın3.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon20.getX() && altın3.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon21.getX() && altın3.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon22.getX() && altın3.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon23.getX() && altın3.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon24.getX() && altın3.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon25.getX() && altın3.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon26.getX() && altın3.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın3.setBounds(50, 350, 50, 50);
                }else altın3.setBounds(ax3+randoms2.get(art)*50, ay3, 50, 50);

                    
                    if(altın4.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon1.getY()|| altın4.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon2.getY()||altın4.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon3.getY()|| altın4.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon4.getY()||altın4.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon5.getY()|| altın4.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon6.getY()||altın4.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon7.getY()|| altın4.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon8.getY()||altın4.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon9.getY()|| altın4.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon10.getY()||altın4.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon11.getY()|| altın4.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon12.getY()||altın4.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon13.getY()|| altın4.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon14.getY()||altın4.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon15.getY()|| altın4.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon16.getY()||altın4.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon17.getY()|| altın4.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon18.getY()||altın4.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon19.getY()|| altın4.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon20.getY()||altın4.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon21.getY()|| altın4.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon22.getY()||altın4.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon23.getY()|| altın4.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon24.getY()||altın4.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon25.getY()||altın4.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon26.getY()){
                    altın4.setBounds(150,50, 50, 50);
                }else if(ax4>=550-randoms2.get(art)*50){
                           
                            altın4.setBounds(350, 50, 50, 50);
                       }else if(ax4<=50-randoms2.get(art)*50){
                          
                            altın4.setBounds(50, 100, 50, 50);
                       }else if(ay4<=50-randoms2.get(art)*50){
                           
                            altın4.setBounds(400, 100, 50, 50);
                       }else if(ay4>=500-randoms2.get(art)*50){
                         
                            altın4.setBounds(550, 100, 50, 50);
                       }else if(altın4.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon1.getY()|| altın4.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon2.getY()||altın4.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon3.getY()|| altın4.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon4.getY()||altın4.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon5.getY()|| altın4.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon6.getY()||altın4.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon7.getY()|| altın4.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon8.getY()||altın4.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon9.getY()|| altın4.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon10.getY()|| altın4.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon12.getY()||altın4.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon13.getY()|| altın4.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon14.getY()||altın4.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon15.getY()|| altın4.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon16.getY()||altın4.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon17.getY()|| altın4.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon18.getY()||altın4.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon19.getY()|| altın4.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon20.getY()||altın4.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon21.getY()|| altın4.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon22.getY()||altın4.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon23.getY()|| altın4.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon24.getY()||altın4.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon25.getY()||altın4.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon26.getY()){
                     altın4.setBounds(100, 150, 50, 50);
                }else if(altın4.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon11.getY()){
                        altın4.setBounds(150, 350, 50, 50);
                    }else if(altın4.getX()==lokasyon1.getX() && altın4.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon2.getX() && altın4.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon3.getX() && altın4.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon4.getX() && altın4.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon5.getX()&& altın4.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon6.getX() && altın4.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon7.getX() && altın4.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon8.getX() && altın4.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon9.getX() && altın4.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon10.getX() && altın4.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon11.getX() && altın4.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon12.getX() && altın4.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon13.getX() && altın4.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon14.getX() && altın4.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon15.getX()&& altın4.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon16.getX() && altın4.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon17.getX() && altın4.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon18.getX()&& altın4.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın4.getX()==lokasyon19.getX() && altın4.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon20.getX() && altın4.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon21.getX() && altın4.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon22.getX() && altın4.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon23.getX() && altın4.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon24.getX() && altın4.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon25.getX() && altın4.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon26.getX() && altın4.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın4.setBounds(300, 450, 50, 50);
                }else if(altın4.getX()==lokasyon1.getX() && altın4.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon2.getX() && altın4.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon3.getX() && altın4.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon4.getX() && altın4.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon5.getX()&& altın4.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon6.getX() && altın4.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon7.getX() && altın4.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon8.getX() && altın4.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon9.getX() && altın4.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon10.getX() && altın4.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon11.getX() && altın4.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon12.getX() && altın4.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon13.getX() && altın4.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon14.getX() && altın4.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon15.getX()&& altın4.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon16.getX() && altın4.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon17.getX() && altın4.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon18.getX()&& altın4.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın4.getX()==lokasyon19.getX() && altın4.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon20.getX() && altın4.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon21.getX() && altın4.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon22.getX() && altın4.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon23.getX() && altın4.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon24.getX() && altın4.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon25.getX() && altın4.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon26.getX() && altın4.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın4.setBounds(550, 450, 50, 50);
                }else altın4.setBounds(ax4+randoms2.get(art)*50, ay4, 50, 50);
                    
                    
                    if(altın5.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon1.getY()|| altın5.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon2.getY()||altın5.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon3.getY()|| altın5.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon4.getY()||altın5.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon5.getY()|| altın5.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon6.getY()||altın5.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon7.getY()|| altın5.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon8.getY()||altın5.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon9.getY()|| altın5.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon10.getY()||altın5.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon11.getY()|| altın5.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon12.getY()||altın5.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon13.getY()|| altın5.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon14.getY()||altın5.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon15.getY()|| altın5.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon16.getY()||altın5.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon17.getY()|| altın5.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon18.getY()||altın5.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon19.getY()|| altın5.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon20.getY()||altın5.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon21.getY()|| altın5.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon22.getY()||altın5.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon23.getY()|| altın5.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon24.getY()||altın5.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon25.getY()||altın5.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon26.getY()){
                    altın5.setBounds(450,50, 50, 50);
                }else if(ax5>=550-randoms2.get(art)*50){
                           
                            altın5.setBounds(100, 450, 50, 50);
                       }else if(ax5<=50-randoms2.get(art)*50){
                           
                            altın5.setBounds(450, 450, 50, 50);
                       }else if(ay5<=50-randoms2.get(art)*50){
                           
                            altın5.setBounds(500, 400, 50, 50);
                       }else if(ay5>=500-randoms2.get(art)*50){
                           
                            altın5.setBounds(550, 300, 50, 50);
                       }else if(altın5.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon1.getY()|| altın5.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon2.getY()||altın5.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon3.getY()|| altın5.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon4.getY()||altın5.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon5.getY()|| altın5.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon6.getY()||altın5.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon7.getY()|| altın5.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon8.getY()||altın5.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon9.getY()|| altın5.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon10.getY()|| altın5.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon12.getY()||altın5.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon13.getY()|| altın5.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon14.getY()||altın5.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon15.getY()|| altın5.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon16.getY()||altın5.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon17.getY()|| altın5.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon18.getY()||altın5.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon19.getY()|| altın5.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon20.getY()||altın5.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon21.getY()|| altın5.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon22.getY()||altın5.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon23.getY()|| altın5.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon24.getY()||altın5.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon25.getY()||altın5.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon26.getY()){
                     altın5.setBounds(450, 300, 50, 50);
                }else if(altın5.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon11.getY()){
                        altın5.setBounds(200, 300, 50, 50);
                    }else if(altın5.getX()==lokasyon1.getX() && altın5.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon2.getX() && altın5.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon3.getX() && altın5.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon4.getX() && altın5.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon5.getX()&& altın5.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon6.getX() && altın5.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon7.getX() && altın5.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon8.getX() && altın5.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon9.getX() && altın5.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon10.getX() && altın5.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon11.getX() && altın5.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon12.getX() && altın5.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon13.getX() && altın5.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon14.getX() && altın5.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon15.getX()&& altın5.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon16.getX() && altın5.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon17.getX() && altın5.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon18.getX()&& altın5.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın5.getX()==lokasyon19.getX() && altın5.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon20.getX() && altın5.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon21.getX() && altın5.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon22.getX() && altın5.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon23.getX() && altın5.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon24.getX() && altın5.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon25.getX() && altın5.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon26.getX() && altın5.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın5.setBounds(250, 250, 50, 50);
                }else if(altın5.getX()==lokasyon1.getX() && altın5.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon2.getX() && altın5.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon3.getX() && altın5.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon4.getX() && altın5.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon5.getX()&& altın5.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon6.getX() && altın5.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon7.getX() && altın5.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon8.getX() && altın5.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon9.getX() && altın5.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon10.getX() && altın5.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon11.getX() && altın5.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon12.getX() && altın5.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon13.getX() && altın5.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon14.getX() && altın5.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon15.getX()&& altın5.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon16.getX() && altın5.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon17.getX() && altın5.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon18.getX()&& altın5.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın5.getX()==lokasyon19.getX() && altın5.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon20.getX() && altın5.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon21.getX() && altın5.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon22.getX() && altın5.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon23.getX() && altın5.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon24.getX() && altın5.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon25.getX() && altın5.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon26.getX() && altın5.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın5.setBounds(50, 200, 50, 50);
                }else if(altın5.getBounds().equals(altın4.getBounds()) || altın5.getBounds().equals(altın3.getBounds()) || altın5.getBounds().equals(altın2.getBounds()) || altın5.getBounds().equals(altın1.getBounds())|| altın5.getBounds().equals(mantar.getBounds())){
                    altın5.setBounds(500,50,50,50);
                }else if(altın4.getBounds().equals(altın3.getBounds()) || altın4.getBounds().equals(altın2.getBounds()) || altın4.getBounds().equals(altın1.getBounds())|| altın4.getBounds().equals(mantar.getBounds())){
                    altın4.setBounds(400,200,50,50);
                }else if(altın3.getBounds().equals(altın2.getBounds()) || altın3.getBounds().equals(altın1.getBounds())|| altın3.getBounds().equals(mantar.getBounds())){
                    altın3.setBounds(400,350,50,50);
                }else if(altın2.getBounds().equals(altın1.getBounds()) || altın2.getBounds().equals(mantar.getBounds())){
                    altın2.setBounds(300,150,50,50);
                }else if(altın1.getBounds().equals(mantar.getBounds())){
                    altın1.setBounds(450,400,50,50);
                }
                else altın5.setBounds(ax5+randoms2.get(art)*50, ay5, 50, 50);

                    
            }
        };
         
         myTimer2.schedule(gorev2,0,altın.getSure());
        
    }//GEN-LAST:event_tembelbutonuActionPerformed

    private void gozluklubutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gozluklubutonuActionPerformed
        // TODO add your handling code here:
        tembelbutonu.setVisible(false);
        gozluklubutonu.setVisible(false);
        ImageIcon imggozlukluortada = new javax.swing.ImageIcon(getClass().getResource("/images/gozlukluortada.png"));
        ImageIcon imggargamel = new javax.swing.ImageIcon(getClass().getResource("/images/gargamel.png"));
        ImageIcon imgazman = new javax.swing.ImageIcon(getClass().getResource("/images/azman.png"));
        ortadaki.setIcon(imggozlukluortada);
        
        Oyuncu.GozlukluSirin GozlukluSirin=new Oyuncu().new GozlukluSirin(100,20);
        Oyun.hız=GozlukluSirin.getHız();
        Oyun.skor=GozlukluSirin.getpuan();
        int puan1=GozlukluSirin.getpuan();
        Oyuncu.Puan puan =new Oyuncu().new Puan(puan1);
        Oyun.skor=puan1;
        Obje.altın altın=new Obje().new altın(5000,5);
        
        Obje.mantar Mantar = new Obje().new mantar(7000);
        
        if(satir1.equals("Karakter:Gargamel,Kapi:A")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
        }
        else if(satir1.equals("Karakter:Gargamel,Kapi:B")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
            uyarı.setText("!!!Gargamel B kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir1.equals("Karakter:Gargamel,Kapi:C")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=0;
            gargamely=250;
            uyarı.setText("!!!Gargamel C kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir1.equals("Karakter:Gargamel,Kapi:D")){
            gargameloyun.setBounds(150, 500, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=500;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:A")){
            azmanoyun.setBounds(150, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=0;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:B")){
           azmanoyun.setBounds(500, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=500;
            azmany=0;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:C")){
            azmanoyun.setBounds(0, 250, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=0;
            azmany=250;
        }
        else if(satir1.equals("Karakter:Azman,Kapi:D")){
           azmanoyun.setBounds(150, 500, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=500;
        }
       if(satir2.equals("Karakter:Gargamel,Kapi:A")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:B")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=0;
            uyarı.setText("!!!Gargamel B kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:C")){
            gargameloyun.setBounds(150, 0, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=0;
            gargamely=250;
            uyarı.setText("!!!Gargamel C kapısından giriş yapamadığı için A kapısına yönlendirildi!!!");
        }
        else if(satir2.equals("Karakter:Gargamel,Kapi:D")){
            gargameloyun.setBounds(150, 500, 50, 50);
            gargameloyun.setIcon(imggargamel);
            gargamelx=150;
            gargamely=500;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:A")){
            azmanoyun.setBounds(150, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=0;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:B")){
            azmanoyun.setBounds(500, 0, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=500;
            azmany=0;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:C")){
            azmanoyun.setBounds(0, 250, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=0;
            azmany=250;
        }
        else if(satir2.equals("Karakter:Azman,Kapi:D")){
            azmanoyun.setBounds(150, 500, 50, 50);
            azmanoyun.setIcon(imgazman);
            azmanx=150;
            azmany=500;
        }
        
         
        ArrayList<Integer> randoms2 = new ArrayList<Integer>();
        randoms2.add(1);
        randoms2.add(2);
        randoms2.add(3);
        randoms2.add(4);
        randoms2.add(-1);
        randoms2.add(-2);
        randoms2.add(-3);
        randoms2.add(-4);
        
        Collections.shuffle(randoms2);
        
        Timer myTimer=new Timer();
       TimerTask gorev=new TimerTask() {
            @Override
            public void run() {
                
                ImageIcon imgmantar = new javax.swing.ImageIcon(getClass().getResource("/images/mantar.png"));
                
                    mantar.setIcon(imgmantar);
                    
                    sayac++;
                    
                    if(sayac%8==0){
                       Collections.shuffle(randoms2);
                       art=-1;
                    }
                    art++;
                    
                       a = (int) mantar.getBounds().getX();
                       b = (int) mantar.getBounds().getY();
                       
                        
                        
                        if(mantar.getX()==lokasyon1.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon1.getY()|| mantar.getX()==lokasyon2.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon2.getY()||mantar.getX()==lokasyon3.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon3.getY()|| mantar.getX()==lokasyon4.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon4.getY()||mantar.getX()==lokasyon5.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon5.getY()|| mantar.getX()==lokasyon6.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon6.getY()||mantar.getX()==lokasyon7.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon7.getY()|| mantar.getX()==lokasyon8.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon8.getY()||mantar.getX()==lokasyon9.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon9.getY()|| mantar.getX()==lokasyon10.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon10.getY()||mantar.getX()==lokasyon11.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon11.getY()|| mantar.getX()==lokasyon12.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon12.getY()||mantar.getX()==lokasyon13.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon13.getY()|| mantar.getX()==lokasyon14.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon14.getY()||mantar.getX()==lokasyon15.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon15.getY()|| mantar.getX()==lokasyon16.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon16.getY()||mantar.getX()==lokasyon17.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon17.getY()|| mantar.getX()==lokasyon18.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon18.getY()||mantar.getX()==lokasyon19.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon19.getY()|| mantar.getX()==lokasyon20.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon20.getY()||mantar.getX()==lokasyon21.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon21.getY()|| mantar.getX()==lokasyon22.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon22.getY()||mantar.getX()==lokasyon23.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon23.getY()|| mantar.getX()==lokasyon24.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon24.getY()||mantar.getX()==lokasyon25.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon25.getY()||mantar.getX()==lokasyon26.getX()-randoms2.get(art)*50 && mantar.getY()==lokasyon26.getY()){
                    mantar.setBounds(550, 50, 50, 50);
                }else if(a>=550-randoms2.get(art)*50){
                           
                            mantar.setBounds(250, 350, 50, 50);
                       } 
                else if(a<=50-randoms2.get(art)*50){
                           
                            mantar.setBounds(200, 100, 50, 50);
                       } 
                else if(b<=50-randoms2.get(art)*50){
                           
                            mantar.setBounds(50, 300, 50, 50);
                       } 
                else if(b>=500-randoms2.get(art)*50){
                           
                            mantar.setBounds(400, 250, 50, 50);
                       } 
                    else if(mantar.getX()==lokasyon1.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon1.getY()|| mantar.getX()==lokasyon2.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon2.getY()||mantar.getX()==lokasyon3.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon3.getY()|| mantar.getX()==lokasyon4.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon4.getY()||mantar.getX()==lokasyon5.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon5.getY()|| mantar.getX()==lokasyon6.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon6.getY()||mantar.getX()==lokasyon7.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon7.getY()|| mantar.getX()==lokasyon8.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon8.getY()||mantar.getX()==lokasyon9.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon9.getY()|| mantar.getX()==lokasyon10.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon10.getY()|| mantar.getX()==lokasyon12.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon12.getY()||mantar.getX()==lokasyon13.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon13.getY()|| mantar.getX()==lokasyon14.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon14.getY()||mantar.getX()==lokasyon15.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon15.getY()|| mantar.getX()==lokasyon16.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon16.getY()||mantar.getX()==lokasyon17.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon17.getY()|| mantar.getX()==lokasyon18.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon18.getY()||mantar.getX()==lokasyon19.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon19.getY()|| mantar.getX()==lokasyon20.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon20.getY()||mantar.getX()==lokasyon21.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon21.getY()|| mantar.getX()==lokasyon22.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon22.getY()||mantar.getX()==lokasyon23.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon23.getY()|| mantar.getX()==lokasyon24.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon24.getY()||mantar.getX()==lokasyon25.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon25.getY()||mantar.getX()==lokasyon26.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon26.getY()){
                     mantar.setBounds(450, 350, 50, 50);
                }
                    else if(mantar.getX()==lokasyon11.getX()+randoms2.get(art)*50 && mantar.getY()==lokasyon11.getY()){
                        mantar.setBounds(200, 150, 50, 50);
                    }
                    else if(mantar.getX()==lokasyon1.getX() && mantar.getY()==lokasyon1.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon2.getX() && mantar.getY()==lokasyon2.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon3.getX() && mantar.getY()==lokasyon3.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon4.getX() && mantar.getY()==lokasyon4.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon5.getX()&& mantar.getY()==lokasyon5.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon6.getX() && mantar.getY()==lokasyon6.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon7.getX() && mantar.getY()==lokasyon7.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon8.getX() && mantar.getY()==lokasyon8.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon9.getX() && mantar.getY()==lokasyon9.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon10.getX() && mantar.getY()==lokasyon10.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon11.getX() && mantar.getY()==lokasyon11.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon12.getX() && mantar.getY()==lokasyon12.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon13.getX() && mantar.getY()==lokasyon13.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon14.getX() && mantar.getY()==lokasyon14.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon15.getX()&& mantar.getY()==lokasyon15.getY()-randoms2.get(art)*50 || mantar.getX()==lokasyon16.getX() && mantar.getY()==lokasyon16.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon17.getX() && mantar.getY()==lokasyon17.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon18.getX()&& mantar.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||mantar.getX()==lokasyon19.getX() && mantar.getY()==lokasyon19.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon20.getX() && mantar.getY()==lokasyon20.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon21.getX() && mantar.getY()==lokasyon21.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon22.getX() && mantar.getY()==lokasyon22.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon23.getX() && mantar.getY()==lokasyon23.getY()-randoms2.get(art)*50|| mantar.getX()==lokasyon24.getX() && mantar.getY()==lokasyon24.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon25.getX() && mantar.getY()==lokasyon25.getY()-randoms2.get(art)*50||mantar.getX()==lokasyon26.getX() && mantar.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    mantar.setBounds(300, 200, 50, 50);
                }
                     else if(mantar.getX()==lokasyon1.getX() && mantar.getY()==lokasyon1.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon2.getX() && mantar.getY()==lokasyon2.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon3.getX() && mantar.getY()==lokasyon3.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon4.getX() && mantar.getY()==lokasyon4.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon5.getX()&& mantar.getY()==lokasyon5.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon6.getX() && mantar.getY()==lokasyon6.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon7.getX() && mantar.getY()==lokasyon7.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon8.getX() && mantar.getY()==lokasyon8.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon9.getX() && mantar.getY()==lokasyon9.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon10.getX() && mantar.getY()==lokasyon10.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon11.getX() && mantar.getY()==lokasyon11.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon12.getX() && mantar.getY()==lokasyon12.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon13.getX() && mantar.getY()==lokasyon13.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon14.getX() && mantar.getY()==lokasyon14.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon15.getX()&& mantar.getY()==lokasyon15.getY()+randoms2.get(art)*50 || mantar.getX()==lokasyon16.getX() && mantar.getY()==lokasyon16.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon17.getX() && mantar.getY()==lokasyon17.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon18.getX()&& mantar.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||mantar.getX()==lokasyon19.getX() && mantar.getY()==lokasyon19.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon20.getX() && mantar.getY()==lokasyon20.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon21.getX() && mantar.getY()==lokasyon21.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon22.getX() && mantar.getY()==lokasyon22.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon23.getX() && mantar.getY()==lokasyon23.getY()+randoms2.get(art)*50|| mantar.getX()==lokasyon24.getX() && mantar.getY()==lokasyon24.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon25.getX() && mantar.getY()==lokasyon25.getY()+randoms2.get(art)*50||mantar.getX()==lokasyon26.getX() && mantar.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    mantar.setBounds(350, 450, 50, 50);
                }
                    else mantar.setBounds(a+randoms2.get(art)*50, b, 50, 50);
                     
                        
            }
            
        };
      
         myTimer.schedule(gorev,0,Mantar.getSure());
          
         
         Timer myTimer2=new Timer();
       TimerTask gorev2=new TimerTask() {
            @Override
            public void run() {
                ImageIcon imgaltın = new javax.swing.ImageIcon(getClass().getResource("/images/altın.png"));
                altın1.setIcon(imgaltın); altın2.setIcon(imgaltın); altın3.setIcon(imgaltın); altın4.setIcon(imgaltın); altın5.setIcon(imgaltın);
                
                sayac++;
                    
                    if(sayac%8==0){
                       Collections.shuffle(randoms2);
                       art=-1;
                    }
                    art++;
                    
                    ax1 = (int) altın1.getBounds().getX();  ax2 = (int) altın2.getBounds().getX();  ax3 = (int) altın3.getBounds().getX();  ax4 = (int) altın4.getBounds().getX();  ax5 = (int) altın5.getBounds().getX();
                    ay1 = (int) altın1.getBounds().getY();  ay2 = (int) altın2.getBounds().getY();  ay3 = (int) altın3.getBounds().getY();  ay4 = (int) altın4.getBounds().getY();  ay5 = (int) altın5.getBounds().getY();  
                
                    if(altın1.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon1.getY()|| altın1.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon2.getY()||altın1.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon3.getY()|| altın1.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon4.getY()||altın1.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon5.getY()|| altın1.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon6.getY()||altın1.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon7.getY()|| altın1.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon8.getY()||altın1.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon9.getY()|| altın1.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon10.getY()||altın1.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon11.getY()|| altın1.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon12.getY()||altın1.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon13.getY()|| altın1.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon14.getY()||altın1.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon15.getY()|| altın1.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon16.getY()||altın1.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon17.getY()|| altın1.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon18.getY()||altın1.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon19.getY()|| altın1.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon20.getY()||altın1.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon21.getY()|| altın1.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon22.getY()||altın1.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon23.getY()|| altın1.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon24.getY()||altın1.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon25.getY()||altın1.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın1.getY()==lokasyon26.getY()){
                    altın1.setBounds(450,150, 50, 50);
                }else if(ax1>=550-randoms2.get(art)*50){
                           
                            altın1.setBounds(350, 100, 50, 50);
                       }else if(ax1<=50-randoms2.get(art)*50){
                           
                            altın1.setBounds(50, 150, 50, 50);
                       }else if(ay1<=50-randoms2.get(art)*50){
                           
                            altın1.setBounds(250, 450, 50, 50);
                       }else if(ay1>=500-randoms2.get(art)*50){
                           
                            altın1.setBounds(200, 250, 50, 50);
                       }else if(altın1.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon1.getY()|| altın1.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon2.getY()||altın1.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon3.getY()|| altın1.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon4.getY()||altın1.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon5.getY()|| altın1.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon6.getY()||altın1.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon7.getY()|| altın1.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon8.getY()||altın1.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon9.getY()|| altın1.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon10.getY()|| altın1.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon12.getY()||altın1.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon13.getY()|| altın1.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon14.getY()||altın1.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon15.getY()|| altın1.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon16.getY()||altın1.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon17.getY()|| altın1.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon18.getY()||altın1.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon19.getY()|| altın1.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon20.getY()||altın1.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon21.getY()|| altın1.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon22.getY()||altın1.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon23.getY()|| altın1.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon24.getY()||altın1.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon25.getY()||altın1.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon26.getY()){
                     altın1.setBounds(550, 250, 50, 50);
                }else if(altın1.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın1.getY()==lokasyon11.getY()){
                        altın1.setBounds(50, 450, 50, 50);
                    }else if(altın1.getX()==lokasyon1.getX() && altın1.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon2.getX() && altın1.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon3.getX() && altın1.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon4.getX() && altın1.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon5.getX()&& altın1.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon6.getX() && altın1.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon7.getX() && altın1.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon8.getX() && altın1.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon9.getX() && altın1.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon10.getX() && altın1.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon11.getX() && altın1.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon12.getX() && altın1.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon13.getX() && altın1.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon14.getX() && altın1.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon15.getX()&& altın1.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın1.getX()==lokasyon16.getX() && altın1.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon17.getX() && altın1.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon18.getX()&& altın1.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın1.getX()==lokasyon19.getX() && altın1.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon20.getX() && altın1.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon21.getX() && altın1.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon22.getX() && altın1.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon23.getX() && altın1.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın1.getX()==lokasyon24.getX() && altın1.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon25.getX() && altın1.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın1.getX()==lokasyon26.getX() && altın1.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın1.setBounds(50, 50, 50, 50);
                }else if(altın1.getX()==lokasyon1.getX() && altın1.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon2.getX() && altın1.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon3.getX() && altın1.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon4.getX() && altın1.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon5.getX()&& altın1.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon6.getX() && altın1.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon7.getX() && altın1.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon8.getX() && altın1.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon9.getX() && altın1.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon10.getX() && altın1.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon11.getX() && altın1.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon12.getX() && altın1.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon13.getX() && altın1.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon14.getX() && altın1.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon15.getX()&& altın1.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın1.getX()==lokasyon16.getX() && altın1.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon17.getX() && altın1.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon18.getX()&& altın1.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın1.getX()==lokasyon19.getX() && altın1.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon20.getX() && altın1.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon21.getX() && altın1.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon22.getX() && altın1.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon23.getX() && altın1.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın1.getX()==lokasyon24.getX() && altın1.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon25.getX() && altın1.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın1.getX()==lokasyon26.getX() && altın1.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın1.setBounds(500, 450, 50, 50);
                }else altın1.setBounds(ax1+randoms2.get(art)*50, ay1, 50, 50);   
                    
                    
                    if(altın2.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon1.getY()|| altın2.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon2.getY()||altın2.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon3.getY()|| altın2.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon4.getY()||altın2.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon5.getY()|| altın2.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon6.getY()||altın2.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon7.getY()|| altın2.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon8.getY()||altın2.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon9.getY()|| altın2.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon10.getY()||altın2.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon11.getY()|| altın2.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon12.getY()||altın2.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon13.getY()|| altın2.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon14.getY()||altın2.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon15.getY()|| altın2.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon16.getY()||altın2.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon17.getY()|| altın2.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon18.getY()||altın2.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon19.getY()|| altın2.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon20.getY()||altın2.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon21.getY()|| altın2.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon22.getY()||altın2.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon23.getY()|| altın2.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon24.getY()||altın2.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon25.getY()||altın2.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın2.getY()==lokasyon26.getY()){
                    altın2.setBounds(200,50, 50, 50);
                }else if(ax2>=550-randoms2.get(art)*50){
                           
                            altın2.setBounds(300, 50, 50, 50);
                       }else if(ax2<=50-randoms2.get(art)*50){
                           
                            altın2.setBounds(400, 50, 50, 50);
                       }else if(ay2<=50-randoms2.get(art)*50){
                           
                            altın2.setBounds(550, 150, 50, 50);
                       }else if(ay2>=500-randoms2.get(art)*50){
                           
                            altın2.setBounds(350, 350, 50, 50);
                       }else if(altın2.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon1.getY()|| altın2.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon2.getY()||altın2.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon3.getY()|| altın2.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon4.getY()||altın2.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon5.getY()|| altın2.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon6.getY()||altın2.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon7.getY()|| altın2.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon8.getY()||altın2.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon9.getY()|| altın2.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon10.getY()|| altın2.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon12.getY()||altın2.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon13.getY()|| altın2.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon14.getY()||altın2.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon15.getY()|| altın2.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon16.getY()||altın2.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon17.getY()|| altın2.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon18.getY()||altın2.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon19.getY()|| altın2.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon20.getY()||altın2.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon21.getY()|| altın2.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon22.getY()||altın2.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon23.getY()|| altın2.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon24.getY()||altın2.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon25.getY()||altın2.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon26.getY()){
                     altın2.setBounds(50, 400, 50, 50);
                }else if(altın2.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın2.getY()==lokasyon11.getY()){
                        altın2.setBounds(400, 450, 50, 50);
                    }else if(altın2.getX()==lokasyon1.getX() && altın2.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon2.getX() && altın2.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon3.getX() && altın2.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon4.getX() && altın2.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon5.getX()&& altın2.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon6.getX() && altın2.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon7.getX() && altın2.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon8.getX() && altın2.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon9.getX() && altın2.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon10.getX() && altın2.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon11.getX() && altın2.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon12.getX() && altın2.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon13.getX() && altın2.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon14.getX() && altın2.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon15.getX()&& altın2.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın2.getX()==lokasyon16.getX() && altın2.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon17.getX() && altın2.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon18.getX()&& altın2.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın2.getX()==lokasyon19.getX() && altın2.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon20.getX() && altın2.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon21.getX() && altın2.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon22.getX() && altın2.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon23.getX() && altın2.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın2.getX()==lokasyon24.getX() && altın2.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon25.getX() && altın2.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın2.getX()==lokasyon26.getX() && altın2.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın2.setBounds(250, 300, 50, 50);
                }else if(altın2.getX()==lokasyon1.getX() && altın2.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon2.getX() && altın2.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon3.getX() && altın2.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon4.getX() && altın2.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon5.getX()&& altın2.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon6.getX() && altın2.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon7.getX() && altın2.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon8.getX() && altın2.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon9.getX() && altın2.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon10.getX() && altın2.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon11.getX() && altın2.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon12.getX() && altın2.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon13.getX() && altın2.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon14.getX() && altın2.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon15.getX()&& altın2.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın2.getX()==lokasyon16.getX() && altın2.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon17.getX() && altın2.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon18.getX()&& altın2.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın2.getX()==lokasyon19.getX() && altın2.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon20.getX() && altın2.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon21.getX() && altın2.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon22.getX() && altın2.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon23.getX() && altın2.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın2.getX()==lokasyon24.getX() && altın2.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon25.getX() && altın2.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın2.getX()==lokasyon26.getX() && altın2.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın2.setBounds(550, 400, 50, 50);
                }else altın2.setBounds(ax2+randoms2.get(art)*50, ay2, 50, 50);
                    
                    
                    if(altın3.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon1.getY()|| altın3.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon2.getY()||altın3.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon3.getY()|| altın3.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon4.getY()||altın3.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon5.getY()|| altın3.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon6.getY()||altın3.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon7.getY()|| altın3.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon8.getY()||altın3.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon9.getY()|| altın3.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon10.getY()||altın3.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon11.getY()|| altın3.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon12.getY()||altın3.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon13.getY()|| altın3.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon14.getY()||altın3.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon15.getY()|| altın3.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon16.getY()||altın3.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon17.getY()|| altın3.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon18.getY()||altın3.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon19.getY()|| altın3.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon20.getY()||altın3.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon21.getY()|| altın3.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon22.getY()||altın3.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon23.getY()|| altın3.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon24.getY()||altın3.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon25.getY()||altın3.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın3.getY()==lokasyon26.getY()){
                    altın3.setBounds(100,50, 50, 50);
                }else if(ax3>=550-randoms2.get(art)*50){
                           
                            altın3.setBounds(250, 100, 50, 50);
                       }else if(ax3<=50-randoms2.get(art)*50){
                           
                            altın3.setBounds(200, 450, 50, 50);
                       }else if(ay3<=50-randoms2.get(art)*50){
                           
                            altın3.setBounds(300, 350, 50, 50);
                       }else if(ay3>=500-randoms2.get(art)*50){
                           
                            altın3.setBounds(400, 300, 50, 50);
                       }else if(altın3.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon1.getY()|| altın3.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon2.getY()||altın3.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon3.getY()|| altın3.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon4.getY()||altın3.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon5.getY()|| altın3.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon6.getY()||altın3.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon7.getY()|| altın3.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon8.getY()||altın3.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon9.getY()|| altın3.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon10.getY()|| altın3.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon12.getY()||altın3.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon13.getY()|| altın3.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon14.getY()||altın3.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon15.getY()|| altın3.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon16.getY()||altın3.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon17.getY()|| altın3.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon18.getY()||altın3.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon19.getY()|| altın3.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon20.getY()||altın3.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon21.getY()|| altın3.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon22.getY()||altın3.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon23.getY()|| altın3.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon24.getY()||altın3.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon25.getY()){
                     altın3.setBounds(400, 150, 50, 50);
                }else if(altın3.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın3.getY()==lokasyon11.getY()){
                        altın3.setBounds(500, 250, 50, 50);
                    }else if(altın3.getX()==lokasyon1.getX() && altın3.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon2.getX() && altın3.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon3.getX() && altın3.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon4.getX() && altın3.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon5.getX()&& altın3.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon6.getX() && altın3.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon7.getX() && altın3.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon8.getX() && altın3.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon9.getX() && altın3.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon10.getX() && altın3.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon11.getX() && altın3.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon12.getX() && altın3.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon13.getX() && altın3.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon14.getX() && altın3.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon15.getX()&& altın3.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın3.getX()==lokasyon16.getX() && altın3.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon17.getX() && altın3.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon18.getX()&& altın3.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın3.getX()==lokasyon19.getX() && altın3.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon20.getX() && altın3.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon21.getX() && altın3.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon22.getX() && altın3.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon23.getX() && altın3.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın3.getX()==lokasyon24.getX() && altın3.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon25.getX() && altın3.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın3.getX()==lokasyon26.getX() && altın3.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın3.setBounds(150, 250, 50, 50);
                }else if(altın3.getX()==lokasyon1.getX() && altın3.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon2.getX() && altın3.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon3.getX() && altın3.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon4.getX() && altın3.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon5.getX()&& altın3.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon6.getX() && altın3.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon7.getX() && altın3.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon8.getX() && altın3.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon9.getX() && altın3.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon10.getX() && altın3.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon11.getX() && altın3.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon12.getX() && altın3.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon13.getX() && altın3.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon14.getX() && altın3.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon15.getX()&& altın3.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın3.getX()==lokasyon16.getX() && altın3.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon17.getX() && altın3.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon18.getX()&& altın3.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın3.getX()==lokasyon19.getX() && altın3.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon20.getX() && altın3.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon21.getX() && altın3.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon22.getX() && altın3.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon23.getX() && altın3.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın3.getX()==lokasyon24.getX() && altın3.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon25.getX() && altın3.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın3.getX()==lokasyon26.getX() && altın3.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın3.setBounds(50, 350, 50, 50);
                }else altın3.setBounds(ax3+randoms2.get(art)*50, ay3, 50, 50);

                    
                    if(altın4.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon1.getY()|| altın4.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon2.getY()||altın4.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon3.getY()|| altın4.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon4.getY()||altın4.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon5.getY()|| altın4.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon6.getY()||altın4.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon7.getY()|| altın4.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon8.getY()||altın4.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon9.getY()|| altın4.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon10.getY()||altın4.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon11.getY()|| altın4.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon12.getY()||altın4.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon13.getY()|| altın4.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon14.getY()||altın4.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon15.getY()|| altın4.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon16.getY()||altın4.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon17.getY()|| altın4.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon18.getY()||altın4.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon19.getY()|| altın4.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon20.getY()||altın4.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon21.getY()|| altın4.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon22.getY()||altın4.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon23.getY()|| altın4.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon24.getY()||altın4.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon25.getY()||altın4.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın4.getY()==lokasyon26.getY()){
                    altın4.setBounds(150,50, 50, 50);
                }else if(ax4>=550-randoms2.get(art)*50){
                           
                            altın4.setBounds(350, 50, 50, 50);
                       }else if(ax4<=50-randoms2.get(art)*50){
                          
                            altın4.setBounds(50, 100, 50, 50);
                       }else if(ay4<=50-randoms2.get(art)*50){
                           
                            altın4.setBounds(400, 100, 50, 50);
                       }else if(ay4>=500-randoms2.get(art)*50){
                           
                            altın4.setBounds(550, 100, 50, 50);
                       }else if(altın4.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon1.getY()|| altın4.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon2.getY()||altın4.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon3.getY()|| altın4.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon4.getY()||altın4.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon5.getY()|| altın4.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon6.getY()||altın4.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon7.getY()|| altın4.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon8.getY()||altın4.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon9.getY()|| altın4.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon10.getY()|| altın4.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon12.getY()||altın4.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon13.getY()|| altın4.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon14.getY()||altın4.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon15.getY()|| altın4.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon16.getY()||altın4.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon17.getY()|| altın4.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon18.getY()||altın4.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon19.getY()|| altın4.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon20.getY()||altın4.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon21.getY()|| altın4.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon22.getY()||altın4.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon23.getY()|| altın4.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon24.getY()||altın4.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon25.getY()||altın4.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon26.getY()){
                     altın4.setBounds(100, 150, 50, 50);
                }else if(altın4.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın4.getY()==lokasyon11.getY()){
                        altın4.setBounds(150, 350, 50, 50);
                    }else if(altın4.getX()==lokasyon1.getX() && altın4.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon2.getX() && altın4.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon3.getX() && altın4.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon4.getX() && altın4.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon5.getX()&& altın4.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon6.getX() && altın4.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon7.getX() && altın4.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon8.getX() && altın4.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon9.getX() && altın4.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon10.getX() && altın4.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon11.getX() && altın4.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon12.getX() && altın4.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon13.getX() && altın4.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon14.getX() && altın4.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon15.getX()&& altın4.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın4.getX()==lokasyon16.getX() && altın4.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon17.getX() && altın4.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon18.getX()&& altın4.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın4.getX()==lokasyon19.getX() && altın4.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon20.getX() && altın4.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon21.getX() && altın4.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon22.getX() && altın4.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon23.getX() && altın4.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın4.getX()==lokasyon24.getX() && altın4.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon25.getX() && altın4.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın4.getX()==lokasyon26.getX() && altın4.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın4.setBounds(300, 450, 50, 50);
                }else if(altın4.getX()==lokasyon1.getX() && altın4.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon2.getX() && altın4.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon3.getX() && altın4.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon4.getX() && altın4.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon5.getX()&& altın4.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon6.getX() && altın4.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon7.getX() && altın4.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon8.getX() && altın4.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon9.getX() && altın4.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon10.getX() && altın4.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon11.getX() && altın4.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon12.getX() && altın4.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon13.getX() && altın4.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon14.getX() && altın4.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon15.getX()&& altın4.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın4.getX()==lokasyon16.getX() && altın4.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon17.getX() && altın4.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon18.getX()&& altın4.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın4.getX()==lokasyon19.getX() && altın4.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon20.getX() && altın4.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon21.getX() && altın4.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon22.getX() && altın4.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon23.getX() && altın4.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın4.getX()==lokasyon24.getX() && altın4.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon25.getX() && altın4.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın4.getX()==lokasyon26.getX() && altın4.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın4.setBounds(550, 450, 50, 50);
                }else altın4.setBounds(ax4+randoms2.get(art)*50, ay4, 50, 50);
                    
                    
                    if(altın5.getX()==lokasyon1.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon1.getY()|| altın5.getX()==lokasyon2.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon2.getY()||altın5.getX()==lokasyon3.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon3.getY()|| altın5.getX()==lokasyon4.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon4.getY()||altın5.getX()==lokasyon5.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon5.getY()|| altın5.getX()==lokasyon6.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon6.getY()||altın5.getX()==lokasyon7.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon7.getY()|| altın5.getX()==lokasyon8.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon8.getY()||altın5.getX()==lokasyon9.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon9.getY()|| altın5.getX()==lokasyon10.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon10.getY()||altın5.getX()==lokasyon11.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon11.getY()|| altın5.getX()==lokasyon12.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon12.getY()||altın5.getX()==lokasyon13.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon13.getY()|| altın5.getX()==lokasyon14.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon14.getY()||altın5.getX()==lokasyon15.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon15.getY()|| altın5.getX()==lokasyon16.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon16.getY()||altın5.getX()==lokasyon17.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon17.getY()|| altın5.getX()==lokasyon18.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon18.getY()||altın5.getX()==lokasyon19.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon19.getY()|| altın5.getX()==lokasyon20.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon20.getY()||altın5.getX()==lokasyon21.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon21.getY()|| altın5.getX()==lokasyon22.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon22.getY()||altın5.getX()==lokasyon23.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon23.getY()|| altın5.getX()==lokasyon24.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon24.getY()||altın5.getX()==lokasyon25.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon25.getY()||altın5.getX()==lokasyon26.getX()-randoms2.get(art)*50 && altın5.getY()==lokasyon26.getY()){
                    altın5.setBounds(450,50, 50, 50);
                }else if(ax5>=550-randoms2.get(art)*50){
                           
                            altın5.setBounds(100, 450, 50, 50);
                       }else if(ax5<=50-randoms2.get(art)*50){
                           
                            altın5.setBounds(450, 450, 50, 50);
                       }else if(ay5<=50-randoms2.get(art)*50){
                           
                            altın5.setBounds(500, 400, 50, 50);
                       }else if(ay5>=500-randoms2.get(art)*50){
                           
                            altın5.setBounds(550, 300, 50, 50);
                       }else if(altın5.getX()==lokasyon1.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon1.getY()|| altın5.getX()==lokasyon2.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon2.getY()||altın5.getX()==lokasyon3.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon3.getY()|| altın5.getX()==lokasyon4.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon4.getY()||altın5.getX()==lokasyon5.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon5.getY()|| altın5.getX()==lokasyon6.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon6.getY()||altın5.getX()==lokasyon7.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon7.getY()|| altın5.getX()==lokasyon8.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon8.getY()||altın5.getX()==lokasyon9.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon9.getY()|| altın5.getX()==lokasyon10.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon10.getY()|| altın5.getX()==lokasyon12.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon12.getY()||altın5.getX()==lokasyon13.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon13.getY()|| altın5.getX()==lokasyon14.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon14.getY()||altın5.getX()==lokasyon15.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon15.getY()|| altın5.getX()==lokasyon16.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon16.getY()||altın5.getX()==lokasyon17.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon17.getY()|| altın5.getX()==lokasyon18.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon18.getY()||altın5.getX()==lokasyon19.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon19.getY()|| altın5.getX()==lokasyon20.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon20.getY()||altın5.getX()==lokasyon21.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon21.getY()|| altın5.getX()==lokasyon22.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon22.getY()||altın5.getX()==lokasyon23.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon23.getY()|| altın5.getX()==lokasyon24.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon24.getY()||altın5.getX()==lokasyon25.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon25.getY()||altın5.getX()==lokasyon26.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon26.getY()){
                     altın5.setBounds(450, 300, 50, 50);
                }else if(altın5.getX()==lokasyon11.getX()+randoms2.get(art)*50 && altın5.getY()==lokasyon11.getY()){
                        altın5.setBounds(200, 300, 50, 50);
                    }else if(altın5.getX()==lokasyon1.getX() && altın5.getY()==lokasyon1.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon2.getX() && altın5.getY()==lokasyon2.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon3.getX() && altın5.getY()==lokasyon3.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon4.getX() && altın5.getY()==lokasyon4.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon5.getX()&& altın5.getY()==lokasyon5.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon6.getX() && altın5.getY()==lokasyon6.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon7.getX() && altın5.getY()==lokasyon7.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon8.getX() && altın5.getY()==lokasyon8.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon9.getX() && altın5.getY()==lokasyon9.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon10.getX() && altın5.getY()==lokasyon10.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon11.getX() && altın5.getY()==lokasyon11.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon12.getX() && altın5.getY()==lokasyon12.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon13.getX() && altın5.getY()==lokasyon13.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon14.getX() && altın5.getY()==lokasyon14.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon15.getX()&& altın5.getY()==lokasyon15.getY()-randoms2.get(art)*50 || altın5.getX()==lokasyon16.getX() && altın5.getY()==lokasyon16.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon17.getX() && altın5.getY()==lokasyon17.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon18.getX()&& altın5.getY()==lokasyon18.getY()-randoms2.get(art)*50 ||altın5.getX()==lokasyon19.getX() && altın5.getY()==lokasyon19.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon20.getX() && altın5.getY()==lokasyon20.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon21.getX() && altın5.getY()==lokasyon21.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon22.getX() && altın5.getY()==lokasyon22.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon23.getX() && altın5.getY()==lokasyon23.getY()-randoms2.get(art)*50|| altın5.getX()==lokasyon24.getX() && altın5.getY()==lokasyon24.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon25.getX() && altın5.getY()==lokasyon25.getY()-randoms2.get(art)*50||altın5.getX()==lokasyon26.getX() && altın5.getY()==lokasyon26.getY()-randoms2.get(art)*50){
                    altın5.setBounds(250, 250, 50, 50);
                }else if(altın5.getX()==lokasyon1.getX() && altın5.getY()==lokasyon1.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon2.getX() && altın5.getY()==lokasyon2.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon3.getX() && altın5.getY()==lokasyon3.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon4.getX() && altın5.getY()==lokasyon4.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon5.getX()&& altın5.getY()==lokasyon5.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon6.getX() && altın5.getY()==lokasyon6.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon7.getX() && altın5.getY()==lokasyon7.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon8.getX() && altın5.getY()==lokasyon8.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon9.getX() && altın5.getY()==lokasyon9.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon10.getX() && altın5.getY()==lokasyon10.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon11.getX() && altın5.getY()==lokasyon11.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon12.getX() && altın5.getY()==lokasyon12.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon13.getX() && altın5.getY()==lokasyon13.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon14.getX() && altın5.getY()==lokasyon14.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon15.getX()&& altın5.getY()==lokasyon15.getY()+randoms2.get(art)*50 || altın5.getX()==lokasyon16.getX() && altın5.getY()==lokasyon16.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon17.getX() && altın5.getY()==lokasyon17.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon18.getX()&& altın5.getY()==lokasyon18.getY()+randoms2.get(art)*50 ||altın5.getX()==lokasyon19.getX() && altın5.getY()==lokasyon19.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon20.getX() && altın5.getY()==lokasyon20.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon21.getX() && altın5.getY()==lokasyon21.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon22.getX() && altın5.getY()==lokasyon22.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon23.getX() && altın5.getY()==lokasyon23.getY()+randoms2.get(art)*50|| altın5.getX()==lokasyon24.getX() && altın5.getY()==lokasyon24.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon25.getX() && altın5.getY()==lokasyon25.getY()+randoms2.get(art)*50||altın5.getX()==lokasyon26.getX() && altın5.getY()==lokasyon26.getY()+randoms2.get(art)*50){
                    altın5.setBounds(50, 200, 50, 50);
                }else if(altın5.getBounds().equals(altın4.getBounds()) || altın5.getBounds().equals(altın3.getBounds()) || altın5.getBounds().equals(altın2.getBounds()) || altın5.getBounds().equals(altın1.getBounds())|| altın5.getBounds().equals(mantar.getBounds())){
                    altın5.setBounds(500,50,50,50);
                }else if(altın4.getBounds().equals(altın3.getBounds()) || altın4.getBounds().equals(altın2.getBounds()) || altın4.getBounds().equals(altın1.getBounds())|| altın4.getBounds().equals(mantar.getBounds())){
                    altın4.setBounds(400,200,50,50);
                }else if(altın3.getBounds().equals(altın2.getBounds()) || altın3.getBounds().equals(altın1.getBounds())|| altın3.getBounds().equals(mantar.getBounds())){
                    altın3.setBounds(400,350,50,50);
                }else if(altın2.getBounds().equals(altın1.getBounds()) || altın2.getBounds().equals(mantar.getBounds())){
                    altın2.setBounds(300,150,50,50);
                }else if(altın1.getBounds().equals(mantar.getBounds())){
                    altın1.setBounds(450,400,50,50);
                }
                else altın5.setBounds(ax5+randoms2.get(art)*50, ay5, 50, 50);

                    
            }
        };
         
         myTimer2.schedule(gorev2,0,altın.getSure());
         
         
         
        
        
    }//GEN-LAST:event_gozluklubutonuActionPerformed

    private void skorfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skorfieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_skorfieldActionPerformed

    
    class KlavyeKontrol implements KeyListener{

        @Override
        public void keyTyped(KeyEvent ke) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            ImageIcon imgazman = new javax.swing.ImageIcon(getClass().getResource("/images/azman.png"));
            azmanoyun.setIcon(imgazman);
            
            if(skor<=0){
         int sonuc = JOptionPane.showConfirmDialog(null,
                "Skor:"+Integer.toString(skor)+"\n Çıkmak İstiyor musunuz?",
                "Oyun Bitti Bilgisayar Kazandı!!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (sonuc == 0) {
            System.exit(0);
        }
            }
            
            int sayi=(int)(Math.random()*10%2);
        if (gargameloyun.getX()==150&&gargameloyun.getY()==0) {
                gargameloyun.setBounds(150,100,50,50);
            }
        else if (gargameloyun.getX()==150&&gargameloyun.getY()==100) {
                if (sayi==1) {
                    gargameloyun.setBounds(250,100,50,50);
                }
                else{
                    gargameloyun.setBounds(150,200,50,50);
                }
            }
           else if (gargameloyun.getX()==250&&gargameloyun.getY()==100) {
                
                if (sayi==1) {
                   gargameloyun.setBounds(350,100,50,50);
                }
                else{
                    gargameloyun.setBounds(150,100,50,50);
                }
            }
           else if (gargameloyun.getX()==150&&gargameloyun.getY()==500) {
                gargameloyun.setBounds(150,400,50,50);

            }
           else if (gargameloyun.getX()==150&&gargameloyun.getY()==200) {
                gargameloyun.setBounds(150,100,50,50);
            }
        else if (gargameloyun.getX()==350&&gargameloyun.getY()==100) {
                gargameloyun.setBounds(250,100,50,50);
            }
         
            
        
            if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
                if(hız==100){
                    if(ortadaki.getX()==600 && ortadaki.getY()==350){
                        int sonuc = JOptionPane.showConfirmDialog(null,
                        "Skor:"+Integer.toString(skor)+"\n Çıkmak İstiyor musunuz?",
                        "Oyun Bitti Siz Kazandınız!!!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (sonuc == 0) {
                    System.exit(0);
                    }
                    }
                    if (ortadaki.getX()==500 && ortadaki.getY()==350) {
                    ortadaki.setBounds(x+hız, y, 50, 50);
                    }
                    else if(ortadaki.getX()==600 && ortadaki.getY()==350){
                    ortadaki.setBounds(650,350,50,50);
                    }
                    else if(ortadaki.getX()==350-hız && ortadaki.getY()==250 ){
                    ortadaki.setBounds(250-hız, 250, 50, 50);
                }
                    else if(ortadaki.getX()==350-50 && ortadaki.getY()==250 ){
                    ortadaki.setBounds(250+50, 250, 50, 50);
                }
                    else if (duvarsagust.getX()==ortadaki.getX()+50 || duvarsagalt.getX()==ortadaki.getX()+50 ) {
                    ortadaki.setBounds(x, y, 50, 50);
                }
                    else if (duvarsagust.getX()==ortadaki.getX()+hız || duvarsagalt.getX()==ortadaki.getX()+hız ) {
                    ortadaki.setBounds(x, y, 50, 50);
                }
                    else if(ortadaki.getX()==lokasyon1.getX()-50 && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()-50 && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()-50 && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()-50 && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()-50 && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()-50 && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()-50 && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()-50 && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()-50 && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()-50 && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()-50 && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()-50 && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()-50 && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()-50 && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()-50 && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()-50 && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()-50 && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()-50 && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()-50 && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()-50 && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()-50 && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()-50 && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()-50 && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()-50 && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()-50 && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                } 
                 else if(ortadaki.getX()==lokasyon1.getX()-hız && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()-hız && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()-hız && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()-hız && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()-hız && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()-hız && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()-hız && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()-hız && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()-hız && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()-hız && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()-hız && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()-hız && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()-hız && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()-hız && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()-hız && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()-hız && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()-hız && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()-hız && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()-hız && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()-hız && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()-hız && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()-hız && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()-hız && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()-hız && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()-hız && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==700&&ortadaki.getY()==400-50) {
                    ortadaki.setBounds(700, 350, 50, 50);
                }
                
                    else {
                        x = (int) ortadaki.getBounds().getX();
                             y = (int) ortadaki.getBounds().getY();
                             if(x>=650) x=650;
                             else x+=hız; 
                             ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==550 && azmanoyun.getY()==350){
            azmanoyun.setBounds(500, 350, 50, 50);
        }
                else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
        else if (azmanoyun.getX()==550 && azmanoyun.getY()==350) {
                    azmanoyun.setBounds(600, 350, 50, 50);
                    }
                    else if(azmanoyun.getX()==300 && azmanoyun.getY()==250 ){
                    azmanoyun.setBounds(300, 250, 50, 50);
                
                }
                    else if (duvarsagust.getX()==azmanoyun.getX()+50 || duvarsagalt.getX()==azmanoyun.getX()+50 ) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                else if(azmanoyun.getX()==lokasyon1.getX()-50 && azmanoyun.getY()==lokasyon1.getY()|| azmanoyun.getX()==lokasyon2.getX()-50 && azmanoyun.getY()==lokasyon2.getY()||azmanoyun.getX()==lokasyon3.getX()-50 && azmanoyun.getY()==lokasyon3.getY()|| azmanoyun.getX()==lokasyon4.getX()-50 && azmanoyun.getY()==lokasyon4.getY()||azmanoyun.getX()==lokasyon5.getX()-50 && azmanoyun.getY()==lokasyon5.getY()|| azmanoyun.getX()==lokasyon6.getX()-50 && azmanoyun.getY()==lokasyon6.getY()||azmanoyun.getX()==lokasyon7.getX()-50 && azmanoyun.getY()==lokasyon7.getY()|| azmanoyun.getX()==lokasyon8.getX()-50 && azmanoyun.getY()==lokasyon8.getY()||azmanoyun.getX()==lokasyon9.getX()-50 && azmanoyun.getY()==lokasyon9.getY()|| azmanoyun.getX()==lokasyon10.getX()-50 && azmanoyun.getY()==lokasyon10.getY()||azmanoyun.getX()==lokasyon11.getX()-50 && azmanoyun.getY()==lokasyon11.getY()|| azmanoyun.getX()==lokasyon12.getX()-50 && azmanoyun.getY()==lokasyon12.getY()||azmanoyun.getX()==lokasyon13.getX()-50 && azmanoyun.getY()==lokasyon13.getY()|| azmanoyun.getX()==lokasyon14.getX()-50 && azmanoyun.getY()==lokasyon14.getY()||azmanoyun.getX()==lokasyon15.getX()-50 && azmanoyun.getY()==lokasyon15.getY()|| azmanoyun.getX()==lokasyon16.getX()-50 && azmanoyun.getY()==lokasyon16.getY()||azmanoyun.getX()==lokasyon17.getX()-50 && azmanoyun.getY()==lokasyon17.getY()|| azmanoyun.getX()==lokasyon18.getX()-50 && azmanoyun.getY()==lokasyon18.getY()||azmanoyun.getX()==lokasyon19.getX()-50 && azmanoyun.getY()==lokasyon19.getY()|| azmanoyun.getX()==lokasyon20.getX()-50 && azmanoyun.getY()==lokasyon20.getY()||azmanoyun.getX()==lokasyon21.getX()-50 && azmanoyun.getY()==lokasyon21.getY()|| azmanoyun.getX()==lokasyon22.getX()-50 && azmanoyun.getY()==lokasyon22.getY()||azmanoyun.getX()==lokasyon23.getX()-50 && azmanoyun.getY()==lokasyon23.getY()|| azmanoyun.getX()==lokasyon24.getX()-50 && azmanoyun.getY()==lokasyon24.getY()||azmanoyun.getX()==lokasyon25.getX()-50 && azmanoyun.getY()==lokasyon25.getY()){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                
                    else {
                             azmanx = (int) azmanoyun.getBounds().getX();
                             azmany = (int) azmanoyun.getBounds().getY();
                             if(azmanx>=650) azmanx=650;
                             else azmanx+=50; 
                             azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                }
                else{
                   if(ortadaki.getX()==600 && ortadaki.getY()==350){
                        int sonuc = JOptionPane.showConfirmDialog(null,
                        "Skor:"+Integer.toString(skor)+"\n Çıkmak İstiyor musunuz?",
                        "Oyun Bitti Siz Kazandınız!!!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (sonuc == 0) {
                    System.exit(0);
                    }
                    }
                    if (ortadaki.getX()==550 && ortadaki.getY()==350) {
                    ortadaki.setBounds(600, 350, 50, 50);
                    }
                    else if(ortadaki.getX()==300 && ortadaki.getY()==250 ){
                    ortadaki.setBounds(300, 250, 50, 50);
                
                }
                    else if (duvarsagust.getX()==ortadaki.getX()+hız || duvarsagalt.getX()==ortadaki.getX()+hız ) {
                    ortadaki.setBounds(x, y, 50, 50);
                }
                else if(ortadaki.getX()==lokasyon1.getX()-hız && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()-hız && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()-hız && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()-hız && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()-hız && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()-hız && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()-hız && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()-hız && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()-hız && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()-hız && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()-hız && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()-hız && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()-hız && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()-hız && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()-hız && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()-hız && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()-hız && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()-hız && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()-hız && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()-hız && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()-hız && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()-hız && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()-hız && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()-hız && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()-hız && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                }
                
                    else {
                        x = (int) ortadaki.getBounds().getX();
                             y = (int) ortadaki.getBounds().getY();
                             if(x>=650) x=650;
                             else x+=hız; 
                             ortadaki.setBounds(x, y, 50, 50);
                }
                    if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==550 && azmanoyun.getY()==350){
            azmanoyun.setBounds(500, 350, 50, 50);
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
                    
                    else if (azmanoyun.getX()==550 && azmanoyun.getY()==350) {
                    azmanoyun.setBounds(600, 350, 50, 50);
                    }
                    else if(azmanoyun.getX()==300 && azmanoyun.getY()==250 ){
                    azmanoyun.setBounds(300, 250, 50, 50);
                
                }
                    else if (duvarsagust.getX()==azmanoyun.getX()+50 || duvarsagalt.getX()==azmanoyun.getX()+50 ) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                else if(azmanoyun.getX()==lokasyon1.getX()-50 && azmanoyun.getY()==lokasyon1.getY()|| azmanoyun.getX()==lokasyon2.getX()-50 && azmanoyun.getY()==lokasyon2.getY()||azmanoyun.getX()==lokasyon3.getX()-50 && azmanoyun.getY()==lokasyon3.getY()|| azmanoyun.getX()==lokasyon4.getX()-50 && azmanoyun.getY()==lokasyon4.getY()||azmanoyun.getX()==lokasyon5.getX()-50 && azmanoyun.getY()==lokasyon5.getY()|| azmanoyun.getX()==lokasyon6.getX()-50 && azmanoyun.getY()==lokasyon6.getY()||azmanoyun.getX()==lokasyon7.getX()-50 && azmanoyun.getY()==lokasyon7.getY()|| azmanoyun.getX()==lokasyon8.getX()-50 && azmanoyun.getY()==lokasyon8.getY()||azmanoyun.getX()==lokasyon9.getX()-50 && azmanoyun.getY()==lokasyon9.getY()|| azmanoyun.getX()==lokasyon10.getX()-50 && azmanoyun.getY()==lokasyon10.getY()||azmanoyun.getX()==lokasyon11.getX()-50 && azmanoyun.getY()==lokasyon11.getY()|| azmanoyun.getX()==lokasyon12.getX()-50 && azmanoyun.getY()==lokasyon12.getY()||azmanoyun.getX()==lokasyon13.getX()-50 && azmanoyun.getY()==lokasyon13.getY()|| azmanoyun.getX()==lokasyon14.getX()-50 && azmanoyun.getY()==lokasyon14.getY()||azmanoyun.getX()==lokasyon15.getX()-50 && azmanoyun.getY()==lokasyon15.getY()|| azmanoyun.getX()==lokasyon16.getX()-50 && azmanoyun.getY()==lokasyon16.getY()||azmanoyun.getX()==lokasyon17.getX()-50 && azmanoyun.getY()==lokasyon17.getY()|| azmanoyun.getX()==lokasyon18.getX()-50 && azmanoyun.getY()==lokasyon18.getY()||azmanoyun.getX()==lokasyon19.getX()-50 && azmanoyun.getY()==lokasyon19.getY()|| azmanoyun.getX()==lokasyon20.getX()-50 && azmanoyun.getY()==lokasyon20.getY()||azmanoyun.getX()==lokasyon21.getX()-50 && azmanoyun.getY()==lokasyon21.getY()|| azmanoyun.getX()==lokasyon22.getX()-50 && azmanoyun.getY()==lokasyon22.getY()||azmanoyun.getX()==lokasyon23.getX()-50 && azmanoyun.getY()==lokasyon23.getY()|| azmanoyun.getX()==lokasyon24.getX()-50 && azmanoyun.getY()==lokasyon24.getY()||azmanoyun.getX()==lokasyon25.getX()-50 && azmanoyun.getY()==lokasyon25.getY()){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                
                    else {
                             azmanx = (int) azmanoyun.getBounds().getX();
                             azmany = (int) azmanoyun.getBounds().getY();
                             if(azmanx>=650) azmanx=650;
                             else azmanx+=50; 
                             azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                

                    
                }
                if(ortadaki.getBounds().equals(gargameloyun.getBounds())){                
                       Oyun.skor=Oyun.skor-15;
                   }
                if(ortadaki.getBounds().equals(azmanoyun.getBounds())){                
                       Oyun.skor=Oyun.skor-5;
                   }               
                if(ortadaki.getBounds().equals(mantar.getBounds())){
                       mantar.setIcon(null);
                       Oyun.skor=Oyun.skor+50;
                   }
                   if(ortadaki.getBounds().equals(altın1.getBounds())){
                       altın1.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın2.getBounds())){
                       altın2.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın3.getBounds())){
                       altın3.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın4.getBounds())){
                       altın4.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın5.getBounds())){
                       altın5.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   skorfield.setText("  "+Integer.toString(Oyun.skor));
                   
                }
            
            
            if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                if(hız==100){
                if (duvarsol.getX()==ortadaki.getX()-hız) {
                    ortadaki.setBounds(x, y, 50, 50);
                  }else if (duvarsol.getX()==ortadaki.getX()-50) {
                    ortadaki.setBounds(x, y, 50, 50);
                  }
                  else if(ortadaki.getX()==400 && ortadaki.getY()==250){
                      ortadaki.setBounds(400, 250, 50, 50);
                  }
                else if(ortadaki.getX()==lokasyon1.getX()+hız && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()+hız && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()+hız && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()+hız && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()+hız && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()+hız && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()+hız && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()+hız && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()+hız && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()+hız && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()+hız && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()+hız && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()+hız && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()+hız && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()+hız && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()+hız && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()+hız && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()+hız && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()+hız && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()+hız && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()+hız && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()+hız && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()+hız && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()+hız && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()+hız && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                }
                else if(ortadaki.getX()==lokasyon1.getX()+50 && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()+50 && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()+50 && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()+50 && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()+50 && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()+50 && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()+50 && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()+50 && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()+50 && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()+50 && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()+50 && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()+50 && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()+50 && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()+50 && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()+50 && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()+50 && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()+50 && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()+50 && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()+50 && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()+50 && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()+50 && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()+50 && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()+50 && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()+50 && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()+50 && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                }
                  else {
                      x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(x<0) x = 50;
                   else x-=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
                else if (duvarsol.getX()==azmanoyun.getX()-50) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                  }else if(azmanoyun.getX()==400 && azmanoyun.getY()==250){
                      azmanoyun.setBounds(400, 250, 50, 50);
                  }
                   else if(azmanoyun.getX()==lokasyon1.getX()+50 && azmanoyun.getY()==lokasyon1.getY()|| azmanoyun.getX()==lokasyon2.getX()+50 && azmanoyun.getY()==lokasyon2.getY()||azmanoyun.getX()==lokasyon3.getX()+50 && azmanoyun.getY()==lokasyon3.getY()|| azmanoyun.getX()==lokasyon4.getX()+50 && azmanoyun.getY()==lokasyon4.getY()||azmanoyun.getX()==lokasyon5.getX()+50 && azmanoyun.getY()==lokasyon5.getY()|| azmanoyun.getX()==lokasyon6.getX()+50 && azmanoyun.getY()==lokasyon6.getY()||azmanoyun.getX()==lokasyon7.getX()+50 && azmanoyun.getY()==lokasyon7.getY()|| azmanoyun.getX()==lokasyon8.getX()+50 && azmanoyun.getY()==lokasyon8.getY()||azmanoyun.getX()==lokasyon9.getX()+50 && azmanoyun.getY()==lokasyon9.getY()|| azmanoyun.getX()==lokasyon10.getX()+50 && azmanoyun.getY()==lokasyon10.getY()||azmanoyun.getX()==lokasyon11.getX()+50 && azmanoyun.getY()==lokasyon11.getY()|| azmanoyun.getX()==lokasyon12.getX()+50 && azmanoyun.getY()==lokasyon12.getY()||azmanoyun.getX()==lokasyon13.getX()+50 && azmanoyun.getY()==lokasyon13.getY()|| azmanoyun.getX()==lokasyon14.getX()+50 && azmanoyun.getY()==lokasyon14.getY()||azmanoyun.getX()==lokasyon15.getX()+50 && azmanoyun.getY()==lokasyon15.getY()|| azmanoyun.getX()==lokasyon16.getX()+50 && azmanoyun.getY()==lokasyon16.getY()||azmanoyun.getX()==lokasyon17.getX()+50 && azmanoyun.getY()==lokasyon17.getY()|| azmanoyun.getX()==lokasyon18.getX()+50 && azmanoyun.getY()==lokasyon18.getY()||azmanoyun.getX()==lokasyon19.getX()+50 && azmanoyun.getY()==lokasyon19.getY()|| azmanoyun.getX()==lokasyon20.getX()+50 && azmanoyun.getY()==lokasyon20.getY()||azmanoyun.getX()==lokasyon21.getX()+50 && azmanoyun.getY()==lokasyon21.getY()|| azmanoyun.getX()==lokasyon22.getX()+50 && azmanoyun.getY()==lokasyon22.getY()||azmanoyun.getX()==lokasyon23.getX()+50 && azmanoyun.getY()==lokasyon23.getY()|| azmanoyun.getX()==lokasyon24.getX()+50 && azmanoyun.getY()==lokasyon24.getY()||azmanoyun.getX()==lokasyon25.getX()+50 && azmanoyun.getY()==lokasyon25.getY()){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                  else {
                      azmanx = (int) azmanoyun.getBounds().getX();
                      azmany = (int) azmanoyun.getBounds().getY();
                   if(azmanx<0) azmanx = 50;
                   else azmanx-=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                }
                else{
                   if (duvarsol.getX()==ortadaki.getX()-hız) {
                    ortadaki.setBounds(x, y, 50, 50);
                  }else if(ortadaki.getX()==400 && ortadaki.getY()==250){
                      ortadaki.setBounds(400, 250, 50, 50);
                  }
                   else if(ortadaki.getX()==lokasyon1.getX()+hız && ortadaki.getY()==lokasyon1.getY()|| ortadaki.getX()==lokasyon2.getX()+hız && ortadaki.getY()==lokasyon2.getY()||ortadaki.getX()==lokasyon3.getX()+hız && ortadaki.getY()==lokasyon3.getY()|| ortadaki.getX()==lokasyon4.getX()+hız && ortadaki.getY()==lokasyon4.getY()||ortadaki.getX()==lokasyon5.getX()+hız && ortadaki.getY()==lokasyon5.getY()|| ortadaki.getX()==lokasyon6.getX()+hız && ortadaki.getY()==lokasyon6.getY()||ortadaki.getX()==lokasyon7.getX()+hız && ortadaki.getY()==lokasyon7.getY()|| ortadaki.getX()==lokasyon8.getX()+hız && ortadaki.getY()==lokasyon8.getY()||ortadaki.getX()==lokasyon9.getX()+hız && ortadaki.getY()==lokasyon9.getY()|| ortadaki.getX()==lokasyon10.getX()+hız && ortadaki.getY()==lokasyon10.getY()||ortadaki.getX()==lokasyon11.getX()+hız && ortadaki.getY()==lokasyon11.getY()|| ortadaki.getX()==lokasyon12.getX()+hız && ortadaki.getY()==lokasyon12.getY()||ortadaki.getX()==lokasyon13.getX()+hız && ortadaki.getY()==lokasyon13.getY()|| ortadaki.getX()==lokasyon14.getX()+hız && ortadaki.getY()==lokasyon14.getY()||ortadaki.getX()==lokasyon15.getX()+hız && ortadaki.getY()==lokasyon15.getY()|| ortadaki.getX()==lokasyon16.getX()+hız && ortadaki.getY()==lokasyon16.getY()||ortadaki.getX()==lokasyon17.getX()+hız && ortadaki.getY()==lokasyon17.getY()|| ortadaki.getX()==lokasyon18.getX()+hız && ortadaki.getY()==lokasyon18.getY()||ortadaki.getX()==lokasyon19.getX()+hız && ortadaki.getY()==lokasyon19.getY()|| ortadaki.getX()==lokasyon20.getX()+hız && ortadaki.getY()==lokasyon20.getY()||ortadaki.getX()==lokasyon21.getX()+hız && ortadaki.getY()==lokasyon21.getY()|| ortadaki.getX()==lokasyon22.getX()+hız && ortadaki.getY()==lokasyon22.getY()||ortadaki.getX()==lokasyon23.getX()+hız && ortadaki.getY()==lokasyon23.getY()|| ortadaki.getX()==lokasyon24.getX()+hız && ortadaki.getY()==lokasyon24.getY()||ortadaki.getX()==lokasyon25.getX()+hız && ortadaki.getY()==lokasyon25.getY()){
                    ortadaki.setBounds(x, y, 50, 50);
                }
                  else {
                      x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(x<0) x = 50;
                   else x-=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                } if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
                   
                   else if (duvarsol.getX()==azmanoyun.getX()-50) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                  }else if(azmanoyun.getX()==400 && azmanoyun.getY()==250){
                      azmanoyun.setBounds(400, 250, 50, 50);
                  }
                   else if(azmanoyun.getX()==lokasyon1.getX()+50 && azmanoyun.getY()==lokasyon1.getY()|| azmanoyun.getX()==lokasyon2.getX()+50 && azmanoyun.getY()==lokasyon2.getY()||azmanoyun.getX()==lokasyon3.getX()+50 && azmanoyun.getY()==lokasyon3.getY()|| azmanoyun.getX()==lokasyon4.getX()+50 && azmanoyun.getY()==lokasyon4.getY()||azmanoyun.getX()==lokasyon5.getX()+50 && azmanoyun.getY()==lokasyon5.getY()|| azmanoyun.getX()==lokasyon6.getX()+50 && azmanoyun.getY()==lokasyon6.getY()||azmanoyun.getX()==lokasyon7.getX()+50 && azmanoyun.getY()==lokasyon7.getY()|| azmanoyun.getX()==lokasyon8.getX()+50 && azmanoyun.getY()==lokasyon8.getY()||azmanoyun.getX()==lokasyon9.getX()+50 && azmanoyun.getY()==lokasyon9.getY()|| azmanoyun.getX()==lokasyon10.getX()+50 && azmanoyun.getY()==lokasyon10.getY()||azmanoyun.getX()==lokasyon11.getX()+50 && azmanoyun.getY()==lokasyon11.getY()|| azmanoyun.getX()==lokasyon12.getX()+50 && azmanoyun.getY()==lokasyon12.getY()||azmanoyun.getX()==lokasyon13.getX()+50 && azmanoyun.getY()==lokasyon13.getY()|| azmanoyun.getX()==lokasyon14.getX()+50 && azmanoyun.getY()==lokasyon14.getY()||azmanoyun.getX()==lokasyon15.getX()+50 && azmanoyun.getY()==lokasyon15.getY()|| azmanoyun.getX()==lokasyon16.getX()+50 && azmanoyun.getY()==lokasyon16.getY()||azmanoyun.getX()==lokasyon17.getX()+50 && azmanoyun.getY()==lokasyon17.getY()|| azmanoyun.getX()==lokasyon18.getX()+50 && azmanoyun.getY()==lokasyon18.getY()||azmanoyun.getX()==lokasyon19.getX()+50 && azmanoyun.getY()==lokasyon19.getY()|| azmanoyun.getX()==lokasyon20.getX()+50 && azmanoyun.getY()==lokasyon20.getY()||azmanoyun.getX()==lokasyon21.getX()+50 && azmanoyun.getY()==lokasyon21.getY()|| azmanoyun.getX()==lokasyon22.getX()+50 && azmanoyun.getY()==lokasyon22.getY()||azmanoyun.getX()==lokasyon23.getX()+50 && azmanoyun.getY()==lokasyon23.getY()|| azmanoyun.getX()==lokasyon24.getX()+50 && azmanoyun.getY()==lokasyon24.getY()||azmanoyun.getX()==lokasyon25.getX()+50 && azmanoyun.getY()==lokasyon25.getY()){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                  else {
                      azmanx = (int) azmanoyun.getBounds().getX();
                      azmany = (int) azmanoyun.getBounds().getY();
                   if(azmanx<0) azmanx = 50;
                   else azmanx-=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }

                    
                }
                   if(ortadaki.getBounds().equals(gargameloyun.getBounds())){                
                       Oyun.skor=Oyun.skor-15;
                   }
                if(ortadaki.getBounds().equals(azmanoyun.getBounds())){                
                       Oyun.skor=Oyun.skor-5;
                   }          
                   if(ortadaki.getBounds().equals(mantar.getBounds())){
                       mantar.setIcon(null);
                       Oyun.skor=Oyun.skor+50;
                   }
                   if(ortadaki.getBounds().equals(altın1.getBounds())){
                       altın1.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın2.getBounds())){
                       altın2.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın3.getBounds())){
                       altın3.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın4.getBounds())){
                       altın4.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın5.getBounds())){
                       altın5.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   skorfield.setText("  "+Integer.toString(Oyun.skor));
                   
                }
            
            
            if(e.getKeyCode()==KeyEvent.VK_UP) {
                if(hız==100){
                    if (duvarust.getY()==ortadaki.getY()-hız) {
                     ortadaki.setBounds(x, y, 50, 50);
                }else if (duvarust.getY()==ortadaki.getY()-50) {
                     ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()+hız|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()+hız||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()+hız|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()+hız||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()+hız|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()+hız||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()+hız|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()+hız||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()+hız|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()+hız||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()+hız|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()+hız||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()+hız|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()+hız||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()+hız|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()+hız||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()+hız|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()+hız||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()+hız|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()+hız||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()+hız|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()+hız||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()+hız|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()+hız||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()+hız){
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()+50|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()+50||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()+50|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()+50||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()+50|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()+50||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()+50|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()+50||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()+50|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()+50||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()+50|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()+50||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()+50|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()+50||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()+50|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()+50||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()+50|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()+50||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()+50|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()+50||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()+50|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()+50||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()+50|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()+50||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()+50){
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==600 && ortadaki.getY()==300+hız ){
                    ortadaki.setBounds(600, 350, 50, 50);
                }else if(ortadaki.getX()==600 && ortadaki.getY()==300+50 ){
                    ortadaki.setBounds(600, 350, 50, 50);
                }else if (ortadaki.getX()==650 && ortadaki.getY()==300+hız) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }else if (ortadaki.getX()==650 && ortadaki.getY()==300+50) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }else if(ortadaki.getX()==700&&ortadaki.getY()==400-50) {
                    ortadaki.setBounds(700, 350, 50, 50);
                }
                else {
                    x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(y<=50) y =0;
                   else y-=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==50){
            azmanoyun.setBounds(550, 50, 50, 50);
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }else if (duvarust.getY()==azmanoyun.getY()-50) {
                     azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }else if(azmanoyun.getX()==lokasyon1.getX() && azmanoyun.getY()==lokasyon1.getY()+50|| azmanoyun.getX()==lokasyon2.getX() && azmanoyun.getY()==lokasyon2.getY()+50||azmanoyun.getX()==lokasyon3.getX() && azmanoyun.getY()==lokasyon3.getY()+50|| azmanoyun.getX()==lokasyon4.getX() && azmanoyun.getY()==lokasyon4.getY()+50||azmanoyun.getX()==lokasyon5.getX() && azmanoyun.getY()==lokasyon5.getY()+50|| azmanoyun.getX()==lokasyon6.getX() && azmanoyun.getY()==lokasyon6.getY()+50||azmanoyun.getX()==lokasyon7.getX() && azmanoyun.getY()==lokasyon7.getY()+50|| azmanoyun.getX()==lokasyon8.getX() && azmanoyun.getY()==lokasyon8.getY()+50||azmanoyun.getX()==lokasyon9.getX() && azmanoyun.getY()==lokasyon9.getY()+50|| azmanoyun.getX()==lokasyon10.getX() && azmanoyun.getY()==lokasyon10.getY()+50||azmanoyun.getX()==lokasyon11.getX() && azmanoyun.getY()==lokasyon11.getY()+50|| azmanoyun.getX()==lokasyon12.getX() && azmanoyun.getY()==lokasyon12.getY()+50||azmanoyun.getX()==lokasyon13.getX() && azmanoyun.getY()==lokasyon13.getY()+50|| azmanoyun.getX()==lokasyon14.getX() && azmanoyun.getY()==lokasyon14.getY()+50||azmanoyun.getX()==lokasyon15.getX() && azmanoyun.getY()==lokasyon15.getY()+50|| azmanoyun.getX()==lokasyon16.getX() && azmanoyun.getY()==lokasyon16.getY()+50||azmanoyun.getX()==lokasyon17.getX() && azmanoyun.getY()==lokasyon17.getY()+50|| azmanoyun.getX()==lokasyon18.getX() && azmanoyun.getY()==lokasyon18.getY()+50||azmanoyun.getX()==lokasyon19.getX() && azmanoyun.getY()==lokasyon19.getY()+50|| azmanoyun.getX()==lokasyon20.getX() && azmanoyun.getY()==lokasyon20.getY()+50||azmanoyun.getX()==lokasyon21.getX() && azmanoyun.getY()==lokasyon21.getY()+50|| azmanoyun.getX()==lokasyon22.getX() && azmanoyun.getY()==lokasyon22.getY()+50||azmanoyun.getX()==lokasyon23.getX() && azmanoyun.getY()==lokasyon23.getY()+50|| azmanoyun.getX()==lokasyon24.getX() && azmanoyun.getY()==lokasyon24.getY()+50||azmanoyun.getX()==lokasyon25.getX() && azmanoyun.getY()==lokasyon25.getY()+50){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                } else if(azmanoyun.getX()==600 && azmanoyun.getY()==300+50 ){
                    azmanoyun.setBounds(600, 350, 50, 50);
                } 
                else if (azmanoyun.getX()==650 && azmanoyun.getY()==300+50) {
                    azmanoyun.setBounds(650, 350, 50, 50);
                }
                else {
                    azmanx = (int) azmanoyun.getBounds().getX();
                    azmany = (int) azmanoyun.getBounds().getY();
                   if(azmany<=50) azmany =0;
                   else azmany-=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }
                }else{
                    if (duvarust.getY()==ortadaki.getY()-hız) {
                     ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()+hız|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()+hız||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()+hız|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()+hız||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()+hız|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()+hız||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()+hız|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()+hız||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()+hız|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()+hız||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()+hız|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()+hız||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()+hız|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()+hız||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()+hız|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()+hız||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()+hız|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()+hız||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()+hız|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()+hız||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()+hız|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()+hız||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()+hız|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()+hız||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()+hız){
                    ortadaki.setBounds(x, y, 50, 50);
                } else if(ortadaki.getX()==600 && ortadaki.getY()==300+hız ){
                    ortadaki.setBounds(600, 350, 50, 50);
                } 
                else if (ortadaki.getX()==650 && ortadaki.getY()==300+hız) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }
                else {
                    x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(y<=50) y =0;
                   else y-=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==50){
            azmanoyun.setBounds(550, 50, 50, 50);
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }else if (duvarust.getY()==azmanoyun.getY()-50) {
                     azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }else if(azmanoyun.getX()==lokasyon1.getX() && azmanoyun.getY()==lokasyon1.getY()+50|| azmanoyun.getX()==lokasyon2.getX() && azmanoyun.getY()==lokasyon2.getY()+50||azmanoyun.getX()==lokasyon3.getX() && azmanoyun.getY()==lokasyon3.getY()+50|| azmanoyun.getX()==lokasyon4.getX() && azmanoyun.getY()==lokasyon4.getY()+50||azmanoyun.getX()==lokasyon5.getX() && azmanoyun.getY()==lokasyon5.getY()+50|| azmanoyun.getX()==lokasyon6.getX() && azmanoyun.getY()==lokasyon6.getY()+50||azmanoyun.getX()==lokasyon7.getX() && azmanoyun.getY()==lokasyon7.getY()+50|| azmanoyun.getX()==lokasyon8.getX() && azmanoyun.getY()==lokasyon8.getY()+50||azmanoyun.getX()==lokasyon9.getX() && azmanoyun.getY()==lokasyon9.getY()+50|| azmanoyun.getX()==lokasyon10.getX() && azmanoyun.getY()==lokasyon10.getY()+50||azmanoyun.getX()==lokasyon11.getX() && azmanoyun.getY()==lokasyon11.getY()+50|| azmanoyun.getX()==lokasyon12.getX() && azmanoyun.getY()==lokasyon12.getY()+50||azmanoyun.getX()==lokasyon13.getX() && azmanoyun.getY()==lokasyon13.getY()+50|| azmanoyun.getX()==lokasyon14.getX() && azmanoyun.getY()==lokasyon14.getY()+50||azmanoyun.getX()==lokasyon15.getX() && azmanoyun.getY()==lokasyon15.getY()+50|| azmanoyun.getX()==lokasyon16.getX() && azmanoyun.getY()==lokasyon16.getY()+50||azmanoyun.getX()==lokasyon17.getX() && azmanoyun.getY()==lokasyon17.getY()+50|| azmanoyun.getX()==lokasyon18.getX() && azmanoyun.getY()==lokasyon18.getY()+50||azmanoyun.getX()==lokasyon19.getX() && azmanoyun.getY()==lokasyon19.getY()+50|| azmanoyun.getX()==lokasyon20.getX() && azmanoyun.getY()==lokasyon20.getY()+50||azmanoyun.getX()==lokasyon21.getX() && azmanoyun.getY()==lokasyon21.getY()+50|| azmanoyun.getX()==lokasyon22.getX() && azmanoyun.getY()==lokasyon22.getY()+50||azmanoyun.getX()==lokasyon23.getX() && azmanoyun.getY()==lokasyon23.getY()+50|| azmanoyun.getX()==lokasyon24.getX() && azmanoyun.getY()==lokasyon24.getY()+50||azmanoyun.getX()==lokasyon25.getX() && azmanoyun.getY()==lokasyon25.getY()+50){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                } else if(azmanoyun.getX()==600 && azmanoyun.getY()==300+50 ){
                    azmanoyun.setBounds(600, 350, 50, 50);
                } 
                else if (azmanoyun.getX()==650 && azmanoyun.getY()==300+50) {
                    azmanoyun.setBounds(650, 350, 50, 50);
                }
                else {
                    azmanx = (int) azmanoyun.getBounds().getX();
                    azmany = (int) azmanoyun.getBounds().getY();
                   if(azmany<=50) azmany =0;
                   else azmany-=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }

                    
                }
                if(ortadaki.getBounds().equals(gargameloyun.getBounds())){                
                       Oyun.skor=Oyun.skor-15;
                   }
                if(ortadaki.getBounds().equals(azmanoyun.getBounds())){                
                       Oyun.skor=Oyun.skor-5;
                   } 
                if(ortadaki.getBounds().equals(mantar.getBounds())){
                       mantar.setIcon(null);
                       Oyun.skor=Oyun.skor+50;
                   }
                   if(ortadaki.getBounds().equals(altın1.getBounds())){
                       altın1.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın2.getBounds())){
                       altın2.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın3.getBounds())){
                       altın3.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın4.getBounds())){
                       altın4.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın5.getBounds())){
                       altın5.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   skorfield.setText("  "+Integer.toString(Oyun.skor));
                }
            
            
            if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                if(hız==100){
                   if (duvaralt.getY()==ortadaki.getY()+hız) {
                    ortadaki.setBounds(x, y, 50, 50);
                }else if (duvaralt.getY()==ortadaki.getY()+50) {
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()-hız|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()-hız||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()-hız|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()-hız||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()-hız|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()-hız||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()-hız|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()-hız||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()-hız|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()-hız||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()-hız|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()-hız||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()-hız|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()-hız||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()-hız|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()-hız||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()-hız|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()-hız||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()-hız|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()-hız||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()-hız|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()-hız||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()-hız|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()-hız||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()-hız){
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()-50|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()-50||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()-50|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()-50||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()-50|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()-50||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()-50|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()-50||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()-50|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()-50||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()-50|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()-50||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()-50|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()-50||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()-50|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()-50||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()-50|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()-50||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()-50|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()-50||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()-50|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()-50||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()-50|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()-50||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()-50){
                    ortadaki.setBounds(x, y, 50, 50);
                } else if(ortadaki.getX()==600 && ortadaki.getY()==400-hız ){
                    ortadaki.setBounds(600, 350, 50, 50);
                }else if(ortadaki.getX()==600 && ortadaki.getY()==400-50 ){
                    ortadaki.setBounds(600, 350, 50, 50);
                }     
                else if (ortadaki.getX()==650&&ortadaki.getY()==400-hız) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }else if (ortadaki.getX()==650&&ortadaki.getY()==400-50) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }else if(ortadaki.getX()==700&&ortadaki.getY()==400-50) {
                    ortadaki.setBounds(700, 350, 50, 50);
                }
                else {
                     x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(y>=500) y=500;
                   else y+=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==50){
            azmanoyun.setBounds(450, 50, 50, 50);
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
                   
                   else if (duvaralt.getY()==azmanoyun.getY()+50) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }else if(azmanoyun.getX()==lokasyon1.getX() && azmanoyun.getY()==lokasyon1.getY()-50|| azmanoyun.getX()==lokasyon2.getX() && azmanoyun.getY()==lokasyon2.getY()-50||azmanoyun.getX()==lokasyon3.getX() && azmanoyun.getY()==lokasyon3.getY()-50|| azmanoyun.getX()==lokasyon4.getX() && azmanoyun.getY()==lokasyon4.getY()-50||azmanoyun.getX()==lokasyon5.getX() && azmanoyun.getY()==lokasyon5.getY()-50|| azmanoyun.getX()==lokasyon6.getX() && azmanoyun.getY()==lokasyon6.getY()-50||azmanoyun.getX()==lokasyon7.getX() && azmanoyun.getY()==lokasyon7.getY()-50|| azmanoyun.getX()==lokasyon8.getX() && azmanoyun.getY()==lokasyon8.getY()-50||azmanoyun.getX()==lokasyon9.getX() && azmanoyun.getY()==lokasyon9.getY()-50|| azmanoyun.getX()==lokasyon10.getX() && azmanoyun.getY()==lokasyon10.getY()-50||azmanoyun.getX()==lokasyon11.getX() && azmanoyun.getY()==lokasyon11.getY()-50|| azmanoyun.getX()==lokasyon12.getX() && azmanoyun.getY()==lokasyon12.getY()-50||azmanoyun.getX()==lokasyon13.getX() && azmanoyun.getY()==lokasyon13.getY()-50|| azmanoyun.getX()==lokasyon14.getX() && azmanoyun.getY()==lokasyon14.getY()-50||azmanoyun.getX()==lokasyon15.getX() && azmanoyun.getY()==lokasyon15.getY()-50|| azmanoyun.getX()==lokasyon16.getX() && azmanoyun.getY()==lokasyon16.getY()-50||azmanoyun.getX()==lokasyon17.getX() && azmanoyun.getY()==lokasyon17.getY()-50|| azmanoyun.getX()==lokasyon18.getX() && azmanoyun.getY()==lokasyon18.getY()-50||azmanoyun.getX()==lokasyon19.getX() && azmanoyun.getY()==lokasyon19.getY()-50|| azmanoyun.getX()==lokasyon20.getX() && azmanoyun.getY()==lokasyon20.getY()-50||azmanoyun.getX()==lokasyon21.getX() && azmanoyun.getY()==lokasyon21.getY()-50|| azmanoyun.getX()==lokasyon22.getX() && azmanoyun.getY()==lokasyon22.getY()-50||azmanoyun.getX()==lokasyon23.getX() && azmanoyun.getY()==lokasyon23.getY()-50|| azmanoyun.getX()==lokasyon24.getX() && azmanoyun.getY()==lokasyon24.getY()-50||azmanoyun.getX()==lokasyon25.getX() && azmanoyun.getY()==lokasyon25.getY()-50){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                } else if(azmanoyun.getX()==600 && azmanoyun.getY()==400-50 ){
                    azmanoyun.setBounds(600, 350, 50, 50);
                }     
                else if (azmanoyun.getX()==650&&azmanoyun.getY()==400-50) {
                    azmanoyun.setBounds(650, 350, 50, 50);
                }
                else {
                     azmanx = (int) azmanoyun.getBounds().getX();
                   azmany = (int) azmanoyun.getBounds().getY();
                   if(azmany>=500) azmany=500;
                   else azmany+=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }

                }else{
                   if (duvaralt.getY()==ortadaki.getY()+hız) {
                    ortadaki.setBounds(x, y, 50, 50);
                }else if(ortadaki.getX()==lokasyon1.getX() && ortadaki.getY()==lokasyon1.getY()-hız|| ortadaki.getX()==lokasyon2.getX() && ortadaki.getY()==lokasyon2.getY()-hız||ortadaki.getX()==lokasyon3.getX() && ortadaki.getY()==lokasyon3.getY()-hız|| ortadaki.getX()==lokasyon4.getX() && ortadaki.getY()==lokasyon4.getY()-hız||ortadaki.getX()==lokasyon5.getX() && ortadaki.getY()==lokasyon5.getY()-hız|| ortadaki.getX()==lokasyon6.getX() && ortadaki.getY()==lokasyon6.getY()-hız||ortadaki.getX()==lokasyon7.getX() && ortadaki.getY()==lokasyon7.getY()-hız|| ortadaki.getX()==lokasyon8.getX() && ortadaki.getY()==lokasyon8.getY()-hız||ortadaki.getX()==lokasyon9.getX() && ortadaki.getY()==lokasyon9.getY()-hız|| ortadaki.getX()==lokasyon10.getX() && ortadaki.getY()==lokasyon10.getY()-hız||ortadaki.getX()==lokasyon11.getX() && ortadaki.getY()==lokasyon11.getY()-hız|| ortadaki.getX()==lokasyon12.getX() && ortadaki.getY()==lokasyon12.getY()-hız||ortadaki.getX()==lokasyon13.getX() && ortadaki.getY()==lokasyon13.getY()-hız|| ortadaki.getX()==lokasyon14.getX() && ortadaki.getY()==lokasyon14.getY()-hız||ortadaki.getX()==lokasyon15.getX() && ortadaki.getY()==lokasyon15.getY()-hız|| ortadaki.getX()==lokasyon16.getX() && ortadaki.getY()==lokasyon16.getY()-hız||ortadaki.getX()==lokasyon17.getX() && ortadaki.getY()==lokasyon17.getY()-hız|| ortadaki.getX()==lokasyon18.getX() && ortadaki.getY()==lokasyon18.getY()-hız||ortadaki.getX()==lokasyon19.getX() && ortadaki.getY()==lokasyon19.getY()-hız|| ortadaki.getX()==lokasyon20.getX() && ortadaki.getY()==lokasyon20.getY()-hız||ortadaki.getX()==lokasyon21.getX() && ortadaki.getY()==lokasyon21.getY()-hız|| ortadaki.getX()==lokasyon22.getX() && ortadaki.getY()==lokasyon22.getY()-hız||ortadaki.getX()==lokasyon23.getX() && ortadaki.getY()==lokasyon23.getY()-hız|| ortadaki.getX()==lokasyon24.getX() && ortadaki.getY()==lokasyon24.getY()-hız||ortadaki.getX()==lokasyon25.getX() && ortadaki.getY()==lokasyon25.getY()-hız){
                    ortadaki.setBounds(x, y, 50, 50);
                } else if(ortadaki.getX()==600 && ortadaki.getY()==400-hız ){
                    ortadaki.setBounds(600, 350, 50, 50);
                }     
                else if (ortadaki.getX()==650&&ortadaki.getY()==400-hız) {
                    ortadaki.setBounds(650, 350, 50, 50);
                }
                else {
                     x = (int) ortadaki.getBounds().getX();
                   y = (int) ortadaki.getBounds().getY();
                   if(y>=500) y=500;
                   else y+=hız;
                   ortadaki.setBounds(x, y, 50, 50);
                }if(azmanoyun.getX()==150 && azmanoyun.getY()==0){
            azmanoyun.setBounds(150, 50, 50, 50);           
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==50){
            azmanoyun.setBounds(450, 50, 50, 50);
        }else if(azmanoyun.getX()==500 && azmanoyun.getY()==0){
            azmanoyun.setBounds(500, 50, 50, 50);
        }else if(azmanoyun.getX()==0 && azmanoyun.getY()==250){
            azmanoyun.setBounds(50, 250, 50, 50);
        }else if(azmanoyun.getX()==150 && azmanoyun.getY()==500){
            azmanoyun.setBounds(150, 450, 50, 50);
        }
                   else if (duvaralt.getY()==azmanoyun.getY()+50) {
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }else if(azmanoyun.getX()==lokasyon1.getX() && azmanoyun.getY()==lokasyon1.getY()-50|| azmanoyun.getX()==lokasyon2.getX() && azmanoyun.getY()==lokasyon2.getY()-50||azmanoyun.getX()==lokasyon3.getX() && azmanoyun.getY()==lokasyon3.getY()-50|| azmanoyun.getX()==lokasyon4.getX() && azmanoyun.getY()==lokasyon4.getY()-50||azmanoyun.getX()==lokasyon5.getX() && azmanoyun.getY()==lokasyon5.getY()-50|| azmanoyun.getX()==lokasyon6.getX() && azmanoyun.getY()==lokasyon6.getY()-50||azmanoyun.getX()==lokasyon7.getX() && azmanoyun.getY()==lokasyon7.getY()-50|| azmanoyun.getX()==lokasyon8.getX() && azmanoyun.getY()==lokasyon8.getY()-50||azmanoyun.getX()==lokasyon9.getX() && azmanoyun.getY()==lokasyon9.getY()-50|| azmanoyun.getX()==lokasyon10.getX() && azmanoyun.getY()==lokasyon10.getY()-50||azmanoyun.getX()==lokasyon11.getX() && azmanoyun.getY()==lokasyon11.getY()-50|| azmanoyun.getX()==lokasyon12.getX() && azmanoyun.getY()==lokasyon12.getY()-50||azmanoyun.getX()==lokasyon13.getX() && azmanoyun.getY()==lokasyon13.getY()-50|| azmanoyun.getX()==lokasyon14.getX() && azmanoyun.getY()==lokasyon14.getY()-50||azmanoyun.getX()==lokasyon15.getX() && azmanoyun.getY()==lokasyon15.getY()-50|| azmanoyun.getX()==lokasyon16.getX() && azmanoyun.getY()==lokasyon16.getY()-50||azmanoyun.getX()==lokasyon17.getX() && azmanoyun.getY()==lokasyon17.getY()-50|| azmanoyun.getX()==lokasyon18.getX() && azmanoyun.getY()==lokasyon18.getY()-50||azmanoyun.getX()==lokasyon19.getX() && azmanoyun.getY()==lokasyon19.getY()-50|| azmanoyun.getX()==lokasyon20.getX() && azmanoyun.getY()==lokasyon20.getY()-50||azmanoyun.getX()==lokasyon21.getX() && azmanoyun.getY()==lokasyon21.getY()-50|| azmanoyun.getX()==lokasyon22.getX() && azmanoyun.getY()==lokasyon22.getY()-50||azmanoyun.getX()==lokasyon23.getX() && azmanoyun.getY()==lokasyon23.getY()-50|| azmanoyun.getX()==lokasyon24.getX() && azmanoyun.getY()==lokasyon24.getY()-50||azmanoyun.getX()==lokasyon25.getX() && azmanoyun.getY()==lokasyon25.getY()-50){
                    azmanoyun.setBounds(azmanx, azmany, 50, 50);
                } else if(azmanoyun.getX()==600 && azmanoyun.getY()==400-50 ){
                    azmanoyun.setBounds(600, 350, 50, 50);
                }     
                else if (azmanoyun.getX()==650&&azmanoyun.getY()==400-50) {
                    azmanoyun.setBounds(650, 350, 50, 50);
                }
                else {
                     azmanx = (int) azmanoyun.getBounds().getX();
                   azmany = (int) azmanoyun.getBounds().getY();
                   if(azmany>=500) azmany=500;
                   else azmany+=50;
                   azmanoyun.setBounds(azmanx, azmany, 50, 50);
                }


                   

                }
                if(ortadaki.getBounds().equals(gargameloyun.getBounds())){                
                       Oyun.skor=Oyun.skor-15;
                   }
                if(ortadaki.getBounds().equals(azmanoyun.getBounds())){                
                       Oyun.skor=Oyun.skor-5;
                   } 
                if(ortadaki.getBounds().equals(mantar.getBounds())){
                       mantar.setIcon(null);
                       Oyun.skor=Oyun.skor+50;
                   }
                   if(ortadaki.getBounds().equals(altın1.getBounds())){
                       altın1.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın2.getBounds())){
                       altın2.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın3.getBounds())){
                       altın3.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın4.getBounds())){
                       altın4.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   if(ortadaki.getBounds().equals(altın5.getBounds())){
                       altın5.setIcon(null);
                       Oyun.skor=Oyun.skor+5;
                   }
                   skorfield.setText("  "+Integer.toString(Oyun.skor));
                }
                }

        @Override
        public void keyReleased(KeyEvent ke) {
            
        }
        
    }
    
   
  
    /**
     * @param args the command line arguments
     */
    
    
    
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
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OyunLabeli;
    private javax.swing.JLabel altın1;
    private javax.swing.JLabel altın2;
    private javax.swing.JLabel altın3;
    private javax.swing.JLabel altın4;
    private javax.swing.JLabel altın5;
    private javax.swing.JLabel azmanoyun;
    private javax.swing.JLabel duvaralt;
    private javax.swing.JLabel duvarsagalt;
    private javax.swing.JLabel duvarsagust;
    private javax.swing.JLabel duvarsol;
    private javax.swing.JLabel duvarust;
    private javax.swing.JLabel gargameloyun;
    private javax.swing.JButton gozluklubutonu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mantar;
    private javax.swing.JLabel ortadaki;
    private javax.swing.JLabel sirine;
    private javax.swing.JTextField skorfield;
    private javax.swing.JLabel skoryazısı;
    private javax.swing.JButton tembelbutonu;
    private javax.swing.JTextField uyarı;
    // End of variables declaration//GEN-END:variables

        

    

    
    
    
    
}
