let text = "";
fetch('http://localhost:8080/basejava/productos')
    .then(response=>response.json())
    .then(data=>{
        console.log(data)
        for (let i in data) {
            console.log(data[i])
            inf =
            `
            <td> <div class="producto">
                            <a target="self" href="localhost:8080/producto?id=${data[i].id}">
                                <div class="contain">
                                    <img width=""
                                        src="${data[i].img}"
                                        alt="${data[i].nombre}">
                                </div>
                                <div class="nombre">${data[i].nombre}</div>
                                <div class="precio">$${data[i].precio}</div>
                            </a>
                        </div>
            `
            text += inf
                ;
        }
        document.getElementById("productos").innerHTML = text
    })

/* */