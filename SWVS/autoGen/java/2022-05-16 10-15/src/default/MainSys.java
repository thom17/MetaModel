package default;


	/**	RQ-003-01:"���� GUI�� ����, ����, �ܾ��߰�, DB ������ �����Ѵ�."
	RQ-001-03:�ý����� ������ �پ��� ������� �����Ѵ�.
	RQ-001:�ý����� ������ ����� �ܾ���� �ݺ� �ð��� �ΰ� �ݺ� �������� �����Ͽ� ���� �ܾ �ϱ��Ҽ� �ֵ��� ���´�.
	RQ-001-02:���� �̷� �� ���Ҵ� ���⳪ ������ �����Ͽ� ������ �����Ѵ�.
	RQ-001-01:���迡 ����� �ܾ��� �̷��� �����Ͽ� �ð����� �ΰ� ������ ġ��� �Ϻ��� �ϱ��Ҽ� �ֵ��� �Ѵ�.
	RQ-002:"�ý����� �����ͺ��̽��� ���� �ܾ�, ����, �̷� ���� �����Ѵ�."
	RQ-003:�ý����� GUI�� �����Ͽ� ����ڿ� ��ȣ�ۿ��� �Ѵ�.
	RQ-004:.csv ������ �о� �ܾ��� �߰������ �����Ѵ�.
	*/
public class MainSys
{

	/**UC-01
	�ý����� ����ڷκ��� �ܾ �߰��Ѵ�.
	*/
	public null main()
	{
		// ����ڴ� �߰��� �ܾ��� ��� ����縵�� �Է��Ѵ�.		UC-01-FL-1
		MainSys.inputWord();

		// �ý����� �ش� �ܾ DB���� ��ȸ�Ͽ� �̹� �ִ� �ܾ����� Ȯ���Ѵ�.		UC-01-FL-2
		MainSys.getWord(word);

		//2 �ý����� ���� �߰��Ϸ��� �ܾ ���ο� �ܾ��� �ش� �ܾ �����Ͽ� �߰��Ѵ�.		UC-01-FL-3
		MainSys.addWord(word);

		// ���� �߰�(Ȥ�� ����) �� �ܾ �ϱ� �ʱ� ���·� �����Ͽ� DB�� �����Ѵ�.		UC-01-FL-4
		MainSys.db.updateWord(word);

		// ���� �߰�(Ȥ�� ����)�� �ܾ ���ϳ� ���� ��������Ʈ�� �߰��Ѵ�.		UC-01-FL-5
		MainSys.exam.addWord(word);

		// �ý����� �ܾ��� �߰� �������θ� ����Ͽ� �˸��� ���� �޴��� ���ư���.		UC-01-FL-6
		MainSys.return;

	}

	/**UC-01-FL-1
	 ����ڴ� �߰��� �ܾ��� ��� ����縵�� �Է��Ѵ�.
	@return 
	*/
	public void inputWord()
	{
	}

	/**UC-01-FL-2
	 �ý����� �ش� �ܾ DB���� ��ȸ�Ͽ� �̹� �ִ� �ܾ����� Ȯ���Ѵ�.
	@return 
	*/
	public void getWord(word)
	{
	}

	/**UC-01-FL-3
	2 �ý����� ���� �߰��Ϸ��� �ܾ ���ο� �ܾ��� �ش� �ܾ �����Ͽ� �߰��Ѵ�.
	@return 
	*/
	public void addWord(word)
	{
	}

	/**UC-01-FL-4
	 ���� �߰�(Ȥ�� ����) �� �ܾ �ϱ� �ʱ� ���·� �����Ͽ� DB�� �����Ѵ�.
	@return 
	*/
	public void db.updateWord(word)
	{
	}

	/**UC-01-FL-5
	 ���� �߰�(Ȥ�� ����)�� �ܾ ���ϳ� ���� ��������Ʈ�� �߰��Ѵ�.
	@return 
	*/
	public void exam.addWord(word)
	{
	}

	/**UC-01-FL-6
	 �ý����� �ܾ��� �߰� �������θ� ����Ͽ� �˸��� ���� �޴��� ���ư���.
	@return 
	*/
	public void return
	{
	}

}
