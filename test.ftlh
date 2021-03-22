<html>
<head>
  <title>Catalog</title>
</head>
<body>
  <h1> Catalogul ${catalog.name} </h1>
<#list items as item>
    <p>-> ${item.name}</p>
  </#list>
</body>
</html>