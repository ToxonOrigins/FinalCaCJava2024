var id = location.search.substr(1)
fetch('http://localhost:8080/basejava/productos/'+id)
    .then(response=>response.json())
    .then(data=>{
        console.log(data)
        console.log(data.data[0].name)
        document.querySelector("title").innerHTML=`${data.data[0].name}-Hardventas`
        document.getElementById("dinero").innerHTML=`$${data.data[0].price}`
        document.getElementById("descripcion").innerHTML=`${data.data[0].description}`
    })

