<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="provider" action="" method="POST">
    Provider name:<@spring.formInput "providerForm.name" "" "text"/>
    <br>
    Provider paper:<@spring.formInput "providerForm.paper", "", "text"/>
    <br>
    Provider film:<@spring.formInput "providerForm.film", "", "text"/>
    <br>
    Provider paint:<@spring.formInput "providerForm.paint", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>