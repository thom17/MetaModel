package typing;


	*/
public class MainClass
{
	File target;
	String name;
	null codeLineList;
	String[] ansLineList;

	/**UC01
	jar ������ ������ �ǹ��ϸ� �Ķ���Ϳ� �Բ� Ÿ�� ���� ���α׷��� ���۵�
	*/
	public static void main(String args[])
	{
		//Ÿ�� ������ ������		UC01-FL1
		check(argument);

		//UC01E1�� ������		UC01-FL1-1
		makeTargetFile();

		//Ÿ�������� �ҷ���		UC01-FL2
		readFile(file);

		//�÷��̾��� �̸� �Է��� ���		UC01-FL3
		readName();

		//�÷��̾��� �̸� �Է��� ���		UC01-FL4
		setStartTim();

		//Ÿ������ ������ ���� Ÿ����		UC01-FL5
		typing();

		//�÷��̾��� ����� ����		UC01-FL6
		MainClass.setEndTime();

	}

	/**UC01-FL1
	Ÿ�� ������ ������
	@return File ���� �� ���� ������ ��ȯ
	*/
	public void fileSet(args)
	{
		//UC01E1�� ������		UC01-FL1-1
		makeTargetFile();

	}

	/**UC01-FL2
	Ÿ�������� �ҷ���
	@return String[] ���� ������ ������ �ٴ����� ��ȯ
	*/
	public void load(file)
	{
	}

	/**UC01-FL3
	�÷��̾��� �̸� �Է��� ���
	@return String �̸��� �о� ��ȯ
	*/
	public void readName()
	{
	}

	/**UC01-FL4
	�÷��̾��� �̸� �Է��� ���
	@return Ÿ������ ���� �ð� ����
	*/
	public void setStartTime()
	{
	}

	/**UC01-FL5
	Ÿ������ ������ ���� Ÿ����
	@return Ÿ������ ����
	*/
	public void main()
	{
		//Ÿ������ ������ ���� Ÿ����		UC01-FL5-1
		while( not end);

	}

	/**UC01-FL6
	�÷��̾��� ����� ����
	@return Ÿ������ ���� �ð� ����, �д� �Է�Ű ����
	*/
	public void setEndTime()
	{
	}

}

