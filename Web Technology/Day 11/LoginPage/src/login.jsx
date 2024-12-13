export default function Login() {
  return (
    <div className="container mt-4">
      <h2 className="mb-3">Login</h2>
      <form>
        <div className="mb-3">
          <label htmlFor="UserID" className="form-label">Enter UserID:</label>
          <input type="text" id="UserID" className="form-control" />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label">Password:</label>
          <input type="password" id="password" className="form-control" />
        </div>
        <button type="submit" className="btn btn-primary">Login</button>
      </form>
    </div>
  );
}
