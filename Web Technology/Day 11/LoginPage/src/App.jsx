import './App.css';
import Login from './login';
import NewUser from './newUser';

function App() {
  return (
    <div className="container mt-5">
      <div className="row">
        <div className="col-md-6">
          <Login />
        </div>
        <div className="col-md-6">
          <NewUser />
        </div>
      </div>
    </div>
  );
}

export default App;
