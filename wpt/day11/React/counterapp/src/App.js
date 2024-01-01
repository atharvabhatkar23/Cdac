import './App.css';
import flower from './flower.jpg'
import "./bootstrap/dist/css/bootstrap.min.css";
import Header from './components/Header';
import Footer from './components/Footer';
import NameTab from './components/NameTab';
// import CounterClassComponent from './components/CounterClassComponent';
// import CounterfucntionalComponent from './components/CounterfunctionalComponent';
// import DisplayNames from "./components/DisplayNames"
function App() {
  let namearr=["Revati","Atharva","Sohuum","Rajashree"]
  return (
    <div>
      <h1>Hello World!</h1>
     <Header></Header>

     <div className="container">
          <div className="row">
            <div className="col-sm-12 col-md-3"><img alt=" " src={flower} width="200px" heigt="200px"></img></div>
            <div className="col-sm-12 col-md-3"> <NameTab nmarr={namearr}></NameTab> </div>
            <div className="col-sm-12 col-md-3"> <NameTab nmarr={namearr}></NameTab> </div>
            <div className="col-sm-12 col-md-3"><Footer></Footer></div>
          </div>


     </div>
    
    
     
      
    </div>
  );
}

export default App;
