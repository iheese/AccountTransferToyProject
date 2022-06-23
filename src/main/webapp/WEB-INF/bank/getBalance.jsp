<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="errors/errorPage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<body>
<center>
	<h1>계좌 현황</h1>
	<table border="1" cellpadding="0" cellspacing="0" width="500" height="60">
		<tr>
			<td align="center" colspan="2"><span style="color: red">${wooriVO.name}</span>님의 계좌 현황입니다.</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">계좌 번호</td>
			<td> ${wooriVO.accountNumberW}</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">보유 잔액</td>
			<td>${wooriVO.balance}원</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 출금 날짜</td>
			<td> ${wooriVO.withdrawDate}</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 입금 날짜</td>
			<td> ${wooriVO.receiptDate} </td>
		</tr>
		<tr>
			<td align="center" colspan="2"><a href="transferView.do">계좌 이체</a></td>
		</tr>
	</table>
</center>
</body>