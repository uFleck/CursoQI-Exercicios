<%@page language="Java"%>
<%@page import="Model.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Resultado da Conta</title>
        <link rel="stylesheet" href="_css/bootstrap.min.css"/>
        <style>
            html, body{
                transform: translateY(100%);
            }
            #resultado{
                text-align: center; 
                background-color: #343a40; 
                width: 100px; 
                color: white; 
                margin: 15px auto;
                border: 1px solid #343a40;
                border-radius: 20px;
                font-size: 20pt;
            }
            
            #botao{
                text-align: center; 
                margin-top: 15px;
            }
            
            .btn{
                padding: 20px;
            }
            
            #corpo{
                height: 100%;
            }
        </style>
    </head>
    <body>
        <div id="corpo">
            <h1 style="text-align: center">Resultado</h1>
            <%
                Calculadora c1 =  new Calculadora();
                c1.setN1(request.getParameter("n1"));
                c1.setN2(request.getParameter("n2"));
                c1.setOp(request.getParameter("op"));
            %>
            <div id="resultado">
                <%
                    out.print(c1.calcular());
                %>
            </div>

            <div id="botao">
                <a href="index.html"><input type="button" class="btn btn-dark pt-3 pb-3" value="Voltar"></a>
            </div>
        </div>
    </body>
</html>
