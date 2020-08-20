package member1;

public class LoginImpl implements Login{
	private MemberVO loginUser; //�α��� �� ����� �����ϱ� ���� ��ü
	private Member member; //new�� �����ϸ� ������ ������ ������ ==> ��������!!!
	
	public LoginImpl(Member member) {
		this.member = member;
	}
	
	@Override
	public boolean isLogin(String id, String pwd) { //�α��� �Ǵ��� �ȵǴ��� Ȯ�θ� �ϴ� �޼ҵ�
		loginUser = null;
		
		MemberVO vo = member.readMember(id); //�ش���̵� �ִ��� ������ �˻�.
		if(vo==null) { //���̵� ����
			return false;
		}
		
		if(vo.getPwd().equals(pwd)) {
			loginUser = vo;
			return true;
		}
		
		return false;
	}

	@Override
	public void logout() { //�α��ε� ���� ����� �α׾ƿ�
		loginUser = null;
	}

	@Override
	public MemberVO loginMember() { //�α����� �ϱ� ���� �޼ҵ��̱� ������ �α������� �ѱ�
		return loginUser;
	}
}