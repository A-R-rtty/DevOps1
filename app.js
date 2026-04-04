function getData() {
    fetch("http://localhost:8080/api") 
        .then(res => res.text())
        .then(data => {
            document.getElementById("resultado").innerText = data;
        })
        .catch(err => console.log(err));
}