
# AccountTransferToyProject

- JAVA: v11, Tomcat : v9.0, Spring : v5.3.9
- h2(DataBase) : v2.0.202, MyBatis : v3.3.1, MyBatis-Spring : v1.2.4

<br>

- Spring과 MyBatis 학습을 위해 진행한 개인 Toy Project입니다. 
- WOORI 은행과 KBSTAR 은행 간의 계좌 이체 프로그램입니다. 
- 각 은행에는 홍길동의 계좌가 각각 하나씩 존재하며 임의로 계좌와 금액을 h2 데이터베이스에 입력해놨습니다. 

![계좌 입력 처음 화면](https://user-images.githubusercontent.com/88040158/175468407-074b196b-794c-48ff-96a7-c618162bed10.png)

- WOORI 은행 계좌 번호를 입력하면 조회가 가능합니다. 

<br>

![우리은행계좌 현황](https://user-images.githubusercontent.com/88040158/175468419-1ac0fe48-0ad6-4b54-86f7-414b0d176413.png)

- WOORI 은행 계좌 번호, 보유 잔액, 마지막 출금 날짜, 입금 날짜를 조회할 수 있습니다. 
- 계좌 이체를 클릭하면 계좌 이체할 수 있는 사이트로 넘어갑니다.

<br>

![계좌이체하기](https://user-images.githubusercontent.com/88040158/175468417-0b4e6582-c317-4ea5-8c68-639cc2a51f56.png)

- 계좌 번호, 이체 가능 금액을 보여주고, 이체 금액과, 이체할 금액, 이체할 계좌번호를 입력 받게 했습니다. 
- 이 프로젝트에서는 국민은행과의 거래만 가능하게 구현하였습니다. (다른 은행을 선택하면 에러 페이지가 뜨게 했습니다.)

<br>

![계좌이체하기 데이터입력](https://user-images.githubusercontent.com/88040158/175468416-16a01aad-4aae-4f17-b8b7-69c598c4d25f.png)

- 이체 금액, 이체할 은행, 이체할 계좌번호가 모두 조건에 맞다면 이체하기  버튼을 클릭하면 됩니다. 

<br>

![계좌이체 결과](https://user-images.githubusercontent.com/88040158/175468411-1d15bbd5-78fe-43fc-a449-93501923da67.png)

- 이체하기 버튼을 클릭하면 보낸 계좌와 받은 계좌의 이체 결과를 한 페이지에 뜨게 했습니다.
- WOORI 은행 계좌에서 돈이 잘 이체되었고 KBSTAR 은행 계좌에서 돈을 잘 송금한 것을 볼 수 있습니다. 

<br>

![입력값 오류](https://user-images.githubusercontent.com/88040158/175468420-16473164-69df-4e86-ad58-139b1a4938c5.png)

- 보내는 계좌 번호, 받는 계좌 번호, 은행명(KBSTAR만 이체되게 구현하였다.) 이 틀릴 경우 뜨는 페이지를 구현했습니다. 

<br>

![잔액초과에러 페이지](https://user-images.githubusercontent.com/88040158/175468424-6903f24a-3d7d-4111-b4b3-1fd04a157cf3.png)

- 보유 잔액보다 이체할 금액이 초과될 경우 뜨는 페이지를 구현했습니다. 

<hr>

- Spring MVC를 이용하여 Controller로 모든 요청을 post로 받았습니다.
> - 은행 정보를 url에 드러내는 것은 좋지 않다고 판단하였습니다.
- Controller 처리에서는 사용자 입력 정보 추출, 유효성 체크와 화면 이동을 구현하였습니다. 
- Service 처리에서 출금, 입금, DB 업데이트 로직을 넣었습니다.  
- DAO 에서는 계좌 조회, 계좌 정보를 업데이트하는 로직을 구현했습니다. 

<hr>

- 스프링이 제공하는  DataSourceTransactionManager을 이용해 Service 구현체의 모든 메소드가 실행될 때 예외가 발생할 경우 적용될 수 있는 Transaction 관리 AOP 설정을 적용해보았습니다.

<hr>

- MyBatis를 사용하여 DAO에서 내부에서 사용되던 sql문을 .xml 파일로 따로 관리하여 DAO와 sql문의 관리를 편하게 하였습니다. 
- DAO 객체 마다 mapping.xml을 따로 하여 유지 보수를 용이하게 하였습니다. 

<br>

Reference :

- 백엔드 개발자 과정 _ 패스트 캠퍼스, 채규태 강사님 강의의 개인 프로젝트 결과물 입니다. 
