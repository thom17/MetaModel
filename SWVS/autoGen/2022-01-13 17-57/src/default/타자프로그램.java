package default;


	/**	RQ-3-1:Rq3.1 Context��
	RQ-2:Rq2 Context��
	RQ-3:Rq3 Context��
	RQ-1:Rq1 Context��
	*/
public class Ÿ�����α׷�
{

	/**UC01
	�÷��̾ Ÿ�� ������ ������
	*/
	public null null
	{
		// @User�� @MainSystem�� UC01�� ������		UC01-FL-1
		Ÿ�����α׷�.playTyping();

		// @MainSystem�� Ÿ�� ���� �ҷ���		UC01-FL-2
		Ÿ�����α׷�.loadTarget();

		// @MainSystem�� ���α׷��� ������ ���� �÷��̾��� �̸� �Է��� �����.		UC01-FL-3
		Ÿ�����α׷�.inputName();

		// @User�� �÷��̾��� �̸��� �Է��ϰ� @MainSystem�� ���� �ð��� ������.		UC01-FL-4
		Ÿ�����α׷�.checkTime(name);

		// @MainSystem�� ������ �� Ÿ���� �Ҷ� ���� ���� ������ �ƴ� ������ ã�⸦ �ݺ���.		UC01-FL-5
		Ÿ�����α׷�.typing();

		// @MainSystem�� ����ð��� ������ �д� �Է�Ű�� �����.		UC01-FL-6
		Ÿ�����α׷�.checkTime();

		// @MainSystem�� UC01-1�� ������.		UC01-FL-7
		Ÿ�����α׷�.finish();

	}

	/**UC01-FL-1
	 @User�� @MainSystem�� UC01�� ������
	@return  Ÿ�� ������ ��ȯ
	*/
	public void playTyping()
	{
		// @MainSystem�� �Ķ���Ͱ� ���ٸ� UC01E1 ������.		UC01-FL-1-1
		Ÿ�����α׷�.parameterSet();

	}

	/**UC01-FL-2
	 @MainSystem�� Ÿ�� ���� �ҷ���
	@return 
	*/
	public void loadTarget()
	{
	}

	/**UC01-FL-3
	 @MainSystem�� ���α׷��� ������ ���� �÷��̾��� �̸� �Է��� �����.
	@return �̸��� ��ȯ
	*/
	public void inputName()
	{
	}

	/**UC01-FL-4
	 @User�� �÷��̾��� �̸��� �Է��ϰ� @MainSystem�� ���� �ð��� ������.
	@return ������ ����
	*/
	public void checkTime(name)
	{
	}

	/**UC01-FL-5
	 @MainSystem�� ������ �� Ÿ���� �Ҷ� ���� ���� ������ �ƴ� ������ ã�⸦ �ݺ���.
	@return 
	*/
	public void typing()
	{
		// @MainSystem�� ������ ������ ��� �� Ÿ�����ߴٸ� ���� �ܰ�� �Ѿ.		UC01-FL-5-1
		Ÿ�����α׷�.checkEnd();

		// @MainSystem�� Ÿ������ ���� ������ ã�Ҵٸ� ����ϰ� ������ �Է��� �����.		UC01-FL-5-2
		Ÿ�����α׷�.inputLine();

		// @MainSystem�� User�� �Է��� ������ Ʋ�� ���ڿ� ���ڼ��� üũ��.		UC01-FL-5-3
		Ÿ�����α׷�.checkAns();

		// @MainSystem�� Ÿ������ ���� ������ ��ȯ��		UC01-FL-5-4
		Ÿ�����α׷�.getNextLine();

	}

	/**UC01-FL-6
	 @MainSystem�� ����ð��� ������ �д� �Է�Ű�� �����.
	@return 
	*/
	public void checkTime()
	{
	}

	/**UC01-FL-7
	 @MainSystem�� UC01-1�� ������.
	@return �÷��̾� ��� ����
	*/
	public void finish()
	{
	}

}

