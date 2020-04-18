<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="photocenter" action="" method="POST">
    Order paper:<@spring.formInput "orderForm.paper" "" "text"/>
    <br>
    Order film:<@spring.formInput "orderForm.film", "", "text"/>
    <br>
    Order chemical:<@spring.formInput "orderForm.chemical", "", "text"/>
    <br>
    Order dissemination:<@spring.formInput "orderForm.dissemination", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>