package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	
	String greet(int i);//インターフェースなので中身の処理の記述なし
	
	ArrayList<Member> getAll();

}
