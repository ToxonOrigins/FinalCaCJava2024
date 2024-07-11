cabezal=`
<header class="bg-success arriba">
<div class="container text-center">
    <div class="row">
        <nav class="navbar navbar-expand-lg bg-success">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item ">
                            <a class="nav-link text-white fs-5 text-center" href="index.html">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white fs-5 text-center" href="buscador.html">Productos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white fs-5 text-center" href="login.html">Iniciar Sesion</a>
                        </li>
                        <li>
                            <a class="nav-link text-white fs-5 text-center" href="carrito.html" id="carrito"></a>
                        </li>                        
                        <li class="nav-item">
                            <a class="nav-link text-white fs-5 text-center" href="ayuda.html">Ayuda</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
                        <button class="btn btn-outline-success bg-secondary text-white" type="submit" onclick="buscar()">Buscar</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
</div>
</header>
    `
document.querySelector("cabeza").innerHTML=cabezal

pie=`
© Hardventas Todos los derechos reservados 2024. Redes sociales: 
<a href="#" ><img src="./img/facebook.png" alt="facebook" width="30px"></a> 
<a href="#"><img src="./img/twitter.png" alt="twitter" width="30px"></a>
<a href="#"><img src="./img/instagram.png" alt="instagram" width="30px"></a>
`
document.querySelector("footer").innerHTML=pie
if (sessionStorage.login=="true"){
    document.getElementById("carrito").innerHTML="Carrito"
} 