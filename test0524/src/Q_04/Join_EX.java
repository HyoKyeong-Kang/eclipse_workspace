package Q_04;


class Join_EX {
	public String nickname;
	public String pw;




	public Join_EX(String nickname, String pw) {
		super();
		this.nickname = nickname;
		this.pw = pw;
	}
	
	public void printinfo() {
		System.out.printf("닉네임 : %s\n", this.nickname);
	}
	
	
	public boolean checkId(String inputUserNickname) {
		return this.nickname.equals(inputUserNickname);
	}
	public boolean checkUserPwd(String inputUserPwd) {
		return this.pw.equals(inputUserPwd);
	}
	
	public void deleteMember() {
		this.nickname = null;
		this.pw = null;
		System.out.println("회원정보가 삭제되었습니다.");
	}
	
	public void updateInfo(String newNickname, String pw){
		this.nickname = newNickname;
		this.pw = pw;
		System.out.println("회원정보가 수정되었습니다.");
		System.out.println("닉네임 : " + newNickname + "!변경완료!");
	}
}
