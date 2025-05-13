import './App.css';
import Home from "./Pages/Home";
import {Routes, Route} from "react-router-dom";
import About from "./Pages/About";
import Blog from "./Pages/Blog";
import Contact from "./Pages/Contact";


function App() {
  return (
      <>
          <div>
              <Routes>
                  <Route path='/' element={<Home/>}/>
                  <Route path='/about' element={<About/>}/>
                  <Route path='/blog' element={<Blog/>}/>
                  <Route path='/contact' element={<Contact/>}/>
              </Routes>
          </div>
      </>
  );
}

export default App;
