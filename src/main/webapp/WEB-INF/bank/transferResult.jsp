<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="errors/errorPage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<center>
	<h1>계좌 이체결과</h1>
	
	<h2>WOORI 은행</h2>
	<table border="1" cellpadding="0" cellspacing="0" width="500"
		height="60">
		<tr>
			<td align="center" colspan="2"><span style="color: red">${wooriVO.name}</span>님의계좌 현황입니다.</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">보유 잔액</td>
			<td>${wooriVO.balance }</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 출금 날짜</td>
			<td>${wooriVO.withdrawDate}</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 입금 날짜</td>
			<td>${wooriVO.receiptDate}</td>
		</tr>
	</table>
	<hr>
	
	<h2>KBSTAR 은행</h2>
	<table border="1" cellpadding="0" cellspacing="0" width="500"
		height="60">
		<tr>
			<td align="center" colspan="2"><span style="color: red">${kbstarVO.name}</span>님의계좌 현황입니다.</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">보유 잔액</td>
			<td>${kbstarVO.balance }</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 출금 날짜</td>
			<td>${kbstarVO.withdrawDate}</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">마지막 입금 날짜</td>
			<td>${kbstarVO.receiptDate}</td>
		</tr>
	</table>
	<hr>
</center>