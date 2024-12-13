export default function NewUser() {
  return (
    <div className="container mt-4">
      <h2 className="mb-3">New User</h2>
      <form>
        <div className="mb-3">
          <label htmlFor="UserID" className="form-label">Enter UserID:</label>
          <input type="text" id="UserID" className="form-control" />
        </div>
        <div className="mb-3">
          <label htmlFor="fname" className="form-label">Enter First Name:</label>
          <input type="text" id="fname" className="form-control" />
        </div>
        <div className="mb-3">
          <label htmlFor="lname" className="form-label">Enter Last Name:</label>
          <input type="text" id="lname" className="form-control" />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label">Enter Password:</label>
          <input type="password" id="password" className="form-control" />
        </div>
        <div className="mb-3">
          <label htmlFor="cpassword" className="form-label">Confirm Password:</label>
          <input type="password" id="cpassword" className="form-control" />
        </div>
        <button type="submit" className="btn btn-primary">Save User</button>
      </form>
    </div>
  );
}
