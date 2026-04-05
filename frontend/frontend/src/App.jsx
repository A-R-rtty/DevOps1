import { useEffect, useState } from "react"

function App() {
  const [usuarios, setUsuarios] = useState([])
  const [error, setError] = useState(null)
  const [loading, setLoading] = useState(true)

  useEffect(()=>{
    fetch("http://localhost:8080/api/usuarios")
    .then(response=>{
      if(!response.ok) throw new Error("Error al obtener usuarios")
      return response.json()
    })
    .then(data=>{
      setUsuarios(data)
      setLoading(false)
    })
    .catch(err=>{
      setError(err.message)
      setLoading(false)
    })
  },[])

  return (
    <div>
      <h1>Inovatech</h1>
      {loading && <p>Cargando Usuarios...</p> }
      {error && <p>Error: {error}</p>}
      
      <ul>
        {usuarios.map(usuario=>(
          <li key={usuario.id}>
            <h3>{usuario.nombre}</h3>
          </li>
        ))}
      </ul>

    </div>
  )
}

export default App
