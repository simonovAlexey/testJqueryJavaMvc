<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    var appLang = '${lang}'
</script>


<div class="modal-content animate" style="text-align: center;">
<br>
    <%--<h4 align=center>
        <div id="msg_u_welcome">Welcome,</div>
        <c:if test="${fName==null}">${cookie.fNameC.value} ${cookie.lNameC.value}</c:if>
        ${fName} ${lName}!
    </h4>--%>
    <table style="width: 90%; margin-left: auto; margin-right: auto; font-size: large;">
        <tbody>
        <tr>
            <td>
                <b><div id="msg_u_welcome" style="text-align: right;">Welcome,</div> </b>
            </td>
            <td><b> ${cookie.fNameC.value} ${cookie.lNameC.value}${fName} ${lName}!</b></td>
        </tr>
        </tbody>
    </table>
<br>
    <table style="width: 50%; margin-left: auto; margin-right: auto;">
        <tbody>
        <tr>
            <td style="text-align: center;">
                <div id="msg_u_your">Your language:</div>
            </td>
            <td id=flag class="" style="width: 50%; text-align: left;" rowspan="2">&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: center;">
                <div id="msg_u_lang">english</div>
            </td>
        </tr>
        </tbody>
    </table>
    <br>
    <a href="modal" onclick="clearCookies()" id="msg_u_logout">Logout</a>
    <br>
    <br>
</div>