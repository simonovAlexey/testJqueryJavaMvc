<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragments/headTag.jsp"/>
<body>


<div id="pageContainer" class="modal">

</div>

<div id="loginForm" class="modal">

    <form:form class="modal-content animate" id="detailsForm">
        <h3 align=center ><div id="msg_welcome">Welcome to test application</div></h3>
        <p><div id="langC"></div></p>

        <div class="container">

            <table style="width:100%">
                <tr>
                    <td><label for="login"><b><div id="msg_username">Username</div></b></label></td>

                    <td><input type="text" placeholder="Enter Username" name="login" id="login" required></td>
                </tr>

                <tr>
                    <td><label><b><div id="msg_password">Password</div></b></label></td>
                    <td><input id="password" type="password" placeholder="Enter Password" name="psw" required></td>
                </tr>

                <tr>
                    <td><label for="selectlang"><div id="msg_lang">Language</div></label></td>
                    <td>
                        <select id="selectlang" name="lang">
                            <option value="" data-class="blank"></option>
                            <option value="en_US" data-class="en" >English</option>
                            <option value="ru_RU" data-class="ru" >Русский</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td align="right"><input type="checkbox" name="remember" value="true" ></td>
                    <td>
                        <div id="msg_remember">
                            Remember me
                        </div>

                    </td>
                </tr>

                <tr>

                </tr>

                <tr>
                </tr>
            </table>
            <div class="showerror" id="showerror"></div>
            <button type="button" onclick="getWelcomePage()"><div id="msg_login">Login</div></button>
        </div>
    </form:form>

</div>

</body>
</html>
