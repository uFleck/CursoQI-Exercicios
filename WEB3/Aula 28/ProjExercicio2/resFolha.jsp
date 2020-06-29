<%@page language="Java"%>
<%@page import="Model.Funcionario"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="_css/bootstrap.min.css">
        <style>
            .mainDiv{
                margin: 0 auto;
            }
            
            .subDiv{
                display: block;
                position: relative;
                background-color: #666666;
                margin: 30px 30px 30px 30px;
                padding: 40px;
                border: 1px solid black;
                border-radius: 20px;
                text-align: center;
                font-size: 15pt;
                width: 500px
            }
            
            h1{
                font-size: 20pt;
                color: white
            }
        </style>
        <title>Resultado da folha de pagamento</title>
    </head>
    <body>
        <section class="container">
            <%
                DecimalFormat df = new DecimalFormat("##,##0.00");
                Funcionario f1 = new Funcionario();
                f1.setNome(request.getParameter("nome"));
                f1.setCpf(request.getParameter("cpf"));
                f1.setCargo(request.getParameter("cargo"));
                f1.setValorHora(request.getParameter("valorHora"));
                f1.setQuantHoras(request.getParameter("quantHoras"));
                f1.setHorasExtras50(request.getParameter("horasExtras50"));
                f1.setHorasExtras100(request.getParameter("horasExtras100"));
                f1.setDependentes(request.getParameter("dependentes"));
                f1.setTipoInsalubre(request.getParameter("tipoInsalubre"));
                f1.setValorTransporteMensal(request.getParameter("valorTransporteMensal"));
                f1.setValorVale(request.getParameter("valorVale"));
            %>
            <div class="mainDiv row">
                <div class="subDiv col">
                    <h1>Salário bruto</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularBruto()));
                    %>
                </div>
                <div class="subDiv col">
                    <h1>Salário família</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularSalarioFamilia()));
                    %>
                </div>
            </div>
                
            <div class="mainDiv row">
                <div class="subDiv col">
                    <h1>Insalubridade</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularInsalubridade()));
                    %>
                </div>
                <div class="subDiv col">
                    <h1>INSS</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularINSS()));
                    %>
                </div>
            </div>
            <div class="mainDiv row">
                <div class="subDiv col">
                    <h1>Vale transporte</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularValeTransporte()));
                    %>
                </div>
                <div class="subDiv col">
                    <h1>Vale refeição</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularValeRefeicao()));
                    %>
                </div>
            </div>
            <div class="mainDiv row">    
                <div class="subDiv col">
                    <h1>Total ganho por horas Extras</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularTotalExtra()));
                    %>
                </div>
                <div class="subDiv col">
                    <h1>Salário Líquido</h1>
                    <%
                        out.print("R$" + df.format(f1.calcularLiquido()));
                    %>
                </div>
            </div>
        </section>
    </body>
</html>
