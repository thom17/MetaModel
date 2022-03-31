package default;


	/**	RQ-3-1:Rq3.1 Context…
	RQ-2:Rq2 Context…
	RQ-3:Rq3 Context…
	RQ-1:Rq1 Context…
	*/
public class 타자프로그램
{

	/**UC01
	플레이어가 타자 연습을 진행함
	*/
	public null null
	{
		// @User가 @MainSystem의 UC01을 실행함		UC01-FL-1
		타자프로그램.playTyping();

		// @MainSystem은 타겟 파일 불러옴		UC01-FL-2
		타자프로그램.loadTarget();

		// @MainSystem은 프로그램의 시작을 위해 플레이어의 이름 입력을 대기함.		UC01-FL-3
		타자프로그램.inputName();

		// @User가 플레이어의 이름을 입력하고 @MainSystem은 시작 시간을 측정함.		UC01-FL-4
		타자프로그램.checkTime(name);

		// @MainSystem은 파일을 다 타이핑 할때 까지 다음 공백이 아닌 라인을 찾기를 반복함.		UC01-FL-5
		타자프로그램.typing();

		// @MainSystem은 종료시간을 측정후 분당 입력키를 계산함.		UC01-FL-6
		타자프로그램.checkTime();

		// @MainSystem은 UC01-1을 실행함.		UC01-FL-7
		타자프로그램.finish();

	}

	/**UC01-FL-1
	 @User가 @MainSystem의 UC01을 실행함
	@return  타겟 파일을 반환
	*/
	public void playTyping()
	{
		// @MainSystem은 파라미터가 없다면 UC01E1 실행함.		UC01-FL-1-1
		타자프로그램.parameterSet();

	}

	/**UC01-FL-2
	 @MainSystem은 타겟 파일 불러옴
	@return 
	*/
	public void loadTarget()
	{
	}

	/**UC01-FL-3
	 @MainSystem은 프로그램의 시작을 위해 플레이어의 이름 입력을 대기함.
	@return 이름의 반환
	*/
	public void inputName()
	{
	}

	/**UC01-FL-4
	 @User가 플레이어의 이름을 입력하고 @MainSystem은 시작 시간을 측정함.
	@return 게임의 시작
	*/
	public void checkTime(name)
	{
	}

	/**UC01-FL-5
	 @MainSystem은 파일을 다 타이핑 할때 까지 다음 공백이 아닌 라인을 찾기를 반복함.
	@return 
	*/
	public void typing()
	{
		// @MainSystem은 파일의 내용을 모두 다 타이핑했다면 다음 단계로 넘어감.		UC01-FL-5-1
		타자프로그램.checkEnd();

		// @MainSystem은 타이핑할 다음 라인을 찾았다면 출력하고 유저의 입력을 대기함.		UC01-FL-5-2
		타자프로그램.inputLine();

		// @MainSystem은 User가 입력한 문자의 틀린 문자와 글자수를 체크함.		UC01-FL-5-3
		타자프로그램.checkAns();

		// @MainSystem은 타이핑할 다음 라인을 반환함		UC01-FL-5-4
		타자프로그램.getNextLine();

	}

	/**UC01-FL-6
	 @MainSystem은 종료시간을 측정후 분당 입력키를 계산함.
	@return 
	*/
	public void checkTime()
	{
	}

	/**UC01-FL-7
	 @MainSystem은 UC01-1을 실행함.
	@return 플레이어 기록 저장
	*/
	public void finish()
	{
	}

}

