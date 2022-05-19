
class MainSys: 
	"""
	RQ-003-01:"메인 GUI는 종료, 시험, 단어추가, DB 관리를 제공한다."
	RQ-001-03:시스템은 시험을 다양한 방식으로 제공한다.
	RQ-001:시스템은 개인이 등록한 단어들을 반복 시간을 두고 반복 시험기능을 지원하여 영어 단어를 암기할수 있도록 돕는다.
	RQ-001-02:오답 이력 이 높았던 보기나 문제를 고려하여 시험을 생성한다.
	RQ-001-01:시험에 통과한 단어의 이력을 저장하여 시간차를 두고 시험을 치루어 완벽히 암기할수 있도록 한다.
	RQ-002:"시스템은 데이터베이스를 통해 단어, 문제, 이력 등을 관리한다."
	RQ-003:시스템은 GUI를 제공하여 사용자와 상호작용을 한다.
	RQ-004:.csv 파일을 읽어 단어의 추가기능을 지원한다.

	"""

	def main(self, ):
		/**UC-01
		시스템은 사용자로부터 단어를 추가한다.
		*/
		# 사용자는 추가할 단어의 뜻과 영어스펠링을 입력한다.		UC-01-FL-1
		MainSys.inputWord()
		# 시스템은 해당 단어를 DB에서 조회하여 이미 있는 단어인지 확인한다.		UC-01-FL-2
		MainSys.getWord(word)
		#2 시스템은 새로 추가하려는 단어가 새로운 단어라면 해당 단어를 생성하여 추가한다.		UC-01-FL-3
		MainSys.addWord(word)
		# 새로 추가(혹은 갱신) 한 단어를 암기 초기 상태로 설정하여 DB에 적용한다.		UC-01-FL-4
		MainSys.db.updateWord(word)
		# 새로 추가(혹은 갱신)한 단어를 당일날 시험 문제리스트에 추가한다.		UC-01-FL-5
		MainSys.exam.addWord(word)
		# 시스템은 단어의 추가 성공여부를 출력하여 알리고 메인 메뉴로 돌아간다.		UC-01-FL-6
		MainSys.return


	def inputWord(self, ):
		""" UC-01-FL-1
		 사용자는 추가할 단어의 뜻과 영어스펠링을 입력한다.

		return 
		"""


	def getWord(self, word):
		""" UC-01-FL-2
		 시스템은 해당 단어를 DB에서 조회하여 이미 있는 단어인지 확인한다.

		return 
		"""


	def addWord(self, word):
		""" UC-01-FL-3
		2 시스템은 새로 추가하려는 단어가 새로운 단어라면 해당 단어를 생성하여 추가한다.

		return 
		"""


	def db.updateWord(self, word):
		""" UC-01-FL-4
		 새로 추가(혹은 갱신) 한 단어를 암기 초기 상태로 설정하여 DB에 적용한다.

		return 
		"""


	def exam.addWord(self, word):
		""" UC-01-FL-5
		 새로 추가(혹은 갱신)한 단어를 당일날 시험 문제리스트에 추가한다.

		return 
		"""


	def return:
		""" UC-01-FL-6
		 시스템은 단어의 추가 성공여부를 출력하여 알리고 메인 메뉴로 돌아간다.

		return 
		"""




