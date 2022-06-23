<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="errors/errorPage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<center>
	
	<h1>계좌 이체하기</h1>
	<form action="transfer.do">
	<input type="hidden" name="accountNumberW" value="${wooriVO.accountNumberW }"/>
	<table border="1" cellpadding="0" cellspacing="0" width="500" height="60">
		<tr>
			<td align="left" bgcolor="orange">계좌 번호</td>
			<td align="left">${wooriVO.accountNumberW}</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange">이체 가능 금액</td>
			<td align="left" >${wooriVO.balance}원</td>
		</tr>

		<tr>
			<td align="left" bgcolor="orange" width="150">이체 금액</td>
			<td ><input type="text" name="transferMoney" size="8">원</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">이체할 은행</td>
			<td> 
				<select name="bankName">
					<option>우리은행</option>
					<option>신한은행</option>
					<option value="KBSTAR" selected="selected">국민은행</option>
					<option>하나은행</option>
					<option>SC제일은행</option>
					<option>농협은행</option>
					<option>신협</option>
					<option>축협</option>
				</select>
			</td>
		</tr>
		<tr>
			<td align="left" bgcolor="orange" width="150">이체할 계좌번호</td>
			<td> 
				<input type="text" name="accountNumberK" size="25"/>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="2" height="22">
			<input type="submit" value ="이체하기" ></a>
			</td>
		</tr>
	</table>
	</form>
</center>