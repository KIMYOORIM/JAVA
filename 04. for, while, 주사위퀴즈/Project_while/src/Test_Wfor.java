// �ݺ��� 100���� ������ 98��°(continue)������ �ݺ��ǰ� �׵� ����ȵǰ� �ٽ� �ղ� ����.
public class Test_Wfor {
public static void main(String[] args) {
for (int i = 0; i < 100; i ++) {
	//System.out.print("a")�� Ȯ�ΰ��� 98���ڴ� �������� a�� ����
	if (i == 98) {
		continue;
	}
	System.out.println(i);
	}
}

}
