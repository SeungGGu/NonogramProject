package com.java.Loginform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.java.Mainform.MainForm;

public class AccountForm extends JFrame implements ActionListener{
	
	JTextField idtf = new JTextField();
	JTextField pwtf = new JTextField();
	JTextField nntf = new JTextField();
		
    JPanel mainpanel = new JPanel();
    JPanel editpanel = new JPanel();
    JPanel btnpanel = new JPanel();
    
    JButton btnBack = new JButton("돌아가기");
    JButton btnAccount = new JButton("회원가입");
    
    JLabel label = new JLabel("회원 가입");
    JLabel idlabel = new JLabel("ID");
    JLabel pwlabel = new JLabel("PassWord");
    JLabel nnlabel = new JLabel("NickName");
    
    public static void main(String[] args) {
    	AccountForm actf = new AccountForm();
    	actf.setVisible(true);
    }

    public AccountForm() {
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
        idtf.setBounds(30,90,500,80);
        idtf.setFont(new Font("세방고딕 Bold", Font.PLAIN, 60));
        editpanel.add(idtf);
        
        pwtf.setLayout(null);
        pwtf.setBounds(30,260,500,80);
        pwtf.setFont(new Font("세방고딕 Bold", Font.PLAIN, 60));
        editpanel.add(pwtf);
        
        nntf.setLayout(null);
        nntf.setBounds(30,430,500,80);
        nntf.setFont(new Font("세방고딕 Bold", Font.PLAIN, 60));
        editpanel.add(nntf);
        
        //라벨
        label.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        label.setForeground(new Color(0, 0, 0));
        label.setBounds(500,70,500,50);
        mainpanel.add(label);
        
        idlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        idlabel.setForeground(new Color(0, 0, 0));
        idlabel.setBounds(30,20,500,50);
        editpanel.add(idlabel);
        
        pwlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        pwlabel.setForeground(new Color(0, 0, 0));
        pwlabel.setBounds(30,190,500,50);
        editpanel.add(pwlabel);
        
        nnlabel.setFont(new Font("세방고딕 Bold",Font.PLAIN,60));
        nnlabel.setForeground(new Color(0, 0, 0));
        nnlabel.setBounds(30,360,500,50);
        editpanel.add(nnlabel);

        //버튼
        btnBack.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnBack.setLayout(null);
        btnBack.setBackground(new Color(210, 225, 255));
        btnBack.setBounds(50,50,250,80);
        btnpanel.add(btnBack);
        
        btnAccount.setFont(new Font("세방고딕 Bold",Font.PLAIN,20));
        btnAccount.setLayout(null);
        btnAccount.setBackground(new Color(210, 225, 255));
        btnAccount.setBounds(50,420,250,80);
        btnpanel.add(btnAccount);
        
        btnBack.addActionListener(this);
        btnAccount.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		
		String inID = idtf.getText().toString();
		String inPW = pwtf.getText().toString();
		String innn = nntf.getText().toString();
		
		//로그인 시
		if(e.getSource() == btnAccount || e.getSource() == pwtf) {
			this.setVisible(false);
			LoginForm mfcg = new LoginForm();
			mfcg.setVisible(true);
		}
		else if(e.getSource() == btnBack) { // 회원가입 버튼 클릭시
			this.setVisible(false);
			LoginForm accg = new LoginForm();
			accg.setVisible(true);
		}
	}
}
