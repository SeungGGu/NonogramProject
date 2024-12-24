package com.java.Loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.Mainform.MainForm;

public class LoginForm extends JFrame implements ActionListener{
	
	JTextField idtf = new JTextField();
	JTextField pwtf = new JTextField();
		
    JPanel mainpanel = new JPanel();
    JPanel editpanel = new JPanel();
    JPanel btnpanel = new JPanel();
    
    JButton btnLogin = new JButton("로그인");
    JButton btnAccount = new JButton("회원가입");
    JButton btnFpwd = new JButton("비밀번호 찾기");
    
    JLabel label = new JLabel("네모네모 로직");
    JLabel idlabel = new JLabel("ID");
    JLabel pwlabel = new JLabel("PassWord");
    
    public static void main(String[] args) {
        LoginForm logf = new LoginForm();
        logf.setVisible(true);
    }

    public LoginForm() {
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
        
        editpanel.setLayout(null);
        editpanel.setBounds(100, 200, 800, 550);
        editpanel.setBackground(new Color(255, 255, 255));
        mainpanel.add(editpanel);
        
        btnpanel.setLayout(null);
        btnpanel.setBounds(950, 200, 350, 550);
        btnpanel.setBackground(new Color(255,255,255));
        mainpanel.add(btnpanel);
        //텍스트필드
        idtf.setLayout(null);
        idtf.setBounds(30,150,500,80);
        idtf.setFont(new Font("세방고딕 Bold", Font.PLAIN, 60));
        editpanel.add(idtf);
        
        pwtf.setLayout(null);
        pwtf.setBounds(30,400,500,80);
        pwtf.setFont(new Font("세방고딕 Bold", Font.PLAIN, 60));
        editpanel.add(pwtf);
        
        //라벨
        label.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        label.setForeground(new Color(0, 0, 0));
        label.setBounds(500,70,500,50);
        mainpanel.add(label);
        
        idlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        idlabel.setForeground(new Color(0, 0, 0));
        idlabel.setBounds(30,50,500,50);
        editpanel.add(idlabel);
        
        pwlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        pwlabel.setForeground(new Color(0, 0, 0));
        pwlabel.setBounds(30,300,500,50);
        editpanel.add(pwlabel);

        //버튼
        btnAccount.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnAccount.setLayout(null);
        btnAccount.setBackground(new Color(210, 225, 255));
        btnAccount.setBounds(50,50,250,80);
        btnpanel.add(btnAccount);
        
        btnFpwd.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnFpwd.setLayout(null);
        btnFpwd.setBackground(new Color(210, 225, 255));
        btnFpwd.setBounds(50,180,250,80);
        btnpanel.add(btnFpwd);
        
        btnLogin.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnLogin.setLayout(null);
        btnLogin.setBackground(new Color(210, 225, 255));
        btnLogin.setBounds(50,420,250,80);
        btnpanel.add(btnLogin);
        
        btnLogin.addActionListener(this);
        btnFpwd.addActionListener(this);
        btnAccount.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		
		String inID = idtf.getText().toString();
		String inPW = pwtf.getText().toString();
		
		//로그인 시
		if(e.getSource() == btnLogin || e.getSource() == pwtf) {
			this.setVisible(false);
			MainForm mfcg = new MainForm();
			mfcg.setVisible(true);
		}
		else if(e.getSource() == btnAccount) { // 회원가입 버튼 클릭시
			this.setVisible(false);
			AccountForm accg = new AccountForm();
			accg.setVisible(true);
		}
		else if(e.getSource() == btnFpwd) {
			this.setVisible(false);
			PasswordFindForm pfcg = new PasswordFindForm();
			pfcg.setVisible(true);
		}
	}
}
