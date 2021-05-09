<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
    <head>
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body>
        <table style="border: 1px solid black; text-align: center">
            <tr>
                <td style="height:30px;" colspan="2">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td style="height: 250px">
                    <tiles:insertAttribute name="menu" />
                </td>
                <td style="width: 350px">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td style="height: 30px" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
            
        </table>
    </body>
</html>
