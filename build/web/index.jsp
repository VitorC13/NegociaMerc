<%-- 
    Document   : index
    Created on : May 23, 2016, 4:05:39 PM
    Author     : Kanec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
            function ResetFormValues() {

                document.getElementById("tipo").value = "";
                document.getElementById("nome").value = "";
                document.getElementById("qntd").value = "";
                document.getElementById("prec").value = "";
            }

            function ValidateContactForm()
            {
                var tipo = document.getElementById("tipo");
                var nome = document.getElementById("nome");
                var qntd = document.getElementById("qntd");
                var prec = document.getElementById("prec");

                if (tipo.value == "")
                {
                    window.alert("Defina o tipo da sua mercadoria!");
                    name.focus();
                    return false;
                }

                if (nome.value == "")
                {
                    window.alert("Defina o nome da sua mercadoria!");
                    email.focus();
                    return false;
                }
                if (qntd.value < 0 || qntd.value == 0)
                {
                    window.alert("Defina a quantidade da sua mercadoria!");
                    email.focus();
                    return false;
                }
                if (prec.value < 0 || prec.valu == 0)
                {
                    window.alert("Defina o preço da sua mercadoria!");
                    email.focus();
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>

        <div class="container">
            <div class="page-header">
                <h2>Adicione sua Mercadoria</h2>
                <p>Escolha uma mercadoria para cadastrar no banco de dados, para vender ou comprar!</p>            
                <table class="table-striped">
                    <thead>
                        <tr>

                            <th>Tipo da Mercadoria</th>
                            <th>Nome da Mercadoria</th>
                            <th>Quantidade</th>
                            <th>Preço</th>
                            <th>Tipo do Negócio</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="danger">
                    <form  action="cadastrarproduto" method="GET" 
                           onsubmit="return ValidateContactForm();">

                        <td> <input type="text" class="form-control" id="tipo" name="tipo"></td>
                        <td><input type="text" class="form-control" id="nome" name="nome"></td>
                        <td><input type="number" class="form-control" id="qntd" name="qntd"></td>
                        <td><input type="number" class="form-control" id="prec" name="prec"></td>

                        <td><div class="radio">

                                <label><input type="radio" value="">Vender</label>
                                <label><input type="radio" value="">Comprar</label>
                            </div></td>
                        </tr>
                        </tbody>
                </table>
                <br>
                <input type="submit" class="btn btn-primary active btn-md" 
                       id="btn" value="Cadastrar" onsubmit="return ValidateContactForm();" />
                <input type="submit" class="btn btn-primary active btn-md" 
                       id="limparCampos" onclick="ResetFormValues()" value="Limpar" />
                </br>
                </form>
            </div>
            <input type="submit" class="btn btn-primary active btn-md" id="btn" value="Visualizar" />
        </div>
    </body>
</html>
