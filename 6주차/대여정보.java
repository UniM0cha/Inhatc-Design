
public class �뿩���� {
	private String �뿩id;
	private int �뿩��;
	private int �ݳ�������;
	private int �ݳ���;
	
	public boolean �뿩(String id, String ����id,
			int �뿩��, int �ݳ�������) {
		��������� u1 = new ���������();
		if(u1.�����id��ȸ(id)) {
			�������� b1 = new ��������();
			if (b1.����id��ȸ(����id)) {
				this.�뿩id = id + ����id;
				this.�뿩�� = �뿩��;
				this.�ݳ������� = �ݳ�������;
				System.out.println("�뿩�� �Ϸ�Ǿ����ϴ�.");
				return true;
			}else {
				System.out.println("�̵�� �����Դϴ�.");
				return false;
			}
		} else {
			System.out.println("�̵�� ������Դϴ�.");
			return false;
		}
	}
	
	public boolean �ݳ�(String id, String ����id, int �ݳ���) {
		��������� u1 = new ���������();
		if(u1.�����id��ȸ(id)) {
			�������� b1 = new ��������();
			if(b1.����id��ȸ(����id)) {
				this.�ݳ��� = �ݳ���;
				if (this.��üȮ��(�ݳ���)) {
					System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("��ü�Ǿ����ϴ�.");
				}
				return true;
			}else {
				System.out.println("�̵�� �����Դϴ�.");
				return false;
			}
		}else {
			System.out.println("�̵�� ������Դϴ�.");
			return false;
		}
	}
	
	public boolean ��üȮ��(int �ݳ���) {
		if (�ݳ��� > this.�ݳ�������) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
