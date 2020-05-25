<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student registration form</title>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
            First name : <form:input path="firstName"/>
            <br><br>
            Last name : <form:input path="lastName"/>
            <br><br>
            Country : <form:select path="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>
            <br><br>
            Favorite programming languages:
            <form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
            <br><br>
            Operating Systems :
            <form:checkboxes path="operatingSystems" items="${student.systemsOptions}"/>
            <br><br>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>