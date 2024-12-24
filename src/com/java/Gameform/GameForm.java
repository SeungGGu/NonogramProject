package com.java.Gameform;

import javax.swing.*;
import java.awt.*;

public class GameForm extends JFrame {
	
    JPanel gamepanel = new JPanel();
    JPanel userpanel = new JPanel();
    JPanel datapanel = new JPanel();
    
    JButton btnpause = new JButton("일시정지");
    
    JLabel namelabel = new JLabel("승");
    JLabel idlabel = new JLabel("seong");
    JLabel timerlabel = new JLabel("Timer");
    JLabel timelabel = new JLabel("00:00:00");
    JLabel gtimelabel = new JLabel("00:00:00");
    JLabel lifelabel = new JLabel("♥♥♥");
    JLabel stagelabel = new JLabel("★-1");


    public GameForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// JFrame을 닫을 때 행동을 정해주는 메소드
        setBounds(1400, 900, 1400, 900);							// x y 좌표, 창의 크기를 정하는 메소드
        setResizable(false);                     	          	// 창 크기 조정 true -> 가능 / false -> 불가능
        setLocationRelativeTo(null);                            // 프로그램을 구동했을 때 가운데에 오게 해주는 메소드 (null 값 필요)
        getContentPane().setLayout(null);                       // JFrame의 Layout을 정해주는 메소드.
        														// null -> 앱솔루트 레이아웃. 요소들의 위치를 내가 직접 정할수 있다.
        //패널
        gamepanel.setLayout(null);
        gamepanel.setBounds(0, 0, 1400, 900);
        gamepanel.setBackground(new Color(190, 205, 255));
        getContentPane().add(gamepanel);
        
        userpanel.setLayout(null);
        userpanel.setBounds(0, 0, 400, 250);
        userpanel.setBackground(new Color(210, 225, 255));
        gamepanel.add(userpanel);
        
        datapanel.setLayout(null);
        datapanel.setBounds(0, 250, 400, 650);
        datapanel.setBackground(new Color(255,255,255));
        gamepanel.add(datapanel);
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
        
        lifelabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        lifelabel.setForeground(new Color(0, 0, 0));
        lifelabel.setBounds(650,5,400,100);
        gamepanel.add(lifelabel);
        
        stagelabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        stagelabel.setForeground(new Color(0, 0, 0));
        stagelabel.setBounds(450,5,400,100);
        gamepanel.add(stagelabel);
        
        gtimelabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        gtimelabel.setForeground(new Color(0, 0, 0));
        gtimelabel.setBounds(1100,5,400,100);
        gamepanel.add(gtimelabel);
        
        
        //버튼
        btnpause.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnpause.setLayout(null);
        btnpause.setBackground(new Color(210, 225, 255));
        btnpause.setBounds(250,50,130,40);
        userpanel.add(btnpause);
        
        
    }

    public static void main(String[] args) {
    	GameForm gmfm = new GameForm();
    	gmfm.setVisible(true);
    }
}
