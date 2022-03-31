package typing;


	*/
public class MainClass
{
	File target;
	String name;
	null codeLineList;
	String[] ansLineList;

	/**UC01
	jar 파일의 실행을 의미하며 파라미터와 함께 타자 연습 프로그램이 시작됨
	*/
	public static void main(String args[])
	{
		//타겟 파일을 설정함		UC01-FL1
		check(argument);

		//UC01E1을 실행함		UC01-FL1-1
		makeTargetFile();

		//타겟파일을 불러옴		UC01-FL2
		readFile(file);

		//플레이어의 이름 입력을 대기		UC01-FL3
		readName();

		//플레이어의 이름 입력을 대기		UC01-FL4
		setStartTim();

		//타이핑이 끝날때 까지 타이핑		UC01-FL5
		typing();

		//플레이어의 기록을 측정		UC01-FL6
		MainClass.setEndTime();

	}

	/**UC01-FL1
	타겟 파일을 설정함
	@return File 생성 및 읽은 파일을 반환
	*/
	public void fileSet(args)
	{
		//UC01E1을 실행함		UC01-FL1-1
		makeTargetFile();

	}

	/**UC01-FL2
	타겟파일을 불러옴
	@return String[] 읽은 파일의 내용을 줄단위로 반환
	*/
	public void load(file)
	{
	}

	/**UC01-FL3
	플레이어의 이름 입력을 대기
	@return String 이름을 읽어 반환
	*/
	public void readName()
	{
	}

	/**UC01-FL4
	플레이어의 이름 입력을 대기
	@return 타이핑의 시작 시간 설정
	*/
	public void setStartTime()
	{
	}

	/**UC01-FL5
	타이핑이 끝날때 까지 타이핑
	@return 타이핑의 종료
	*/
	public void main()
	{
		//타이핑이 끝날때 까지 타이핑		UC01-FL5-1
		while( not end);

	}

	/**UC01-FL6
	플레이어의 기록을 측정
	@return 타이핑의 종료 시간 설정, 분당 입력키 측정
	*/
	public void setEndTime()
	{
	}

}

