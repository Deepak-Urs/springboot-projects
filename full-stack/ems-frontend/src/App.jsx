import './App.css'
import HeaderComponent from './components/HeaderComponent'
import ListEmployeeComponents from './components/ListEmployeeComponents'
import FooterComponent from './components/FooterComponent'
import EmployeeComponent from './components/EmployeeComponent'
import { BrowserRouter, Route, Routes } from 'react-router-dom'

function App() {

  return (
    <>
    <BrowserRouter>
      <HeaderComponent />
      <Routes>
        <Route path='/' element={<ListEmployeeComponents />} />
        <Route path='/employees' element={<ListEmployeeComponents />} />
        <Route path='/add-employee' element={<EmployeeComponent />} />
        <Route path='/edit-employee/:id' element={<EmployeeComponent />} />
      </Routes>
      
      <FooterComponent />
    </BrowserRouter>
    </>
  )
}

export default App
