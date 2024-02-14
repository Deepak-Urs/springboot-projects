import './App.css'
import HeaderComponent from './Components/HeaderComponent'
import ListEmployeeComponents from './Components/ListEmployeeComponents'
import FooterComponent from './Components/FooterComponent'
import { BrowserRouter, Route, Routes } from 'react-router-dom'

function App() {

  return (
    <>
    <BrowserRouter>
      <HeaderComponent />
      <Routes>
        <Route path='/' element={<ListEmployeeComponents />}></Route>
        <Route path='/employees' element={<ListEmployeeComponents />}></Route>
      </Routes>
      
      <FooterComponent />
    </BrowserRouter>
    </>
  )
}

export default App
