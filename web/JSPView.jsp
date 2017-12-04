<%--
  Created by IntelliJ IDEA.
  User: Egor
  Date: 28.11.2017
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Main page</title>
  </head>
  <body>
    <form method="get" action="ServletController">
      <table>
        <tr>
          <td align="right" colspan="2"><input type="submit" name="Calculate" value="Calculate power consumption"></td>
        </tr>
        <tr>
          <td align="right" colspan="2"><input type="submit" name="Sort" value="Sort appliances by power"></td>
        </tr>
        <tr>
          <td align="right" colspan="2"><input type="submit" name="Find" value="Find appliance by parameters"></td>
        </tr>
      </table>
    </form>
  </body>
</html>