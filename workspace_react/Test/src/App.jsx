import { useState } from 'react'
import './App.css'
import OrderInfo from './components/OrderInfo'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <OrderInfo/>
    </>
  )
}

export default App
