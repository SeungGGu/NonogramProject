package com.java.Mainform;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
	
    JPanel mainpanel = new JPanel();
    JPanel userpanel = new JPanel();
    JPanel datapanel = new JPanel();
    
    JButton btnLogout = new JButton("로그아웃");
    static String[] btnStagetext = {"1", "2", "3", "4", "5"};
    static JButton[] btnStage1 = new JButton[5];
    static JButton[] btnStage2 = new JButton[5];
    static JButton[] btnStage3 = new JButton[5];
    static JButton[] btnStage4 = new JButton[5];
    static JButton[] btnStage5 = new JButton[5];
    
    JLabel namelabel = new JLabel("승");
    JLabel idlabel = new JLabel("seong");
    JLabel timerlabel = new JLabel("Timer");
    JLabel timelabel = new JLabel("00:00:00");
    JLabel stage1 = new JLabel("★");
    JLabel stage2 = new JLabel("★★");
    JLabel stage3 = new JLabel("★★★");
    JLabel stage4 = new JLabel("★★★★");
    JLabel stage5 = new JLabel("★★★★★");

    public MainForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// JFrame을 닫을 때 행동을 정해주는 메소드
        setBounds(1400, 900, 1400, 900);							// x y 좌표, 창의 크기를 정하는 메소드
        setResizable(false);                     	          	// 창 크기 조정 true -> 가능 / false -> 불가능
        setLocationRelativeTo(null);                            // 프로그램을 구동했을 때 가운데에 오게 해주는 메소드 (null 값 필요)
        getContentPane().setLayout(null);                       // JFrame의 Layout을 정해주는 메소드.
        														// null -> 앱솔루트 레이아웃. 요소들의 위치를 내가 직접 정할수 있다.
        //패널
        mainpanel.setLayout(null);
        mainpanel.setBounds(0, 0, 1400, 900);
        mainpanel.setBackground(new Color(190, 205, 255));
        getContentPane().add(mainpanel);
        
        userpanel.setLayout(null);
        userpanel.setBounds(0, 0, 400, 250);
        userpanel.setBackground(new Color(210, 225, 255));
        mainpanel.add(userpanel);
        
        datapanel.setLayout(null);
        datapanel.setBounds(0, 250, 400, 650);
        datapanel.setBackground(new Color(255,255,255));
        mainpanel.add(datapanel);
        //텍스트필드
        
        //라벨
        namelabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        namelabel.setForeground(new Color(0, 0, 0));
        namelabel.setBounds(30,50,500,50);
        userpanel.add(namelabel);
        
        idlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        idlabel.setForeground(new Color(0, 0, 0));
        idlabel.setBounds(30,150,500,50);
        userpanel.add(idlabel);
        
        timerlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        timerlabel.setForeground(new Color(0, 0, 0));
        timerlabel.setBounds(30,30,500,50);
        datapanel.add(timerlabel);
        
        timelabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        timelabel.setForeground(new Color(0, 0, 0));
        timelabel.setBounds(30,100,500,50);
        datapanel.add(timelabel);
        
        stage1.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stage1.setForeground(new Color(0, 0, 0));
        stage1.setBounds(450,20,500,50);
        mainpanel.add(stage1);
        
        stage2.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stage2.setForeground(new Color(0, 0, 0));
        stage2.setBounds(450,190,500,50);
        mainpanel.add(stage2);
        
        stage3.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stage3.setForeground(new Color(0, 0, 0));
        stage3.setBounds(450,360,500,50);
        mainpanel.add(stage3);
        
        stage4.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stage4.setForeground(new Color(0, 0, 0));
        stage4.setBounds(450,530,500,50);
        mainpanel.add(stage4);
        
        stage5.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stage5.setForeground(new Color(0, 0, 0));
        stage5.setBounds(450,700,500,50);
        mainpanel.add(stage5);
        
        //버튼
        btnLogout.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnLogout.setLayout(null);
        btnLogout.setBackground(new Color(210, 225, 255));
        btnLogout.setBounds(250,50,130,40);
        userpanel.add(btnLogout);
        
        for(int i=0;i<5;i++) {
        	btnStage1[i]=new JButton(btnStagetext[i]);
        	btnStage1[i].setVisible(true);
        	btnStage1[i].setForeground(new Color(0, 0, 0));
        	btnStage1[i].setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        	mainpanel.add(btnStage1[i]);
        }
        btnStage1[0].setBounds(450,80,100,100);
        btnStage1[1].setBounds(650,80,100,100);
        btnStage1[2].setBounds(850,80,100,100);
        btnStage1[3].setBounds(1050,80,100,100);
        btnStage1[4].setBounds(1250,80,100,100);
        
        for(int i=0;i<5;i++) {
        	btnStage2[i]=new JButton(btnStagetext[i]);
        	btnStage2[i].setVisible(true);
        	btnStage2[i].setForeground(new Color(0, 0, 0));
        	btnStage2[i].setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        	mainpanel.add(btnStage2[i]);
        }
        btnStage2[0].setBounds(450,250,100,100);
        btnStage2[1].setBounds(650,250,100,100);
        btnStage2[2].setBounds(850,250,100,100);
        btnStage2[3].setBounds(1050,250,100,100);
        btnStage2[4].setBounds(1250,250,100,100);
        
        for(int i=0;i<5;i++) {
        	btnStage3[i]=new JButton(btnStagetext[i]);
        	btnStage3[i].setVisible(true);
        	btnStage3[i].setForeground(new Color(0, 0, 0));
        	btnStage3[i].setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        	mainpanel.add(btnStage3[i]);
        }
        btnStage3[0].setBounds(450,420,100,100);
        btnStage3[1].setBounds(650,420,100,100);
        btnStage3[2].setBounds(850,420,100,100);
        btnStage3[3].setBounds(1050,420,100,100);
        btnStage3[4].setBounds(1250,420,100,100);
        
        for(int i=0;i<5;i++) {
        	btnStage4[i]=new JButton(btnStagetext[i]);
        	btnStage4[i].setVisible(true);
        	btnStage4[i].setForeground(new Color(0, 0, 0));
        	btnStage4[i].setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        	mainpanel.add(btnStage4[i]);
        }
        btnStage4[0].setBounds(450,590,100,100);
        btnStage4[1].setBounds(650,590,100,100);
        btnStage4[2].setBounds(850,590,100,100);
        btnStage4[3].setBounds(1050,590,100,100);
        btnStage4[4].setBounds(1250,590,100,100);
        
        for(int i=0;i<5;i++) {
        	btnStage5[i]=new JButton(btnStagetext[i]);
        	btnStage5[i].setVisible(true);
        	btnStage5[i].setForeground(new Color(0, 0, 0));
        	btnStage5[i].setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        	mainpanel.add(btnStage5[i]);
        }
        btnStage5[0].setBounds(450,760,100,100);
        btnStage5[1].setBounds(650,760,100,100);
        btnStage5[2].setBounds(850,760,100,100);
        btnStage5[3].setBounds(1050,760,100,100);
        btnStage5[4].setBounds(1250,760,100,100);
    }
    
    

    public static void main(String[] args) {
    	MainForm mafm = new MainForm();
    	mafm.setVisible(true);
    }
}
